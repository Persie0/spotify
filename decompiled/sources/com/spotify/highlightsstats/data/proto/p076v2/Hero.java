package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Hero extends AbstractC0269h implements sre0 {
    public static final int ARTWORK_FIELD_NUMBER = 5;
    public static final int BODY_1_FIELD_NUMBER = 3;
    public static final int BODY_2_FIELD_NUMBER = 4;
    private static final Hero DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Artwork artwork_;
    private int bitField0_;
    private Paragraph body1_;
    private Paragraph body2_;
    private Paragraph subtitle_;
    private String title_ = "";

    static {
        Hero hero = new Hero();
        DEFAULT_INSTANCE = hero;
        AbstractC0269h.registerDefaultInstance(Hero.class, hero);
    }

    private Hero() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Hero m11523q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "title_", "subtitle_", "body1_", "body2_", "artwork_"});
        }
        if (iOrdinal == 3) {
            return new Hero();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 12);
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
        synchronized (Hero.class) {
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

    /* JADX INFO: renamed from: n */
    public final Artwork m11524n() {
        Artwork artwork = this.artwork_;
        return artwork == null ? Artwork.m11504o() : artwork;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Paragraph m11525o() {
        Paragraph paragraph = this.body1_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: p */
    public final Paragraph m11526p() {
        Paragraph paragraph = this.body2_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: r */
    public final Paragraph m11527r() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11528s() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11529t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
