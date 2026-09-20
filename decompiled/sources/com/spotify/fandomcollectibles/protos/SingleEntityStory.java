package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class SingleEntityStory extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int BASE_FIELD_NUMBER = 1;
    private static final SingleEntityStory DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String backgroundImageUrl_ = "";
    private BaseStory base_;
    private int bitField0_;
    private EntityListItem entity_;
    private Text subtitle_;
    private Text title_;

    static {
        SingleEntityStory singleEntityStory = new SingleEntityStory();
        DEFAULT_INSTANCE = singleEntityStory;
        AbstractC0269h.registerDefaultInstance(SingleEntityStory.class, singleEntityStory);
    }

    private SingleEntityStory() {
    }

    /* JADX INFO: renamed from: p */
    public static SingleEntityStory m10930p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005ဉ\u0003", new Object[]{"bitField0_", "base_", "title_", "subtitle_", "backgroundImageUrl_", "entity_"});
        }
        if (iOrdinal == 3) {
            return new SingleEntityStory();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 0);
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
        synchronized (SingleEntityStory.class) {
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
    public final String m10931n() {
        return this.backgroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BaseStory m10932o() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m10795q() : baseStory;
    }

    /* JADX INFO: renamed from: q */
    public final EntityListItem m10933q() {
        EntityListItem entityListItem = this.entity_;
        return entityListItem == null ? EntityListItem.m10814n() : entityListItem;
    }

    /* JADX INFO: renamed from: r */
    public final Text m10934r() {
        Text text = this.subtitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: s */
    public final Text m10935s() {
        Text text = this.title_;
        return text == null ? Text.m10950n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
