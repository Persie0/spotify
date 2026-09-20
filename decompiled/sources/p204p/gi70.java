package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gi70 {

    /* JADX INFO: renamed from: a */
    public final String f80085a;

    public gi70(String str) {
        this.f80085a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi70) && wj50.m88271j(this.f80085a, ((gi70) obj).f80085a);
    }

    public final int hashCode() {
        return this.f80085a.hashCode();
    }
}
