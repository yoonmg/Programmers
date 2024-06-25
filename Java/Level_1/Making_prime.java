class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int a = nums[i] + nums[j] + nums[k];    //배열 내에 있는 수를 세개씩 더한 값
                    boolean prime = true;
                    for(int z=2;z*z<=a;z++)
                    {
                        if(a % z == 0)
                        {
                            prime = false;    //만들어진 수가 소수인지 판별 후 소수가 아니면 false로 만든 후 answer증가 시키지 않음
                            break;
                        }
                    }
                    if(prime)
                    {
                        answer++;    //만들어진 소수의 개수를 counting 
                    }
                }
            }
        }
        return answer;
    }
}
