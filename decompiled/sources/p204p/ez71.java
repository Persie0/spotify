package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ez71 extends jz71 {

    /* JADX INFO: renamed from: a */
    public final String f64301a;

    public ez71(String str) {
        this.f64301a = str;
    }

    @Override // p204p.jz71
    /* JADX INFO: renamed from: a */
    public final String mo30975a() {
        return this.f64301a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez71) && wj50.m88271j(this.f64301a, ((ez71) obj).f64301a);
    }

    public final int hashCode() {
        return this.f64301a.hashCode();
    }
}
