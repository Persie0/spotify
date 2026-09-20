package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.psc;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Chapters extends AbstractC0269h implements sre0 {
    public static final int CHAPTER_ITEMS_FIELD_NUMBER = 2;
    public static final int CURATION_BLOCKED_FIELD_NUMBER = 4;
    private static final Chapters DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int ML_GENERATED_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 5;
    private boolean curationBlocked_;
    private boolean mlGenerated_;
    private String entityUri_ = "";
    private ae50 chapterItems_ = AbstractC0269h.emptyProtobufList();
    private String title_ = "";

    static {
        Chapters chapters = new Chapters();
        DEFAULT_INSTANCE = chapters;
        AbstractC0269h.registerDefaultInstance(Chapters.class, chapters);
    }

    private Chapters() {
    }

    /* JADX INFO: renamed from: o */
    public static Chapters m20452o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static psc m20453r() {
        return (psc) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0007\u0004\u0007\u0005Ȉ", new Object[]{"entityUri_", "chapterItems_", ChapterItem.class, "mlGenerated_", "curationBlocked_", "title_"});
        }
        if (iOrdinal == 3) {
            return new Chapters();
        }
        if (iOrdinal == 4) {
            return new psc(DEFAULT_INSTANCE);
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
        synchronized (Chapters.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m20454n() {
        return this.chapterItems_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m20455p() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20456q() {
        return this.mlGenerated_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
