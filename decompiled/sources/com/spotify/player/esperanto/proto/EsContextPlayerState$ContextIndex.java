package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsContextPlayerState$ContextIndex extends AbstractC0269h implements sre0 {
    private static final EsContextPlayerState$ContextIndex DEFAULT_INSTANCE;
    public static final int PAGE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 2;
    private long page_;
    private long track_;

    static {
        EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex = new EsContextPlayerState$ContextIndex();
        DEFAULT_INSTANCE = esContextPlayerState$ContextIndex;
        AbstractC0269h.registerDefaultInstance(EsContextPlayerState$ContextIndex.class, esContextPlayerState$ContextIndex);
    }

    private EsContextPlayerState$ContextIndex() {
    }

    /* JADX INFO: renamed from: o */
    public static EsContextPlayerState$ContextIndex m17697o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0003", new Object[]{"page_", "track_"});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerState$ContextIndex();
        }
        if (iOrdinal == 4) {
            return new qjw(0);
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
        synchronized (EsContextPlayerState$ContextIndex.class) {
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
    public final long m17698p() {
        return this.page_;
    }

    /* JADX INFO: renamed from: q */
    public final long m17699q() {
        return this.track_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
