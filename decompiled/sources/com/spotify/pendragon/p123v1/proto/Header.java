package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Header extends AbstractC0269h implements sre0 {
    private static final Header DEFAULT_INSTANCE;
    public static final int HEADER_ICON_FIELD_NUMBER = 2;
    public static final int HEADER_TEXT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Icon headerIcon_;
    private Text headerText_;

    static {
        Header header = new Header();
        DEFAULT_INSTANCE = header;
        AbstractC0269h.registerDefaultInstance(Header.class, header);
    }

    private Header() {
    }

    /* JADX INFO: renamed from: n */
    public static Header m17204n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "headerText_", "headerIcon_"});
        }
        if (iOrdinal == 3) {
            return new Header();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 26);
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
        synchronized (Header.class) {
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
    public final Icon m17205o() {
        Icon icon = this.headerIcon_;
        return icon == null ? Icon.m17217p() : icon;
    }

    /* JADX INFO: renamed from: p */
    public final Text m17206p() {
        Text text = this.headerText_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17207q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
