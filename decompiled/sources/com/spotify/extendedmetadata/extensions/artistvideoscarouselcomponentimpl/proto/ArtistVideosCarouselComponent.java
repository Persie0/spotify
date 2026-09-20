package com.spotify.extendedmetadata.extensions.artistvideoscarouselcomponentimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ArtistVideosCarouselComponent extends AbstractC0269h implements sre0 {
    private static final ArtistVideosCarouselComponent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_CARD_FIELD_NUMBER = 1;
    private ae50 videoCard_ = AbstractC0269h.emptyProtobufList();

    static {
        ArtistVideosCarouselComponent artistVideosCarouselComponent = new ArtistVideosCarouselComponent();
        DEFAULT_INSTANCE = artistVideosCarouselComponent;
        AbstractC0269h.registerDefaultInstance(ArtistVideosCarouselComponent.class, artistVideosCarouselComponent);
    }

    private ArtistVideosCarouselComponent() {
    }

    /* JADX INFO: renamed from: n */
    public static ArtistVideosCarouselComponent m9840n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"videoCard_", ArtistVideoCard.class});
        }
        if (iOrdinal == 3) {
            return new ArtistVideosCarouselComponent();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 7);
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
        synchronized (ArtistVideosCarouselComponent.class) {
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
    public final ae50 m9841o() {
        return this.videoCard_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
