package p204p;

import androidx.car.app.model.Alert;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class cm20 implements z45 {

    /* JADX INFO: renamed from: a */
    public final qe70 f39575a;

    /* JADX INFO: renamed from: b */
    public int f39576b = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: c */
    public final ArrayList f39577c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f39578d = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public cm20(gh00 gh00Var) {
        this.f39575a = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, p.eh00] */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, p.eh00] */
    @Override // p204p.z45
    /* JADX INFO: renamed from: a */
    public final void mo33357a(AppBarLayout appBarLayout, int i) {
        if (i == this.f39576b) {
            return;
        }
        this.f39576b = i;
        this.f39575a.invoke(Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f39577c;
        for (Object obj : arrayList2) {
            if (((Boolean) ((qe70) ((yl20) obj).f273883b.f57320b).invoke(Integer.valueOf(appBarLayout.getTotalScrollRange()), Integer.valueOf(i))).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yl20) it.next()).f273882a.invoke();
        }
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f39578d) {
            if (((Boolean) ((qe70) ((yl20) obj2).f273883b.f57320b).invoke(Integer.valueOf(appBarLayout.getTotalScrollRange()), Integer.valueOf(i))).booleanValue()) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((yl20) it2.next()).f273882a.invoke();
        }
    }
}
