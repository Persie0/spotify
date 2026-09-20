package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sh81 extends uh81 {

    /* JADX INFO: renamed from: a */
    public final String f209147a;

    public sh81(String str) {
        this.f209147a = str;
    }

    @Override // p204p.uh81
    /* JADX INFO: renamed from: a */
    public final String mo72792a() {
        return this.f209147a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh81) && wj50.m88271j(this.f209147a, ((sh81) obj).f209147a);
    }

    public final int hashCode() {
        return this.f209147a.hashCode();
    }
}
