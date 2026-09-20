package com.spotify.homeagent.p079v1;

import com.google.protobuf.AbstractC0269h;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class WorldSection extends AbstractC0269h implements sre0 {
    private static final WorldSection DEFAULT_INSTANCE;
    public static final int MULTI_ITEM_BASIC_FIELD_NUMBER = 1;
    public static final int MULTI_ITEM_CONCERT_FIELD_NUMBER = 7;
    public static final int MULTI_ITEM_GRID_FIELD_NUMBER = 9;
    public static final int MULTI_ITEM_VERTICAL_LIST_FIELD_NUMBER = 2;
    public static final int MULTI_ITEM_VIDEO_MUSIC_FIELD_NUMBER = 3;
    public static final int MULTI_ITEM_VIDEO_PODCAST_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SINGLE_ITEM_CONCERT_FIELD_NUMBER = 8;
    public static final int SINGLE_ITEM_PREVIEWABLE_AUDIO_FIELD_NUMBER = 5;
    public static final int SINGLE_ITEM_PREVIEWABLE_VIDEO_FIELD_NUMBER = 6;
    public static final int USER_PROMPT_ENTRY_FIELD_NUMBER = 10;
    private int sectionTypeCase_ = 0;
    private Object sectionType_;

    static {
        WorldSection worldSection = new WorldSection();
        DEFAULT_INSTANCE = worldSection;
        AbstractC0269h.registerDefaultInstance(WorldSection.class, worldSection);
    }

    private WorldSection() {
    }

    /* JADX INFO: renamed from: p */
    public static WorldSection m11856p(byte[] bArr) {
        return (WorldSection) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"sectionType_", "sectionTypeCase_", MultiItemBasic.class, MultiItemVerticalList.class, MultiItemVideoMusic.class, MultiItemVideoPodcast.class, SingleItemPreviewableAudio.class, SingleItemPreviewableVideo.class, MultiItemConcert.class, SingleItemConcert.class, MultiItemGrid.class, UserPromptEntry.class});
        }
        if (iOrdinal == 3) {
            return new WorldSection();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 29);
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
        synchronized (WorldSection.class) {
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
    public final int m11857n() {
        switch (this.sectionTypeCase_) {
            case 0:
                return 11;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final UserPromptEntry m11858o() {
        return this.sectionTypeCase_ == 10 ? (UserPromptEntry) this.sectionType_ : UserPromptEntry.m11843n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
