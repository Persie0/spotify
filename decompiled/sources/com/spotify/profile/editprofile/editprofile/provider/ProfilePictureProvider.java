package com.spotify.profile.editprofile.editprofile.provider;

import androidx.core.content.FileProvider;
import com.spotify.music.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/profile/editprofile/editprofile/provider/ProfilePictureProvider;", "Landroidx/core/content/FileProvider;", "<init>", "()V", "src_main_java_com_spotify_profile_editprofile-editprofile"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ProfilePictureProvider extends FileProvider {
    public ProfilePictureProvider() {
        super(R.xml.profile_picture_paths);
    }
}
