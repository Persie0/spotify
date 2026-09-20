package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zz60 {

    /* JADX INFO: renamed from: a */
    public static final po10 f287895a = po10.m70454i("k");

    /* JADX INFO: renamed from: a */
    public static ArrayList m97272a(yl60 yl60Var, u8b0 u8b0Var, float f, t3b1 t3b1Var, boolean z) {
        yl60 yl60Var2;
        u8b0 u8b0Var2;
        float f2;
        t3b1 t3b1Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (yl60Var.mo53768p() == 6) {
            u8b0Var.m82566a("Lottie doesn't support expressions.");
            return arrayList;
        }
        yl60Var.mo53760c();
        while (yl60Var.mo53763h()) {
            if (yl60Var.mo53769s(f287895a) != 0) {
                yl60Var.mo53771x();
            } else if (yl60Var.mo53768p() == 1) {
                yl60Var.mo53759a();
                if (yl60Var.mo53768p() == 7) {
                    yl60 yl60Var3 = yl60Var;
                    u8b0 u8b0Var3 = u8b0Var;
                    float f3 = f;
                    t3b1 t3b1Var3 = t3b1Var;
                    boolean z3 = z;
                    wz60 wz60VarM94964b = yz60.m94964b(yl60Var3, u8b0Var3, f3, t3b1Var3, false, z3);
                    yl60Var2 = yl60Var3;
                    u8b0Var2 = u8b0Var3;
                    f2 = f3;
                    t3b1Var2 = t3b1Var3;
                    z2 = z3;
                    arrayList.add(wz60VarM94964b);
                } else {
                    yl60Var2 = yl60Var;
                    u8b0Var2 = u8b0Var;
                    f2 = f;
                    t3b1Var2 = t3b1Var;
                    z2 = z;
                    while (yl60Var2.mo53763h()) {
                        arrayList.add(yz60.m94964b(yl60Var2, u8b0Var2, f2, t3b1Var2, true, z2));
                    }
                }
                yl60Var2.mo53761e();
                yl60Var = yl60Var2;
                u8b0Var = u8b0Var2;
                f = f2;
                t3b1Var = t3b1Var2;
                z = z2;
            } else {
                yl60 yl60Var4 = yl60Var;
                arrayList.add(yz60.m94964b(yl60Var4, u8b0Var, f, t3b1Var, false, z));
                yl60Var = yl60Var4;
            }
        }
        yl60Var.mo53762f();
        m97273b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m97273b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            wz60 wz60Var = (wz60) arrayList.get(i2);
            i2++;
            wz60 wz60Var2 = (wz60) arrayList.get(i2);
            wz60Var.f256499h = Float.valueOf(wz60Var2.f256498g);
            if (wz60Var.f256494c == null && (obj = wz60Var2.f256493b) != null) {
                wz60Var.f256494c = obj;
                if (wz60Var instanceof zbn0) {
                    ((zbn0) wz60Var).m95868d();
                }
            }
        }
        wz60 wz60Var3 = (wz60) arrayList.get(i);
        if ((wz60Var3.f256493b == null || wz60Var3.f256494c == null) && arrayList.size() > 1) {
            arrayList.remove(wz60Var3);
        }
    }
}
