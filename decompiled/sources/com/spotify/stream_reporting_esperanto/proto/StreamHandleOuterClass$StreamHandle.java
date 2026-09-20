package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StreamHandleOuterClass$StreamHandle extends AbstractC0269h implements sre0 {
    private static final StreamHandleOuterClass$StreamHandle DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RAW_HANDLE_FIELD_NUMBER = 2;
    public static final int STREAM_ID_FIELD_NUMBER = 3;
    private int rawHandle_;
    private gva streamId_ = gva.f84678b;

    static {
        StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle = new StreamHandleOuterClass$StreamHandle();
        DEFAULT_INSTANCE = streamHandleOuterClass$StreamHandle;
        AbstractC0269h.registerDefaultInstance(StreamHandleOuterClass$StreamHandle.class, streamHandleOuterClass$StreamHandle);
    }

    private StreamHandleOuterClass$StreamHandle() {
    }

    /* JADX INFO: renamed from: n */
    public static StreamHandleOuterClass$StreamHandle m21636n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\n", new Object[]{"rawHandle_", "streamId_"});
        }
        if (iOrdinal == 3) {
            return new StreamHandleOuterClass$StreamHandle();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 28);
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
        synchronized (StreamHandleOuterClass$StreamHandle.class) {
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
    public final int m21637o() {
        return this.rawHandle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
