echo "Welcome palindrome"
echo -n "Enter number : "
read n
 
# store single digit
sd=0
 
# store number in reverse order
rev=""

q=0

# store original number
on=$n

for (( i=$n; $n > 0 ;  )) 
do
    sd=$(( $n % 10 )) # get Remainder 
    n=$(( $n / 10 ))  # get next digit
    # store previous number and current digit in reverse 
    rev=$( echo ${rev}${sd} ) 
done
 
if [ $on -eq $rev ];
then
  echo "Number is palindrome"
else
  echo "Number is NOT palindrome"
fi
