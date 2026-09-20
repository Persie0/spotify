package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qey0 {

    /* JADX INFO: renamed from: a */
    public final vda1 f188058a;

    /* JADX INFO: renamed from: b */
    public final String f188059b;

    /* JADX INFO: renamed from: c */
    public final boolean f188060c;

    public qey0(vda1 vda1Var, String str, boolean z) {
        this.f188058a = vda1Var;
        this.f188059b = str;
        this.f188060c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qey0)) {
            return false;
        }
        qey0 qey0Var = (qey0) obj;
        return wj50.m88271j(this.f188058a, qey0Var.f188058a) && wj50.m88271j(this.f188059b, qey0Var.f188059b) && this.f188060c == qey0Var.f188060c;
    }

    public final int hashCode() {
        int iHashCode = this.f188058a.hashCode() * 31;
        String str = this.f188059b;
        return Boolean.hashCode(this.f188060c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
