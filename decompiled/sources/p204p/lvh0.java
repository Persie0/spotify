package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lvh0 implements yvh0 {

    /* JADX INFO: renamed from: a */
    public final String f137311a;

    public lvh0(String str) {
        this.f137311a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvh0) && wj50.m88271j(this.f137311a, ((lvh0) obj).f137311a);
    }

    public final int hashCode() {
        return this.f137311a.hashCode();
    }
}
