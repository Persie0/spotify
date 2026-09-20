package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class is51 implements ms51 {

    /* JADX INFO: renamed from: a */
    public final String f105139a;

    public is51(String str) {
        this.f105139a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is51) && wj50.m88271j(this.f105139a, ((is51) obj).f105139a);
    }

    public final int hashCode() {
        return this.f105139a.hashCode();
    }
}
