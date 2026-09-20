package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class d1d1 implements f1d1 {

    /* JADX INFO: renamed from: a */
    public final String f44240a;

    public d1d1(String str) {
        this.f44240a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1d1) && wj50.m88271j(this.f44240a, ((d1d1) obj).f44240a);
    }

    public final int hashCode() {
        return this.f44240a.hashCode();
    }
}
