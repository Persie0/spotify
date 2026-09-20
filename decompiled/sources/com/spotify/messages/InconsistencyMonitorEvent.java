package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.mn40;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class InconsistencyMonitorEvent extends AbstractC0269h implements sre0 {
    public static final int ACTIVE_FIELD_NUMBER = 2;
    private static final InconsistencyMonitorEvent DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    private boolean active_;
    private int bitField0_;
    private String name_ = "";
    private String reason_ = "";

    static {
        InconsistencyMonitorEvent inconsistencyMonitorEvent = new InconsistencyMonitorEvent();
        DEFAULT_INSTANCE = inconsistencyMonitorEvent;
        AbstractC0269h.registerDefaultInstance(InconsistencyMonitorEvent.class, inconsistencyMonitorEvent);
    }

    private InconsistencyMonitorEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13912n(InconsistencyMonitorEvent inconsistencyMonitorEvent, boolean z) {
        inconsistencyMonitorEvent.bitField0_ |= 2;
        inconsistencyMonitorEvent.active_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m13913o(InconsistencyMonitorEvent inconsistencyMonitorEvent, String str) {
        inconsistencyMonitorEvent.getClass();
        str.getClass();
        inconsistencyMonitorEvent.bitField0_ |= 1;
        inconsistencyMonitorEvent.name_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13914p(InconsistencyMonitorEvent inconsistencyMonitorEvent, String str) {
        inconsistencyMonitorEvent.getClass();
        str.getClass();
        inconsistencyMonitorEvent.bitField0_ |= 4;
        inconsistencyMonitorEvent.reason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mn40 m13915q() {
        return (mn40) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "name_", "active_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new InconsistencyMonitorEvent();
        }
        if (iOrdinal == 4) {
            return new mn40(DEFAULT_INSTANCE);
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
        synchronized (InconsistencyMonitorEvent.class) {
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
