package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UnshortenUrlResponse extends AbstractC0269h implements sre0 {
    public static final int CHANNEL_FIELD_NUMBER = 3;
    public static final int DATA_FIELD_NUMBER = 4;
    private static final UnshortenUrlResponse DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private UnshortenUrlResponseData data_;
    private int type_;
    private String feature_ = "";
    private String channel_ = "";

    static {
        UnshortenUrlResponse unshortenUrlResponse = new UnshortenUrlResponse();
        DEFAULT_INSTANCE = unshortenUrlResponse;
        AbstractC0269h.registerDefaultInstance(UnshortenUrlResponse.class, unshortenUrlResponse);
    }

    private UnshortenUrlResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "type_", "feature_", "channel_", "data_"});
        }
        if (iOrdinal == 3) {
            return new UnshortenUrlResponse();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 20);
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
        synchronized (UnshortenUrlResponse.class) {
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
    public final String m21032n() {
        return this.channel_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final UnshortenUrlResponseData m21033o() {
        UnshortenUrlResponseData unshortenUrlResponseData = this.data_;
        return unshortenUrlResponseData == null ? UnshortenUrlResponseData.m21036s() : unshortenUrlResponseData;
    }

    /* JADX INFO: renamed from: p */
    public final String m21034p() {
        return this.feature_;
    }

    /* JADX INFO: renamed from: q */
    public final int m21035q() {
        return this.type_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
