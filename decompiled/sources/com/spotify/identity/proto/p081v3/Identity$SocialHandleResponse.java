package com.spotify.identity.proto.p081v3;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.i140;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Identity$SocialHandleResponse extends AbstractC0269h implements sre0 {
    private static final Identity$SocialHandleResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int VALID_FIELD_NUMBER = 1;
    private int reason_;
    private boolean valid_;

    static {
        Identity$SocialHandleResponse identity$SocialHandleResponse = new Identity$SocialHandleResponse();
        DEFAULT_INSTANCE = identity$SocialHandleResponse;
        AbstractC0269h.registerDefaultInstance(Identity$SocialHandleResponse.class, identity$SocialHandleResponse);
    }

    private Identity$SocialHandleResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"valid_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new Identity$SocialHandleResponse();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 20);
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
        synchronized (Identity$SocialHandleResponse.class) {
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
    public final i140 m11940n() {
        i140 i140Var;
        switch (this.reason_) {
            case 0:
                i140Var = i140.UNSPECIFIED;
                break;
            case 1:
                i140Var = i140.INVALID_FORMAT;
                break;
            case 2:
                i140Var = i140.ALREADY_TAKEN;
                break;
            case 3:
                i140Var = i140.UPDATE_LIMITED;
                break;
            case 4:
                i140Var = i140.CONTAINS_BLOCKED_WORD;
                break;
            case 5:
                i140Var = i140.INVALID_LENGTH;
                break;
            case 6:
                i140Var = i140.INVALID_BOUNDARY_CHARACTER;
                break;
            default:
                i140Var = null;
                break;
        }
        return i140Var == null ? i140.UNRECOGNIZED : i140Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11941o() {
        return this.valid_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
