package p204p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c6j {

    /* JADX INFO: renamed from: b */
    public int f34547b;

    /* JADX INFO: renamed from: c */
    public boolean f34548c;

    /* JADX INFO: renamed from: d */
    public final v7j f34549d;

    /* JADX INFO: renamed from: e */
    public final int f34550e;

    /* JADX INFO: renamed from: f */
    public c6j f34551f;

    /* JADX INFO: renamed from: i */
    public rk31 f34554i;

    /* JADX INFO: renamed from: a */
    public HashSet f34546a = null;

    /* JADX INFO: renamed from: g */
    public int f34552g = 0;

    /* JADX INFO: renamed from: h */
    public int f34553h = Integer.MIN_VALUE;

    public c6j(v7j v7jVar, int i) {
        this.f34549d = v7jVar;
        this.f34550e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m31567a(c6j c6jVar, int i) {
        m31568b(c6jVar, i, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31568b(c6j c6jVar, int i, int i2, boolean z) {
        if (c6jVar == null) {
            m31576j();
            return true;
        }
        if (!z && !m31575i(c6jVar)) {
            return false;
        }
        this.f34551f = c6jVar;
        if (c6jVar.f34546a == null) {
            c6jVar.f34546a = new HashSet();
        }
        HashSet hashSet = this.f34551f.f34546a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f34552g = i;
        this.f34553h = i2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m31569c(int i, ArrayList arrayList, ktd1 ktd1Var) {
        HashSet hashSet = this.f34546a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                gwg1.m45950v(((c6j) it.next()).f34549d, i, arrayList, ktd1Var);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m31570d() {
        if (this.f34548c) {
            return this.f34547b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m31571e() {
        c6j c6jVar;
        if (this.f34549d.f238243i0 == 8) {
            return 0;
        }
        int i = this.f34553h;
        return (i == Integer.MIN_VALUE || (c6jVar = this.f34551f) == null || c6jVar.f34549d.f238243i0 != 8) ? this.f34552g : i;
    }

    /* JADX INFO: renamed from: f */
    public final c6j m31572f() {
        int i = this.f34550e;
        int iM38547C = edb.m38547C(i);
        v7j v7jVar = this.f34549d;
        switch (iM38547C) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return v7jVar.f238211L;
            case 2:
                return v7jVar.f238212M;
            case 3:
                return v7jVar.f238209J;
            case 4:
                return v7jVar.f238210K;
            default:
                throw new AssertionError(klh.m56853y(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m31573g() {
        HashSet hashSet = this.f34546a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c6j) it.next()).m31572f().m31574h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m31574h() {
        return this.f34551f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    /* JADX INFO: renamed from: i */
    public final boolean m31575i(c6j c6jVar) {
        if (c6jVar != null) {
            v7j v7jVar = c6jVar.f34549d;
            int i = c6jVar.f34550e;
            int i2 = this.f34550e;
            if (i != i2) {
                switch (edb.m38547C(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(v7jVar instanceof ka20)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(v7jVar instanceof ka20)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(klh.m56853y(i2));
                }
            } else if (i2 != 6 || (v7jVar.f238205F && this.f34549d.f238205F)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m31576j() {
        HashSet hashSet;
        c6j c6jVar = this.f34551f;
        if (c6jVar != null && (hashSet = c6jVar.f34546a) != null) {
            hashSet.remove(this);
            if (this.f34551f.f34546a.size() == 0) {
                this.f34551f.f34546a = null;
            }
        }
        this.f34546a = null;
        this.f34551f = null;
        this.f34552g = 0;
        this.f34553h = Integer.MIN_VALUE;
        this.f34548c = false;
        this.f34547b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m31577k() {
        rk31 rk31Var = this.f34554i;
        if (rk31Var == null) {
            this.f34554i = new rk31(1);
        } else {
            rk31Var.m75717c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m31578l(int i) {
        this.f34547b = i;
        this.f34548c = true;
    }

    public final String toString() {
        return this.f34549d.f238247k0 + ":" + klh.m56853y(this.f34550e);
    }
}
