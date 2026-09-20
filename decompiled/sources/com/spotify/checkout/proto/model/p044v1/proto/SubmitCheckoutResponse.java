package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SubmitCheckoutResponse extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_ITEM_UNAVAILABLE_FIELD_NUMBER = 4;
    public static final int CHECKOUT_STATUS_FIELD_NUMBER = 5;
    private static final SubmitCheckoutResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int UPDATE_SPOTIFY_CHECKOUT_FIELD_NUMBER = 3;
    private int responseCase_ = 0;
    private Object response_;

    public static final class Dialog extends AbstractC0269h implements sre0 {
        private static final Dialog DEFAULT_INSTANCE;
        public static final int DISMISS_CTA_LABEL_FIELD_NUMBER = 3;
        public static final int PARAGRAPHS_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private ae50 paragraphs_ = AbstractC0269h.emptyProtobufList();
        private String dismissCtaLabel_ = "";

        static {
            Dialog dialog = new Dialog();
            DEFAULT_INSTANCE = dialog;
            AbstractC0269h.registerDefaultInstance(Dialog.class, dialog);
        }

        private Dialog() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6467n(Dialog dialog, List list) {
            ae50 ae50Var = dialog.paragraphs_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                dialog.paragraphs_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(list, dialog.paragraphs_);
        }

        /* JADX INFO: renamed from: o */
        public static void m6468o(Dialog dialog) {
            dialog.getClass();
            dialog.dismissCtaLabel_ = "Dismiss dialog";
        }

        /* JADX INFO: renamed from: p */
        public static void m6469p(Dialog dialog) {
            dialog.getClass();
            dialog.title_ = "Dialog title";
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static Dialog m6470q() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: t */
        public static C0498j1 m6471t() {
            return (C0498j1) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ", new Object[]{"title_", "paragraphs_", "dismissCtaLabel_"});
            }
            if (iOrdinal == 3) {
                return new Dialog();
            }
            if (iOrdinal == 4) {
                return new C0498j1(DEFAULT_INSTANCE);
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
            synchronized (Dialog.class) {
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

        /* JADX INFO: renamed from: r */
        public final String m6472r() {
            return this.dismissCtaLabel_;
        }

        /* JADX INFO: renamed from: s */
        public final ae50 m6473s() {
            return this.paragraphs_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Success extends AbstractC0269h implements sre0 {
        private static final Success DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            Success success = new Success();
            DEFAULT_INSTANCE = success;
            AbstractC0269h.registerDefaultInstance(Success.class, success);
        }

        private Success() {
        }

        /* JADX INFO: renamed from: n */
        public static Success m6474n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Success();
            }
            if (iOrdinal == 4) {
                return new C0501k1(DEFAULT_INSTANCE);
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
            synchronized (Success.class) {
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

    public static final class UpdateSpotifyCheckout extends AbstractC0269h implements sre0 {
        private static final UpdateSpotifyCheckout DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int SPOTIFY_CHECKOUT_FIELD_NUMBER = 1;
        private int bitField0_;
        private Dialog dialog_;
        private SpotifyCheckoutNative spotifyCheckout_;

        static {
            UpdateSpotifyCheckout updateSpotifyCheckout = new UpdateSpotifyCheckout();
            DEFAULT_INSTANCE = updateSpotifyCheckout;
            AbstractC0269h.registerDefaultInstance(UpdateSpotifyCheckout.class, updateSpotifyCheckout);
        }

        private UpdateSpotifyCheckout() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6475n(UpdateSpotifyCheckout updateSpotifyCheckout, Dialog dialog) {
            updateSpotifyCheckout.getClass();
            dialog.getClass();
            updateSpotifyCheckout.dialog_ = dialog;
            updateSpotifyCheckout.bitField0_ |= 2;
        }

        /* JADX INFO: renamed from: o */
        public static void m6476o(UpdateSpotifyCheckout updateSpotifyCheckout, SpotifyCheckoutNative spotifyCheckoutNative) {
            updateSpotifyCheckout.getClass();
            spotifyCheckoutNative.getClass();
            updateSpotifyCheckout.spotifyCheckout_ = spotifyCheckoutNative;
            updateSpotifyCheckout.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: p */
        public static UpdateSpotifyCheckout m6477p() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: t */
        public static C0504l1 m6478t() {
            return (C0504l1) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "spotifyCheckout_", "dialog_"});
            }
            if (iOrdinal == 3) {
                return new UpdateSpotifyCheckout();
            }
            if (iOrdinal == 4) {
                return new C0504l1(DEFAULT_INSTANCE);
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
            synchronized (UpdateSpotifyCheckout.class) {
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
        public final Dialog m6479q() {
            Dialog dialog = this.dialog_;
            return dialog == null ? Dialog.m6470q() : dialog;
        }

        /* JADX INFO: renamed from: r */
        public final SpotifyCheckoutNative m6480r() {
            SpotifyCheckoutNative spotifyCheckoutNative = this.spotifyCheckout_;
            return spotifyCheckoutNative == null ? SpotifyCheckoutNative.m6325A() : spotifyCheckoutNative;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m6481s() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SubmitCheckoutResponse submitCheckoutResponse = new SubmitCheckoutResponse();
        DEFAULT_INSTANCE = submitCheckoutResponse;
        AbstractC0269h.registerDefaultInstance(SubmitCheckoutResponse.class, submitCheckoutResponse);
    }

    private SubmitCheckoutResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6455n(SubmitCheckoutResponse submitCheckoutResponse, CheckoutItemUnavailable checkoutItemUnavailable) {
        submitCheckoutResponse.getClass();
        checkoutItemUnavailable.getClass();
        submitCheckoutResponse.response_ = checkoutItemUnavailable;
        submitCheckoutResponse.responseCase_ = 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m6456o(SubmitCheckoutResponse submitCheckoutResponse, CheckoutStatus checkoutStatus) {
        submitCheckoutResponse.getClass();
        checkoutStatus.getClass();
        submitCheckoutResponse.response_ = checkoutStatus;
        submitCheckoutResponse.responseCase_ = 5;
    }

    /* JADX INFO: renamed from: p */
    public static void m6457p(SubmitCheckoutResponse submitCheckoutResponse, Error error) {
        submitCheckoutResponse.getClass();
        error.getClass();
        submitCheckoutResponse.response_ = error;
        submitCheckoutResponse.responseCase_ = 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6458q(SubmitCheckoutResponse submitCheckoutResponse, Success success) {
        submitCheckoutResponse.getClass();
        success.getClass();
        submitCheckoutResponse.response_ = success;
        submitCheckoutResponse.responseCase_ = 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m6459r(SubmitCheckoutResponse submitCheckoutResponse, UpdateSpotifyCheckout updateSpotifyCheckout) {
        submitCheckoutResponse.getClass();
        updateSpotifyCheckout.getClass();
        submitCheckoutResponse.response_ = updateSpotifyCheckout;
        submitCheckoutResponse.responseCase_ = 3;
    }

    /* JADX INFO: renamed from: y */
    public static C0495i1 m6460y() {
        return (C0495i1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"response_", "responseCase_", Success.class, Error.class, UpdateSpotifyCheckout.class, CheckoutItemUnavailable.class, CheckoutStatus.class});
        }
        if (iOrdinal == 3) {
            return new SubmitCheckoutResponse();
        }
        if (iOrdinal == 4) {
            return new C0495i1(DEFAULT_INSTANCE);
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
        synchronized (SubmitCheckoutResponse.class) {
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

    /* JADX INFO: renamed from: s */
    public final CheckoutItemUnavailable m6461s() {
        return this.responseCase_ == 4 ? (CheckoutItemUnavailable) this.response_ : CheckoutItemUnavailable.m5986r();
    }

    /* JADX INFO: renamed from: t */
    public final CheckoutStatus m6462t() {
        return this.responseCase_ == 5 ? (CheckoutStatus) this.response_ : CheckoutStatus.m5994s();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Error m6463u() {
        return this.responseCase_ == 2 ? (Error) this.response_ : Error.m6010y();
    }

    /* JADX INFO: renamed from: v */
    public final int m6464v() {
        int i = this.responseCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: w */
    public final UpdateSpotifyCheckout m6465w() {
        return this.responseCase_ == 3 ? (UpdateSpotifyCheckout) this.response_ : UpdateSpotifyCheckout.m6477p();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m6466x() {
        return this.responseCase_ == 1;
    }
}
