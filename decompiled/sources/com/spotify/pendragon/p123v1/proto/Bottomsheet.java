package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pi9;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes2.dex */
public final class Bottomsheet extends AbstractC0269h implements sre0 {
    public static final int BASE_BOTTOMSHEET_FIELD_NUMBER = 6;
    public static final int BASIC_BOTTOMSHEET_FIELD_NUMBER = 1;
    public static final int BUTTONS_FIELD_NUMBER = 5;
    private static final Bottomsheet DEFAULT_INSTANCE;
    public static final int FULL_BLEED_BOTTOMSHEET_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RICH_BOTTOMSHEET_FIELD_NUMBER = 2;
    private Object bottomsheetTemplate_;
    private int bottomsheetTemplateCase_ = 0;
    private ae50 buttons_ = AbstractC0269h.emptyProtobufList();

    static {
        Bottomsheet bottomsheet = new Bottomsheet();
        DEFAULT_INSTANCE = bottomsheet;
        AbstractC0269h.registerDefaultInstance(Bottomsheet.class, bottomsheet);
    }

    private Bottomsheet() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static Bottomsheet m17114s() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0005\u001b\u0006<\u0000", new Object[]{"bottomsheetTemplate_", "bottomsheetTemplateCase_", BasicBottomsheet.class, RichBottomsheet.class, FullBleedBottomsheet.class, "buttons_", Button.class, BaseBottomsheet.class});
        }
        if (iOrdinal == 3) {
            return new Bottomsheet();
        }
        if (iOrdinal == 4) {
            return new z79(16);
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
        synchronized (Bottomsheet.class) {
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
    public final BaseBottomsheet m17115o() {
        return this.bottomsheetTemplateCase_ == 6 ? (BaseBottomsheet) this.bottomsheetTemplate_ : BaseBottomsheet.m17022p();
    }

    /* JADX INFO: renamed from: p */
    public final BasicBottomsheet m17116p() {
        return this.bottomsheetTemplateCase_ == 1 ? (BasicBottomsheet) this.bottomsheetTemplate_ : BasicBottomsheet.m17103o();
    }

    /* JADX INFO: renamed from: q */
    public final int m17117q() {
        return pi9.m70078c(this.bottomsheetTemplateCase_);
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m17118r() {
        return this.buttons_;
    }

    /* JADX INFO: renamed from: t */
    public final FullBleedBottomsheet m17119t() {
        return this.bottomsheetTemplateCase_ == 3 ? (FullBleedBottomsheet) this.bottomsheetTemplate_ : FullBleedBottomsheet.m17187o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final RichBottomsheet m17120u() {
        return this.bottomsheetTemplateCase_ == 2 ? (RichBottomsheet) this.bottomsheetTemplate_ : RichBottomsheet.m17268o();
    }
}
