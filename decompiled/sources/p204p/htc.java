package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class htc implements qpc {

    /* JADX INFO: renamed from: a */
    public final ArrayList f94980a;

    public htc(ArrayList arrayList) {
        this.f94980a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m48575a(mko mkoVar, gh00 gh00Var) {
        this.f94980a.add(new nko(gh00Var, mkoVar));
    }

    @Override // p204p.qpc
    /* JADX INFO: renamed from: b */
    public Object mo42541b(ibk ibkVar) {
        return this.f94980a;
    }

    /* JADX INFO: renamed from: c */
    public mko m48576c() {
        ArrayList arrayList = this.f94980a;
        if (arrayList.isEmpty()) {
            return ns5.f157671i;
        }
        return arrayList.size() == 1 ? (mko) g6f.m43741q0(arrayList) : new bbf(arrayList);
    }

    public htc() {
        this.f94980a = new ArrayList();
    }
}
