package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uae0 implements xae0 {

    /* JADX INFO: renamed from: a */
    public final int f228483a;

    /* JADX INFO: renamed from: b */
    public final String f228484b;

    public uae0(int i, String str) {
        this.f228483a = i;
        this.f228484b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uae0)) {
            return false;
        }
        uae0 uae0Var = (uae0) obj;
        return this.f228483a == uae0Var.f228483a && wj50.m88271j(this.f228484b, uae0Var.f228484b);
    }

    public final int hashCode() {
        return this.f228484b.hashCode() + (edb.m38547C(this.f228483a) * 31);
    }
}
