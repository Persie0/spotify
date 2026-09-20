package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vlw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$ContextsProgressResponse extends AbstractC0269h implements sre0 {
    private static final EsOffline$ContextsProgressResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESSES_FIELD_NUMBER = 1;
    private ae50 progresses_ = AbstractC0269h.emptyProtobufList();

    static {
        EsOffline$ContextsProgressResponse esOffline$ContextsProgressResponse = new EsOffline$ContextsProgressResponse();
        DEFAULT_INSTANCE = esOffline$ContextsProgressResponse;
        AbstractC0269h.registerDefaultInstance(EsOffline$ContextsProgressResponse.class, esOffline$ContextsProgressResponse);
    }

    private EsOffline$ContextsProgressResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static EsOffline$ContextsProgressResponse m16101p(byte[] bArr) {
        return (EsOffline$ContextsProgressResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"progresses_", EsOffline$ContextProgress.class});
        }
        if (iOrdinal == 3) {
            return new EsOffline$ContextsProgressResponse();
        }
        if (iOrdinal == 4) {
            return new vlw(4);
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
        synchronized (EsOffline$ContextsProgressResponse.class) {
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
    public final ae50 m16102o() {
        return this.progresses_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
