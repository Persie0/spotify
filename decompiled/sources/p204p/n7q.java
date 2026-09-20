package p204p;

import android.os.SystemClock;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes9.dex */
public final class n7q implements zl21 {

    /* JADX INFO: renamed from: a */
    public final ib00 f151198a;

    /* JADX INFO: renamed from: b */
    public final xre f151199b;

    /* JADX INFO: renamed from: c */
    public final LinkedList f151200c = new LinkedList();

    public n7q(ib00 ib00Var, xre xreVar) {
        this.f151198a = ib00Var;
        this.f151199b = xreVar;
    }

    @Override // p204p.zl21
    /* JADX INFO: renamed from: a */
    public final int mo63805a() {
        hv31 hv31Var = this.f151198a.f100407a;
        ((wy3) this.f151199b).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        LinkedList linkedList = this.f151200c;
        linkedList.add(lValueOf);
        if (linkedList.size() > 3) {
            linkedList.remove();
        }
        fv31 fv31Var = ib00.f100406b;
        if (!hv31Var.mo48713h(fv31Var, false)) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60048a(fv31Var, true);
            lv31VarEdit.m60054g();
            return 2;
        }
        if (linkedList.size() != 3 || jElapsedRealtime - ((Number) linkedList.peek()).longValue() >= 10000) {
            return 1;
        }
        linkedList.clear();
        return 3;
    }
}
