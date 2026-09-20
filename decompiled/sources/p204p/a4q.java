package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a4q implements b4q {

    /* JADX INFO: renamed from: a */
    public final String f12290a;

    public a4q(String str) {
        this.f12290a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4q) && wj50.m88271j(this.f12290a, ((a4q) obj).f12290a);
    }

    public final int hashCode() {
        return this.f12290a.hashCode();
    }
}
