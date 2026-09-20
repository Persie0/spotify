package com.spotify.localfiles.localfilesmonorepo;

import android.net.Uri;
import kotlin.Metadata;
import p204p.fbk;
import p204p.fiz;
import p204p.w2a1;
import p204p.x09;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "", "Lp/fiz;", "", "isEnabled", "()Lp/fiz;", x09.f256832d, "Lp/w2a1;", "setEnabled", "(ZLp/fbk;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "addTemporaryFile", "(Landroid/net/Uri;)Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "src_main_java_com_spotify_localfiles_localfiles-android-localfiles"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface LocalFilesFeature {
    AddedLocalFile addTemporaryFile(Uri uri);

    fiz isEnabled();

    Object setEnabled(boolean z, fbk<? super w2a1> fbkVar);
}
