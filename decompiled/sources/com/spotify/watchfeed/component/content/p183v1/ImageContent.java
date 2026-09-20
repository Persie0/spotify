package com.spotify.watchfeed.component.content.p183v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.BackgroundAudioPreview;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r240;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageContent extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_AUDIO_PREVIEW_FIELD_NUMBER = 2;
    private static final ImageContent DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private BackgroundAudioPreview backgroundAudioPreview_;
    private int bitField0_;
    private Image image_;
    private boolean increaseVolumeGradually_;

    static {
        ImageContent imageContent = new ImageContent();
        DEFAULT_INSTANCE = imageContent;
        AbstractC0269h.registerDefaultInstance(ImageContent.class, imageContent);
    }

    private ImageContent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ImageContent m22516r(gva gvaVar) {
        return (ImageContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007", new Object[]{"bitField0_", "image_", "backgroundAudioPreview_", "increaseVolumeGradually_"});
        }
        if (iOrdinal == 3) {
            return new ImageContent();
        }
        if (iOrdinal == 4) {
            return new r240(DEFAULT_INSTANCE, 18);
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
        synchronized (ImageContent.class) {
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
    public final BackgroundAudioPreview m22517n() {
        BackgroundAudioPreview backgroundAudioPreview = this.backgroundAudioPreview_;
        return backgroundAudioPreview == null ? BackgroundAudioPreview.m22888o() : backgroundAudioPreview;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Image m22518o() {
        Image image = this.image_;
        return image == null ? Image.m22897n() : image;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22519p() {
        return this.increaseVolumeGradually_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22520q() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
