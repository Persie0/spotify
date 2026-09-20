package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m901 implements x901 {

    /* JADX INFO: renamed from: a */
    public final String f141185a;

    public m901(String str) {
        this.f141185a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m901) && wj50.m88271j(this.f141185a, ((m901) obj).f141185a);
    }

    public final int hashCode() {
        return this.f141185a.hashCode();
    }
}
