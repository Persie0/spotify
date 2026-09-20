package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;
import p204p.fv30;

/* JADX INFO: renamed from: android.support.v4.media.session.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0002a extends IInterface {
    /* JADX INFO: renamed from: B0 */
    void mo37B0(RatingCompat ratingCompat);

    /* JADX INFO: renamed from: F0 */
    void mo38F0(MediaDescriptionCompat mediaDescriptionCompat);

    /* JADX INFO: renamed from: G */
    void mo39G(String str, Bundle bundle);

    /* JADX INFO: renamed from: G0 */
    boolean mo40G0();

    /* JADX INFO: renamed from: H0 */
    void mo41H0(MediaDescriptionCompat mediaDescriptionCompat);

    /* JADX INFO: renamed from: I */
    void mo42I(String str, Bundle bundle);

    /* JADX INFO: renamed from: J0 */
    void mo43J0(String str, Bundle bundle);

    /* JADX INFO: renamed from: K */
    void mo44K(String str, Bundle bundle);

    /* JADX INFO: renamed from: M */
    void mo45M(Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: P1 */
    ParcelableVolumeInfo mo46P1();

    /* JADX INFO: renamed from: T1 */
    void mo47T1(fv30 fv30Var);

    /* JADX INFO: renamed from: Y */
    boolean mo48Y(KeyEvent keyEvent);

    /* JADX INFO: renamed from: Y0 */
    void mo49Y0();

    /* JADX INFO: renamed from: a */
    void mo50a();

    void adjustVolume(int i, int i2);

    /* JADX INFO: renamed from: b */
    void mo51b();

    /* JADX INFO: renamed from: d0 */
    void mo52d0(RatingCompat ratingCompat, Bundle bundle);

    /* JADX INFO: renamed from: e */
    void mo53e(float f);

    /* JADX INFO: renamed from: f */
    void mo54f(long j);

    /* JADX INFO: renamed from: f0 */
    void mo55f0(MediaDescriptionCompat mediaDescriptionCompat, int i);

    /* JADX INFO: renamed from: g */
    void mo56g();

    Bundle getExtras();

    long getFlags();

    MediaMetadataCompat getMetadata();

    String getPackageName();

    PlaybackStateCompat getPlaybackState();

    List getQueue();

    CharSequence getQueueTitle();

    int getRatingType();

    int getRepeatMode();

    Bundle getSessionInfo();

    int getShuffleMode();

    String getTag();

    void isCaptioningEnabled();

    /* JADX INFO: renamed from: k */
    void mo57k(String str, Bundle bundle);

    /* JADX INFO: renamed from: l0 */
    void mo58l0(int i);

    void next();

    /* JADX INFO: renamed from: p0 */
    void mo59p0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void previous();

    /* JADX INFO: renamed from: q */
    void mo60q(Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: q1 */
    void mo61q1(boolean z);

    /* JADX INFO: renamed from: r0 */
    void mo62r0();

    void setRepeatMode(int i);

    void setShuffleMode(int i);

    void setVolumeTo(int i, int i2);

    void stop();

    /* JADX INFO: renamed from: t0 */
    void mo63t0(long j);

    /* JADX INFO: renamed from: v */
    PendingIntent mo64v();

    /* JADX INFO: renamed from: z1 */
    void mo65z1(fv30 fv30Var);
}
