package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.oq40;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes2.dex */
public final class InlineCard extends AbstractC0269h implements sre0 {
    public static final int BASE_INLINE_CARD_FIELD_NUMBER = 5;
    public static final int BUTTONS_FIELD_NUMBER = 3;
    public static final int COMPACT_INLINE_CARD_FIELD_NUMBER = 2;
    private static final InlineCard DEFAULT_INSTANCE;
    public static final int MICRO_COMPACT_INLINE_CARD_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int STANDARD_INLINE_CARD_FIELD_NUMBER = 1;
    private Object inlineCardTemplate_;
    private int inlineCardTemplateCase_ = 0;
    private ae50 buttons_ = AbstractC0269h.emptyProtobufList();

    static {
        InlineCard inlineCard = new InlineCard();
        DEFAULT_INSTANCE = inlineCard;
        AbstractC0269h.registerDefaultInstance(InlineCard.class, inlineCard);
    }

    private InlineCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static InlineCard m17230r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\u001b\u0004<\u0000\u0005<\u0000", new Object[]{"inlineCardTemplate_", "inlineCardTemplateCase_", StandardInlineCard.class, CompactInlineCard.class, "buttons_", Button.class, MicroCompactInlineCard.class, BaseInlineCard.class});
        }
        if (iOrdinal == 3) {
            return new InlineCard();
        }
        if (iOrdinal == 4) {
            return new zc40(9);
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
        synchronized (InlineCard.class) {
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
    public final BaseInlineCard m17231o() {
        return this.inlineCardTemplateCase_ == 5 ? (BaseInlineCard) this.inlineCardTemplate_ : BaseInlineCard.m17050s();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m17232p() {
        return this.buttons_;
    }

    /* JADX INFO: renamed from: q */
    public final CompactInlineCard m17233q() {
        return this.inlineCardTemplateCase_ == 2 ? (CompactInlineCard) this.inlineCardTemplate_ : CompactInlineCard.m17145s();
    }

    /* JADX INFO: renamed from: s */
    public final int m17234s() {
        return oq40.m67583b(this.inlineCardTemplateCase_);
    }

    /* JADX INFO: renamed from: t */
    public final MicroCompactInlineCard m17235t() {
        return this.inlineCardTemplateCase_ == 4 ? (MicroCompactInlineCard) this.inlineCardTemplate_ : MicroCompactInlineCard.m17249q();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final StandardInlineCard m17236u() {
        return this.inlineCardTemplateCase_ == 1 ? (StandardInlineCard) this.inlineCardTemplate_ : StandardInlineCard.m17291s();
    }
}
