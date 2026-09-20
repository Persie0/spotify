package com.spotify.extendedmetadata.extensions.liveeventsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ArtistOnTour extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 5;
    private static final ArtistOnTour DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int UPCOMING_EVENTS_COUNT_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int upcomingEventsCount_;
    private String uri_ = "";
    private String imageUrl_ = "";
    private String title_ = "";
    private String backgroundImageUrl_ = "";

    static {
        ArtistOnTour artistOnTour = new ArtistOnTour();
        DEFAULT_INSTANCE = artistOnTour;
        AbstractC0269h.registerDefaultInstance(ArtistOnTour.class, artistOnTour);
    }

    private ArtistOnTour() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ", new Object[]{"uri_", "imageUrl_", "title_", "upcomingEventsCount_", "backgroundImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ArtistOnTour();
        }
        if (iOrdinal == 4) {
            return new qw5(4);
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
        synchronized (ArtistOnTour.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10216o() {
        return this.backgroundImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final int m10217p() {
        return this.upcomingEventsCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
