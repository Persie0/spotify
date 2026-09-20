package com.spotify.concertsgalleryview.p049v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VenueCard extends AbstractC0269h implements sre0 {
    private static final VenueCard DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 5;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TARGET_URI_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int kind_;
    private String targetUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";

    static {
        VenueCard venueCard = new VenueCard();
        DEFAULT_INSTANCE = venueCard;
        AbstractC0269h.registerDefaultInstance(VenueCard.class, venueCard);
    }

    private VenueCard() {
    }

    /* JADX INFO: renamed from: n */
    public static VenueCard m7232n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ለ\u0000\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "kind_", "targetUri_", "title_", "subtitle_", "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new VenueCard();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 9);
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
        synchronized (VenueCard.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7233o() {
        return this.targetUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
