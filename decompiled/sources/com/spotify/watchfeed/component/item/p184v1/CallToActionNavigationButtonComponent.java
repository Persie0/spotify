package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.Visual;
import p204p.gva;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CallToActionNavigationButtonComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    public static final int DECISION_ID_FIELD_NUMBER = 5;
    private static final CallToActionNavigationButtonComponent DEFAULT_INSTANCE;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VISUAL_FIELD_NUMBER = 2;
    private int bitField0_;
    private Visual visual_;
    private String uri_ = "";
    private String title_ = "";
    private String navigationUri_ = "";
    private String decisionId_ = "";
    private String accessibilityText_ = "";

    static {
        CallToActionNavigationButtonComponent callToActionNavigationButtonComponent = new CallToActionNavigationButtonComponent();
        DEFAULT_INSTANCE = callToActionNavigationButtonComponent;
        AbstractC0269h.registerDefaultInstance(CallToActionNavigationButtonComponent.class, callToActionNavigationButtonComponent);
    }

    private CallToActionNavigationButtonComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static CallToActionNavigationButtonComponent m22584s(gva gvaVar) {
        return (CallToActionNavigationButtonComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "uri_", "visual_", "title_", "navigationUri_", "decisionId_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new CallToActionNavigationButtonComponent();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 6);
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
        synchronized (CallToActionNavigationButtonComponent.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22585n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22586o() {
        return this.decisionId_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22587p() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: q */
    public final Visual m22588q() {
        Visual visual = this.visual_;
        return visual == null ? Visual.m22929o() : visual;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22589r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
