package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kf81 {

    /* JADX INFO: renamed from: f */
    public static final String f122097f;

    /* JADX INFO: renamed from: g */
    public static final String f122098g;

    /* JADX INFO: renamed from: a */
    public final int f122099a;

    /* JADX INFO: renamed from: b */
    public final String f122100b;

    /* JADX INFO: renamed from: c */
    public final int f122101c;

    /* JADX INFO: renamed from: d */
    public final r300[] f122102d;

    /* JADX INFO: renamed from: e */
    public int f122103e;

    static {
        String str = h0b1.f86200a;
        f122097f = Integer.toString(0, 36);
        f122098g = Integer.toString(1, 36);
    }

    public kf81(r300... r300VarArr) {
        this("", r300VarArr);
    }

    /* JADX INFO: renamed from: a */
    public static kf81 m56252a(Bundle bundle) {
        wsv0 wsv0VarM48368n;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f122097f);
        if (parcelableArrayList == null) {
            kf40 kf40Var = pf40.f176960b;
            wsv0VarM48368n = wsv0.f254763e;
        } else {
            wsv0VarM48368n = hra.m48368n(parcelableArrayList, new qg9(22));
        }
        return new kf81(bundle.getString(f122098g, ""), (r300[]) wsv0VarM48368n.toArray(new r300[0]));
    }

    /* JADX INFO: renamed from: c */
    public static void m56253c(String str, String str2, int i, String str3) {
        StringBuilder sbM38573v = edb.m38573v("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM38573v.append(str3);
        sbM38573v.append("' (track ");
        sbM38573v.append(i);
        sbM38573v.append(")");
        yif1.m93810s("", new IllegalStateException(sbM38573v.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final int m56254b(r300 r300Var) {
        int i = 0;
        while (true) {
            r300[] r300VarArr = this.f122102d;
            if (i >= r300VarArr.length) {
                return -1;
            }
            if (r300Var == r300VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m56255d() {
        Bundle bundle = new Bundle();
        r300[] r300VarArr = this.f122102d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(r300VarArr.length);
        for (r300 r300Var : r300VarArr) {
            List list = r300Var.f195390s;
            Bundle bundle2 = new Bundle();
            bundle2.putString(r300.f195321W, r300Var.f195372a);
            bundle2.putString(r300.f195322X, r300Var.f195373b);
            String str = r300.f195310B0;
            pf40<ee70> pf40Var = r300Var.f195374c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(pf40Var.size());
            for (ee70 ee70Var : pf40Var) {
                ee70Var.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = ee70Var.f58700a;
                if (str2 != null) {
                    bundle3.putString(ee70.f58698c, str2);
                }
                bundle3.putString(ee70.f58699d, ee70Var.f58701b);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(r300.f195323Y, r300Var.f195375d);
            bundle2.putInt(r300.f195324Z, r300Var.f195376e);
            bundle2.putInt(r300.f195325a0, r300Var.f195377f);
            bundle2.putFloat(r300.f195319K0, r300Var.f195378g);
            int i = r300Var.f195379h;
            if (i != r300.f195320V.f195379h) {
                bundle2.putInt(r300.f195311C0, i);
            }
            bundle2.putInt(r300.f195326b0, r300Var.f195380i);
            bundle2.putInt(r300.f195327c0, r300Var.f195381j);
            bundle2.putString(r300.f195328d0, r300Var.f195383l);
            String str3 = r300Var.f195385n;
            if (str3 != null) {
                bundle2.putString(r300.f195315G0, str3);
            }
            bundle2.putString(r300.f195329e0, r300Var.f195386o);
            bundle2.putString(r300.f195330f0, r300Var.f195387p);
            bundle2.putInt(r300.f195331g0, r300Var.f195388q);
            for (int i2 = 0; i2 < list.size(); i2++) {
                bundle2.putByteArray(r300.f195332h0 + "_" + Integer.toString(i2, 36), (byte[]) list.get(i2));
            }
            bundle2.putParcelable(r300.f195333i0, r300Var.f195391t);
            bundle2.putLong(r300.f195334j0, r300Var.f195392u);
            bundle2.putInt(r300.f195335k0, r300Var.f195394w);
            bundle2.putInt(r300.f195336l0, r300Var.f195395x);
            bundle2.putInt(r300.f195318J0, r300Var.f195396y);
            bundle2.putInt(r300.f195313E0, r300Var.f195397z);
            bundle2.putInt(r300.f195314F0, r300Var.f195351A);
            bundle2.putFloat(r300.f195337m0, r300Var.f195352B);
            bundle2.putInt(r300.f195338n0, r300Var.f195353C);
            bundle2.putBoolean(r300.f195317I0, r300Var.f195354D);
            bundle2.putFloat(r300.f195339o0, r300Var.f195355E);
            bundle2.putByteArray(r300.f195340p0, r300Var.f195356F);
            bundle2.putInt(r300.f195341q0, r300Var.f195357G);
            p7f p7fVar = r300Var.f195358H;
            if (p7fVar != null) {
                String str4 = r300.f195342r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(p7f.f174669j, p7fVar.f174675a);
                bundle4.putInt(p7f.f174670k, p7fVar.f174676b);
                bundle4.putInt(p7f.f174671l, p7fVar.f174677c);
                bundle4.putByteArray(p7f.f174672m, p7fVar.f174678d);
                bundle4.putInt(p7f.f174673n, p7fVar.f174679e);
                bundle4.putInt(p7f.f174674o, p7fVar.f174680f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(r300.f195312D0, r300Var.f195359I);
            bundle2.putInt(r300.f195343s0, r300Var.f195360J);
            bundle2.putInt(r300.f195316H0, r300Var.f195361K);
            bundle2.putInt(r300.f195344t0, r300Var.f195362L);
            bundle2.putInt(r300.f195345u0, r300Var.f195363M);
            bundle2.putInt(r300.f195346v0, r300Var.f195364N);
            bundle2.putInt(r300.f195347w0, r300Var.f195365O);
            bundle2.putInt(r300.f195348x0, r300Var.f195366P);
            bundle2.putInt(r300.f195350z0, r300Var.f195368R);
            bundle2.putInt(r300.f195309A0, r300Var.f195369S);
            bundle2.putInt(r300.f195349y0, r300Var.f195370T);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f122097f, arrayList);
        bundle.putString(f122098g, this.f122100b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kf81.class == obj.getClass()) {
            kf81 kf81Var = (kf81) obj;
            if (this.f122100b.equals(kf81Var.f122100b) && Arrays.equals(this.f122102d, kf81Var.f122102d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f122103e == 0) {
            this.f122103e = Arrays.hashCode(this.f122102d) + s571.m77243b(527, 31, this.f122100b);
        }
        return this.f122103e;
    }

    public final String toString() {
        return this.f122100b + ": " + Arrays.toString(this.f122102d);
    }

    public kf81(String str, r300... r300VarArr) {
        c95.m31843i(r300VarArr.length > 0);
        this.f122100b = str;
        this.f122102d = r300VarArr;
        this.f122099a = r300VarArr.length;
        String str2 = r300VarArr[0].f195387p;
        this.f122101c = TextUtils.isEmpty(str2) ? def0.m35792i(r300VarArr[0].f195386o) : def0.m35792i(str2);
        String str3 = r300VarArr[0].f195375d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = r300VarArr[0].f195377f | 16384;
        for (int i2 = 1; i2 < r300VarArr.length; i2++) {
            String str4 = r300VarArr[i2].f195375d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                m56253c("languages", r300VarArr[0].f195375d, i2, r300VarArr[i2].f195375d);
                return;
            } else {
                if (i != (r300VarArr[i2].f195377f | 16384)) {
                    m56253c("role flags", Integer.toBinaryString(r300VarArr[0].f195377f), i2, Integer.toBinaryString(r300VarArr[i2].f195377f));
                    return;
                }
            }
        }
    }
}
