package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.impl.models.PluginIntegrationStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class uza {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f235452a;

    static {
        int[] iArr = new int[PluginIntegrationStatus.values().length];
        try {
            iArr[PluginIntegrationStatus.DETACHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PluginIntegrationStatus.ATTACHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f235452a = iArr;
    }
}
