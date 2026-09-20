package com.spotify.profile.socialgraphimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.ovk;
import p204p.pre0;
import p204p.pvk;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CountResponse$GetCountUsernameRequest extends AbstractC0269h implements sre0 {
    private static final CountResponse$GetCountUsernameRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RELATION_TYPE_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int relationType_;
    private String username_ = "";

    static {
        CountResponse$GetCountUsernameRequest countResponse$GetCountUsernameRequest = new CountResponse$GetCountUsernameRequest();
        DEFAULT_INSTANCE = countResponse$GetCountUsernameRequest;
        AbstractC0269h.registerDefaultInstance(CountResponse$GetCountUsernameRequest.class, countResponse$GetCountUsernameRequest);
    }

    private CountResponse$GetCountUsernameRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19842n(CountResponse$GetCountUsernameRequest countResponse$GetCountUsernameRequest) {
        countResponse$GetCountUsernameRequest.getClass();
        countResponse$GetCountUsernameRequest.relationType_ = pvk.RELATION_COUNT_TYPE_IS_FRIEND.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m19843o(CountResponse$GetCountUsernameRequest countResponse$GetCountUsernameRequest, String str) {
        countResponse$GetCountUsernameRequest.getClass();
        str.getClass();
        countResponse$GetCountUsernameRequest.username_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static ovk m19844p() {
        return (ovk) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"username_", "relationType_"});
        }
        if (iOrdinal == 3) {
            return new CountResponse$GetCountUsernameRequest();
        }
        if (iOrdinal == 4) {
            return new ovk(DEFAULT_INSTANCE);
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
        synchronized (CountResponse$GetCountUsernameRequest.class) {
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
