package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fl8 {

    /* JADX INFO: renamed from: a */
    public final Object f70720a;

    /* JADX INFO: renamed from: b */
    public final int f70721b;

    public fl8(u4y u4yVar, int i) {
        this.f70720a = u4yVar;
        this.f70721b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl8)) {
            return false;
        }
        fl8 fl8Var = (fl8) obj;
        return wj50.m88271j(this.f70720a, fl8Var.f70720a) && this.f70721b == fl8Var.f70721b;
    }

    public final int hashCode() {
        Object obj = this.f70720a;
        return Integer.hashCode(this.f70721b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
