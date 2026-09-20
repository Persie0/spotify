package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class foo {

    /* JADX INFO: renamed from: a */
    public final String f71574a;

    /* JADX INFO: renamed from: b */
    public final int f71575b;

    public foo(String str, int i) {
        this.f71574a = str;
        this.f71575b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foo)) {
            return false;
        }
        foo fooVar = (foo) obj;
        return wj50.m88271j(this.f71574a, fooVar.f71574a) && this.f71575b == fooVar.f71575b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71575b) + (this.f71574a.hashCode() * 31);
    }
}
