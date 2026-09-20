package com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes6.dex */
public final class EntityBookmarks extends AbstractC0269h implements sre0 {
    private static final EntityBookmarks DEFAULT_INSTANCE;
    public static final int EPISODE_BOOKMARKS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_BOOKMARKS_FIELD_NUMBER = 2;
    private int bodyCase_ = 0;
    private Object body_;

    static {
        EntityBookmarks entityBookmarks = new EntityBookmarks();
        DEFAULT_INSTANCE = entityBookmarks;
        AbstractC0269h.registerDefaultInstance(EntityBookmarks.class, entityBookmarks);
    }

    private EntityBookmarks() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EntityBookmarks m10102q(byte[] bArr) {
        return (EntityBookmarks) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"body_", "bodyCase_", EpisodeBookmarks.class, ShowBookmarks.class});
        }
        if (iOrdinal == 3) {
            return new EntityBookmarks();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 18);
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
        synchronized (EntityBookmarks.class) {
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
    public final int m10103n() {
        int i = this.bodyCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EpisodeBookmarks m10104o() {
        return this.bodyCase_ == 1 ? (EpisodeBookmarks) this.body_ : EpisodeBookmarks.m10106o();
    }

    /* JADX INFO: renamed from: p */
    public final ShowBookmarks m10105p() {
        return this.bodyCase_ == 2 ? (ShowBookmarks) this.body_ : ShowBookmarks.m10108n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
