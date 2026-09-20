package p204p;

import android.os.IInterface;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public interface fv30 extends IInterface {
    /* JADX INFO: renamed from: Y1 */
    void mo40087Y1(PlaybackStateCompat playbackStateCompat);

    void onRepeatModeChanged(int i);

    void onShuffleModeChanged(int i);
}
