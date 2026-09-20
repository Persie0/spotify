package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class kb01 {

    /* JADX INFO: renamed from: a */
    public final int f121027a;

    /* JADX INFO: renamed from: b */
    public final gh00 f121028b;

    /* JADX INFO: renamed from: c */
    public final String f121029c;

    public kb01(int i, f6w0 f6w0Var, String str) {
        this.f121027a = i;
        this.f121028b = f6w0Var;
        this.f121029c = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m55915a(Context context) {
        String str;
        gh00 gh00Var = this.f121028b;
        return (gh00Var == null || (str = (String) gh00Var.invoke(context)) == null) ? context.getString(this.f121027a) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb01)) {
            return false;
        }
        kb01 kb01Var = (kb01) obj;
        return this.f121027a == kb01Var.f121027a && wj50.m88271j(this.f121028b, kb01Var.f121028b) && wj50.m88271j(this.f121029c, kb01Var.f121029c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f121027a) * 31;
        gh00 gh00Var = this.f121028b;
        return this.f121029c.hashCode() + ((iHashCode + (gh00Var == null ? 0 : gh00Var.hashCode())) * 31);
    }
}
