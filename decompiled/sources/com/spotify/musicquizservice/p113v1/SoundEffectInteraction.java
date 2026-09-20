package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ct31;
import p204p.ore0;
import p204p.p850;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class SoundEffectInteraction extends AbstractC0269h implements sre0 {
    private static final SoundEffectInteraction DEFAULT_INSTANCE;
    public static final int INTERACTION_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SOUND_EFFECT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int interactionType_;
    private SoundEffect soundEffect_;

    static {
        SoundEffectInteraction soundEffectInteraction = new SoundEffectInteraction();
        DEFAULT_INSTANCE = soundEffectInteraction;
        AbstractC0269h.registerDefaultInstance(SoundEffectInteraction.class, soundEffectInteraction);
    }

    private SoundEffectInteraction() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "interactionType_", "soundEffect_"});
        }
        if (iOrdinal == 3) {
            return new SoundEffectInteraction();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 3);
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
        synchronized (SoundEffectInteraction.class) {
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
    public final p850 m15936n() {
        p850 p850Var;
        switch (this.interactionType_) {
            case 0:
                p850Var = p850.INTERACTION_TYPE_UNSPECIFIED;
                break;
            case 1:
                p850Var = p850.ANSWER_BUTTON_ENTRY;
                break;
            case 2:
                p850Var = p850.TIMER_ENTRY;
                break;
            case 3:
                p850Var = p850.BUTTON_TAP;
                break;
            case 4:
                p850Var = p850.CORRECT_ANSWER;
                break;
            case 5:
                p850Var = p850.INCORRECT_ANSWER;
                break;
            case 6:
                p850Var = p850.NEXT_BUTTON;
                break;
            case 7:
                p850Var = p850.QUIZ_COMPLETE;
                break;
            default:
                p850Var = null;
                break;
        }
        return p850Var == null ? p850.UNRECOGNIZED : p850Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final SoundEffect m15937o() {
        SoundEffect soundEffect = this.soundEffect_;
        return soundEffect == null ? SoundEffect.m15931n() : soundEffect;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
