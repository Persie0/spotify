package com.spotify.graduation.p073v1;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes7.dex */
public enum DownloadStatus implements od50 {
    UNKNOWN(0),
    REQUESTED(1),
    READY(2),
    UNRECOGNIZED(-1);

    public static final int READY_VALUE = 2;
    public static final int REQUESTED_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final rd50 internalValueMap = new C07761();
    private final int value;

    /* JADX INFO: renamed from: com.spotify.graduation.v1.DownloadStatus$1 */
    public class C07761 implements rd50 {
        @Override // p204p.rd50
        public final DownloadStatus findValueByNumber(int i) {
            return DownloadStatus.forNumber(i);
        }

        @Override // p204p.rd50
        public final od50 findValueByNumber(int i) {
            return DownloadStatus.forNumber(i);
        }
    }

    public static final class DownloadStatusVerifier implements sd50 {
        static final sd50 INSTANCE = new DownloadStatusVerifier();

        private DownloadStatusVerifier() {
        }

        @Override // p204p.sd50
        public final boolean isInRange(int i) {
            return DownloadStatus.forNumber(i) != null;
        }
    }

    DownloadStatus(int i) {
        this.value = i;
    }

    public static DownloadStatus forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return REQUESTED;
        }
        if (i != 2) {
            return null;
        }
        return READY;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return DownloadStatusVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DownloadStatus valueOf(int i) {
        return forNumber(i);
    }
}
