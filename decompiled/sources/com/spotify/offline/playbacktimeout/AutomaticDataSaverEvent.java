package com.spotify.offline.playbacktimeout;

import com.google.protobuf.AbstractC0269h;
import p204p.n68;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class AutomaticDataSaverEvent extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_QUALITY_FIELD_NUMBER = 2;
    private static final AutomaticDataSaverEvent DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String connectionQuality_ = "";
    private boolean enabled_;

    static {
        AutomaticDataSaverEvent automaticDataSaverEvent = new AutomaticDataSaverEvent();
        DEFAULT_INSTANCE = automaticDataSaverEvent;
        AbstractC0269h.registerDefaultInstance(AutomaticDataSaverEvent.class, automaticDataSaverEvent);
    }

    private AutomaticDataSaverEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16072n(AutomaticDataSaverEvent automaticDataSaverEvent, String str) {
        automaticDataSaverEvent.getClass();
        automaticDataSaverEvent.bitField0_ |= 2;
        automaticDataSaverEvent.connectionQuality_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16073o(AutomaticDataSaverEvent automaticDataSaverEvent, boolean z) {
        automaticDataSaverEvent.bitField0_ |= 1;
        automaticDataSaverEvent.enabled_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static n68 m16074p() {
        return (n68) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "enabled_", "connectionQuality_"});
        }
        if (iOrdinal == 3) {
            return new AutomaticDataSaverEvent();
        }
        if (iOrdinal == 4) {
            return new n68(DEFAULT_INSTANCE);
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
        synchronized (AutomaticDataSaverEvent.class) {
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
