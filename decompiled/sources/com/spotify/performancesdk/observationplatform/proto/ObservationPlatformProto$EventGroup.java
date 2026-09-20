package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.hok0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservationPlatformProto$EventGroup extends AbstractC0269h implements sre0 {
    private static final ObservationPlatformProto$EventGroup DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 events_ = AbstractC0269h.emptyProtobufList();

    static {
        ObservationPlatformProto$EventGroup observationPlatformProto$EventGroup = new ObservationPlatformProto$EventGroup();
        DEFAULT_INSTANCE = observationPlatformProto$EventGroup;
        AbstractC0269h.registerDefaultInstance(ObservationPlatformProto$EventGroup.class, observationPlatformProto$EventGroup);
    }

    private ObservationPlatformProto$EventGroup() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17325n(ObservationPlatformProto$EventGroup observationPlatformProto$EventGroup, ArrayList arrayList) {
        ae50 ae50Var = observationPlatformProto$EventGroup.events_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            observationPlatformProto$EventGroup.events_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, observationPlatformProto$EventGroup.events_);
    }

    /* JADX INFO: renamed from: o */
    public static hok0 m17326o() {
        return (hok0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"events_", ObservationPlatformProto$Event.class});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$EventGroup();
        }
        if (iOrdinal == 4) {
            return new hok0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$EventGroup.class) {
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
