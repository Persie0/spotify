package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes2.dex */
public interface rg50 {
    /* JADX INFO: renamed from: a */
    MediaSessionCompat$Token mo53385a();

    /* JADX INFO: renamed from: b */
    void mo53386b(zwi zwiVar);

    /* JADX INFO: renamed from: c */
    void mo53387c();

    /* JADX INFO: renamed from: d */
    void mo53388d(pqm0 pqm0Var);

    /* JADX INFO: renamed from: e */
    void mo53389e(Context context);

    /* JADX INFO: renamed from: f */
    void mo53390f(aqp aqpVar);

    /* JADX INFO: renamed from: g */
    void mo53391g();

    /* JADX INFO: renamed from: h */
    void mo53392h();

    /* JADX INFO: renamed from: i */
    void mo53393i();

    boolean isActive();

    /* JADX INFO: renamed from: j */
    BehaviorSubject mo53394j();

    /* JADX INFO: renamed from: k */
    void mo53395k(ard0 ard0Var);

    void release();

    void reset();

    void setExtras(Bundle bundle);

    void setSessionActivity(PendingIntent pendingIntent);
}
