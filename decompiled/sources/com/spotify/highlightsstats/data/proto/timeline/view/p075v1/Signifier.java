package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.c321;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Signifier extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 3;
    private static final Signifier DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNIFIERTYPE_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int signifierType_;
    private String text_ = "";
    private String accessibilityDescription_ = "";

    static {
        Signifier signifier = new Signifier();
        DEFAULT_INSTANCE = signifier;
        AbstractC0269h.registerDefaultInstance(Signifier.class, signifier);
    }

    private Signifier() {
    }

    /* JADX INFO: renamed from: o */
    public static Signifier m11401o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"text_", "signifierType_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new Signifier();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 19);
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
        synchronized (Signifier.class) {
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
    public final String m11402n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final c321 m11403p() {
        c321 c321Var;
        int i = this.signifierType_;
        if (i == 0) {
            c321Var = c321.UNSPECIFIED_TYPE;
        } else if (i == 1) {
            c321Var = c321.LOCAL;
        } else if (i != 2) {
            c321Var = i != 3 ? null : c321.CHART;
        } else {
            c321Var = c321.GLOBAL;
        }
        return c321Var == null ? c321.UNRECOGNIZED : c321Var;
    }

    /* JADX INFO: renamed from: q */
    public final String m11404q() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
