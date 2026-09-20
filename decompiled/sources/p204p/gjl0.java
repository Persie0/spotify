package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gjl0 implements ljl0 {

    /* JADX INFO: renamed from: a */
    public final String f80505a;

    public gjl0(String str) {
        this.f80505a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjl0) && wj50.m88271j(this.f80505a, ((gjl0) obj).f80505a);
    }

    public final int hashCode() {
        return this.f80505a.hashCode();
    }
}
