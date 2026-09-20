package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class iz40 implements nz40 {

    /* JADX INFO: renamed from: a */
    public final String f107129a;

    public iz40(String str) {
        this.f107129a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz40) && wj50.m88271j(this.f107129a, ((iz40) obj).f107129a);
    }

    public final int hashCode() {
        return this.f107129a.hashCode();
    }
}
