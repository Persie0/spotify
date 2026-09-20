package com.spotify.addonconsideration.p011v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ShowcaseDescriptionList extends AbstractC0269h implements sre0 {
    public static final int BULLETED_LIST_FIELD_NUMBER = 2;
    private static final ShowcaseDescriptionList DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    public static final int EMPHASIZED_ICON_LIST_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private Object list_;
    private int listCase_ = 0;
    private String description_ = "";

    static {
        ShowcaseDescriptionList showcaseDescriptionList = new ShowcaseDescriptionList();
        DEFAULT_INSTANCE = showcaseDescriptionList;
        AbstractC0269h.registerDefaultInstance(ShowcaseDescriptionList.class, showcaseDescriptionList);
    }

    private ShowcaseDescriptionList() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"list_", "listCase_", "description_", BulletedList.class, EmphasizedIconList.class});
        }
        if (iOrdinal == 3) {
            return new ShowcaseDescriptionList();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 13);
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
        synchronized (ShowcaseDescriptionList.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    /* JADX INFO: renamed from: n */
    public final BulletedList m2324n() {
        return this.listCase_ == 2 ? (BulletedList) this.list_ : BulletedList.m2309n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EmphasizedIconList m2325o() {
        return this.listCase_ == 3 ? (EmphasizedIconList) this.list_ : EmphasizedIconList.m2314n();
    }

    /* JADX INFO: renamed from: p */
    public final int m2326p() {
        int i = this.listCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
