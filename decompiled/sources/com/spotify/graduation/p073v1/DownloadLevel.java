package com.spotify.graduation.p073v1;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes7.dex */
public enum DownloadLevel implements od50 {
    NONE(0),
    ACCOUNT_DATA(1),
    EXTENDED_STREAMING_HISTORY(2),
    TECHNICAL_LOG_INFORMATION(3),
    UNRECOGNIZED(-1);

    public static final int ACCOUNT_DATA_VALUE = 1;
    public static final int EXTENDED_STREAMING_HISTORY_VALUE = 2;
    public static final int NONE_VALUE = 0;
    public static final int TECHNICAL_LOG_INFORMATION_VALUE = 3;
    private static final rd50 internalValueMap = new C07751();
    private final int value;

    /* JADX INFO: renamed from: com.spotify.graduation.v1.DownloadLevel$1 */
    public class C07751 implements rd50 {
        @Override // p204p.rd50
        public final DownloadLevel findValueByNumber(int i) {
            return DownloadLevel.forNumber(i);
        }

        @Override // p204p.rd50
        public final od50 findValueByNumber(int i) {
            return DownloadLevel.forNumber(i);
        }
    }

    public static final class DownloadLevelVerifier implements sd50 {
        static final sd50 INSTANCE = new DownloadLevelVerifier();

        private DownloadLevelVerifier() {
        }

        @Override // p204p.sd50
        public final boolean isInRange(int i) {
            return DownloadLevel.forNumber(i) != null;
        }
    }

    DownloadLevel(int i) {
        this.value = i;
    }

    public static DownloadLevel forNumber(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ACCOUNT_DATA;
        }
        if (i == 2) {
            return EXTENDED_STREAMING_HISTORY;
        }
        if (i != 3) {
            return null;
        }
        return TECHNICAL_LOG_INFORMATION;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return DownloadLevelVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DownloadLevel valueOf(int i) {
        return forNumber(i);
    }
}
