package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.InteractionType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class rs30 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f202170a;

    static {
        int[] iArr = new int[InteractionType.values().length];
        try {
            iArr[InteractionType.DISMISS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InteractionType.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f202170a = iArr;
    }
}
