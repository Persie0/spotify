package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.lkc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VenueMapLink extends AbstractC0269h implements sre0 {
    private static final VenueMapLink DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int provider_;
    private String uri_ = "";

    static {
        VenueMapLink venueMapLink = new VenueMapLink();
        DEFAULT_INSTANCE = venueMapLink;
        AbstractC0269h.registerDefaultInstance(VenueMapLink.class, venueMapLink);
    }

    private VenueMapLink() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"provider_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new VenueMapLink();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 13);
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
        synchronized (VenueMapLink.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final lkc0 m7204n() {
        lkc0 lkc0Var;
        int i = this.provider_;
        if (i == 0) {
            lkc0Var = lkc0.MAPS_PROVIDER_UNSPECIFIED;
        } else if (i != 1) {
            lkc0Var = i != 2 ? null : lkc0.MAPS_PROVIDER_APPLE;
        } else {
            lkc0Var = lkc0.MAPS_PROVIDER_GOOGLE;
        }
        return lkc0Var == null ? lkc0.UNRECOGNIZED : lkc0Var;
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
