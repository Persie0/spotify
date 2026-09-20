package com.spotify.addonconsideration.p011v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ShowcaseLayout extends AbstractC0269h implements sre0 {
    private static final ShowcaseLayout DEFAULT_INSTANCE;
    public static final int DESCRIPTION_LIST_FIELD_NUMBER = 2;
    public static final int DISCLAIMER_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 descriptionList_ = AbstractC0269h.emptyProtobufList();
    private String disclaimer_ = "";
    private ShowcaseHeader header_;

    static {
        ShowcaseLayout showcaseLayout = new ShowcaseLayout();
        DEFAULT_INSTANCE = showcaseLayout;
        AbstractC0269h.registerDefaultInstance(ShowcaseLayout.class, showcaseLayout);
    }

    private ShowcaseLayout() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowcaseLayout m2335n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ለ\u0001", new Object[]{"bitField0_", "header_", "descriptionList_", ShowcaseDescriptionList.class, "disclaimer_"});
        }
        if (iOrdinal == 3) {
            return new ShowcaseLayout();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 15);
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
        synchronized (ShowcaseLayout.class) {
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
    public final ae50 m2336o() {
        return this.descriptionList_;
    }

    /* JADX INFO: renamed from: p */
    public final String m2337p() {
        return this.disclaimer_;
    }

    /* JADX INFO: renamed from: q */
    public final ShowcaseHeader m2338q() {
        ShowcaseHeader showcaseHeader = this.header_;
        return showcaseHeader == null ? ShowcaseHeader.m2327p() : showcaseHeader;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
