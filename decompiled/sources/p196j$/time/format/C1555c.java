package p196j$.time.format;

/* JADX INFO: renamed from: j$.time.format.c */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1555c implements InterfaceC1557e {

    /* JADX INFO: renamed from: a */
    public final char f10711a;

    public C1555c(char c) {
        this.f10711a = c;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public final int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.f10711a;
        return (cCharAt == c || (!c1570r.f10753b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    public final boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        sb.append(this.f10711a);
        return true;
    }

    public final String toString() {
        char c = this.f10711a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
