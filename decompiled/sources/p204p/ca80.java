package p204p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ca80 {

    /* JADX INFO: renamed from: g */
    public static final String f35766g;

    /* JADX INFO: renamed from: h */
    public static final String f35767h;

    /* JADX INFO: renamed from: i */
    public static final String f35768i;

    /* JADX INFO: renamed from: j */
    public static final String f35769j;

    /* JADX INFO: renamed from: k */
    public static final String f35770k;

    /* JADX INFO: renamed from: l */
    public static final String f35771l;

    /* JADX INFO: renamed from: a */
    public final int f35772a;

    /* JADX INFO: renamed from: b */
    public final long f35773b;

    /* JADX INFO: renamed from: c */
    public final Object f35774c;

    /* JADX INFO: renamed from: d */
    public final int f35775d;

    /* JADX INFO: renamed from: e */
    public final egd0 f35776e;

    /* JADX INFO: renamed from: f */
    public final h001 f35777f;

    static {
        String str = h0b1.f86200a;
        f35766g = Integer.toString(0, 36);
        f35767h = Integer.toString(1, 36);
        f35768i = Integer.toString(2, 36);
        f35769j = Integer.toString(3, 36);
        f35770k = Integer.toString(4, 36);
        f35771l = Integer.toString(5, 36);
    }

    public ca80(int i, long j, egd0 egd0Var, h001 h001Var, Object obj, int i2) {
        this.f35772a = i;
        this.f35773b = j;
        this.f35776e = egd0Var;
        this.f35777f = h001Var;
        this.f35774c = obj;
        this.f35775d = i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068 A[LOOP:0: B:28:0x0062->B:30:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX INFO: renamed from: a */
    public static ca80 m32007a(int i, Bundle bundle) {
        h001 h001Var;
        h001 h001Var2;
        int i2;
        String str;
        Bundle bundle2;
        IBinder binder;
        pf40 pf40VarM57146a;
        jf40 jf40VarM69788m;
        int i3 = bundle.getInt(f35766g, 0);
        long j = bundle.getLong(f35767h, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(f35768i);
        Object objM82981b = null;
        egd0 egd0VarM38849a = bundle3 == null ? null : egd0.m38849a(bundle3);
        Bundle bundle4 = bundle.getBundle(f35771l);
        if (bundle4 == null) {
            if (i3 != 0) {
                h001Var2 = new h001(i3);
            } else {
                h001Var = null;
            }
            i2 = bundle.getInt(f35770k);
            if (i2 != 1) {
                str = f35769j;
                if (i2 != 2) {
                    bundle2 = bundle.getBundle(str);
                    if (bundle2 != null) {
                        objM82981b = ufd0.m82981b(i, bundle2);
                    }
                } else if (i2 != 3) {
                    binder = bundle.getBinder(str);
                    if (binder != null) {
                        pf40VarM57146a = kra.m57146a(binder);
                        jf40VarM69788m = pf40.m69788m();
                        for (int i4 = 0; i4 < pf40VarM57146a.size(); i4++) {
                            Bundle bundle5 = (Bundle) pf40VarM57146a.get(i4);
                            bundle5.getClass();
                            jf40VarM69788m.m28985c(ufd0.m82981b(i, bundle5));
                        }
                        objM82981b = jf40VarM69788m.m53150g();
                    }
                } else if (i2 != 4) {
                    throw new IllegalStateException();
                }
            }
            return new ca80(i3, j, egd0VarM38849a, h001Var, objM82981b, i2);
        }
        h001Var2 = h001.m46234a(bundle4);
        h001Var = h001Var2;
        i2 = bundle.getInt(f35770k);
        if (i2 != 1) {
            str = f35769j;
            if (i2 != 2) {
                bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    objM82981b = ufd0.m82981b(i, bundle2);
                }
            } else if (i2 != 3) {
                binder = bundle.getBinder(str);
                if (binder != null) {
                    pf40VarM57146a = kra.m57146a(binder);
                    jf40VarM69788m = pf40.m69788m();
                    while (i4 < pf40VarM57146a.size()) {
                        Bundle bundle6 = (Bundle) pf40VarM57146a.get(i4);
                        bundle6.getClass();
                        jf40VarM69788m.m28985c(ufd0.m82981b(i, bundle6));
                    }
                    objM82981b = jf40VarM69788m.m53150g();
                }
            } else if (i2 != 4) {
                throw new IllegalStateException();
            }
        }
        return new ca80(i3, j, egd0VarM38849a, h001Var, objM82981b, i2);
    }

    /* JADX INFO: renamed from: b */
    public static ca80 m32008b(int i) {
        h001 h001Var = new h001("no error message provided", i, Bundle.EMPTY);
        return new ca80(h001Var.f86093a, SystemClock.elapsedRealtime(), null, h001Var, null, 4);
    }

    /* JADX INFO: renamed from: c */
    public static ca80 m32009c(ufd0 ufd0Var, egd0 egd0Var) {
        m32012f(ufd0Var);
        return new ca80(0, SystemClock.elapsedRealtime(), egd0Var, null, ufd0Var, 2);
    }

    /* JADX INFO: renamed from: d */
    public static ca80 m32010d(List list, egd0 egd0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m32012f((ufd0) it.next());
        }
        return new ca80(0, SystemClock.elapsedRealtime(), egd0Var, null, pf40.m69791p(list), 3);
    }

    /* JADX INFO: renamed from: e */
    public static ca80 m32011e() {
        return new ca80(0, SystemClock.elapsedRealtime(), null, null, null, 1);
    }

    /* JADX INFO: renamed from: f */
    public static void m32012f(ufd0 ufd0Var) {
        c95.m31844j(!TextUtils.isEmpty(ufd0Var.f229762a), "mediaId must not be empty");
        phd0 phd0Var = ufd0Var.f229765d;
        c95.m31844j(phd0Var.f177624r != null, "mediaMetadata must specify isBrowsable");
        c95.m31844j(phd0Var.f177625s != null, "mediaMetadata must specify isPlayable");
    }
}
