package p204p;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c1i0 implements Comparable {

    /* JADX INFO: renamed from: c */
    public int f33136c;

    /* JADX INFO: renamed from: a */
    public float f33134a = 0.0f;

    /* JADX INFO: renamed from: b */
    public int f33135b = 0;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f33137d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public float f33138e = 1.0f;

    /* JADX INFO: renamed from: f */
    public float f33139f = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f33140g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f33141h = 0.0f;

    /* JADX INFO: renamed from: i */
    public float f33142i = 1.0f;

    /* JADX INFO: renamed from: t */
    public float f33143t = 1.0f;

    /* JADX INFO: renamed from: X */
    public float f33131X = Float.NaN;

    /* JADX INFO: renamed from: Y */
    public float f33132Y = Float.NaN;

    /* JADX INFO: renamed from: Z */
    public float f33133Z = 0.0f;

    /* JADX INFO: renamed from: L0 */
    public float f33127L0 = 0.0f;

    /* JADX INFO: renamed from: M0 */
    public float f33128M0 = 0.0f;

    /* JADX INFO: renamed from: N0 */
    public float f33129N0 = Float.NaN;

    /* JADX INFO: renamed from: O0 */
    public float f33130O0 = Float.NaN;

    /* JADX INFO: renamed from: b */
    public static boolean m31264b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m31265a(HashMap map, int i) {
        for (String str : map.keySet()) {
            mlc1 mlc1Var = (mlc1) map.get(str);
            if (mlc1Var != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        mlc1Var.mo53671b(Float.isNaN(this.f33141h) ? 0.0f : this.f33141h, i);
                        break;
                    case 1:
                        mlc1Var.mo53671b(Float.isNaN(this.f33134a) ? 0.0f : this.f33134a, i);
                        break;
                    case 2:
                        mlc1Var.mo53671b(Float.isNaN(this.f33133Z) ? 0.0f : this.f33133Z, i);
                        break;
                    case 3:
                        mlc1Var.mo53671b(Float.isNaN(this.f33127L0) ? 0.0f : this.f33127L0, i);
                        break;
                    case 4:
                        mlc1Var.mo53671b(Float.isNaN(this.f33128M0) ? 0.0f : this.f33128M0, i);
                        break;
                    case 5:
                        mlc1Var.mo53671b(Float.isNaN(this.f33130O0) ? 0.0f : this.f33130O0, i);
                        break;
                    case 6:
                        mlc1Var.mo53671b(Float.isNaN(this.f33142i) ? 1.0f : this.f33142i, i);
                        break;
                    case 7:
                        mlc1Var.mo53671b(Float.isNaN(this.f33143t) ? 1.0f : this.f33143t, i);
                        break;
                    case 8:
                        mlc1Var.mo53671b(Float.isNaN(this.f33131X) ? 0.0f : this.f33131X, i);
                        break;
                    case 9:
                        mlc1Var.mo53671b(Float.isNaN(this.f33132Y) ? 0.0f : this.f33132Y, i);
                        break;
                    case 10:
                        mlc1Var.mo53671b(Float.isNaN(this.f33140g) ? 0.0f : this.f33140g, i);
                        break;
                    case 11:
                        mlc1Var.mo53671b(Float.isNaN(this.f33139f) ? 0.0f : this.f33139f, i);
                        break;
                    case 12:
                        mlc1Var.mo53671b(Float.isNaN(this.f33129N0) ? 0.0f : this.f33129N0, i);
                        break;
                    case 13:
                        mlc1Var.mo53671b(Float.isNaN(this.f33138e) ? 1.0f : this.f33138e, i);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.f33137d;
                            if (linkedHashMap.containsKey(str2)) {
                                d6j d6jVar = (d6j) linkedHashMap.get(str2);
                                if (mlc1Var instanceof jlc1) {
                                    ((jlc1) mlc1Var).f113581f.append(i, d6jVar);
                                } else {
                                    d6jVar.m35118b();
                                    mlc1Var.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m31266c(Rect rect, c7j c7jVar, int i, int i2) {
        rect.width();
        rect.height();
        x6j x6jVarM31740l = c7jVar.m31740l(i2);
        a7j a7jVar = x6jVarM31740l.f258684c;
        z6j z6jVar = x6jVarM31740l.f258685d;
        int i3 = a7jVar.f13062c;
        this.f33135b = i3;
        int i4 = a7jVar.f13061b;
        this.f33136c = i4;
        this.f33138e = (i4 == 0 || i3 != 0) ? a7jVar.f13063d : 0.0f;
        b7j b7jVar = x6jVarM31740l.f258687f;
        boolean z = b7jVar.f24297m;
        this.f33139f = b7jVar.f24298n;
        this.f33140g = b7jVar.f24286b;
        this.f33141h = b7jVar.f24287c;
        this.f33134a = b7jVar.f24288d;
        this.f33142i = b7jVar.f24289e;
        this.f33143t = b7jVar.f24290f;
        this.f33131X = b7jVar.f24291g;
        this.f33132Y = b7jVar.f24292h;
        this.f33133Z = b7jVar.f24294j;
        this.f33127L0 = b7jVar.f24295k;
        this.f33128M0 = b7jVar.f24296l;
        aqs.m26892e(z6jVar.f279929d);
        this.f33129N0 = z6jVar.f279933h;
        this.f33130O0 = x6jVarM31740l.f258684c.f13064e;
        for (String str : x6jVarM31740l.f258688g.keySet()) {
            d6j d6jVar = (d6j) x6jVarM31740l.f258688g.get(str);
            int iM38547C = edb.m38547C(d6jVar.f45706c);
            if (iM38547C != 4 && iM38547C != 5 && iM38547C != 7) {
                this.f33137d.put(str, d6jVar);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f33140g + 90.0f;
            this.f33140g = f;
            if (f > 180.0f) {
                this.f33140g = f - 360.0f;
                return;
            }
            return;
        }
        this.f33140g -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((c1i0) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
