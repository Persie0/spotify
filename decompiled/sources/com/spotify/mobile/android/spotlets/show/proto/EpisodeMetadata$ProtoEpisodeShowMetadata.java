package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EpisodeMetadata$ProtoEpisodeShowMetadata extends AbstractC0269h implements sre0 {
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final EpisodeMetadata$ProtoEpisodeShowMetadata DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISHER_FIELD_NUMBER = 3;
    private int bitField0_;
    private ImageGroup$ProtoImageGroup covers_;
    private String link_ = "";
    private String name_ = "";
    private String publisher_ = "";

    static {
        EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadata = new EpisodeMetadata$ProtoEpisodeShowMetadata();
        DEFAULT_INSTANCE = episodeMetadata$ProtoEpisodeShowMetadata;
        AbstractC0269h.registerDefaultInstance(EpisodeMetadata$ProtoEpisodeShowMetadata.class, episodeMetadata$ProtoEpisodeShowMetadata);
    }

    private EpisodeMetadata$ProtoEpisodeShowMetadata() {
    }

    /* JADX INFO: renamed from: o */
    public static EpisodeMetadata$ProtoEpisodeShowMetadata m15465o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "link_", "name_", "publisher_", "covers_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeMetadata$ProtoEpisodeShowMetadata();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 19);
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
        synchronized (EpisodeMetadata$ProtoEpisodeShowMetadata.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getPublisher() {
        return this.publisher_;
    }

    public final boolean hasCovers() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final ImageGroup$ProtoImageGroup m15466n() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.covers_;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.m15473n() : imageGroup$ProtoImageGroup;
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
