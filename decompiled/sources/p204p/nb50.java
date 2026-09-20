package p204p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nb50 {

    /* JADX INFO: renamed from: a */
    public final k5m0 f152190a;

    /* JADX INFO: renamed from: b */
    public final String f152191b;

    public nb50(k5m0 k5m0Var) {
        List list;
        this.f152190a = k5m0Var;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.AIDJ_INTERACTIVITY_CONTAINER);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f152191b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m64065a(int i, z650 z650Var) {
        k5m0.m55541i(this.f152190a, new Uri.Builder().encodedPath(this.f152191b).appendQueryParameter("inputMode", oq40.m67585d(i)).build().toString(), z650Var != null ? z650Var.f279709a : null, null, false, 12);
    }
}
