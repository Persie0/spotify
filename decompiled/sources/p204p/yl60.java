package p204p;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class yl60 implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final String[] f273920e = new String[128];

    /* JADX INFO: renamed from: a */
    public int f273921a;

    /* JADX INFO: renamed from: b */
    public int[] f273922b;

    /* JADX INFO: renamed from: c */
    public String[] f273923c;

    /* JADX INFO: renamed from: d */
    public int[] f273924d;

    static {
        for (int i = 0; i <= 31; i++) {
            f273920e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f273920e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo53759a();

    /* JADX INFO: renamed from: c */
    public abstract void mo53760c();

    /* JADX INFO: renamed from: e */
    public abstract void mo53761e();

    /* JADX INFO: renamed from: f */
    public abstract void mo53762f();

    /* JADX INFO: renamed from: g */
    public final String m94153g() {
        return ipg1.m51275m(this.f273921a, this.f273922b, this.f273923c, this.f273924d);
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo53763h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo53764i();

    /* JADX INFO: renamed from: k */
    public abstract double mo53765k();

    /* JADX INFO: renamed from: n */
    public abstract int mo53766n();

    /* JADX INFO: renamed from: o */
    public abstract String mo53767o();

    /* JADX INFO: renamed from: p */
    public abstract int mo53768p();

    /* JADX INFO: renamed from: r */
    public final void m94154r(int i) {
        int i2 = this.f273921a;
        int[] iArr = this.f273922b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new scf("Nesting too deep at " + m94153g());
            }
            this.f273922b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f273923c;
            this.f273923c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f273924d;
            this.f273924d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f273922b;
        int i3 = this.f273921a;
        this.f273921a = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: s */
    public abstract int mo53769s(po10 po10Var);

    /* JADX INFO: renamed from: t */
    public abstract void mo53770t();

    /* JADX INFO: renamed from: x */
    public abstract void mo53771x();

    /* JADX INFO: renamed from: y */
    public final void m94155y(String str) throws el60 {
        StringBuilder sbM75191i = rbz.m75191i(str, " at path ");
        sbM75191i.append(m94153g());
        throw new el60(sbM75191i.toString());
    }
}
