package com.spotify.collection_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes5.dex */
public final class IsSnoozedResponse extends AbstractC0269h implements sre0 {
    private static final IsSnoozedResponse DEFAULT_INSTANCE;
    public static final int IS_SNOOZED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isSnoozed_;
    private Status status_;

    static {
        IsSnoozedResponse isSnoozedResponse = new IsSnoozedResponse();
        DEFAULT_INSTANCE = isSnoozedResponse;
        AbstractC0269h.registerDefaultInstance(IsSnoozedResponse.class, isSnoozedResponse);
    }

    private IsSnoozedResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static IsSnoozedResponse m6842p(byte[] bArr) {
        return (IsSnoozedResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000", new Object[]{"bitField0_", "isSnoozed_", "status_"});
        }
        if (iOrdinal == 3) {
            return new IsSnoozedResponse();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 22);
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
        synchronized (IsSnoozedResponse.class) {
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
    public final boolean m6843n() {
        return this.isSnoozed_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Status m6844o() {
        Status status = this.status_;
        return status == null ? Status.m6849o() : status;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
