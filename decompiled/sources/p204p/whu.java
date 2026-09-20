package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class whu {

    /* JADX INFO: renamed from: a */
    public final ArrayList f251444a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m88173a(Object obj, fyf fyfVar) {
        this.f251444a.add(new s5e(obj, fyfVar));
    }

    /* JADX INFO: renamed from: b */
    public final void m88174b(int i, fyf fyfVar, gh00 gh00Var) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f251444a.add(new s5e(gh00Var.invoke(Integer.valueOf(i2)), new fyf(new ecd(false, i2, fyfVar, 1), true, -1863941724)));
        }
    }
}
