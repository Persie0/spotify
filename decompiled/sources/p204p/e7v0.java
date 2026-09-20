package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e7v0 extends f7v0 {

    /* JADX INFO: renamed from: a */
    public final String f57014a;

    public e7v0(String str) {
        this.f57014a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7v0) && wj50.m88271j(this.f57014a, ((e7v0) obj).f57014a);
    }

    public final int hashCode() {
        return this.f57014a.hashCode();
    }
}
