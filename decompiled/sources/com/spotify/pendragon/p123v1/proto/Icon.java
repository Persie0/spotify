package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.jz30;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Icon extends AbstractC0269h implements sre0 {
    public static final int COLOR_FIELD_NUMBER = 2;
    private static final Icon DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String color_ = "";
    private int name_;

    static {
        Icon icon = new Icon();
        DEFAULT_INSTANCE = icon;
        AbstractC0269h.registerDefaultInstance(Icon.class, icon);
    }

    private Icon() {
    }

    /* JADX INFO: renamed from: p */
    public static Icon m17217p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"name_", "color_"});
        }
        if (iOrdinal == 3) {
            return new Icon();
        }
        if (iOrdinal == 4) {
            return new a530(17);
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
        synchronized (Icon.class) {
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
    public final String m17218o() {
        return this.color_;
    }

    /* JADX INFO: renamed from: q */
    public final jz30 m17219q() {
        jz30 jz30Var;
        switch (this.name_) {
            case 0:
                jz30Var = jz30.ICON_UNKNOWN;
                break;
            case 1:
                jz30Var = jz30.SHUFFLE;
                break;
            case 2:
                jz30Var = jz30.SPOTIFYLOGO;
                break;
            case 3:
                jz30Var = jz30.X;
                break;
            case 4:
                jz30Var = jz30.EXCLAMATIONCIRCLE;
                break;
            case 5:
                jz30Var = jz30.CHEVRONRIGHT;
                break;
            case 6:
                jz30Var = jz30.FOLLOWACTIVE;
                break;
            case 7:
                jz30Var = jz30.DEVICETV;
                break;
            case 8:
                jz30Var = jz30.DEVICESPEAKER;
                break;
            case 9:
                jz30Var = jz30.EXTERNALLINK;
                break;
            default:
                jz30Var = null;
                break;
        }
        return jz30Var == null ? jz30.UNRECOGNIZED : jz30Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
