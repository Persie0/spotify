package com.comscore.streaming;

/* JADX INFO: loaded from: classes3.dex */
public interface ContentDeliverySubscriptionType {
    public static final int TRADITIONAL_MVPD = 601;
    public static final int VIRTUAL_MVPD = 602;
    public static final int SUBSCRIPTION = 603;
    public static final int ADVERTISING = 604;
    public static final int TRANSACTIONAL = 605;
    public static final int PREMIUM = 606;
    public static final int[] ALLOWED_VALUES = {TRADITIONAL_MVPD, VIRTUAL_MVPD, SUBSCRIPTION, ADVERTISING, TRANSACTIONAL, PREMIUM};
}
