package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class is00 implements ks00 {

    /* JADX INFO: renamed from: a */
    public final String f105083a;

    public is00(String str) {
        this.f105083a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is00) && wj50.m88271j(this.f105083a, ((is00) obj).f105083a);
    }

    public final int hashCode() {
        return this.f105083a.hashCode();
    }
}
