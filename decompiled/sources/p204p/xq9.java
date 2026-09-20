package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xq9 extends AbstractC2601y5 {

    /* JADX INFO: renamed from: a */
    public final vq9 f264925a = new vq9();

    /* JADX INFO: renamed from: k */
    public static boolean m91821k(m1s m1sVar, int i) {
        CharSequence charSequence = m1sVar.f139063a.f126444a;
        return m1sVar.f139070h < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: f */
    public final gq9 mo30336f() {
        return this.f264925a;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: j */
    public final lwe mo30337j(m1s m1sVar) {
        char cCharAt;
        int i = m1sVar.f139068f;
        if (!m91821k(m1sVar, i)) {
            return null;
        }
        int i2 = m1sVar.f139066d + m1sVar.f139070h;
        int i3 = i2 + 1;
        CharSequence charSequence = m1sVar.f139063a.f126444a;
        int i4 = i + 1;
        if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new lwe(-1, i3, false);
    }
}
