package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qke0 extends ale0 {

    /* JADX INFO: renamed from: a */
    public final String f189537a;

    /* JADX INFO: renamed from: b */
    public final long f189538b;

    /* JADX INFO: renamed from: c */
    public final String f189539c;

    /* JADX INFO: renamed from: d */
    public final mke0 f189540d;

    public qke0(String str, long j, String str2, mke0 mke0Var) {
        this.f189537a = str;
        this.f189538b = j;
        this.f189539c = str2;
        this.f189540d = mke0Var;
    }

    @Override // p204p.ale0
    /* JADX INFO: renamed from: a */
    public final String mo26293a() {
        throw null;
    }

    @Override // p204p.ale0
    /* JADX INFO: renamed from: b */
    public final mke0 mo26294b() {
        return this.f189540d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qke0)) {
            return false;
        }
        qke0 qke0Var = (qke0) obj;
        return wj50.m88271j(this.f189537a, qke0Var.f189537a) && this.f189538b == qke0Var.f189538b && wj50.m88271j(this.f189539c, qke0Var.f189539c) && wj50.m88271j(this.f189540d, qke0Var.f189540d);
    }

    public final int hashCode() {
        return this.f189540d.hashCode() + s571.m77243b(dq60.m36605e(this.f189537a.hashCode() * 31, this.f189538b, 31), 31, this.f189539c);
    }
}
