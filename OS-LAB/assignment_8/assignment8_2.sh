echo " Enter 1 st Number "
read num1
echo -e "\n Enter 2 nd Number"
read num2
echo -e "\n Your options are \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division "
read choice

case $choice in
	1)
		final=$(($num1 + $num2))
		echo " Addition of $num1 + $num2 is =$final "
		;;
	2)
		final=$(($num1 - $num2))
                echo " Subtraction of $num1 - $num2 is =$final"
                ;;

	3)
		final=$(($num1 * $num2))
                echo " Multiplication of $num1 * $num2 is =$final"
                ;;
 	4)
		final=$(($num1 / $num2))
                echo " Division of $num1 / $num2 is =$final)"
                ;;
	*)
                echo -e "\n Choose correct Option"
                ;;

esac
echo -e "\n End of script"
