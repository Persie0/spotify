package com.spotify.metadata.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetEntityResponse extends AbstractC0269h implements sre0 {
    private static final GetEntityResponse DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private MetadataCosmos$MetadataItem item_;

    static {
        GetEntityResponse getEntityResponse = new GetEntityResponse();
        DEFAULT_INSTANCE = getEntityResponse;
        AbstractC0269h.registerDefaultInstance(GetEntityResponse.class, getEntityResponse);
    }

    private GetEntityResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static GetEntityResponse m15421o(byte[] bArr) {
        return (GetEntityResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "item_"});
        }
        if (iOrdinal == 3) {
            return new GetEntityResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 2);
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
        synchronized (GetEntityResponse.class) {
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
    public final MetadataCosmos$MetadataItem m15422n() {
        MetadataCosmos$MetadataItem metadataCosmos$MetadataItem = this.item_;
        return metadataCosmos$MetadataItem == null ? MetadataCosmos$MetadataItem.m15409p() : metadataCosmos$MetadataItem;
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
