package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class p1s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f173159a;

    static {
        int[] iArr = new int[EventType.values().length];
        try {
            iArr[EventType.VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventType.EVENT_TYPE_UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventType.DISMISS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EventType.CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f173159a = iArr;
    }
}
