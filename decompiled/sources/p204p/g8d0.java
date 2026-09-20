package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import androidx.media3.session.legacy.MediaBrowserProtocol;

/* JADX INFO: loaded from: classes3.dex */
public class g8d0 {

    /* JADX INFO: renamed from: a */
    public final Context f77458a;

    /* JADX INFO: renamed from: b */
    public final MediaBrowser f77459b;

    /* JADX INFO: renamed from: c */
    public final Bundle f77460c;

    /* JADX INFO: renamed from: d */
    public final f8d0 f77461d = new f8d0(this);

    /* JADX INFO: renamed from: e */
    public final uj5 f77462e = new uj5(0);

    /* JADX INFO: renamed from: f */
    public i780 f77463f;

    /* JADX INFO: renamed from: g */
    public Messenger f77464g;

    public g8d0(Context context, ComponentName componentName, w0e1 w0e1Var) {
        this.f77458a = context;
        Bundle bundle = new Bundle();
        this.f77460c = bundle;
        bundle.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
        bundle.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
        w0e1Var.f246721c = this;
        this.f77459b = new MediaBrowser(context, componentName, (ag4) w0e1Var.f246720b, bundle);
    }
}
