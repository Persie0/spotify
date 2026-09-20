package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ct31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class SoundEffect extends AbstractC0269h implements sre0 {
    private static final SoundEffect DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RANDOM_SELECTION_FIELD_NUMBER = 3;
    public static final int URLS_FIELD_NUMBER = 1;
    public static final int VOLUME_FIELD_NUMBER = 2;
    private int delayMs_;
    private boolean randomSelection_;
    private ae50 urls_ = AbstractC0269h.emptyProtobufList();
    private int volume_;

    static {
        SoundEffect soundEffect = new SoundEffect();
        DEFAULT_INSTANCE = soundEffect;
        AbstractC0269h.registerDefaultInstance(SoundEffect.class, soundEffect);
    }

    private SoundEffect() {
    }

    /* JADX INFO: renamed from: n */
    public static SoundEffect m15931n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ț\u0002\u0004\u0003\u0007\u0004\u0004", new Object[]{"urls_", "volume_", "randomSelection_", "delayMs_"});
        }
        if (iOrdinal == 3) {
            return new SoundEffect();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 2);
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
        synchronized (SoundEffect.class) {
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
    public final int m15932o() {
        return this.delayMs_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15933p() {
        return this.randomSelection_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m15934q() {
        return this.urls_;
    }

    /* JADX INFO: renamed from: r */
    public final int m15935r() {
        return this.volume_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
