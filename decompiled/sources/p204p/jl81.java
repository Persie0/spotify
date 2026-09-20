package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jl81 implements kl81 {

    /* JADX INFO: renamed from: a */
    public final String f113524a;

    public jl81(String str) {
        this.f113524a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl81) && wj50.m88271j(this.f113524a, ((jl81) obj).f113524a);
    }

    public final int hashCode() {
        String str = this.f113524a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
