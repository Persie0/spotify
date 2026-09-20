package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jmw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$Progress extends AbstractC0269h implements sre0 {
    private static final EsOffline$Progress DEFAULT_INSTANCE;
    public static final int DOWNLOADED_BYTES_FIELD_NUMBER = 4;
    public static final int DOWNLOADED_TRACKS_FIELD_NUMBER = 3;
    public static final int DOWNLOADING_FIELD_NUMBER = 7;
    public static final int DOWNLOAD_SPEED_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PERCENT_COMPLETE_FIELD_NUMBER = 9;
    public static final int QUEUED_BYTES_FIELD_NUMBER = 2;
    public static final int QUEUED_TRACKS_FIELD_NUMBER = 1;
    public static final int SECONDS_LEFT_FIELD_NUMBER = 10;
    public static final int TOTAL_BYTES_FIELD_NUMBER = 6;
    public static final int TOTAL_TRACKS_FIELD_NUMBER = 5;
    private long downloadSpeed_;
    private long downloadedBytes_;
    private long downloadedTracks_;
    private boolean downloading_;
    private float percentComplete_;
    private long queuedBytes_;
    private long queuedTracks_;
    private long secondsLeft_;
    private long totalBytes_;
    private long totalTracks_;

    static {
        EsOffline$Progress esOffline$Progress = new EsOffline$Progress();
        DEFAULT_INSTANCE = esOffline$Progress;
        AbstractC0269h.registerDefaultInstance(EsOffline$Progress.class, esOffline$Progress);
    }

    private EsOffline$Progress() {
    }

    /* JADX INFO: renamed from: J */
    public static jmw m16182J() {
        return (jmw) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: K */
    public static EsOffline$Progress m16183K(byte[] bArr) {
        return (EsOffline$Progress) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: renamed from: n */
    public static void m16184n(EsOffline$Progress esOffline$Progress, long j) {
        esOffline$Progress.downloadSpeed_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m16185o(EsOffline$Progress esOffline$Progress, long j) {
        esOffline$Progress.downloadedBytes_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m16186p(EsOffline$Progress esOffline$Progress, long j) {
        esOffline$Progress.downloadedTracks_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16187q(EsOffline$Progress esOffline$Progress) {
        esOffline$Progress.downloading_ = true;
    }

    /* JADX INFO: renamed from: r */
    public static void m16188r(EsOffline$Progress esOffline$Progress, float f) {
        esOffline$Progress.percentComplete_ = f;
    }

    /* JADX INFO: renamed from: s */
    public static void m16189s(EsOffline$Progress esOffline$Progress, long j) {
        esOffline$Progress.queuedBytes_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m16190t(EsOffline$Progress esOffline$Progress, long j) {
        esOffline$Progress.queuedTracks_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m16191u(EsOffline$Progress esOffline$Progress, long j) {
        esOffline$Progress.secondsLeft_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static void m16192v(EsOffline$Progress esOffline$Progress, long j) {
        esOffline$Progress.totalBytes_ = j;
    }

    /* JADX INFO: renamed from: w */
    public static void m16193w(EsOffline$Progress esOffline$Progress, long j) {
        esOffline$Progress.totalTracks_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static EsOffline$Progress m16195y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final long m16196A() {
        return this.downloadedBytes_;
    }

    /* JADX INFO: renamed from: B */
    public final long m16197B() {
        return this.downloadedTracks_;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m16198C() {
        return this.downloading_;
    }

    /* JADX INFO: renamed from: D */
    public final float m16199D() {
        return this.percentComplete_;
    }

    /* JADX INFO: renamed from: E */
    public final long m16200E() {
        return this.queuedBytes_;
    }

    /* JADX INFO: renamed from: F */
    public final long m16201F() {
        return this.queuedTracks_;
    }

    /* JADX INFO: renamed from: G */
    public final long m16202G() {
        return this.secondsLeft_;
    }

    /* JADX INFO: renamed from: H */
    public final long m16203H() {
        return this.totalBytes_;
    }

    /* JADX INFO: renamed from: I */
    public final long m16204I() {
        return this.totalTracks_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0007\b\u0002\t\u0001\n\u0002", new Object[]{"queuedTracks_", "queuedBytes_", "downloadedTracks_", "downloadedBytes_", "totalTracks_", "totalBytes_", "downloading_", "downloadSpeed_", "percentComplete_", "secondsLeft_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Progress();
        }
        if (iOrdinal == 4) {
            return new jmw();
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
        synchronized (EsOffline$Progress.class) {
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

    /* JADX INFO: renamed from: z */
    public final long m16205z() {
        return this.downloadSpeed_;
    }
}
