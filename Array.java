//найти наибольшее число в массиве, вернуть -999, если массив нулевой длины"
class Array{
	public static void main(String[]args){
		int []myArr = {5,8,1,2};
		//int [] mySecondArr = new int[0];
		
		System.out.println(returnMaxValue(myArr));
	}
	
	public static int returnMaxValue(int[] inArr){
		//кладем в переменную -999
		int outResult = -999;
		//если массив не пустой
		if(inArr.length != 0){
			//ищем наибольшее
			int maxValueOfArr = inArr[0];
			for(int i = 0;i<inArr.length;i++){
				if(maxValueOfArr<inArr[i]){
					//кладем в переменную наибольшее
					outResult = inArr[i];
				}	
			}	
		}
		//возвращаем эту переменную
		return outResult;
	}

}