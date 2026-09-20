package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class OgMusic extends AbstractC0269h implements sre0 {
    private static final OgMusic DEFAULT_INSTANCE;
    public static final int MUSIC_ALBUM_FIELD_NUMBER = 3;
    public static final int MUSIC_DURATION_FIELD_NUMBER = 2;
    public static final int MUSIC_RELEASE_DATE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String musicReleaseDate_ = "";
    private String musicDuration_ = "";
    private String musicAlbum_ = "";

    static {
        OgMusic ogMusic = new OgMusic();
        DEFAULT_INSTANCE = ogMusic;
        AbstractC0269h.registerDefaultInstance(OgMusic.class, ogMusic);
    }

    private OgMusic() {
    }

    /* JADX INFO: renamed from: n */
    public static OgMusic m21025n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"musicReleaseDate_", "musicDuration_", "musicAlbum_"});
        }
        if (iOrdinal == 3) {
            return new OgMusic();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 29);
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
        synchronized (OgMusic.class) {
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
    public final String m21026o() {
        return this.musicAlbum_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21027p() {
        return this.musicDuration_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21028q() {
        return this.musicReleaseDate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
