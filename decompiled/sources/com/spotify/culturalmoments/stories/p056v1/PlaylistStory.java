package com.spotify.culturalmoments.stories.p056v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes6.dex */
public final class PlaylistStory extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 5;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int BUTTON_FIELD_NUMBER = 4;
    private static final PlaylistStory DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 2;
    private BaseStory base_;
    private int bitField0_;
    private Button button_;
    private Text title_;
    private String imageUrl_ = "";
    private String backgroundImageUrl_ = "";
    private String playlistUri_ = "";

    static {
        PlaylistStory playlistStory = new PlaylistStory();
        DEFAULT_INSTANCE = playlistStory;
        AbstractC0269h.registerDefaultInstance(PlaylistStory.class, playlistStory);
    }

    private PlaylistStory() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PlaylistStory m9087q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "base_", "title_", "imageUrl_", "button_", "backgroundImageUrl_", "playlistUri_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistStory();
        }
        if (iOrdinal == 4) {
            return new zmp0(DEFAULT_INSTANCE, 24);
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
        synchronized (PlaylistStory.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getPlaylistUri() {
        return this.playlistUri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m9088n() {
        return this.backgroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BaseStory m9089o() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m9056p() : baseStory;
    }

    /* JADX INFO: renamed from: p */
    public final Button m9090p() {
        Button button = this.button_;
        return button == null ? Button.m9061o() : button;
    }

    /* JADX INFO: renamed from: r */
    public final Text m9091r() {
        Text text = this.title_;
        return text == null ? Text.m9100n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
