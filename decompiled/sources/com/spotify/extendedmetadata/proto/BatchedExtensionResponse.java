package com.spotify.extendedmetadata.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class BatchedExtensionResponse extends AbstractC0269h implements sre0 {
    private static final BatchedExtensionResponse DEFAULT_INSTANCE;
    public static final int EXTENDED_METADATA_FIELD_NUMBER = 2;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 extendedMetadata_ = AbstractC0269h.emptyProtobufList();
    private BatchedExtensionResponseHeader header_;

    static {
        BatchedExtensionResponse batchedExtensionResponse = new BatchedExtensionResponse();
        DEFAULT_INSTANCE = batchedExtensionResponse;
        AbstractC0269h.registerDefaultInstance(BatchedExtensionResponse.class, batchedExtensionResponse);
    }

    private BatchedExtensionResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static BatchedExtensionResponse m10534o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "header_", "extendedMetadata_", EntityExtensionDataArray.class});
        }
        if (iOrdinal == 3) {
            return new BatchedExtensionResponse();
        }
        if (iOrdinal == 4) {
            return new az8(20);
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
        synchronized (BatchedExtensionResponse.class) {
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

    /* JADX INFO: renamed from: p */
    public final int m10535p() {
        return this.extendedMetadata_.size();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m10536q() {
        return this.extendedMetadata_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
