package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fy90 {

    /* JADX INFO: renamed from: a */
    public final String f74660a;

    /* JADX INFO: renamed from: b */
    public final String f74661b;

    public fy90(String str, String str2) {
        this.f74660a = str;
        this.f74661b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy90)) {
            return false;
        }
        fy90 fy90Var = (fy90) obj;
        return wj50.m88271j(this.f74660a, fy90Var.f74660a) && wj50.m88271j(this.f74661b, fy90Var.f74661b);
    }

    public final int hashCode() {
        return this.f74661b.hashCode() + (this.f74660a.hashCode() * 31);
    }
}
