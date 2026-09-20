package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jwi extends kwi {

    /* JADX INFO: renamed from: a */
    public final String f116646a;

    /* JADX INFO: renamed from: b */
    public final lwi f116647b;

    public jwi(String str, lwi lwiVar) {
        this.f116646a = str;
        this.f116647b = lwiVar;
    }

    @Override // p204p.kwi
    /* JADX INFO: renamed from: a */
    public final lwi mo51838a() {
        return this.f116647b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwi)) {
            return false;
        }
        jwi jwiVar = (jwi) obj;
        return wj50.m88271j(this.f116646a, jwiVar.f116646a) && this.f116647b == jwiVar.f116647b;
    }

    public final int hashCode() {
        return this.f116647b.hashCode() + (this.f116646a.hashCode() * 31);
    }
}
