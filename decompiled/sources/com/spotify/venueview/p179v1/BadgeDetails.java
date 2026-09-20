package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class BadgeDetails extends AbstractC0269h implements sre0 {
    private static final BadgeDetails DEFAULT_INSTANCE;
    public static final int DESCRIPTION_HTML_FIELD_NUMBER = 3;
    public static final int HERO_IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String heroImageUrl_ = "";
    private String title_ = "";
    private String descriptionHtml_ = "";

    static {
        BadgeDetails badgeDetails = new BadgeDetails();
        DEFAULT_INSTANCE = badgeDetails;
        AbstractC0269h.registerDefaultInstance(BadgeDetails.class, badgeDetails);
    }

    private BadgeDetails() {
    }

    /* JADX INFO: renamed from: n */
    public static BadgeDetails m22281n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"heroImageUrl_", "title_", "descriptionHtml_"});
        }
        if (iOrdinal == 3) {
            return new BadgeDetails();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 15);
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
        synchronized (BadgeDetails.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22282o() {
        return this.descriptionHtml_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22283p() {
        return this.heroImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
