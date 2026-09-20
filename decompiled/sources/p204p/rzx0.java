package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rzx0 implements Iterator, tzx0 {

    /* JADX INFO: renamed from: a */
    public qzx0 f204249a;

    /* JADX INFO: renamed from: b */
    public boolean f204250b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uzx0 f204251c;

    public rzx0(uzx0 uzx0Var) {
        this.f204251c = uzx0Var;
    }

    @Override // p204p.tzx0
    /* JADX INFO: renamed from: a */
    public final void mo76837a(qzx0 qzx0Var) {
        qzx0 qzx0Var2 = this.f204249a;
        if (qzx0Var == qzx0Var2) {
            qzx0 qzx0Var3 = qzx0Var2.f194331d;
            this.f204249a = qzx0Var3;
            this.f204250b = qzx0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f204250b) {
            return this.f204251c.f235652a != null;
        }
        qzx0 qzx0Var = this.f204249a;
        return (qzx0Var == null || qzx0Var.f194330c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f204250b) {
            this.f204250b = false;
            this.f204249a = this.f204251c.f235652a;
        } else {
            qzx0 qzx0Var = this.f204249a;
            this.f204249a = qzx0Var != null ? qzx0Var.f194330c : null;
        }
        return this.f204249a;
    }
}
