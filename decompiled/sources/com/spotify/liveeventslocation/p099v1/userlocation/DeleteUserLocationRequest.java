package com.spotify.liveeventslocation.p099v1.userlocation;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.ppq;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class DeleteUserLocationRequest extends AbstractC0269h implements sre0 {
    private static final DeleteUserLocationRequest DEFAULT_INSTANCE;
    public static final int GEONAME_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String geonameId_ = "";

    static {
        DeleteUserLocationRequest deleteUserLocationRequest = new DeleteUserLocationRequest();
        DEFAULT_INSTANCE = deleteUserLocationRequest;
        AbstractC0269h.registerDefaultInstance(DeleteUserLocationRequest.class, deleteUserLocationRequest);
    }

    private DeleteUserLocationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13050n(DeleteUserLocationRequest deleteUserLocationRequest, String str) {
        deleteUserLocationRequest.getClass();
        str.getClass();
        deleteUserLocationRequest.geonameId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static ppq m13051o() {
        return (ppq) DEFAULT_INSTANCE.createBuilder();
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
            return new DeleteUserLocationRequest();
        }
        if (iOrdinal == 4) {
            return new ppq(DEFAULT_INSTANCE);
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
        synchronized (DeleteUserLocationRequest.class) {
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
