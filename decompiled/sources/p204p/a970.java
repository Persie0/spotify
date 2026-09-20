package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class a970 {

    /* JADX INFO: renamed from: a */
    public int f13498a;

    /* JADX INFO: renamed from: b */
    public vtg1 f13499b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f13500c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    public a970 f13501d;

    /* JADX INFO: renamed from: e */
    public a970 f13502e;

    /* JADX INFO: renamed from: f */
    public s870 f13503f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f13504g;

    public a970(int i) {
        this.f13498a = i;
        y6f0.f269773a.getClass();
        List listM90086a = x6f0.m90086a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM90086a, 10));
        Iterator it = listM90086a.iterator();
        while (it.hasNext()) {
            ((ho60) ((y6f0) it.next())).getClass();
            arrayList.add(new mp60());
        }
        this.f13504g = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final vtg1 m25079a() {
        vtg1 vtg1Var = this.f13499b;
        if (vtg1Var != null) {
            return vtg1Var;
        }
        wj50.m88260d0("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a970.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a970 a970Var = (a970) obj;
        return this.f13498a == a970Var.f13498a && m25079a().equals(a970Var.m25079a()) && wj50.m88271j(this.f13500c, a970Var.f13500c) && wj50.m88271j(this.f13502e, a970Var.f13502e) && wj50.m88271j(this.f13501d, a970Var.f13501d) && wj50.m88271j(this.f13503f, a970Var.f13503f) && wj50.m88271j(this.f13504g, a970Var.f13504g);
    }

    public final int hashCode() {
        return this.f13500c.hashCode() + ((m25079a().hashCode() + (this.f13498a * 31)) * 31);
    }
}
