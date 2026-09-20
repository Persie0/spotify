package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionPlatformEsperantoContainsResponse extends AbstractC0269h implements sre0 {
    public static final int CONTAINS_FIELD_NUMBER = 2;
    private static final CollectionPlatformEsperantoContainsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private CollectionPlatformContainsResponse contains_;
    private Status status_;

    static {
        CollectionPlatformEsperantoContainsResponse collectionPlatformEsperantoContainsResponse = new CollectionPlatformEsperantoContainsResponse();
        DEFAULT_INSTANCE = collectionPlatformEsperantoContainsResponse;
        AbstractC0269h.registerDefaultInstance(CollectionPlatformEsperantoContainsResponse.class, collectionPlatformEsperantoContainsResponse);
    }

    private CollectionPlatformEsperantoContainsResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static CollectionPlatformEsperantoContainsResponse m6871p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static CollectionPlatformEsperantoContainsResponse m6872q(byte[] bArr) {
        return (CollectionPlatformEsperantoContainsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "status_", "contains_"});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformEsperantoContainsResponse();
        }
        if (iOrdinal == 4) {
            return new z3f(12);
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
        synchronized (CollectionPlatformEsperantoContainsResponse.class) {
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

    /* JADX INFO: renamed from: o */
    public final CollectionPlatformContainsResponse m6873o() {
        CollectionPlatformContainsResponse collectionPlatformContainsResponse = this.contains_;
        return collectionPlatformContainsResponse == null ? CollectionPlatformContainsResponse.m6863o() : collectionPlatformContainsResponse;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
