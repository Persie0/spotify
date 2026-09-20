package p204p;

/* JADX INFO: renamed from: p.kf */
/* JADX INFO: loaded from: classes3.dex */
public final class C2050kf extends AbstractC1895gf {

    /* JADX INFO: renamed from: c */
    public static C2050kf f121998c;

    @Override // p204p.AbstractC1895gf
    /* JADX INFO: renamed from: e */
    public final int[] mo44549e(int i) {
        int length = m44556l().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m44556l().charAt(i) == '\n' && (m44556l().charAt(i) == '\n' || (i != 0 && m44556l().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m56245t(i2)) {
            i2++;
        }
        return m44555k(i, i2);
    }

    @Override // p204p.AbstractC1895gf
    /* JADX INFO: renamed from: q */
    public final int[] mo44560q(int i) {
        int length = m44556l().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m44556l().charAt(i - 1) == '\n' && !m56245t(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m44556l().charAt(i2) == '\n' || (i2 != 0 && m44556l().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return m44555k(i2, i);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m56245t(int i) {
        if (i <= 0 || m44556l().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m44556l().length() || m44556l().charAt(i) == '\n';
    }
}
