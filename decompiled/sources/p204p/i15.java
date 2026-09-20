package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i15 {

    /* JADX INFO: renamed from: a */
    public final Object f97388a;

    /* JADX INFO: renamed from: b */
    public final int f97389b;

    /* JADX INFO: renamed from: c */
    public final int f97390c;

    /* JADX INFO: renamed from: d */
    public final String f97391d;

    public i15(int i, int i2, Object obj, String str) {
        this.f97388a = obj;
        this.f97389b = i;
        this.f97390c = i2;
        this.f97391d = str;
        if (i <= i2) {
            return;
        }
        nt40.m65597a("Reversed range is not supported");
    }

    /* JADX INFO: renamed from: a */
    public static i15 m49395a(i15 i15Var, e15 e15Var, int i, int i2, int i3) {
        Object obj = e15Var;
        if ((i3 & 1) != 0) {
            obj = i15Var.f97388a;
        }
        if ((i3 & 2) != 0) {
            i = i15Var.f97389b;
        }
        if ((i3 & 4) != 0) {
            i2 = i15Var.f97390c;
        }
        String str = i15Var.f97391d;
        i15Var.getClass();
        return new i15(i, i2, obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i15)) {
            return false;
        }
        i15 i15Var = (i15) obj;
        return wj50.m88271j(this.f97388a, i15Var.f97388a) && this.f97389b == i15Var.f97389b && this.f97390c == i15Var.f97390c && wj50.m88271j(this.f97391d, i15Var.f97391d);
    }

    public final int hashCode() {
        Object obj = this.f97388a;
        return this.f97391d.hashCode() + mt60.m62800g(this.f97390c, mt60.m62800g(this.f97389b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f97388a);
        sb.append(", start=");
        sb.append(this.f97389b);
        sb.append(", end=");
        sb.append(this.f97390c);
        sb.append(", tag=");
        return dq60.m36617q(sb, this.f97391d, ')');
    }

    public i15(Object obj, int i, int i2) {
        this(i, i2, obj, "");
    }
}
