package com.spotify.casita.p040v1.resolved.watchfeed;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.chb1;
import p204p.eub1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFile extends AbstractC0269h implements sre0 {
    private static final VideoFile DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration endTime_;
    private Duration startTime_;
    private int type_;
    private String uri_ = "";

    static {
        VideoFile videoFile = new VideoFile();
        DEFAULT_INSTANCE = videoFile;
        AbstractC0269h.registerDefaultInstance(VideoFile.class, videoFile);
    }

    private VideoFile() {
    }

    /* JADX INFO: renamed from: o */
    public static VideoFile m5911o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "uri_", "type_", "startTime_", "endTime_"});
        }
        if (iOrdinal == 3) {
            return new VideoFile();
        }
        if (iOrdinal == 4) {
            return new chb1(14);
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
        synchronized (VideoFile.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Duration m5912p() {
        Duration duration = this.endTime_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: q */
    public final Duration m5913q() {
        Duration duration = this.startTime_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: r */
    public final eub1 m5914r() {
        eub1 eub1Var;
        int i = this.type_;
        if (i == 0) {
            eub1Var = eub1.UNKNOWN;
        } else if (i != 1) {
            eub1Var = i != 2 ? null : eub1.MANIFEST_ID;
        } else {
            eub1Var = eub1.URL;
        }
        return eub1Var == null ? eub1.UNRECOGNIZED : eub1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
