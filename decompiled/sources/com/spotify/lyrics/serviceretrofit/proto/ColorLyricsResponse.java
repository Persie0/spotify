package com.spotify.lyrics.serviceretrofit.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ColorLyricsResponse extends AbstractC0269h implements sre0 {
    public static final int COLORS_FIELD_NUMBER = 2;
    private static final ColorLyricsResponse DEFAULT_INSTANCE;
    public static final int HAS_VOCAL_REMOVAL_FIELD_NUMBER = 3;
    public static final int LYRICS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ColorData colors_;
    private boolean hasVocalRemoval_;
    private LyricsResponse lyrics_;

    public static final class ColorData extends AbstractC0269h implements sre0 {
        public static final int BACKGROUND_FIELD_NUMBER = 1;
        private static final ColorData DEFAULT_INSTANCE;
        public static final int HIGHLIGHT_TEXT_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 2;
        private int background_;
        private int highlightText_;
        private int text_;

        static {
            ColorData colorData = new ColorData();
            DEFAULT_INSTANCE = colorData;
            AbstractC0269h.registerDefaultInstance(ColorData.class, colorData);
        }

        private ColorData() {
        }

        /* JADX INFO: renamed from: o */
        public static ColorData m13333o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"background_", "text_", "highlightText_"});
            }
            if (iOrdinal == 3) {
                return new ColorData();
            }
            if (iOrdinal == 4) {
                return new C0866b(DEFAULT_INSTANCE);
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
            synchronized (ColorData.class) {
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
        public final int m13334n() {
            return this.background_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final int m13335p() {
            return this.highlightText_;
        }

        /* JADX INFO: renamed from: q */
        public final int m13336q() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ColorLyricsResponse colorLyricsResponse = new ColorLyricsResponse();
        DEFAULT_INSTANCE = colorLyricsResponse;
        AbstractC0269h.registerDefaultInstance(ColorLyricsResponse.class, colorLyricsResponse);
    }

    private ColorLyricsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007", new Object[]{"bitField0_", "lyrics_", "colors_", "hasVocalRemoval_"});
        }
        if (iOrdinal == 3) {
            return new ColorLyricsResponse();
        }
        if (iOrdinal == 4) {
            return new C0865a(DEFAULT_INSTANCE);
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
        synchronized (ColorLyricsResponse.class) {
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
    public final ColorData m13330n() {
        ColorData colorData = this.colors_;
        return colorData == null ? ColorData.m13333o() : colorData;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13331o() {
        return this.hasVocalRemoval_;
    }

    /* JADX INFO: renamed from: p */
    public final LyricsResponse m13332p() {
        LyricsResponse lyricsResponse = this.lyrics_;
        return lyricsResponse == null ? LyricsResponse.m13337p() : lyricsResponse;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
