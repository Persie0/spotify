package com.spotify.watchfeed.api.p182v1.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.ae50;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResponsePivoting extends AbstractC0269h implements sre0 {
    public static final int ADDITIONAL_PAGES_URIS_FIELD_NUMBER = 1;
    private static final ResponsePivoting DEFAULT_INSTANCE;
    public static final int ONBOARDING_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 additionalPagesUris_ = AbstractC0269h.emptyProtobufList();
    private int bitField0_;
    private Any onboarding_;

    static {
        ResponsePivoting responsePivoting = new ResponsePivoting();
        DEFAULT_INSTANCE = responsePivoting;
        AbstractC0269h.registerDefaultInstance(ResponsePivoting.class, responsePivoting);
    }

    private ResponsePivoting() {
    }

    /* JADX INFO: renamed from: o */
    public static ResponsePivoting m22489o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0000", new Object[]{"bitField0_", "additionalPagesUris_", "onboarding_"});
        }
        if (iOrdinal == 3) {
            return new ResponsePivoting();
        }
        if (iOrdinal == 4) {
            return new i8w0(DEFAULT_INSTANCE, 25);
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
        synchronized (ResponsePivoting.class) {
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
    public final ae50 m22490n() {
        return this.additionalPagesUris_;
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
