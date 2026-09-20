package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xhc0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class MapLink extends AbstractC0269h implements sre0 {
    private static final MapLink DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private int provider_;
    private String url_ = "";

    static {
        MapLink mapLink = new MapLink();
        DEFAULT_INSTANCE = mapLink;
        AbstractC0269h.registerDefaultInstance(MapLink.class, mapLink);
    }

    private MapLink() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"provider_", "url_"});
        }
        if (iOrdinal == 3) {
            return new MapLink();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 18);
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
        synchronized (MapLink.class) {
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
    public final xhc0 m22307n() {
        xhc0 xhc0Var;
        int i = this.provider_;
        if (i == 0) {
            xhc0Var = xhc0.MAPS_PROVIDER_UNSPECIFIED;
        } else if (i != 1) {
            xhc0Var = i != 2 ? null : xhc0.MAPS_PROVIDER_APPLE;
        } else {
            xhc0Var = xhc0.MAPS_PROVIDER_GOOGLE;
        }
        return xhc0Var == null ? xhc0.UNRECOGNIZED : xhc0Var;
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
