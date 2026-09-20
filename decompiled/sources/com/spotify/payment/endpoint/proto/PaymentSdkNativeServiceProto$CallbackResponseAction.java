package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$CallbackResponseAction extends AbstractC0269h implements sre0 {
    public static final int ABORT_SESSION_FIELD_NUMBER = 4;
    private static final PaymentSdkNativeServiceProto$CallbackResponseAction DEFAULT_INSTANCE;
    public static final int DELIVERED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_FIELD_NUMBER = 1;
    public static final int WAIT_FIELD_NUMBER = 3;
    private int responseActionCase_ = 0;
    private Object responseAction_;

    public static final class Delivered extends AbstractC0269h implements sre0 {
        private static final Delivered DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            Delivered delivered = new Delivered();
            DEFAULT_INSTANCE = delivered;
            AbstractC0269h.registerDefaultInstance(Delivered.class, delivered);
        }

        private Delivered() {
        }

        /* JADX INFO: renamed from: n */
        public static Delivered m16709n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
            }
            if (iOrdinal == 3) {
                return new Delivered();
            }
            if (iOrdinal == 4) {
                return new C1113g(DEFAULT_INSTANCE);
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
            synchronized (Delivered.class) {
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

        public final String getUrl() {
            return this.url_;
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

    static {
        PaymentSdkNativeServiceProto$CallbackResponseAction paymentSdkNativeServiceProto$CallbackResponseAction = new PaymentSdkNativeServiceProto$CallbackResponseAction();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CallbackResponseAction;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$CallbackResponseAction.class, paymentSdkNativeServiceProto$CallbackResponseAction);
    }

    private PaymentSdkNativeServiceProto$CallbackResponseAction() {
    }

    /* JADX INFO: renamed from: n */
    public static PaymentSdkNativeServiceProto$CallbackResponseAction m16704n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"responseAction_", "responseActionCase_", PaymentSdkNativeServiceProto$ResponseAction.Redirect.class, Delivered.class, PaymentSdkNativeServiceProto$ResponseAction.Wait.class, PaymentSdkNativeServiceProto$ResponseAction.AbortSession.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$CallbackResponseAction();
        }
        if (iOrdinal == 4) {
            return new C1111f(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$CallbackResponseAction.class) {
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
    public final Delivered m16705o() {
        return this.responseActionCase_ == 2 ? (Delivered) this.responseAction_ : Delivered.m16709n();
    }

    /* JADX INFO: renamed from: p */
    public final PaymentSdkNativeServiceProto$ResponseAction.Redirect m16706p() {
        return this.responseActionCase_ == 1 ? (PaymentSdkNativeServiceProto$ResponseAction.Redirect) this.responseAction_ : PaymentSdkNativeServiceProto$ResponseAction.Redirect.m16895o();
    }

    /* JADX INFO: renamed from: q */
    public final int m16707q() {
        int i = this.responseActionCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: r */
    public final PaymentSdkNativeServiceProto$ResponseAction.Wait m16708r() {
        return this.responseActionCase_ == 3 ? (PaymentSdkNativeServiceProto$ResponseAction.Wait) this.responseAction_ : PaymentSdkNativeServiceProto$ResponseAction.Wait.m16897n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
