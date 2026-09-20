package com.spotify.stickers.p160v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class LyricsSticker extends AbstractC0269h implements sre0 {
    private static final LyricsSticker DEFAULT_INSTANCE;
    public static final int LYRICS_TEXT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_PREVIEW_URL_FIELD_NUMBER = 3;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String lyricsText_ = "";
    private String trackUri_ = "";
    private String trackPreviewUrl_ = "";

    static {
        LyricsSticker lyricsSticker = new LyricsSticker();
        DEFAULT_INSTANCE = lyricsSticker;
        AbstractC0269h.registerDefaultInstance(LyricsSticker.class, lyricsSticker);
    }

    private LyricsSticker() {
    }

    /* JADX INFO: renamed from: n */
    public static LyricsSticker m21587n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000", new Object[]{"bitField0_", "lyricsText_", "trackUri_", "trackPreviewUrl_"});
        }
        if (iOrdinal == 3) {
            return new LyricsSticker();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 10);
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
        synchronized (LyricsSticker.class) {
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
    public final String m21588o() {
        return this.lyricsText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21589p() {
        return this.trackPreviewUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21590q() {
        return this.trackUri_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m21591r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
