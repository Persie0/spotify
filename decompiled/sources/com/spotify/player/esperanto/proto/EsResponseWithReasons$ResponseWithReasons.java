package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bow;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsResponseWithReasons$ResponseWithReasons extends AbstractC0269h implements sre0 {
    private static final EsResponseWithReasons$ResponseWithReasons DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 2;
    private int error_;
    private String reasons_ = "";

    static {
        EsResponseWithReasons$ResponseWithReasons esResponseWithReasons$ResponseWithReasons = new EsResponseWithReasons$ResponseWithReasons();
        DEFAULT_INSTANCE = esResponseWithReasons$ResponseWithReasons;
        AbstractC0269h.registerDefaultInstance(EsResponseWithReasons$ResponseWithReasons.class, esResponseWithReasons$ResponseWithReasons);
    }

    private EsResponseWithReasons$ResponseWithReasons() {
    }

    /* JADX INFO: renamed from: p */
    public static EsResponseWithReasons$ResponseWithReasons m17861p(byte[] bArr) {
        return (EsResponseWithReasons$ResponseWithReasons) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"error_", "reasons_"});
        }
        if (iOrdinal == 3) {
            return new EsResponseWithReasons$ResponseWithReasons();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 5);
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
        synchronized (EsResponseWithReasons$ResponseWithReasons.class) {
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
    public final bow m17862n() {
        bow bowVar;
        int i = this.error_;
        if (i == 0) {
            bowVar = bow.OK;
        } else if (i == 1) {
            bowVar = bow.FORBIDDEN;
        } else if (i != 2) {
            bowVar = i != 3 ? null : bow.CONFLICT;
        } else {
            bowVar = bow.NOT_FOUND;
        }
        return bowVar == null ? bow.UNRECOGNIZED : bowVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17863o() {
        return this.reasons_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
