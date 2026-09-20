package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$BulkRedownloadPreflightResponse extends AbstractC0269h implements sre0 {
    public static final int CURRENT_DOWNLOADED_BYTES_FIELD_NUMBER = 7;
    private static final EsOffline$BulkRedownloadPreflightResponse DEFAULT_INSTANCE;
    public static final int DOWNLOADS_IN_PROGRESS_FIELD_NUMBER = 6;
    public static final int HAS_SUFFICIENT_STORAGE_FIELD_NUMBER = 5;
    public static final int IS_ON_CELLULAR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_OVER_CELLULAR_ALLOWED_FIELD_NUMBER = 4;
    public static final int TOTAL_DOWNLOAD_BYTES_FIELD_NUMBER = 1;
    public static final int TOTAL_TRACKS_FIELD_NUMBER = 2;
    private long currentDownloadedBytes_;
    private int downloadsInProgress_;
    private boolean hasSufficientStorage_;
    private boolean isOnCellular_;
    private boolean syncOverCellularAllowed_;
    private long totalDownloadBytes_;
    private int totalTracks_;

    static {
        EsOffline$BulkRedownloadPreflightResponse esOffline$BulkRedownloadPreflightResponse = new EsOffline$BulkRedownloadPreflightResponse();
        DEFAULT_INSTANCE = esOffline$BulkRedownloadPreflightResponse;
        AbstractC0269h.registerDefaultInstance(EsOffline$BulkRedownloadPreflightResponse.class, esOffline$BulkRedownloadPreflightResponse);
    }

    private EsOffline$BulkRedownloadPreflightResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static EsOffline$BulkRedownloadPreflightResponse m16080u(byte[] bArr) {
        return (EsOffline$BulkRedownloadPreflightResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0004\u0007\u0002", new Object[]{"totalDownloadBytes_", "totalTracks_", "isOnCellular_", "syncOverCellularAllowed_", "hasSufficientStorage_", "downloadsInProgress_", "currentDownloadedBytes_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$BulkRedownloadPreflightResponse();
        }
        if (iOrdinal == 4) {
            return new qjw(28);
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
        synchronized (EsOffline$BulkRedownloadPreflightResponse.class) {
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
    public final long m16081o() {
        return this.currentDownloadedBytes_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16082p() {
        return this.hasSufficientStorage_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16083q() {
        return this.isOnCellular_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m16084r() {
        return this.syncOverCellularAllowed_;
    }

    /* JADX INFO: renamed from: s */
    public final long m16085s() {
        return this.totalDownloadBytes_;
    }

    /* JADX INFO: renamed from: t */
    public final int m16086t() {
        return this.totalTracks_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
