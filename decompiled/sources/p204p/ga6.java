package p204p;

import android.util.Rational;
import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ga6 {

    /* JADX INFO: renamed from: a */
    public static final Rational f77978a = new Rational(4, 3);

    /* JADX INFO: renamed from: b */
    public static final Rational f77979b = new Rational(3, 4);

    /* JADX INFO: renamed from: c */
    public static final Rational f77980c = new Rational(16, 9);

    /* JADX INFO: renamed from: d */
    public static final Rational f77981d = new Rational(9, 16);

    /* JADX INFO: renamed from: a */
    public static boolean m44145a(Rational rational, Size size) {
        Size size2 = vi21.f241603b;
        if (rational != null) {
            if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                return true;
            }
            if (size.getHeight() * size.getWidth() >= vi21.m85581a(size2)) {
                int width = size.getWidth();
                int height = size.getHeight();
                Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                int i = width % 16;
                if (i == 0 && height % 16 == 0) {
                    if (m44146b(Math.max(0, height - 16), width, rational) || m44146b(Math.max(0, width - 16), height, rational2)) {
                        return true;
                    }
                } else {
                    if (i == 0) {
                        return m44146b(height, width, rational);
                    }
                    if (height % 16 == 0) {
                        return m44146b(width, height, rational2);
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44146b(int i, int i2, Rational rational) {
        wj50.m88276m(i2 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
