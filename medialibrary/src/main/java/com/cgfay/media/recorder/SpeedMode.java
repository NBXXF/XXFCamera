package com.cgfay.media.recorder;

/**
 * 速度模式
 *
 * @author CainHuang
 * @date 2019/6/30
 */
public enum SpeedMode {
    MODE_EXTRA_SLOW(1, 1 / 3f),  // 极慢
    MODE_SLOW(2, 0.5f),         // 慢
    MODE_NORMAL(3, 1.0f),       // 标准
    MODE_FAST(4, 1.6f),         // 快
    MODE_EXTRA_FAST(5, 2.0f);   // 极快

    private int type;
    private float speed;

    SpeedMode(int type, float speed) {
        this.type = type;
        this.speed = speed;
    }

    public int getType() {
        return type;
    }

    public float getSpeed() {
        return speed;
    }

    public static SpeedMode valueOf(int type) {
        if (type == MODE_EXTRA_SLOW.type) {
            return MODE_EXTRA_SLOW;
        } else if (type == MODE_SLOW.type) {
            return MODE_SLOW;
        } else if (type == MODE_NORMAL.type) {
            return MODE_NORMAL;
        } else if (type == MODE_FAST.type) {
            return MODE_FAST;
        } else if (type == MODE_EXTRA_FAST.type) {
            return MODE_EXTRA_FAST;
        } else {
            return MODE_NORMAL;
        }
    }

    public static SpeedMode valueOf(float speed) {
        if (speed == MODE_EXTRA_SLOW.speed) {
            return MODE_EXTRA_SLOW;
        } else if (speed == MODE_SLOW.speed) {
            return MODE_SLOW;
        } else if (speed == MODE_NORMAL.speed) {
            return MODE_NORMAL;
        } else if (speed == MODE_FAST.speed) {
            return MODE_FAST;
        } else if (speed == MODE_EXTRA_FAST.speed) {
            return MODE_EXTRA_FAST;
        } else {
            return MODE_NORMAL;
        }
    }
}
