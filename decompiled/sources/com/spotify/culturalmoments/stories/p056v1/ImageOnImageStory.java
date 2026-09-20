package com.spotify.culturalmoments.stories.p056v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r240;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageOnImageStory extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int BASE_FIELD_NUMBER = 1;
    private static final ImageOnImageStory DEFAULT_INSTANCE;
    public static final int FOREGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private BaseStory base_;
    private int bitField0_;
    private String backgroundImageUrl_ = "";
    private String foregroundImageUrl_ = "";

    static {
        ImageOnImageStory imageOnImageStory = new ImageOnImageStory();
        DEFAULT_INSTANCE = imageOnImageStory;
        AbstractC0269h.registerDefaultInstance(ImageOnImageStory.class, imageOnImageStory);
    }

    private ImageOnImageStory() {
    }

    /* JADX INFO: renamed from: p */
    public static ImageOnImageStory m9083p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "base_", "backgroundImageUrl_", "foregroundImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ImageOnImageStory();
        }
        if (iOrdinal == 4) {
            return new r240(DEFAULT_INSTANCE, 26);
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
        synchronized (ImageOnImageStory.class) {
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
    public final String m9084n() {
        return this.backgroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BaseStory m9085o() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m9056p() : baseStory;
    }

    /* JADX INFO: renamed from: q */
    public final String m9086q() {
        return this.foregroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
