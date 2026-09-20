package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mnw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsPreparePlay$PreparePlayRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsPreparePlay$PreparePlayRequest DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_ORIGIN_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsContext$Context context_;
    private EsPreparePlayOptions$PreparePlayOptions options_;
    private EsPlayOrigin$PlayOrigin playOrigin_;

    static {
        EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest = new EsPreparePlay$PreparePlayRequest();
        DEFAULT_INSTANCE = esPreparePlay$PreparePlayRequest;
        AbstractC0269h.registerDefaultInstance(EsPreparePlay$PreparePlayRequest.class, esPreparePlay$PreparePlayRequest);
    }

    private EsPreparePlay$PreparePlayRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17823n(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest, EsContext$Context esContext$Context) {
        esPreparePlay$PreparePlayRequest.getClass();
        esContext$Context.getClass();
        esPreparePlay$PreparePlayRequest.context_ = esContext$Context;
        esPreparePlay$PreparePlayRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m17824o(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest, EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions) {
        esPreparePlay$PreparePlayRequest.getClass();
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esPreparePlay$PreparePlayRequest.options_ = esPreparePlayOptions$PreparePlayOptions;
        esPreparePlay$PreparePlayRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m17825p(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin) {
        esPreparePlay$PreparePlayRequest.getClass();
        esPlayOrigin$PlayOrigin.getClass();
        esPreparePlay$PreparePlayRequest.playOrigin_ = esPlayOrigin$PlayOrigin;
        esPreparePlay$PreparePlayRequest.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mnw m17826q() {
        return (mnw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "context_", "options_", "playOrigin_"});
        }
        if (iOrdinal == 3) {
            return new EsPreparePlay$PreparePlayRequest();
        }
        if (iOrdinal == 4) {
            return new mnw(DEFAULT_INSTANCE);
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
        synchronized (EsPreparePlay$PreparePlayRequest.class) {
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
