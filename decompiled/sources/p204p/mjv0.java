package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class mjv0 {

    /* JADX INFO: renamed from: a */
    public phn0 f144345a;

    /* JADX INFO: renamed from: b */
    public ArrayList f144346b;

    /* JADX INFO: renamed from: c */
    public long f144347c;

    /* JADX INFO: renamed from: d */
    public long f144348d;

    /* JADX INFO: renamed from: e */
    public long f144349e;

    /* JADX INFO: renamed from: f */
    public long f144350f;

    /* JADX INFO: renamed from: b */
    public static void m61990b(dkv0 dkv0Var) {
        int i = dkv0Var.f50048t;
        if (!dkv0Var.m36328r() && (i & 4) == 0) {
            dkv0Var.m36322l();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo61991a(dkv0 dkv0Var, dkv0 dkv0Var2, qr8 qr8Var, qr8 qr8Var2);

    /* JADX INFO: renamed from: c */
    public boolean mo33394c(dkv0 dkv0Var, List list) {
        return !((sc21) this).f207636g || dkv0Var.m36328r();
    }

    /* JADX INFO: renamed from: d */
    public final void m61992d(dkv0 dkv0Var) {
        phn0 phn0Var = this.f144345a;
        if (phn0Var != null) {
            phn0Var.m70040d(dkv0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m61993e() {
        ArrayList arrayList = this.f144346b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            ikc0.m50942n(arrayList.get(0));
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo33395f(dkv0 dkv0Var);

    /* JADX INFO: renamed from: g */
    public abstract void mo33396g();

    /* JADX INFO: renamed from: h */
    public long mo61994h() {
        return this.f144348d;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo33397i();

    /* JADX INFO: renamed from: j */
    public abstract void mo33398j();
}
