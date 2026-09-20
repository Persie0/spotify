package com.spotify.liveeventslocation.p099v1.userlocation;

import com.google.protobuf.AbstractC0269h;
import p204p.g951;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class StoreUserLocationRequest extends AbstractC0269h implements sre0 {
    private static final StoreUserLocationRequest DEFAULT_INSTANCE;
    public static final int GEONAME_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String geonameId_ = "";

    static {
        StoreUserLocationRequest storeUserLocationRequest = new StoreUserLocationRequest();
        DEFAULT_INSTANCE = storeUserLocationRequest;
        AbstractC0269h.registerDefaultInstance(StoreUserLocationRequest.class, storeUserLocationRequest);
    }

    private StoreUserLocationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13058n(StoreUserLocationRequest storeUserLocationRequest, String str) {
        storeUserLocationRequest.getClass();
        str.getClass();
        storeUserLocationRequest.geonameId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static g951 m13059o() {
        return (g951) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"geonameId_"});
        }
        if (iOrdinal == 3) {
            return new StoreUserLocationRequest();
        }
        if (iOrdinal == 4) {
            return new g951(DEFAULT_INSTANCE);
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
        synchronized (StoreUserLocationRequest.class) {
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
