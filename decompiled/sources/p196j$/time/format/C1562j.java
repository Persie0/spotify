package p196j$.time.format;

/* JADX INFO: renamed from: j$.time.format.j */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1562j extends C1563k {
    @Override // p196j$.time.format.C1563k
    /* JADX INFO: renamed from: b */
    public final boolean mo24074b(char c, char c2) {
        return C1570r.m24093b(c, c2);
    }

    @Override // p196j$.time.format.C1563k
    /* JADX INFO: renamed from: d */
    public final C1563k mo24075d(String str, String str2, C1563k c1563k) {
        return new C1562j(str, str2, c1563k);
    }

    @Override // p196j$.time.format.C1563k
    /* JADX INFO: renamed from: e */
    public final boolean mo24076e(CharSequence charSequence, int i, int i2) {
        int length = this.f10727a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!C1570r.m24093b(this.f10727a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
