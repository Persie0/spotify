package com.spotify.prefetch_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.plw;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsMediaPrefetch$SegmentedVideoResource extends AbstractC0269h implements sre0 {
    private static final EsMediaPrefetch$SegmentedVideoResource DEFAULT_INSTANCE;
    public static final int END_MS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int START_MS_FIELD_NUMBER = 2;
    public static final int VIDEO_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private int endMs_;
    private int startMs_;
    private gva videoId_ = gva.f84678b;

    static {
        EsMediaPrefetch$SegmentedVideoResource esMediaPrefetch$SegmentedVideoResource = new EsMediaPrefetch$SegmentedVideoResource();
        DEFAULT_INSTANCE = esMediaPrefetch$SegmentedVideoResource;
        AbstractC0269h.registerDefaultInstance(EsMediaPrefetch$SegmentedVideoResource.class, esMediaPrefetch$SegmentedVideoResource);
    }

    private EsMediaPrefetch$SegmentedVideoResource() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19504n(EsMediaPrefetch$SegmentedVideoResource esMediaPrefetch$SegmentedVideoResource, int i) {
        esMediaPrefetch$SegmentedVideoResource.bitField0_ |= 2;
        esMediaPrefetch$SegmentedVideoResource.endMs_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m19505o(EsMediaPrefetch$SegmentedVideoResource esMediaPrefetch$SegmentedVideoResource, int i) {
        esMediaPrefetch$SegmentedVideoResource.bitField0_ |= 1;
        esMediaPrefetch$SegmentedVideoResource.startMs_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m19506p(EsMediaPrefetch$SegmentedVideoResource esMediaPrefetch$SegmentedVideoResource, cva cvaVar) {
        esMediaPrefetch$SegmentedVideoResource.getClass();
        esMediaPrefetch$SegmentedVideoResource.videoId_ = cvaVar;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static plw m19507q() {
        return (plw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002င\u0000\u0003င\u0001", new Object[]{"bitField0_", "videoId_", "startMs_", "endMs_"});
        }
        if (iOrdinal == 3) {
            return new EsMediaPrefetch$SegmentedVideoResource();
        }
        if (iOrdinal == 4) {
            return new plw(DEFAULT_INSTANCE);
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
        synchronized (EsMediaPrefetch$SegmentedVideoResource.class) {
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
