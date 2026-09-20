package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class zkq {

    /* JADX INFO: renamed from: a */
    public int f283803a;

    /* JADX INFO: renamed from: b */
    public long f283804b;

    public /* synthetic */ zkq(long j, boolean z, int i) {
        this.f283803a = i;
        this.f283804b = j;
    }

    /* JADX INFO: renamed from: b */
    public static Set m96330b(int i) {
        return bk5.m29624m1(new kq91[]{eq91.f61817b, new dq91(i)});
    }

    /* JADX INFO: renamed from: f */
    public static zkq m96331f(d5y d5yVar, l2n0 l2n0Var) {
        d5yVar.mo35039i(0, l2n0Var.f129054a, 8);
        l2n0Var.m57930R(0);
        int iM57945q = l2n0Var.m57945q();
        return new zkq(l2n0Var.m57950v(), false, iM57945q);
    }

    /* JADX INFO: renamed from: a */
    public x401 m96332a() {
        x401 x401Var = new x401();
        x401Var.add(eq91.f61817b);
        int i = this.f283803a;
        if (i != -1) {
            x401Var.add(new dq91(i));
        }
        if (this.f283804b != 0) {
            x401Var.add(new cq91(System.currentTimeMillis() - this.f283804b));
        }
        return n0e1.m63425d(x401Var);
    }

    /* JADX INFO: renamed from: c */
    public void m96333c() {
        this.f283804b = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: d */
    public void m96334d() {
        this.f283804b = 0L;
    }

    /* JADX INFO: renamed from: e */
    public boolean m96335e() {
        int i = this.f283803a;
        return i == 0 || i == 1;
    }

    /* JADX INFO: renamed from: g */
    public void m96336g(int i) {
        this.f283803a = i;
    }

    public zkq() {
        this.f283803a = -1;
    }

    public zkq(int i, long j) {
        c95.m31843i(j >= 0);
        this.f283803a = i;
        this.f283804b = j;
    }
}
