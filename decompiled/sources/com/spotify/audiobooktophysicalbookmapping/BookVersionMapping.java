package com.spotify.audiobooktophysicalbookmapping;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes5.dex */
public final class BookVersionMapping extends AbstractC0269h implements sre0 {
    public static final int BOOK_END_OFFSET_FIELD_NUMBER = 3;
    public static final int BOOK_VERSION_FIELD_NUMBER = 1;
    private static final BookVersionMapping DEFAULT_INSTANCE;
    public static final int PAGES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Duration bookEndOffset_;
    private BookVersion bookVersion_;
    private ae50 pages_ = AbstractC0269h.emptyProtobufList();

    static {
        BookVersionMapping bookVersionMapping = new BookVersionMapping();
        DEFAULT_INSTANCE = bookVersionMapping;
        AbstractC0269h.registerDefaultInstance(BookVersionMapping.class, bookVersionMapping);
    }

    private BookVersionMapping() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"bitField0_", "bookVersion_", "pages_", PageStartMapping.class, "bookEndOffset_"});
        }
        if (iOrdinal == 3) {
            return new BookVersionMapping();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 10);
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
        synchronized (BookVersionMapping.class) {
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

    public final List getPagesList() {
        return this.pages_;
    }

    /* JADX INFO: renamed from: n */
    public final Duration m3447n() {
        Duration duration = this.bookEndOffset_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BookVersion m3448o() {
        BookVersion bookVersion = this.bookVersion_;
        return bookVersion == null ? BookVersion.m3445n() : bookVersion;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
