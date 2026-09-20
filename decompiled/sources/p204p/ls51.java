package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ls51 implements ms51 {

    /* JADX INFO: renamed from: a */
    public final String f136450a;

    public ls51(String str) {
        this.f136450a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls51) && wj50.m88271j(this.f136450a, ((ls51) obj).f136450a);
    }

    public final int hashCode() {
        return this.f136450a.hashCode();
    }
}
