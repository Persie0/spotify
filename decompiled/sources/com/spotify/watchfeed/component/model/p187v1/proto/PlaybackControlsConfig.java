package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bvo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PlaybackControlsConfig extends AbstractC0269h implements sre0 {
    private static final PlaybackControlsConfig DEFAULT_INSTANCE;
    public static final int IS_FAST_FORWARD_ENABLED_FIELD_NUMBER = 1;
    public static final int IS_PAUSE_ENABLED_FIELD_NUMBER = 3;
    public static final int IS_PROGRESS_BAR_SCRUB_ENABLED_FIELD_NUMBER = 4;
    public static final int IS_SKIP_ENABLED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private boolean isFastForwardEnabled_;
    private boolean isPauseEnabled_;
    private boolean isProgressBarScrubEnabled_;
    private boolean isSkipEnabled_;

    static {
        PlaybackControlsConfig playbackControlsConfig = new PlaybackControlsConfig();
        DEFAULT_INSTANCE = playbackControlsConfig;
        AbstractC0269h.registerDefaultInstance(PlaybackControlsConfig.class, playbackControlsConfig);
    }

    private PlaybackControlsConfig() {
    }

    /* JADX INFO: renamed from: n */
    public static PlaybackControlsConfig m22906n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"isFastForwardEnabled_", "isSkipEnabled_", "isPauseEnabled_", "isProgressBarScrubEnabled_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackControlsConfig();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 2);
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
        synchronized (PlaybackControlsConfig.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m22907o() {
        return this.isFastForwardEnabled_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22908p() {
        return this.isPauseEnabled_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22909q() {
        return this.isProgressBarScrubEnabled_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22910r() {
        return this.isSkipEnabled_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
