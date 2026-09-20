package com.spotify.campfire.chatcontentpickerpage.gifs.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y9q0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class PopularRequest extends AbstractC0269h implements sre0 {
    private static final PopularRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 1;
    public static final int OFFSET_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Filter filter_;
    private int limit_;
    private int offset_;

    static {
        PopularRequest popularRequest = new PopularRequest();
        DEFAULT_INSTANCE = popularRequest;
        AbstractC0269h.registerDefaultInstance(PopularRequest.class, popularRequest);
    }

    private PopularRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4203n(PopularRequest popularRequest) {
        popularRequest.limit_ = 30;
    }

    /* JADX INFO: renamed from: o */
    public static void m4204o(PopularRequest popularRequest, int i) {
        popularRequest.offset_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static y9q0 m4205p() {
        return (y9q0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\u000b", new Object[]{"bitField0_", "limit_", "filter_", "offset_"});
        }
        if (iOrdinal == 3) {
            return new PopularRequest();
        }
        if (iOrdinal == 4) {
            return new y9q0(DEFAULT_INSTANCE);
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
        synchronized (PopularRequest.class) {
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
