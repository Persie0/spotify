package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mqf0 implements pqf0 {

    /* JADX INFO: renamed from: a */
    public final String f146279a;

    public mqf0(String str) {
        this.f146279a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqf0) && wj50.m88271j(this.f146279a, ((mqf0) obj).f146279a);
    }

    public final int hashCode() {
        return this.f146279a.hashCode();
    }
}
