package p204p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ihp implements f5y {

    /* JADX INFO: renamed from: a */
    public int f102334a;

    /* JADX INFO: renamed from: b */
    public int f102335b;

    /* JADX INFO: renamed from: c */
    public wsv0 f102336c;

    /* JADX INFO: renamed from: g */
    public int f102340g;

    /* JADX INFO: renamed from: h */
    public int f102341h;

    /* JADX INFO: renamed from: i */
    public static final int[] f102332i = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t */
    public static final p7o f102333t = new p7o(new wwo(19));

    /* JADX INFO: renamed from: X */
    public static final p7o f102331X = new p7o(new wwo(20));

    /* JADX INFO: renamed from: e */
    public t46 f102338e = new t46(8);

    /* JADX INFO: renamed from: d */
    public boolean f102337d = true;

    /* JADX INFO: renamed from: f */
    public int f102339f = 3;

    @Override // p204p.f5y
    /* JADX INFO: renamed from: a */
    public final synchronized c5y[] mo40789a(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f102332i;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iM54074t = jq60.m54074t((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iM54074t != -1) {
                m50669b(iM54074t, arrayList);
            }
            int iM54075u = jq60.m54075u(uri);
            if (iM54075u != -1 && iM54075u != iM54074t) {
                m50669b(iM54075u, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iM54074t && i2 != iM54075u) {
                    m50669b(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (c5y[]) arrayList.toArray(new c5y[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m50669b(int i, ArrayList arrayList) {
        int i2 = 0;
        switch (i) {
            case 0:
                arrayList.add(new C2008ja());
                break;
            case 1:
                arrayList.add(new C2083la());
                break;
            case 2:
                arrayList.add(new c22(this.f102334a));
                break;
            case 3:
                arrayList.add(new fp3(this.f102335b));
                break;
            case 4:
                c5y c5yVarM69287f = f102333t.m69287f(0);
                if (c5yVarM69287f == null) {
                    arrayList.add(new sez());
                } else {
                    arrayList.add(c5yVarM69287f);
                }
                break;
            case 5:
                arrayList.add(new onz());
                break;
            case 6:
                arrayList.add(new y3d0(this.f102338e, this.f102337d ? 0 : 2));
                break;
            case 7:
                arrayList.add(new d4i0(0));
                break;
            case 8:
                t46 t46Var = this.f102338e;
                int iM35297f = d900.m35297f(this.f102339f) | 512 | (this.f102337d ? 0 : 32);
                kf40 kf40Var = pf40.f176960b;
                arrayList.add(new d900(t46Var, iM35297f, null, wsv0.f254763e));
                t46 t46Var2 = this.f102338e;
                int i3 = this.f102339f;
                int i4 = (i3 & 1) == 0 ? 0 : 32;
                if ((2 & i3) != 0) {
                    i4 |= 128;
                }
                arrayList.add(new l4i0(t46Var2, 0 | i4 | (this.f102337d ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new o4l0());
                break;
            case 10:
                arrayList.add(new z4t0());
                break;
            case 11:
                if (this.f102336c == null) {
                    kf40 kf40Var2 = pf40.f176960b;
                    this.f102336c = wsv0.f254763e;
                }
                arrayList.add(new ml91(1, !this.f102337d ? 1 : 0, this.f102338e, new qu71(0L), new lfq(i2, this.f102336c)));
                break;
            case 12:
                arrayList.add(new xgd1());
                break;
            case 14:
                arrayList.add(new zp20(this.f102340g, 1));
                break;
            case 15:
                c5y c5yVarM69287f2 = f102331X.m69287f(new Object[0]);
                if (c5yVarM69287f2 != null) {
                    arrayList.add(c5yVarM69287f2);
                }
                break;
            case 16:
                arrayList.add(new ta8(!this.f102337d ? 1 : 0, this.f102338e));
                break;
            case 17:
                arrayList.add(new x3a(1));
                break;
            case 18:
                arrayList.add(new wa8(1));
                break;
            case 19:
                arrayList.add(new x3a(0));
                break;
            case 20:
                arrayList.add(new zp20(this.f102341h, 0));
                break;
            case 21:
                arrayList.add(new wa8(0));
                break;
        }
    }

    @Override // p204p.f5y
    /* JADX INFO: renamed from: g */
    public final synchronized c5y[] mo25402g() {
        return mo40789a(Uri.EMPTY, new HashMap());
    }
}
