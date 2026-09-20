package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ma71 {

    /* JADX INFO: renamed from: a */
    public final String f141497a;

    public ma71(String str) {
        this.f141497a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma71) && wj50.m88271j(this.f141497a, ((ma71) obj).f141497a);
    }

    public final int hashCode() {
        return this.f141497a.hashCode();
    }
}
