package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.mj51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StreamSeekRequestOuterClass$StreamSeekRequest extends AbstractC0269h implements sre0 {
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 5;
    private static final StreamSeekRequestOuterClass$StreamSeekRequest DEFAULT_INSTANCE;
    public static final int FROM_POSITION_FIELD_NUMBER = 3;
    public static final int IS_SYSTEM_INITIATED_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int STREAM_HANDLE_FIELD_NUMBER = 1;
    public static final int TO_POSITION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp clientTimestamp_;
    private long fromPosition_;
    private boolean isSystemInitiated_;
    private StreamHandleOuterClass$StreamHandle streamHandle_;
    private long toPosition_;

    static {
        StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest = new StreamSeekRequestOuterClass$StreamSeekRequest();
        DEFAULT_INSTANCE = streamSeekRequestOuterClass$StreamSeekRequest;
        AbstractC0269h.registerDefaultInstance(StreamSeekRequestOuterClass$StreamSeekRequest.class, streamSeekRequestOuterClass$StreamSeekRequest);
    }

    private StreamSeekRequestOuterClass$StreamSeekRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21650n(StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest, Timestamp timestamp) {
        streamSeekRequestOuterClass$StreamSeekRequest.getClass();
        streamSeekRequestOuterClass$StreamSeekRequest.clientTimestamp_ = timestamp;
        streamSeekRequestOuterClass$StreamSeekRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m21651o(StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest, long j) {
        streamSeekRequestOuterClass$StreamSeekRequest.fromPosition_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m21652p(StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest, boolean z) {
        streamSeekRequestOuterClass$StreamSeekRequest.bitField0_ |= 4;
        streamSeekRequestOuterClass$StreamSeekRequest.isSystemInitiated_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21653q(StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest, StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle) {
        streamSeekRequestOuterClass$StreamSeekRequest.getClass();
        streamHandleOuterClass$StreamHandle.getClass();
        streamSeekRequestOuterClass$StreamSeekRequest.streamHandle_ = streamHandleOuterClass$StreamHandle;
        streamSeekRequestOuterClass$StreamSeekRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m21654r(StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest, long j) {
        streamSeekRequestOuterClass$StreamSeekRequest.toPosition_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static mj51 m21655s() {
        return (mj51) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003\u0003\u0004\u0003\u0005ဉ\u0001\u0006ဇ\u0002", new Object[]{"bitField0_", "streamHandle_", "fromPosition_", "toPosition_", "clientTimestamp_", "isSystemInitiated_"});
        }
        if (iOrdinal == 3) {
            return new StreamSeekRequestOuterClass$StreamSeekRequest();
        }
        if (iOrdinal == 4) {
            return new mj51(DEFAULT_INSTANCE);
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
        synchronized (StreamSeekRequestOuterClass$StreamSeekRequest.class) {
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
