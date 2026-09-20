package p204p;

import android.os.Handler;
import android.util.SparseIntArray;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e6s {

    /* JADX INFO: renamed from: p */
    public static final meq f56713p;

    /* JADX INFO: renamed from: a */
    public final ofd0 f56714a;

    /* JADX INFO: renamed from: b */
    public final wz8 f56715b;

    /* JADX INFO: renamed from: c */
    public final int f56716c;

    /* JADX INFO: renamed from: d */
    public final req f56717d;

    /* JADX INFO: renamed from: e */
    public final b5p f56718e;

    /* JADX INFO: renamed from: f */
    public final SparseIntArray f56719f;

    /* JADX INFO: renamed from: g */
    public final Handler f56720g;

    /* JADX INFO: renamed from: h */
    public boolean f56721h;

    /* JADX INFO: renamed from: i */
    public boolean f56722i;

    /* JADX INFO: renamed from: j */
    public cdn f56723j;

    /* JADX INFO: renamed from: k */
    public d6s f56724k;

    /* JADX INFO: renamed from: l */
    public lf81[] f56725l;

    /* JADX INFO: renamed from: m */
    public bkc0[] f56726m;

    /* JADX INFO: renamed from: n */
    public List[][] f56727n;

    /* JADX INFO: renamed from: o */
    public List[][] f56728o;

    static {
        meq meqVar = meq.f142797F0;
        meqVar.getClass();
        leq leqVar = new leq(meqVar);
        leqVar.f41211G = true;
        leqVar.f132659N = false;
        f56713p = new meq(leqVar);
    }

    public e6s(ufd0 ufd0Var, wz8 wz8Var, meq meqVar, b5p b5pVar) {
        int i;
        ofd0 ofd0Var = ufd0Var.f229763b;
        ofd0Var.getClass();
        this.f56714a = ofd0Var;
        this.f56715b = wz8Var;
        if (wz8Var == null) {
            i = 0;
        } else {
            i = wz8Var instanceof v8s0 ? 1 : 2;
        }
        this.f56716c = i;
        req reqVar = new req(meqVar, new ti5(9), null);
        this.f56717d = reqVar;
        this.f56718e = b5pVar;
        this.f56719f = new SparseIntArray();
        ori oriVar = new ori(reqVar, 26);
        c95.m31855u(reqVar.f38916a == null);
        reqVar.f38916a = oriVar;
        reqVar.f38917b = at8.f19612l;
        reqVar.f198410g = reqVar.f198409f;
        this.f56720g = h0b1.m46331s(null);
    }

    /* JADX INFO: renamed from: a */
    public static void m37956a(e6s e6sVar) {
        req reqVar = e6sVar.f56717d;
        e6sVar.f56724k.getClass();
        e6sVar.f56724k.f45870t.getClass();
        e6sVar.f56724k.f45868h.getClass();
        int i = e6sVar.f56716c;
        boolean z = false;
        if (i == 2) {
            int length = e6sVar.f56724k.f45870t.length;
            int length2 = ((o09[]) e6sVar.f56718e.f23636b).length;
            e6sVar.f56727n = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
            e6sVar.f56728o = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
            for (int i2 = 0; i2 < length; i2++) {
                for (int i3 = 0; i3 < length2; i3++) {
                    e6sVar.f56727n[i2][i3] = new ArrayList();
                    e6sVar.f56728o[i2][i3] = Collections.unmodifiableList(e6sVar.f56727n[i2][i3]);
                }
            }
            e6sVar.f56725l = new lf81[length];
            e6sVar.f56726m = new bkc0[length];
            for (int i4 = 0; i4 < length; i4++) {
                e6sVar.f56725l[i4] = e6sVar.f56724k.f45870t[i4].mo26789v();
                Object obj = e6sVar.m37961f(i4).f94379f;
                reqVar.getClass();
                bkc0 bkc0Var = (bkc0) obj;
                reqVar.f38918c = bkc0Var;
                bkc0[] bkc0VarArr = e6sVar.f56726m;
                bkc0Var.getClass();
                bkc0VarArr[i4] = bkc0Var;
            }
            e6sVar.f56721h = true;
            e6sVar.f56722i = true;
            z = true;
        } else {
            c95.m31855u(i == 1);
            e6sVar.f56724k.f45869i.getClass();
            e6sVar.f56721h = true;
        }
        Handler handler = e6sVar.f56720g;
        handler.getClass();
        handler.post(new i57(e6sVar, z, 3));
    }

    /* JADX INFO: renamed from: b */
    public final void m37957b(int i, meq meqVar) {
        req reqVar = this.f56717d;
        reqVar.mo33116c(meqVar);
        m37961f(i);
        o3a1 it = meqVar.f52239H.values().iterator();
        while (it.hasNext()) {
            zq81 zq81Var = (zq81) it.next();
            leq leqVar = new leq(meqVar);
            leqVar.mo33729f(zq81Var);
            reqVar.mo33116c(leqVar.mo33726b());
            m37961f(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m37958c() {
        c95.m31855u(this.f56716c == 2);
        c95.m31855u(this.f56721h);
        c95.m31855u(this.f56722i);
    }

    /* JADX INFO: renamed from: d */
    public final int m37959d() {
        int i = this.f56716c;
        if (i == 0) {
            return 0;
        }
        c95.m31855u(i != 0);
        c95.m31855u(this.f56721h);
        return this.f56724k.f45870t.length;
    }

    /* JADX INFO: renamed from: e */
    public final void m37960e() {
        d6s d6sVar = this.f56724k;
        if (d6sVar != null && !d6sVar.f45860X) {
            d6sVar.f45860X = true;
            d6sVar.f45867g.sendEmptyMessage(4);
        }
        this.f56717d.mo33114a();
        for (o09 o09Var : (o09[]) this.f56718e.f23636b) {
            o09Var.m65988H();
        }
    }

    /* JADX INFO: renamed from: f */
    public final hr81 m37961f(int i) {
        hr81 hr81VarM33115b = this.f56717d.m33115b(this.f56718e.m28192p(), this.f56725l[i], new vsd0(this.f56724k.f45868h.mo26653l(i)), this.f56724k.f45868h);
        for (int i2 = 0; i2 < hr81VarM33115b.f94375b; i2++) {
            xjx xjxVar = ((xjx[]) hr81VarM33115b.f94377d)[i2];
            if (xjxVar != null) {
                List list = this.f56727n[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        list.add(xjxVar);
                        break;
                    }
                    xjx xjxVar2 = (xjx) list.get(i3);
                    if (xjxVar2.mo34618n().equals(xjxVar.mo34618n())) {
                        SparseIntArray sparseIntArray = this.f56719f;
                        sparseIntArray.clear();
                        for (int i4 = 0; i4 < xjxVar2.length(); i4++) {
                            sparseIntArray.put(xjxVar2.mo34614f(i4), 0);
                        }
                        for (int i5 = 0; i5 < xjxVar.length(); i5++) {
                            sparseIntArray.put(xjxVar.mo34614f(i5), 0);
                        }
                        int[] iArr = new int[sparseIntArray.size()];
                        for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                            iArr[i6] = sparseIntArray.keyAt(i6);
                        }
                        list.set(i3, new b6s(xjxVar2.mo34618n(), iArr, null, 0));
                        break;
                    }
                    i3++;
                }
            }
        }
        return hr81VarM33115b;
    }
}
