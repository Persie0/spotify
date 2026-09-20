package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pd8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f176381a;

    /* JADX INFO: renamed from: b */
    public final int f176382b;

    public pd8(String str, int i) {
        this.f176381a = str;
        this.f176382b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd8)) {
            return false;
        }
        pd8 pd8Var = (pd8) obj;
        return wj50.m88271j(this.f176381a, pd8Var.f176381a) && this.f176382b == pd8Var.f176382b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f176382b) + (this.f176381a.hashCode() * 31);
    }
}
