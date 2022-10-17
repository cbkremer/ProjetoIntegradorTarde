import shutil
import os
src_file = open("target.txt","r");
destiny_file = open("destiny.txt","r");
extension_file = open("extension.txt","r");

src_path = src_file.read();
dest_path = destiny_file.read();
extension = extension_file.read();

for filename in os.listdir(src_path):
    if filename.endswith(""+extension):
        shutil.move(src_path+"/"+filename, dest_path)