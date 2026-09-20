package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j360 implements l360 {

    /* JADX INFO: renamed from: a */
    public final String f108295a;

    public j360(String str) {
        this.f108295a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j360) && wj50.m88271j(this.f108295a, ((j360) obj).f108295a);
    }

    public final int hashCode() {
        return this.f108295a.hashCode();
    }
}
