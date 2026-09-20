package com.spotify.ads.brandads.p013v1;

import com.google.protobuf.AbstractC0269h;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class EmbeddedAdProto$ImageAsset extends AbstractC0269h implements sre0 {
    private static final EmbeddedAdProto$ImageAsset DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int HEX_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 4;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int bitField0_;
    private int height_;
    private int width_;
    private String url_ = "";
    private String hexId_ = "";

    static {
        EmbeddedAdProto$ImageAsset embeddedAdProto$ImageAsset = new EmbeddedAdProto$ImageAsset();
        DEFAULT_INSTANCE = embeddedAdProto$ImageAsset;
        AbstractC0269h.registerDefaultInstance(EmbeddedAdProto$ImageAsset.class, embeddedAdProto$ImageAsset);
    }

    private EmbeddedAdProto$ImageAsset() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0004ለ\u0000\u0005ለ\u0001", new Object[]{"bitField0_", "width_", "height_", "url_", "hexId_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdProto$ImageAsset();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 27);
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
        synchronized (EmbeddedAdProto$ImageAsset.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
