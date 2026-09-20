package com.spotify.rcs.resolver.grpc.p141v0;

import com.google.protobuf.AbstractC0269h;
import p204p.izw0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ResolveRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 11;
    private static final ResolveRequest DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROPERTY_SET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Context context_;
    private Fetch fetchType_;
    private String propertySetId_ = "";

    static {
        ResolveRequest resolveRequest = new ResolveRequest();
        DEFAULT_INSTANCE = resolveRequest;
        AbstractC0269h.registerDefaultInstance(ResolveRequest.class, resolveRequest);
    }

    private ResolveRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20145n(ResolveRequest resolveRequest, Context context) {
        resolveRequest.getClass();
        context.getClass();
        resolveRequest.context_ = context;
        resolveRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m20146o(ResolveRequest resolveRequest, Fetch fetch) {
        resolveRequest.getClass();
        resolveRequest.fetchType_ = fetch;
        resolveRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m20147p(ResolveRequest resolveRequest) {
        resolveRequest.getClass();
        resolveRequest.propertySetId_ = "c3370a435715000ddcb9a7006f5bee08c97d107411ca98c11223eed87ae4dadc";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static izw0 m20148q() {
        return (izw0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u000b\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u000bဉ\u0001", new Object[]{"bitField0_", "propertySetId_", "fetchType_", "context_"});
        }
        if (iOrdinal == 3) {
            return new ResolveRequest();
        }
        if (iOrdinal == 4) {
            return new izw0(DEFAULT_INSTANCE);
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
        synchronized (ResolveRequest.class) {
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
