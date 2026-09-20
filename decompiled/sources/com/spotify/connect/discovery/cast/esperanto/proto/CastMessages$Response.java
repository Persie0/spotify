package com.spotify.connect.discovery.cast.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cbc;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CastMessages$Response extends AbstractC0269h implements sre0 {
    private static final CastMessages$Response DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        CastMessages$Response castMessages$Response = new CastMessages$Response();
        DEFAULT_INSTANCE = castMessages$Response;
        AbstractC0269h.registerDefaultInstance(CastMessages$Response.class, castMessages$Response);
    }

    private CastMessages$Response() {
    }

    /* JADX INFO: renamed from: o */
    public static CastMessages$Response m7296o(byte[] bArr) {
        return (CastMessages$Response) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new CastMessages$Response();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 25);
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
        synchronized (CastMessages$Response.class) {
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
    public final cbc m7297n() {
        cbc cbcVar;
        int i = this.result_;
        if (i == 0) {
            cbcVar = cbc.OK;
        } else if (i == 1) {
            cbcVar = cbc.NOT_FOUND;
        } else if (i != 2) {
            cbcVar = i != 3 ? null : cbc.INVALID_STATE;
        } else {
            cbcVar = cbc.FAILED_TO_PARSE_JSON;
        }
        return cbcVar == null ? cbc.UNRECOGNIZED : cbcVar;
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
