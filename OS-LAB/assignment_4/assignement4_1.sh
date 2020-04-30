echo -e "\nWelcome to even and odd "
echo -e "\n enter a Number "
read no

mod=$(( $no % 2 ))

if [ $mod -eq 0 ]
then
	echo -e "\n Even"
else 
	echo -e "\n Odd"
fi
