package com.spotify.home.browse.clientnative.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes7.dex */
public final class BrowseAdProto$VideoAsset extends AbstractC0269h implements sre0 {
    private static final BrowseAdProto$VideoAsset DEFAULT_INSTANCE;
    public static final int DURATION_SEC_FIELD_NUMBER = 3;
    public static final int HEX_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private int durationSec_;
    private String url_ = "";
    private String hexId_ = "";

    static {
        BrowseAdProto$VideoAsset browseAdProto$VideoAsset = new BrowseAdProto$VideoAsset();
        DEFAULT_INSTANCE = browseAdProto$VideoAsset;
        AbstractC0269h.registerDefaultInstance(BrowseAdProto$VideoAsset.class, browseAdProto$VideoAsset);
    }

    private BrowseAdProto$VideoAsset() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003\u0004", new Object[]{"bitField0_", "url_", "hexId_", "durationSec_"});
        }
        if (iOrdinal == 3) {
            return new BrowseAdProto$VideoAsset();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 22);
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
        synchronized (BrowseAdProto$VideoAsset.class) {
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
    public final int m11747n() {
        return this.durationSec_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11748o() {
        return this.hexId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
