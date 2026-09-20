package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g4z implements h4z {

    /* JADX INFO: renamed from: a */
    public final i4z f76553a;

    /* JADX INFO: renamed from: b */
    public final j4z f76554b;

    public g4z(i4z i4zVar, j4z j4zVar) {
        this.f76553a = i4zVar;
        this.f76554b = j4zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4z)) {
            return false;
        }
        g4z g4zVar = (g4z) obj;
        return wj50.m88271j(this.f76553a, g4zVar.f76553a) && wj50.m88271j(this.f76554b, g4zVar.f76554b);
    }

    public final int hashCode() {
        return this.f76554b.hashCode() + (this.f76553a.hashCode() * 31);
    }
}
