package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.eiw;
import p204p.ore0;
import p204p.p1v;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateResult$AuthenticateFailure extends AbstractC0269h implements sre0 {
    private static final EsAuthenticateResult$AuthenticateFailure DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int UNKNOWNFAILURE_FIELD_NUMBER = 2;
    private int reasonCase_ = 0;
    private Object reason_;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class UnknownReason extends AbstractC0269h implements sre0 {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final UnknownReason DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int code_;
        private String message_ = "";

        static {
            UnknownReason unknownReason = new UnknownReason();
            DEFAULT_INSTANCE = unknownReason;
            AbstractC0269h.registerDefaultInstance(UnknownReason.class, unknownReason);
        }

        private UnknownReason() {
        }

        /* JADX INFO: renamed from: o */
        public static UnknownReason m3567o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"code_", "message_"});
            }
            if (iOrdinal == 3) {
                return new UnknownReason();
            }
            if (iOrdinal == 4) {
                return new C0299d(DEFAULT_INSTANCE);
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
            synchronized (UnknownReason.class) {
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

        public final String getMessage() {
            return this.message_;
        }

        /* JADX INFO: renamed from: n */
        public final int m3568n() {
            return this.code_;
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
        EsAuthenticateResult$AuthenticateFailure esAuthenticateResult$AuthenticateFailure = new EsAuthenticateResult$AuthenticateFailure();
        DEFAULT_INSTANCE = esAuthenticateResult$AuthenticateFailure;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateResult$AuthenticateFailure.class, esAuthenticateResult$AuthenticateFailure);
    }

    private EsAuthenticateResult$AuthenticateFailure() {
    }

    /* JADX INFO: renamed from: o */
    public static EsAuthenticateResult$AuthenticateFailure m3562o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"reason_", "reasonCase_", UnknownReason.class});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateResult$AuthenticateFailure();
        }
        if (iOrdinal == 4) {
            return new C0298c();
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
        synchronized (EsAuthenticateResult$AuthenticateFailure.class) {
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
    public final eiw m3563p() {
        eiw eiwVar;
        if (this.reasonCase_ != 1) {
            return eiw.success;
        }
        switch (((Integer) this.reason_).intValue()) {
            case 0:
                eiwVar = eiw.success;
                break;
            case 1:
                eiwVar = eiw.aborted;
                break;
            case 2:
                eiwVar = eiw.unsupportedResponse;
                break;
            case 3:
                eiwVar = eiw.nonSuccessfulResponse;
                break;
            case 4:
                eiwVar = eiw.httpTransportError;
                break;
            case 5:
                eiwVar = eiw.unsupportedAuthenticationMethod;
                break;
            case 6:
                eiwVar = eiw.invalidArguments;
                break;
            case 7:
                eiwVar = eiw.unknownBackendError;
                break;
            case 8:
                eiwVar = eiw.invalidCredentials;
                break;
            case 9:
                eiwVar = eiw.badRequest;
                break;
            case 10:
                eiwVar = eiw.unsupportedLoginProtocol;
                break;
            case 11:
                eiwVar = eiw.timeout;
                break;
            case 12:
                eiwVar = eiw.unknownIdentifier;
                break;
            case 13:
                eiwVar = eiw.tooManyAttempts;
                break;
            case 14:
                eiwVar = eiw.invalidPhoneNumber;
                break;
            case 15:
                eiwVar = eiw.tryAgainLater;
                break;
            case 16:
                eiwVar = eiw.hashMismatch;
                break;
            case 17:
                eiwVar = eiw.notAllowed;
                break;
            default:
                eiwVar = null;
                break;
        }
        return eiwVar == null ? eiw.UNRECOGNIZED : eiwVar;
    }

    /* JADX INFO: renamed from: q */
    public final int m3564q() {
        if (this.reasonCase_ == 1) {
            return ((Integer) this.reason_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public final int m3565r() {
        return p1v.m68844a(this.reasonCase_);
    }

    /* JADX INFO: renamed from: s */
    public final UnknownReason m3566s() {
        return this.reasonCase_ == 2 ? (UnknownReason) this.reason_ : UnknownReason.m3567o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
