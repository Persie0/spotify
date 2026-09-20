package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oc20 extends sc20 {

    /* JADX INFO: renamed from: b */
    public final String f163798b;

    public oc20(String str) {
        super(str);
        this.f163798b = str;
    }

    @Override // p204p.sc20
    /* JADX INFO: renamed from: a */
    public final String mo66672a() {
        return this.f163798b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc20) && wj50.m88271j(this.f163798b, ((oc20) obj).f163798b);
    }

    public final int hashCode() {
        return this.f163798b.hashCode();
    }
}
