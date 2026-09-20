package p196j$.time.format;

/* JADX INFO: renamed from: j$.time.format.m */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1565m implements InterfaceC1557e {

    /* JADX INFO: renamed from: a */
    public final String f10733a;

    public C1565m(String str) {
        this.f10733a = str;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public final int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        if (i > charSequence.length() || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.f10733a;
        return !c1570r.m24099g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    public final boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        sb.append(this.f10733a);
        return true;
    }

    public final String toString() {
        return "'" + this.f10733a.replace("'", "''") + "'";
    }
}
