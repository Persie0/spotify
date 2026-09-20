package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qna0 extends tna0 {

    /* JADX INFO: renamed from: a */
    public final String f190545a;

    /* JADX INFO: renamed from: b */
    public final boolean f190546b;

    public qna0(String str, boolean z) {
        this.f190545a = str;
        this.f190546b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qna0)) {
            return false;
        }
        qna0 qna0Var = (qna0) obj;
        return wj50.m88271j(this.f190545a, qna0Var.f190545a) && this.f190546b == qna0Var.f190546b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190546b) + (this.f190545a.hashCode() * 31);
    }
}
