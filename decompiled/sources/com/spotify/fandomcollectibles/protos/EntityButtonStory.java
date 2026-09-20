package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes6.dex */
public final class EntityButtonStory extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int BUTTON_FIELD_NUMBER = 7;
    private static final EntityButtonStory DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int MAIN_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    private BaseStory base_;
    private int bitField0_;
    private LinkButton button_;
    private Text description_;
    private Text subtitle_;
    private Text title_;
    private String backgroundImageUrl_ = "";
    private String mainImageUrl_ = "";

    static {
        EntityButtonStory entityButtonStory = new EntityButtonStory();
        DEFAULT_INSTANCE = entityButtonStory;
        AbstractC0269h.registerDefaultInstance(EntityButtonStory.class, entityButtonStory);
    }

    private EntityButtonStory() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EntityButtonStory m10806q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "base_", "title_", "backgroundImageUrl_", "mainImageUrl_", "subtitle_", "description_", "button_"});
        }
        if (iOrdinal == 3) {
            return new EntityButtonStory();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 19);
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
        synchronized (EntityButtonStory.class) {
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
    public final String m10807n() {
        return this.backgroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BaseStory m10808o() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m10795q() : baseStory;
    }

    /* JADX INFO: renamed from: p */
    public final LinkButton m10809p() {
        LinkButton linkButton = this.button_;
        return linkButton == null ? LinkButton.m10884o() : linkButton;
    }

    /* JADX INFO: renamed from: r */
    public final Text m10810r() {
        Text text = this.description_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: s */
    public final String m10811s() {
        return this.mainImageUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final Text m10812t() {
        Text text = this.subtitle_;
        return text == null ? Text.m10950n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Text m10813u() {
        Text text = this.title_;
        return text == null ? Text.m10950n() : text;
    }
}
