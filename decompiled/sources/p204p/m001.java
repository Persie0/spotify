package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final String f138482a;

    public m001(String str) {
        this.f138482a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m001) && wj50.m88271j(this.f138482a, ((m001) obj).f138482a);
    }

    public final int hashCode() {
        return this.f138482a.hashCode();
    }
}
