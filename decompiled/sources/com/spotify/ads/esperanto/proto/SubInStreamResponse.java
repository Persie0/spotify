package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SubInStreamResponse extends AbstractC0269h implements sre0 {
    public static final int AD_FIELD_NUMBER = 1;
    private static final SubInStreamResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private C0295Ad ad_;
    private int bitField0_;

    static {
        SubInStreamResponse subInStreamResponse = new SubInStreamResponse();
        DEFAULT_INSTANCE = subInStreamResponse;
        AbstractC0269h.registerDefaultInstance(SubInStreamResponse.class, subInStreamResponse);
    }

    private SubInStreamResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static SubInStreamResponse m2710o(byte[] bArr) {
        return (SubInStreamResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "ad_"});
        }
        if (iOrdinal == 3) {
            return new SubInStreamResponse();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 6);
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
        synchronized (SubInStreamResponse.class) {
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
    public final C0295Ad m2711n() {
        C0295Ad c0295Ad = this.ad_;
        return c0295Ad == null ? C0295Ad.m2563r() : c0295Ad;
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
