package p204p;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jx31 {

    /* JADX INFO: renamed from: a */
    public int f116780a;

    /* JADX INFO: renamed from: b */
    public int f116781b;

    /* JADX INFO: renamed from: c */
    public final i500 f116782c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f116783d;

    /* JADX INFO: renamed from: e */
    public boolean f116784e;

    /* JADX INFO: renamed from: f */
    public boolean f116785f;

    /* JADX INFO: renamed from: g */
    public boolean f116786g;

    /* JADX INFO: renamed from: h */
    public boolean f116787h;

    /* JADX INFO: renamed from: i */
    public boolean f116788i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f116789j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f116790k;

    /* JADX INFO: renamed from: l */
    public final f800 f116791l;

    public jx31(int i, int i2, f800 f800Var) {
        i500 i500Var = f800Var.f66819c;
        this.f116780a = i;
        this.f116781b = i2;
        this.f116782c = i500Var;
        this.f116783d = new ArrayList();
        this.f116788i = true;
        ArrayList arrayList = new ArrayList();
        this.f116789j = arrayList;
        this.f116790k = arrayList;
        this.f116791l = f800Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m54492a(ViewGroup viewGroup) {
        this.f116787h = false;
        if (this.f116784e) {
            return;
        }
        this.f116784e = true;
        if (this.f116789j.isEmpty()) {
            m54493b();
            return;
        }
        Iterator it = g6f.m43728j1(this.f116790k).iterator();
        while (it.hasNext()) {
            ((ix31) it.next()).m51852a(viewGroup);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m54493b() {
        this.f116787h = false;
        if (!this.f116785f) {
            if (c700.m31595O(2)) {
                toString();
            }
            this.f116785f = true;
            Iterator it = this.f116783d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f116782c.f98689Z = false;
        this.f116791l.m41004k();
    }

    /* JADX INFO: renamed from: c */
    public final void m54494c(ix31 ix31Var) {
        ArrayList arrayList = this.f116789j;
        if (arrayList.remove(ix31Var) && arrayList.isEmpty()) {
            m54493b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m54495d(int i, int i2) {
        int iM38547C = edb.m38547C(i2);
        i500 i500Var = this.f116782c;
        if (iM38547C == 0) {
            if (this.f116780a != 1) {
                if (c700.m31595O(2)) {
                    Objects.toString(i500Var);
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        throw null;
                    }
                }
                this.f116780a = i;
                return;
            }
            return;
        }
        if (iM38547C != 1) {
            if (iM38547C != 2) {
                return;
            }
            if (c700.m31595O(2)) {
                Objects.toString(i500Var);
            }
            this.f116780a = 1;
            this.f116781b = 3;
            this.f116788i = true;
            return;
        }
        if (this.f116780a == 1) {
            if (c700.m31595O(2)) {
                Objects.toString(i500Var);
            }
            this.f116780a = 2;
            this.f116781b = 2;
            this.f116788i = true;
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sbM38572u = edb.m38572u("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i = this.f116780a;
        if (i == 1) {
            str = "REMOVED";
        } else if (i == 2) {
            str = "VISIBLE";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVISIBLE";
        } else {
            str = "GONE";
        }
        sbM38572u.append(str);
        sbM38572u.append(" lifecycleImpact = ");
        int i2 = this.f116781b;
        if (i2 == 1) {
            str2 = "NONE";
        } else if (i2 != 2) {
            str2 = i2 != 3 ? "null" : "REMOVING";
        } else {
            str2 = "ADDING";
        }
        sbM38572u.append(str2);
        sbM38572u.append(" fragment = ");
        sbM38572u.append(this.f116782c);
        sbM38572u.append('}');
        return sbM38572u.toString();
    }
}
