package com.spotify.extendedmetadata.extensions.shortcutscardtrait.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortcutsCardTrait extends AbstractC0269h implements sre0 {
    private static final ShortcutsCardTrait DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String imageUrl_ = "";
    private String title_ = "";
    private String navigationUri_ = "";
    private String entityUri_ = "";

    static {
        ShortcutsCardTrait shortcutsCardTrait = new ShortcutsCardTrait();
        DEFAULT_INSTANCE = shortcutsCardTrait;
        AbstractC0269h.registerDefaultInstance(ShortcutsCardTrait.class, shortcutsCardTrait);
    }

    private ShortcutsCardTrait() {
    }

    /* JADX INFO: renamed from: p */
    public static ShortcutsCardTrait m10371p(byte[] bArr) {
        return (ShortcutsCardTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"imageUrl_", "title_", "navigationUri_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new ShortcutsCardTrait();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 0);
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
        synchronized (ShortcutsCardTrait.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m10372n() {
        return this.entityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10373o() {
        return this.navigationUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
