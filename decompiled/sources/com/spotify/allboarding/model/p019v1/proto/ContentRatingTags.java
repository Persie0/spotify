package com.spotify.allboarding.model.p019v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.oh5;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentRatingTags extends AbstractC0269h implements sre0 {
    private static final ContentRatingTags DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 1;
    private static final vd50 tags_converter_ = new oh5();
    private int tagsMemoizedSerializedSize;
    private ud50 tags_ = AbstractC0269h.emptyIntList();

    static {
        ContentRatingTags contentRatingTags = new ContentRatingTags();
        DEFAULT_INSTANCE = contentRatingTags;
        AbstractC0269h.registerDefaultInstance(ContentRatingTags.class, contentRatingTags);
    }

    private ContentRatingTags() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"tags_"});
        }
        if (iOrdinal == 3) {
            return new ContentRatingTags();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 20);
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
        synchronized (ContentRatingTags.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
