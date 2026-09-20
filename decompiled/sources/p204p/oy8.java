package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oy8 implements uio {

    /* JADX INFO: renamed from: a */
    public final boolean f171686a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f171687b = new ArrayList(1);

    /* JADX INFO: renamed from: c */
    public int f171688c;

    /* JADX INFO: renamed from: d */
    public sjo f171689d;

    public oy8(boolean z) {
        this.f171686a = z;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: a */
    public final void mo29278a(x491 x491Var) {
        x491Var.getClass();
        ArrayList arrayList = this.f171687b;
        if (arrayList.contains(x491Var)) {
            return;
        }
        arrayList.add(x491Var);
        this.f171688c++;
    }

    /* JADX INFO: renamed from: d */
    public final void m68410d(int i) {
        sjo sjoVar = this.f171689d;
        String str = h0b1.f86200a;
        for (int i2 = 0; i2 < this.f171688c; i2++) {
            ((x491) this.f171687b.get(i2)).mo56382q(sjoVar, this.f171686a, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m68411f() {
        sjo sjoVar = this.f171689d;
        String str = h0b1.f86200a;
        for (int i = 0; i < this.f171688c; i++) {
            ((x491) this.f171687b.get(i)).mo56381n(sjoVar, this.f171686a);
        }
        this.f171689d = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m68412j(sjo sjoVar) {
        for (int i = 0; i < this.f171688c; i++) {
            ((x491) this.f171687b.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m68413l(sjo sjoVar) {
        this.f171689d = sjoVar;
        for (int i = 0; i < this.f171688c; i++) {
            ((x491) this.f171687b.get(i)).mo56380h(sjoVar, this.f171686a);
        }
    }
}
