package p204p;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nod0 {
    /* JADX INFO: renamed from: a */
    public static MediaSession.QueueItem m65236a(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }

    /* JADX INFO: renamed from: b */
    public static MediaDescription m65237b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    /* JADX INFO: renamed from: c */
    public static long m65238c(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
