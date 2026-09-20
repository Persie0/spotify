package com.spotify.wrapped.p194v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a9j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ConsumerShareRequest extends AbstractC0269h implements sre0 {
    private static final ConsumerShareRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SCHEME_FIELD_NUMBER = 2;
    public static final int SHARE_CARD_ID_FIELD_NUMBER = 1;
    public static final int STORY_PARAMETERS_FIELD_NUMBER = 3;
    private int bitField0_;
    private ConsumerShareRequestParameters storyParameters_;
    private String shareCardId_ = "";
    private String scheme_ = "";

    static {
        ConsumerShareRequest consumerShareRequest = new ConsumerShareRequest();
        DEFAULT_INSTANCE = consumerShareRequest;
        AbstractC0269h.registerDefaultInstance(ConsumerShareRequest.class, consumerShareRequest);
    }

    private ConsumerShareRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23140n(ConsumerShareRequest consumerShareRequest, String str) {
        consumerShareRequest.getClass();
        str.getClass();
        consumerShareRequest.scheme_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m23141o(ConsumerShareRequest consumerShareRequest, String str) {
        consumerShareRequest.getClass();
        str.getClass();
        consumerShareRequest.shareCardId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m23142p(ConsumerShareRequest consumerShareRequest, ConsumerShareRequestParameters consumerShareRequestParameters) {
        consumerShareRequest.getClass();
        consumerShareRequestParameters.getClass();
        consumerShareRequest.storyParameters_ = consumerShareRequestParameters;
        consumerShareRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static a9j m23143q() {
        return (a9j) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "shareCardId_", "scheme_", "storyParameters_"});
        }
        if (iOrdinal == 3) {
            return new ConsumerShareRequest();
        }
        if (iOrdinal == 4) {
            return new a9j(DEFAULT_INSTANCE);
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
        synchronized (ConsumerShareRequest.class) {
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
