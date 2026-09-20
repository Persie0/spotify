package p204p;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class iwh0 {

    /* JADX INFO: renamed from: m */
    public static final HashMap f106445m = kkc0.m56693f0(new pqm0("embedding.weight", "embed.weight"), new pqm0("dense1.weight", "fc1.weight"), new pqm0("dense2.weight", "fc2.weight"), new pqm0("dense3.weight", "fc3.weight"), new pqm0("dense1.bias", "fc1.bias"), new pqm0("dense2.bias", "fc2.bias"), new pqm0("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a */
    public final hrb0 f106446a;

    /* JADX INFO: renamed from: b */
    public final hrb0 f106447b;

    /* JADX INFO: renamed from: c */
    public final hrb0 f106448c;

    /* JADX INFO: renamed from: d */
    public final hrb0 f106449d;

    /* JADX INFO: renamed from: e */
    public final hrb0 f106450e;

    /* JADX INFO: renamed from: f */
    public final hrb0 f106451f;

    /* JADX INFO: renamed from: g */
    public final hrb0 f106452g;

    /* JADX INFO: renamed from: h */
    public final hrb0 f106453h;

    /* JADX INFO: renamed from: i */
    public final hrb0 f106454i;

    /* JADX INFO: renamed from: j */
    public final hrb0 f106455j;

    /* JADX INFO: renamed from: k */
    public final hrb0 f106456k;

    /* JADX INFO: renamed from: l */
    public final HashMap f106457l;

    public iwh0(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106446a = (hrb0) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106447b = grl0.m45522R((hrb0) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106448c = grl0.m45522R((hrb0) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106449d = grl0.m45522R((hrb0) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106450e = (hrb0) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106451f = (hrb0) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106452g = (hrb0) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106453h = grl0.m45521Q((hrb0) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106454i = grl0.m45521Q((hrb0) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106455j = (hrb0) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106456k = (hrb0) obj11;
        this.f106457l = new HashMap();
        for (String str : bk5.m29624m1(new String[]{rkh0.m75728b(1), rkh0.m75728b(2)})) {
            String strM77250i = s571.m77250i(str, ".weight");
            String strM77250i2 = s571.m77250i(str, ".bias");
            hrb0 hrb0Var = (hrb0) map.get(strM77250i);
            hrb0 hrb0Var2 = (hrb0) map.get(strM77250i2);
            if (hrb0Var != null) {
                this.f106457l.put(strM77250i, grl0.m45521Q(hrb0Var));
            }
            if (hrb0Var2 != null) {
                this.f106457l.put(strM77250i2, hrb0Var2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final hrb0 m51837a(hrb0 hrb0Var, String[] strArr, String str) {
        HashMap map = this.f106457l;
        Set set = p2l.f173365a;
        if (!set.contains(this)) {
            try {
                hrb0 hrb0VarM45544q = grl0.m45544q(grl0.m45548u(strArr, this.f106446a), this.f106447b);
                grl0.m45537j(hrb0VarM45544q, this.f106450e);
                grl0.m45517M(hrb0VarM45544q);
                hrb0 hrb0VarM45544q2 = grl0.m45544q(hrb0VarM45544q, this.f106448c);
                grl0.m45537j(hrb0VarM45544q2, this.f106451f);
                grl0.m45517M(hrb0VarM45544q2);
                hrb0 hrb0VarM45553z = grl0.m45553z(hrb0VarM45544q2, 2);
                hrb0 hrb0VarM45544q3 = grl0.m45544q(hrb0VarM45553z, this.f106449d);
                grl0.m45537j(hrb0VarM45544q3, this.f106452g);
                grl0.m45517M(hrb0VarM45544q3);
                hrb0 hrb0VarM45553z2 = grl0.m45553z(hrb0VarM45544q, hrb0VarM45544q.f94389a[1]);
                hrb0 hrb0VarM45553z3 = grl0.m45553z(hrb0VarM45553z, hrb0VarM45553z.f94389a[1]);
                hrb0 hrb0VarM45553z4 = grl0.m45553z(hrb0VarM45544q3, hrb0VarM45544q3.f94389a[1]);
                grl0.m45549v(hrb0VarM45553z2);
                grl0.m45549v(hrb0VarM45553z3);
                grl0.m45549v(hrb0VarM45553z4);
                hrb0 hrb0VarM45547t = grl0.m45547t(grl0.m45543p(new hrb0[]{hrb0VarM45553z2, hrb0VarM45553z3, hrb0VarM45553z4, hrb0Var}), this.f106453h, this.f106455j);
                grl0.m45517M(hrb0VarM45547t);
                hrb0 hrb0VarM45547t2 = grl0.m45547t(hrb0VarM45547t, this.f106454i, this.f106456k);
                grl0.m45517M(hrb0VarM45547t2);
                hrb0 hrb0Var2 = (hrb0) map.get(str.concat(".weight"));
                hrb0 hrb0Var3 = (hrb0) map.get(str.concat(".bias"));
                if (hrb0Var2 != null && hrb0Var3 != null) {
                    hrb0 hrb0VarM45547t3 = grl0.m45547t(hrb0VarM45547t2, hrb0Var2, hrb0Var3);
                    if (!set.contains(grl0.class)) {
                        try {
                            int[] iArr = hrb0VarM45547t3.f94389a;
                            int i = iArr[0];
                            int i2 = iArr[1];
                            float[] fArr = hrb0VarM45547t3.f94391c;
                            for (int i3 = 0; i3 < i; i3++) {
                                int i4 = i3 * i2;
                                int i5 = i4 + i2;
                                float f = Float.MIN_VALUE;
                                for (int i6 = i4; i6 < i5; i6++) {
                                    float f2 = fArr[i6];
                                    if (f2 > f) {
                                        f = f2;
                                    }
                                }
                                float f3 = 0.0f;
                                for (int i7 = i4; i7 < i5; i7++) {
                                    float fExp = (float) Math.exp(fArr[i7] - f);
                                    fArr[i7] = fExp;
                                    f3 += fExp;
                                }
                                while (i4 < i5) {
                                    fArr[i4] = fArr[i4] / f3;
                                    i4++;
                                }
                            }
                        } catch (Throwable th) {
                            p2l.m68953a(grl0.class, th);
                        }
                    }
                    return hrb0VarM45547t3;
                }
            } catch (Throwable th2) {
                p2l.m68953a(this, th2);
                return null;
            }
        }
        return null;
    }
}
