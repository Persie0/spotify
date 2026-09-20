package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ap31 implements dp31 {

    /* JADX INFO: renamed from: a */
    public final String f17825a;

    public ap31(String str) {
        this.f17825a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap31) && wj50.m88271j(this.f17825a, ((ap31) obj).f17825a);
    }

    public final int hashCode() {
        return this.f17825a.hashCode();
    }
}
