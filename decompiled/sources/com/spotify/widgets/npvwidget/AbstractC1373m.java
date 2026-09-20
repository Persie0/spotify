package com.spotify.widgets.npvwidget;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.m */
/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC1373m {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f7049a;

    static {
        int[] iArr = new int[WidgetInteraction.BackgroundSessionState.values().length];
        try {
            iArr[WidgetInteraction.BackgroundSessionState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetInteraction.BackgroundSessionState.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WidgetInteraction.BackgroundSessionState.UNAUTHENTICATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7049a = iArr;
    }
}
