package com.spotify.concertsgalleryview.p049v1;

import com.google.protobuf.AbstractC0269h;
import com.google.type.DateTime;
import p204p.l2i;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConcertCard extends AbstractC0269h implements sre0 {
    private static final ConcertCard DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TARGET_URI_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int kind_;
    private DateTime startTime_;
    private String title_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";
    private String targetUri_ = "";

    static {
        ConcertCard concertCard = new ConcertCard();
        DEFAULT_INSTANCE = concertCard;
        AbstractC0269h.registerDefaultInstance(ConcertCard.class, concertCard);
    }

    private ConcertCard() {
    }

    /* JADX INFO: renamed from: n */
    public static ConcertCard m7210n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000", new Object[]{"bitField0_", "kind_", "title_", "subtitle_", "imageUrl_", "targetUri_", "startTime_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCard();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 6);
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
        synchronized (ConcertCard.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final l2i m7211o() {
        l2i l2iVar;
        int i = this.kind_;
        if (i == 0) {
            l2iVar = l2i.CARD_KIND_UNSPECIFIED;
        } else if (i == 1) {
            l2iVar = l2i.CARD_KIND_ROW;
        } else if (i != 2) {
            l2iVar = i != 3 ? null : l2i.CARD_KIND_LARGE;
        } else {
            l2iVar = l2i.CARD_KIND_SMALL;
        }
        return l2iVar == null ? l2i.UNRECOGNIZED : l2iVar;
    }

    /* JADX INFO: renamed from: p */
    public final DateTime m7212p() {
        DateTime dateTime = this.startTime_;
        return dateTime == null ? DateTime.m2198o() : dateTime;
    }

    /* JADX INFO: renamed from: q */
    public final String m7213q() {
        return this.targetUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
