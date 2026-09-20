package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.gva;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ChapterNavigationListButtonComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 1;
    public static final int CHAPTERS_FIELD_NUMBER = 2;
    public static final int CURRENT_ENTITY_URI_FIELD_NUMBER = 3;
    private static final ChapterNavigationListButtonComponent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String accessibilityText_ = "";
    private ae50 chapters_ = AbstractC0269h.emptyProtobufList();
    private String currentEntityUri_ = "";

    static {
        ChapterNavigationListButtonComponent chapterNavigationListButtonComponent = new ChapterNavigationListButtonComponent();
        DEFAULT_INSTANCE = chapterNavigationListButtonComponent;
        AbstractC0269h.registerDefaultInstance(ChapterNavigationListButtonComponent.class, chapterNavigationListButtonComponent);
    }

    private ChapterNavigationListButtonComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ChapterNavigationListButtonComponent m22599q(gva gvaVar) {
        return (ChapterNavigationListButtonComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"accessibilityText_", "chapters_", ChapterItem.class, "currentEntityUri_"});
        }
        if (iOrdinal == 3) {
            return new ChapterNavigationListButtonComponent();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 4);
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
        synchronized (ChapterNavigationListButtonComponent.class) {
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
    public final String m22600n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m22601o() {
        return this.chapters_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22602p() {
        return this.currentEntityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
