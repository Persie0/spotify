package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rp71;
import p204p.sre0;
import p204p.xq71;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class TimelineAction extends AbstractC0269h implements sre0 {
    public static final int BEHAVIOR_FIELD_NUMBER = 1;
    private static final TimelineAction DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 4;
    public static final int ICON_FIELD_NUMBER = 7;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SELECTED_PRESENTATION_FIELD_NUMBER = 8;
    public static final int SNACKBAR_OVERRIDES_FIELD_NUMBER = 9;
    public static final int URI_FIELD_NUMBER = 6;
    private int behavior_;
    private int bitField0_;
    private boolean disabled_;
    private int icon_;
    private PlaceHolderText label_;
    private SelectedPresentation selectedPresentation_;
    private SnackbarOverrides snackbarOverrides_;
    private String uri_ = "";

    public static final class SelectedPresentation extends AbstractC0269h implements sre0 {
        private static final SelectedPresentation DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 2;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private int icon_;
        private PlaceHolderText label_;

        static {
            SelectedPresentation selectedPresentation = new SelectedPresentation();
            DEFAULT_INSTANCE = selectedPresentation;
            AbstractC0269h.registerDefaultInstance(SelectedPresentation.class, selectedPresentation);
        }

        private SelectedPresentation() {
        }

        /* JADX INFO: renamed from: n */
        public static SelectedPresentation m7152n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "label_", "icon_"});
            }
            if (iOrdinal == 3) {
                return new SelectedPresentation();
            }
            if (iOrdinal == 4) {
                return new C0545b(DEFAULT_INSTANCE);
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
            synchronized (SelectedPresentation.class) {
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
        public final xq71 m7153o() {
            xq71 xq71VarM91818a = xq71.m91818a(this.icon_);
            return xq71VarM91818a == null ? xq71.UNRECOGNIZED : xq71VarM91818a;
        }

        /* JADX INFO: renamed from: p */
        public final PlaceHolderText m7154p() {
            PlaceHolderText placeHolderText = this.label_;
            return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m7155q() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SnackbarOverrides extends AbstractC0269h implements sre0 {
        public static final int ACTION_SNACKBAR_FIELD_NUMBER = 1;
        private static final SnackbarOverrides DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SELECTED_ACTION_SNACKBAR_FIELD_NUMBER = 2;
        private int bitField0_;
        private String actionSnackbar_ = "";
        private String selectedActionSnackbar_ = "";

        static {
            SnackbarOverrides snackbarOverrides = new SnackbarOverrides();
            DEFAULT_INSTANCE = snackbarOverrides;
            AbstractC0269h.registerDefaultInstance(SnackbarOverrides.class, snackbarOverrides);
        }

        private SnackbarOverrides() {
        }

        /* JADX INFO: renamed from: o */
        public static SnackbarOverrides m7156o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "actionSnackbar_", "selectedActionSnackbar_"});
            }
            if (iOrdinal == 3) {
                return new SnackbarOverrides();
            }
            if (iOrdinal == 4) {
                return new C0546c(DEFAULT_INSTANCE);
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
            synchronized (SnackbarOverrides.class) {
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
        public final String m7157n() {
            return this.actionSnackbar_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final String m7158p() {
            return this.selectedActionSnackbar_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        TimelineAction timelineAction = new TimelineAction();
        DEFAULT_INSTANCE = timelineAction;
        AbstractC0269h.registerDefaultInstance(TimelineAction.class, timelineAction);
    }

    private TimelineAction() {
    }

    /* JADX INFO: renamed from: o */
    public static TimelineAction m7144o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0004\u0007\u0006ለ\u0001\u0007ဌ\u0002\bဉ\u0003\tဉ\u0004", new Object[]{"bitField0_", "behavior_", "label_", "disabled_", "uri_", "icon_", "selectedPresentation_", "snackbarOverrides_"});
        }
        if (iOrdinal == 3) {
            return new TimelineAction();
        }
        if (iOrdinal == 4) {
            return new C0544a(DEFAULT_INSTANCE);
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
        synchronized (TimelineAction.class) {
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

    public final boolean getDisabled() {
        return this.disabled_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasUri() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final rp71 m7145n() {
        rp71 rp71Var;
        switch (this.behavior_) {
            case 0:
                rp71Var = rp71.BEHAVIOR_UNSPECIFIED;
                break;
            case 1:
                rp71Var = rp71.EXTERNAL_PURCHASE;
                break;
            case 2:
                rp71Var = rp71.CURATE;
                break;
            case 3:
                rp71Var = rp71.CANT_ATTEND;
                break;
            case 4:
                rp71Var = rp71.NOT_INTERESTED;
                break;
            case 5:
                rp71Var = rp71.SEE_ALL_SHOWS;
                break;
            case 6:
                rp71Var = rp71.NAVIGATE;
                break;
            case 7:
                rp71Var = rp71.SHARE;
                break;
            default:
                rp71Var = null;
                break;
        }
        return rp71Var == null ? rp71.UNRECOGNIZED : rp71Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final xq71 m7146p() {
        xq71 xq71VarM91818a = xq71.m91818a(this.icon_);
        return xq71VarM91818a == null ? xq71.UNRECOGNIZED : xq71VarM91818a;
    }

    /* JADX INFO: renamed from: q */
    public final PlaceHolderText m7147q() {
        PlaceHolderText placeHolderText = this.label_;
        return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
    }

    /* JADX INFO: renamed from: r */
    public final SelectedPresentation m7148r() {
        SelectedPresentation selectedPresentation = this.selectedPresentation_;
        return selectedPresentation == null ? SelectedPresentation.m7152n() : selectedPresentation;
    }

    /* JADX INFO: renamed from: s */
    public final SnackbarOverrides m7149s() {
        SnackbarOverrides snackbarOverrides = this.snackbarOverrides_;
        return snackbarOverrides == null ? SnackbarOverrides.m7156o() : snackbarOverrides;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7150t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7151u() {
        return (this.bitField0_ & 8) != 0;
    }
}
