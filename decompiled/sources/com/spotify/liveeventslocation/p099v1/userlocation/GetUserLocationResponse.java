package com.spotify.liveeventslocation.p099v1.userlocation;

import com.google.protobuf.AbstractC0269h;
import p204p.nyw0;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetUserLocationResponse extends AbstractC0269h implements sre0 {
    private static final GetUserLocationResponse DEFAULT_INSTANCE;
    public static final int HAS_LOCATION_STORED_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESOLUTION_METHOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean hasLocationStored_;
    private Location location_;
    private int resolutionMethod_;

    static {
        GetUserLocationResponse getUserLocationResponse = new GetUserLocationResponse();
        DEFAULT_INSTANCE = getUserLocationResponse;
        AbstractC0269h.registerDefaultInstance(GetUserLocationResponse.class, getUserLocationResponse);
    }

    private GetUserLocationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0007", new Object[]{"bitField0_", "location_", "resolutionMethod_", "hasLocationStored_"});
        }
        if (iOrdinal == 3) {
            return new GetUserLocationResponse();
        }
        if (iOrdinal == 4) {
            return new qb10(DEFAULT_INSTANCE, 18);
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
        synchronized (GetUserLocationResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final Location m13054n() {
        Location location = this.location_;
        return location == null ? Location.m13056n() : location;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final nyw0 m13055o() {
        nyw0 nyw0Var;
        int i = this.resolutionMethod_;
        if (i == 0) {
            nyw0Var = nyw0.RESOLUTION_METHOD_UNSPECIFIED;
        } else if (i == 1) {
            nyw0Var = nyw0.RESOLUTION_METHOD_STORE;
        } else if (i == 2) {
            nyw0Var = nyw0.RESOLUTION_METHOD_IP_ADDRESS;
        } else if (i != 3) {
            nyw0Var = i != 4 ? null : nyw0.RESOLUTION_METHOD_UNRESOLVED;
        } else {
            nyw0Var = nyw0.RESOLUTION_METHOD_DEFAULT;
        }
        return nyw0Var == null ? nyw0.UNRECOGNIZED : nyw0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
