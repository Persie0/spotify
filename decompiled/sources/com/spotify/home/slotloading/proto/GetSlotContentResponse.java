package com.spotify.home.slotloading.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.casita.p040v1.resolved.EagerlyLoadedTraits;
import com.spotify.casita.p040v1.resolved.ResponseInfo;
import p204p.ae50;
import p204p.ca10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetSlotContentResponse extends AbstractC0269h implements sre0 {
    private static final GetSlotContentResponse DEFAULT_INSTANCE;
    public static final int EAGERLY_LOADED_TRAITS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_ID_FIELD_NUMBER = 3;
    public static final int RESPONSE_INFO_FIELD_NUMBER = 5;
    public static final int SECTIONS_FIELD_NUMBER = 1;
    public static final int SLOT_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private EagerlyLoadedTraits eagerlyLoadedTraits_;
    private ResponseInfo responseInfo_;
    private int slotType_;
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();
    private String responseId_ = "";

    static {
        GetSlotContentResponse getSlotContentResponse = new GetSlotContentResponse();
        DEFAULT_INSTANCE = getSlotContentResponse;
        AbstractC0269h.registerDefaultInstance(GetSlotContentResponse.class, getSlotContentResponse);
    }

    private GetSlotContentResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001c\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "sections_", "slotType_", "responseId_", "eagerlyLoadedTraits_", "responseInfo_"});
        }
        if (iOrdinal == 3) {
            return new GetSlotContentResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 27);
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
        synchronized (GetSlotContentResponse.class) {
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
    public final EagerlyLoadedTraits m11835n() {
        EagerlyLoadedTraits eagerlyLoadedTraits = this.eagerlyLoadedTraits_;
        return eagerlyLoadedTraits == null ? EagerlyLoadedTraits.m5617o() : eagerlyLoadedTraits;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ResponseInfo m11836o() {
        ResponseInfo responseInfo = this.responseInfo_;
        return responseInfo == null ? ResponseInfo.m5774o() : responseInfo;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m11837p() {
        return this.sections_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
