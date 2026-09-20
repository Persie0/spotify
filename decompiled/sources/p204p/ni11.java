package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class ni11 extends pi11 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f154157a;

    /* JADX INFO: renamed from: b */
    public final String f154158b;

    /* JADX INFO: renamed from: c */
    public final un20 f154159c;

    public ni11(String str, ArrayList arrayList, un20 un20Var) {
        this.f154157a = arrayList;
        this.f154158b = str;
        this.f154159c = un20Var;
    }

    @Override // p204p.pi11
    /* JADX INFO: renamed from: a */
    public final un20 mo64550a() {
        return this.f154159c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni11)) {
            return false;
        }
        ni11 ni11Var = (ni11) obj;
        return this.f154157a.equals(ni11Var.f154157a) && this.f154158b.equals(ni11Var.f154158b) && wj50.m88271j(this.f154159c, ni11Var.f154159c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f154157a.hashCode() * 31, 31, this.f154158b);
        un20 un20Var = this.f154159c;
        return iM77243b + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
