package p204p;

import android.app.Activity;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class wr9 {

    /* JADX INFO: renamed from: a */
    public final hol0 f254295a;

    public wr9(hol0 hol0Var) {
        this.f254295a = hol0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m88811a(String str, boolean z) {
        int iOrdinal = new gf41(str).f79270c.ordinal();
        if (iOrdinal != 2 && iOrdinal != 6 && iOrdinal != 8) {
            throw new IllegalArgumentException("Unsupported uri: ".concat(str));
        }
        hol0 hol0Var = this.f254295a;
        nt7 nt7Var = (nt7) hol0Var.f93563c;
        fs9 fs9Var = (fs9) hol0Var.f93566f;
        jh10 jh10Var = (jh10) nt7Var.f157999c;
        Activity activity = (Activity) nt7Var.f157998b;
        ih10 ih10VarM31832a0 = c95.m31832a0(jh10Var.f112309a, activity.getString(R.string.genalpha_blocking_dialog_title), activity.getString(R.string.genalpha_blocking_dialog_description));
        String string = activity.getString(R.string.genalpha_blocking_dialog_positive_button);
        ilr ilrVar = new ilr(z, fs9Var);
        ih10VarM31832a0.f102113a = string;
        ih10VarM31832a0.f102115c = ilrVar;
        ih10VarM31832a0.f102117e = true;
        ih10VarM31832a0.f102118f = new gs9(z, fs9Var);
        ih10VarM31832a0.m50574b().m58942b();
        kv91 kv91VarMo39897g = ((es9) ((vpj) ((qmm) hol0Var.f93564d).f190353a.f16603b).f243701b).mo39897g();
        jg31.m53271i(kv91VarMo39897g);
        hol0Var.f93565e = new np7(str, kv91VarMo39897g);
        np7 np7VarM48097v = hol0Var.m48097v();
        ((kv91) np7VarM48097v.f156890b).mo57449i(((bbg0) np7VarM48097v.f156891c).mo24514e(), null);
    }
}
