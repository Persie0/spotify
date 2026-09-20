package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ai51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tqo0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StreamEndRequestOuterClass$StreamEndRequest extends AbstractC0269h implements sre0 {
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 5;
    private static final StreamEndRequestOuterClass$StreamEndRequest DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_END_FIELD_NUMBER = 3;
    public static final int SOURCE_END_FIELD_NUMBER = 2;
    public static final int STREAM_HANDLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp clientTimestamp_;
    private int format_;
    private int reasonEnd_;
    private String sourceEnd_ = "";
    private StreamHandleOuterClass$StreamHandle streamHandle_;

    static {
        StreamEndRequestOuterClass$StreamEndRequest streamEndRequestOuterClass$StreamEndRequest = new StreamEndRequestOuterClass$StreamEndRequest();
        DEFAULT_INSTANCE = streamEndRequestOuterClass$StreamEndRequest;
        AbstractC0269h.registerDefaultInstance(StreamEndRequestOuterClass$StreamEndRequest.class, streamEndRequestOuterClass$StreamEndRequest);
    }

    private StreamEndRequestOuterClass$StreamEndRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21632n(StreamEndRequestOuterClass$StreamEndRequest streamEndRequestOuterClass$StreamEndRequest, Timestamp timestamp) {
        streamEndRequestOuterClass$StreamEndRequest.getClass();
        streamEndRequestOuterClass$StreamEndRequest.clientTimestamp_ = timestamp;
        streamEndRequestOuterClass$StreamEndRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m21633o(StreamEndRequestOuterClass$StreamEndRequest streamEndRequestOuterClass$StreamEndRequest, tqo0 tqo0Var) {
        streamEndRequestOuterClass$StreamEndRequest.getClass();
        streamEndRequestOuterClass$StreamEndRequest.reasonEnd_ = tqo0Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m21634p(StreamEndRequestOuterClass$StreamEndRequest streamEndRequestOuterClass$StreamEndRequest, StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle) {
        streamEndRequestOuterClass$StreamEndRequest.getClass();
        streamHandleOuterClass$StreamHandle.getClass();
        streamEndRequestOuterClass$StreamEndRequest.streamHandle_ = streamHandleOuterClass$StreamHandle;
        streamEndRequestOuterClass$StreamEndRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ai51 m21635q() {
        return (ai51) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f\u0004ဌ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "streamHandle_", "sourceEnd_", "reasonEnd_", "format_", "clientTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new StreamEndRequestOuterClass$StreamEndRequest();
        }
        if (iOrdinal == 4) {
            return new ai51(DEFAULT_INSTANCE);
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
        synchronized (StreamEndRequestOuterClass$StreamEndRequest.class) {
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
