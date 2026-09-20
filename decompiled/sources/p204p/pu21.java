package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pu21 implements jsh, Iterable, pq60 {

    /* JADX INFO: renamed from: a */
    public final ou21 f181316a;

    /* JADX INFO: renamed from: b */
    public final int f181317b;

    /* JADX INFO: renamed from: c */
    public final int f181318c;

    public pu21(ou21 ou21Var, int i, int i2) {
        this.f181316a = ou21Var;
        this.f181317b = i;
        this.f181318c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pu21)) {
            return false;
        }
        pu21 pu21Var = (pu21) obj;
        return pu21Var.f181317b == this.f181317b && pu21Var.f181318c == this.f181318c && wj50.m88271j(pu21Var.f181316a, this.f181316a);
    }

    public final int hashCode() {
        return (this.f181316a.hashCode() * 31) + this.f181317b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ou21 ou21Var = this.f181316a;
        if (ou21Var.f170153h != this.f181318c) {
            qu21.m73872f();
        }
        int i = this.f181317b;
        ou21Var.m68082l(i);
        return new e620(ou21Var, i + 1, ou21Var.f170146a[(i * 5) + 3] + i);
    }
}
