package com.spotify.culturalmoments.stories.p056v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class FullscreenVideoStory extends AbstractC0269h implements sre0 {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final FullscreenVideoStory DEFAULT_INSTANCE;
    public static final int MANIFEST_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_ERROR_CONFIGURATION_FIELD_NUMBER = 3;
    private BaseStory base_;
    private int bitField0_;
    private String manifestId_ = "";
    private VideoErrorConfiguration videoErrorConfiguration_;

    static {
        FullscreenVideoStory fullscreenVideoStory = new FullscreenVideoStory();
        DEFAULT_INSTANCE = fullscreenVideoStory;
        AbstractC0269h.registerDefaultInstance(FullscreenVideoStory.class, fullscreenVideoStory);
    }

    private FullscreenVideoStory() {
    }

    /* JADX INFO: renamed from: o */
    public static FullscreenVideoStory m9076o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001", new Object[]{"bitField0_", "base_", "manifestId_", "videoErrorConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new FullscreenVideoStory();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 3);
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
        synchronized (FullscreenVideoStory.class) {
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

    public final String getManifestId() {
        return this.manifestId_;
    }

    /* JADX INFO: renamed from: n */
    public final BaseStory m9077n() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m9056p() : baseStory;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final VideoErrorConfiguration m9078p() {
        VideoErrorConfiguration videoErrorConfiguration = this.videoErrorConfiguration_;
        return videoErrorConfiguration == null ? VideoErrorConfiguration.m9103p() : videoErrorConfiguration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
