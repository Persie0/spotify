package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes7.dex */
public final class ee9 {

    /* JADX INFO: renamed from: a */
    public final Activity f58715a;

    /* JADX INFO: renamed from: b */
    public final wir0 f58716b;

    /* JADX INFO: renamed from: c */
    public final String f58717c;

    public ee9(Activity activity, wir0 wir0Var, String str) {
        this.f58715a = activity;
        this.f58716b = wir0Var;
        this.f58717c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee9)) {
            return false;
        }
        ee9 ee9Var = (ee9) obj;
        return wj50.m88271j(this.f58715a, ee9Var.f58715a) && wj50.m88271j(this.f58716b, ee9Var.f58716b) && wj50.m88271j(this.f58717c, ee9Var.f58717c);
    }

    public final int hashCode() {
        int iHashCode = (this.f58716b.hashCode() + (this.f58715a.hashCode() * 31)) * 31;
        String str = this.f58717c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
