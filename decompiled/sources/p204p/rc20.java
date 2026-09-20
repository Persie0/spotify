package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rc20 extends sc20 {

    /* JADX INFO: renamed from: b */
    public final String f197695b;

    public rc20(String str) {
        super(str);
        this.f197695b = str;
    }

    @Override // p204p.sc20
    /* JADX INFO: renamed from: a */
    public final String mo66672a() {
        return this.f197695b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc20) && wj50.m88271j(this.f197695b, ((rc20) obj).f197695b);
    }

    public final int hashCode() {
        return this.f197695b.hashCode();
    }
}
