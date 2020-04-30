echo "Welcome to factorial"
echo -e "Enter a number "
read no
fac=1
for ((c=1;c<=no;c++))
do
	fac=$((fac * c ))
done

echo - "Factorial is $fac"
