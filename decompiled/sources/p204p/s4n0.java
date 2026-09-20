package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s4n0 implements v4n0 {

    /* JADX INFO: renamed from: a */
    public final String f205618a;

    public s4n0(String str) {
        this.f205618a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4n0) && wj50.m88271j(this.f205618a, ((s4n0) obj).f205618a);
    }

    public final int hashCode() {
        return this.f205618a.hashCode();
    }
}
