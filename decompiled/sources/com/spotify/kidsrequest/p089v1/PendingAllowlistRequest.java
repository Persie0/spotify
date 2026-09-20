package com.spotify.kidsrequest.p089v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PendingAllowlistRequest extends AbstractC0269h implements sre0 {
    public static final int AUDIOBOOK_FIELD_NUMBER = 3;
    public static final int CREATED_AT_FIELD_NUMBER = 4;
    private static final PendingAllowlistRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp createdAt_;
    private Object data_;
    private int dataCase_ = 0;
    private String requestId_ = "";

    static {
        PendingAllowlistRequest pendingAllowlistRequest = new PendingAllowlistRequest();
        DEFAULT_INSTANCE = pendingAllowlistRequest;
        AbstractC0269h.registerDefaultInstance(PendingAllowlistRequest.class, pendingAllowlistRequest);
    }

    private PendingAllowlistRequest() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004ဉ\u0000", new Object[]{"data_", "dataCase_", "bitField0_", "requestId_", TrackAllowlistRequestData.class, AudiobookAllowlistRequestData.class, "createdAt_"});
        }
        if (iOrdinal == 3) {
            return new PendingAllowlistRequest();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 24);
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
        synchronized (PendingAllowlistRequest.class) {
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

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final AudiobookAllowlistRequestData m12243n() {
        return this.dataCase_ == 3 ? (AudiobookAllowlistRequestData) this.data_ : AudiobookAllowlistRequestData.m12239o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m12244o() {
        int i = this.dataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public final String m12245p() {
        return this.requestId_;
    }

    /* JADX INFO: renamed from: q */
    public final TrackAllowlistRequestData m12246q() {
        return this.dataCase_ == 2 ? (TrackAllowlistRequestData) this.data_ : TrackAllowlistRequestData.m12247p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
