package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TextHeading extends AbstractC0269h implements sre0 {
    private static final TextHeading DEFAULT_INSTANCE;
    public static final int ENCORE_ICON_NAME_FIELD_NUMBER = 3;
    public static final int NAVIGATION_ACTION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private NavigationAction navigationAction_;
    private String text_ = "";
    private String encoreIconName_ = "";

    static {
        TextHeading textHeading = new TextHeading();
        DEFAULT_INSTANCE = textHeading;
        AbstractC0269h.registerDefaultInstance(TextHeading.class, textHeading);
    }

    private TextHeading() {
    }

    /* JADX INFO: renamed from: n */
    public static TextHeading m4137n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "text_", "navigationAction_", "encoreIconName_"});
        }
        if (iOrdinal == 3) {
            return new TextHeading();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 15);
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
        synchronized (TextHeading.class) {
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
    public final String m4138o() {
        return this.encoreIconName_;
    }

    /* JADX INFO: renamed from: p */
    public final NavigationAction m4139p() {
        NavigationAction navigationAction = this.navigationAction_;
        return navigationAction == null ? NavigationAction.m4086n() : navigationAction;
    }

    /* JADX INFO: renamed from: q */
    public final String m4140q() {
        return this.text_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4141r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
