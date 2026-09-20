package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.UserLoginState;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class fff0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f69000a;

    static {
        int[] iArr = new int[UserLoginState.values().length];
        try {
            iArr[UserLoginState.LOGGING_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserLoginState.LOGGED_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f69000a = iArr;
    }
}
