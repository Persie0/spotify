package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class FullBleedBanner extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_FIELD_NUMBER = 5;
    public static final int COLOR_CODE_FIELD_NUMBER = 2;
    private static final FullBleedBanner DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private String colorCode_ = "";
    private String imageUrl_ = "";
    private String description_ = "";
    private String accessibility_ = "";

    static {
        FullBleedBanner fullBleedBanner = new FullBleedBanner();
        DEFAULT_INSTANCE = fullBleedBanner;
        AbstractC0269h.registerDefaultInstance(FullBleedBanner.class, fullBleedBanner);
    }

    private FullBleedBanner() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static FullBleedBanner m5642q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"colorCode_", "imageUrl_", "description_", "accessibility_"});
        }
        if (iOrdinal == 3) {
            return new FullBleedBanner();
        }
        if (iOrdinal == 4) {
            return new ie00(0);
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
        synchronized (FullBleedBanner.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m5643o() {
        return this.accessibility_;
    }

    /* JADX INFO: renamed from: p */
    public final String m5644p() {
        return this.colorCode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
