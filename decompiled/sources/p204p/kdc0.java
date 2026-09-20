package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kdc0 extends mdc0 {

    /* JADX INFO: renamed from: a */
    public final String f121659a;

    public kdc0(String str) {
        this.f121659a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kdc0) && wj50.m88271j(this.f121659a, ((kdc0) obj).f121659a);
    }

    public final int hashCode() {
        return this.f121659a.hashCode();
    }
}
