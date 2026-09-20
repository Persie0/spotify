package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qej0 extends vej0 {

    /* JADX INFO: renamed from: a */
    public final int f187950a;

    /* JADX INFO: renamed from: b */
    public final String f187951b;

    /* JADX INFO: renamed from: c */
    public final String f187952c;

    public qej0(int i, String str, String str2) {
        this.f187950a = i;
        this.f187951b = str;
        this.f187952c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qej0)) {
            return false;
        }
        qej0 qej0Var = (qej0) obj;
        return this.f187950a == qej0Var.f187950a && wj50.m88271j(this.f187951b, qej0Var.f187951b) && wj50.m88271j(this.f187952c, qej0Var.f187952c);
    }

    public final int hashCode() {
        return this.f187952c.hashCode() + s571.m77243b(edb.m38547C(this.f187950a) * 31, 31, this.f187951b);
    }
}
