package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kdd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f121661a;

    public kdd(String str) {
        this.f121661a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kdd) && wj50.m88271j(this.f121661a, ((kdd) obj).f121661a);
    }

    public final int hashCode() {
        return this.f121661a.hashCode();
    }
}
