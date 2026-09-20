package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ContentRow extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_ROW_FIELD_NUMBER = 3;
    private static final ContentRow DEFAULT_INSTANCE;
    public static final int EVENT_ROW_FIELD_NUMBER = 5;
    public static final int MAP_ROW_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_ROW_FIELD_NUMBER = 2;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"content_", "contentCase_", "bitField0_", "ubiIdentifier_", TitleRow.class, AddressRow.class, MapRow.class, EventRow.class});
        }
        if (iOrdinal == 3) {
            return new ContentRow();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 21);
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
    public final AddressRow m22284n() {
        return this.contentCase_ == 3 ? (AddressRow) this.content_ : AddressRow.m22271o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m22285o() {
        int i = this.contentCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: p */
    public final EventRow m22286p() {
        return this.contentCase_ == 5 ? (EventRow) this.content_ : EventRow.m22292n();
    }

    /* JADX INFO: renamed from: q */
    public final MapRow m22287q() {
        return this.contentCase_ == 4 ? (MapRow) this.content_ : MapRow.m22308q();
    }

    /* JADX INFO: renamed from: r */
    public final TitleRow m22288r() {
        return this.contentCase_ == 2 ? (TitleRow) this.content_ : TitleRow.m22332n();
    }

    /* JADX INFO: renamed from: s */
    public final String m22289s() {
        return this.ubiIdentifier_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
