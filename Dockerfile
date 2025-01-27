FROM ubi8/maven:3.8

# Install Source-to-Image (S2I) tools
RUN curl -sSL https://github.com/openshift/source-to-image/releases/download/v1.4.10/s2i-v1.4.10-linux-amd64.tar.gz | tar -xz -C /usr/local/bin

# Copy the missing /usr/libexec/s2i/assemble script from a working S2I image
COPY --from=openshift/base-centos7 /usr/libexec/s2i/assemble /usr/libexec/s2i/assemble

# Make sure the script is executable
RUN chmod +x /usr/libexec/s2i/assemble