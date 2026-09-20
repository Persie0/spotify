package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.nnk0;
import p204p.onk0;
import p204p.ore0;
import p204p.pnk0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservationEventNonAuth extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 7;
    public static final int CONFIG_NAME_FIELD_NUMBER = 8;
    private static final ObservationEventNonAuth DEFAULT_INSTANCE;
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
        ObservationEventNonAuth observationEventNonAuth = new ObservationEventNonAuth();
        DEFAULT_INSTANCE = observationEventNonAuth;
        AbstractC0269h.registerDefaultInstance(ObservationEventNonAuth.class, observationEventNonAuth);
    }

    private ObservationEventNonAuth() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.signals_ = ihc0Var;
        this.attributes_ = ihc0Var;
        this.observationId_ = "";
        this.scenarioKey_ = "";
        this.configName_ = "";
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m14260n(ObservationEventNonAuth observationEventNonAuth) {
        ihc0 ihc0Var = observationEventNonAuth.attributes_;
        if (!ihc0Var.f102236a) {
            observationEventNonAuth.attributes_ = ihc0Var.m50613h();
        }
        return observationEventNonAuth.attributes_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m14261o(ObservationEventNonAuth observationEventNonAuth) {
        ihc0 ihc0Var = observationEventNonAuth.signals_;
        if (!ihc0Var.f102236a) {
            observationEventNonAuth.signals_ = ihc0Var.m50613h();
        }
        return observationEventNonAuth.signals_;
    }

    /* JADX INFO: renamed from: p */
    public static void m14262p(ObservationEventNonAuth observationEventNonAuth, String str) {
        observationEventNonAuth.getClass();
        str.getClass();
        observationEventNonAuth.bitField0_ |= 32;
        observationEventNonAuth.configName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14263q(ObservationEventNonAuth observationEventNonAuth, long j) {
        observationEventNonAuth.bitField0_ |= 16;
        observationEventNonAuth.duration_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m14264r(ObservationEventNonAuth observationEventNonAuth, String str) {
        observationEventNonAuth.getClass();
        str.getClass();
        observationEventNonAuth.bitField0_ |= 1;
        observationEventNonAuth.observationId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14265s(ObservationEventNonAuth observationEventNonAuth, String str) {
        observationEventNonAuth.getClass();
        str.getClass();
        observationEventNonAuth.bitField0_ |= 2;
        observationEventNonAuth.scenarioKey_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14266t(ObservationEventNonAuth observationEventNonAuth, long j) {
        observationEventNonAuth.bitField0_ |= 8;
        observationEventNonAuth.startMonotonic_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m14267u(ObservationEventNonAuth observationEventNonAuth, long j) {
        observationEventNonAuth.bitField0_ |= 4;
        observationEventNonAuth.startWallclock_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static onk0 m14268v() {
        return (onk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u00062\u00072\bဈ\u0005", new Object[]{"bitField0_", "observationId_", "scenarioKey_", "startWallclock_", "startMonotonic_", "duration_", "signals_", pnk0.f179431a, "attributes_", nnk0.f156440a, "configName_"});
        }
        if (iOrdinal == 3) {
            return new ObservationEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new onk0(DEFAULT_INSTANCE);
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
        synchronized (ObservationEventNonAuth.class) {
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
