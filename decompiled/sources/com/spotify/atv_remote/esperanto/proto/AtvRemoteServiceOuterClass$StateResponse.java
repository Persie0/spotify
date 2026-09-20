package com.spotify.atv_remote.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AtvRemoteServiceOuterClass$StateResponse extends AbstractC0269h implements sre0 {
    private static final AtvRemoteServiceOuterClass$StateResponse DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 devices_ = AbstractC0269h.emptyProtobufList();

    static {
        AtvRemoteServiceOuterClass$StateResponse atvRemoteServiceOuterClass$StateResponse = new AtvRemoteServiceOuterClass$StateResponse();
        DEFAULT_INSTANCE = atvRemoteServiceOuterClass$StateResponse;
        AbstractC0269h.registerDefaultInstance(AtvRemoteServiceOuterClass$StateResponse.class, atvRemoteServiceOuterClass$StateResponse);
    }

    private AtvRemoteServiceOuterClass$StateResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static AtvRemoteServiceOuterClass$StateResponse m3368o(byte[] bArr) {
        return (AtvRemoteServiceOuterClass$StateResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"devices_", AtvRemoteServiceOuterClass$AtvDeviceInfo.class});
        }
        if (iOrdinal == 3) {
            return new AtvRemoteServiceOuterClass$StateResponse();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 3);
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
        synchronized (AtvRemoteServiceOuterClass$StateResponse.class) {
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
    public final ae50 m3369n() {
        return this.devices_;
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
