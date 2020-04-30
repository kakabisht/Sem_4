# Take user Input
echo "Enter Base Salary : "
read sal

da=$(( $sal *40/100 ))

hra=$(( $sal *20/100 ))

finalsal=$((sal+da+hra))

echo "finalSalary : $finalsal"

~            
