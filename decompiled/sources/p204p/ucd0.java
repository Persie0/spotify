package p204p;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ucd0 {
    /* JADX INFO: renamed from: a */
    public static Uri m82771a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* JADX INFO: renamed from: b */
    public static void m82772b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
