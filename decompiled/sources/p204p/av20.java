package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class av20 {

    /* JADX INFO: renamed from: a */
    public final String f20074a;

    /* JADX INFO: renamed from: b */
    public final boolean f20075b;

    public av20(String str, boolean z) {
        this.f20074a = str;
        this.f20075b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av20)) {
            return false;
        }
        av20 av20Var = (av20) obj;
        return wj50.m88271j(this.f20074a, av20Var.f20074a) && this.f20075b == av20Var.f20075b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20075b) + (this.f20074a.hashCode() * 31);
    }
}
