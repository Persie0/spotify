package com.spotify.betamax.offlinecoordinator.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q0l0;
import p204p.r0l0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class OfflinePlugin$DownloadResponse extends AbstractC0269h implements sre0 {
    public static final int BYTES_DOWNLOADED_FIELD_NUMBER = 4;
    public static final int COMPLETE_FIELD_NUMBER = 2;
    private static final OfflinePlugin$DownloadResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 5;
    public static final int FILE_SIZE_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private long bytesDownloaded_;
    private boolean complete_;
    private int error_;
    private long fileSize_;
    private String link_ = "";

    static {
        OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse = new OfflinePlugin$DownloadResponse();
        DEFAULT_INSTANCE = offlinePlugin$DownloadResponse;
        AbstractC0269h.registerDefaultInstance(OfflinePlugin$DownloadResponse.class, offlinePlugin$DownloadResponse);
    }

    private OfflinePlugin$DownloadResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3984n(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, long j) {
        offlinePlugin$DownloadResponse.bytesDownloaded_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m3985o(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, boolean z) {
        offlinePlugin$DownloadResponse.complete_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m3986p(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, r0l0 r0l0Var) {
        offlinePlugin$DownloadResponse.getClass();
        offlinePlugin$DownloadResponse.error_ = r0l0Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3987q(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, long j) {
        offlinePlugin$DownloadResponse.fileSize_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m3988r(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, String str) {
        offlinePlugin$DownloadResponse.getClass();
        offlinePlugin$DownloadResponse.link_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static q0l0 m3989s() {
        return (q0l0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0002\u0004\u0002\u0005\f", new Object[]{"link_", "complete_", "fileSize_", "bytesDownloaded_", "error_"});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$DownloadResponse();
        }
        if (iOrdinal == 4) {
            return new q0l0(DEFAULT_INSTANCE);
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
        synchronized (OfflinePlugin$DownloadResponse.class) {
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
