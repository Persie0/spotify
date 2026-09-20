package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.jje;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ClientAuthEventStartNonAuth extends AbstractC0269h implements sre0 {
    public static final int APP_ID_FIELD_NUMBER = 6;
    public static final int ASSOCIATED_CONTENT_FIELD_NUMBER = 13;
    public static final int AUTH_ID_FIELD_NUMBER = 8;
    public static final int AUTH_SESSION_ID_FIELD_NUMBER = 9;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final ClientAuthEventStartNonAuth DEFAULT_INSTANCE;
    public static final int INTEGRATION_INITIATED_FIELD_NUMBER = 7;
    public static final int IS_OFFLINE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_URI_FIELD_NUMBER = 3;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 2;
    public static final int SCOPES_FIELD_NUMBER = 4;
    public static final int UTM_CAMPAIGN_FIELD_NUMBER = 10;
    public static final int UTM_MEDIUM_FIELD_NUMBER = 11;
    public static final int UTM_SOURCE_FIELD_NUMBER = 12;
    private int bitField0_;
    private boolean integrationInitiated_;
    private boolean isOffline_;
    private String clientId_ = "";
    private String responseType_ = "";
    private String redirectUri_ = "";
    private ae50 scopes_ = AbstractC0269h.emptyProtobufList();
    private String appId_ = "";
    private String authId_ = "";
    private String authSessionId_ = "";
    private String utmCampaign_ = "";
    private String utmMedium_ = "";
    private String utmSource_ = "";
    private String associatedContent_ = "";

    static {
        ClientAuthEventStartNonAuth clientAuthEventStartNonAuth = new ClientAuthEventStartNonAuth();
        DEFAULT_INSTANCE = clientAuthEventStartNonAuth;
        AbstractC0269h.registerDefaultInstance(ClientAuthEventStartNonAuth.class, clientAuthEventStartNonAuth);
    }

    private ClientAuthEventStartNonAuth() {
    }

    /* JADX INFO: renamed from: A */
    public static jje m13743A() {
        return (jje) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m13744n(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, Iterable iterable) {
        ae50 ae50Var = clientAuthEventStartNonAuth.scopes_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            clientAuthEventStartNonAuth.scopes_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, clientAuthEventStartNonAuth.scopes_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13745o(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        str.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 16;
        clientAuthEventStartNonAuth.appId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13746p(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        str.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 2048;
        clientAuthEventStartNonAuth.associatedContent_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13747q(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 64;
        clientAuthEventStartNonAuth.authId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13748r(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 128;
        clientAuthEventStartNonAuth.authSessionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13749s(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        str.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 1;
        clientAuthEventStartNonAuth.clientId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13750t(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth) {
        clientAuthEventStartNonAuth.bitField0_ |= 32;
        clientAuthEventStartNonAuth.integrationInitiated_ = true;
    }

    /* JADX INFO: renamed from: u */
    public static void m13751u(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth) {
        clientAuthEventStartNonAuth.bitField0_ |= 8;
        clientAuthEventStartNonAuth.isOffline_ = false;
    }

    /* JADX INFO: renamed from: v */
    public static void m13752v(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        str.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 4;
        clientAuthEventStartNonAuth.redirectUri_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m13753w(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        str.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 2;
        clientAuthEventStartNonAuth.responseType_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m13754x(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        str.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 256;
        clientAuthEventStartNonAuth.utmCampaign_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m13755y(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        str.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 512;
        clientAuthEventStartNonAuth.utmMedium_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m13756z(ClientAuthEventStartNonAuth clientAuthEventStartNonAuth, String str) {
        clientAuthEventStartNonAuth.getClass();
        str.getClass();
        clientAuthEventStartNonAuth.bitField0_ |= 1024;
        clientAuthEventStartNonAuth.utmSource_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဇ\u0003\u0006ဈ\u0004\u0007ဇ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fဈ\n\rဈ\u000b", new Object[]{"bitField0_", "clientId_", "responseType_", "redirectUri_", "scopes_", "isOffline_", "appId_", "integrationInitiated_", "authId_", "authSessionId_", "utmCampaign_", "utmMedium_", "utmSource_", "associatedContent_"});
        }
        if (iOrdinal == 3) {
            return new ClientAuthEventStartNonAuth();
        }
        if (iOrdinal == 4) {
            return new jje(DEFAULT_INSTANCE);
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
        synchronized (ClientAuthEventStartNonAuth.class) {
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
