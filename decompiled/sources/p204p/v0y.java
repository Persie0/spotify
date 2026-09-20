package p204p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class v0y {

    /* JADX INFO: renamed from: a */
    public final Activity f236165a;

    /* JADX INFO: renamed from: b */
    public final q831 f236166b;

    public v0y(Activity activity, q831 q831Var) {
        this.f236165a = activity;
        this.f236166b = q831Var;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m84415c(v0y v0yVar, Uri uri, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return v0yVar.m84418b(uri, false, z);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m84416d(v0y v0yVar, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) == 0;
        v0yVar.getClass();
        return v0yVar.m84418b(Uri.parse(str), z, z2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84417a() {
        Activity activity = this.f236165a;
        String strM58669b = lbm.m58669b(activity);
        if (strM58669b == null) {
            return false;
        }
        return lbm.m58670c(activity, strM58669b);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84418b(Uri uri, boolean z, boolean z2) {
        if (z) {
            return m84419e(uri);
        }
        xvb xvbVar = new xvb(1);
        xvbVar.m92229s();
        xvbVar.m92231u();
        xvbVar.m92228r();
        xvbVar.m92225n(2);
        if (z2) {
            xvbVar.m92227q();
        }
        try {
            xvbVar.m92223k().m86160d(this.f236165a, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return m84419e(uri);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84419e(Uri uri) {
        try {
            this.f236165a.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (ActivityNotFoundException unused) {
            g631 g631VarM52392q = t0j.m79824e(R.string.external_navigator_missing_browser).m52392q();
            q831 q831Var = this.f236166b;
            if (q831Var.m72301f()) {
                q831Var.m72305j(g631VarM52392q);
                return false;
            }
            q831Var.m72307m(g631VarM52392q);
            return false;
        }
    }
}
