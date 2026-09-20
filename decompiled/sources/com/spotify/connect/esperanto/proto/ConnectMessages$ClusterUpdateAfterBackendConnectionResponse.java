package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectMessages$ClusterUpdateAfterBackendConnectionResponse extends AbstractC0269h implements sre0 {
    private static final ConnectMessages$ClusterUpdateAfterBackendConnectionResponse DEFAULT_INSTANCE;

    /* JADX INFO: renamed from: HAS_RECEIVED_CLUSTER_UPDATE_AFTER_BACKEND_CONNECTION_FIELD_NUMBER */
    public static final int f3426x61d26ea9 = 1;
    private static volatile r2n0 PARSER;
    private boolean hasReceivedClusterUpdateAfterBackendConnection_;

    static {
        ConnectMessages$ClusterUpdateAfterBackendConnectionResponse connectMessages$ClusterUpdateAfterBackendConnectionResponse = new ConnectMessages$ClusterUpdateAfterBackendConnectionResponse();
        DEFAULT_INSTANCE = connectMessages$ClusterUpdateAfterBackendConnectionResponse;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$ClusterUpdateAfterBackendConnectionResponse.class, connectMessages$ClusterUpdateAfterBackendConnectionResponse);
    }

    private ConnectMessages$ClusterUpdateAfterBackendConnectionResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static ConnectMessages$ClusterUpdateAfterBackendConnectionResponse m7310p(byte[] bArr) {
        return (ConnectMessages$ClusterUpdateAfterBackendConnectionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"hasReceivedClusterUpdateAfterBackendConnection_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$ClusterUpdateAfterBackendConnectionResponse();
        }
        if (iOrdinal == 4) {
            return new nuh(12);
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
        synchronized (ConnectMessages$ClusterUpdateAfterBackendConnectionResponse.class) {
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
    public final boolean m7311o() {
        return this.hasReceivedClusterUpdateAfterBackendConnection_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
