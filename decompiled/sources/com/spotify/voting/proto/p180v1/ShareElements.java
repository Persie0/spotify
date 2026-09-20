package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareElements extends AbstractC0269h implements sre0 {
    private static final ShareElements DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 6;
    public static final int SHARE_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    public static final int SHARE_BUTTON_TEXT_FIELD_NUMBER = 4;
    public static final int SHARE_ELEMENTS_FIELD_NUMBER = 1;
    public static final int SHARE_MESSAGE_TEXT_FIELD_NUMBER = 3;
    public static final int SHARE_URI_FIELD_NUMBER = 2;
    private ae50 shareElements_ = AbstractC0269h.emptyProtobufList();
    private String shareUri_ = "";
    private String shareMessageText_ = "";
    private String shareButtonText_ = "";
    private String shareButtonAccessibilityText_ = "";
    private String shareButtonAccessibilityAction_ = "";

    static {
        ShareElements shareElements = new ShareElements();
        DEFAULT_INSTANCE = shareElements;
        AbstractC0269h.registerDefaultInstance(ShareElements.class, shareElements);
    }

    private ShareElements() {
    }

    /* JADX INFO: renamed from: n */
    public static ShareElements m22410n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"shareElements_", ShareElement.class, "shareUri_", "shareMessageText_", "shareButtonText_", "shareButtonAccessibilityText_", "shareButtonAccessibilityAction_"});
        }
        if (iOrdinal == 3) {
            return new ShareElements();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 12);
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
        synchronized (ShareElements.class) {
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
    public final String m22411o() {
        return this.shareButtonAccessibilityAction_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22412p() {
        return this.shareButtonAccessibilityText_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22413q() {
        return this.shareButtonText_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m22414r() {
        return this.shareElements_;
    }

    /* JADX INFO: renamed from: s */
    public final String m22415s() {
        return this.shareMessageText_;
    }

    /* JADX INFO: renamed from: t */
    public final String m22416t() {
        return this.shareUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
