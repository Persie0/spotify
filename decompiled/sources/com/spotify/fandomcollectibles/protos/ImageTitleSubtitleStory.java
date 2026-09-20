package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageTitleSubtitleStory extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 5;
    public static final int BASE_FIELD_NUMBER = 1;
    private static final ImageTitleSubtitleStory DEFAULT_INSTANCE;
    public static final int MAIN_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private BaseStory base_;
    private int bitField0_;
    private Text subtitle_;
    private Text title_;
    private String mainImageUrl_ = "";
    private String backgroundImageUrl_ = "";

    static {
        ImageTitleSubtitleStory imageTitleSubtitleStory = new ImageTitleSubtitleStory();
        DEFAULT_INSTANCE = imageTitleSubtitleStory;
        AbstractC0269h.registerDefaultInstance(ImageTitleSubtitleStory.class, imageTitleSubtitleStory);
    }

    private ImageTitleSubtitleStory() {
    }

    /* JADX INFO: renamed from: p */
    public static ImageTitleSubtitleStory m10873p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "base_", "title_", "subtitle_", "mainImageUrl_", "backgroundImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ImageTitleSubtitleStory();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 0);
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
        synchronized (ImageTitleSubtitleStory.class) {
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
    public final String m10874n() {
        return this.backgroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BaseStory m10875o() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m10795q() : baseStory;
    }

    /* JADX INFO: renamed from: q */
    public final String m10876q() {
        return this.mainImageUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final Text m10877r() {
        Text text = this.subtitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: s */
    public final Text m10878s() {
        Text text = this.title_;
        return text == null ? Text.m10950n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
