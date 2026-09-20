package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ep6 extends gp6 {

    /* JADX INFO: renamed from: d */
    public final String f61552d;

    public ep6(String str) {
        this.f61552d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep6) && wj50.m88271j(this.f61552d, ((ep6) obj).f61552d);
    }

    public final int hashCode() {
        return this.f61552d.hashCode();
    }

    @Override // p204p.vyf1
    /* JADX INFO: renamed from: x */
    public final String mo39618x() {
        return this.f61552d;
    }
}
