package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class HeaderOverrides extends AbstractC0269h implements sre0 {
    public static final int BODY_FIELD_NUMBER = 1;
    private static final HeaderOverrides DEFAULT_INSTANCE;
    public static final int HIDE_BODY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TINT_COLOR_FIELD_NUMBER = 2;
    private int bitField0_;
    private Any body_;
    private boolean hideBody_;
    private String tintColor_ = "";

    static {
        HeaderOverrides headerOverrides = new HeaderOverrides();
        DEFAULT_INSTANCE = headerOverrides;
        AbstractC0269h.registerDefaultInstance(HeaderOverrides.class, headerOverrides);
    }

    private HeaderOverrides() {
    }

    /* JADX INFO: renamed from: o */
    public static HeaderOverrides m22893o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u0007", new Object[]{"bitField0_", "body_", "tintColor_", "hideBody_"});
        }
        if (iOrdinal == 3) {
            return new HeaderOverrides();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 2);
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
        synchronized (HeaderOverrides.class) {
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
    public final Any m22894n() {
        Any any = this.body_;
        return any == null ? Any.m1909p() : any;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22895p() {
        return this.hideBody_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22896q() {
        return this.tintColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
