package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class gbl {

    /* JADX INFO: renamed from: a */
    public final String f78346a;

    /* JADX INFO: renamed from: b */
    public final String f78347b;

    public gbl(Context context) {
        this.f78346a = dq60.m36614n("\\p{N}+", context.getString(R.string.create_playlist_name_generation_playlist_name, 0), "");
        this.f78347b = dq60.m36614n("\\p{N}+", context.getString(R.string.create_playlist_name_generation_collaborative_playlist_name, 0), "");
    }
}
