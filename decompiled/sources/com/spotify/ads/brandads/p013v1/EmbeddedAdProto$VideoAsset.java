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
public final class EmbeddedAdProto$VideoAsset extends AbstractC0269h implements sre0 {
    public static final int BITRATE_FIELD_NUMBER = 3;
    private static final EmbeddedAdProto$VideoAsset DEFAULT_INSTANCE;
    public static final int DURATION_SEC_FIELD_NUMBER = 6;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int HEX_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 4;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int bitField0_;
    private int bitrate_;
    private int durationSec_;
    private int height_;
    private int width_;
    private String url_ = "";
    private String hexId_ = "";

    static {
        EmbeddedAdProto$VideoAsset embeddedAdProto$VideoAsset = new EmbeddedAdProto$VideoAsset();
        DEFAULT_INSTANCE = embeddedAdProto$VideoAsset;
        AbstractC0269h.registerDefaultInstance(EmbeddedAdProto$VideoAsset.class, embeddedAdProto$VideoAsset);
    }

    private EmbeddedAdProto$VideoAsset() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004ለ\u0000\u0005ለ\u0001\u0006\u0004", new Object[]{"bitField0_", "width_", "height_", "bitrate_", "url_", "hexId_", "durationSec_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdProto$VideoAsset();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 28);
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
        synchronized (EmbeddedAdProto$VideoAsset.class) {
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

    /* JADX INFO: renamed from: n */
    public final int m2559n() {
        return this.durationSec_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m2560o() {
        return this.height_;
    }

    /* JADX INFO: renamed from: p */
    public final String m2561p() {
        return this.hexId_;
    }

    /* JADX INFO: renamed from: q */
    public final int m2562q() {
        return this.width_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
