package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fa3 implements ha3, ia3 {

    /* JADX INFO: renamed from: a */
    public final String f67420a;

    public fa3(String str) {
        this.f67420a = str;
    }

    @Override // p204p.ia3
    /* JADX INFO: renamed from: e */
    public final String mo28556e() {
        return this.f67420a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa3) && wj50.m88271j(this.f67420a, ((fa3) obj).f67420a);
    }

    public final int hashCode() {
        return this.f67420a.hashCode();
    }
}
