package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ev90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f63185a;

    /* JADX INFO: renamed from: b */
    public final my90 f63186b;

    public ev90(String str, my90 my90Var) {
        this.f63185a = str;
        this.f63186b = my90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev90)) {
            return false;
        }
        ev90 ev90Var = (ev90) obj;
        return wj50.m88271j(this.f63185a, ev90Var.f63185a) && wj50.m88271j(this.f63186b, ev90Var.f63186b);
    }

    public final int hashCode() {
        return this.f63186b.hashCode() + (this.f63185a.hashCode() * 31);
    }
}
