package p204p;

import android.app.Activity;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class kbm {

    /* JADX INFO: renamed from: a */
    public final Activity f121230a;

    /* JADX INFO: renamed from: a */
    public void m55950a(String str) {
        Object obj = null;
        uhc uhcVar = new uhc(-16777216, obj, obj, obj, 11);
        xvb xvbVar = new xvb(1);
        xvbVar.m92226o(1, uhcVar);
        xvbVar.m92229s();
        xvbVar.m92223k().m86160d(this.f121230a, Uri.parse(str));
    }

    public kbm(Activity activity, uyt uytVar) {
        this.f121230a = activity;
    }
}
