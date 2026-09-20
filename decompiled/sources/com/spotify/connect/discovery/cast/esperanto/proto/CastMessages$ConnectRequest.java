package com.spotify.connect.discovery.cast.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CastMessages$ConnectRequest extends AbstractC0269h implements sre0 {
    private static final CastMessages$ConnectRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int INTERACTION_IDS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String deviceId_ = "";
    private ae50 interactionIds_ = AbstractC0269h.emptyProtobufList();

    static {
        CastMessages$ConnectRequest castMessages$ConnectRequest = new CastMessages$ConnectRequest();
        DEFAULT_INSTANCE = castMessages$ConnectRequest;
        AbstractC0269h.registerDefaultInstance(CastMessages$ConnectRequest.class, castMessages$ConnectRequest);
    }

    private CastMessages$ConnectRequest() {
    }

    /* JADX INFO: renamed from: o */
    public static CastMessages$ConnectRequest m7284o(byte[] bArr) {
        return (CastMessages$ConnectRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"deviceId_", "interactionIds_"});
        }
        if (iOrdinal == 3) {
            return new CastMessages$ConnectRequest();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 24);
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
        synchronized (CastMessages$ConnectRequest.class) {
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

    public final String getDeviceId() {
        return this.deviceId_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m7285n() {
        return this.interactionIds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
