package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nn1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f156307a;

    public nn1(String str) {
        this.f156307a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn1) && wj50.m88271j(this.f156307a, ((nn1) obj).f156307a);
    }

    public final int hashCode() {
        return this.f156307a.hashCode();
    }
}
