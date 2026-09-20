package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sw1 extends AbstractC1861fi {

    /* JADX INFO: renamed from: b */
    public final String f214553b;

    /* JADX INFO: renamed from: c */
    public final String f214554c;

    public sw1(String str, String str2) {
        super(str);
        this.f214553b = str;
        this.f214554c = str2;
    }

    @Override // p204p.AbstractC1861fi
    /* JADX INFO: renamed from: b */
    public final String mo41686b() {
        return this.f214553b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw1)) {
            return false;
        }
        sw1 sw1Var = (sw1) obj;
        return wj50.m88271j(this.f214553b, sw1Var.f214553b) && wj50.m88271j(this.f214554c, sw1Var.f214554c);
    }

    public final int hashCode() {
        return this.f214554c.hashCode() + (this.f214553b.hashCode() * 31);
    }
}
