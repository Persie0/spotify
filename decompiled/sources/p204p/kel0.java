package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kel0 implements sel0 {

    /* JADX INFO: renamed from: a */
    public final String f121910a;

    public kel0(String str) {
        this.f121910a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kel0) && wj50.m88271j(this.f121910a, ((kel0) obj).f121910a);
    }

    public final int hashCode() {
        return this.f121910a.hashCode();
    }
}
