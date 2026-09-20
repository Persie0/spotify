package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class PostEventV2Response extends AbstractC0269h implements sre0 {
    private static final PostEventV2Response DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        PostEventV2Response postEventV2Response = new PostEventV2Response();
        DEFAULT_INSTANCE = postEventV2Response;
        AbstractC0269h.registerDefaultInstance(PostEventV2Response.class, postEventV2Response);
    }

    private PostEventV2Response() {
    }

    /* JADX INFO: renamed from: o */
    public static PostEventV2Response m2675o(byte[] bArr) {
        return (PostEventV2Response) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new PostEventV2Response();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 11);
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
        synchronized (PostEventV2Response.class) {
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
    public final ebq0 m2676n() {
        ebq0 ebq0Var;
        int i = this.status_;
        if (i == 0) {
            ebq0Var = ebq0.SUCCESS;
        } else if (i == 1) {
            ebq0Var = ebq0.FAIL;
        } else if (i == 2) {
            ebq0Var = ebq0.INVALID_SLOT;
        } else if (i != 3) {
            ebq0Var = i != 4 ? null : ebq0.INVALID_ELIGIBILITY_STATUS;
        } else {
            ebq0Var = ebq0.INVALID_DEMAND_STATUS;
        }
        return ebq0Var == null ? ebq0.UNRECOGNIZED : ebq0Var;
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
