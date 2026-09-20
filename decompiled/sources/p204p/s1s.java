package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s1s {

    /* JADX INFO: renamed from: a */
    public final int f204784a;

    /* JADX INFO: renamed from: b */
    public final int f204785b;

    public /* synthetic */ s1s() {
        this(3, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1s)) {
            return false;
        }
        s1s s1sVar = (s1s) obj;
        return this.f204784a == s1sVar.f204784a && this.f204785b == s1sVar.f204785b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f204785b) + (edb.m38547C(this.f204784a) * 31);
    }

    public s1s(int i, int i2) {
        this.f204784a = i;
        this.f204785b = i2;
    }
}
