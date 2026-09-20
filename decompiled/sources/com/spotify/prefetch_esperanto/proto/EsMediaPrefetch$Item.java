package com.spotify.prefetch_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mlw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsMediaPrefetch$Item extends AbstractC0269h implements sre0 {
    public static final int AUDIO_PREVIEW_RESOURCE_FIELD_NUMBER = 1;
    private static final EsMediaPrefetch$Item DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESSIVE_VIDEO_RESOURCE_FIELD_NUMBER = 2;
    public static final int SEGMENTED_VIDEO_RESOURCE_FIELD_NUMBER = 3;
    private int resourceCase_ = 0;
    private Object resource_;

    static {
        EsMediaPrefetch$Item esMediaPrefetch$Item = new EsMediaPrefetch$Item();
        DEFAULT_INSTANCE = esMediaPrefetch$Item;
        AbstractC0269h.registerDefaultInstance(EsMediaPrefetch$Item.class, esMediaPrefetch$Item);
    }

    private EsMediaPrefetch$Item() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19494n(EsMediaPrefetch$Item esMediaPrefetch$Item, EsMediaPrefetch$AudioPreviewResource esMediaPrefetch$AudioPreviewResource) {
        esMediaPrefetch$Item.getClass();
        esMediaPrefetch$AudioPreviewResource.getClass();
        esMediaPrefetch$Item.resource_ = esMediaPrefetch$AudioPreviewResource;
        esMediaPrefetch$Item.resourceCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m19495o(EsMediaPrefetch$Item esMediaPrefetch$Item, EsMediaPrefetch$ProgressiveVideoResource esMediaPrefetch$ProgressiveVideoResource) {
        esMediaPrefetch$Item.getClass();
        esMediaPrefetch$ProgressiveVideoResource.getClass();
        esMediaPrefetch$Item.resource_ = esMediaPrefetch$ProgressiveVideoResource;
        esMediaPrefetch$Item.resourceCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m19496p(EsMediaPrefetch$Item esMediaPrefetch$Item, EsMediaPrefetch$SegmentedVideoResource esMediaPrefetch$SegmentedVideoResource) {
        esMediaPrefetch$Item.getClass();
        esMediaPrefetch$SegmentedVideoResource.getClass();
        esMediaPrefetch$Item.resource_ = esMediaPrefetch$SegmentedVideoResource;
        esMediaPrefetch$Item.resourceCase_ = 3;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mlw m19497q() {
        return (mlw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"resource_", "resourceCase_", EsMediaPrefetch$AudioPreviewResource.class, EsMediaPrefetch$ProgressiveVideoResource.class, EsMediaPrefetch$SegmentedVideoResource.class});
        }
        if (iOrdinal == 3) {
            return new EsMediaPrefetch$Item();
        }
        if (iOrdinal == 4) {
            return new mlw(DEFAULT_INSTANCE);
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
        synchronized (EsMediaPrefetch$Item.class) {
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
