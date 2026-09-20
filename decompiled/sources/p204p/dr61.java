package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dr61 extends hpg1 {

    /* JADX INFO: renamed from: c */
    public final int f52180c;

    public dr61(int i) {
        this.f52180c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr61) && this.f52180c == ((dr61) obj).f52180c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52180c);
    }
}
