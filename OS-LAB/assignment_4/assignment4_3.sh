echo -e "\n Welcome to Leap Year problem \n Enter a year "
read year

y4=$(( $year % 4 ))
y100=$(( $year %100 ))

if [ $y4 -eq 0 -o $y100 -eq 0 ]
then 
	echo -e " \n Leap Year "
else 
	echo -e " \n Not a leap year "
fi	
