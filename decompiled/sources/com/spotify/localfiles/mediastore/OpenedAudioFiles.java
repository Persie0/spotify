package com.spotify.localfiles.mediastore;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import com.spotify.localfiles.localfilesmonorepo.AddedLocalFile;
import com.spotify.localfiles.proto.LocalFile;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import p204p.edb;
import p204p.ek5;
import p204p.geg1;
import p204p.gf41;
import p204p.ikc0;
import p204p.n0e1;
import p204p.qsz0;
import p204p.wj50;
import p204p.wl51;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m24212d2 = {"Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/spotify/localfiles/proto/LocalFile;", "Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "toAddedLocalFile", "(Lcom/spotify/localfiles/proto/LocalFile;)Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "", "toSpotifyLocalUri", "(Lcom/spotify/localfiles/proto/LocalFile;)Ljava/lang/String;", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "Landroid/net/Uri;", "uri", "Lcom/spotify/localfiles/proto/LocalFile$Builder;", "file", "Lcom/spotify/localfiles/proto/LocalFile$Metadata$Builder;", "metadata", "Lp/w2a1;", "decorate", "(Landroid/media/MediaMetadataRetriever;Landroid/net/Uri;Lcom/spotify/localfiles/proto/LocalFile$Builder;Lcom/spotify/localfiles/proto/LocalFile$Metadata$Builder;)V", "displayName", "(Landroid/net/Uri;)Ljava/lang/String;", "addTemporary", "(Landroid/net/Uri;)Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "toFile", "(Landroid/net/Uri;)Lcom/spotify/localfiles/proto/LocalFile;", "Landroid/content/Context;", "", "temporaryFiles", "Ljava/util/Set;", "Lp/qsz0;", "getFiles", "()Lp/qsz0;", "files", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OpenedAudioFiles {
    private final Context context;
    private final Set<Uri> temporaryFiles = new LinkedHashSet();

    public OpenedAudioFiles(Context context) {
        this.context = context;
    }

    private final void decorate(MediaMetadataRetriever mediaMetadataRetriever, Uri uri, LocalFile.Builder file, LocalFile.Metadata.Builder metadata) {
        file.setPath(uri.toString());
        mediaMetadataRetriever.setDataSource(this.context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(7);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(1);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(2);
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
        boolean z = mediaMetadataRetriever.getEmbeddedPicture() != null;
        if (strExtractMetadata == null && (strExtractMetadata = displayName(uri)) == null) {
            strExtractMetadata = uri.getLastPathSegment();
        }
        metadata.setTitle(strExtractMetadata);
        if (strExtractMetadata2 == null) {
            strExtractMetadata2 = "";
        }
        metadata.setAlbum(strExtractMetadata2);
        if (strExtractMetadata3 == null) {
            strExtractMetadata3 = "";
        }
        metadata.setArtist(strExtractMetadata3);
        metadata.setDuration((strExtractMetadata4 != null ? Integer.parseInt(strExtractMetadata4) : 0) / 1000);
        metadata.setImageState(z ? LocalFile.Metadata.ImageState.AVAILABLE : LocalFile.Metadata.ImageState.UNAVAILABLE);
        file.setMetadata((LocalFile.Metadata) metadata.build());
    }

    private final String displayName(Uri uri) throws IOException {
        Cursor cursorQuery = this.context.getContentResolver().query(uri, (String[]) geg1.m44518y("_display_name").toArray(new String[0]), null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            if (columnIndex < 0 || !cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return null;
            }
            String string = cursorQuery.getString(columnIndex);
            String strM88487k1 = string != null ? wl51.m88487k1(string, '.') : null;
            cursorQuery.close();
            return strM88487k1;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(cursorQuery, th);
                throw th2;
            }
        }
    }

    private final AddedLocalFile toAddedLocalFile(LocalFile localFile) {
        return new AddedLocalFile(localFile.getMetadata().getDuration(), localFile.getMetadata().getAlbum(), localFile.getMetadata().getArtist(), localFile.getMetadata().getTitle(), toSpotifyLocalUri(localFile));
    }

    private final String toSpotifyLocalUri(LocalFile localFile) {
        String strM44570d = gf41.m44570d(localFile.getMetadata().getArtist());
        String strM44570d2 = gf41.m44570d(localFile.getMetadata().getAlbum());
        String strM44570d3 = gf41.m44570d(localFile.getMetadata().getTitle());
        int duration = localFile.getMetadata().getDuration();
        StringBuilder sbM38573v = edb.m38573v("spotify:local:", strM44570d, ":", strM44570d2, ":");
        sbM38573v.append(strM44570d3);
        sbM38573v.append(":");
        sbM38573v.append(duration);
        return sbM38573v.toString();
    }

    public final AddedLocalFile addTemporary(Uri uri) throws Exception {
        this.temporaryFiles.add(uri);
        LocalFile file = toFile(uri);
        if (file != null) {
            return toAddedLocalFile(file);
        }
        return null;
    }

    public final qsz0 getFiles() {
        return new ek5(this.temporaryFiles, 1);
    }

    public final LocalFile toFile(Uri uri) throws Exception {
        LocalFile localFile;
        LocalFile.Builder builderNewBuilder = LocalFile.newBuilder();
        LocalFile.Metadata.Builder builderNewBuilder2 = LocalFile.Metadata.newBuilder();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            wj50.m88279p(builderNewBuilder);
            wj50.m88279p(builderNewBuilder2);
            decorate(mediaMetadataRetriever, uri, builderNewBuilder, builderNewBuilder2);
            localFile = (LocalFile) builderNewBuilder.build();
        } catch (Throwable unused) {
            localFile = null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ikc0.m50941m(mediaMetadataRetriever);
        } else {
            mediaMetadataRetriever.release();
        }
        return localFile;
    }
}
