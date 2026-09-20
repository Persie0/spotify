package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qmq0 {

    /* JADX INFO: renamed from: a */
    public final String f190379a;

    /* JADX INFO: renamed from: b */
    public final int f190380b;

    public qmq0(String str, int i) {
        this.f190379a = str;
        this.f190380b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmq0)) {
            return false;
        }
        qmq0 qmq0Var = (qmq0) obj;
        return wj50.m88271j(this.f190379a, qmq0Var.f190379a) && this.f190380b == qmq0Var.f190380b;
    }

    public final int hashCode() {
        String str = this.f190379a;
        return edb.m38547C(this.f190380b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
