package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iui0 implements uw40 {
    @Override // p204p.uw40
    /* JADX INFO: renamed from: i */
    public final void mo33950i(t571 t571Var) {
        z2n0 z2n0Var = t571Var.f217234c;
        String string = z2n0Var.toString();
        int iCharCount = 0;
        if (string.codePointCount(0, string.length()) > 20) {
            for (int i = 0; iCharCount < string.length() && i < 20; i++) {
                iCharCount += Character.charCount(string.codePointAt(iCharCount));
            }
            t571Var.m80101j(iCharCount, z2n0Var.length(), "");
        }
    }
}
