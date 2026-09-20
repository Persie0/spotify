package com.spotify.localfiles.mediastoreimpl;

import android.content.Context;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/localfiles/mediastoreimpl/OpenedAudioFilesModule;", "", "Companion", "src_main_java_com_spotify_localfiles_mediastoreimpl-mediastoreimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface OpenedAudioFilesModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/localfiles/mediastoreimpl/OpenedAudioFilesModule$Companion;", "", "<init>", "()V", "provideOpenedAudioFiles", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "context", "Landroid/content/Context;", "src_main_java_com_spotify_localfiles_mediastoreimpl-mediastoreimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OpenedAudioFiles provideOpenedAudioFiles(Context context) {
            return new OpenedAudioFiles(context);
        }
    }
}
