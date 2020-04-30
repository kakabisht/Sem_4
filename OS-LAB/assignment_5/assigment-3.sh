echo -e "Enter filename"
read filename
touch $filename
echo -e "Enter contents:"
cat>$filename
read $filename
echo -e"\n"
echo -e "File created successfully"
echo -e "Contents of the file"
cat $filename
echo -e "No. of words in the file"
wc $filename
echo -e "Contents of the file in sorted manner:"
sort $filename
echo -e "Contents in upper case"
tr "[a-z]" "[A-Z]"< $filename
echo -e "No. of words to be seen"
read n
echo -e "Contents:"
head -$n $filename
echo -e "Enter keyword to be seached"
read key
echo -e "Found at"
grep -n $key $filename
echo -e "Enter filename to  create a new file:"
read filename1
mv $filename $filename1
echo -e "New file\n"
cat $filename1
echo -e "To cut a file\n Enter a st\n"
read st
echo -e "Enter the end point \n"
read end
cut -$st - $end $filename1
echo -e "Enter the name of the file to be deleted:\n "
read file
rm $file
echo -e "File deleted successfully\n"
