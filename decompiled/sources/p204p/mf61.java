package p204p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes4.dex */
public class mf61 {

    /* JADX INFO: renamed from: i */
    public static final mf61[] f142968i = {new mf61(false, 3, 5, 8, 8, 1, 3, 5), new mf61(false, 5, 7, 10, 10, 1, 5, 7), new mf61(true, 5, 7, 16, 6, 1, 5, 7), new mf61(false, 8, 10, 12, 12, 1, 8, 10), new mf61(true, 10, 11, 14, 6, 2, 10, 11), new mf61(false, 12, 12, 14, 14, 1, 12, 12), new mf61(true, 16, 14, 24, 10, 1, 16, 14), new mf61(false, 18, 14, 16, 16, 1, 18, 14), new mf61(false, 22, 18, 18, 18, 1, 22, 18), new mf61(true, 22, 18, 16, 10, 2, 22, 18), new mf61(false, 30, 20, 20, 20, 1, 30, 20), new mf61(true, 32, 24, 16, 14, 2, 32, 24), new mf61(false, 36, 24, 22, 22, 1, 36, 24), new mf61(false, 44, 28, 24, 24, 1, 44, 28), new mf61(true, 49, 28, 22, 14, 2, 49, 28), new mf61(false, 62, 36, 14, 14, 4, 62, 36), new mf61(false, 86, 42, 16, 16, 4, 86, 42), new mf61(false, 114, 48, 18, 18, 4, 114, 48), new mf61(false, 144, 56, 20, 20, 4, 144, 56), new mf61(false, 174, 68, 22, 22, 4, 174, 68), new mf61(false, 204, 84, 24, 24, 4, 102, 42), new mf61(false, 280, ContentType.LONG_FORM_ON_DEMAND, 14, 14, 16, 140, 56), new mf61(false, 368, 144, 16, 16, 16, 92, 36), new mf61(false, 456, 192, 18, 18, 16, 114, 48), new mf61(false, 576, 224, 20, 20, 16, 144, 56), new mf61(false, 696, 272, 22, 22, 16, 174, 68), new mf61(false, 816, 336, 24, 24, 16, 136, 56), new mf61(false, 1050, 408, 18, 18, 36, 175, 68), new mf61(false, 1304, 496, 20, 20, 36, 163, 62), new jgo(false, 1558, 620, 22, 22, 36, -1, 62)};

    /* JADX INFO: renamed from: a */
    public final boolean f142969a;

    /* JADX INFO: renamed from: b */
    public final int f142970b;

    /* JADX INFO: renamed from: c */
    public final int f142971c;

    /* JADX INFO: renamed from: d */
    public final int f142972d;

    /* JADX INFO: renamed from: e */
    public final int f142973e;

    /* JADX INFO: renamed from: f */
    public final int f142974f;

    /* JADX INFO: renamed from: g */
    public final int f142975g;

    /* JADX INFO: renamed from: h */
    public final int f142976h;

    public mf61(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f142969a = z;
        this.f142970b = i;
        this.f142971c = i2;
        this.f142972d = i3;
        this.f142973e = i4;
        this.f142974f = i5;
        this.f142975g = i6;
        this.f142976h = i7;
    }

    /* JADX INFO: renamed from: e */
    public static mf61 m61614e(int i, nf61 nf61Var) {
        for (int i2 = 0; i2 < 30; i2++) {
            mf61 mf61Var = f142968i[i2];
            if (!(nf61Var == nf61.f153258b && mf61Var.f142969a) && ((nf61Var != nf61.f153259c || mf61Var.f142969a) && i <= mf61Var.f142970b)) {
                return mf61Var;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* JADX INFO: renamed from: a */
    public int mo53306a(int i) {
        return this.f142975g;
    }

    /* JADX INFO: renamed from: b */
    public final int m61615b() {
        int i = this.f142974f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public int mo53307c() {
        return this.f142970b / this.f142975g;
    }

    /* JADX INFO: renamed from: d */
    public final int m61616d() {
        int i = this.f142974f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f142969a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        int i = this.f142972d;
        sb.append(i);
        sb.append('x');
        int i2 = this.f142973e;
        sb.append(i2);
        sb.append(", symbol size ");
        sb.append((m61615b() * i) + (m61615b() << 1));
        sb.append('x');
        sb.append((m61616d() * i2) + (m61616d() << 1));
        sb.append(", symbol data size ");
        sb.append(m61615b() * i);
        sb.append('x');
        sb.append(m61616d() * i2);
        sb.append(", codewords ");
        sb.append(this.f142970b);
        sb.append('+');
        sb.append(this.f142971c);
        return sb.toString();
    }
}
