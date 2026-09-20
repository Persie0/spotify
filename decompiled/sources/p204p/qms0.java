package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qms0 implements sms0 {

    /* JADX INFO: renamed from: a */
    public final String f190396a;

    /* JADX INFO: renamed from: b */
    public final String f190397b;

    /* JADX INFO: renamed from: c */
    public final String f190398c;

    public qms0(String str, String str2, String str3) {
        this.f190396a = str;
        this.f190397b = str2;
        this.f190398c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qms0)) {
            return false;
        }
        qms0 qms0Var = (qms0) obj;
        return wj50.m88271j(this.f190396a, qms0Var.f190396a) && wj50.m88271j(this.f190397b, qms0Var.f190397b) && wj50.m88271j(this.f190398c, qms0Var.f190398c);
    }

    public final int hashCode() {
        return this.f190398c.hashCode() + s571.m77243b(this.f190396a.hashCode() * 31, 31, this.f190397b);
    }
}
