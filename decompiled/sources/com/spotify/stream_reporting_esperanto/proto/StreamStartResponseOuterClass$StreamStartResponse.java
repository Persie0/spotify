package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StreamStartResponseOuterClass$StreamStartResponse extends AbstractC0269h implements sre0 {
    private static final StreamStartResponseOuterClass$StreamStartResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int STREAM_HANDLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private StatusResponseOuterClass$StatusResponse status_;
    private StreamHandleOuterClass$StreamHandle streamHandle_;

    static {
        StreamStartResponseOuterClass$StreamStartResponse streamStartResponseOuterClass$StreamStartResponse = new StreamStartResponseOuterClass$StreamStartResponse();
        DEFAULT_INSTANCE = streamStartResponseOuterClass$StreamStartResponse;
        AbstractC0269h.registerDefaultInstance(StreamStartResponseOuterClass$StreamStartResponse.class, streamStartResponseOuterClass$StreamStartResponse);
    }

    private StreamStartResponseOuterClass$StreamStartResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static StreamStartResponseOuterClass$StreamStartResponse m21693p(byte[] bArr) {
        return (StreamStartResponseOuterClass$StreamStartResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "status_", "streamHandle_"});
        }
        if (iOrdinal == 3) {
            return new StreamStartResponseOuterClass$StreamStartResponse();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 29);
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
        synchronized (StreamStartResponseOuterClass$StreamStartResponse.class) {
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
    public final StatusResponseOuterClass$StatusResponse m21694n() {
        StatusResponseOuterClass$StatusResponse statusResponseOuterClass$StatusResponse = this.status_;
        return statusResponseOuterClass$StatusResponse == null ? StatusResponseOuterClass$StatusResponse.m21629n() : statusResponseOuterClass$StatusResponse;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final StreamHandleOuterClass$StreamHandle m21695o() {
        StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle = this.streamHandle_;
        return streamHandleOuterClass$StreamHandle == null ? StreamHandleOuterClass$StreamHandle.m21636n() : streamHandleOuterClass$StreamHandle;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
