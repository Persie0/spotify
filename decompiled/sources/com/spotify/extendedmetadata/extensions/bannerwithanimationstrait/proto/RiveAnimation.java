package com.spotify.extendedmetadata.extensions.bannerwithanimationstrait.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class RiveAnimation extends AbstractC0269h implements sre0 {
    private static final RiveAnimation DEFAULT_INSTANCE;
    public static final int ON_INIT_IMAGE_INPUT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private RiveImageInput onInitImageInput_;
    private String url_ = "";

    static {
        RiveAnimation riveAnimation = new RiveAnimation();
        DEFAULT_INSTANCE = riveAnimation;
        AbstractC0269h.registerDefaultInstance(RiveAnimation.class, riveAnimation);
    }

    private RiveAnimation() {
    }

    /* JADX INFO: renamed from: n */
    public static RiveAnimation m9881n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "url_", "onInitImageInput_"});
        }
        if (iOrdinal == 3) {
            return new RiveAnimation();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 26);
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
        synchronized (RiveAnimation.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final RiveImageInput m9882o() {
        RiveImageInput riveImageInput = this.onInitImageInput_;
        return riveImageInput == null ? RiveImageInput.m9884n() : riveImageInput;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9883p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
