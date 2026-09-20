package p204p;

import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class adz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f14703a;

    public adz0(boolean z) {
        this.f14703a = z;
    }

    /* JADX INFO: renamed from: a */
    public final hdz0 m25634a(ldz0 ldz0Var, Size size) {
        Object next;
        ArrayList arrayList = ldz0Var.f132381c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (bdz0.f26237a.contains(((hdz0) obj).f90258c)) {
                arrayList2.add(obj);
            }
        }
        int i = 0;
        List listM43711Y0 = g6f.m43711Y0(arrayList2, jlg1.m53700j(ycz0.f271600h, zcz0.f281593h));
        if (!this.f14703a) {
            Iterator it = listM43711Y0.iterator();
            while (it.hasNext()) {
                next = it.next();
                hdz0 hdz0Var = (hdz0) next;
                if (hdz0Var.f90260e >= size.getWidth() && hdz0Var.f90259d >= size.getHeight()) {
                    return (hdz0) next;
                }
            }
            next = null;
            return (hdz0) next;
        }
        Iterator it2 = listM43711Y0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            hdz0 hdz0Var2 = (hdz0) it2.next();
            if (hdz0Var2.f90260e >= size.getWidth() && hdz0Var2.f90259d >= size.getHeight()) {
                break;
            }
            i++;
        }
        return (hdz0) (i > 0 ? listM43711Y0.get(i - 1) : g6f.m43747t0(i, listM43711Y0));
    }
}
