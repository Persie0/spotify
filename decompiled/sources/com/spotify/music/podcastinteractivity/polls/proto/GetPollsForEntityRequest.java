package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ga10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetPollsForEntityRequest extends AbstractC0269h implements sre0 {
    private static final GetPollsForEntityRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String entityUri_ = "";

    static {
        GetPollsForEntityRequest getPollsForEntityRequest = new GetPollsForEntityRequest();
        DEFAULT_INSTANCE = getPollsForEntityRequest;
        AbstractC0269h.registerDefaultInstance(GetPollsForEntityRequest.class, getPollsForEntityRequest);
    }

    private GetPollsForEntityRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15732n(GetPollsForEntityRequest getPollsForEntityRequest, String str) {
        getPollsForEntityRequest.getClass();
        str.getClass();
        getPollsForEntityRequest.entityUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static ga10 m15733o() {
        return (ga10) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"entityUri_"});
        }
        if (iOrdinal == 3) {
            return new GetPollsForEntityRequest();
        }
        if (iOrdinal == 4) {
            return new ga10(DEFAULT_INSTANCE);
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
        synchronized (GetPollsForEntityRequest.class) {
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
