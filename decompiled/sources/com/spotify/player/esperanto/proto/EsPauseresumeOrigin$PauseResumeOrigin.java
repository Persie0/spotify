package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wmw;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsPauseresumeOrigin$PauseResumeOrigin extends AbstractC0269h implements sre0 {
    private static final EsPauseresumeOrigin$PauseResumeOrigin DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String featureIdentifier_ = "";

    static {
        EsPauseresumeOrigin$PauseResumeOrigin esPauseresumeOrigin$PauseResumeOrigin = new EsPauseresumeOrigin$PauseResumeOrigin();
        DEFAULT_INSTANCE = esPauseresumeOrigin$PauseResumeOrigin;
        AbstractC0269h.registerDefaultInstance(EsPauseresumeOrigin$PauseResumeOrigin.class, esPauseresumeOrigin$PauseResumeOrigin);
    }

    private EsPauseresumeOrigin$PauseResumeOrigin() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17783n(EsPauseresumeOrigin$PauseResumeOrigin esPauseresumeOrigin$PauseResumeOrigin, String str) {
        esPauseresumeOrigin$PauseResumeOrigin.getClass();
        str.getClass();
        esPauseresumeOrigin$PauseResumeOrigin.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static wmw m17784o() {
        return (wmw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"featureIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsPauseresumeOrigin$PauseResumeOrigin();
        }
        if (iOrdinal == 4) {
            return new wmw(DEFAULT_INSTANCE);
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
        synchronized (EsPauseresumeOrigin$PauseResumeOrigin.class) {
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
