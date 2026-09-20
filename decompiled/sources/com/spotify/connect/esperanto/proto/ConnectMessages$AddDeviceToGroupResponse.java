package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ati;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectMessages$AddDeviceToGroupResponse extends AbstractC0269h implements sre0 {
    private static final ConnectMessages$AddDeviceToGroupResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int error_;
    private boolean success_;

    static {
        ConnectMessages$AddDeviceToGroupResponse connectMessages$AddDeviceToGroupResponse = new ConnectMessages$AddDeviceToGroupResponse();
        DEFAULT_INSTANCE = connectMessages$AddDeviceToGroupResponse;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$AddDeviceToGroupResponse.class, connectMessages$AddDeviceToGroupResponse);
    }

    private ConnectMessages$AddDeviceToGroupResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static ConnectMessages$AddDeviceToGroupResponse m7306p(byte[] bArr) {
        return (ConnectMessages$AddDeviceToGroupResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ဌ\u0000", new Object[]{"bitField0_", "success_", "error_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$AddDeviceToGroupResponse();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 11);
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
        synchronized (ConnectMessages$AddDeviceToGroupResponse.class) {
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
    public final ati m7307n() {
        ati atiVar;
        int i = this.error_;
        if (i != 13) {
            switch (i) {
                case 0:
                    atiVar = ati.UNKNOWN_ERROR;
                    break;
                case 1:
                    atiVar = ati.TIMEOUT;
                    break;
                case 2:
                    atiVar = ati.INTERNAL;
                    break;
                case 3:
                    atiVar = ati.GROUP_DEVICE_NOT_FOUND;
                    break;
                case 4:
                    atiVar = ati.MAX_NUMBER_OF_DEVICES_REACHED;
                    break;
                case 5:
                    atiVar = ati.TARGET_NOT_FOUND;
                    break;
                case 6:
                    atiVar = ati.NOT_IMPLEMENTED;
                    break;
                default:
                    atiVar = null;
                    break;
            }
        } else {
            atiVar = ati.BUSY;
        }
        return atiVar == null ? ati.UNRECOGNIZED : atiVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7308o() {
        return this.success_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
