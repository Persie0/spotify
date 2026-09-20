package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class d9m {

    /* JADX INFO: renamed from: a */
    public final String f46856a;

    /* JADX INFO: renamed from: b */
    public final eh00 f46857b;

    public d9m(String str, eh00 eh00Var) {
        this.f46856a = str;
        this.f46857b = eh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m35377a() {
        return this.f46856a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9m)) {
            return false;
        }
        d9m d9mVar = (d9m) obj;
        return wj50.m88271j(this.f46856a, d9mVar.f46856a) && this.f46857b == d9mVar.f46857b;
    }

    public final int hashCode() {
        return this.f46857b.hashCode() + (this.f46856a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f46856a + ", action=" + this.f46857b + ')';
    }
}
