package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ParentalControls extends AbstractC0269h implements sre0 {
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 1;
    public static final int ALLOW_VIDEO_CONTENT_FIELD_NUMBER = 2;
    private static final ParentalControls DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private boolean allowExplicitContent_;
    private boolean allowVideoContent_;

    static {
        ParentalControls parentalControls = new ParentalControls();
        DEFAULT_INSTANCE = parentalControls;
        AbstractC0269h.registerDefaultInstance(ParentalControls.class, parentalControls);
    }

    private ParentalControls() {
    }

    /* JADX INFO: renamed from: n */
    public static ParentalControls m12160n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"allowExplicitContent_", "allowVideoContent_"});
        }
        if (iOrdinal == 3) {
            return new ParentalControls();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 0);
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
        synchronized (ParentalControls.class) {
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

    public final boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    public final boolean getAllowVideoContent() {
        return this.allowVideoContent_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
