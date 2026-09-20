package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.ShareConfiguration;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class TopArtistsDetailsPage extends AbstractC0269h implements sre0 {
    private static final TopArtistsDetailsPage DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int TOP_ARTISTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShareConfiguration shareConfiguration_;
    private ae50 topArtists_ = AbstractC0269h.emptyProtobufList();

    static {
        TopArtistsDetailsPage topArtistsDetailsPage = new TopArtistsDetailsPage();
        DEFAULT_INSTANCE = topArtistsDetailsPage;
        AbstractC0269h.registerDefaultInstance(TopArtistsDetailsPage.class, topArtistsDetailsPage);
    }

    private TopArtistsDetailsPage() {
    }

    /* JADX INFO: renamed from: n */
    public static TopArtistsDetailsPage m11716n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "topArtists_", TopArtist.class, "shareConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new TopArtistsDetailsPage();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 22);
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
        synchronized (TopArtistsDetailsPage.class) {
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

    /* JADX INFO: renamed from: o */
    public final ShareConfiguration m11717o() {
        ShareConfiguration shareConfiguration = this.shareConfiguration_;
        return shareConfiguration == null ? ShareConfiguration.m11293n() : shareConfiguration;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m11718p() {
        return this.topArtists_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11719q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
