echo -e "Welcome to Fibo Series \nEnter the number of terms "
read n
counter=1
t1=0
t2=1

while [ $counter -le $n ]
do 
	if [ $counter -eq 1 ]
	then 
		echo -n "$t1"
	elif [ $counter -eq 2 ]
	then 
		echo -n "$t2"
	elif [ $counter -gt 2 ] 
	then

		t3=$(( $t1 + $t2)) 
		echo -n "$t3"
		t1=$t2	
		t2=$t3
	fi
	counter=$(($counter + 1))
	
done
echo ""
