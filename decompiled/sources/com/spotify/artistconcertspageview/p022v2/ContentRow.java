package com.spotify.artistconcertspageview.p022v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentRow extends AbstractC0269h implements sre0 {
    public static final int BANNER_ROW_FIELD_NUMBER = 4;
    public static final int CONCERT_ROW_FIELD_NUMBER = 3;
    private static final ContentRow DEFAULT_INSTANCE;
    public static final int EMPTY_SECTION_ROW_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int UBI_IDENTIFIER_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object content_;
    private int contentCase_ = 0;
    private String ubiIdentifier_ = "";

    static {
        ContentRow contentRow = new ContentRow();
        DEFAULT_INSTANCE = contentRow;
        AbstractC0269h.registerDefaultInstance(ContentRow.class, contentRow);
    }

    private ContentRow() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"content_", "contentCase_", "bitField0_", "ubiIdentifier_", ConcertRow.class, BannerRow.class, EmptySectionRow.class});
        }
        if (iOrdinal == 3) {
            return new ContentRow();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 22);
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
        synchronized (ContentRow.class) {
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
    public final BannerRow m3287n() {
        return this.contentCase_ == 4 ? (BannerRow) this.content_ : BannerRow.m3281r();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ConcertRow m3288o() {
        return this.contentCase_ == 3 ? (ConcertRow) this.content_ : ConcertRow.m3286n();
    }

    /* JADX INFO: renamed from: p */
    public final int m3289p() {
        int i = this.contentCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: q */
    public final EmptySectionRow m3290q() {
        return this.contentCase_ == 5 ? (EmptySectionRow) this.content_ : EmptySectionRow.m3296p();
    }

    /* JADX INFO: renamed from: r */
    public final String m3291r() {
        return this.ubiIdentifier_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
