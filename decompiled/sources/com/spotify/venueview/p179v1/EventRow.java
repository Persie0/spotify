package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class EventRow extends AbstractC0269h implements sre0 {
    private static final EventRow DEFAULT_INSTANCE;
    public static final int EVENT_DATE_FIELD_NUMBER = 3;
    public static final int EVENT_URI_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DateTimeWithOffset eventDate_;
    private String eventUri_ = "";
    private String title_ = "";
    private String imageUrl_ = "";

    static {
        EventRow eventRow = new EventRow();
        DEFAULT_INSTANCE = eventRow;
        AbstractC0269h.registerDefaultInstance(EventRow.class, eventRow);
    }

    private EventRow() {
    }

    /* JADX INFO: renamed from: n */
    public static EventRow m22292n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "eventUri_", "title_", "eventDate_", "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new EventRow();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 25);
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
        synchronized (EventRow.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DateTimeWithOffset m22293o() {
        DateTimeWithOffset dateTimeWithOffset = this.eventDate_;
        return dateTimeWithOffset == null ? DateTimeWithOffset.m22290o() : dateTimeWithOffset;
    }

    /* JADX INFO: renamed from: p */
    public final String m22294p() {
        return this.eventUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
