package p204p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class ley0 {

    /* JADX INFO: renamed from: a */
    public final List f132766a;

    /* JADX INFO: renamed from: b */
    public int f132767b;

    /* JADX INFO: renamed from: c */
    public kb51 f132768c = new kb51(2);

    /* JADX INFO: renamed from: d */
    public final kyf1 f132769d;

    public ley0(List list) {
        kyf1 mb51Var;
        this.f132766a = list;
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            zdy0 zdy0VarMo26476b = ((f29) it.next()).mo26476b();
            if (zdy0VarMo26476b instanceof xdy0) {
                j += ((xdy0) zdy0VarMo26476b).f260570a;
            } else if (wj50.m88271j(zdy0VarMo26476b, ydy0.f271879a)) {
                mb51Var = nb51.f152192h;
                this.f132769d = mb51Var;
            } else if (!(zdy0VarMo26476b instanceof wdy0)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        mb51Var = new mb51(j, TimeUnit.MILLISECONDS);
        this.f132769d = mb51Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m58824a() {
        Iterator it = this.f132766a.iterator();
        while (it.hasNext()) {
            ((f29) it.next()).mo30883a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final kyf1 m58825b() {
        return this.f132769d;
    }

    /* JADX INFO: renamed from: c */
    public final void m58826c(ConstraintLayout constraintLayout, ibp ibpVar, bc21 bc21Var) {
        this.f132767b = 0;
        for (f29 f29Var : this.f132766a) {
            f29Var.f65134b = ibpVar;
            f29Var.f65135c = bc21Var;
            qr8 qr8Var = f29Var.f65133a;
            if (constraintLayout.findViewById(qr8Var.f191760b) == null) {
                LayoutInflater.from(constraintLayout.getContext()).inflate(qr8Var.f191759a, (ViewGroup) constraintLayout, true);
            }
            f29Var.mo26477d(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58827d(kb51 kb51Var) {
        this.f132768c = kb51Var;
        ((f29) this.f132766a.get(this.f132767b)).mo30884c(kb51Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m58828e() {
        ((f29) this.f132766a.get(this.f132767b)).mo26478e();
    }

    /* JADX INFO: renamed from: f */
    public final void m58829f() {
        ((f29) this.f132766a.get(this.f132767b)).mo26479g();
    }

    /* JADX INFO: renamed from: g */
    public final void m58830g() {
        this.f132767b = 0;
        List list = this.f132766a;
        ((f29) list.get(0)).mo30885f(new key0(this));
        ((f29) list.get(this.f132767b)).mo30884c(this.f132768c);
    }
}
