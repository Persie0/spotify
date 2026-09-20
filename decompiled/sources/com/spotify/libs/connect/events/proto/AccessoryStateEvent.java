package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C2216oj;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessoryStateEvent extends AbstractC0269h implements sre0 {
    public static final int AUDIO_ROUTE_ID_FIELD_NUMBER = 4;
    public static final int AUDIO_ROUTE_TYPE_FIELD_NUMBER = 5;
    public static final int BLUETOOTH_MAC_ID_FIELD_NUMBER = 12;
    public static final int CHANGE_REASON_FIELD_NUMBER = 2;
    public static final int CHANGE_TIME_FIELD_NUMBER = 3;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 11;
    public static final int CURRENT_VOLUME_FIELD_NUMBER = 6;
    private static final AccessoryStateEvent DEFAULT_INSTANCE;
    public static final int EAM_ERROR_FIELD_NUMBER = 9;
    public static final int EAM_SEQUENCE_NUMBER_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 1;
    public static final int WAS_RESOLVED_BY_EAM_FIELD_NUMBER = 8;
    public static final int WILL_RESOLVE_BY_EAM_FIELD_NUMBER = 7;
    private int bitField0_;
    private float currentVolume_;
    private boolean eamError_;
    private int eamSequenceNumber_;
    private int sequenceNumber_;
    private boolean wasResolvedByEam_;
    private boolean willResolveByEam_;
    private String changeReason_ = "";
    private String changeTime_ = "";
    private String audioRouteId_ = "";
    private String audioRouteType_ = "";
    private String connectionType_ = "";
    private String bluetoothMacId_ = "";

    static {
        AccessoryStateEvent accessoryStateEvent = new AccessoryStateEvent();
        DEFAULT_INSTANCE = accessoryStateEvent;
        AbstractC0269h.registerDefaultInstance(AccessoryStateEvent.class, accessoryStateEvent);
    }

    private AccessoryStateEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12634n(AccessoryStateEvent accessoryStateEvent, String str) {
        accessoryStateEvent.getClass();
        str.getClass();
        accessoryStateEvent.bitField0_ |= 8;
        accessoryStateEvent.audioRouteId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12635o(AccessoryStateEvent accessoryStateEvent, String str) {
        accessoryStateEvent.getClass();
        str.getClass();
        accessoryStateEvent.bitField0_ |= 16;
        accessoryStateEvent.audioRouteType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12636p(AccessoryStateEvent accessoryStateEvent, String str) {
        accessoryStateEvent.getClass();
        accessoryStateEvent.bitField0_ |= 2048;
        accessoryStateEvent.bluetoothMacId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12637q(AccessoryStateEvent accessoryStateEvent, String str) {
        accessoryStateEvent.getClass();
        str.getClass();
        accessoryStateEvent.bitField0_ |= 2;
        accessoryStateEvent.changeReason_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12638r(AccessoryStateEvent accessoryStateEvent, String str) {
        accessoryStateEvent.getClass();
        str.getClass();
        accessoryStateEvent.bitField0_ |= 4;
        accessoryStateEvent.changeTime_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12639s(AccessoryStateEvent accessoryStateEvent, String str) {
        accessoryStateEvent.getClass();
        accessoryStateEvent.bitField0_ |= 1024;
        accessoryStateEvent.connectionType_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m12640t(AccessoryStateEvent accessoryStateEvent) {
        accessoryStateEvent.bitField0_ |= 32;
        accessoryStateEvent.currentVolume_ = -1.0f;
    }

    /* JADX INFO: renamed from: u */
    public static void m12641u(AccessoryStateEvent accessoryStateEvent) {
        accessoryStateEvent.bitField0_ |= 256;
        accessoryStateEvent.eamError_ = false;
    }

    /* JADX INFO: renamed from: v */
    public static void m12642v(AccessoryStateEvent accessoryStateEvent, int i) {
        accessoryStateEvent.bitField0_ |= 512;
        accessoryStateEvent.eamSequenceNumber_ = i;
    }

    /* JADX INFO: renamed from: w */
    public static void m12643w(AccessoryStateEvent accessoryStateEvent, int i) {
        accessoryStateEvent.bitField0_ |= 1;
        accessoryStateEvent.sequenceNumber_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m12644x(AccessoryStateEvent accessoryStateEvent, boolean z) {
        accessoryStateEvent.bitField0_ |= 128;
        accessoryStateEvent.wasResolvedByEam_ = z;
    }

    /* JADX INFO: renamed from: y */
    public static void m12645y(AccessoryStateEvent accessoryStateEvent, boolean z) {
        accessoryStateEvent.bitField0_ |= 64;
        accessoryStateEvent.willResolveByEam_ = z;
    }

    /* JADX INFO: renamed from: z */
    public static C2216oj m12646z() {
        return (C2216oj) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ခ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000bဈ\n\fဈ\u000b", new Object[]{"bitField0_", "sequenceNumber_", "changeReason_", "changeTime_", "audioRouteId_", "audioRouteType_", "currentVolume_", "willResolveByEam_", "wasResolvedByEam_", "eamError_", "eamSequenceNumber_", "connectionType_", "bluetoothMacId_"});
        }
        if (iOrdinal == 3) {
            return new AccessoryStateEvent();
        }
        if (iOrdinal == 4) {
            return new C2216oj(DEFAULT_INSTANCE);
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
        synchronized (AccessoryStateEvent.class) {
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
