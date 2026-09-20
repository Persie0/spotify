package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.login.loginflowimpl.LoginActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class rta0 {

    /* JADX INFO: renamed from: a */
    public final rc9 f202554a;

    public rta0(rc9 rc9Var) {
        this.f202554a = rc9Var;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m76375a(rta0 rta0Var, Context context, Intent intent, qta0 qta0Var) {
        rta0Var.getClass();
        Intent intent2 = new Intent();
        intent2.setClass(context, LoginActivity.class);
        intent2.putExtra("intent", intent);
        intent2.putExtra("previously_logged_in", false);
        intent2.putExtra("child_credentials", qta0Var);
        intent2.setFlags(268468224);
        return intent2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Intent m76376c(rta0 rta0Var, Context context, Intent intent, Uri uri, int i) {
        if ((i & 8) != 0) {
            uri = null;
        }
        return rta0Var.m76377b(context, intent, false, uri, 268468224, (i & 32) != 0, false);
    }

    /* JADX INFO: renamed from: b */
    public final Intent m76377b(Context context, Intent intent, boolean z, Uri uri, int i, boolean z2, boolean z3) {
        Uri uriM95952r0;
        Intent intent2 = (Intent) intent.clone();
        if (xfg1.m90496r(intent2.getData())) {
            intent2.setData(null);
        }
        Intent intent3 = new Intent();
        intent3.setClass(context, LoginActivity.class);
        intent3.putExtra("intent", intent2);
        intent3.putExtra("previously_logged_in", z);
        intent3.putExtra("is_web_login_flow_supported", z2);
        intent3.putExtra("extra_start_on_login", z3);
        intent3.setFlags(i);
        intent3.setData(uri);
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (uriM95952r0 = ze0.m95952r0(activity)) != null) {
            intent3.putExtra("android.intent.extra.REFERRER", uriM95952r0);
        }
        return intent3;
    }
}
