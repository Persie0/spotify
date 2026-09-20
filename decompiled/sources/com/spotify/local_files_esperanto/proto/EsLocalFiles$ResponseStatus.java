package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EsLocalFiles$ResponseStatus extends AbstractC0269h implements sre0 {
    private static final EsLocalFiles$ResponseStatus DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private String reason_ = "";
    private int statusCode_;

    static {
        EsLocalFiles$ResponseStatus esLocalFiles$ResponseStatus = new EsLocalFiles$ResponseStatus();
        DEFAULT_INSTANCE = esLocalFiles$ResponseStatus;
        AbstractC0269h.registerDefaultInstance(EsLocalFiles$ResponseStatus.class, esLocalFiles$ResponseStatus);
    }

    private EsLocalFiles$ResponseStatus() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"statusCode_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$ResponseStatus();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 25);
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
        synchronized (EsLocalFiles$ResponseStatus.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
