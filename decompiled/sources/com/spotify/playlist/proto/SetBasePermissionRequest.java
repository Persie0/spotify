package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g6f0;
import p204p.knn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.w401;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class SetBasePermissionRequest extends AbstractC0269h implements sre0 {
    private static final SetBasePermissionRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_LEVEL_FIELD_NUMBER = 1;
    public static final int TIMEOUT_MS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int permissionLevel_;
    private int timeoutMs_;

    static {
        SetBasePermissionRequest setBasePermissionRequest = new SetBasePermissionRequest();
        DEFAULT_INSTANCE = setBasePermissionRequest;
        AbstractC0269h.registerDefaultInstance(SetBasePermissionRequest.class, setBasePermissionRequest);
    }

    private SetBasePermissionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18655n(SetBasePermissionRequest setBasePermissionRequest, knn0 knn0Var) {
        setBasePermissionRequest.getClass();
        setBasePermissionRequest.permissionLevel_ = knn0Var.f124447a;
        setBasePermissionRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m18656o(SetBasePermissionRequest setBasePermissionRequest, int i) {
        setBasePermissionRequest.bitField0_ |= 2;
        setBasePermissionRequest.timeoutMs_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static w401 m18657p() {
        return (w401) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "permissionLevel_", g6f0.f77035h, "timeoutMs_"});
        }
        if (iOrdinal == 3) {
            return new SetBasePermissionRequest();
        }
        if (iOrdinal == 4) {
            return new w401(DEFAULT_INSTANCE);
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
        synchronized (SetBasePermissionRequest.class) {
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
