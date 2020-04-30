echo "Transalation "

echo -e "\n Your options are \n1.Spanish \n2.German \n3.French \n4.Mandarin \n5.Japanese "
read choice

case $choice in
	1)
		echo -e "\n Hola ,me llamo Hridyesh"
		;;
	2)
		echo -e "\n Hallo ,ich bin Hridyesh"
		;;
	3)
		echo -e "\n Bonjour ,je suis Hridyesh"
		;;
	4)
		echo -e "\n Ni hao ,wo shi Hridyesh"
		;;
	5)
		echo -e "\n Kon'nichiwa ,watashi was Hridyeshdesu"
		;;

	*)
		echo -e "\n Choose correct Option"
		;;
esac

echo -e "\n End of script"
