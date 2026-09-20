package com.spotify.pses.p134v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fwl0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uje;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientData extends AbstractC0269h implements sre0 {
    public static final int ALREADY_LOGGED_IN_FIELD_NUMBER = 6;
    public static final int APP_PACKAGE_FIELD_NUMBER = 10;
    public static final int DEEP_LINK_FIELD_NUMBER = 5;
    private static final ClientData DEFAULT_INSTANCE;
    public static final int DEVICE_INFORMATION_FIELD_NUMBER = 8;
    public static final int LANGUAGE_FIELD_NUMBER = 4;
    public static final int ORIGIN_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 3;
    public static final int SCREEN_FIELD_NUMBER = 7;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private boolean alreadyLoggedIn_;
    private int bitField0_;
    private DeviceInformation deviceInformation_;
    private int origin_;
    private Screen screen_;
    private String spotifyId_ = "";
    private String platform_ = "";
    private String revision_ = "";
    private String language_ = "";
    private String deepLink_ = "";
    private String appPackage_ = "";

    static {
        ClientData clientData = new ClientData();
        DEFAULT_INSTANCE = clientData;
        AbstractC0269h.registerDefaultInstance(ClientData.class, clientData);
    }

    private ClientData() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19949n(ClientData clientData, String str) {
        clientData.getClass();
        str.getClass();
        clientData.appPackage_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19950o(ClientData clientData, DeviceInformation deviceInformation) {
        clientData.getClass();
        clientData.deviceInformation_ = deviceInformation;
        clientData.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m19951p(ClientData clientData, String str) {
        clientData.getClass();
        clientData.language_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19952q(ClientData clientData, fwl0 fwl0Var) {
        clientData.getClass();
        clientData.origin_ = fwl0Var.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static void m19953r(ClientData clientData) {
        clientData.getClass();
        clientData.platform_ = "android";
    }

    /* JADX INFO: renamed from: s */
    public static void m19954s(ClientData clientData, String str) {
        clientData.getClass();
        str.getClass();
        clientData.revision_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m19955t(ClientData clientData, Screen screen) {
        clientData.getClass();
        clientData.screen_ = screen;
        clientData.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: u */
    public static void m19956u(ClientData clientData, String str) {
        clientData.getClass();
        str.getClass();
        clientData.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static uje m19957v() {
        return (uje) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0000\bဉ\u0001\t\f\nȈ", new Object[]{"bitField0_", "spotifyId_", "platform_", "revision_", "language_", "deepLink_", "alreadyLoggedIn_", "screen_", "deviceInformation_", "origin_", "appPackage_"});
        }
        if (iOrdinal == 3) {
            return new ClientData();
        }
        if (iOrdinal == 4) {
            return new uje(DEFAULT_INSTANCE);
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
        synchronized (ClientData.class) {
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
