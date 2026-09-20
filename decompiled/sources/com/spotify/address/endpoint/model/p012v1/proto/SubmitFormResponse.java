package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SubmitFormResponse extends AbstractC0269h implements sre0 {
    private static final SubmitFormResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int SUGGESTION_FIELD_NUMBER = 2;
    private int responseCase_ = 0;
    private Object response_;

    public static final class SubmitError extends AbstractC0269h implements sre0 {
        private static final SubmitError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 1;
        public static final int MESSAGE_ID_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private String message_ = "";
        private String messageId_ = "";

        static {
            SubmitError submitError = new SubmitError();
            DEFAULT_INSTANCE = submitError;
            AbstractC0269h.registerDefaultInstance(SubmitError.class, submitError);
        }

        private SubmitError() {
        }

        /* JADX INFO: renamed from: n */
        public static void m2478n(SubmitError submitError) {
            submitError.getClass();
            submitError.message_ = "Enter a valid address";
        }

        /* JADX INFO: renamed from: o */
        public static SubmitError m2479o() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: p */
        public static C0292m m2480p() {
            return (C0292m) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"message_", "messageId_"});
            }
            if (iOrdinal == 3) {
                return new SubmitError();
            }
            if (iOrdinal == 4) {
                return new C0292m(DEFAULT_INSTANCE);
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
            synchronized (SubmitError.class) {
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

        public final String getMessageId() {
            return this.messageId_;
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

    public static final class SubmitSuccess extends AbstractC0269h implements sre0 {
        private static final SubmitSuccess DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SAVED_ADDRESS_FIELD_NUMBER = 2;
        public static final int SUCCESS_MESSAGE_FIELD_NUMBER = 1;
        private int bitField0_;
        private SavedAddress savedAddress_;
        private String successMessage_ = "";

        static {
            SubmitSuccess submitSuccess = new SubmitSuccess();
            DEFAULT_INSTANCE = submitSuccess;
            AbstractC0269h.registerDefaultInstance(SubmitSuccess.class, submitSuccess);
        }

        private SubmitSuccess() {
        }

        /* JADX INFO: renamed from: n */
        public static void m2481n(SubmitSuccess submitSuccess, SavedAddress savedAddress) {
            submitSuccess.getClass();
            savedAddress.getClass();
            submitSuccess.savedAddress_ = savedAddress;
            submitSuccess.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: o */
        public static void m2482o(SubmitSuccess submitSuccess) {
            submitSuccess.getClass();
            submitSuccess.successMessage_ = "Your address has been saved.";
        }

        /* JADX INFO: renamed from: p */
        public static SubmitSuccess m2483p() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: s */
        public static C0293n m2484s() {
            return (C0293n) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "successMessage_", "savedAddress_"});
            }
            if (iOrdinal == 3) {
                return new SubmitSuccess();
            }
            if (iOrdinal == 4) {
                return new C0293n(DEFAULT_INSTANCE);
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
            synchronized (SubmitSuccess.class) {
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

        /* JADX INFO: renamed from: q */
        public final SavedAddress m2485q() {
            SavedAddress savedAddress = this.savedAddress_;
            return savedAddress == null ? SavedAddress.m2452r() : savedAddress;
        }

        /* JADX INFO: renamed from: r */
        public final String m2486r() {
            return this.successMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Suggestion extends AbstractC0269h implements sre0 {
        public static final int ACCEPT_CTA_FIELD_NUMBER = 8;
        public static final int BODY_FIELD_NUMBER = 2;
        public static final int CANCEL_CTA_FIELD_NUMBER = 7;
        private static final Suggestion DEFAULT_INSTANCE;
        public static final int FIELD_VALUES_FIELD_NUMBER = 9;
        private static volatile r2n0 PARSER = null;
        public static final int SUBMITTED_ADDRESS_LABEL_FIELD_NUMBER = 3;
        public static final int SUBMITTED_ADDRESS_LINE_FIELD_NUMBER = 4;
        public static final int SUGGESTED_ADDRESS_LABEL_FIELD_NUMBER = 5;
        public static final int SUGGESTED_ADDRESS_LINE_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String body_ = "";
        private String submittedAddressLabel_ = "";
        private ae50 submittedAddressLine_ = AbstractC0269h.emptyProtobufList();
        private String suggestedAddressLabel_ = "";
        private ae50 suggestedAddressLine_ = AbstractC0269h.emptyProtobufList();
        private String cancelCta_ = "";
        private String acceptCta_ = "";
        private ae50 fieldValues_ = AbstractC0269h.emptyProtobufList();

        static {
            Suggestion suggestion = new Suggestion();
            DEFAULT_INSTANCE = suggestion;
            AbstractC0269h.registerDefaultInstance(Suggestion.class, suggestion);
        }

        private Suggestion() {
        }

        /* JADX INFO: renamed from: F */
        public static C0294o m2487F() {
            return (C0294o) DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: renamed from: G */
        public static Suggestion m2488G(byte[] bArr) {
            return (Suggestion) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        /* JADX INFO: renamed from: n */
        public static void m2489n(Suggestion suggestion, ArrayList arrayList) {
            ae50 ae50Var = suggestion.fieldValues_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                suggestion.fieldValues_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(arrayList, suggestion.fieldValues_);
        }

        /* JADX INFO: renamed from: o */
        public static void m2490o(Suggestion suggestion, Iterable iterable) {
            ae50 ae50Var = suggestion.submittedAddressLine_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                suggestion.submittedAddressLine_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(iterable, suggestion.submittedAddressLine_);
        }

        /* JADX INFO: renamed from: p */
        public static void m2491p(Suggestion suggestion, Iterable iterable) {
            ae50 ae50Var = suggestion.suggestedAddressLine_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                suggestion.suggestedAddressLine_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(iterable, suggestion.suggestedAddressLine_);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m2492q(Suggestion suggestion) {
            suggestion.getClass();
            suggestion.acceptCta_ = "Confirm Address";
        }

        /* JADX INFO: renamed from: r */
        public static void m2493r(Suggestion suggestion) {
            suggestion.getClass();
            suggestion.body_ = "This address is invalid or incomplete. Check your details and try again.";
        }

        /* JADX INFO: renamed from: s */
        public static void m2494s(Suggestion suggestion) {
            suggestion.getClass();
            suggestion.cancelCta_ = "Edit";
        }

        /* JADX INFO: renamed from: t */
        public static void m2495t(Suggestion suggestion) {
            suggestion.getClass();
            suggestion.submittedAddressLabel_ = "You entered:";
        }

        /* JADX INFO: renamed from: u */
        public static void m2496u(Suggestion suggestion) {
            suggestion.getClass();
            suggestion.suggestedAddressLabel_ = "Suggested address:";
        }

        /* JADX INFO: renamed from: v */
        public static void m2497v(Suggestion suggestion) {
            suggestion.getClass();
            suggestion.title_ = "Confirm your address";
        }

        /* JADX INFO: renamed from: z */
        public static Suggestion m2498z() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: A */
        public final ae50 m2499A() {
            return this.fieldValues_;
        }

        /* JADX INFO: renamed from: B */
        public final String m2500B() {
            return this.submittedAddressLabel_;
        }

        /* JADX INFO: renamed from: C */
        public final ae50 m2501C() {
            return this.submittedAddressLine_;
        }

        /* JADX INFO: renamed from: D */
        public final String m2502D() {
            return this.suggestedAddressLabel_;
        }

        /* JADX INFO: renamed from: E */
        public final ae50 m2503E() {
            return this.suggestedAddressLine_;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ȉ\u0006Ț\u0007Ȉ\bȈ\t\u001b", new Object[]{"title_", "body_", "submittedAddressLabel_", "submittedAddressLine_", "suggestedAddressLabel_", "suggestedAddressLine_", "cancelCta_", "acceptCta_", "fieldValues_", FieldValue.class});
            }
            if (iOrdinal == 3) {
                return new Suggestion();
            }
            if (iOrdinal == 4) {
                return new C0294o(DEFAULT_INSTANCE);
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
            synchronized (Suggestion.class) {
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

        public final String getTitle() {
            return this.title_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: w */
        public final String m2504w() {
            return this.acceptCta_;
        }

        /* JADX INFO: renamed from: x */
        public final String m2505x() {
            return this.body_;
        }

        /* JADX INFO: renamed from: y */
        public final String m2506y() {
            return this.cancelCta_;
        }
    }

    static {
        SubmitFormResponse submitFormResponse = new SubmitFormResponse();
        DEFAULT_INSTANCE = submitFormResponse;
        AbstractC0269h.registerDefaultInstance(SubmitFormResponse.class, submitFormResponse);
    }

    private SubmitFormResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2470n(SubmitFormResponse submitFormResponse, SubmitError submitError) {
        submitFormResponse.getClass();
        submitError.getClass();
        submitFormResponse.response_ = submitError;
        submitFormResponse.responseCase_ = 3;
    }

    /* JADX INFO: renamed from: o */
    public static void m2471o(SubmitFormResponse submitFormResponse, SubmitSuccess submitSuccess) {
        submitFormResponse.getClass();
        submitSuccess.getClass();
        submitFormResponse.response_ = submitSuccess;
        submitFormResponse.responseCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m2472p(SubmitFormResponse submitFormResponse, Suggestion suggestion) {
        submitFormResponse.getClass();
        suggestion.getClass();
        submitFormResponse.response_ = suggestion;
        submitFormResponse.responseCase_ = 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static C0291l m2473u() {
        return (C0291l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"response_", "responseCase_", SubmitSuccess.class, Suggestion.class, SubmitError.class});
        }
        if (iOrdinal == 3) {
            return new SubmitFormResponse();
        }
        if (iOrdinal == 4) {
            return new C0291l(DEFAULT_INSTANCE);
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
        synchronized (SubmitFormResponse.class) {
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

    /* JADX INFO: renamed from: q */
    public final SubmitError m2474q() {
        return this.responseCase_ == 3 ? (SubmitError) this.response_ : SubmitError.m2479o();
    }

    /* JADX INFO: renamed from: r */
    public final int m2475r() {
        int i = this.responseCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public final SubmitSuccess m2476s() {
        return this.responseCase_ == 1 ? (SubmitSuccess) this.response_ : SubmitSuccess.m2483p();
    }

    /* JADX INFO: renamed from: t */
    public final Suggestion m2477t() {
        return this.responseCase_ == 2 ? (Suggestion) this.response_ : Suggestion.m2498z();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
