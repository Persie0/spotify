package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class due0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f53049a;

    static {
        int[] iArr = new int[TriggerType.values().length];
        try {
            iArr[TriggerType.URI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TriggerType.CLIENT_EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f53049a = iArr;
    }
}
