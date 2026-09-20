package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x190 implements y190 {

    /* JADX INFO: renamed from: a */
    public final String f257107a;

    public x190(String str) {
        this.f257107a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x190) && wj50.m88271j(this.f257107a, ((x190) obj).f257107a);
    }

    public final int hashCode() {
        return this.f257107a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("Uri(uri=", this.f257107a, ")");
    }
}
