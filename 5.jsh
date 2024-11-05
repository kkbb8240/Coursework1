int[] average_grades(int grades[][], int weights[]) {
    int numberOfStudents = grades.length;
    int[] weightedAverages = new int[numberOfStudents];

    for (int i = 0; i < numberOfStudents; i++) {
        int sum = 0;
        for (int j = 0; j < weights.length; j++) {
            sum += grades[i][j] * weights[j];
        }
        weightedAverages[i] = sum / 100; 
    }

    return weightedAverages;
}

int[][] grades = {{51, 83, 28}, {0, 38, 95}};
int[] weights = {30, 40, 30};
int[] result = average_grades(grades, weights);
System.out.println(java.util.Arrays.toString(result));