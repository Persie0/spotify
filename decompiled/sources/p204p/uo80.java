package p204p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeConcatIterable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uo80 implements gv51 {

    /* JADX INFO: renamed from: a */
    public List f232357a;

    static {
        new gg5(15);
    }

    public /* synthetic */ uo80(List list, boolean z) {
        this.f232357a = list;
    }

    /* JADX INFO: renamed from: a */
    public void m83594a(Iterable iterable) {
        if (this.f232357a instanceof pf40) {
            this.f232357a = new ArrayList(this.f232357a);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f232357a.add(it.next());
        }
    }

    @Override // p204p.gv51
    /* JADX INFO: renamed from: b */
    public int mo24457b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p204p.gv51
    /* JADX INFO: renamed from: c */
    public List mo24458c(long j) {
        return j >= 0 ? this.f232357a : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: d */
    public boolean m83595d(i1e1 i1e1Var) {
        List list = this.f232357a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((e6j) obj).mo37941a(i1e1Var)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            gaz gazVarM44190b = gaz.m44190b();
            int i = xzd1.f267591a;
            g6f.m43753y0(arrayList, null, null, null, ngd1.f153658O0, 31);
            gazVarM44190b.getClass();
        }
        return arrayList.isEmpty();
    }

    @Override // p204p.gv51
    /* JADX INFO: renamed from: e */
    public long mo24459e(int i) {
        c95.m31843i(i == 0);
        return 0L;
    }

    @Override // p204p.gv51
    /* JADX INFO: renamed from: f */
    public int mo24460f() {
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public xsj0 m83596g(String str) {
        Object next;
        Iterator it = this.f232357a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((xsj0) next).mo34575a(str)) {
                return (xsj0) next;
            }
        }
        next = null;
        return (xsj0) next;
    }

    /* JADX INFO: renamed from: h */
    public ArrayList m83597h() {
        List list = this.f232357a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            qw80 iw80Var = null;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            pvf pvfVar = (pvf) obj;
            g4a g4aVarM71143a = pvfVar.m71143a();
            if (g4aVarM71143a instanceof e4a) {
                e4a e4aVar = (e4a) g4aVarM71143a;
                iw80Var = new jw80(i, new lw80(pvfVar.m71144b(), e4aVar.m37766b(), e4aVar.m37765a()));
            } else if (g4aVarM71143a instanceof f4a) {
                f4a f4aVar = (f4a) g4aVarM71143a;
                iw80Var = new kw80(i, new lw80(pvfVar.m71144b(), f4aVar.m40723b(), f4aVar.m40722a()));
            } else if (g4aVarM71143a instanceof c4a) {
                iw80Var = new iw80(i, (c4a) g4aVarM71143a, pvfVar.m71144b());
            }
            if (iw80Var != null) {
                arrayList.add(iw80Var);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public void m83598i(Iterable iterable) {
        if (iterable instanceof pf40) {
            this.f232357a = zn91.m96559k(iterable);
            return;
        }
        if (!gg5.m44653j(iterable)) {
            this.f232357a = pmf0.m70335u(iterable);
            return;
        }
        List list = this.f232357a;
        if (!(list instanceof pf40)) {
            list.clear();
        } else {
            kf40 kf40Var = pf40.f176960b;
            this.f232357a = wsv0.f254763e;
        }
    }

    /* JADX INFO: renamed from: j */
    public Single m83599j(String str, voc1 voc1Var) {
        List list = this.f232357a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((x4m) it.next()).mo36261a(str));
        }
        return new MaybeConcatIterable(arrayList).m23327A().doOnError(new jz0(25, str, voc1Var)).map(new ujh(15, str, voc1Var));
    }

    /* JADX INFO: renamed from: k */
    public fiz m83600k(i1e1 i1e1Var) {
        List list = this.f232357a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((e6j) obj).mo37942b(i1e1Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((e6j) it.next()).mo37943c(i1e1Var.f97508j));
        }
        return mvl0.m62953p(new jxp0((fiz[]) g6f.m43728j1(arrayList2).toArray(new fiz[0]), 12));
    }

    public uo80(List list) {
        this.f232357a = new ArrayList(list);
    }

    public uo80(ft81 ft81Var) {
        uhj0 uhj0Var;
        r59 r59Var = new r59(ft81Var.f73137b, 0);
        v59 v59Var = new v59(ft81Var.f73138c);
        r59 r59Var2 = new r59(ft81Var.f73140e, 3);
        dij0 dij0Var = ft81Var.f73139d;
        r59 r59Var3 = new r59(dij0Var, 1);
        r59 r59Var4 = new r59(dij0Var, 2);
        ohj0 ohj0Var = new ohj0(dij0Var);
        nhj0 nhj0Var = new nhj0(dij0Var);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = ft81Var.f73136a;
            int i = xzd1.f267591a;
            uhj0Var = new uhj0((ConnectivityManager) context.getSystemService("connectivity"));
        } else {
            uhj0Var = null;
        }
        this.f232357a = bk5.m29582E0(new e6j[]{r59Var, v59Var, r59Var2, r59Var3, r59Var4, ohj0Var, nhj0Var, uhj0Var});
    }
}
