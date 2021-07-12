#!/bin/bash

javac -cp "jars/*" $1 $2 $3 $4 && java -cp "jars/*:"$5":." "$6" "$7"