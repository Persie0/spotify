package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContentSize;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class pip {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f177998a;

    static {
        int[] iArr = new int[AccessoryContentSize.values().length];
        try {
            iArr[AccessoryContentSize.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccessoryContentSize.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccessoryContentSize.SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AccessoryContentSize.XSMALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AccessoryContentSize.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f177998a = iArr;
    }
}
