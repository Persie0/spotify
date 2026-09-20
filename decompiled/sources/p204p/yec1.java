package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yec1 implements cgc1 {

    /* JADX INFO: renamed from: a */
    public final String f271970a;

    /* JADX INFO: renamed from: b */
    public final int f271971b;

    public /* synthetic */ yec1(String str) {
        this(str, str.length());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yec1)) {
            return false;
        }
        yec1 yec1Var = (yec1) obj;
        return wj50.m88271j(this.f271970a, yec1Var.f271970a) && this.f271971b == yec1Var.f271971b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f271971b) + (this.f271970a.hashCode() * 31);
    }

    public yec1(String str, int i) {
        this.f271970a = str;
        this.f271971b = i;
    }
}
