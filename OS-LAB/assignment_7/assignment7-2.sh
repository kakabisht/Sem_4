echo "Welcome to lcm and and gcd"
echo "Enter the first number :"
read a
echo "Enter the second number : "
read b

if [ $a -gt $b ]
then
	num=$a
	den=$b
else
	num=$b
	den=$a
fi
r=`expr $num % $den`
totloop=$(( $a + $b ))
for (( i=0; i< $totloop ; i--))

do
	if [ $r -ne 0 ]
	then
		num=$den
		den=$r
		r=`expr $num % $den`
	else
		break
	fi

done

gcd=$den
lcm=`expr $a \* $b / $gcd`

echo " The LCM of $a and $b is : $lcm"
echo " The GCD of $a and $b is : $gcd"
