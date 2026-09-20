package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xyp0 extends zyp0 {

    /* JADX INFO: renamed from: a */
    public final String f267397a;

    public xyp0(String str) {
        this.f267397a = str;
    }

    @Override // p204p.zyp0
    /* JADX INFO: renamed from: a */
    public final String mo89382a() {
        return this.f267397a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyp0) && wj50.m88271j(this.f267397a, ((xyp0) obj).f267397a);
    }

    public final int hashCode() {
        return this.f267397a.hashCode();
    }
}
