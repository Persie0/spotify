package com.comscore.streaming;

/* JADX INFO: loaded from: classes3.dex */
public interface ContentType {
    public static final int OTHER = 100;
    public static final int LONG_FORM_ON_DEMAND = 112;
    public static final int SHORT_FORM_ON_DEMAND = 111;
    public static final int LIVE = 113;
    public static final int USER_GENERATED_LONG_FORM_ON_DEMAND = 122;
    public static final int USER_GENERATED_SHORT_FORM_ON_DEMAND = 121;
    public static final int USER_GENERATED_LIVE = 123;
    public static final int BUMPER = 199;
    public static final int[] ALLOWED_VALUES = {LONG_FORM_ON_DEMAND, SHORT_FORM_ON_DEMAND, LIVE, USER_GENERATED_LONG_FORM_ON_DEMAND, USER_GENERATED_SHORT_FORM_ON_DEMAND, USER_GENERATED_LIVE, BUMPER, 100};
}
