package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z910;

/* JADX INFO: loaded from: classes10.dex */
public final class GetPageRequest extends AbstractC0269h implements sre0 {
    private static final GetPageRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SURFACE_FIELD_NUMBER = 1;
    private String surface_ = "";

    static {
        GetPageRequest getPageRequest = new GetPageRequest();
        DEFAULT_INSTANCE = getPageRequest;
        AbstractC0269h.registerDefaultInstance(GetPageRequest.class, getPageRequest);
    }

    private GetPageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21746n(GetPageRequest getPageRequest, String str) {
        getPageRequest.getClass();
        str.getClass();
        getPageRequest.surface_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static z910 m21747o() {
        return (z910) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"surface_"});
        }
        if (iOrdinal == 3) {
            return new GetPageRequest();
        }
        if (iOrdinal == 4) {
            return new z910(DEFAULT_INSTANCE);
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
        synchronized (GetPageRequest.class) {
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
