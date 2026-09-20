package com.spotify.addonconsideration.p011v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes4.dex */
public final class EmphasizedIconListItem extends AbstractC0269h implements sre0 {
    private static final EmphasizedIconListItem DEFAULT_INSTANCE;
    public static final int ICON_COLOR_FIELD_NUMBER = 2;
    public static final int ICON_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String icon_ = "";
    private String iconColor_ = "";
    private String title_ = "";
    private String text_ = "";

    static {
        EmphasizedIconListItem emphasizedIconListItem = new EmphasizedIconListItem();
        DEFAULT_INSTANCE = emphasizedIconListItem;
        AbstractC0269h.registerDefaultInstance(EmphasizedIconListItem.class, emphasizedIconListItem);
    }

    private EmphasizedIconListItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004Ȉ", new Object[]{"bitField0_", "icon_", "iconColor_", "title_", "text_"});
        }
        if (iOrdinal == 3) {
            return new EmphasizedIconListItem();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 2);
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
        synchronized (EmphasizedIconListItem.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m2315n() {
        return this.icon_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m2316o() {
        return this.iconColor_;
    }

    /* JADX INFO: renamed from: p */
    public final String m2317p() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
