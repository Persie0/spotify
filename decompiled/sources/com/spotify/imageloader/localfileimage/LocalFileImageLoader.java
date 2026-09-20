package com.spotify.imageloader.localfileimage;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.annotation.Keep;
import kotlin.Metadata;
import p204p.C2087le;
import p204p.fr70;
import p204p.wg61;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/imageloader/localfileimage/LocalFileImageLoader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uri", "", "loadImage", "(Ljava/lang/String;)[B", "Landroid/content/Context;", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever$delegate", "Lp/fr70;", "getMediaMetadataRetriever", "()Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "src_main_java_com_spotify_localfiles_localfileimage-localfileimage"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFileImageLoader {
    private final Context context;

    /* JADX INFO: renamed from: mediaMetadataRetriever$delegate, reason: from kotlin metadata */
    private final fr70 mediaMetadataRetriever = new wg61(C2087le.f132402b1);

    public LocalFileImageLoader(Context context) {
        this.context = context;
    }

    private final MediaMetadataRetriever getMediaMetadataRetriever() {
        return (MediaMetadataRetriever) this.mediaMetadataRetriever.getValue();
    }

    public final byte[] loadImage(String uri) {
        try {
            getMediaMetadataRetriever().setDataSource(this.context, Uri.parse(uri));
            byte[] embeddedPicture = getMediaMetadataRetriever().getEmbeddedPicture();
            return embeddedPicture == null ? new byte[0] : embeddedPicture;
        } catch (IllegalArgumentException unused) {
            return new byte[0];
        } catch (IllegalStateException unused2) {
            return new byte[0];
        } catch (SecurityException unused3) {
            return new byte[0];
        } catch (UnsupportedOperationException unused4) {
            return new byte[0];
        } catch (RuntimeException unused5) {
            return new byte[0];
        } catch (Exception unused6) {
            return new byte[0];
        }
    }
}
