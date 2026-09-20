package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ud2 extends wd2 {

    /* JADX INFO: renamed from: a */
    public final md2 f229160a;

    public ud2(md2 md2Var) {
        this.f229160a = md2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud2) && this.f229160a.equals(((ud2) obj).f229160a);
    }

    public final int hashCode() {
        return this.f229160a.hashCode() * 31;
    }
}
