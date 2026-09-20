package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xlk0 {

    /* JADX INFO: renamed from: a */
    public final Object f263159a;

    /* JADX INFO: renamed from: b */
    public int f263160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ylk0 f263161c;

    public xlk0(ylk0 ylk0Var, int i) {
        this.f263161c = ylk0Var;
        this.f263159a = ylk0Var.f274037a[i];
        this.f263160b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m91436a() {
        int i = this.f263160b;
        Object obj = this.f263159a;
        ylk0 ylk0Var = this.f263161c;
        if (i == -1 || i >= ylk0Var.f274039c || !upf.m83705v(obj, ylk0Var.f274037a[i])) {
            this.f263160b = ylk0Var.m94166c(obj);
        }
        int i2 = this.f263160b;
        if (i2 == -1) {
            return 0;
        }
        return ylk0Var.f274038b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xlk0) {
            xlk0 xlk0Var = (xlk0) obj;
            if (m91436a() == xlk0Var.m91436a() && upf.m83705v(this.f263159a, xlk0Var.f263159a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f263159a;
        return (obj == null ? 0 : obj.hashCode()) ^ m91436a();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f263159a);
        int iM91436a = m91436a();
        return iM91436a == 1 ? strValueOf : edb.m38565n(strValueOf, " x ", iM91436a);
    }
}
