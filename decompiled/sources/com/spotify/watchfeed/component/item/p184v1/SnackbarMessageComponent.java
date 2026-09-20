package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SnackbarMessageComponent extends AbstractC0269h implements sre0 {
    public static final int BUTTON_FIELD_NUMBER = 2;
    private static final SnackbarMessageComponent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_DURATION_MS_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private SnackbarButton button_;
    private long showDurationMs_;
    private String text_ = "";

    public static final class SnackbarButton extends AbstractC0269h implements sre0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
        private static final SnackbarButton DEFAULT_INSTANCE;
        public static final int NAVIGATION_URI_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String navigationUri_ = "";
        private String accessibilityText_ = "";

        static {
            SnackbarButton snackbarButton = new SnackbarButton();
            DEFAULT_INSTANCE = snackbarButton;
            AbstractC0269h.registerDefaultInstance(SnackbarButton.class, snackbarButton);
        }

        private SnackbarButton() {
        }

        /* JADX INFO: renamed from: o */
        public static SnackbarButton m22718o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"text_", "navigationUri_", "accessibilityText_"});
            }
            if (iOrdinal == 3) {
                return new SnackbarButton();
            }
            if (iOrdinal == 4) {
                return new C1346g(DEFAULT_INSTANCE);
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
            synchronized (SnackbarButton.class) {
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
        public final String m22719n() {
            return this.accessibilityText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final String m22720p() {
            return this.navigationUri_;
        }

        /* JADX INFO: renamed from: q */
        public final String m22721q() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SnackbarMessageComponent snackbarMessageComponent = new SnackbarMessageComponent();
        DEFAULT_INSTANCE = snackbarMessageComponent;
        AbstractC0269h.registerDefaultInstance(SnackbarMessageComponent.class, snackbarMessageComponent);
    }

    private SnackbarMessageComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static SnackbarMessageComponent m22713r(gva gvaVar) {
        return (SnackbarMessageComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002", new Object[]{"bitField0_", "text_", "button_", "showDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new SnackbarMessageComponent();
        }
        if (iOrdinal == 4) {
            return new C1345f(DEFAULT_INSTANCE);
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
        synchronized (SnackbarMessageComponent.class) {
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
    public final SnackbarButton m22714n() {
        SnackbarButton snackbarButton = this.button_;
        return snackbarButton == null ? SnackbarButton.m22718o() : snackbarButton;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m22715o() {
        return this.showDurationMs_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22716p() {
        return this.text_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22717q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
