echo "Welcome to Prime or Not "
echo -e "\n Enter a number "
read no

di=$(($no /2))

c0=0
counter=1

while [ $counter -le $di ]
do
	ro=$(($no % $counter))
	if [ $ro -eq 0 ]
	then 
		c0=$(( $c0 +1 ))
	fi
	counter=$(( $counter + 1 ))
done

if [ $c0 -eq 1 ]
then 
	echo -e "\n Prime "
elif [ $c0 -gt 1 ]
then 
	echo -e "\n Not Prime "
fi

