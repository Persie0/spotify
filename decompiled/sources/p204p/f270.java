package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f270 implements h270 {

    /* JADX INFO: renamed from: a */
    public final String f65124a;

    public f270(String str) {
        this.f65124a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f270) && wj50.m88271j(this.f65124a, ((f270) obj).f65124a);
    }

    public final int hashCode() {
        return this.f65124a.hashCode();
    }
}
