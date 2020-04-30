echo "Welcome sum and average "
sum=0

for (( c=1; c<=10; c++))
do
	echo -e "Enter a number"
	read no
	echo -e "\t"
	sum=$(( $sum + $no ))
done
avg=$(( $sum/10 ))

echo -e "Sum =$sum \n Avg =$avg"
