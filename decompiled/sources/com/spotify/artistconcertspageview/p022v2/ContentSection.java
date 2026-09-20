package com.spotify.artistconcertspageview.p022v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentSection extends AbstractC0269h implements sre0 {
    private static final ContentSection DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 3;
    public static final int TITLE_ROW_FIELD_NUMBER = 2;
    public static final int UBI_IDENTIFIER_FIELD_NUMBER = 1;
    private int bitField0_;
    private SectionTitle titleRow_;
    private String ubiIdentifier_ = "";
    private ae50 rows_ = AbstractC0269h.emptyProtobufList();

    static {
        ContentSection contentSection = new ContentSection();
        DEFAULT_INSTANCE = contentSection;
        AbstractC0269h.registerDefaultInstance(ContentSection.class, contentSection);
    }

    private ContentSection() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"bitField0_", "ubiIdentifier_", "titleRow_", "rows_", ContentRow.class});
        }
        if (iOrdinal == 3) {
            return new ContentSection();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 23);
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
        synchronized (ContentSection.class) {
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
    public final ae50 m3292n() {
        return this.rows_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final SectionTitle m3293o() {
        SectionTitle sectionTitle = this.titleRow_;
        return sectionTitle == null ? SectionTitle.m3305p() : sectionTitle;
    }

    /* JADX INFO: renamed from: p */
    public final String m3294p() {
        return this.ubiIdentifier_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3295q() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
