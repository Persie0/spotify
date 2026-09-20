package com.spotify.tap.p163go.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qc41;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SpotifyGoCommandLifecycle extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_NAME_FIELD_NUMBER = 5;
    public static final int BRAND_FIELD_NUMBER = 3;
    public static final int CLIENT_ID_FIELD_NUMBER = 2;
    public static final int COMMAND_ID_FIELD_NUMBER = 1;
    public static final int CONNECT_SYNCED_FIELD_NUMBER = 9;
    private static final SpotifyGoCommandLifecycle DEFAULT_INSTANCE;
    public static final int ERROR_REASON_FIELD_NUMBER = 7;
    public static final int INTERACTION_ID_FIELD_NUMBER = 8;
    public static final int MODEL_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int STAGE_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean connectSynced_;
    private String commandId_ = "";
    private String clientId_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String accessoryName_ = "";
    private String stage_ = "";
    private String errorReason_ = "";
    private String interactionId_ = "";

    static {
        SpotifyGoCommandLifecycle spotifyGoCommandLifecycle = new SpotifyGoCommandLifecycle();
        DEFAULT_INSTANCE = spotifyGoCommandLifecycle;
        AbstractC0269h.registerDefaultInstance(SpotifyGoCommandLifecycle.class, spotifyGoCommandLifecycle);
    }

    private SpotifyGoCommandLifecycle() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21788n(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, String str) {
        spotifyGoCommandLifecycle.getClass();
        str.getClass();
        spotifyGoCommandLifecycle.bitField0_ |= 16;
        spotifyGoCommandLifecycle.accessoryName_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21789o(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, String str) {
        spotifyGoCommandLifecycle.getClass();
        str.getClass();
        spotifyGoCommandLifecycle.bitField0_ |= 4;
        spotifyGoCommandLifecycle.brand_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21790p(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, String str) {
        spotifyGoCommandLifecycle.getClass();
        str.getClass();
        spotifyGoCommandLifecycle.bitField0_ |= 2;
        spotifyGoCommandLifecycle.clientId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21791q(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, String str) {
        spotifyGoCommandLifecycle.getClass();
        str.getClass();
        spotifyGoCommandLifecycle.bitField0_ |= 1;
        spotifyGoCommandLifecycle.commandId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21792r(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, boolean z) {
        spotifyGoCommandLifecycle.bitField0_ |= 256;
        spotifyGoCommandLifecycle.connectSynced_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m21793s(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, String str) {
        spotifyGoCommandLifecycle.getClass();
        spotifyGoCommandLifecycle.bitField0_ |= 64;
        spotifyGoCommandLifecycle.errorReason_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m21794t(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, String str) {
        spotifyGoCommandLifecycle.getClass();
        spotifyGoCommandLifecycle.bitField0_ |= 128;
        spotifyGoCommandLifecycle.interactionId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m21795u(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, String str) {
        spotifyGoCommandLifecycle.getClass();
        str.getClass();
        spotifyGoCommandLifecycle.bitField0_ |= 8;
        spotifyGoCommandLifecycle.model_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m21796v(SpotifyGoCommandLifecycle spotifyGoCommandLifecycle, String str) {
        spotifyGoCommandLifecycle.getClass();
        spotifyGoCommandLifecycle.bitField0_ |= 32;
        spotifyGoCommandLifecycle.stage_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static qc41 m21797w() {
        return (qc41) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b", new Object[]{"bitField0_", "commandId_", "clientId_", "brand_", "model_", "accessoryName_", "stage_", "errorReason_", "interactionId_", "connectSynced_"});
        }
        if (iOrdinal == 3) {
            return new SpotifyGoCommandLifecycle();
        }
        if (iOrdinal == 4) {
            return new qc41(DEFAULT_INSTANCE);
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
        synchronized (SpotifyGoCommandLifecycle.class) {
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
