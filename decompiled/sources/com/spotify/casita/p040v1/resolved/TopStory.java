package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TopStory extends AbstractC0269h implements sre0 {
    public static final int CREATED_AT_FIELD_NUMBER = 5;
    private static final TopStory DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STORY_ID_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp createdAt_;
    private String title_ = "";
    private String description_ = "";
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private String storyId_ = "";

    static {
        TopStory topStory = new TopStory();
        DEFAULT_INSTANCE = topStory;
        AbstractC0269h.registerDefaultInstance(TopStory.class, topStory);
    }

    private TopStory() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005ဉ\u0000", new Object[]{"bitField0_", "title_", "description_", "items_", Item.class, "storyId_", "createdAt_"});
        }
        if (iOrdinal == 3) {
            return new TopStory();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 24);
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
        synchronized (TopStory.class) {
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

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final List getItemsList() {
        return this.items_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m5852n() {
        return this.storyId_;
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
