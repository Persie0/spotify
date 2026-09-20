package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.hje;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ClientAuthEventRequest extends AbstractC0269h implements sre0 {
    public static final int ANALYTICS_ID_FIELD_NUMBER = 3;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final ClientAuthEventRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String clientId_ = "";
    private String redirectUri_ = "";
    private String analyticsId_ = "";

    static {
        ClientAuthEventRequest clientAuthEventRequest = new ClientAuthEventRequest();
        DEFAULT_INSTANCE = clientAuthEventRequest;
        AbstractC0269h.registerDefaultInstance(ClientAuthEventRequest.class, clientAuthEventRequest);
    }

    private ClientAuthEventRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13726n(ClientAuthEventRequest clientAuthEventRequest, String str) {
        clientAuthEventRequest.getClass();
        clientAuthEventRequest.bitField0_ |= 4;
        clientAuthEventRequest.analyticsId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13727o(ClientAuthEventRequest clientAuthEventRequest, String str) {
        clientAuthEventRequest.getClass();
        clientAuthEventRequest.bitField0_ |= 1;
        clientAuthEventRequest.clientId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static hje m13728p() {
        return (hje) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "clientId_", "redirectUri_", "analyticsId_"});
        }
        if (iOrdinal == 3) {
            return new ClientAuthEventRequest();
        }
        if (iOrdinal == 4) {
            return new hje(DEFAULT_INSTANCE);
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
        synchronized (ClientAuthEventRequest.class) {
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
