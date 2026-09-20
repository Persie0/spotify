package com.spotify.extendedmetadata.extensions.chatsharepreviewimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes6.dex */
public final class Color extends AbstractC0269h implements sre0 {
    private static final Color DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_COLOR_HEX_FIELD_NUMBER = 1;
    public static final int SECONDARY_COLOR_HEX_FIELD_NUMBER = 2;
    private int bitField0_;
    private String primaryColorHex_ = "";
    private String secondaryColorHex_ = "";

    static {
        Color color = new Color();
        DEFAULT_INSTANCE = color;
        AbstractC0269h.registerDefaultInstance(Color.class, color);
    }

    private Color() {
    }

    /* JADX INFO: renamed from: n */
    public static Color m9919n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "primaryColorHex_", "secondaryColorHex_"});
        }
        if (iOrdinal == 3) {
            return new Color();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 16);
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
        synchronized (Color.class) {
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
    public final String m9920o() {
        return this.primaryColorHex_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9921p() {
        return this.secondaryColorHex_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
