package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l9x implements m9x {

    /* JADX INFO: renamed from: a */
    public final String f131189a;

    public l9x(String str) {
        this.f131189a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9x) && wj50.m88271j(this.f131189a, ((l9x) obj).f131189a);
    }

    public final int hashCode() {
        return this.f131189a.hashCode();
    }
}
