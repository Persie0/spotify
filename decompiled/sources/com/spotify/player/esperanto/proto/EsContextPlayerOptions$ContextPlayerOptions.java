package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.iiw;
import p204p.ore0;
import p204p.pjw;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsContextPlayerOptions$ContextPlayerOptions extends AbstractC0269h implements sre0 {
    private static final EsContextPlayerOptions$ContextPlayerOptions DEFAULT_INSTANCE;
    public static final int MODES_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 4;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER = 2;
    public static final int REPEATING_TRACK_FIELD_NUMBER = 3;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private ihc0 modes_ = ihc0.f102235b;
    private float playbackSpeed_;
    private boolean repeatingContext_;
    private boolean repeatingTrack_;
    private boolean shufflingContext_;

    static {
        EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions = new EsContextPlayerOptions$ContextPlayerOptions();
        DEFAULT_INSTANCE = esContextPlayerOptions$ContextPlayerOptions;
        AbstractC0269h.registerDefaultInstance(EsContextPlayerOptions$ContextPlayerOptions.class, esContextPlayerOptions$ContextPlayerOptions);
    }

    private EsContextPlayerOptions$ContextPlayerOptions() {
    }

    /* JADX INFO: renamed from: o */
    public static EsContextPlayerOptions$ContextPlayerOptions m17690o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004ခ\u0000\u00052", new Object[]{"bitField0_", "shufflingContext_", "repeatingContext_", "repeatingTrack_", "playbackSpeed_", "modes_", pjw.f178316a});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerOptions$ContextPlayerOptions();
        }
        if (iOrdinal == 4) {
            return new iiw(29);
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
        synchronized (EsContextPlayerOptions$ContextPlayerOptions.class) {
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

    /* JADX INFO: renamed from: p */
    public final Map m17691p() {
        return Collections.unmodifiableMap(this.modes_);
    }

    /* JADX INFO: renamed from: q */
    public final float m17692q() {
        return this.playbackSpeed_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17693r() {
        return this.repeatingContext_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m17694s() {
        return this.repeatingTrack_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17695t() {
        return this.shufflingContext_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
