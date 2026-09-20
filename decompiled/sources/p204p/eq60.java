package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class eq60 extends gq60 {

    /* JADX INFO: renamed from: a */
    public final gd70 f61795a;

    public eq60(gd70 gd70Var) {
        this.f61795a = gd70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq60) && wj50.m88271j(this.f61795a, ((eq60) obj).f61795a);
    }

    public final int hashCode() {
        return this.f61795a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f61795a + ')';
    }
}
