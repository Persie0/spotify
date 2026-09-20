package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tdp0 extends bep0 {

    /* JADX INFO: renamed from: a */
    public final String f219447a;

    /* JADX INFO: renamed from: b */
    public final long f219448b;

    public tdp0(String str, long j) {
        this.f219447a = str;
        this.f219448b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdp0)) {
            return false;
        }
        tdp0 tdp0Var = (tdp0) obj;
        return wj50.m88271j(this.f219447a, tdp0Var.f219447a) && this.f219448b == tdp0Var.f219448b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f219448b) + (this.f219447a.hashCode() * 31);
    }
}
