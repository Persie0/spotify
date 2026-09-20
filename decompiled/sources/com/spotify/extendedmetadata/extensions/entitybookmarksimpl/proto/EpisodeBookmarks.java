package com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeBookmarks extends AbstractC0269h implements sre0 {
    public static final int BOOKMARKS_FIELD_NUMBER = 2;
    private static final EpisodeBookmarks DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int NUMBER_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long duration_;
    private int number_;
    private String uri_ = "";
    private ae50 bookmarks_ = AbstractC0269h.emptyProtobufList();
    private String title_ = "";

    static {
        EpisodeBookmarks episodeBookmarks = new EpisodeBookmarks();
        DEFAULT_INSTANCE = episodeBookmarks;
        AbstractC0269h.registerDefaultInstance(EpisodeBookmarks.class, episodeBookmarks);
    }

    private EpisodeBookmarks() {
    }

    /* JADX INFO: renamed from: o */
    public static EpisodeBookmarks m10106o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003င\u0000\u0004ለ\u0001\u0005ဂ\u0002", new Object[]{"bitField0_", "uri_", "bookmarks_", BookmarkItem.class, "number_", "title_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeBookmarks();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 14);
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
        synchronized (EpisodeBookmarks.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m10107n() {
        return this.bookmarks_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
