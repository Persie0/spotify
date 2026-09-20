package p204p;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k800 {

    /* JADX INFO: renamed from: a */
    public static final p800 f120225a = new p800();

    /* JADX INFO: renamed from: b */
    public static final r800 f120226b;

    static {
        r800 r800Var = null;
        try {
            r800Var = (r800) w800.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f120226b = r800Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m55716a(uj5 uj5Var, uj5 uj5Var2) {
        int i = uj5Var.f13976c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (!uj5Var2.containsKey((String) uj5Var.m25315i(i))) {
                uj5Var.m25313g(i);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m55717b(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
