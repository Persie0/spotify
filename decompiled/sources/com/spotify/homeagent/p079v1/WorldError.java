package com.spotify.homeagent.p079v1;

import com.google.protobuf.AbstractC0269h;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uae1;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class WorldError extends AbstractC0269h implements sre0 {
    private static final WorldError DEFAULT_INSTANCE;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int errorType_;
    private String reason_ = "";

    static {
        WorldError worldError = new WorldError();
        DEFAULT_INSTANCE = worldError;
        AbstractC0269h.registerDefaultInstance(WorldError.class, worldError);
    }

    private WorldError() {
    }

    /* JADX INFO: renamed from: n */
    public static WorldError m11845n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"errorType_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new WorldError();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 26);
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
        synchronized (WorldError.class) {
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
    public final uae1 m11846o() {
        uae1 uae1Var;
        int i = this.errorType_;
        if (i == 0) {
            uae1Var = uae1.UNDEFINED;
        } else if (i != 1) {
            uae1Var = i != 2 ? null : uae1.GENERATION_ERROR;
        } else {
            uae1Var = uae1.VALIDATION_ERROR;
        }
        return uae1Var == null ? uae1.UNRECOGNIZED : uae1Var;
    }

    /* JADX INFO: renamed from: p */
    public final String m11847p() {
        return this.reason_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
