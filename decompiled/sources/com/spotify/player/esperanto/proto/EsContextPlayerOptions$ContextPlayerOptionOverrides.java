package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.njw;
import p204p.ojw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsContextPlayerOptions$ContextPlayerOptionOverrides extends AbstractC0269h implements sre0 {
    private static final EsContextPlayerOptions$ContextPlayerOptionOverrides DEFAULT_INSTANCE;
    public static final int MODES_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 4;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER = 2;
    public static final int REPEATING_TRACK_FIELD_NUMBER = 3;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private ihc0 modes_ = ihc0.f102235b;
    private float playbackSpeed_;
    private EsOptional$OptionalBoolean repeatingContext_;
    private EsOptional$OptionalBoolean repeatingTrack_;
    private EsOptional$OptionalBoolean shufflingContext_;

    static {
        EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides = new EsContextPlayerOptions$ContextPlayerOptionOverrides();
        DEFAULT_INSTANCE = esContextPlayerOptions$ContextPlayerOptionOverrides;
        AbstractC0269h.registerDefaultInstance(EsContextPlayerOptions$ContextPlayerOptionOverrides.class, esContextPlayerOptions$ContextPlayerOptionOverrides);
    }

    private EsContextPlayerOptions$ContextPlayerOptionOverrides() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m17684n(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides) {
        ihc0 ihc0Var = esContextPlayerOptions$ContextPlayerOptionOverrides.modes_;
        if (!ihc0Var.f102236a) {
            esContextPlayerOptions$ContextPlayerOptionOverrides.modes_ = ihc0Var.m50613h();
        }
        return esContextPlayerOptions$ContextPlayerOptionOverrides.modes_;
    }

    /* JADX INFO: renamed from: o */
    public static void m17685o(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        esOptional$OptionalBoolean.getClass();
        esContextPlayerOptions$ContextPlayerOptionOverrides.repeatingContext_ = esOptional$OptionalBoolean;
        esContextPlayerOptions$ContextPlayerOptionOverrides.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m17686p(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        esOptional$OptionalBoolean.getClass();
        esContextPlayerOptions$ContextPlayerOptionOverrides.repeatingTrack_ = esOptional$OptionalBoolean;
        esContextPlayerOptions$ContextPlayerOptionOverrides.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17687q(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        esOptional$OptionalBoolean.getClass();
        esContextPlayerOptions$ContextPlayerOptionOverrides.shufflingContext_ = esOptional$OptionalBoolean;
        esContextPlayerOptions$ContextPlayerOptionOverrides.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static njw m17688r() {
        return (njw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u00052", new Object[]{"bitField0_", "shufflingContext_", "repeatingContext_", "repeatingTrack_", "playbackSpeed_", "modes_", ojw.f166151a});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerOptions$ContextPlayerOptionOverrides();
        }
        if (iOrdinal == 4) {
            return new njw(DEFAULT_INSTANCE);
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
        synchronized (EsContextPlayerOptions$ContextPlayerOptionOverrides.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
