package com.spotify.spotifyuserprofile.p159v0;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class TasteProfilePage extends AbstractC0269h implements sre0 {
    private static final TasteProfilePage DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 3;
    public static final int END_OF_PAGE_LINK_FIELD_NUMBER = 4;
    public static final int INTRODUCTION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 5;
    private int version_;
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();
    private String introduction_ = "";
    private String disclaimer_ = "";
    private String endOfPageLink_ = "";

    static {
        TasteProfilePage tasteProfilePage = new TasteProfilePage();
        DEFAULT_INSTANCE = tasteProfilePage;
        AbstractC0269h.registerDefaultInstance(TasteProfilePage.class, tasteProfilePage);
    }

    private TasteProfilePage() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004", new Object[]{"sections_", Section.class, "introduction_", "disclaimer_", "endOfPageLink_", "version_"});
        }
        if (iOrdinal == 3) {
            return new TasteProfilePage();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 7);
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
        synchronized (TasteProfilePage.class) {
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
    public final String m21574n() {
        return this.disclaimer_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21575o() {
        return this.endOfPageLink_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21576p() {
        return this.introduction_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m21577q() {
        return this.sections_;
    }

    /* JADX INFO: renamed from: r */
    public final int m21578r() {
        return this.version_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
