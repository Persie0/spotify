package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i5u0 extends j5u0 implements wfq0 {

    /* JADX INFO: renamed from: c */
    public static final i5u0 f99026c = new i5u0(fdm.f68520b, ddm.f47842b);

    /* JADX INFO: renamed from: a */
    public final hdm f99027a;

    /* JADX INFO: renamed from: b */
    public final hdm f99028b;

    public i5u0(hdm hdmVar, hdm hdmVar2) {
        this.f99027a = hdmVar;
        this.f99028b = hdmVar2;
        if (hdmVar.compareTo(hdmVar2) > 0 || hdmVar == ddm.f47842b || hdmVar2 == fdm.f68520b) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            hdmVar.mo35749b(sb2);
            sb2.append("..");
            hdmVar2.mo35750c(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static i5u0 m49781b(Long l, Long l2) {
        return new i5u0(new gdm(l), new edm(l2));
    }

    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.f99027a.mo35752e(comparable) && !this.f99028b.mo35752e(comparable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i5u0) {
            i5u0 i5u0Var = (i5u0) obj;
            if (this.f99027a.equals(i5u0Var.f99027a) && this.f99028b.equals(i5u0Var.f99028b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f99028b.hashCode() + (this.f99027a.hashCode() * 31);
    }

    public Object readResolve() {
        i5u0 i5u0Var = f99026c;
        return equals(i5u0Var) ? i5u0Var : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f99027a.mo35749b(sb);
        sb.append("..");
        this.f99028b.mo35750c(sb);
        return sb.toString();
    }
}
