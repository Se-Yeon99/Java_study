class Div {
    public int Div(int num1, int num2) {
        int answer= 0;
        
        double result = ((double)num1 / num2) * 1000;
        answer = (int)result;
        
        return answer;
    }
}
