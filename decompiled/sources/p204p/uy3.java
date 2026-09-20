package p204p;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class uy3 implements qoe {

    /* JADX INFO: renamed from: a */
    public final vy3 f235125a;

    public uy3(vy3 vy3Var) {
        this.f235125a = vy3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m84188a(gne gneVar) {
        vy3 vy3Var = this.f235125a;
        if (gneVar != null) {
            vy3Var.m86703a().setPrimaryClip(gneVar.m45301a());
        } else if (Build.VERSION.SDK_INT >= 28) {
            r35.m74596d(vy3Var.m86703a());
        } else {
            vy3Var.m86703a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
