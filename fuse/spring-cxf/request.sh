#!/bin/bash

curl -s -H "Content-Type: text/xml" -d "`cat request.xml`" http://localhost:9090/hello
