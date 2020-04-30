echo -e "\n Welcome to greatest of 3 number "
echo -e "\n enter 1st number"
read a
echo -e "\n enter 2nd  number"
read b
echo -e "\n enter 3rd  number"
read c

if [ $a -gt $b -a $a -gt $c ]
then 
	echo -e "\n $a is the greatest "

elif [ $b -gt $a -a $b -gt $c ]
then 
	echo -e "\n $b is the greatest"

elif [ $c -gt $a -a $c -gt $b ]
then
	echo -e "\n $c is the greatest"
fi
