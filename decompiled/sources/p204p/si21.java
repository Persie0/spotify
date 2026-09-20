package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class si21 {

    /* JADX INFO: renamed from: a */
    public final int f209347a;

    /* JADX INFO: renamed from: b */
    public final int f209348b;

    public si21(int i, int i2) {
        this.f209347a = i;
        this.f209348b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si21)) {
            return false;
        }
        si21 si21Var = (si21) obj;
        return this.f209347a == si21Var.f209347a && this.f209348b == si21Var.f209348b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f209348b) + (edb.m38547C(this.f209347a) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + mt60.m62810q(this.f209347a) + ", height=" + mt60.m62810q(this.f209348b) + ')';
    }
}
