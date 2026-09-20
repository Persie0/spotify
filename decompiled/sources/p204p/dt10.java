package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dt10 {

    /* JADX INFO: renamed from: a */
    public final String f52694a;

    /* JADX INFO: renamed from: b */
    public final boolean f52695b;

    public dt10(String str, boolean z) {
        this.f52694a = str;
        this.f52695b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt10)) {
            return false;
        }
        dt10 dt10Var = (dt10) obj;
        return wj50.m88271j(this.f52694a, dt10Var.f52694a) && this.f52695b == dt10Var.f52695b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52695b) + (this.f52694a.hashCode() * 31);
    }
}
