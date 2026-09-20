package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fok0;
import p204p.gok0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservationPlatformProto$Event extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 4;
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final ObservationPlatformProto$Event DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_US_FIELD_NUMBER = 3;
    private ihc0 attributes_ = ihc0.f102235b;
    private String category_ = "";
    private String name_ = "";
    private long timestampUs_;

    static {
        ObservationPlatformProto$Event observationPlatformProto$Event = new ObservationPlatformProto$Event();
        DEFAULT_INSTANCE = observationPlatformProto$Event;
        AbstractC0269h.registerDefaultInstance(ObservationPlatformProto$Event.class, observationPlatformProto$Event);
    }

    private ObservationPlatformProto$Event() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m17320n(ObservationPlatformProto$Event observationPlatformProto$Event) {
        ihc0 ihc0Var = observationPlatformProto$Event.attributes_;
        if (!ihc0Var.f102236a) {
            observationPlatformProto$Event.attributes_ = ihc0Var.m50613h();
        }
        return observationPlatformProto$Event.attributes_;
    }

    /* JADX INFO: renamed from: o */
    public static void m17321o(ObservationPlatformProto$Event observationPlatformProto$Event, String str) {
        observationPlatformProto$Event.getClass();
        observationPlatformProto$Event.category_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17322p(ObservationPlatformProto$Event observationPlatformProto$Event, String str) {
        observationPlatformProto$Event.getClass();
        str.getClass();
        observationPlatformProto$Event.name_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17323q(ObservationPlatformProto$Event observationPlatformProto$Event, long j) {
        observationPlatformProto$Event.timestampUs_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static gok0 m17324r() {
        return (gok0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u00042", new Object[]{"category_", "name_", "timestampUs_", "attributes_", fok0.f71558a});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$Event();
        }
        if (iOrdinal == 4) {
            return new gok0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$Event.class) {
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
