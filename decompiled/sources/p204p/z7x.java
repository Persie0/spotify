package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z7x {

    /* JADX INFO: renamed from: a */
    public final ri00 f280290a;

    /* JADX WARN: Multi-variable type inference failed */
    public z7x(gh00 gh00Var) {
        this.f280290a = (ri00) gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7x) && this.f280290a.equals(((z7x) obj).f280290a);
    }

    public final int hashCode() {
        return this.f280290a.hashCode();
    }
}
