package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final String f119866a;

    public k6y0(String str) {
        this.f119866a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6y0) && wj50.m88271j(this.f119866a, ((k6y0) obj).f119866a);
    }

    public final int hashCode() {
        return this.f119866a.hashCode();
    }
}
