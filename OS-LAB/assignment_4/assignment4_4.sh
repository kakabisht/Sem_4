echo -e " \n welcome to Bank SIT "

#Taken predefined value of acct_bal

acct_bal=10000

echo -e " \n Enter ammount to withdraw "
read amt

if [ $amt -lt 1500 ]
then 
	tax=$(( $amt * 3/100 ))
elif [ $amt -gt 3000 ]
then
	tax=$(( $amt * 5/100 ))
else 
	tax=$(( $amt * 4/100 ))
fi

if [ $acct_bal -lt $amt ]
then 
	echo -e "\n Insufficient funds "
else
 	echo -e "\n ammount before tax = $amt "
	amt=$(( $amt + $tax ))
	echo -e "\n ammount after tax = $amt "
	if [ $acct_bal -gt $amt ]
	then
		acct_bal=$(( $acct_bal - $amt ))
		echo -e "\n ammount after withdrawl = $acct_bal "
	else 
		echo -e " \n Can't withdraw due to tax "
	fi
fi



