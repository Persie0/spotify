package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x5f0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class MicroCompactInlineCard extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 5;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 4;
    private static final MicroCompactInlineCard DEFAULT_INSTANCE;
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

    static {
        MicroCompactInlineCard microCompactInlineCard = new MicroCompactInlineCard();
        DEFAULT_INSTANCE = microCompactInlineCard;
        AbstractC0269h.registerDefaultInstance(MicroCompactInlineCard.class, microCompactInlineCard);
    }

    private MicroCompactInlineCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static MicroCompactInlineCard m17249q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "signifier_", "headline_", "headlineColor_", "backgroundColor_", "accessoryContent_"});
        }
        if (iOrdinal == 3) {
            return new MicroCompactInlineCard();
        }
        if (iOrdinal == 4) {
            return new x5f0(20);
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
        synchronized (MicroCompactInlineCard.class) {
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
    public final AccessoryContent m17250o() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    /* JADX INFO: renamed from: p */
    public final BackgroundColor m17251p() {
        BackgroundColor backgroundColor = this.backgroundColor_;
        return backgroundColor == null ? BackgroundColor.m16992p() : backgroundColor;
    }

    /* JADX INFO: renamed from: r */
    public final String m17252r() {
        return this.headline_;
    }

    /* JADX INFO: renamed from: s */
    public final String m17253s() {
        return this.headlineColor_;
    }

    /* JADX INFO: renamed from: t */
    public final Signifier m17254t() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.m17273o() : signifier;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
