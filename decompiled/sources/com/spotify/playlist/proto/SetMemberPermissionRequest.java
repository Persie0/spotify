package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g6f0;
import p204p.knn0;
import p204p.o501;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class SetMemberPermissionRequest extends AbstractC0269h implements sre0 {
    private static final SetMemberPermissionRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_LEVEL_FIELD_NUMBER = 3;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TIMEOUT_MS_FIELD_NUMBER = 4;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private int permissionLevel_;
    private int timeoutMs_;
    private String playlistUri_ = "";
    private String username_ = "";

    static {
        SetMemberPermissionRequest setMemberPermissionRequest = new SetMemberPermissionRequest();
        DEFAULT_INSTANCE = setMemberPermissionRequest;
        AbstractC0269h.registerDefaultInstance(SetMemberPermissionRequest.class, setMemberPermissionRequest);
    }

    private SetMemberPermissionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18658n(SetMemberPermissionRequest setMemberPermissionRequest, knn0 knn0Var) {
        setMemberPermissionRequest.getClass();
        setMemberPermissionRequest.permissionLevel_ = knn0Var.f124447a;
        setMemberPermissionRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m18659o(SetMemberPermissionRequest setMemberPermissionRequest, String str) {
        setMemberPermissionRequest.getClass();
        str.getClass();
        setMemberPermissionRequest.bitField0_ |= 1;
        setMemberPermissionRequest.playlistUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m18660p(SetMemberPermissionRequest setMemberPermissionRequest, int i) {
        setMemberPermissionRequest.bitField0_ |= 8;
        setMemberPermissionRequest.timeoutMs_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18661q(SetMemberPermissionRequest setMemberPermissionRequest, String str) {
        setMemberPermissionRequest.getClass();
        str.getClass();
        setMemberPermissionRequest.bitField0_ |= 2;
        setMemberPermissionRequest.username_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static o501 m18662r() {
        return (o501) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "playlistUri_", "username_", "permissionLevel_", g6f0.f77035h, "timeoutMs_"});
        }
        if (iOrdinal == 3) {
            return new SetMemberPermissionRequest();
        }
        if (iOrdinal == 4) {
            return new o501(DEFAULT_INSTANCE);
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
        synchronized (SetMemberPermissionRequest.class) {
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
