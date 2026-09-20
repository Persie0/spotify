package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.AbstractC0269h;
import p204p.kt8;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class BannerBody extends AbstractC0269h implements sre0 {
    public static final int BANNER_BODY_ICON_FIELD_NUMBER = 1;
    private static final BannerBody DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int bannerBodyIcon_;
    private String text_ = "";

    static {
        BannerBody bannerBody = new BannerBody();
        DEFAULT_INSTANCE = bannerBody;
        AbstractC0269h.registerDefaultInstance(BannerBody.class, bannerBody);
    }

    private BannerBody() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"bannerBodyIcon_", "text_"});
        }
        if (iOrdinal == 3) {
            return new BannerBody();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 23);
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
        synchronized (BannerBody.class) {
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
    public final kt8 m12598n() {
        kt8 kt8Var;
        int i = this.bannerBodyIcon_;
        if (i == 0) {
            kt8Var = kt8.BANNER_BODY_ICON_UNSPECIFIED;
        } else if (i == 1) {
            kt8Var = kt8.SUCCESS;
        } else if (i != 2) {
            kt8Var = i != 3 ? null : kt8.FAIL;
        } else {
            kt8Var = kt8.NO_MATCH;
        }
        return kt8Var == null ? kt8.UNRECOGNIZED : kt8Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m12599o() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
