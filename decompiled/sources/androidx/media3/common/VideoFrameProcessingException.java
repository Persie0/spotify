package androidx.media3.common;

import p204p.edb;
import p204p.s571;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoFrameProcessingException extends Exception {
    public VideoFrameProcessingException(Throwable th) {
        this(-9223372036854775807L, th);
    }

    /* JADX INFO: renamed from: a */
    public static VideoFrameProcessingException m757a(long j, Exception exc) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(j, exc);
    }

    public VideoFrameProcessingException(long j, Throwable th) {
        super(j == -9223372036854775807L ? " @UNSET" : edb.m38561j(j, " @"), th);
    }

    public VideoFrameProcessingException(String str) {
        super(s571.m77250i(str, " @UNSET"));
    }
}
