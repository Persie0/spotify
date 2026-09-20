package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tdk {

    /* JADX INFO: renamed from: a */
    public final sdk f219314a;

    /* JADX INFO: renamed from: b */
    public final boolean f219315b;

    /* JADX INFO: renamed from: c */
    public final String f219316c;

    /* JADX INFO: renamed from: d */
    public final qf40 f219317d;

    public tdk(sdk sdkVar, boolean z, String str, qf40 qf40Var) {
        this.f219314a = sdkVar;
        this.f219315b = z;
        this.f219316c = str;
        this.f219317d = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdk)) {
            return false;
        }
        tdk tdkVar = (tdk) obj;
        return wj50.m88271j(this.f219314a, tdkVar.f219314a) && this.f219315b == tdkVar.f219315b && wj50.m88271j(this.f219316c, tdkVar.f219316c) && wj50.m88271j(this.f219317d, tdkVar.f219317d);
    }

    public final int hashCode() {
        return this.f219317d.hashCode() + s571.m77243b(s571.m77245d(this.f219314a.hashCode() * 31, 31, this.f219315b), 31, this.f219316c);
    }
}
