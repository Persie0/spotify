package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uro;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Disclaimer extends AbstractC0269h implements sre0 {
    private static final Disclaimer DEFAULT_INSTANCE;
    public static final int LINK_BUTTON_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private Button linkButton_;
    private Text text_;

    static {
        Disclaimer disclaimer = new Disclaimer();
        DEFAULT_INSTANCE = disclaimer;
        AbstractC0269h.registerDefaultInstance(Disclaimer.class, disclaimer);
    }

    private Disclaimer() {
    }

    /* JADX INFO: renamed from: n */
    public static Disclaimer m17154n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "text_", "linkButton_"});
        }
        if (iOrdinal == 3) {
            return new Disclaimer();
        }
        if (iOrdinal == 4) {
            return new uro(DEFAULT_INSTANCE, 27);
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
        synchronized (Disclaimer.class) {
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
    public final Button m17155o() {
        Button button = this.linkButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: p */
    public final Text m17156p() {
        Text text = this.text_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17157q() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17158r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
