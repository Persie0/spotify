package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j921 implements l921 {

    /* JADX INFO: renamed from: a */
    public final String f110080a;

    public j921(String str) {
        this.f110080a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m52723a() {
        return this.f110080a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j921) && wj50.m88271j(this.f110080a, ((j921) obj).f110080a);
    }

    public final int hashCode() {
        return this.f110080a.hashCode();
    }
}
