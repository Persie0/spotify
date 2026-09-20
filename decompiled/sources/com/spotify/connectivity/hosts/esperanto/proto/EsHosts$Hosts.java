package com.spotify.connectivity.hosts.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsHosts$Hosts extends AbstractC0269h implements sre0 {
    public static final int BACKENDRPCHOST_FIELD_NUMBER = 2;
    public static final int BACKENDSTREAMINGHOST_FIELD_NUMBER = 1;
    private static final EsHosts$Hosts DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String backendStreamingHost_ = "";
    private String backendRpcHost_ = "";

    static {
        EsHosts$Hosts esHosts$Hosts = new EsHosts$Hosts();
        DEFAULT_INSTANCE = esHosts$Hosts;
        AbstractC0269h.registerDefaultInstance(EsHosts$Hosts.class, esHosts$Hosts);
    }

    private EsHosts$Hosts() {
    }

    /* JADX INFO: renamed from: o */
    public static EsHosts$Hosts m7516o(byte[] bArr) {
        return (EsHosts$Hosts) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"backendStreamingHost_", "backendRpcHost_"});
        }
        if (iOrdinal == 3) {
            return new EsHosts$Hosts();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 13);
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
        synchronized (EsHosts$Hosts.class) {
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
    public final String m7517n() {
        return this.backendRpcHost_;
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
