package com.spotify.prefetch_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jlw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsMediaPrefetch$AudioPreviewResource extends AbstractC0269h implements sre0 {
    private static final EsMediaPrefetch$AudioPreviewResource DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private String url_ = "";

    static {
        EsMediaPrefetch$AudioPreviewResource esMediaPrefetch$AudioPreviewResource = new EsMediaPrefetch$AudioPreviewResource();
        DEFAULT_INSTANCE = esMediaPrefetch$AudioPreviewResource;
        AbstractC0269h.registerDefaultInstance(EsMediaPrefetch$AudioPreviewResource.class, esMediaPrefetch$AudioPreviewResource);
    }

    private EsMediaPrefetch$AudioPreviewResource() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19490n(EsMediaPrefetch$AudioPreviewResource esMediaPrefetch$AudioPreviewResource, String str) {
        esMediaPrefetch$AudioPreviewResource.getClass();
        str.getClass();
        esMediaPrefetch$AudioPreviewResource.url_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static jlw m19491o() {
        return (jlw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
        }
        if (iOrdinal == 3) {
            return new EsMediaPrefetch$AudioPreviewResource();
        }
        if (iOrdinal == 4) {
            return new jlw(DEFAULT_INSTANCE);
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
        synchronized (EsMediaPrefetch$AudioPreviewResource.class) {
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
