package p204p;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.BinderC0004c;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
public class jod0 {

    /* JADX INFO: renamed from: a */
    public final MediaSession f114393a;

    /* JADX INFO: renamed from: b */
    public final BinderC0004c f114394b;

    /* JADX INFO: renamed from: c */
    public final MediaSessionCompat$Token f114395c;

    /* JADX INFO: renamed from: e */
    public Bundle f114397e;

    /* JADX INFO: renamed from: g */
    public PlaybackStateCompat f114399g;

    /* JADX INFO: renamed from: h */
    public Object f114400h;

    /* JADX INFO: renamed from: i */
    public MediaMetadataCompat f114401i;

    /* JADX INFO: renamed from: j */
    public int f114402j;

    /* JADX INFO: renamed from: k */
    public int f114403k;

    /* JADX INFO: renamed from: l */
    public int f114404l;

    /* JADX INFO: renamed from: m */
    public iod0 f114405m;

    /* JADX INFO: renamed from: n */
    public qqd0 f114406n;

    /* JADX INFO: renamed from: d */
    public final Object f114396d = new Object();

    /* JADX INFO: renamed from: f */
    public final RemoteCallbackList f114398f = new RemoteCallbackList();

    public jod0(Context context, String str) {
        MediaSession mediaSessionMo53880a = mo53880a(context, str);
        this.f114393a = mediaSessionMo53880a;
        BinderC0004c binderC0004c = new BinderC0004c(this);
        this.f114394b = binderC0004c;
        this.f114395c = new MediaSessionCompat$Token(mediaSessionMo53880a.getSessionToken(), binderC0004c, 0);
        this.f114397e = null;
        mediaSessionMo53880a.setFlags(3);
    }

    /* JADX INFO: renamed from: a */
    public MediaSession mo53880a(Context context, String str) {
        return new MediaSession(context, str);
    }

    /* JADX INFO: renamed from: b */
    public final iod0 m53881b() {
        iod0 iod0Var;
        synchronized (this.f114396d) {
            iod0Var = this.f114405m;
        }
        return iod0Var;
    }

    /* JADX INFO: renamed from: c */
    public qqd0 mo53882c() {
        qqd0 qqd0Var;
        synchronized (this.f114396d) {
            qqd0Var = this.f114406n;
        }
        return qqd0Var;
    }

    /* JADX INFO: renamed from: d */
    public final PlaybackStateCompat m53883d() {
        return this.f114399g;
    }

    /* JADX INFO: renamed from: e */
    public final void m53884e(iod0 iod0Var, Handler handler) {
        synchronized (this.f114396d) {
            try {
                this.f114405m = iod0Var;
                this.f114393a.setCallback(iod0Var == null ? null : iod0Var.f104192b, handler);
                if (iod0Var != null) {
                    iod0Var.m51176t(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo53885f(qqd0 qqd0Var) {
        synchronized (this.f114396d) {
            this.f114406n = qqd0Var;
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo53886g() {
        this.f114402j = 2;
    }

    public jod0(MediaSession mediaSession) {
        this.f114393a = mediaSession;
        BinderC0004c binderC0004c = new BinderC0004c(this);
        this.f114394b = binderC0004c;
        this.f114395c = new MediaSessionCompat$Token(mediaSession.getSessionToken(), binderC0004c, 0);
        this.f114397e = null;
        mediaSession.setFlags(3);
    }
}
