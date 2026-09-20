package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x5f0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$TopTracks extends AbstractC0269h implements sre0 {
    public static final int COUNTRY_FIELD_NUMBER = 1;
    private static final Metadata$TopTracks DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private String country_ = "";
    private ae50 track_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$TopTracks metadata$TopTracks = new Metadata$TopTracks();
        DEFAULT_INSTANCE = metadata$TopTracks;
        AbstractC0269h.registerDefaultInstance(Metadata$TopTracks.class, metadata$TopTracks);
    }

    private Metadata$TopTracks() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "country_", "track_", Metadata$Track.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$TopTracks();
        }
        if (iOrdinal == 4) {
            return new x5f0(DEFAULT_INSTANCE, 9);
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
        synchronized (Metadata$TopTracks.class) {
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
    public final String m15393n() {
        return this.country_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m15394o() {
        return this.track_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
