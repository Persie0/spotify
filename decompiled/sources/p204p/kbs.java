package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kbs {

    /* JADX INFO: renamed from: a */
    public final String f121271a;

    public kbs(String str) {
        this.f121271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbs) && wj50.m88271j(this.f121271a, ((kbs) obj).f121271a);
    }

    public final int hashCode() {
        return this.f121271a.hashCode();
    }
}
