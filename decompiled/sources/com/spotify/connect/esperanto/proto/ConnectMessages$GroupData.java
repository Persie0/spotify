package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectMessages$GroupData extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    private static final ConnectMessages$GroupData DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ConnectMessages$GroupCapabilities capabilities_;
    private ae50 devices_ = AbstractC0269h.emptyProtobufList();

    static {
        ConnectMessages$GroupData connectMessages$GroupData = new ConnectMessages$GroupData();
        DEFAULT_INSTANCE = connectMessages$GroupData;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$GroupData.class, connectMessages$GroupData);
    }

    private ConnectMessages$GroupData() {
    }

    /* JADX INFO: renamed from: p */
    public static ConnectMessages$GroupData m7315p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "devices_", ConnectMessages$GroupDevice.class, "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$GroupData();
        }
        if (iOrdinal == 4) {
            return new nuh(14);
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
        synchronized (ConnectMessages$GroupData.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ConnectMessages$GroupCapabilities m7316o() {
        ConnectMessages$GroupCapabilities connectMessages$GroupCapabilities = this.capabilities_;
        return connectMessages$GroupCapabilities == null ? ConnectMessages$GroupCapabilities.m7312n() : connectMessages$GroupCapabilities;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m7317q() {
        return this.devices_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
