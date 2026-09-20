package com.spotify.extendedmetadata.extensions.audiobookspecificsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AudiobookSpecifics extends AbstractC0269h implements sre0 {
    public static final int CREDITS_FIELD_NUMBER = 2;
    private static final AudiobookSpecifics DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 4;
    public static final int EDITION_FIELD_NUMBER = 3;
    public static final int MAIN_TITLE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 5;
    public static final int SERIES_NAME_FIELD_NUMBER = 9;
    public static final int SERIES_NUMBER_FIELD_NUMBER = 8;
    public static final int SERIES_POSITION_LABEL_FIELD_NUMBER = 10;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Credits credits_;
    private long durationMs_;
    private Timestamp publishDate_;
    private String uri_ = "";
    private String edition_ = "";
    private String mainTitle_ = "";
    private String subtitle_ = "";
    private String seriesNumber_ = "";
    private String seriesName_ = "";
    private String seriesPositionLabel_ = "";

    static {
        AudiobookSpecifics audiobookSpecifics = new AudiobookSpecifics();
        DEFAULT_INSTANCE = audiobookSpecifics;
        AbstractC0269h.registerDefaultInstance(AudiobookSpecifics.class, audiobookSpecifics);
    }

    private AudiobookSpecifics() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: v */
    public static AudiobookSpecifics m9855v(byte[] bArr) {
        return (AudiobookSpecifics) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004\u0002\u0005ဉ\u0001\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"bitField0_", "uri_", "credits_", "edition_", "durationMs_", "publishDate_", "mainTitle_", "subtitle_", "seriesNumber_", "seriesName_", "seriesPositionLabel_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookSpecifics();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 12);
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
        synchronized (AudiobookSpecifics.class) {
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
    public final Credits m9856n() {
        Credits credits = this.credits_;
        return credits == null ? Credits.m9864o() : credits;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m9857o() {
        return this.durationMs_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9858p() {
        return this.edition_;
    }

    /* JADX INFO: renamed from: q */
    public final String m9859q() {
        return this.mainTitle_;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m9860r() {
        Timestamp timestamp = this.publishDate_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: s */
    public final String m9861s() {
        return this.seriesName_;
    }

    /* JADX INFO: renamed from: t */
    public final String m9862t() {
        return this.seriesNumber_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m9863u() {
        return this.seriesPositionLabel_;
    }
}
