package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rmo extends tmo {

    /* JADX INFO: renamed from: a */
    public final yie1 f200593a;

    public rmo(yie1 yie1Var) {
        this.f200593a = yie1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rmo) && wj50.m88271j(this.f200593a, ((rmo) obj).f200593a);
    }

    public final int hashCode() {
        return this.f200593a.hashCode();
    }
}
