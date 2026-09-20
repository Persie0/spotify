package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s530 implements z530 {

    /* JADX INFO: renamed from: a */
    public final int f205702a;

    public s530(int i) {
        this.f205702a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s530) && this.f205702a == ((s530) obj).f205702a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f205702a);
    }
}
