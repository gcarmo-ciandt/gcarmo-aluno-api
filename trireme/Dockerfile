FROM python:3
ADD . /
RUN pip install cqlsh
RUN pip install trireme
ENTRYPOINT inv trireme.cassandra.migrate

