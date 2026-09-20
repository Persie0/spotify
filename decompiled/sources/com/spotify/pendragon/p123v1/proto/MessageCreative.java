package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageCreative extends AbstractC0269h implements sre0 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 6;
    public static final int CREATIVE_ID_FIELD_NUMBER = 1;
    public static final int CREATIVE_VERSION_FIELD_NUMBER = 4;
    private static final MessageCreative DEFAULT_INSTANCE;
    public static final int FORMAT_METADATA_FIELD_NUMBER = 2;
    public static final int HTML_FIELD_NUMBER = 3;
    public static final int LOCALE_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 8;
    private long campaignId_;
    private Object content_;
    private long creativeId_;
    private long templateId_;
    private int contentCase_ = 0;
    private String creativeVersion_ = "";
    private String locale_ = "";
    private String type_ = "";

    static {
        MessageCreative messageCreative = new MessageCreative();
        DEFAULT_INSTANCE = messageCreative;
        AbstractC0269h.registerDefaultInstance(MessageCreative.class, messageCreative);
    }

    private MessageCreative() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static MessageCreative m17238r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ", new Object[]{"content_", "contentCase_", "creativeId_", FormatMetadata.class, Html.class, "creativeVersion_", "templateId_", "campaignId_", "locale_", "type_"});
        }
        if (iOrdinal == 3) {
            return new MessageCreative();
        }
        if (iOrdinal == 4) {
            return new dbd0(14);
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
        synchronized (MessageCreative.class) {
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
    public final long m17239o() {
        return this.campaignId_;
    }

    /* JADX INFO: renamed from: p */
    public final long m17240p() {
        return this.creativeId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m17241q() {
        return this.creativeVersion_;
    }

    /* JADX INFO: renamed from: s */
    public final FormatMetadata m17242s() {
        return this.contentCase_ == 2 ? (FormatMetadata) this.content_ : FormatMetadata.m17177q();
    }

    /* JADX INFO: renamed from: t */
    public final Html m17243t() {
        return this.contentCase_ == 3 ? (Html) this.content_ : Html.m17209q();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m17244u() {
        return this.locale_;
    }

    /* JADX INFO: renamed from: v */
    public final long m17245v() {
        return this.templateId_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m17246w() {
        return this.contentCase_ == 2;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m17247x() {
        return this.contentCase_ == 3;
    }
}
