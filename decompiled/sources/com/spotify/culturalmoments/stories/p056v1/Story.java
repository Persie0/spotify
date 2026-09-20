package com.spotify.culturalmoments.stories.p056v1;

import com.google.protobuf.AbstractC0269h;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Story extends AbstractC0269h implements sre0 {
    private static final Story DEFAULT_INSTANCE;
    public static final int FEATURED_CARD_STORY_FIELD_NUMBER = 2;
    public static final int FULLSCREEN_VIDEO_STORY_FIELD_NUMBER = 3;
    public static final int IMAGE_ON_IMAGE_STORY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_STORY_FIELD_NUMBER = 4;
    private int storyCase_ = 0;
    private Object story_;

    static {
        Story story = new Story();
        DEFAULT_INSTANCE = story;
        AbstractC0269h.registerDefaultInstance(Story.class, story);
    }

    private Story() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"story_", "storyCase_", ImageOnImageStory.class, FeaturedCardStory.class, FullscreenVideoStory.class, PlaylistStory.class});
        }
        if (iOrdinal == 3) {
            return new Story();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 24);
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
        synchronized (Story.class) {
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
    public final FeaturedCardStory m9095n() {
        return this.storyCase_ == 2 ? (FeaturedCardStory) this.story_ : FeaturedCardStory.m9065q();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final FullscreenVideoStory m9096o() {
        return this.storyCase_ == 3 ? (FullscreenVideoStory) this.story_ : FullscreenVideoStory.m9076o();
    }

    /* JADX INFO: renamed from: p */
    public final ImageOnImageStory m9097p() {
        return this.storyCase_ == 1 ? (ImageOnImageStory) this.story_ : ImageOnImageStory.m9083p();
    }

    /* JADX INFO: renamed from: q */
    public final PlaylistStory m9098q() {
        return this.storyCase_ == 4 ? (PlaylistStory) this.story_ : PlaylistStory.m9087q();
    }

    /* JADX INFO: renamed from: r */
    public final int m9099r() {
        int i = this.storyCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
