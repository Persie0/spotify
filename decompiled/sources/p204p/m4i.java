package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m4i {

    /* JADX INFO: renamed from: a */
    public final luh f139968a;

    /* JADX INFO: renamed from: b */
    public final pfa0 f139969b;

    /* JADX INFO: renamed from: c */
    public final boolean f139970c;

    public m4i(luh luhVar, pfa0 pfa0Var, boolean z) {
        this.f139968a = luhVar;
        this.f139969b = pfa0Var;
        this.f139970c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4i)) {
            return false;
        }
        m4i m4iVar = (m4i) obj;
        return wj50.m88271j(this.f139968a, m4iVar.f139968a) && wj50.m88271j(this.f139969b, m4iVar.f139969b) && this.f139970c == m4iVar.f139970c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139970c) + ((this.f139969b.hashCode() + (this.f139968a.hashCode() * 31)) * 31);
    }
}
