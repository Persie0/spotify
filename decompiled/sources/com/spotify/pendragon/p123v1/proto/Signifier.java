package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Signifier extends AbstractC0269h implements sre0 {
    private static final Signifier DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNIFIER_ICON_FIELD_NUMBER = 1;
    public static final int SIGNIFIER_TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int SIGNIFIER_TEXT_FIELD_NUMBER = 2;
    private int bitField0_;
    private Icon signifierIcon_;
    private String signifierText_ = "";
    private String signifierTextColor_ = "";

    static {
        Signifier signifier = new Signifier();
        DEFAULT_INSTANCE = signifier;
        AbstractC0269h.registerDefaultInstance(Signifier.class, signifier);
    }

    private Signifier() {
    }

    /* JADX INFO: renamed from: o */
    public static Signifier m17273o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "signifierIcon_", "signifierText_", "signifierTextColor_"});
        }
        if (iOrdinal == 3) {
            return new Signifier();
        }
        if (iOrdinal == 4) {
            return new qr11(20);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Icon m17274p() {
        Icon icon = this.signifierIcon_;
        return icon == null ? Icon.m17217p() : icon;
    }

    /* JADX INFO: renamed from: q */
    public final String m17275q() {
        return this.signifierText_;
    }

    /* JADX INFO: renamed from: r */
    public final String m17276r() {
        return this.signifierTextColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
