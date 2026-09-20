package p204p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kei0 extends MusicAppLock {
    public kei0(String str) {
        super(str.concat(" worker"), false, null);
    }
}
