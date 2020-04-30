echo "Enter day name in camel case "
read day

case $day in
  "Monday"|"Tuesday"|"Wednesday"|"Thursday")
    	echo -e " \t Weekday"
    	;;

  "Friday"|"Saturday"|"Sunday")
	echo -e " \t Weekend"
    	;;

    *)
   	echo -e "\n Choose correct Option"
        ;;

esac
case $day in

        "Monday")
                echo -e "\t 4 days left for Weekend"
       		;;
     	"Tuesday")
                echo -e "\t 3 days left for Weekend"
		;;
	"Wednesday")
		echo -e "\t 2 days left for Weekend"
		;;
	"Thursday")
		echo -e "\t 1 days left for Weekend"
		;;
	"Friday"|"Saturday"|"Sunday")
		echo -e "\t 0 days left for Weekend"
		;;
	*)
                echo -e "\n Choose correct Option"
                ;;

esac
echo -e "\n End of script."
