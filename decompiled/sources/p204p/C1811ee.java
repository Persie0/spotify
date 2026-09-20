package p204p;

/* JADX INFO: renamed from: p.ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1811ee {

    /* JADX INFO: renamed from: a */
    public final String f58629a;

    /* JADX INFO: renamed from: b */
    public final ai00 f58630b;

    public C1811ee(String str, ai00 ai00Var) {
        this.f58629a = str;
        this.f58630b = ai00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811ee)) {
            return false;
        }
        C1811ee c1811ee = (C1811ee) obj;
        return wj50.m88271j(this.f58629a, c1811ee.f58629a) && wj50.m88271j(this.f58630b, c1811ee.f58630b);
    }

    public final int hashCode() {
        String str = this.f58629a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ai00 ai00Var = this.f58630b;
        return iHashCode + (ai00Var != null ? ai00Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f58629a + ", action=" + this.f58630b + ')';
    }
}
