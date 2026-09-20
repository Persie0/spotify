package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ct31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardInlineCard extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 7;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 4;
    private static final StandardInlineCard DEFAULT_INSTANCE;
    public static final int HEADLINE_COLOR_FIELD_NUMBER = 3;
    public static final int HEADLINE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 1;
    private AccessoryContent accessoryContent_;
    private BackgroundColor backgroundColor_;
    private int bitField0_;
    private Signifier signifier_;
    private String headline_ = "";
    private String headlineColor_ = "";
    private String body_ = "";
    private String bodyColor_ = "";

    static {
        StandardInlineCard standardInlineCard = new StandardInlineCard();
        DEFAULT_INSTANCE = standardInlineCard;
        AbstractC0269h.registerDefaultInstance(StandardInlineCard.class, standardInlineCard);
    }

    private StandardInlineCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static StandardInlineCard m17291s() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"bitField0_", "signifier_", "headline_", "headlineColor_", "body_", "bodyColor_", "backgroundColor_", "accessoryContent_"});
        }
        if (iOrdinal == 3) {
            return new StandardInlineCard();
        }
        if (iOrdinal == 4) {
            return new ct31(25);
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
        synchronized (StandardInlineCard.class) {
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
    public final AccessoryContent m17292o() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    /* JADX INFO: renamed from: p */
    public final BackgroundColor m17293p() {
        BackgroundColor backgroundColor = this.backgroundColor_;
        return backgroundColor == null ? BackgroundColor.m16992p() : backgroundColor;
    }

    /* JADX INFO: renamed from: q */
    public final String m17294q() {
        return this.body_;
    }

    /* JADX INFO: renamed from: r */
    public final String m17295r() {
        return this.bodyColor_;
    }

    /* JADX INFO: renamed from: t */
    public final String m17296t() {
        return this.headline_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m17297u() {
        return this.headlineColor_;
    }

    /* JADX INFO: renamed from: v */
    public final Signifier m17298v() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.m17273o() : signifier;
    }
}
