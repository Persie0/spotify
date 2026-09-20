package com.spotify.fandomcollectibles.protos;

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
    public static final int BOX_REVEAL_STORY_FIELD_NUMBER = 19;
    private static final Story DEFAULT_INSTANCE;
    public static final int ENTITY_BUTTON_STORY_FIELD_NUMBER = 17;
    public static final int ENTITY_LIST_STORY_FIELD_NUMBER = 13;
    public static final int FAN_STAMP_CARD_STORY_FIELD_NUMBER = 18;
    public static final int FREE_ACHIEVEMENT_CARD_STORY_FIELD_NUMBER = 15;
    public static final int GLOBE_STORY_FIELD_NUMBER = 12;
    public static final int IMAGE_TITLE_SUBTITLE_STORY_FIELD_NUMBER = 11;
    public static final int INTRO_STORY_FIELD_NUMBER = 5;
    public static final int LISTENING_PARTY_CARD_STORY_FIELD_NUMBER = 14;
    public static final int LOTTIE_STORY_FIELD_NUMBER = 9;
    public static final int MEDIA_ACHIEVEMENT_CARD_STORY_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int SINGLE_ENTITY_STORY_FIELD_NUMBER = 16;
    public static final int TITLE_STORY_FIELD_NUMBER = 8;
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

    /* JADX INFO: renamed from: A */
    public final TitleStory m10936A() {
        return this.storyCase_ == 8 ? (TitleStory) this.story_ : TitleStory.m10953p();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0005\u0013\r\u0000\u0000\u0000\u0005<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000", new Object[]{"story_", "storyCase_", IntroStory.class, TitleStory.class, LottieStory.class, MediaAchievementCardStory.class, ImageTitleSubtitleStory.class, GlobeStory.class, EntityListStory.class, ListeningPartyCardStory.class, FreeAchievementCardStory.class, SingleEntityStory.class, EntityButtonStory.class, FanStampCardStory.class, BoxRevealStory.class});
        }
        if (iOrdinal == 3) {
            return new Story();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 23);
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
    public final BoxRevealStory m10937n() {
        return this.storyCase_ == 19 ? (BoxRevealStory) this.story_ : BoxRevealStory.m10800p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EntityButtonStory m10938o() {
        return this.storyCase_ == 17 ? (EntityButtonStory) this.story_ : EntityButtonStory.m10806q();
    }

    /* JADX INFO: renamed from: p */
    public final EntityListStory m10939p() {
        return this.storyCase_ == 13 ? (EntityListStory) this.story_ : EntityListStory.m10817p();
    }

    /* JADX INFO: renamed from: q */
    public final FanStampCardStory m10940q() {
        return this.storyCase_ == 18 ? (FanStampCardStory) this.story_ : FanStampCardStory.m10823s();
    }

    /* JADX INFO: renamed from: r */
    public final FreeAchievementCardStory m10941r() {
        return this.storyCase_ == 15 ? (FreeAchievementCardStory) this.story_ : FreeAchievementCardStory.m10837w();
    }

    /* JADX INFO: renamed from: s */
    public final GlobeStory m10942s() {
        return this.storyCase_ == 12 ? (GlobeStory) this.story_ : GlobeStory.m10866p();
    }

    /* JADX INFO: renamed from: t */
    public final ImageTitleSubtitleStory m10943t() {
        return this.storyCase_ == 11 ? (ImageTitleSubtitleStory) this.story_ : ImageTitleSubtitleStory.m10873p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final IntroStory m10944u() {
        return this.storyCase_ == 5 ? (IntroStory) this.story_ : IntroStory.m10879p();
    }

    /* JADX INFO: renamed from: v */
    public final ListeningPartyCardStory m10945v() {
        return this.storyCase_ == 14 ? (ListeningPartyCardStory) this.story_ : ListeningPartyCardStory.m10888v();
    }

    /* JADX INFO: renamed from: w */
    public final LottieStory m10946w() {
        return this.storyCase_ == 9 ? (LottieStory) this.story_ : LottieStory.m10904o();
    }

    /* JADX INFO: renamed from: x */
    public final MediaAchievementCardStory m10947x() {
        return this.storyCase_ == 10 ? (MediaAchievementCardStory) this.story_ : MediaAchievementCardStory.m10908y();
    }

    /* JADX INFO: renamed from: y */
    public final SingleEntityStory m10948y() {
        return this.storyCase_ == 16 ? (SingleEntityStory) this.story_ : SingleEntityStory.m10930p();
    }

    /* JADX INFO: renamed from: z */
    public final int m10949z() {
        int i = this.storyCase_;
        if (i == 0) {
            return 14;
        }
        if (i == 5) {
            return 1;
        }
        switch (i) {
            case 8:
                return 2;
            case 9:
                return 3;
            case 10:
                return 4;
            case 11:
                return 5;
            case 12:
                return 6;
            case 13:
                return 7;
            case 14:
                return 8;
            case 15:
                return 9;
            case 16:
                return 10;
            case 17:
                return 11;
            case 18:
                return 12;
            case 19:
                return 13;
            default:
                return 0;
        }
    }
}
