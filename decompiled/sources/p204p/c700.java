package p204p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.spotify.music.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c700 {

    /* JADX INFO: renamed from: A */
    public i500 f34648A;

    /* JADX INFO: renamed from: E */
    public og0 f34652E;

    /* JADX INFO: renamed from: F */
    public og0 f34653F;

    /* JADX INFO: renamed from: G */
    public og0 f34654G;

    /* JADX INFO: renamed from: I */
    public boolean f34656I;

    /* JADX INFO: renamed from: J */
    public boolean f34657J;

    /* JADX INFO: renamed from: K */
    public boolean f34658K;

    /* JADX INFO: renamed from: L */
    public boolean f34659L;

    /* JADX INFO: renamed from: M */
    public boolean f34660M;

    /* JADX INFO: renamed from: N */
    public ArrayList f34661N;

    /* JADX INFO: renamed from: O */
    public ArrayList f34662O;

    /* JADX INFO: renamed from: P */
    public ArrayList f34663P;

    /* JADX INFO: renamed from: Q */
    public n700 f34664Q;

    /* JADX INFO: renamed from: b */
    public boolean f34667b;

    /* JADX INFO: renamed from: e */
    public ArrayList f34670e;

    /* JADX INFO: renamed from: g */
    public b7l0 f34672g;

    /* JADX INFO: renamed from: r */
    public final o600 f34683r;

    /* JADX INFO: renamed from: s */
    public final o600 f34684s;

    /* JADX INFO: renamed from: t */
    public final o600 f34685t;

    /* JADX INFO: renamed from: u */
    public final o600 f34686u;

    /* JADX INFO: renamed from: x */
    public c600 f34689x;

    /* JADX INFO: renamed from: y */
    public q0f1 f34690y;

    /* JADX INFO: renamed from: z */
    public i500 f34691z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f34666a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final x4b f34668c = new x4b(8);

    /* JADX INFO: renamed from: d */
    public ArrayList f34669d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final k600 f34671f = new k600(this);

    /* JADX INFO: renamed from: h */
    public xi8 f34673h = null;

    /* JADX INFO: renamed from: i */
    public boolean f34674i = false;

    /* JADX INFO: renamed from: j */
    public final q600 f34675j = new q600(this);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f34676k = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    public final Map f34677l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final Map f34678m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    public final Map f34679n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o */
    public final ArrayList f34680o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final m600 f34681p = new m600(this);

    /* JADX INFO: renamed from: q */
    public final CopyOnWriteArrayList f34682q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: v */
    public final r600 f34687v = new r600(this);

    /* JADX INFO: renamed from: w */
    public int f34688w = -1;

    /* JADX INFO: renamed from: B */
    public a600 f34649B = null;

    /* JADX INFO: renamed from: C */
    public final s600 f34650C = new s600(this);

    /* JADX INFO: renamed from: D */
    public final gg5 f34651D = new gg5(12);

    /* JADX INFO: renamed from: H */
    public ArrayDeque f34655H = new ArrayDeque();

    /* JADX INFO: renamed from: R */
    public final eph f34665R = new eph(this, 29);

    /* JADX WARN: Type inference failed for: r1v13, types: [p.o600] */
    /* JADX WARN: Type inference failed for: r1v14, types: [p.o600] */
    /* JADX WARN: Type inference failed for: r1v15, types: [p.o600] */
    /* JADX WARN: Type inference failed for: r1v16, types: [p.o600] */
    public c700() {
        final int i = 0;
        this.f34683r = new y8j(this) { // from class: p.o600

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c700 f162183b;

            {
                this.f162183b = this;
            }

            @Override // p204p.y8j
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c700 c700Var = this.f162183b;
                        if (c700Var.m31610Q()) {
                            c700Var.m31634i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c700 c700Var2 = this.f162183b;
                        if (c700Var2.m31610Q() && num.intValue() == 80) {
                            c700Var2.m31642m(false);
                            break;
                        }
                        break;
                    case 2:
                        dai0 dai0Var = (dai0) obj;
                        c700 c700Var3 = this.f162183b;
                        if (c700Var3.m31610Q()) {
                            dai0Var.getClass();
                            c700Var3.m31644n(false);
                        }
                        break;
                    default:
                        azn0 azn0Var = (azn0) obj;
                        c700 c700Var4 = this.f162183b;
                        if (c700Var4.m31610Q()) {
                            azn0Var.getClass();
                            c700Var4.m31651s(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f34684s = new y8j(this) { // from class: p.o600

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c700 f162183b;

            {
                this.f162183b = this;
            }

            @Override // p204p.y8j
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c700 c700Var = this.f162183b;
                        if (c700Var.m31610Q()) {
                            c700Var.m31634i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c700 c700Var2 = this.f162183b;
                        if (c700Var2.m31610Q() && num.intValue() == 80) {
                            c700Var2.m31642m(false);
                            break;
                        }
                        break;
                    case 2:
                        dai0 dai0Var = (dai0) obj;
                        c700 c700Var3 = this.f162183b;
                        if (c700Var3.m31610Q()) {
                            dai0Var.getClass();
                            c700Var3.m31644n(false);
                        }
                        break;
                    default:
                        azn0 azn0Var = (azn0) obj;
                        c700 c700Var4 = this.f162183b;
                        if (c700Var4.m31610Q()) {
                            azn0Var.getClass();
                            c700Var4.m31651s(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f34685t = new y8j(this) { // from class: p.o600

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c700 f162183b;

            {
                this.f162183b = this;
            }

            @Override // p204p.y8j
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c700 c700Var = this.f162183b;
                        if (c700Var.m31610Q()) {
                            c700Var.m31634i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c700 c700Var2 = this.f162183b;
                        if (c700Var2.m31610Q() && num.intValue() == 80) {
                            c700Var2.m31642m(false);
                            break;
                        }
                        break;
                    case 2:
                        dai0 dai0Var = (dai0) obj;
                        c700 c700Var3 = this.f162183b;
                        if (c700Var3.m31610Q()) {
                            dai0Var.getClass();
                            c700Var3.m31644n(false);
                        }
                        break;
                    default:
                        azn0 azn0Var = (azn0) obj;
                        c700 c700Var4 = this.f162183b;
                        if (c700Var4.m31610Q()) {
                            azn0Var.getClass();
                            c700Var4.m31651s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f34686u = new y8j(this) { // from class: p.o600

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c700 f162183b;

            {
                this.f162183b = this;
            }

            @Override // p204p.y8j
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c700 c700Var = this.f162183b;
                        if (c700Var.m31610Q()) {
                            c700Var.m31634i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c700 c700Var2 = this.f162183b;
                        if (c700Var2.m31610Q() && num.intValue() == 80) {
                            c700Var2.m31642m(false);
                            break;
                        }
                        break;
                    case 2:
                        dai0 dai0Var = (dai0) obj;
                        c700 c700Var3 = this.f162183b;
                        if (c700Var3.m31610Q()) {
                            dai0Var.getClass();
                            c700Var3.m31644n(false);
                        }
                        break;
                    default:
                        azn0 azn0Var = (azn0) obj;
                        c700 c700Var4 = this.f162183b;
                        if (c700Var4.m31610Q()) {
                            azn0Var.getClass();
                            c700Var4.m31651s(false);
                        }
                        break;
                }
            }
        };
    }

    /* JADX INFO: renamed from: G */
    public static c700 m31592G(View view) {
        m500 m500Var;
        i500 i500VarM31593H = m31593H(view);
        if (i500VarM31593H != null) {
            if (i500VarM31593H.m49727z0()) {
                return i500VarM31593H.m49716o0();
            }
            throw new IllegalStateException("The Fragment " + i500VarM31593H + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                m500Var = null;
                break;
            }
            if (context instanceof m500) {
                m500Var = (m500) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (m500Var != null) {
            return m500Var.mo15683g0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* JADX INFO: renamed from: H */
    public static i500 m31593H(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            i500 i500Var = tag instanceof i500 ? (i500) tag : null;
            if (i500Var != null) {
                return i500Var;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static HashSet m31594J(xi8 xi8Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < xi8Var.f261795c.size(); i++) {
            i500 i500Var = ((j800) xi8Var.f261795c.get(i)).f109751b;
            if (i500Var != null && xi8Var.f261801i) {
                hashSet.add(i500Var);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m31595O(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: P */
    public static boolean m31596P(i500 i500Var) {
        if (i500Var.f98698d1 && i500Var.f98700e1) {
            return true;
        }
        boolean zM31596P = false;
        for (i500 i500Var2 : i500Var.f98682U0.f34668c.m89875v()) {
            if (i500Var2 != null) {
                zM31596P = m31596P(i500Var2);
            }
            if (zM31596P) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m31597R(i500 i500Var) {
        if (i500Var == null) {
            return true;
        }
        if (i500Var.f98700e1) {
            return i500Var.f98680S0 == null || m31597R(i500Var.f98683V0);
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m31598S(i500 i500Var) {
        if (i500Var == null) {
            return true;
        }
        c700 c700Var = i500Var.f98680S0;
        return i500Var.equals(c700Var.f34648A) && m31598S(c700Var.f34691z);
    }

    /* JADX INFO: renamed from: A */
    public final void m31599A(xi8 xi8Var, boolean z) {
        if (z && (this.f34689x == null || this.f34659L)) {
            return;
        }
        m31657y(z);
        xi8 xi8Var2 = this.f34673h;
        if (xi8Var2 != null) {
            xi8Var2.f261813u = false;
            xi8Var2.m91094e();
            if (m31595O(3)) {
                Objects.toString(this.f34673h);
                Objects.toString(xi8Var);
            }
            this.f34673h.m91096g(false, false);
            this.f34673h.mo24881a(this.f34661N, this.f34662O);
            Iterator it = this.f34673h.f261795c.iterator();
            while (it.hasNext()) {
                i500 i500Var = ((j800) it.next()).f109751b;
                if (i500Var != null) {
                    i500Var.f98689Z = false;
                }
            }
            this.f34673h = null;
        }
        xi8Var.mo24881a(this.f34661N, this.f34662O);
        this.f34667b = true;
        try {
            m31621b0(this.f34661N, this.f34662O);
            m31624d();
            m31647o0();
            if (this.f34660M) {
                this.f34660M = false;
                m31643m0();
            }
            ((HashMap) this.f34668c.f258038c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m31624d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0243 A[PHI: r15
      0x0243: PHI (r15v25 int) = (r15v23 int), (r15v27 int) binds: [B:105:0x0230, B:109:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0183  */
    /* JADX INFO: renamed from: B */
    public final void m31600B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object objPrevious;
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5 = i;
        x4b x4bVar = this.f34668c;
        ArrayList arrayList4 = this.f34680o;
        boolean z3 = ((xi8) arrayList.get(i5)).f261810r;
        ArrayList arrayList5 = this.f34663P;
        if (arrayList5 == null) {
            this.f34663P = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.f34663P.addAll(x4bVar.m89877x());
        i500 i500Var = this.f34648A;
        int i6 = i5;
        boolean z4 = false;
        while (i6 < i2) {
            xi8 xi8Var = (xi8) arrayList.get(i6);
            if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                arrayList3 = arrayList4;
                z = z3;
                i3 = i6;
                z2 = z4;
                int i7 = 1;
                ArrayList arrayList6 = this.f34663P;
                ArrayList arrayList7 = xi8Var.f261795c;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    j800 j800Var = (j800) arrayList7.get(size);
                    int i8 = j800Var.f109750a;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    arrayList6.add(j800Var.f109751b);
                                    break;
                                case 8:
                                    i500Var = null;
                                    break;
                                case 9:
                                    i500Var = j800Var.f109751b;
                                    break;
                                case 10:
                                    j800Var.f109758i = j800Var.f109757h;
                                    break;
                            }
                        } else {
                            arrayList6.add(j800Var.f109751b);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(j800Var.f109751b);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = this.f34663P;
                ArrayList arrayList9 = xi8Var.f261795c;
                int i9 = 0;
                while (i9 < arrayList9.size()) {
                    j800 j800Var2 = (j800) arrayList9.get(i9);
                    boolean z5 = z3;
                    int i10 = j800Var2.f109750a;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                z4 = z4;
                                arrayList8.remove(j800Var2.f109751b);
                                i500 i500Var2 = j800Var2.f109751b;
                                if (i500Var2 == i500Var) {
                                    arrayList9.add(i9, new j800(9, i500Var2));
                                    i9++;
                                    i500Var = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 != 8) {
                                z4 = z4;
                            } else {
                                z4 = z4;
                                arrayList9.add(i9, new j800(9, i500Var, 0));
                                j800Var2.f109752c = true;
                                i9++;
                                i500Var = j800Var2.f109751b;
                            }
                            i12 = 1;
                        } else {
                            z4 = z4;
                            i500 i500Var3 = j800Var2.f109751b;
                            int i13 = i500Var3.f98686X0;
                            int size2 = arrayList8.size() - 1;
                            boolean z6 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                i500 i500Var4 = (i500) arrayList8.get(size2);
                                ArrayList arrayList10 = arrayList4;
                                if (i500Var4.f98686X0 != i13) {
                                    i13 = i13;
                                } else if (i500Var4 == i500Var3) {
                                    i13 = i13;
                                    z6 = true;
                                } else {
                                    if (i500Var4 == i500Var) {
                                        arrayList9.add(i9, new j800(9, i500Var4, 0));
                                        i9++;
                                        i4 = 0;
                                        i500Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    j800 j800Var3 = new j800(3, i500Var4, i4);
                                    j800Var3.f109753d = j800Var2.f109753d;
                                    j800Var3.f109755f = j800Var2.f109755f;
                                    j800Var3.f109754e = j800Var2.f109754e;
                                    j800Var3.f109756g = j800Var2.f109756g;
                                    arrayList9.add(i9, j800Var3);
                                    arrayList8.remove(i500Var4);
                                    i9++;
                                    i500Var = i500Var;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList10;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z6) {
                                arrayList9.remove(i9);
                                i9--;
                            } else {
                                j800Var2.f109750a = 1;
                                j800Var2.f109752c = true;
                                arrayList8.add(i500Var3);
                            }
                        }
                        i9 += i12;
                        z3 = z5;
                        i6 = i11;
                        z4 = z4;
                        arrayList4 = arrayList4;
                    }
                    arrayList8.add(j800Var2.f109751b);
                    i9 += i12;
                    z3 = z5;
                    i6 = i11;
                    z4 = z4;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z3;
                i3 = i6;
                z2 = z4;
            }
            z4 = z2 || xi8Var.f261801i;
            i6 = i3 + 1;
            z3 = z;
            arrayList4 = arrayList3;
        }
        ArrayList<x600> arrayList11 = arrayList4;
        boolean z7 = z3;
        boolean z8 = z4;
        this.f34663P.clear();
        if (!z7 && this.f34688w >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((xi8) arrayList.get(i15)).f261795c.iterator();
                while (it.hasNext()) {
                    i500 i500Var5 = ((j800) it.next()).f109751b;
                    if (i500Var5 != null && i500Var5.f98680S0 != null) {
                        x4bVar.m89853C(m31630g(i500Var5));
                    }
                }
            }
        }
        int i16 = i5;
        while (i16 < i2) {
            xi8 xi8Var2 = (xi8) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                xi8Var2.m91093d(-1);
                c700 c700Var = xi8Var2.f261812t;
                ArrayList arrayList12 = xi8Var2.f261795c;
                for (int size3 = arrayList12.size() - 1; size3 >= 0; size3--) {
                    j800 j800Var4 = (j800) arrayList12.get(size3);
                    i500 i500Var6 = j800Var4.f109751b;
                    if (i500Var6 != null) {
                        i500Var6.f98673L0 = xi8Var2.f261815w;
                        if (i500Var6.f98710k1 != null) {
                            i500Var6.m49714m0().f56202a = true;
                        }
                        int i17 = xi8Var2.f261800h;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = 4100;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (i500Var6.f98710k1 != null || i18 != 0) {
                            i500Var6.m49714m0();
                            i500Var6.f98710k1.f56207f = i18;
                        }
                        ArrayList arrayList13 = xi8Var2.f261809q;
                        ArrayList arrayList14 = xi8Var2.f261808p;
                        i500Var6.m49714m0();
                        e500 e500Var = i500Var6.f98710k1;
                        e500Var.f56208g = arrayList13;
                        e500Var.f56209h = arrayList14;
                    }
                    switch (j800Var4.f109750a) {
                        case 1:
                            i500Var6.m49705a1(j800Var4.f109753d, j800Var4.f109754e, j800Var4.f109755f, j800Var4.f109756g);
                            c700Var.m31631g0(i500Var6, true);
                            c700Var.m31619a0(i500Var6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + j800Var4.f109750a);
                        case 3:
                            i500Var6.m49705a1(j800Var4.f109753d, j800Var4.f109754e, j800Var4.f109755f, j800Var4.f109756g);
                            c700Var.m31618a(i500Var6);
                            break;
                        case 4:
                            i500Var6.m49705a1(j800Var4.f109753d, j800Var4.f109754e, j800Var4.f109755f, j800Var4.f109756g);
                            c700Var.getClass();
                            if (m31595O(2)) {
                                Objects.toString(i500Var6);
                            }
                            if (i500Var6.f98690Z0) {
                                i500Var6.f98690Z0 = false;
                                i500Var6.f98711l1 = !i500Var6.f98711l1;
                            }
                            break;
                        case 5:
                            i500Var6.m49705a1(j800Var4.f109753d, j800Var4.f109754e, j800Var4.f109755f, j800Var4.f109756g);
                            c700Var.m31631g0(i500Var6, true);
                            if (m31595O(2)) {
                                Objects.toString(i500Var6);
                            }
                            if (!i500Var6.f98690Z0) {
                                i500Var6.f98690Z0 = true;
                                i500Var6.f98711l1 = !i500Var6.f98711l1;
                                c700Var.m31641l0(i500Var6);
                            }
                            break;
                        case 6:
                            i500Var6.m49705a1(j800Var4.f109753d, j800Var4.f109754e, j800Var4.f109755f, j800Var4.f109756g);
                            c700Var.m31622c(i500Var6);
                            break;
                        case 7:
                            i500Var6.m49705a1(j800Var4.f109753d, j800Var4.f109754e, j800Var4.f109755f, j800Var4.f109756g);
                            c700Var.m31631g0(i500Var6, true);
                            c700Var.m31632h(i500Var6);
                            break;
                        case 8:
                            c700Var.m31639k0(null);
                            break;
                        case 9:
                            c700Var.m31639k0(i500Var6);
                            break;
                        case 10:
                            j800Var4.f109758i = i500Var6.f98715p1;
                            c700Var.m31637j0(i500Var6, j800Var4.f109757h);
                            break;
                    }
                }
            } else {
                xi8Var2.m91093d(1);
                c700 c700Var2 = xi8Var2.f261812t;
                ArrayList arrayList15 = xi8Var2.f261795c;
                int size4 = arrayList15.size();
                int i20 = 0;
                while (i20 < size4) {
                    j800 j800Var5 = (j800) arrayList15.get(i20);
                    i500 i500Var7 = j800Var5.f109751b;
                    if (i500Var7 != null) {
                        i500Var7.f98673L0 = xi8Var2.f261815w;
                        if (i500Var7.f98710k1 != null) {
                            i500Var7.m49714m0().f56202a = false;
                        }
                        int i21 = xi8Var2.f261800h;
                        if (i500Var7.f98710k1 != null || i21 != 0) {
                            i500Var7.m49714m0();
                            i500Var7.f98710k1.f56207f = i21;
                        }
                        ArrayList arrayList16 = xi8Var2.f261808p;
                        ArrayList arrayList17 = xi8Var2.f261809q;
                        i500Var7.m49714m0();
                        e500 e500Var2 = i500Var7.f98710k1;
                        e500Var2.f56208g = arrayList16;
                        e500Var2.f56209h = arrayList17;
                    }
                    switch (j800Var5.f109750a) {
                        case 1:
                            i500Var7.m49705a1(j800Var5.f109753d, j800Var5.f109754e, j800Var5.f109755f, j800Var5.f109756g);
                            c700Var2.m31631g0(i500Var7, false);
                            c700Var2.m31618a(i500Var7);
                            i20++;
                            i16 = i16;
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + j800Var5.f109750a);
                        case 3:
                            i500Var7.m49705a1(j800Var5.f109753d, j800Var5.f109754e, j800Var5.f109755f, j800Var5.f109756g);
                            c700Var2.m31619a0(i500Var7);
                            i20++;
                            i16 = i16;
                            break;
                        case 4:
                            i500Var7.m49705a1(j800Var5.f109753d, j800Var5.f109754e, j800Var5.f109755f, j800Var5.f109756g);
                            c700Var2.getClass();
                            if (m31595O(2)) {
                                Objects.toString(i500Var7);
                            }
                            if (!i500Var7.f98690Z0) {
                                i500Var7.f98690Z0 = true;
                                i500Var7.f98711l1 = !i500Var7.f98711l1;
                                c700Var2.m31641l0(i500Var7);
                            }
                            i20++;
                            i16 = i16;
                            break;
                        case 5:
                            i500Var7.m49705a1(j800Var5.f109753d, j800Var5.f109754e, j800Var5.f109755f, j800Var5.f109756g);
                            c700Var2.m31631g0(i500Var7, false);
                            if (m31595O(2)) {
                                Objects.toString(i500Var7);
                            }
                            if (i500Var7.f98690Z0) {
                                i500Var7.f98690Z0 = false;
                                i500Var7.f98711l1 = !i500Var7.f98711l1;
                            }
                            i20++;
                            i16 = i16;
                            break;
                        case 6:
                            i500Var7.m49705a1(j800Var5.f109753d, j800Var5.f109754e, j800Var5.f109755f, j800Var5.f109756g);
                            c700Var2.m31632h(i500Var7);
                            i20++;
                            i16 = i16;
                            break;
                        case 7:
                            i500Var7.m49705a1(j800Var5.f109753d, j800Var5.f109754e, j800Var5.f109755f, j800Var5.f109756g);
                            c700Var2.m31631g0(i500Var7, false);
                            c700Var2.m31622c(i500Var7);
                            i20++;
                            i16 = i16;
                            break;
                        case 8:
                            c700Var2.m31639k0(i500Var7);
                            i20++;
                            i16 = i16;
                            break;
                        case 9:
                            c700Var2.m31639k0(null);
                            i20++;
                            i16 = i16;
                            break;
                        case 10:
                            j800Var5.f109757h = i500Var7.f98715p1;
                            c700Var2.m31637j0(i500Var7, j800Var5.f109758i);
                            i20++;
                            i16 = i16;
                            break;
                    }
                }
            }
            i16++;
        }
        boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z8 && !arrayList11.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m31594J((xi8) it2.next()));
            }
            if (this.f34673h == null) {
                for (x600 x600Var : arrayList11) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        x600Var.mo87309b((i500) it3.next(), zBooleanValue);
                    }
                }
                for (x600 x600Var2 : arrayList11) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        x600Var2.mo87308a((i500) it4.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i22 = i5; i22 < i2; i22++) {
            xi8 xi8Var3 = (xi8) arrayList.get(i22);
            if (zBooleanValue) {
                for (int size5 = xi8Var3.f261795c.size() - 1; size5 >= 0; size5--) {
                    i500 i500Var8 = ((j800) xi8Var3.f261795c.get(size5)).f109751b;
                    if (i500Var8 != null) {
                        m31630g(i500Var8).m41004k();
                    }
                }
            } else {
                Iterator it5 = xi8Var3.f261795c.iterator();
                while (it5.hasNext()) {
                    i500 i500Var9 = ((j800) it5.next()).f109751b;
                    if (i500Var9 != null) {
                        m31630g(i500Var9).m41004k();
                    }
                }
            }
        }
        m31612U(this.f34688w, true);
        for (z9q z9qVar : m31628f(arrayList, i5, i2)) {
            z9qVar.f280854e = zBooleanValue;
            synchronized (z9qVar.f280851b) {
                try {
                    z9qVar.m95719l();
                    ArrayList arrayList18 = z9qVar.f280851b;
                    ListIterator listIterator = arrayList18.listIterator(arrayList18.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            jx31 jx31Var = (jx31) objPrevious;
                            int iM64532j = nhz0.m64532j(jx31Var.f116782c.f98706h1);
                            if (jx31Var.f116780a != 2 || iM64532j == 2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    z9qVar.f280855f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            z9qVar.m95714e();
        }
        while (i5 < i2) {
            xi8 xi8Var4 = (xi8) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && xi8Var4.f261814v >= 0) {
                xi8Var4.f261814v = -1;
            }
            if (xi8Var4.f261811s != null) {
                for (int i23 = 0; i23 < xi8Var4.f261811s.size(); i23++) {
                    ((Runnable) xi8Var4.f261811s.get(i23)).run();
                }
                xi8Var4.f261811s = null;
            }
            i5++;
        }
        if (z8) {
            for (int i24 = 0; i24 < arrayList11.size(); i24++) {
                ((x600) arrayList11.get(i24)).onBackStackChanged();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m31601C() {
        m31658z(true);
        m31605I();
    }

    /* JADX INFO: renamed from: D */
    public final int m31602D(String str, int i, boolean z) {
        if (this.f34669d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f34669d.size() - 1;
        }
        int size = this.f34669d.size() - 1;
        while (size >= 0) {
            xi8 xi8Var = (xi8) this.f34669d.get(size);
            if ((str != null && str.equals(xi8Var.f261803k)) || (i >= 0 && i == xi8Var.f261814v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f34669d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            xi8 xi8Var2 = (xi8) this.f34669d.get(size - 1);
            if ((str == null || !str.equals(xi8Var2.f261803k)) && (i < 0 || i != xi8Var2.f261814v)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: E */
    public final i500 m31603E(int i) {
        x4b x4bVar = this.f34668c;
        ArrayList arrayList = (ArrayList) x4bVar.f258037b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i500 i500Var = (i500) arrayList.get(size);
            if (i500Var != null && i500Var.f98684W0 == i) {
                return i500Var;
            }
        }
        for (f800 f800Var : ((HashMap) x4bVar.f258038c).values()) {
            if (f800Var != null) {
                i500 i500Var2 = f800Var.f66819c;
                if (i500Var2.f98684W0 == i) {
                    return i500Var2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final i500 m31604F(String str) {
        x4b x4bVar = this.f34668c;
        ArrayList arrayList = (ArrayList) x4bVar.f258037b;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                i500 i500Var = (i500) arrayList.get(size);
                if (i500Var != null && str.equals(i500Var.f98688Y0)) {
                    return i500Var;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (f800 f800Var : ((HashMap) x4bVar.f258038c).values()) {
            if (f800Var != null) {
                i500 i500Var2 = f800Var.f66819c;
                if (str.equals(i500Var2.f98688Y0)) {
                    return i500Var2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m31605I() {
        for (z9q z9qVar : m31626e()) {
            if (z9qVar.f280855f) {
                m31595O(2);
                z9qVar.f280855f = false;
                z9qVar.m95714e();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m31606K() {
        return this.f34669d.size() + (this.f34673h != null ? 1 : 0);
    }

    /* JADX INFO: renamed from: L */
    public final ViewGroup m31607L(i500 i500Var) {
        ViewGroup viewGroup = i500Var.f98704g1;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (i500Var.f98686X0 <= 0 || !this.f34690y.mo31452M()) {
            return null;
        }
        View viewMo31451L = this.f34690y.mo31451L(i500Var.f98686X0);
        if (viewMo31451L instanceof ViewGroup) {
            return (ViewGroup) viewMo31451L;
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final a600 m31608M() {
        a600 a600Var = this.f34649B;
        if (a600Var != null) {
            return a600Var;
        }
        i500 i500Var = this.f34691z;
        return i500Var != null ? i500Var.f98680S0.m31608M() : this.f34650C;
    }

    /* JADX INFO: renamed from: N */
    public final gg5 m31609N() {
        i500 i500Var = this.f34691z;
        return i500Var != null ? i500Var.f98680S0.m31609N() : this.f34651D;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m31610Q() {
        i500 i500Var = this.f34691z;
        if (i500Var == null) {
            return true;
        }
        return i500Var.m49727z0() && this.f34691z.m49720s0().m31610Q();
    }

    /* JADX INFO: renamed from: T */
    public final boolean m31611T() {
        return this.f34657J || this.f34658K;
    }

    /* JADX INFO: renamed from: U */
    public final void m31612U(int i, boolean z) {
        c600 c600Var;
        if (this.f34689x == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f34688w) {
            this.f34688w = i;
            x4b x4bVar = this.f34668c;
            HashMap map = (HashMap) x4bVar.f258038c;
            Iterator it = ((ArrayList) x4bVar.f258037b).iterator();
            while (it.hasNext()) {
                f800 f800Var = (f800) map.get(((i500) it.next()).f98699e);
                if (f800Var != null) {
                    f800Var.m41004k();
                }
            }
            for (f800 f800Var2 : map.values()) {
                if (f800Var2 != null) {
                    f800Var2.m41004k();
                    i500 i500Var = f800Var2.f66819c;
                    if (i500Var.f98687Y && !i500Var.m49693B0()) {
                        if (i500Var.f98673L0 && !((HashMap) x4bVar.f258039d).containsKey(i500Var.f98699e)) {
                            x4bVar.m89860J(i500Var.f98699e, f800Var2.m41008o());
                        }
                        x4bVar.m89854D(f800Var2);
                    }
                }
            }
            m31643m0();
            if (this.f34656I && (c600Var = this.f34689x) != null && this.f34688w == 7) {
                c600Var.mo31501e0();
                this.f34656I = false;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m31613V() {
        if (this.f34689x == null) {
            return;
        }
        this.f34657J = false;
        this.f34658K = false;
        this.f34664Q.f151000g = false;
        for (i500 i500Var : this.f34668c.m89877x()) {
            if (i500Var != null) {
                i500Var.f98682U0.m31613V();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m31614W(FragmentContainerView fragmentContainerView) {
        View view;
        for (f800 f800Var : this.f34668c.m89874u()) {
            i500 i500Var = f800Var.f66819c;
            if (i500Var.f98686X0 == fragmentContainerView.getId() && (view = i500Var.f98706h1) != null && view.getParent() == null) {
                i500Var.f98704g1 = fragmentContainerView;
                f800Var.m40995b();
                f800Var.m41004k();
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m31615X() {
        return m31616Y(-1, 0);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m31616Y(int i, int i2) {
        m31658z(false);
        m31657y(true);
        i500 i500Var = this.f34648A;
        if (i500Var != null && i < 0 && i500Var.m49716o0().m31615X()) {
            return true;
        }
        boolean zM31617Z = m31617Z(this.f34661N, this.f34662O, null, i, i2);
        if (zM31617Z) {
            this.f34667b = true;
            try {
                m31621b0(this.f34661N, this.f34662O);
                m31624d();
            } catch (Throwable th) {
                m31624d();
                throw th;
            }
        }
        m31647o0();
        if (this.f34660M) {
            this.f34660M = false;
            m31643m0();
        }
        ((HashMap) this.f34668c.f258038c).values().removeAll(Collections.singleton(null));
        return zM31617Z;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m31617Z(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iM31602D = m31602D(str, i, (i2 & 1) != 0);
        if (iM31602D < 0) {
            return false;
        }
        for (int size = this.f34669d.size() - 1; size >= iM31602D; size--) {
            arrayList.add((xi8) this.f34669d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final f800 m31618a(i500 i500Var) {
        String str = i500Var.f98714o1;
        if (str != null) {
            i800.m49891c(str, i500Var);
        }
        if (m31595O(2)) {
            i500Var.toString();
        }
        f800 f800VarM31630g = m31630g(i500Var);
        i500Var.f98680S0 = this;
        x4b x4bVar = this.f34668c;
        x4bVar.m89853C(f800VarM31630g);
        if (!i500Var.f98692a1) {
            x4bVar.m89864b(i500Var);
            i500Var.f98687Y = false;
            if (i500Var.f98706h1 == null) {
                i500Var.f98711l1 = false;
            }
            if (m31596P(i500Var)) {
                this.f34656I = true;
            }
        }
        return f800VarM31630g;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m31619a0(i500 i500Var) {
        if (m31595O(2)) {
            Objects.toString(i500Var);
        }
        boolean zM49693B0 = i500Var.m49693B0();
        if (i500Var.f98692a1 && zM49693B0) {
            return;
        }
        x4b x4bVar = this.f34668c;
        synchronized (((ArrayList) x4bVar.f258037b)) {
            ((ArrayList) x4bVar.f258037b).remove(i500Var);
        }
        i500Var.f98685X = false;
        if (m31596P(i500Var)) {
            this.f34656I = true;
        }
        i500Var.f98687Y = true;
        m31641l0(i500Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m31620b(c600 c600Var, q0f1 q0f1Var, i500 i500Var) {
        String strM36616p;
        hc80 hc80Var;
        if (this.f34689x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f34689x = c600Var;
        this.f34690y = q0f1Var;
        this.f34691z = i500Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f34682q;
        if (i500Var != null) {
            copyOnWriteArrayList.add(new u600(i500Var));
        } else if (c600Var instanceof x700) {
            copyOnWriteArrayList.add((x700) c600Var);
        }
        if (this.f34691z != null) {
            m31647o0();
        }
        if (c600Var instanceof c7l0) {
            c7l0 c7l0Var = (c7l0) c600Var;
            b7l0 b7l0VarMo31751N = c7l0Var.mo31751N();
            this.f34672g = b7l0VarMo31751N;
            if (i500Var != null) {
                hc80Var = c7l0Var;
                hc80Var = i500Var;
            }
            hc80Var = c7l0Var;
            b7l0VarMo31751N.m28385a(hc80Var, this.f34675j);
        }
        if (i500Var != null) {
            n700 n700Var = i500Var.f98680S0.f34664Q;
            HashMap map = n700Var.f150996c;
            n700 n700Var2 = (n700) map.get(i500Var.f98699e);
            if (n700Var2 == null) {
                n700Var2 = new n700(n700Var.f150998e);
                map.put(i500Var.f98699e, n700Var2);
            }
            this.f34664Q = n700Var2;
        } else if (c600Var instanceof ijc1) {
            this.f34664Q = (n700) new yic1(((ijc1) c600Var).mo34134w(), n700.f150994h).m93705c(n700.class);
        } else {
            this.f34664Q = new n700(false);
        }
        this.f34664Q.f151000g = m31611T();
        this.f34668c.f258040e = this.f34664Q;
        Object obj = this.f34689x;
        if ((obj instanceof h9y0) && i500Var == null) {
            f9y0 f9y0VarMo34135x = ((h9y0) obj).mo34135x();
            f9y0VarMo34135x.m41110c("android:support:fragments", new wvf((j700) this, 1));
            Bundle bundleM41108a = f9y0VarMo34135x.m41108a("android:support:fragments");
            if (bundleM41108a != null) {
                m31623c0(bundleM41108a);
            }
        }
        Object obj2 = this.f34689x;
        if (obj2 instanceof sg0) {
            pg0 pg0VarMo34132s = ((sg0) obj2).mo34132s();
            if (i500Var != null) {
                strM36616p = dq60.m36616p(i500Var.f98699e, ":", new StringBuilder());
            } else {
                strM36616p = "";
            }
            String strM38564m = edb.m38564m("FragmentManager:", strM36616p);
            j700 j700Var = (j700) this;
            int i = 1;
            this.f34652E = pg0VarMo34132s.m69854h(s571.m77250i(strM38564m, "StartActivityForResult"), new o5m0(5), new qj7(j700Var, i));
            this.f34653F = pg0VarMo34132s.m69854h(s571.m77250i(strM38564m, "StartIntentSenderForResult"), new o5m0(9), new p600(j700Var, i));
            this.f34654G = pg0VarMo34132s.m69854h(s571.m77250i(strM38564m, "RequestPermissions"), new o5m0(3), new p600(j700Var, 0));
        }
        Object obj3 = this.f34689x;
        if (obj3 instanceof s7l0) {
            ((s7l0) obj3).mo34129c0(this.f34683r);
        }
        Object obj4 = this.f34689x;
        if (obj4 instanceof wfl0) {
            ((wfl0) obj4).mo34128b0(this.f34684s);
        }
        Object obj5 = this.f34689x;
        if (obj5 instanceof cbl0) {
            ((cbl0) obj5).mo32178X(this.f34685t);
        }
        Object obj6 = this.f34689x;
        if (obj6 instanceof ebl0) {
            ((ebl0) obj6).mo34123G(this.f34686u);
        }
        Object obj7 = this.f34689x;
        if ((obj7 instanceof che0) && i500Var == null) {
            ((che0) obj7).mo156K(this.f34687v);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m31621b0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((xi8) arrayList.get(i)).f261810r) {
                if (i2 != i) {
                    m31600B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((xi8) arrayList.get(i2)).f261810r) {
                        i2++;
                    }
                }
                m31600B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m31600B(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m31622c(i500 i500Var) {
        if (m31595O(2)) {
            Objects.toString(i500Var);
        }
        if (i500Var.f98692a1) {
            i500Var.f98692a1 = false;
            if (i500Var.f98685X) {
                return;
            }
            this.f34668c.m89864b(i500Var);
            if (m31595O(2)) {
                i500Var.toString();
            }
            if (m31596P(i500Var)) {
                this.f34656I = true;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m31623c0(Parcelable parcelable) {
        m600 m600Var;
        f800 f800Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f34689x.f34324L0.getClassLoader());
                this.f34678m.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f34689x.f34324L0.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        x4b x4bVar = this.f34668c;
        HashMap map2 = (HashMap) x4bVar.f258039d;
        HashMap map3 = (HashMap) x4bVar.f258038c;
        map2.clear();
        map2.putAll(map);
        l700 l700Var = (l700) bundle3.getParcelable("state");
        if (l700Var == null) {
            return;
        }
        map3.clear();
        Iterator it = l700Var.f130519a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            m600Var = this.f34681p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM89860J = x4bVar.m89860J((String) it.next(), null);
            if (bundleM89860J != null) {
                i500 i500Var = (i500) this.f34664Q.f150995b.get(((d800) bundleM89860J.getParcelable("state")).f46316b);
                if (i500Var != null) {
                    if (m31595O(2)) {
                        i500Var.toString();
                    }
                    f800Var = new f800(m600Var, x4bVar, i500Var, bundleM89860J);
                } else {
                    f800Var = new f800(this.f34681p, this.f34668c, this.f34689x.f34324L0.getClassLoader(), m31608M(), bundleM89860J);
                }
                i500 i500Var2 = f800Var.f66819c;
                i500Var2.f98693b = bundleM89860J;
                i500Var2.f98680S0 = this;
                if (m31595O(2)) {
                    i500Var2.toString();
                }
                f800Var.m41006m(this.f34689x.f34324L0.getClassLoader());
                x4bVar.m89853C(f800Var);
                f800Var.f66821e = this.f34688w;
            }
        }
        n700 n700Var = this.f34664Q;
        n700Var.getClass();
        for (i500 i500Var3 : new ArrayList(n700Var.f150995b.values())) {
            if (map3.get(i500Var3.f98699e) == null) {
                if (m31595O(2)) {
                    i500Var3.toString();
                    Objects.toString(l700Var.f130519a);
                }
                this.f34664Q.m63791g(i500Var3);
                i500Var3.f98680S0 = this;
                f800 f800Var2 = new f800(m600Var, x4bVar, i500Var3);
                f800Var2.f66821e = 1;
                f800Var2.m41004k();
                i500Var3.f98687Y = true;
                f800Var2.m41004k();
            }
        }
        ArrayList<String> arrayList = l700Var.f130520b;
        ((ArrayList) x4bVar.f258037b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                i500 i500VarM89872s = x4bVar.m89872s(str3);
                if (i500VarM89872s == null) {
                    throw new IllegalStateException(s571.m77251j("No instantiated fragment for (", str3, ")"));
                }
                if (m31595O(2)) {
                    i500VarM89872s.toString();
                }
                x4bVar.m89864b(i500VarM89872s);
            }
        }
        if (l700Var.f130521c != null) {
            this.f34669d = new ArrayList(l700Var.f130521c.length);
            int i = 0;
            while (true) {
                zi8[] zi8VarArr = l700Var.f130521c;
                if (i >= zi8VarArr.length) {
                    break;
                }
                xi8 xi8VarM96202g = zi8VarArr[i].m96202g(this);
                if (m31595O(2)) {
                    xi8VarM96202g.toString();
                    PrintWriter printWriter = new PrintWriter(new qqa0());
                    xi8VarM96202g.m91101l("  ", printWriter, false);
                    printWriter.close();
                }
                this.f34669d.add(xi8VarM96202g);
                i++;
            }
        } else {
            this.f34669d = new ArrayList();
        }
        this.f34676k.set(l700Var.f130522d);
        String str4 = l700Var.f130523e;
        if (str4 != null) {
            i500 i500VarM89872s2 = x4bVar.m89872s(str4);
            this.f34648A = i500VarM89872s2;
            m31650r(i500VarM89872s2);
        }
        ArrayList arrayList2 = l700Var.f130524f;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.f34677l.put((String) arrayList2.get(i2), (dj8) l700Var.f130525g.get(i2));
            }
        }
        this.f34655H = new ArrayDeque(l700Var.f130526h);
    }

    /* JADX INFO: renamed from: d */
    public final void m31624d() {
        this.f34667b = false;
        this.f34662O.clear();
        this.f34661N.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public final Bundle m31625d0() {
        zi8[] zi8VarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        m31605I();
        m31655w();
        m31658z(true);
        this.f34657J = true;
        this.f34664Q.f151000g = true;
        x4b x4bVar = this.f34668c;
        x4bVar.getClass();
        HashMap map = (HashMap) x4bVar.f258038c;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (f800 f800Var : map.values()) {
            if (f800Var != null) {
                i500 i500Var = f800Var.f66819c;
                x4bVar.m89860J(i500Var.f98699e, f800Var.m41008o());
                arrayList2.add(i500Var.f98699e);
                if (m31595O(2)) {
                    i500Var.toString();
                    Objects.toString(i500Var.f98693b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f34668c.f258039d;
        if (map2.isEmpty()) {
            m31595O(2);
            return bundle;
        }
        x4b x4bVar2 = this.f34668c;
        synchronized (((ArrayList) x4bVar2.f258037b)) {
            try {
                zi8VarArr = null;
                if (((ArrayList) x4bVar2.f258037b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) x4bVar2.f258037b).size());
                    for (i500 i500Var2 : (ArrayList) x4bVar2.f258037b) {
                        arrayList.add(i500Var2.f98699e);
                        if (m31595O(2)) {
                            i500Var2.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = this.f34669d.size();
        if (size > 0) {
            zi8VarArr = new zi8[size];
            for (int i = 0; i < size; i++) {
                zi8VarArr[i] = new zi8((xi8) this.f34669d.get(i));
                if (m31595O(2)) {
                    Objects.toString(this.f34669d.get(i));
                }
            }
        }
        l700 l700Var = new l700();
        l700Var.f130519a = arrayList2;
        l700Var.f130520b = arrayList;
        l700Var.f130521c = zi8VarArr;
        l700Var.f130522d = this.f34676k.get();
        i500 i500Var3 = this.f34648A;
        if (i500Var3 != null) {
            l700Var.f130523e = i500Var3.f98699e;
        }
        l700Var.f130524f.addAll(this.f34677l.keySet());
        l700Var.f130525g.addAll(this.f34677l.values());
        l700Var.f130526h = new ArrayList(this.f34655H);
        bundle.putParcelable("state", l700Var);
        for (String str : this.f34678m.keySet()) {
            bundle.putBundle(edb.m38564m("result_", str), (Bundle) this.f34678m.get(str));
        }
        for (String str2 : map2.keySet()) {
            bundle.putBundle(edb.m38564m("fragment_", str2), (Bundle) map2.get(str2));
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m31626e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f34668c.m89874u().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((f800) it.next()).f66819c.f98704g1;
            if (viewGroup != null) {
                m31609N();
                hashSet.add(o2z0.m66154k(viewGroup));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: e0 */
    public final h500 m31627e0(i500 i500Var) {
        f800 f800Var = (f800) ((HashMap) this.f34668c.f258038c).get(i500Var.f98699e);
        if (f800Var != null) {
            i500 i500Var2 = f800Var.f66819c;
            if (i500Var2.equals(i500Var)) {
                if (i500Var2.f98691a > -1) {
                    return new h500(f800Var.m41008o());
                }
                return null;
            }
        }
        m31645n0(new IllegalStateException(klh.m56835g("Fragment ", i500Var, " is not currently in the FragmentManager")));
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final HashSet m31628f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((xi8) arrayList.get(i)).f261795c.iterator();
            while (it.hasNext()) {
                i500 i500Var = ((j800) it.next()).f109751b;
                if (i500Var != null && (viewGroup = i500Var.f98704g1) != null) {
                    hashSet.add(o2z0.m66155l(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m31629f0() {
        synchronized (this.f34666a) {
            try {
                if (this.f34666a.size() == 1) {
                    this.f34689x.f34325M0.removeCallbacks(this.f34665R);
                    this.f34689x.f34325M0.post(this.f34665R);
                    m31647o0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final f800 m31630g(i500 i500Var) {
        String str = i500Var.f98699e;
        x4b x4bVar = this.f34668c;
        f800 f800Var = (f800) ((HashMap) x4bVar.f258038c).get(str);
        if (f800Var != null) {
            return f800Var;
        }
        f800 f800Var2 = new f800(this.f34681p, x4bVar, i500Var);
        f800Var2.m41006m(this.f34689x.f34324L0.getClassLoader());
        f800Var2.f66821e = this.f34688w;
        return f800Var2;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m31631g0(i500 i500Var, boolean z) {
        ViewGroup viewGroupM31607L = m31607L(i500Var);
        if (viewGroupM31607L == null || !(viewGroupM31607L instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM31607L).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: h */
    public final void m31632h(i500 i500Var) {
        if (m31595O(2)) {
            Objects.toString(i500Var);
        }
        if (i500Var.f98692a1) {
            return;
        }
        i500Var.f98692a1 = true;
        if (i500Var.f98685X) {
            if (m31595O(2)) {
                i500Var.toString();
            }
            x4b x4bVar = this.f34668c;
            synchronized (((ArrayList) x4bVar.f258037b)) {
                ((ArrayList) x4bVar.f258037b).remove(i500Var);
            }
            i500Var.f98685X = false;
            if (m31596P(i500Var)) {
                this.f34656I = true;
            }
            m31641l0(i500Var);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m31633h0(String str, Bundle bundle) {
        w600 w600Var = (w600) this.f34679n.get(str);
        if (w600Var == null || !w600Var.f248221a.mo31987b().m41223a(fb80.f67753d)) {
            this.f34678m.put(str, bundle);
        } else {
            w600Var.mo27561b(str, bundle);
        }
        if (m31595O(2)) {
            Objects.toString(bundle);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m31634i(boolean z, Configuration configuration) {
        if (z && (this.f34689x instanceof s7l0)) {
            m31645n0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (i500 i500Var : this.f34668c.m89877x()) {
            if (i500Var != null) {
                i500Var.onConfigurationChanged(configuration);
                if (z) {
                    i500Var.f98682U0.m31634i(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m31635i0(String str, hc80 hc80Var, b800 b800Var) {
        gb80 lifecycle = hc80Var.getLifecycle();
        if (lifecycle.mo31987b() == fb80.f67750a) {
            return;
        }
        t600 t600Var = new t600(this, str, b800Var, lifecycle);
        w600 w600Var = (w600) this.f34679n.put(str, new w600(lifecycle, b800Var, t600Var));
        if (w600Var != null) {
            w600Var.f248221a.mo31988d(w600Var.f248223c);
        }
        if (m31595O(2)) {
            lifecycle.toString();
            Objects.toString(b800Var);
        }
        lifecycle.mo31986a(t600Var);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m31636j() {
        if (this.f34688w >= 1) {
            for (i500 i500Var : this.f34668c.m89877x()) {
                if (i500Var != null) {
                    if (!i500Var.f98690Z0 ? i500Var.f98682U0.m31636j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m31637j0(i500 i500Var, fb80 fb80Var) {
        if (i500Var.equals(this.f34668c.m89872s(i500Var.f98699e)) && (i500Var.f98681T0 == null || i500Var.f98680S0 == this)) {
            i500Var.f98715p1 = fb80Var;
            return;
        }
        throw new IllegalArgumentException("Fragment " + i500Var + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m31638k() {
        if (this.f34688w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (i500 i500Var : this.f34668c.m89877x()) {
            if (i500Var != null && m31597R(i500Var)) {
                if (i500Var.f98690Z0 ? false : (i500Var.f98698d1 && i500Var.f98700e1) | i500Var.f98682U0.m31638k()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(i500Var);
                    z = true;
                }
            }
        }
        if (this.f34670e != null) {
            for (int i = 0; i < this.f34670e.size(); i++) {
                i500 i500Var2 = (i500) this.f34670e.get(i);
                if (arrayList == null || !arrayList.contains(i500Var2)) {
                    i500Var2.getClass();
                }
            }
        }
        this.f34670e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m31639k0(i500 i500Var) {
        if (i500Var != null) {
            if (!i500Var.equals(this.f34668c.m89872s(i500Var.f98699e)) || (i500Var.f98681T0 != null && i500Var.f98680S0 != this)) {
                throw new IllegalArgumentException("Fragment " + i500Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        i500 i500Var2 = this.f34648A;
        this.f34648A = i500Var;
        m31650r(i500Var2);
        m31650r(this.f34648A);
    }

    /* JADX INFO: renamed from: l */
    public final void m31640l() {
        this.f34659L = true;
        m31658z(true);
        m31655w();
        c600 c600Var = this.f34689x;
        boolean z = c600Var instanceof ijc1;
        x4b x4bVar = this.f34668c;
        if (z ? ((n700) x4bVar.f258040e).f150999f : true ^ c600Var.f34324L0.isChangingConfigurations()) {
            Iterator it = this.f34677l.values().iterator();
            while (it.hasNext()) {
                for (String str : ((dj8) it.next()).f49608a) {
                    n700 n700Var = (n700) x4bVar.f258040e;
                    n700Var.getClass();
                    m31595O(3);
                    n700Var.m63790f(str, false);
                }
            }
        }
        m31653u(-1);
        Object obj = this.f34689x;
        if (obj instanceof wfl0) {
            ((wfl0) obj).mo34127a0(this.f34684s);
        }
        Object obj2 = this.f34689x;
        if (obj2 instanceof s7l0) {
            ((s7l0) obj2).mo34124Q(this.f34683r);
        }
        Object obj3 = this.f34689x;
        if (obj3 instanceof cbl0) {
            ((cbl0) obj3).mo32179Y(this.f34685t);
        }
        Object obj4 = this.f34689x;
        if (obj4 instanceof ebl0) {
            ((ebl0) obj4).mo34133t(this.f34686u);
        }
        Object obj5 = this.f34689x;
        if ((obj5 instanceof che0) && this.f34691z == null) {
            ((che0) obj5).mo171r(this.f34687v);
        }
        this.f34689x = null;
        this.f34690y = null;
        this.f34691z = null;
        if (this.f34672g != null) {
            this.f34675j.m87300e();
            this.f34672g = null;
        }
        og0 og0Var = this.f34652E;
        if (og0Var != null) {
            og0Var.mo24738b();
            this.f34653F.mo24738b();
            this.f34654G.mo24738b();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m31641l0(i500 i500Var) {
        ViewGroup viewGroupM31607L = m31607L(i500Var);
        if (viewGroupM31607L != null) {
            e500 e500Var = i500Var.f98710k1;
            if ((e500Var == null ? 0 : e500Var.f56206e) + (e500Var == null ? 0 : e500Var.f56205d) + (e500Var == null ? 0 : e500Var.f56204c) + (e500Var == null ? 0 : e500Var.f56203b) > 0) {
                if (viewGroupM31607L.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM31607L.setTag(R.id.visible_removing_fragment_view_tag, i500Var);
                }
                i500 i500Var2 = (i500) viewGroupM31607L.getTag(R.id.visible_removing_fragment_view_tag);
                e500 e500Var2 = i500Var.f98710k1;
                boolean z = e500Var2 != null ? e500Var2.f56202a : false;
                if (i500Var2.f98710k1 == null) {
                    return;
                }
                i500Var2.m49714m0().f56202a = z;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m31642m(boolean z) {
        if (z && (this.f34689x instanceof wfl0)) {
            m31645n0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (i500 i500Var : this.f34668c.m89877x()) {
            if (i500Var != null) {
                i500Var.f98702f1 = true;
                if (z) {
                    i500Var.f98682U0.m31642m(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m31643m0() {
        for (f800 f800Var : this.f34668c.m89874u()) {
            i500 i500Var = f800Var.f66819c;
            if (i500Var.f98708i1) {
                if (this.f34667b) {
                    this.f34660M = true;
                } else {
                    i500Var.f98708i1 = false;
                    f800Var.m41004k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m31644n(boolean z) {
        if (z && (this.f34689x instanceof cbl0)) {
            m31645n0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (i500 i500Var : this.f34668c.m89877x()) {
            if (i500Var != null && z) {
                i500Var.f98682U0.m31644n(true);
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m31645n0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new qqa0());
        c600 c600Var = this.f34689x;
        try {
            if (c600Var != null) {
                c600Var.mo31498W(printWriter, new String[0]);
            } else {
                m31654v("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m31646o() {
        for (i500 i500Var : this.f34668c.m89875v()) {
            if (i500Var != null) {
                i500Var.m49692A0();
                i500Var.f98682U0.m31646o();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m31647o0() {
        synchronized (this.f34666a) {
            try {
                if (!this.f34666a.isEmpty()) {
                    this.f34675j.m87301f(true);
                    if (m31595O(3)) {
                        toString();
                    }
                } else {
                    boolean z = m31606K() > 0 && m31598S(this.f34691z);
                    if (m31595O(3)) {
                        toString();
                    }
                    this.f34675j.m87301f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m31648p() {
        if (this.f34688w >= 1) {
            for (i500 i500Var : this.f34668c.m89877x()) {
                if (i500Var != null) {
                    if (!i500Var.f98690Z0 ? i500Var.f98682U0.m31648p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m31649q() {
        if (this.f34688w < 1) {
            return;
        }
        for (i500 i500Var : this.f34668c.m89877x()) {
            if (i500Var != null && !i500Var.f98690Z0) {
                i500Var.f98682U0.m31649q();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m31650r(i500 i500Var) {
        if (i500Var != null) {
            if (i500Var.equals(this.f34668c.m89872s(i500Var.f98699e))) {
                i500Var.f98680S0.getClass();
                boolean zM31598S = m31598S(i500Var);
                Boolean bool = i500Var.f98719t;
                if (bool == null || bool.booleanValue() != zM31598S) {
                    i500Var.f98719t = Boolean.valueOf(zM31598S);
                    j700 j700Var = i500Var.f98682U0;
                    j700Var.m31647o0();
                    j700Var.m31650r(j700Var.f34648A);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m31651s(boolean z) {
        if (z && (this.f34689x instanceof ebl0)) {
            m31645n0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (i500 i500Var : this.f34668c.m89877x()) {
            if (i500Var != null && z) {
                i500Var.f98682U0.m31651s(true);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m31652t() {
        if (this.f34688w < 1) {
            return false;
        }
        boolean z = false;
        for (i500 i500Var : this.f34668c.m89877x()) {
            if (i500Var != null && m31597R(i500Var)) {
                if (i500Var.f98690Z0 ? false : i500Var.f98682U0.m31652t() | (i500Var.f98698d1 && i500Var.f98700e1)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        i500 i500Var = this.f34691z;
        if (i500Var != null) {
            sb.append(i500Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f34691z)));
            sb.append("}");
        } else {
            c600 c600Var = this.f34689x;
            if (c600Var != null) {
                sb.append(c600Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f34689x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m31653u(int i) {
        try {
            this.f34667b = true;
            for (f800 f800Var : ((HashMap) this.f34668c.f258038c).values()) {
                if (f800Var != null) {
                    f800Var.f66821e = i;
                }
            }
            m31612U(i, false);
            Iterator it = m31626e().iterator();
            while (it.hasNext()) {
                ((z9q) it.next()).m95717i();
            }
            this.f34667b = false;
            m31658z(true);
        } catch (Throwable th) {
            this.f34667b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m31654v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strM77250i = s571.m77250i(str, "    ");
        x4b x4bVar = this.f34668c;
        ArrayList arrayList = (ArrayList) x4bVar.f258037b;
        String strM77250i2 = s571.m77250i(str, "    ");
        HashMap map = (HashMap) x4bVar.f258038c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (f800 f800Var : map.values()) {
                printWriter.print(str);
                if (f800Var != null) {
                    i500 i500Var = f800Var.f66819c;
                    printWriter.println(i500Var);
                    i500Var.mo49713l0(strM77250i2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                i500 i500Var2 = (i500) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(i500Var2.toString());
            }
        }
        ArrayList arrayList2 = this.f34670e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                i500 i500Var3 = (i500) this.f34670e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(i500Var3.toString());
            }
        }
        int size3 = this.f34669d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                xi8 xi8Var = (xi8) this.f34669d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(xi8Var.toString());
                xi8Var.m91101l(strM77250i, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f34676k.get());
        synchronized (this.f34666a) {
            try {
                int size4 = this.f34666a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (y600) this.f34666a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f34689x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f34690y);
        if (this.f34691z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f34691z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f34688w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f34657J);
        printWriter.print(" mStopped=");
        printWriter.print(this.f34658K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f34659L);
        if (this.f34656I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f34656I);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m31655w() {
        Iterator it = m31626e().iterator();
        while (it.hasNext()) {
            ((z9q) it.next()).m95717i();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m31656x(y600 y600Var, boolean z) {
        if (!z) {
            if (this.f34689x == null) {
                if (!this.f34659L) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m31611T()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f34666a) {
            try {
                if (this.f34689x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f34666a.add(y600Var);
                    m31629f0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m31657y(boolean z) {
        if (this.f34667b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f34689x == null) {
            if (!this.f34659L) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f34689x.f34325M0.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && m31611T()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f34661N == null) {
            this.f34661N = new ArrayList();
            this.f34662O = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m31658z(boolean z) {
        boolean zMo24881a;
        xi8 xi8Var;
        m31657y(z);
        if (!this.f34674i && (xi8Var = this.f34673h) != null) {
            xi8Var.f261813u = false;
            xi8Var.m91094e();
            if (m31595O(3)) {
                Objects.toString(this.f34673h);
                Objects.toString(this.f34666a);
            }
            this.f34673h.m91096g(false, false);
            this.f34666a.add(0, this.f34673h);
            Iterator it = this.f34673h.f261795c.iterator();
            while (it.hasNext()) {
                i500 i500Var = ((j800) it.next()).f109751b;
                if (i500Var != null) {
                    i500Var.f98689Z = false;
                }
            }
            this.f34673h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f34661N;
            ArrayList arrayList2 = this.f34662O;
            synchronized (this.f34666a) {
                if (this.f34666a.isEmpty()) {
                    zMo24881a = false;
                } else {
                    try {
                        int size = this.f34666a.size();
                        zMo24881a = false;
                        for (int i = 0; i < size; i++) {
                            zMo24881a |= ((y600) this.f34666a.get(i)).mo24881a(arrayList, arrayList2);
                        }
                        this.f34666a.clear();
                        this.f34689x.f34325M0.removeCallbacks(this.f34665R);
                    } catch (Throwable th) {
                        this.f34666a.clear();
                        this.f34689x.f34325M0.removeCallbacks(this.f34665R);
                        throw th;
                    }
                }
            }
            if (!zMo24881a) {
                break;
            }
            z2 = true;
            this.f34667b = true;
            try {
                m31621b0(this.f34661N, this.f34662O);
                m31624d();
            } catch (Throwable th2) {
                m31624d();
                throw th2;
            }
        }
        m31647o0();
        if (this.f34660M) {
            this.f34660M = false;
            m31643m0();
        }
        ((HashMap) this.f34668c.f258038c).values().removeAll(Collections.singleton(null));
        return z2;
    }
}
