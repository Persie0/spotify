package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class FullBleedBottomsheet extends AbstractC0269h implements sre0 {
    public static final int BODY_FIELD_NUMBER = 2;
    private static final FullBleedBottomsheet DEFAULT_INSTANCE;
    public static final int HEADLINE_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private String headline_ = "";
    private String body_ = "";
    private String imageUrl_ = "";

    static {
        FullBleedBottomsheet fullBleedBottomsheet = new FullBleedBottomsheet();
        DEFAULT_INSTANCE = fullBleedBottomsheet;
        AbstractC0269h.registerDefaultInstance(FullBleedBottomsheet.class, fullBleedBottomsheet);
    }

    private FullBleedBottomsheet() {
    }

    /* JADX INFO: renamed from: o */
    public static FullBleedBottomsheet m17187o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"headline_", "body_", "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new FullBleedBottomsheet();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 1);
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
        synchronized (FullBleedBottomsheet.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: n */
    public final String m17188n() {
        return this.body_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m17189p() {
        return this.headline_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
