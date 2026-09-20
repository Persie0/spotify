package com.spotify.watchfeed.component.item.p185v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.gva;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedHeaderComponent extends AbstractC0269h implements sre0 {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 5;
    public static final int BACK_BUTTON_FIELD_NUMBER = 4;
    public static final int BODY_FIELD_NUMBER = 6;
    private static final FeedHeaderComponent DEFAULT_INSTANCE;
    public static final int OVERLINE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Any actionButton_;
    private Any backButton_;
    private int bitField0_;
    private Any body_;
    private String overline_ = "";
    private String title_ = "";
    private String subtitle_ = "";

    static {
        FeedHeaderComponent feedHeaderComponent = new FeedHeaderComponent();
        DEFAULT_INSTANCE = feedHeaderComponent;
        AbstractC0269h.registerDefaultInstance(FeedHeaderComponent.class, feedHeaderComponent);
    }

    private FeedHeaderComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static FeedHeaderComponent m22792q(gva gvaVar) {
        return (FeedHeaderComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "overline_", "title_", "subtitle_", "backButton_", "actionButton_", "body_"});
        }
        if (iOrdinal == 3) {
            return new FeedHeaderComponent();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 20);
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
        synchronized (FeedHeaderComponent.class) {
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
    public final Any m22793n() {
        Any any = this.actionButton_;
        return any == null ? Any.m1909p() : any;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Any m22794o() {
        Any any = this.body_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22795p() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
