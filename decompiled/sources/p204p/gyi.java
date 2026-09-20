package p204p;

import io.ably.lib.types.ProtocolMessage;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class gyi {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f85634a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f85635b;

    static {
        int[] iArr = new int[ProtocolMessage.Action.values().length];
        f85635b = iArr;
        try {
            iArr[ProtocolMessage.Action.heartbeat.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f85635b[ProtocolMessage.Action.error.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f85635b[ProtocolMessage.Action.connected.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f85635b[ProtocolMessage.Action.disconnect.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f85635b[ProtocolMessage.Action.disconnected.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f85635b[ProtocolMessage.Action.closed.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f85635b[ProtocolMessage.Action.ack.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f85635b[ProtocolMessage.Action.nack.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f85635b[ProtocolMessage.Action.auth.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr2 = new int[wzi.values().length];
        f85634a = iArr2;
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f85634a[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f85634a[3] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
