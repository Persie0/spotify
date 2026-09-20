package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yuy0 implements lvy0 {

    /* JADX INFO: renamed from: a */
    public final String f276508a;

    /* JADX INFO: renamed from: b */
    public final String f276509b;

    public /* synthetic */ yuy0(String str) {
        this(str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuy0)) {
            return false;
        }
        yuy0 yuy0Var = (yuy0) obj;
        return wj50.m88271j(this.f276508a, yuy0Var.f276508a) && wj50.m88271j(this.f276509b, yuy0Var.f276509b);
    }

    public final int hashCode() {
        return this.f276509b.hashCode() + (this.f276508a.hashCode() * 31);
    }

    public yuy0(String str, String str2) {
        this.f276508a = str;
        this.f276509b = str2;
    }
}
