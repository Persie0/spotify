package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vv4 {

    /* JADX INFO: renamed from: a */
    public final String f245138a;

    /* JADX INFO: renamed from: b */
    public final String f245139b;

    public vv4(String str, String str2) {
        this.f245138a = str;
        this.f245139b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m86453a() {
        return this.f245139b;
    }

    /* JADX INFO: renamed from: b */
    public final String m86454b() {
        return this.f245138a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv4)) {
            return false;
        }
        vv4 vv4Var = (vv4) obj;
        return wj50.m88271j(this.f245138a, vv4Var.f245138a) && wj50.m88271j(this.f245139b, vv4Var.f245139b);
    }

    public final int hashCode() {
        return this.f245139b.hashCode() + (this.f245138a.hashCode() * 31);
    }
}
