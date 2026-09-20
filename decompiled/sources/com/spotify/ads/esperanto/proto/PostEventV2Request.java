package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.dbq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class PostEventV2Request extends AbstractC0269h implements sre0 {
    public static final int CONTENT_URI_FIELD_NUMBER = 2;
    private static final PostEventV2Request DEFAULT_INSTANCE;
    public static final int DEMAND_STATUS_FIELD_NUMBER = 3;
    public static final int ELIGIBILITY_STATUS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 7;
    public static final int SLOT_ID_FIELD_NUMBER = 1;
    public static final int TRIGGER_ORIGIN_FIELD_NUMBER = 5;
    public static final int TRIGGER_STATES_FIELD_NUMBER = 6;
    private int bitField0_;
    private String slotId_ = "";
    private String contentUri_ = "";
    private String demandStatus_ = "";
    private String eligibilityStatus_ = "";
    private String triggerOrigin_ = "";
    private ae50 triggerStates_ = AbstractC0269h.emptyProtobufList();
    private String requestId_ = "";

    static {
        PostEventV2Request postEventV2Request = new PostEventV2Request();
        DEFAULT_INSTANCE = postEventV2Request;
        AbstractC0269h.registerDefaultInstance(PostEventV2Request.class, postEventV2Request);
    }

    private PostEventV2Request() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2667n(PostEventV2Request postEventV2Request, Iterable iterable) {
        ae50 ae50Var = postEventV2Request.triggerStates_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            postEventV2Request.triggerStates_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, postEventV2Request.triggerStates_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2668o(PostEventV2Request postEventV2Request, String str) {
        postEventV2Request.getClass();
        str.getClass();
        postEventV2Request.contentUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2669p(PostEventV2Request postEventV2Request, String str) {
        postEventV2Request.getClass();
        str.getClass();
        postEventV2Request.demandStatus_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2670q(PostEventV2Request postEventV2Request, String str) {
        postEventV2Request.getClass();
        str.getClass();
        postEventV2Request.eligibilityStatus_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m2671r(PostEventV2Request postEventV2Request, String str) {
        postEventV2Request.getClass();
        str.getClass();
        postEventV2Request.bitField0_ |= 1;
        postEventV2Request.requestId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2672s(PostEventV2Request postEventV2Request, String str) {
        postEventV2Request.getClass();
        str.getClass();
        postEventV2Request.slotId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m2673t(PostEventV2Request postEventV2Request, String str) {
        postEventV2Request.getClass();
        postEventV2Request.triggerOrigin_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static dbq0 m2674u() {
        return (dbq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ț\u0007ለ\u0000", new Object[]{"bitField0_", "slotId_", "contentUri_", "demandStatus_", "eligibilityStatus_", "triggerOrigin_", "triggerStates_", "requestId_"});
        }
        if (iOrdinal == 3) {
            return new PostEventV2Request();
        }
        if (iOrdinal == 4) {
            return new dbq0(DEFAULT_INSTANCE);
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
        synchronized (PostEventV2Request.class) {
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
