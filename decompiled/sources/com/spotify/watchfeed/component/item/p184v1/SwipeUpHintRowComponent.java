package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cm51;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SwipeUpHintRowComponent extends AbstractC0269h implements sre0 {
    private static final SwipeUpHintRowComponent DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REPLAY_MS_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TINT_COLOR_FIELD_NUMBER = 4;
    private long delayMs_;
    private long replayMs_;
    private String text_ = "";
    private String tintColor_ = "";

    static {
        SwipeUpHintRowComponent swipeUpHintRowComponent = new SwipeUpHintRowComponent();
        DEFAULT_INSTANCE = swipeUpHintRowComponent;
        AbstractC0269h.registerDefaultInstance(SwipeUpHintRowComponent.class, swipeUpHintRowComponent);
    }

    private SwipeUpHintRowComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static SwipeUpHintRowComponent m22725r(gva gvaVar) {
        return (SwipeUpHintRowComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004Ȉ", new Object[]{"text_", "delayMs_", "replayMs_", "tintColor_"});
        }
        if (iOrdinal == 3) {
            return new SwipeUpHintRowComponent();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 25);
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
        synchronized (SwipeUpHintRowComponent.class) {
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
    public final long m22726n() {
        return this.delayMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m22727o() {
        return this.replayMs_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22728p() {
        return this.text_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22729q() {
        return this.tintColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
