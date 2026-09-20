package p204p;

/* JADX INFO: renamed from: p.e1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1798e1 implements InterfaceC1844f1 {

    /* JADX INFO: renamed from: a */
    public final String f55072a;

    /* JADX INFO: renamed from: b */
    public final EnumC1688b1 f55073b;

    public C1798e1(String str, EnumC1688b1 enumC1688b1) {
        this.f55072a = str;
        this.f55073b = enumC1688b1;
    }

    @Override // p204p.InterfaceC1844f1
    /* JADX INFO: renamed from: a */
    public final EnumC1688b1 mo34573a() {
        return this.f55073b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1798e1)) {
            return false;
        }
        C1798e1 c1798e1 = (C1798e1) obj;
        return wj50.m88271j(this.f55072a, c1798e1.f55072a) && this.f55073b == c1798e1.f55073b;
    }

    public final int hashCode() {
        return this.f55073b.hashCode() + (this.f55072a.hashCode() * 31);
    }
}
