echo -e "Welcome to Multiplication "
echo -e "\n Enter Number "
read n
echo -e "\n Enter number of terms you want "
read terms
counter=1

while [ $counter -le $terms ]
do
	no=$(( $n * $counter ))
	echo -e "\n $n times $counter = $no "
	counter=$(($counter + 1 ))
done	
