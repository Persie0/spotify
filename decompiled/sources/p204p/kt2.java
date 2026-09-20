package p204p;

import com.spotify.playlist.p126ai.creation.p127v2.Sender;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class kt2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f126116a;

    static {
        int[] iArr = new int[Sender.values().length];
        try {
            iArr[Sender.SENDER_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Sender.SENDER_AI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Sender.SENDER_SPOTIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Sender.SENDER_UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Sender.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f126116a = iArr;
    }
}
