package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Section extends AbstractC0269h implements sre0 {
    private static final Section DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 10;
    public static final int EXTERNAL_LINK_FIELD_NUMBER = 11;
    public static final int FALLBACK_FIELD_NUMBER = 2;
    public static final int IMAGE_FIELD_NUMBER = 6;
    public static final int LOOPING_VIDEO_FIELD_NUMBER = 9;
    public static final int MUSIC_CLOSED_CAPTION_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int START_MS_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int bodyCase_ = 0;
    private Object body_;
    private TextSentence fallback_;
    private int startMs_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"body_", "bodyCase_", "bitField0_", "startMs_", "fallback_", TextSentence.class, TitleSection.class, ImageSection.class, MusicClosedCaption.class, LoopingVideoSection.class, EntitySection.class, ExternalLinkSection.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 11);
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
        synchronized (Section.class) {
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
    public final int m8108n() {
        int i = this.bodyCase_;
        if (i == 0) {
            return 8;
        }
        if (i == 6) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        switch (i) {
            case 8:
                return 4;
            case 9:
                return 5;
            case 10:
                return 6;
            case 11:
                return 7;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EntitySection m8109o() {
        return this.bodyCase_ == 10 ? (EntitySection) this.body_ : EntitySection.m8061o();
    }

    /* JADX INFO: renamed from: p */
    public final ExternalLinkSection m8110p() {
        return this.bodyCase_ == 11 ? (ExternalLinkSection) this.body_ : ExternalLinkSection.m8072n();
    }

    /* JADX INFO: renamed from: q */
    public final ImageSection m8111q() {
        return this.bodyCase_ == 6 ? (ImageSection) this.body_ : ImageSection.m8076q();
    }

    /* JADX INFO: renamed from: r */
    public final LoopingVideoSection m8112r() {
        return this.bodyCase_ == 9 ? (LoopingVideoSection) this.body_ : LoopingVideoSection.m8086q();
    }

    /* JADX INFO: renamed from: s */
    public final MusicClosedCaption m8113s() {
        return this.bodyCase_ == 8 ? (MusicClosedCaption) this.body_ : MusicClosedCaption.m8093n();
    }

    /* JADX INFO: renamed from: t */
    public final int m8114t() {
        return this.startMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final TextSentence m8115u() {
        return this.bodyCase_ == 3 ? (TextSentence) this.body_ : TextSentence.m8119n();
    }

    /* JADX INFO: renamed from: v */
    public final TitleSection m8116v() {
        return this.bodyCase_ == 4 ? (TitleSection) this.body_ : TitleSection.m8125n();
    }
}
