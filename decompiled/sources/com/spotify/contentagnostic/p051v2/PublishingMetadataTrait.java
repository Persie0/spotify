package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class PublishingMetadataTrait extends AbstractC0269h implements sre0 {
    public static final int COPYRIGHT_INFORMATION_FIELD_NUMBER = 4;
    private static final PublishingMetadataTrait DEFAULT_INSTANCE;
    public static final int FIRST_PUBLISHED_AT_FIELD_NUMBER = 1;
    public static final int LAST_MODIFIED_AT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISHED_ON_SPOTIFY_AT_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 copyrightInformation_ = AbstractC0269h.emptyProtobufList();
    private TimestampOfVaryingGranularity firstPublishedAt_;
    private Timestamp lastModifiedAt_;
    private Timestamp publishedOnSpotifyAt_;

    static {
        PublishingMetadataTrait publishingMetadataTrait = new PublishingMetadataTrait();
        DEFAULT_INSTANCE = publishingMetadataTrait;
        AbstractC0269h.registerDefaultInstance(PublishingMetadataTrait.class, publishingMetadataTrait);
    }

    private PublishingMetadataTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static PublishingMetadataTrait m7919r(byte[] bArr) {
        return (PublishingMetadataTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ț", new Object[]{"bitField0_", "firstPublishedAt_", "publishedOnSpotifyAt_", "lastModifiedAt_", "copyrightInformation_"});
        }
        if (iOrdinal == 3) {
            return new PublishingMetadataTrait();
        }
        if (iOrdinal == 4) {
            return new d5t0(2);
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
        synchronized (PublishingMetadataTrait.class) {
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
    public final ae50 m7920o() {
        return this.copyrightInformation_;
    }

    /* JADX INFO: renamed from: p */
    public final TimestampOfVaryingGranularity m7921p() {
        TimestampOfVaryingGranularity timestampOfVaryingGranularity = this.firstPublishedAt_;
        return timestampOfVaryingGranularity == null ? TimestampOfVaryingGranularity.m7940o() : timestampOfVaryingGranularity;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m7922q() {
        Timestamp timestamp = this.publishedOnSpotifyAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
