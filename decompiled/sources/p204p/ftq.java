package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ftq implements ctq {

    /* JADX INFO: renamed from: d */
    public final lud1 f73268d;

    /* JADX INFO: renamed from: f */
    public int f73270f;

    /* JADX INFO: renamed from: g */
    public int f73271g;

    /* JADX INFO: renamed from: a */
    public lud1 f73265a = null;

    /* JADX INFO: renamed from: b */
    public boolean f73266b = false;

    /* JADX INFO: renamed from: c */
    public boolean f73267c = false;

    /* JADX INFO: renamed from: e */
    public int f73269e = 1;

    /* JADX INFO: renamed from: h */
    public int f73272h = 1;

    /* JADX INFO: renamed from: i */
    public ujr f73273i = null;

    /* JADX INFO: renamed from: j */
    public boolean f73274j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f73275k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f73276l = new ArrayList();

    public ftq(lud1 lud1Var) {
        this.f73268d = lud1Var;
    }

    @Override // p204p.ctq
    /* JADX INFO: renamed from: a */
    public final void mo29208a(ctq ctqVar) {
        ArrayList<ftq> arrayList = this.f73276l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((ftq) it.next()).f73274j) {
                return;
            }
        }
        this.f73267c = true;
        lud1 lud1Var = this.f73265a;
        if (lud1Var != null) {
            lud1Var.mo29208a(this);
        }
        if (this.f73266b) {
            this.f73268d.mo29208a(this);
            return;
        }
        ftq ftqVar = null;
        int i = 0;
        for (ftq ftqVar2 : arrayList) {
            if (!(ftqVar2 instanceof ujr)) {
                i++;
                ftqVar = ftqVar2;
            }
        }
        if (ftqVar != null && i == 1 && ftqVar.f73274j) {
            ujr ujrVar = this.f73273i;
            if (ujrVar != null) {
                if (!ujrVar.f73274j) {
                    return;
                } else {
                    this.f73270f = this.f73272h * ujrVar.f73271g;
                }
            }
            mo42686d(ftqVar.f73271g + this.f73270f);
        }
        lud1 lud1Var2 = this.f73265a;
        if (lud1Var2 != null) {
            lud1Var2.mo29208a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m42684b(lud1 lud1Var) {
        this.f73275k.add(lud1Var);
        if (this.f73274j) {
            lud1Var.mo29208a(lud1Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m42685c() {
        this.f73276l.clear();
        this.f73275k.clear();
        this.f73274j = false;
        this.f73271g = 0;
        this.f73267c = false;
        this.f73266b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo42686d(int i) {
        if (this.f73274j) {
            return;
        }
        this.f73274j = true;
        this.f73271g = i;
        for (ctq ctqVar : this.f73275k) {
            ctqVar.mo29208a(ctqVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f73268d.f137062b.f238247k0);
        sb.append(":");
        sb.append(nap.m64006A(this.f73269e));
        sb.append("(");
        sb.append(this.f73274j ? Integer.valueOf(this.f73271g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f73276l.size());
        sb.append(":d=");
        sb.append(this.f73275k.size());
        sb.append(">");
        return sb.toString();
    }
}
