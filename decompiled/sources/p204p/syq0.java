package p204p;

import io.ably.lib.types.PresenceMessage;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class syq0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f215323a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f215324b;

    static {
        int[] iArr = new int[znc.values().length];
        f215324b = iArr;
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f215324b[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f215324b[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[PresenceMessage.Action.values().length];
        f215323a = iArr2;
        try {
            iArr2[PresenceMessage.Action.enter.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f215323a[PresenceMessage.Action.update.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f215323a[PresenceMessage.Action.present.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f215323a[PresenceMessage.Action.leave.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f215323a[PresenceMessage.Action.absent.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
