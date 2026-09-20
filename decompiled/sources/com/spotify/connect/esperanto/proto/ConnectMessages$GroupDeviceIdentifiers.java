package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectMessages$GroupDeviceIdentifiers extends AbstractC0269h implements sre0 {
    public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int DEDUPLICATION_ID_FIELD_NUMBER = 3;
    private static final ConnectMessages$GroupDeviceIdentifiers DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int LOCAL_IDENTIFIER_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String groupDeviceIdentifier_ = "";
    private String localIdentifier_ = "";
    private String deduplicationId_ = "";
    private String connectStateIdentifier_ = "";

    static {
        ConnectMessages$GroupDeviceIdentifiers connectMessages$GroupDeviceIdentifiers = new ConnectMessages$GroupDeviceIdentifiers();
        DEFAULT_INSTANCE = connectMessages$GroupDeviceIdentifiers;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$GroupDeviceIdentifiers.class, connectMessages$GroupDeviceIdentifiers);
    }

    private ConnectMessages$GroupDeviceIdentifiers() {
    }

    /* JADX INFO: renamed from: p */
    public static ConnectMessages$GroupDeviceIdentifiers m7328p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002", new Object[]{"bitField0_", "groupDeviceIdentifier_", "localIdentifier_", "deduplicationId_", "connectStateIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$GroupDeviceIdentifiers();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 17);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (ConnectMessages$GroupDeviceIdentifiers.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final String m7329n() {
        return this.connectStateIdentifier_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7330o() {
        return this.deduplicationId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7331q() {
        return this.groupDeviceIdentifier_;
    }

    /* JADX INFO: renamed from: r */
    public final String m7332r() {
        return this.localIdentifier_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7333s() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7334t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7335u() {
        return (this.bitField0_ & 1) != 0;
    }
}
