package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.jnk0;
import p204p.knk0;
import p204p.lnk0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservationEvent extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 7;
    public static final int CONFIG_NAME_FIELD_NUMBER = 8;
    private static final ObservationEvent DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int OBSERVATION_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SCENARIO_KEY_FIELD_NUMBER = 2;
    public static final int SIGNALS_FIELD_NUMBER = 6;
    public static final int START_MONOTONIC_FIELD_NUMBER = 4;
    public static final int START_WALLCLOCK_FIELD_NUMBER = 3;
    private ihc0 attributes_;
    private int bitField0_;
    private String configName_;
    private long duration_;
    private String observationId_;
    private String scenarioKey_;
    private ihc0 signals_;
    private long startMonotonic_;
    private long startWallclock_;

    static {
        ObservationEvent observationEvent = new ObservationEvent();
        DEFAULT_INSTANCE = observationEvent;
        AbstractC0269h.registerDefaultInstance(ObservationEvent.class, observationEvent);
    }

    private ObservationEvent() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.signals_ = ihc0Var;
        this.attributes_ = ihc0Var;
        this.observationId_ = "";
        this.scenarioKey_ = "";
        this.configName_ = "";
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m14246n(ObservationEvent observationEvent) {
        ihc0 ihc0Var = observationEvent.attributes_;
        if (!ihc0Var.f102236a) {
            observationEvent.attributes_ = ihc0Var.m50613h();
        }
        return observationEvent.attributes_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m14247o(ObservationEvent observationEvent) {
        ihc0 ihc0Var = observationEvent.signals_;
        if (!ihc0Var.f102236a) {
            observationEvent.signals_ = ihc0Var.m50613h();
        }
        return observationEvent.signals_;
    }

    /* JADX INFO: renamed from: p */
    public static void m14248p(ObservationEvent observationEvent, String str) {
        observationEvent.getClass();
        str.getClass();
        observationEvent.bitField0_ |= 32;
        observationEvent.configName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14249q(ObservationEvent observationEvent, long j) {
        observationEvent.bitField0_ |= 16;
        observationEvent.duration_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m14250r(ObservationEvent observationEvent, String str) {
        observationEvent.getClass();
        str.getClass();
        observationEvent.bitField0_ |= 1;
        observationEvent.observationId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14251s(ObservationEvent observationEvent, String str) {
        observationEvent.getClass();
        str.getClass();
        observationEvent.bitField0_ |= 2;
        observationEvent.scenarioKey_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14252t(ObservationEvent observationEvent, long j) {
        observationEvent.bitField0_ |= 8;
        observationEvent.startMonotonic_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m14253u(ObservationEvent observationEvent, long j) {
        observationEvent.bitField0_ |= 4;
        observationEvent.startWallclock_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static knk0 m14254v() {
        return (knk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u00062\u00072\bဈ\u0005", new Object[]{"bitField0_", "observationId_", "scenarioKey_", "startWallclock_", "startMonotonic_", "duration_", "signals_", lnk0.f135176a, "attributes_", jnk0.f114127a, "configName_"});
        }
        if (iOrdinal == 3) {
            return new ObservationEvent();
        }
        if (iOrdinal == 4) {
            return new knk0(DEFAULT_INSTANCE);
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
        synchronized (ObservationEvent.class) {
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
