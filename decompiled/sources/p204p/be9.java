package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class be9 extends Throwable {

    /* JADX INFO: renamed from: a */
    public final x6x0 f26302a;

    public be9(x6x0 x6x0Var) {
        this.f26302a = x6x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be9) && wj50.m88271j(this.f26302a, ((be9) obj).f26302a);
    }

    public final int hashCode() {
        return this.f26302a.hashCode();
    }
}
