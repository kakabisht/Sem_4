echo -e " \n welcome to Rerverse a number code "
read no

while [ $no -gt 0 ]
do 
	ln=$(( $no %10))
	echo -n "$ln"
	#-n is used to stop avoiding a new line 
	no=$(( $no /10 ))
done 

echo ""
