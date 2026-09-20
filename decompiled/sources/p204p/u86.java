package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u86 {

    /* JADX INFO: renamed from: a */
    public final String f227843a;

    public u86(String str) {
        this.f227843a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u86) && wj50.m88271j(this.f227843a, ((u86) obj).f227843a);
    }

    public final int hashCode() {
        return this.f227843a.hashCode();
    }
}
