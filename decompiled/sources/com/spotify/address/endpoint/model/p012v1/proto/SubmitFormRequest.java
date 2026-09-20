package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.ps51;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SubmitFormRequest extends AbstractC0269h implements sre0 {
    private static final SubmitFormRequest DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static final int FIELD_VALUES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private RequestDetails details_;
    private ae50 fieldValues_ = AbstractC0269h.emptyProtobufList();

    static {
        SubmitFormRequest submitFormRequest = new SubmitFormRequest();
        DEFAULT_INSTANCE = submitFormRequest;
        AbstractC0269h.registerDefaultInstance(SubmitFormRequest.class, submitFormRequest);
    }

    private SubmitFormRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2466n(SubmitFormRequest submitFormRequest, ArrayList arrayList) {
        ae50 ae50Var = submitFormRequest.fieldValues_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            submitFormRequest.fieldValues_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, submitFormRequest.fieldValues_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2467o(SubmitFormRequest submitFormRequest, RequestDetails requestDetails) {
        submitFormRequest.getClass();
        submitFormRequest.details_ = requestDetails;
        submitFormRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ps51 m2468q() {
        return (ps51) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "details_", "fieldValues_", FieldValue.class});
        }
        if (iOrdinal == 3) {
            return new SubmitFormRequest();
        }
        if (iOrdinal == 4) {
            return new ps51(DEFAULT_INSTANCE);
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
        synchronized (SubmitFormRequest.class) {
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
    public final ae50 m2469p() {
        return this.fieldValues_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
