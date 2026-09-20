package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Banner extends AbstractC0269h implements sre0 {
    public static final int COLORS_FIELD_NUMBER = 4;
    public static final int CTAS_FIELD_NUMBER = 5;
    private static final Banner DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int ICON_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private int bitField0_;
    private Colors colors_;
    private Icon icon_;
    private String title_ = "";
    private String description_ = "";
    private ae50 ctas_ = AbstractC0269h.emptyProtobufList();
    private String ubiId_ = "";

    static {
        Banner banner = new Banner();
        DEFAULT_INSTANCE = banner;
        AbstractC0269h.registerDefaultInstance(Banner.class, banner);
    }

    private Banner() {
    }

    /* JADX INFO: renamed from: o */
    public static Banner m21704o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001d\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဉ\u0003\u0005\u001bdለ\u0004", new Object[]{"bitField0_", "icon_", "title_", "description_", "colors_", "ctas_", Cta.class, "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new Banner();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 22);
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
        synchronized (Banner.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final Colors m21705n() {
        Colors colors = this.colors_;
        return colors == null ? Colors.m21721o() : colors;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Icon m21706p() {
        Icon icon = this.icon_;
        return icon == null ? Icon.m21752o() : icon;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
