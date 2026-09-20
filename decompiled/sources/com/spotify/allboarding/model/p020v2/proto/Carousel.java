package com.spotify.allboarding.model.p020v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class Carousel extends AbstractC0269h implements sre0 {
    public static final int BUTTON_LABEL_FIELD_NUMBER = 2;
    public static final int CARDS_FIELD_NUMBER = 1;
    private static final Carousel DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 cards_ = AbstractC0269h.emptyProtobufList();
    private String buttonLabel_ = "";

    static {
        Carousel carousel = new Carousel();
        DEFAULT_INSTANCE = carousel;
        AbstractC0269h.registerDefaultInstance(Carousel.class, carousel);
    }

    private Carousel() {
    }

    /* JADX INFO: renamed from: p */
    public static Carousel m3178p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"cards_", CarouselCard.class, "buttonLabel_"});
        }
        if (iOrdinal == 3) {
            return new Carousel();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 17);
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
        synchronized (Carousel.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m3179n() {
        return this.buttonLabel_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m3180o() {
        return this.cards_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
