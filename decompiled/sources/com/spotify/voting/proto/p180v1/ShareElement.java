package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareElement extends AbstractC0269h implements sre0 {
    public static final int CARD_ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    private static final ShareElement DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int NOMINEE_ID_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_CARD_URL_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int VOTES_FIELD_NUMBER = 1;
    private int bitField0_;
    private String votes_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";
    private String shareCardUrl_ = "";
    private String cardAccessibilityText_ = "";
    private String nomineeId_ = "";

    static {
        ShareElement shareElement = new ShareElement();
        DEFAULT_INSTANCE = shareElement;
        AbstractC0269h.registerDefaultInstance(ShareElement.class, shareElement);
    }

    private ShareElement() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"bitField0_", "votes_", "title_", "subtitle_", "imageUrl_", "shareCardUrl_", "cardAccessibilityText_", "nomineeId_"});
        }
        if (iOrdinal == 3) {
            return new ShareElement();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 11);
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
        synchronized (ShareElement.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m22407n() {
        return this.cardAccessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22408o() {
        return this.shareCardUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22409p() {
        return this.votes_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
