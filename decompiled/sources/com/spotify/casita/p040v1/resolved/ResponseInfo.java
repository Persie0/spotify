package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ResponseInfo extends AbstractC0269h implements sre0 {
    private static final ResponseInfo DEFAULT_INSTANCE;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int PAGE_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REFRESH_TOKEN_FIELD_NUMBER = 4;
    public static final int RESPONSE_ID_FIELD_NUMBER = 1;
    private gva pageToken_;
    private gva refreshToken_;
    private String responseId_ = "";
    private String pageUri_ = "";

    static {
        ResponseInfo responseInfo = new ResponseInfo();
        DEFAULT_INSTANCE = responseInfo;
        AbstractC0269h.registerDefaultInstance(ResponseInfo.class, responseInfo);
    }

    private ResponseInfo() {
        cva cvaVar = gva.f84678b;
        this.pageToken_ = cvaVar;
        this.refreshToken_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static ResponseInfo m5774o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\n", new Object[]{"responseId_", "pageUri_", "pageToken_", "refreshToken_"});
        }
        if (iOrdinal == 3) {
            return new ResponseInfo();
        }
        if (iOrdinal == 4) {
            return new i8w0(22);
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
        synchronized (ResponseInfo.class) {
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

    /* JADX INFO: renamed from: p */
    public final gva m5775p() {
        return this.pageToken_;
    }

    /* JADX INFO: renamed from: q */
    public final String m5776q() {
        return this.pageUri_;
    }

    /* JADX INFO: renamed from: r */
    public final gva m5777r() {
        return this.refreshToken_;
    }

    /* JADX INFO: renamed from: s */
    public final String m5778s() {
        return this.responseId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
