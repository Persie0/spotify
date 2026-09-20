package com.spotify.agentstories.p017v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.fe51;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class StoryFrame extends AbstractC0269h implements sre0 {
    private static final StoryFrame DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REC_URIS_FIELD_NUMBER = 3;
    public static final int SOURCES_FIELD_NUMBER = 4;
    public static final int STORY_ID_FIELD_NUMBER = 1;
    public static final int STORY_TYPE_FIELD_NUMBER = 7;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int storyType_;
    private String storyId_ = "";
    private String text_ = "";
    private ae50 recUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 sources_ = AbstractC0269h.emptyProtobufList();

    static {
        StoryFrame storyFrame = new StoryFrame();
        DEFAULT_INSTANCE = storyFrame;
        AbstractC0269h.registerDefaultInstance(StoryFrame.class, storyFrame);
    }

    private StoryFrame() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004\u001b\u0007\f", new Object[]{"storyId_", "text_", "recUris_", "sources_", StorySource.class, "storyType_"});
        }
        if (iOrdinal == 3) {
            return new StoryFrame();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 25);
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
        synchronized (StoryFrame.class) {
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
    public final ae50 m3022n() {
        return this.recUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m3023o() {
        return this.sources_;
    }

    /* JADX INFO: renamed from: p */
    public final String m3024p() {
        return this.storyId_;
    }

    /* JADX INFO: renamed from: q */
    public final fe51 m3025q() {
        fe51 fe51Var;
        int i = this.storyType_;
        if (i == 0) {
            fe51Var = fe51.STORY_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            fe51Var = i != 2 ? null : fe51.STORY_TYPE_TIMELY;
        } else {
            fe51Var = fe51.STORY_TYPE_EVERGREEN;
        }
        return fe51Var == null ? fe51.UNRECOGNIZED : fe51Var;
    }

    /* JADX INFO: renamed from: r */
    public final String m3026r() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
