package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eqe {

    /* JADX INFO: renamed from: a */
    public final String f61871a;

    public eqe(String str) {
        this.f61871a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqe) && wj50.m88271j(this.f61871a, ((eqe) obj).f61871a);
    }

    public final int hashCode() {
        return this.f61871a.hashCode();
    }
}
