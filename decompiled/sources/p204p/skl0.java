package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class skl0 {

    /* JADX INFO: renamed from: a */
    public final pkl0 f210162a;

    /* JADX INFO: renamed from: b */
    public final boolean f210163b;

    public skl0(pkl0 pkl0Var, boolean z) {
        this.f210162a = pkl0Var;
        this.f210163b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skl0)) {
            return false;
        }
        skl0 skl0Var = (skl0) obj;
        return wj50.m88271j(this.f210162a, skl0Var.f210162a) && this.f210163b == skl0Var.f210163b;
    }

    public final int hashCode() {
        pkl0 pkl0Var = this.f210162a;
        return Boolean.hashCode(this.f210163b) + ((pkl0Var == null ? 0 : pkl0Var.hashCode()) * 31);
    }
}
