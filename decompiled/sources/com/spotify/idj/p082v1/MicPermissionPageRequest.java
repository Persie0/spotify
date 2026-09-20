package com.spotify.idj.p082v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kdf0;
import p204p.ore0;
import p204p.pdf0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x8j;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class MicPermissionPageRequest extends AbstractC0269h implements sre0 {
    public static final int CONSUMER_FIELD_NUMBER = 3;
    private static final MicPermissionPageRequest DEFAULT_INSTANCE;
    public static final int MICPERMISSIONSTATE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private int consumer_;
    private int micPermissionState_;
    private boolean unused_;

    static {
        MicPermissionPageRequest micPermissionPageRequest = new MicPermissionPageRequest();
        DEFAULT_INSTANCE = micPermissionPageRequest;
        AbstractC0269h.registerDefaultInstance(MicPermissionPageRequest.class, micPermissionPageRequest);
    }

    private MicPermissionPageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11987n(MicPermissionPageRequest micPermissionPageRequest, x8j x8jVar) {
        micPermissionPageRequest.getClass();
        micPermissionPageRequest.consumer_ = x8jVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m11988o(MicPermissionPageRequest micPermissionPageRequest, pdf0 pdf0Var) {
        micPermissionPageRequest.getClass();
        micPermissionPageRequest.micPermissionState_ = pdf0Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m11989p(MicPermissionPageRequest micPermissionPageRequest) {
        micPermissionPageRequest.unused_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static kdf0 m11990q() {
        return (kdf0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\f", new Object[]{"unused_", "micPermissionState_", "consumer_"});
        }
        if (iOrdinal == 3) {
            return new MicPermissionPageRequest();
        }
        if (iOrdinal == 4) {
            return new kdf0(DEFAULT_INSTANCE);
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
        synchronized (MicPermissionPageRequest.class) {
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
