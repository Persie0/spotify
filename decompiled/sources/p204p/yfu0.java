package p204p;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class yfu0 {

    /* JADX INFO: renamed from: a */
    public final k5m0 f272343a;

    /* JADX INFO: renamed from: b */
    public final c700 f272344b;

    /* JADX INFO: renamed from: c */
    public final xfu0 f272345c;

    /* JADX INFO: renamed from: d */
    public final bm4 f272346d;

    /* JADX INFO: renamed from: e */
    public final Handler f272347e = new Handler(Looper.getMainLooper());

    public yfu0(k5m0 k5m0Var, c700 c700Var, xfu0 xfu0Var, bm4 bm4Var) {
        this.f272343a = k5m0Var;
        this.f272344b = c700Var;
        this.f272345c = xfu0Var;
        this.f272346d = bm4Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m93568a(String str, String str2) {
        Dialog dialogMo63161j1;
        boolean zM29793a = this.f272346d.m29793a();
        Handler handler = this.f272347e;
        if (zM29793a) {
            List<i500> listM89877x = this.f272344b.f34668c.m89877x();
            if (!listM89877x.isEmpty()) {
                for (i500 i500Var : listM89877x) {
                    if (!(i500Var instanceof ugr) || (dialogMo63161j1 = ((ugr) i500Var).mo63161j1()) == null || !dialogMo63161j1.isShowing()) {
                    }
                }
            }
            Set set = dd41.f47702f;
            String strM35694A = r46.m74717J().m35694A();
            if (strM35694A != null) {
                handler.post(new qk8(this, strM35694A, str, str2, 13));
                return;
            }
            return;
        }
        handler.post(new qk8((wfu0) this.f272345c.mo25006a(), this, str, str2, 14));
    }
}
