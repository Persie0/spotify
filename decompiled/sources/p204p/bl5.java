package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bl5 {

    /* JADX INFO: renamed from: a */
    public final String f28098a;

    public bl5(String str) {
        this.f28098a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl5) && wj50.m88271j(this.f28098a, ((bl5) obj).f28098a);
    }

    public final int hashCode() {
        return this.f28098a.hashCode();
    }
}
