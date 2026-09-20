package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowBottomSheet extends AbstractC0269h implements sre0 {
    public static final int BANNER_TEXT_FIELD_NUMBER = 1;
    public static final int BUTTONS_FIELD_NUMBER = 5;
    private static final ShowBottomSheet DEFAULT_INSTANCE;
    public static final int ICON_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String bannerText_ = "";
    private String iconUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private ae50 buttons_ = AbstractC0269h.emptyProtobufList();

    static {
        ShowBottomSheet showBottomSheet = new ShowBottomSheet();
        DEFAULT_INSTANCE = showBottomSheet;
        AbstractC0269h.registerDefaultInstance(ShowBottomSheet.class, showBottomSheet);
    }

    private ShowBottomSheet() {
    }

    /* JADX INFO: renamed from: p */
    public static ShowBottomSheet m13262p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005\u001b", new Object[]{"bitField0_", "bannerText_", "iconUri_", "title_", "subtitle_", "buttons_", ActionableButton.class});
        }
        if (iOrdinal == 3) {
            return new ShowBottomSheet();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 6);
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
        synchronized (ShowBottomSheet.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m13263n() {
        return this.bannerText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m13264o() {
        return this.buttons_;
    }

    /* JADX INFO: renamed from: q */
    public final String m13265q() {
        return this.iconUri_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13266r() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13267s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m13268t() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13269u() {
        return (this.bitField0_ & 4) != 0;
    }
}
