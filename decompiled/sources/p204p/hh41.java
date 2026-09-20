package p204p;

import android.os.Parcelable;
import java.util.ListIterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class hh41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ih41 f91288a;

    public hh41(ih41 ih41Var) {
        this.f91288a = ih41Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m47498d(hh41 hh41Var, Object obj) {
        hh41Var.m47501c(obj, vb91.f239444a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47499a(sxj sxjVar) {
        ih41 ih41Var = this.f91288a;
        if (!ih41Var.m50579a()) {
            return false;
        }
        ih41Var.f102169c = sxjVar;
        j6f.m52571c0(ih41Var.f102167a);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47500b(Parcelable parcelable, sxj sxjVar) {
        ih41 ih41Var = this.f91288a;
        gb31 gb31Var = ih41Var.f102167a;
        ListIterator listIterator = gb31Var.listIterator();
        int i = 0;
        while (true) {
            e030 e030Var = (e030) listIterator;
            if (!e030Var.hasNext()) {
                i = -1;
                break;
            }
            if (wj50.m88271j(((fh41) e030Var.next()).f69575b, parcelable)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        ih41Var.f102169c = sxjVar;
        gb31Var.m44201l(i + 1, gb31Var.size());
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m47501c(Object obj, sxj sxjVar) {
        ih41 ih41Var = this.f91288a;
        ih41Var.f102169c = sxjVar;
        ih41Var.f102167a.add(new fh41(UUID.randomUUID(), obj));
    }
}
