package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rnw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsProvidedTrack$ProvidedTrack extends AbstractC0269h implements sre0 {
    public static final int BLOCKED_FIELD_NUMBER = 3;
    public static final int CONTEXT_TRACK_FIELD_NUMBER = 1;
    private static final EsProvidedTrack$ProvidedTrack DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int REMOVED_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsContextTrack$ContextTrack contextTrack_;
    private ae50 removed_ = AbstractC0269h.emptyProtobufList();
    private ae50 blocked_ = AbstractC0269h.emptyProtobufList();
    private String provider_ = "";

    static {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = new EsProvidedTrack$ProvidedTrack();
        DEFAULT_INSTANCE = esProvidedTrack$ProvidedTrack;
        AbstractC0269h.registerDefaultInstance(EsProvidedTrack$ProvidedTrack.class, esProvidedTrack$ProvidedTrack);
    }

    private EsProvidedTrack$ProvidedTrack() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17845n(EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack, EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        esProvidedTrack$ProvidedTrack.getClass();
        esProvidedTrack$ProvidedTrack.contextTrack_ = esContextTrack$ContextTrack;
        esProvidedTrack$ProvidedTrack.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m17846o(EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack, String str) {
        esProvidedTrack$ProvidedTrack.getClass();
        str.getClass();
        esProvidedTrack$ProvidedTrack.provider_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static EsProvidedTrack$ProvidedTrack m17848r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static rnw m17849t() {
        return (rnw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002Ț\u0003Ț\u0004Ȉ", new Object[]{"bitField0_", "contextTrack_", "removed_", "blocked_", "provider_"});
        }
        if (iOrdinal == 3) {
            return new EsProvidedTrack$ProvidedTrack();
        }
        if (iOrdinal == 4) {
            return new rnw();
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
        synchronized (EsProvidedTrack$ProvidedTrack.class) {
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

    /* JADX INFO: renamed from: q */
    public final EsContextTrack$ContextTrack m17850q() {
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.contextTrack_;
        return esContextTrack$ContextTrack == null ? EsContextTrack$ContextTrack.m17752r() : esContextTrack$ContextTrack;
    }

    /* JADX INFO: renamed from: s */
    public final String m17851s() {
        return this.provider_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
