package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cs61 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final String f41480a;

    public cs61(String str) {
        this.f41480a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs61) && wj50.m88271j(this.f41480a, ((cs61) obj).f41480a);
    }

    public final int hashCode() {
        return this.f41480a.hashCode();
    }
}
