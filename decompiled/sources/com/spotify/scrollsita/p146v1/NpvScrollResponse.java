package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.chk0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class NpvScrollResponse extends AbstractC0269h implements sre0 {
    public static final int DEBUG_INFO_FIELD_NUMBER = 3;
    private static final NpvScrollResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_INFO_FIELD_NUMBER = 2;
    public static final int STRUCTURE_FIELD_NUMBER = 1;
    private int bitField0_;
    private DebugInfo debugInfo_;
    private ResponseInfo responseInfo_;
    private NpvScrollStructure structure_;

    static {
        NpvScrollResponse npvScrollResponse = new NpvScrollResponse();
        DEFAULT_INSTANCE = npvScrollResponse;
        AbstractC0269h.registerDefaultInstance(NpvScrollResponse.class, npvScrollResponse);
    }

    private NpvScrollResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20542n(NpvScrollResponse npvScrollResponse, ResponseInfo responseInfo) {
        npvScrollResponse.getClass();
        responseInfo.getClass();
        npvScrollResponse.responseInfo_ = responseInfo;
        npvScrollResponse.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m20543o(NpvScrollResponse npvScrollResponse, NpvScrollStructure npvScrollStructure) {
        npvScrollResponse.getClass();
        npvScrollStructure.getClass();
        npvScrollResponse.structure_ = npvScrollStructure;
        npvScrollResponse.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static chk0 m20544r() {
        return (chk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "structure_", "responseInfo_", "debugInfo_"});
        }
        if (iOrdinal == 3) {
            return new NpvScrollResponse();
        }
        if (iOrdinal == 4) {
            return new chk0(DEFAULT_INSTANCE);
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
        synchronized (NpvScrollResponse.class) {
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

    /* JADX INFO: renamed from: p */
    public final ResponseInfo m20545p() {
        ResponseInfo responseInfo = this.responseInfo_;
        return responseInfo == null ? ResponseInfo.m20583o() : responseInfo;
    }

    /* JADX INFO: renamed from: q */
    public final NpvScrollStructure m20546q() {
        NpvScrollStructure npvScrollStructure = this.structure_;
        return npvScrollStructure == null ? NpvScrollStructure.m20548o() : npvScrollStructure;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
