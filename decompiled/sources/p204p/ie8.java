package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ie8 extends te8 {

    /* JADX INFO: renamed from: a */
    public final String f101343a;

    public ie8(String str) {
        this.f101343a = str;
    }

    @Override // p204p.te8
    /* JADX INFO: renamed from: a */
    public final String mo32497a() {
        return this.f101343a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie8) && wj50.m88271j(this.f101343a, ((ie8) obj).f101343a);
    }

    public final int hashCode() {
        return this.f101343a.hashCode();
    }
}
