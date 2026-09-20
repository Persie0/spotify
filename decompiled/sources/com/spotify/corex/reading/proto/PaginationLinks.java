package com.spotify.corex.reading.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PaginationLinks extends AbstractC0269h implements sre0 {
    private static final PaginationLinks DEFAULT_INSTANCE;
    public static final int NEXT_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PREV_URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private String nextUrl_ = "";
    private String prevUrl_ = "";

    static {
        PaginationLinks paginationLinks = new PaginationLinks();
        DEFAULT_INSTANCE = paginationLinks;
        AbstractC0269h.registerDefaultInstance(PaginationLinks.class, paginationLinks);
    }

    private PaginationLinks() {
    }

    /* JADX INFO: renamed from: n */
    public static PaginationLinks m8127n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "nextUrl_", "prevUrl_"});
        }
        if (iOrdinal == 3) {
            return new PaginationLinks();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 22);
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
        synchronized (PaginationLinks.class) {
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
    public final String m8128o() {
        return this.nextUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m8129p() {
        return this.prevUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
