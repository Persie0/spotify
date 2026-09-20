package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rg90 implements moc1 {

    /* JADX INFO: renamed from: a */
    public final String f198894a;

    public rg90(String str) {
        this.f198894a = str;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg90) && wj50.m88271j(this.f198894a, ((rg90) obj).f198894a);
    }

    public final int hashCode() {
        String str = this.f198894a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
