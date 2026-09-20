package com.spotify.watchfeed.component.content.p183v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.BackgroundAudioPreview;
import p204p.ae50;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class LinearGradientContent extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_AUDIO_PREVIEW_FIELD_NUMBER = 2;
    public static final int COLORS_FIELD_NUMBER = 1;
    private static final LinearGradientContent DEFAULT_INSTANCE;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private BackgroundAudioPreview backgroundAudioPreview_;
    private int bitField0_;
    private ae50 colors_ = AbstractC0269h.emptyProtobufList();
    private boolean increaseVolumeGradually_;

    static {
        LinearGradientContent linearGradientContent = new LinearGradientContent();
        DEFAULT_INSTANCE = linearGradientContent;
        AbstractC0269h.registerDefaultInstance(LinearGradientContent.class, linearGradientContent);
    }

    private LinearGradientContent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static LinearGradientContent m22521r(gva gvaVar) {
        return (LinearGradientContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0000\u0003\u0007", new Object[]{"bitField0_", "colors_", "backgroundAudioPreview_", "increaseVolumeGradually_"});
        }
        if (iOrdinal == 3) {
            return new LinearGradientContent();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 1);
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
        synchronized (LinearGradientContent.class) {
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
    public final BackgroundAudioPreview m22522n() {
        BackgroundAudioPreview backgroundAudioPreview = this.backgroundAudioPreview_;
        return backgroundAudioPreview == null ? BackgroundAudioPreview.m22888o() : backgroundAudioPreview;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m22523o() {
        return this.colors_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22524p() {
        return this.increaseVolumeGradually_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22525q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
