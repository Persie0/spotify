package p204p;

import io.ably.lib.types.ProtocolMessage;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class vmc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f242755a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f242756b;

    static {
        int[] iArr = new int[ProtocolMessage.Action.values().length];
        f242756b = iArr;
        try {
            iArr[ProtocolMessage.Action.attached.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f242756b[ProtocolMessage.Action.detach.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f242756b[ProtocolMessage.Action.detached.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f242756b[ProtocolMessage.Action.message.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f242756b[ProtocolMessage.Action.sync.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f242756b[ProtocolMessage.Action.presence.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f242756b[ProtocolMessage.Action.error.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[znc.values().length];
        f242755a = iArr2;
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f242755a[3] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f242755a[2] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f242755a[0] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f242755a[4] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f242755a[5] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f242755a[6] = 7;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
