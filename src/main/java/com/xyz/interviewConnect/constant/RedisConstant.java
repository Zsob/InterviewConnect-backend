package com.xyz.interviewConnect.constant;

public interface RedisConstant {
    /**
     * 用户签到记录的 Redis Key 前缀
     */
    String USER_SIGN_IN_REDIS_KEY_PREFIX="user:signs";

    /**
     * 获取用户签到记录的 Redis Key
     * @param year 年份
     * @param userId 用户id
     * @return 拼接好的  Redis Key
     */
    static String getUserSignInRedisKey(int year,Long userId){
        return String.format("%s:%s:%s",USER_SIGN_IN_REDIS_KEY_PREFIX,year,userId);
    }
}
