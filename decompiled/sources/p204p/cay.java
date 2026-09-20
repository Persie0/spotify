package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class cay {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f35946a;

    static {
        int[] iArr = new int[Rule.values().length];
        try {
            iArr[Rule.DISALLOW_IF_AD_PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Rule.DISALLOW_IF_CAR_CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Rule.DISALLOW_IF_APPLICATION_BACKGROUNDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Rule.DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Rule.DISALLOW_IF_CONTEXT_SWITCHED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Rule.DISALLOW_IF_CONNECTIVITY_OFFLINE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Rule.DISALLOW_IF_NOW_PLAYING_VIEW_DISPLAYING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Rule.ALLOW_ONLY_CUSTOM_CLIENT_TRIGGERS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f35946a = iArr;
    }
}
