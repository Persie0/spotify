package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f12197a;

    /* JADX INFO: renamed from: b */
    public final List f12198b;

    /* JADX INFO: renamed from: c */
    public final z650 f12199c;

    public a4d(String str, List list, z650 z650Var) {
        this.f12197a = str;
        this.f12198b = list;
        this.f12199c = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4d)) {
            return false;
        }
        a4d a4dVar = (a4d) obj;
        return wj50.m88271j(this.f12197a, a4dVar.f12197a) && wj50.m88271j(this.f12198b, a4dVar.f12198b) && wj50.m88271j(this.f12199c, a4dVar.f12199c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f12197a.hashCode() * 31, 31, this.f12198b);
        z650 z650Var = this.f12199c;
        return iM77244c + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
