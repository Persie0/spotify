package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vcm0 {

    /* JADX INFO: renamed from: a */
    public final String f240165a;

    /* JADX INFO: renamed from: b */
    public final String f240166b;

    public vcm0(String str, String str2) {
        this.f240165a = str;
        this.f240166b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcm0)) {
            return false;
        }
        vcm0 vcm0Var = (vcm0) obj;
        return wj50.m88271j(this.f240165a, vcm0Var.f240165a) && wj50.m88271j(this.f240166b, vcm0Var.f240166b);
    }

    public final int hashCode() {
        return this.f240166b.hashCode() + (this.f240165a.hashCode() * 31);
    }
}
