package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;
import p204p.zda1;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateSlotResponse extends AbstractC0269h implements sre0 {
    private static final UpdateSlotResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        UpdateSlotResponse updateSlotResponse = new UpdateSlotResponse();
        DEFAULT_INSTANCE = updateSlotResponse;
        AbstractC0269h.registerDefaultInstance(UpdateSlotResponse.class, updateSlotResponse);
    }

    private UpdateSlotResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static UpdateSlotResponse m2754p(byte[] bArr) {
        return (UpdateSlotResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return new UpdateSlotResponse();
        }
        if (iOrdinal == 4) {
            return new s791(28);
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
        synchronized (UpdateSlotResponse.class) {
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

    /* JADX INFO: renamed from: o */
    public final zda1 m2755o() {
        zda1 zda1Var;
        int i = this.status_;
        if (i == 0) {
            zda1Var = zda1.OK;
        } else if (i != 1) {
            zda1Var = i != 2 ? null : zda1.BAD_REQUEST;
        } else {
            zda1Var = zda1.INVALID_SLOT;
        }
        return zda1Var == null ? zda1.UNRECOGNIZED : zda1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
