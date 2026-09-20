package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class aqx0 implements arx0, nqx0, upx0 {

    /* JADX INFO: renamed from: a */
    public final jq50 f18862a;

    /* JADX INFO: renamed from: b */
    public final boolean f18863b;

    /* JADX INFO: renamed from: c */
    public final String f18864c;

    /* JADX INFO: renamed from: d */
    public final mqx0 f18865d;

    /* JADX INFO: renamed from: e */
    public final int f18866e;

    public aqx0(jq50 jq50Var, boolean z, mqx0 mqx0Var, int i) {
        String str = jq50Var.f114791a;
        this.f18862a = jq50Var;
        this.f18863b = z;
        this.f18864c = str;
        this.f18865d = mqx0Var;
        this.f18866e = i;
    }

    @Override // p204p.upx0
    /* JADX INFO: renamed from: a */
    public final int mo26905a() {
        return this.f18866e;
    }

    @Override // p204p.nqx0
    /* JADX INFO: renamed from: b */
    public final mqx0 mo26906b() {
        return this.f18865d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqx0)) {
            return false;
        }
        aqx0 aqx0Var = (aqx0) obj;
        return this.f18862a.equals(aqx0Var.f18862a) && this.f18863b == aqx0Var.f18863b && wj50.m88271j(this.f18864c, aqx0Var.f18864c) && this.f18865d.equals(aqx0Var.f18865d) && this.f18866e == aqx0Var.f18866e;
    }

    @Override // p204p.arx0
    public final String getId() {
        return this.f18864c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f18866e) + ((this.f18865d.hashCode() + s571.m77243b(s571.m77245d(this.f18862a.hashCode() * 31, 31, this.f18863b), 31, this.f18864c)) * 31);
    }
}
