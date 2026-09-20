package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qji0 implements rji0 {

    /* JADX INFO: renamed from: a */
    public final String f189251a;

    /* JADX INFO: renamed from: b */
    public final String f189252b;

    public qji0(String str, String str2) {
        this.f189251a = str;
        this.f189252b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qji0)) {
            return false;
        }
        qji0 qji0Var = (qji0) obj;
        return wj50.m88271j(this.f189251a, qji0Var.f189251a) && wj50.m88271j(this.f189252b, qji0Var.f189252b);
    }

    public final int hashCode() {
        return this.f189252b.hashCode() + (this.f189251a.hashCode() * 31);
    }
}
