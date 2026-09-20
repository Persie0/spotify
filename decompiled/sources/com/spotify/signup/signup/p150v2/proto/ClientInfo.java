package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import p204p.AbstractC1733c9;
import p204p.dke;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.ri5;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.xtb;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ClientInfo extends AbstractC0269h implements sre0 {
    public static final int API_KEY_FIELD_NUMBER = 1;
    public static final int APP_VERSION_FIELD_NUMBER = 3;
    public static final int CAPABILITIES_FIELD_NUMBER = 4;
    public static final int CLIENT_ID_FIELD_NUMBER = 6;
    private static final ClientInfo DEFAULT_INSTANCE;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    private static final vd50 capabilities_converter_ = new ri5(3);
    private int capabilitiesMemoizedSerializedSize;
    private String apiKey_ = "";
    private String platform_ = "";
    private String appVersion_ = "";
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();
    private String installationId_ = "";
    private String clientId_ = "";

    static {
        ClientInfo clientInfo = new ClientInfo();
        DEFAULT_INSTANCE = clientInfo;
        AbstractC0269h.registerDefaultInstance(ClientInfo.class, clientInfo);
    }

    private ClientInfo() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m21313n(ClientInfo clientInfo, Iterable iterable) {
        ud50 ud50Var = clientInfo.capabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            clientInfo.capabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xtb xtbVar = (xtb) it.next();
            ((n350) clientInfo.capabilities_).m63581b(xtbVar.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m21314o(ClientInfo clientInfo, String str) {
        clientInfo.getClass();
        str.getClass();
        clientInfo.apiKey_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21315p(ClientInfo clientInfo, String str) {
        clientInfo.getClass();
        str.getClass();
        clientInfo.appVersion_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21316q(ClientInfo clientInfo, String str) {
        clientInfo.getClass();
        str.getClass();
        clientInfo.clientId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21317r(ClientInfo clientInfo, String str) {
        clientInfo.getClass();
        clientInfo.installationId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m21318s(ClientInfo clientInfo) {
        clientInfo.getClass();
        clientInfo.platform_ = "Android-ARM";
    }

    /* JADX INFO: renamed from: t */
    public static dke m21319t() {
        return (dke) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,\u0005Ȉ\u0006Ȉ", new Object[]{"apiKey_", "platform_", "appVersion_", "capabilities_", "installationId_", "clientId_"});
        }
        if (iOrdinal == 3) {
            return new ClientInfo();
        }
        if (iOrdinal == 4) {
            return new dke(DEFAULT_INSTANCE);
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
        synchronized (ClientInfo.class) {
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
