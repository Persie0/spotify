package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.i710;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetCollectibleDetailRequest extends AbstractC0269h implements sre0 {
    public static final int CLIENT_TIME_ZONE_FIELD_NUMBER = 2;
    public static final int COLLECTIBLE_ID_FIELD_NUMBER = 1;
    private static final GetCollectibleDetailRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String collectibleId_ = "";
    private String clientTimeZone_ = "";

    static {
        GetCollectibleDetailRequest getCollectibleDetailRequest = new GetCollectibleDetailRequest();
        DEFAULT_INSTANCE = getCollectibleDetailRequest;
        AbstractC0269h.registerDefaultInstance(GetCollectibleDetailRequest.class, getCollectibleDetailRequest);
    }

    private GetCollectibleDetailRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10854n(GetCollectibleDetailRequest getCollectibleDetailRequest, String str) {
        getCollectibleDetailRequest.getClass();
        str.getClass();
        getCollectibleDetailRequest.clientTimeZone_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m10855o(GetCollectibleDetailRequest getCollectibleDetailRequest, String str) {
        getCollectibleDetailRequest.getClass();
        getCollectibleDetailRequest.collectibleId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static i710 m10856p() {
        return (i710) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"collectibleId_", "clientTimeZone_"});
        }
        if (iOrdinal == 3) {
            return new GetCollectibleDetailRequest();
        }
        if (iOrdinal == 4) {
            return new i710(DEFAULT_INSTANCE);
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
        synchronized (GetCollectibleDetailRequest.class) {
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
