package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class soc1 implements hes0 {

    /* JADX INFO: renamed from: a */
    public final String f211164a;

    public soc1(String str) {
        this.f211164a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof soc1) && wj50.m88271j(this.f211164a, ((soc1) obj).f211164a);
    }

    public final int hashCode() {
        return this.f211164a.hashCode();
    }
}
