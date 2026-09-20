package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qk91;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xry;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchMessageRequest extends AbstractC0269h implements sre0 {
    private static final FetchMessageRequest DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int NATIVE_COMPONENT_VERSION_FIELD_NUMBER = 7;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PURCHASE_ALLOWED_FIELD_NUMBER = 6;
    public static final int TRIGGER_PATTERNS_FIELD_NUMBER = 3;
    public static final int TRIGGER_TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private int nativeComponentVersion_;
    private boolean purchaseAllowed_;
    private int triggerType_;
    private String locale_ = "";
    private ae50 triggerPatterns_ = AbstractC0269h.emptyProtobufList();
    private String uri_ = "";
    private String opportunityId_ = "";

    static {
        FetchMessageRequest fetchMessageRequest = new FetchMessageRequest();
        DEFAULT_INSTANCE = fetchMessageRequest;
        AbstractC0269h.registerDefaultInstance(FetchMessageRequest.class, fetchMessageRequest);
    }

    private FetchMessageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17165n(FetchMessageRequest fetchMessageRequest, Iterable iterable) {
        ae50 ae50Var = fetchMessageRequest.triggerPatterns_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            fetchMessageRequest.triggerPatterns_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, fetchMessageRequest.triggerPatterns_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17166o(FetchMessageRequest fetchMessageRequest, String str) {
        fetchMessageRequest.getClass();
        str.getClass();
        fetchMessageRequest.locale_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17167p(FetchMessageRequest fetchMessageRequest) {
        fetchMessageRequest.nativeComponentVersion_ = 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17168q(FetchMessageRequest fetchMessageRequest, String str) {
        fetchMessageRequest.getClass();
        str.getClass();
        fetchMessageRequest.opportunityId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m17169r(FetchMessageRequest fetchMessageRequest, boolean z) {
        fetchMessageRequest.bitField0_ |= 1;
        fetchMessageRequest.purchaseAllowed_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m17170s(FetchMessageRequest fetchMessageRequest, qk91 qk91Var) {
        fetchMessageRequest.getClass();
        fetchMessageRequest.triggerType_ = qk91Var.getNumber();
    }

    /* JADX INFO: renamed from: t */
    public static void m17171t(FetchMessageRequest fetchMessageRequest, String str) {
        fetchMessageRequest.getClass();
        fetchMessageRequest.uri_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static xry m17172u() {
        return (xry) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ț\u0004Ȉ\u0005Ȉ\u0006ဇ\u0000\u0007\u0004", new Object[]{"bitField0_", "locale_", "triggerType_", "triggerPatterns_", "uri_", "opportunityId_", "purchaseAllowed_", "nativeComponentVersion_"});
        }
        if (iOrdinal == 3) {
            return new FetchMessageRequest();
        }
        if (iOrdinal == 4) {
            return new xry(DEFAULT_INSTANCE);
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
        synchronized (FetchMessageRequest.class) {
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
