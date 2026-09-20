package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hu1 {

    /* JADX INFO: renamed from: a */
    public final String f95235a;

    public hu1(String str) {
        this.f95235a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu1) && wj50.m88271j(this.f95235a, ((hu1) obj).f95235a);
    }

    public final int hashCode() {
        return this.f95235a.hashCode() * 31;
    }
}
