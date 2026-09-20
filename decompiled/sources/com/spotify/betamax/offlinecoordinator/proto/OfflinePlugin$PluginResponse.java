package com.spotify.betamax.offlinecoordinator.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t0l0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class OfflinePlugin$PluginResponse extends AbstractC0269h implements sre0 {
    private static final OfflinePlugin$PluginResponse DEFAULT_INSTANCE;
    public static final int DOWNLOAD_FIELD_NUMBER = 3;
    public static final int IDENTIFY_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVE_FIELD_NUMBER = 4;
    public static final int STOP_DOWNLOAD_FIELD_NUMBER = 5;
    private Object response_;
    private int responseCase_ = 0;
    private String id_ = "";

    static {
        OfflinePlugin$PluginResponse offlinePlugin$PluginResponse = new OfflinePlugin$PluginResponse();
        DEFAULT_INSTANCE = offlinePlugin$PluginResponse;
        AbstractC0269h.registerDefaultInstance(OfflinePlugin$PluginResponse.class, offlinePlugin$PluginResponse);
    }

    private OfflinePlugin$PluginResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4008n(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse, OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse) {
        offlinePlugin$PluginResponse.getClass();
        offlinePlugin$DownloadResponse.getClass();
        offlinePlugin$PluginResponse.response_ = offlinePlugin$DownloadResponse;
        offlinePlugin$PluginResponse.responseCase_ = 3;
    }

    /* JADX INFO: renamed from: o */
    public static void m4009o(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse) {
        offlinePlugin$PluginResponse.getClass();
        offlinePlugin$PluginResponse.id_ = "betamax-offline";
    }

    /* JADX INFO: renamed from: p */
    public static void m4010p(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse, OfflinePlugin$IdentifyResponse offlinePlugin$IdentifyResponse) {
        offlinePlugin$PluginResponse.getClass();
        offlinePlugin$IdentifyResponse.getClass();
        offlinePlugin$PluginResponse.response_ = offlinePlugin$IdentifyResponse;
        offlinePlugin$PluginResponse.responseCase_ = 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static t0l0 m4012r() {
        return (t0l0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"response_", "responseCase_", "id_", OfflinePlugin$IdentifyResponse.class, OfflinePlugin$DownloadResponse.class, OfflinePlugin$RemoveResponse.class, OfflinePlugin$StopDownloadResponse.class});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$PluginResponse();
        }
        if (iOrdinal == 4) {
            return new t0l0();
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
        synchronized (OfflinePlugin$PluginResponse.class) {
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
