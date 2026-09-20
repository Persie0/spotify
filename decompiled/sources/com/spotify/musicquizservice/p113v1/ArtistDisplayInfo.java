package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.aw2;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ArtistDisplayInfo extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_URLS_FIELD_NUMBER = 3;
    private static final ArtistDisplayInfo DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTLIGHT_URI_FIELD_NUMBER = 1;
    private String spotlightUri_ = "";
    private ae50 backgroundUrls_ = AbstractC0269h.emptyProtobufList();

    static {
        ArtistDisplayInfo artistDisplayInfo = new ArtistDisplayInfo();
        DEFAULT_INSTANCE = artistDisplayInfo;
        AbstractC0269h.registerDefaultInstance(ArtistDisplayInfo.class, artistDisplayInfo);
    }

    private ArtistDisplayInfo() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ȉ\u0003Ț", new Object[]{"spotlightUri_", "backgroundUrls_"});
        }
        if (iOrdinal == 3) {
            return new ArtistDisplayInfo();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 27);
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
        synchronized (ArtistDisplayInfo.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
