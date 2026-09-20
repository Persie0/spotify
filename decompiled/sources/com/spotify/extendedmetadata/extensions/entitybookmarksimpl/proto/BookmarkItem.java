package com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes6.dex */
public final class BookmarkItem extends AbstractC0269h implements sre0 {
    private static final BookmarkItem DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LAST_UPDATED_FIELD_NUMBER = 5;
    public static final int OFFSET_MS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    private int bitField0_;
    private long durationMs_;
    private Timestamp lastUpdated_;
    private long offsetMs_;
    private String id_ = "";
    private String title_ = "";

    static {
        BookmarkItem bookmarkItem = new BookmarkItem();
        DEFAULT_INSTANCE = bookmarkItem;
        AbstractC0269h.registerDefaultInstance(BookmarkItem.class, bookmarkItem);
    }

    private BookmarkItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဂ\u0000\u0004ለ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "id_", "offsetMs_", "durationMs_", "title_", "lastUpdated_"});
        }
        if (iOrdinal == 3) {
            return new BookmarkItem();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 11);
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
        synchronized (BookmarkItem.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final long m10099n() {
        return this.durationMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Timestamp m10100o() {
        Timestamp timestamp = this.lastUpdated_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: p */
    public final long m10101p() {
        return this.offsetMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
