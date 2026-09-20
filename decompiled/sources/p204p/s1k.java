package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class s1k {

    /* JADX INFO: renamed from: a */
    public final long f204728a;

    /* JADX INFO: renamed from: b */
    public final long f204729b;

    /* JADX INFO: renamed from: c */
    public final long f204730c;

    /* JADX INFO: renamed from: d */
    public final long f204731d;

    /* JADX INFO: renamed from: e */
    public final long f204732e;

    public s1k(long j, long j2, long j3, long j4, long j5) {
        this.f204728a = j;
        this.f204729b = j2;
        this.f204730c = j3;
        this.f204731d = j4;
        this.f204732e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s1k)) {
            return false;
        }
        s1k s1kVar = (s1k) obj;
        long j = s1kVar.f204728a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f204728a, j) && as91.m27074b(this.f204729b, s1kVar.f204729b) && as91.m27074b(this.f204730c, s1kVar.f204730c) && as91.m27074b(this.f204731d, s1kVar.f204731d) && as91.m27074b(this.f204732e, s1kVar.f204732e);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f204732e) + dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f204728a) * 31, this.f204729b, 31), this.f204730c, 31), this.f204731d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        y8a0.m93103h(this.f204728a, ", textColor=", sb);
        y8a0.m93103h(this.f204729b, ", iconColor=", sb);
        y8a0.m93103h(this.f204730c, ", disabledTextColor=", sb);
        y8a0.m93103h(this.f204731d, ", disabledIconColor=", sb);
        sb.append((Object) n6f.m63771h(this.f204732e));
        sb.append(')');
        return sb.toString();
    }
}
