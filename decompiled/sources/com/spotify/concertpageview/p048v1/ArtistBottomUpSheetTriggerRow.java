package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.aw2;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ArtistBottomUpSheetTriggerRow extends AbstractC0269h implements sre0 {
    public static final int ALREADY_PRESENTED_URIS_FIELD_NUMBER = 2;
    public static final int BOTTOM_UP_SHEET_TITLE_FIELD_NUMBER = 1;
    private static final ArtistBottomUpSheetTriggerRow DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String bottomUpSheetTitle_ = "";
    private ae50 alreadyPresentedUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 rows_ = AbstractC0269h.emptyProtobufList();

    static {
        ArtistBottomUpSheetTriggerRow artistBottomUpSheetTriggerRow = new ArtistBottomUpSheetTriggerRow();
        DEFAULT_INSTANCE = artistBottomUpSheetTriggerRow;
        AbstractC0269h.registerDefaultInstance(ArtistBottomUpSheetTriggerRow.class, artistBottomUpSheetTriggerRow);
    }

    private ArtistBottomUpSheetTriggerRow() {
    }

    /* JADX INFO: renamed from: p */
    public static ArtistBottomUpSheetTriggerRow m7015p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ለ\u0000\u0002Ț\u0003\u001b", new Object[]{"bitField0_", "bottomUpSheetTitle_", "alreadyPresentedUris_", "rows_", ArtistRow.class});
        }
        if (iOrdinal == 3) {
            return new ArtistBottomUpSheetTriggerRow();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 25);
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
        synchronized (ArtistBottomUpSheetTriggerRow.class) {
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
    public final ae50 m7016n() {
        return this.alreadyPresentedUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7017o() {
        return this.bottomUpSheetTitle_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m7018q() {
        return this.rows_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
