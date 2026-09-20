package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hl51 implements h1x0 {

    /* JADX INFO: renamed from: a */
    public final String f92620a;

    public hl51(String str) {
        this.f92620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hl51) && wj50.m88271j(this.f92620a, ((hl51) obj).f92620a);
    }

    public final int hashCode() {
        return this.f92620a.hashCode();
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return this.f92620a;
    }
}
