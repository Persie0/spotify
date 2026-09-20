package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ts2 implements us2 {

    /* JADX INFO: renamed from: a */
    public final String f223189a;

    public ts2(String str) {
        this.f223189a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts2) && wj50.m88271j(this.f223189a, ((ts2) obj).f223189a);
    }

    public final int hashCode() {
        return this.f223189a.hashCode();
    }
}
