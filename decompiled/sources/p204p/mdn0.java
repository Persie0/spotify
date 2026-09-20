package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class mdn0 implements e9w0 {

    /* JADX INFO: renamed from: a */
    public final Set f142457a;

    /* JADX INFO: renamed from: b */
    public final qqi0 f142458b = new qqi0(0, new f9w0[16]);

    public mdn0(Set set) {
        this.f142457a = set;
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: b */
    public final void mo32122b() {
        qqi0 qqi0Var = this.f142458b;
        Object[] objArr = qqi0Var.f191608a;
        int i = qqi0Var.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            e9w0 e9w0VarMo30283a = ((f9w0) objArr[i2]).mo30283a();
            this.f142457a.remove(e9w0VarMo30283a);
            e9w0VarMo30283a.mo32122b();
        }
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: d */
    public final void mo32124d() {
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: g */
    public final void mo32127g() {
    }
}
