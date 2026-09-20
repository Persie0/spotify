package com.spotify.rcs.resolver.grpc.p141v0.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.rcs.admin.grpc.p140v0.proto.Publish$BackendContext;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vyw0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Resolve$ResolveRequest extends AbstractC0269h implements sre0 {
    public static final int BACKEND_CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTEXT_FIELD_NUMBER = 11;
    private static final Resolve$ResolveRequest DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROPERTY_SET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Resolve$Context context_;
    private Resolve$Fetch fetchType_;
    private Object resolutionContext_;
    private int resolutionContextCase_ = 0;
    private String propertySetId_ = "";

    static {
        Resolve$ResolveRequest resolve$ResolveRequest = new Resolve$ResolveRequest();
        DEFAULT_INSTANCE = resolve$ResolveRequest;
        AbstractC0269h.registerDefaultInstance(Resolve$ResolveRequest.class, resolve$ResolveRequest);
    }

    private Resolve$ResolveRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20170n(Resolve$ResolveRequest resolve$ResolveRequest, Resolve$Context resolve$Context) {
        resolve$ResolveRequest.getClass();
        resolve$Context.getClass();
        resolve$ResolveRequest.context_ = resolve$Context;
        resolve$ResolveRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m20171o(Resolve$ResolveRequest resolve$ResolveRequest, Resolve$Fetch resolve$Fetch) {
        resolve$ResolveRequest.getClass();
        resolve$Fetch.getClass();
        resolve$ResolveRequest.fetchType_ = resolve$Fetch;
        resolve$ResolveRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m20172p(Resolve$ResolveRequest resolve$ResolveRequest) {
        resolve$ResolveRequest.getClass();
        resolve$ResolveRequest.propertySetId_ = "c3370a435715000ddcb9a7006f5bee08c97d107411ca98c11223eed87ae4dadc";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static vyw0 m20173q() {
        return (vyw0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u000bဉ\u0001\f<\u0000", new Object[]{"resolutionContext_", "resolutionContextCase_", "bitField0_", "propertySetId_", "fetchType_", "context_", Publish$BackendContext.class});
        }
        if (iOrdinal == 3) {
            return new Resolve$ResolveRequest();
        }
        if (iOrdinal == 4) {
            return new vyw0(DEFAULT_INSTANCE);
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
        synchronized (Resolve$ResolveRequest.class) {
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
