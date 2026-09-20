package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f141315a;

    public m9i(String str) {
        this.f141315a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9i) && wj50.m88271j(this.f141315a, ((m9i) obj).f141315a);
    }

    public final int hashCode() {
        return this.f141315a.hashCode() * 31;
    }
}
