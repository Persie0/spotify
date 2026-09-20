package p204p;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bdv extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final wg61 f26220d;

    /* JADX INFO: renamed from: e */
    public final wov f26221e;

    /* JADX INFO: renamed from: f */
    public final vov f26222f;

    /* JADX INFO: renamed from: g */
    public final cmj f26223g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f26224h;

    public bdv(wov wovVar, pir pirVar, vov vovVar, Scheduler scheduler, Scheduler scheduler2, cmj cmjVar) {
        this.f26220d = new wg61(new x60(this, scheduler, scheduler2, pirVar, 26));
        this.f26221e = wovVar;
        this.f26222f = vovVar;
        this.f26223g = cmjVar;
        m47721x(2);
    }

    /* JADX INFO: renamed from: A */
    public final List m28854A() {
        cke0 cke0Var = ((zx0) this.f26220d.getValue()).f287138f;
        return cke0Var == null ? lau.f131415a : cke0Var;
    }

    /* JADX INFO: renamed from: B */
    public final Object m28855B(int i) {
        List list = ((zx0) this.f26220d.getValue()).f287138f;
        if (list == null) {
            list = lau.f131415a;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: C */
    public final Set m28856C(int i) {
        if (i < 0 || i >= mo1617e()) {
            return gbu.f78413a;
        }
        return this.f26221e.m88666a((mhv) m28855B(i)).m97216a();
    }

    /* JADX INFO: renamed from: D */
    public final b450 m28857D(b450 b450Var) {
        Integer num;
        Integer numValueOf;
        int i = b450Var.f278778a;
        int i2 = b450Var.f278779b;
        Integer num2 = null;
        if (i <= i2) {
            Integer num3 = null;
            num = null;
            while (true) {
                mhv mhvVar = (mhv) g6f.m43747t0(i, m28854A());
                if (mhvVar instanceof dhv) {
                    numValueOf = Integer.valueOf(((dhv) mhvVar).m36058c());
                } else {
                    numValueOf = mhvVar instanceof jhv ? Integer.valueOf(((jhv) mhvVar).m53431c()) : null;
                }
                if (numValueOf != null) {
                    if (num3 == null || num3.intValue() > numValueOf.intValue()) {
                        num3 = numValueOf;
                    }
                    if (num == null || num.intValue() < numValueOf.intValue()) {
                        num = numValueOf;
                    }
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
            num2 = num3;
        } else {
            num = null;
        }
        if (num2 != null && num != null) {
            return new b450(num2.intValue(), num.intValue(), 1);
        }
        b450 b450Var2 = b450.f23226d;
        return j0g1.m52070G();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        List list = ((zx0) this.f26220d.getValue()).f287138f;
        if (list == null) {
            list = lau.f131415a;
        }
        return list.size();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        return this.f26221e.m88666a((mhv) m28855B(i)).ordinal();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: m */
    public final void mo28858m(RecyclerView recyclerView) {
        this.f26224h = recyclerView;
        this.f26223g.mo33382a(recyclerView);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        ((q19) dkv0Var).mo27517D((mhv) m28855B(i));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        zxv.f287407c.getClass();
        return this.f26222f.m86103a(viewGroup, ti5.m80904L(i));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: q */
    public final void mo28696q(RecyclerView recyclerView) {
        if (wj50.m88271j(this.f26224h, recyclerView)) {
            this.f26224h = null;
            this.f26223g.mo33382a(null);
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: u */
    public final void mo28697u(dkv0 dkv0Var) {
        ((q19) dkv0Var).mo27518E();
    }
}
