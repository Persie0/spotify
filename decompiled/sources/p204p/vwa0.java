package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vwa0 extends wwa0 {

    /* JADX INFO: renamed from: a */
    public final String f245446a;

    /* JADX INFO: renamed from: b */
    public final String f245447b;

    /* JADX INFO: renamed from: c */
    public final String f245448c;

    public vwa0(String str, String str2, String str3) {
        this.f245446a = str;
        this.f245447b = str2;
        this.f245448c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwa0)) {
            return false;
        }
        vwa0 vwa0Var = (vwa0) obj;
        return wj50.m88271j(this.f245446a, vwa0Var.f245446a) && wj50.m88271j(this.f245447b, vwa0Var.f245447b) && wj50.m88271j(this.f245448c, vwa0Var.f245448c);
    }

    public final int hashCode() {
        return this.f245448c.hashCode() + s571.m77243b(this.f245446a.hashCode() * 31, 31, this.f245447b);
    }
}
