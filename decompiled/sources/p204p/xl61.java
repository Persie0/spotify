package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xl61 {

    /* JADX INFO: renamed from: a */
    public final String f263058a;

    /* JADX INFO: renamed from: b */
    public final String f263059b;

    public xl61(String str, String str2) {
        this.f263058a = str;
        this.f263059b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl61)) {
            return false;
        }
        xl61 xl61Var = (xl61) obj;
        return wj50.m88271j(this.f263058a, xl61Var.f263058a) && wj50.m88271j(this.f263059b, xl61Var.f263059b);
    }

    public final int hashCode() {
        return this.f263059b.hashCode() + (this.f263058a.hashCode() * 31);
    }
}
