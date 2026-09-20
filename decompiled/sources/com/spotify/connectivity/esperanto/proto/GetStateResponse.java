package com.spotify.connectivity.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ca10;
import p204p.ob10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class GetStateResponse extends AbstractC0269h implements sre0 {
    private static final GetStateResponse DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int statusCode_;
    private String errorMessage_ = "";
    private String status_ = "";

    static {
        GetStateResponse getStateResponse = new GetStateResponse();
        DEFAULT_INSTANCE = getStateResponse;
        AbstractC0269h.registerDefaultInstance(GetStateResponse.class, getStateResponse);
    }

    private GetStateResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static GetStateResponse m7508q(byte[] bArr) {
        return (GetStateResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003Ȉ", new Object[]{"bitField0_", "statusCode_", "errorMessage_", "status_"});
        }
        if (iOrdinal == 3) {
            return new GetStateResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(29);
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
        synchronized (GetStateResponse.class) {
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

    public final String getStatus() {
        return this.status_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7509o() {
        return this.errorMessage_;
    }

    /* JADX INFO: renamed from: p */
    public final ob10 m7510p() {
        ob10 ob10Var;
        int i = this.statusCode_;
        if (i != 0) {
            ob10Var = i != 2 ? null : ob10.NOT_FOUND;
        } else {
            ob10Var = ob10.SUCCESS;
        }
        return ob10Var == null ? ob10.UNRECOGNIZED : ob10Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
