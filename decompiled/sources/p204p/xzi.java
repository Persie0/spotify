package p204p;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xzi {

    /* JADX INFO: renamed from: A */
    public static final String f267642A;

    /* JADX INFO: renamed from: B */
    public static final String f267643B;

    /* JADX INFO: renamed from: C */
    public static final String f267644C;

    /* JADX INFO: renamed from: D */
    public static final String f267645D;

    /* JADX INFO: renamed from: E */
    public static final String f267646E;

    /* JADX INFO: renamed from: p */
    public static final String f267647p;

    /* JADX INFO: renamed from: q */
    public static final String f267648q;

    /* JADX INFO: renamed from: r */
    public static final String f267649r;

    /* JADX INFO: renamed from: s */
    public static final String f267650s;

    /* JADX INFO: renamed from: t */
    public static final String f267651t;

    /* JADX INFO: renamed from: u */
    public static final String f267652u;

    /* JADX INFO: renamed from: v */
    public static final String f267653v;

    /* JADX INFO: renamed from: w */
    public static final String f267654w;

    /* JADX INFO: renamed from: x */
    public static final String f267655x;

    /* JADX INFO: renamed from: y */
    public static final String f267656y;

    /* JADX INFO: renamed from: z */
    public static final String f267657z;

    /* JADX INFO: renamed from: a */
    public final int f267658a;

    /* JADX INFO: renamed from: b */
    public final int f267659b;

    /* JADX INFO: renamed from: c */
    public final jv30 f267660c;

    /* JADX INFO: renamed from: d */
    public final PendingIntent f267661d;

    /* JADX INFO: renamed from: e */
    public final nxz0 f267662e;

    /* JADX INFO: renamed from: f */
    public final b7p0 f267663f;

    /* JADX INFO: renamed from: g */
    public final b7p0 f267664g;

    /* JADX INFO: renamed from: h */
    public final Bundle f267665h;

    /* JADX INFO: renamed from: i */
    public final Bundle f267666i;

    /* JADX INFO: renamed from: j */
    public final cap0 f267667j;

    /* JADX INFO: renamed from: k */
    public final pf40 f267668k;

    /* JADX INFO: renamed from: l */
    public final pf40 f267669l;

    /* JADX INFO: renamed from: m */
    public final MediaSession.Token f267670m;

    /* JADX INFO: renamed from: n */
    public final pf40 f267671n;

    /* JADX INFO: renamed from: o */
    public final String f267672o;

    static {
        String str = h0b1.f86200a;
        f267647p = Integer.toString(0, 36);
        f267648q = Integer.toString(1, 36);
        f267649r = Integer.toString(2, 36);
        f267650s = Integer.toString(9, 36);
        f267651t = Integer.toString(14, 36);
        f267652u = Integer.toString(13, 36);
        f267653v = Integer.toString(3, 36);
        f267654w = Integer.toString(4, 36);
        f267655x = Integer.toString(5, 36);
        f267656y = Integer.toString(6, 36);
        f267657z = Integer.toString(11, 36);
        f267642A = Integer.toString(7, 36);
        f267643B = Integer.toString(8, 36);
        f267644C = Integer.toString(10, 36);
        f267645D = Integer.toString(12, 36);
        f267646E = Integer.toString(15, 36);
    }

    public xzi(int i, int i2, jv30 jv30Var, PendingIntent pendingIntent, pf40 pf40Var, pf40 pf40Var2, pf40 pf40Var3, nxz0 nxz0Var, b7p0 b7p0Var, b7p0 b7p0Var2, Bundle bundle, Bundle bundle2, cap0 cap0Var, MediaSession.Token token, String str) {
        this.f267658a = i;
        this.f267659b = i2;
        this.f267660c = jv30Var;
        this.f267661d = pendingIntent;
        this.f267668k = pf40Var;
        this.f267669l = pf40Var2;
        this.f267671n = pf40Var3;
        this.f267662e = nxz0Var;
        this.f267663f = b7p0Var;
        this.f267664g = b7p0Var2;
        this.f267665h = bundle;
        this.f267666i = bundle2;
        this.f267667j = cap0Var;
        this.f267670m = token;
        this.f267672o = str;
    }

    /* JADX INFO: renamed from: a */
    public static xzi m92480a(Bundle bundle) {
        wsv0 wsv0VarM53150g;
        wsv0 wsv0VarM53150g2;
        wsv0 wsv0VarM53150g3;
        jv30 jv30Var;
        jv30 jv30Var2;
        IBinder binder = bundle.getBinder(f267644C);
        if (binder instanceof ozi) {
            return ((ozi) binder).f172288a;
        }
        int i = bundle.getInt(f267647p, 0);
        int i2 = bundle.getInt(f267643B, 0);
        IBinder binder2 = bundle.getBinder(f267648q);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f267649r);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f267650s);
        if (parcelableArrayList != null) {
            jf40 jf40VarM69788m = pf40.m69788m();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                jf40VarM69788m.m28985c(bcf.m28703i(i2, bundle2));
            }
            wsv0VarM53150g = jf40VarM69788m.m53150g();
        } else {
            kf40 kf40Var = pf40.f176960b;
            wsv0VarM53150g = wsv0.f254763e;
        }
        wsv0 wsv0Var = wsv0VarM53150g;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f267651t);
        if (parcelableArrayList2 != null) {
            jf40 jf40VarM69788m2 = pf40.m69788m();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                jf40VarM69788m2.m28985c(bcf.m28703i(i2, bundle3));
            }
            wsv0VarM53150g2 = jf40VarM69788m2.m53150g();
        } else {
            kf40 kf40Var2 = pf40.f176960b;
            wsv0VarM53150g2 = wsv0.f254763e;
        }
        wsv0 wsv0Var2 = wsv0VarM53150g2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(f267652u);
        if (parcelableArrayList3 != null) {
            jf40 jf40VarM69788m3 = pf40.m69788m();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                jf40VarM69788m3.m28985c(bcf.m28703i(i2, bundle4));
            }
            wsv0VarM53150g3 = jf40VarM69788m3.m53150g();
        } else {
            kf40 kf40Var3 = pf40.f176960b;
            wsv0VarM53150g3 = wsv0.f254763e;
        }
        wsv0 wsv0Var3 = wsv0VarM53150g3;
        Bundle bundle5 = bundle.getBundle(f267653v);
        nxz0 nxz0VarM65865b = bundle5 == null ? nxz0.f159651b : nxz0.m65865b(bundle5);
        Bundle bundle6 = bundle.getBundle(f267655x);
        b7p0 b7p0VarM28392b = bundle6 == null ? b7p0.f24366b : b7p0.m28392b(bundle6);
        Bundle bundle7 = bundle.getBundle(f267654w);
        b7p0 b7p0VarM28392b2 = bundle7 == null ? b7p0.f24366b : b7p0.m28392b(bundle7);
        Bundle bundleM46328p = h0b1.m46328p(bundle.getBundle(f267656y));
        Bundle bundleM46328p2 = h0b1.m46328p(bundle.getBundle(f267657z));
        Bundle bundle8 = bundle.getBundle(f267642A);
        cap0 cap0VarM32065q = bundle8 == null ? cap0.f35848H : cap0.m32065q(i2, bundle8);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(f267645D);
        String string = bundle.getString(f267646E);
        Bundle bundle9 = bundleM46328p2;
        int i6 = iv30.f106108a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jv30)) {
            gv30 gv30Var = new gv30();
            gv30Var.f84601a = iBinder;
            jv30Var = gv30Var;
        } else {
            jv30Var2 = (jv30) iInterfaceQueryLocalInterface;
        }
        if (bundleM46328p == null) {
            jv30Var = jv30Var2;
            bundleM46328p = Bundle.EMPTY;
        }
        jv30Var = jv30Var2;
        Bundle bundle10 = bundleM46328p;
        if (bundle9 == null) {
            bundle9 = Bundle.EMPTY;
        }
        return new xzi(i, i2, jv30Var, pendingIntent, wsv0Var, wsv0Var2, wsv0Var3, nxz0VarM65865b, b7p0VarM28392b2, b7p0VarM28392b, bundle10, bundle9, cap0VarM32065q, token, string);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m92481b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(f267647p, this.f267658a);
        bundle.putBinder(f267648q, this.f267660c.asBinder());
        bundle.putParcelable(f267649r, this.f267661d);
        pf40 pf40Var = this.f267668k;
        boolean zIsEmpty = pf40Var.isEmpty();
        String str = f267650s;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(pf40Var.size());
            Iterator<E> it = pf40Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((bcf) it.next()).m28712n(i));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        pf40 pf40Var2 = this.f267669l;
        if (!pf40Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(pf40Var2.size());
                Iterator<E> it2 = pf40Var2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((bcf) it2.next()).m28712n(i));
                }
                bundle.putParcelableArrayList(f267651t, arrayList2);
            } else {
                wsv0 wsv0VarM28704j = bcf.m28704j(pf40Var2, true, true, 10);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(wsv0VarM28704j.f254765d);
                kf40 kf40VarListIterator = wsv0VarM28704j.listIterator(0);
                while (kf40VarListIterator.hasNext()) {
                    arrayList3.add(((bcf) kf40VarListIterator.next()).m28712n(i));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        pf40 pf40Var3 = this.f267671n;
        if (!pf40Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(pf40Var3.size());
            Iterator<E> it3 = pf40Var3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((bcf) it3.next()).m28712n(i));
            }
            bundle.putParcelableArrayList(f267652u, arrayList4);
        }
        bundle.putBundle(f267653v, this.f267662e.m65867c());
        String str2 = f267654w;
        b7p0 b7p0Var = this.f267663f;
        bundle.putBundle(str2, b7p0Var.m28394c());
        String str3 = f267655x;
        b7p0 b7p0Var2 = this.f267664g;
        bundle.putBundle(str3, b7p0Var2.m28394c());
        bundle.putBundle(f267656y, this.f267665h);
        bundle.putBundle(f267657z, this.f267666i);
        bundle.putBundle(f267642A, this.f267667j.m32081p(dzd0.m37449d(b7p0Var, b7p0Var2), false, false).m32083s(i));
        bundle.putInt(f267643B, this.f267659b);
        MediaSession.Token token = this.f267670m;
        if (token != null) {
            bundle.putParcelable(f267645D, token);
        }
        String str4 = this.f267672o;
        if (str4 != null) {
            bundle.putString(f267646E, str4);
        }
        return bundle;
    }
}
