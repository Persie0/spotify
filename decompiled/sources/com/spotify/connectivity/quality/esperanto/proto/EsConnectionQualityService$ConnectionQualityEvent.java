package com.spotify.connectivity.quality.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ejw;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsConnectionQualityService$ConnectionQualityEvent extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_QUALITY_FIELD_NUMBER = 1;
    private static final EsConnectionQualityService$ConnectionQualityEvent DEFAULT_INSTANCE;
    public static final int LAST_KNOWN_QUALITY_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int connectionQuality_;
    private int lastKnownQuality_;

    static {
        EsConnectionQualityService$ConnectionQualityEvent esConnectionQualityService$ConnectionQualityEvent = new EsConnectionQualityService$ConnectionQualityEvent();
        DEFAULT_INSTANCE = esConnectionQualityService$ConnectionQualityEvent;
        AbstractC0269h.registerDefaultInstance(EsConnectionQualityService$ConnectionQualityEvent.class, esConnectionQualityService$ConnectionQualityEvent);
    }

    private EsConnectionQualityService$ConnectionQualityEvent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsConnectionQualityService$ConnectionQualityEvent m7546q(byte[] bArr) {
        return (EsConnectionQualityService$ConnectionQualityEvent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"connectionQuality_", "lastKnownQuality_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionQualityService$ConnectionQualityEvent();
        }
        if (iOrdinal == 4) {
            return new iiw(27);
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
        synchronized (EsConnectionQualityService$ConnectionQualityEvent.class) {
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
    public final ejw m7547o() {
        ejw ejwVarM39240a = ejw.m39240a(this.connectionQuality_);
        return ejwVarM39240a == null ? ejw.UNRECOGNIZED : ejwVarM39240a;
    }

    /* JADX INFO: renamed from: p */
    public final ejw m7548p() {
        ejw ejwVarM39240a = ejw.m39240a(this.lastKnownQuality_);
        return ejwVarM39240a == null ? ejw.UNRECOGNIZED : ejwVarM39240a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
