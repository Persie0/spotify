package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f70527a;

    public fkd(String str) {
        this.f70527a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkd) && wj50.m88271j(this.f70527a, ((fkd) obj).f70527a);
    }

    public final int hashCode() {
        return this.f70527a.hashCode();
    }
}
