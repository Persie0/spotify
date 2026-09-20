package p204p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class z691 implements Cloneable {

    /* JADX INFO: renamed from: Z0 */
    public static final Animator[] f279778Z0 = new Animator[0];

    /* JADX INFO: renamed from: a1 */
    public static final int[] f279779a1 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: b1 */
    public static final ajp0 f279780b1 = new ajp0();

    /* JADX INFO: renamed from: c1 */
    public static final ThreadLocal f279781c1 = new ThreadLocal();

    /* JADX INFO: renamed from: T0 */
    public zz11 f279790T0;

    /* JADX INFO: renamed from: U0 */
    public s800 f279791U0;

    /* JADX INFO: renamed from: W0 */
    public long f279793W0;

    /* JADX INFO: renamed from: X */
    public ArrayList f279794X;

    /* JADX INFO: renamed from: X0 */
    public t691 f279795X0;

    /* JADX INFO: renamed from: Y */
    public ArrayList f279796Y;

    /* JADX INFO: renamed from: Y0 */
    public long f279797Y0;

    /* JADX INFO: renamed from: Z */
    public x691[] f279798Z;

    /* JADX INFO: renamed from: a */
    public final String f279799a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f279800b = -1;

    /* JADX INFO: renamed from: c */
    public long f279801c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f279802d = null;

    /* JADX INFO: renamed from: e */
    public final ArrayList f279803e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f279804f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public a531 f279805g = new a531(14);

    /* JADX INFO: renamed from: h */
    public a531 f279806h = new a531(14);

    /* JADX INFO: renamed from: i */
    public ka91 f279807i = null;

    /* JADX INFO: renamed from: t */
    public final int[] f279808t = f279779a1;

    /* JADX INFO: renamed from: L0 */
    public final ArrayList f279782L0 = new ArrayList();

    /* JADX INFO: renamed from: M0 */
    public Animator[] f279783M0 = f279778Z0;

    /* JADX INFO: renamed from: N0 */
    public int f279784N0 = 0;

    /* JADX INFO: renamed from: O0 */
    public boolean f279785O0 = false;

    /* JADX INFO: renamed from: P0 */
    public boolean f279786P0 = false;

    /* JADX INFO: renamed from: Q0 */
    public z691 f279787Q0 = null;

    /* JADX INFO: renamed from: R0 */
    public ArrayList f279788R0 = null;

    /* JADX INFO: renamed from: S0 */
    public ArrayList f279789S0 = new ArrayList();

    /* JADX INFO: renamed from: V0 */
    public ajp0 f279792V0 = f279780b1;

    /* JADX INFO: renamed from: C */
    public static boolean m95480C(rb91 rb91Var, rb91 rb91Var2, String str) {
        Object obj = rb91Var.f197533a.get(str);
        Object obj2 = rb91Var2.f197533a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m95481d(a531 a531Var, View view, rb91 rb91Var) {
        uj5 uj5Var = (uj5) a531Var.f12414b;
        uj5 uj5Var2 = (uj5) a531Var.f12417e;
        SparseArray sparseArray = (SparseArray) a531Var.f12415c;
        w2b0 w2b0Var = (w2b0) a531Var.f12416d;
        uj5Var.put(view, rb91Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        String strM32542f = cec1.m32542f(view);
        if (strM32542f != null) {
            if (uj5Var2.containsKey(strM32542f)) {
                uj5Var2.put(strM32542f, null);
            } else {
                uj5Var2.put(strM32542f, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (w2b0Var.m87068d(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    w2b0Var.m87070g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) w2b0Var.m87067c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    w2b0Var.m87070g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static uj5 m95482v() {
        ThreadLocal threadLocal = f279781c1;
        uj5 uj5Var = (uj5) threadLocal.get();
        if (uj5Var != null) {
            return uj5Var;
        }
        uj5 uj5Var2 = new uj5(0);
        threadLocal.set(uj5Var2);
        return uj5Var2;
    }

    /* JADX INFO: renamed from: A */
    public boolean mo30250A(rb91 rb91Var, rb91 rb91Var2) {
        if (rb91Var != null && rb91Var2 != null) {
            String[] strArrMo30252w = mo30252w();
            if (strArrMo30252w != null) {
                for (String str : strArrMo30252w) {
                    if (m95480C(rb91Var, rb91Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = rb91Var.f197533a.keySet().iterator();
                while (it.hasNext()) {
                    if (m95480C(rb91Var, rb91Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m95483B(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f279803e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f279804f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: D */
    public final void m95484D(z691 z691Var, mjr0 mjr0Var, boolean z) {
        z691 z691Var2 = this.f279787Q0;
        if (z691Var2 != null) {
            z691Var2.m95484D(z691Var, mjr0Var, z);
        }
        ArrayList arrayList = this.f279788R0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f279788R0.size();
        x691[] x691VarArr = this.f279798Z;
        if (x691VarArr == null) {
            x691VarArr = new x691[size];
        }
        this.f279798Z = null;
        x691[] x691VarArr2 = (x691[]) this.f279788R0.toArray(x691VarArr);
        for (int i = 0; i < size; i++) {
            x691 x691Var = x691VarArr2[i];
            switch (mjr0Var.f144321a) {
                case 3:
                    x691Var.mo52769e(z691Var);
                    break;
                case 4:
                    x691Var.mo32233d(z691Var);
                    break;
                case 5:
                    x691Var.mo32231b(z691Var);
                    break;
                case 6:
                    x691Var.mo32230a();
                    break;
                default:
                    x691Var.mo32232c();
                    break;
            }
            x691VarArr2[i] = null;
        }
        this.f279798Z = x691VarArr2;
    }

    /* JADX INFO: renamed from: E */
    public void mo55872E(View view) {
        if (this.f279786P0) {
            return;
        }
        ArrayList arrayList = this.f279782L0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f279783M0);
        this.f279783M0 = f279778Z0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f279783M0 = animatorArr;
        m95484D(this, mjr0.f144319e, false);
        this.f279785O0 = true;
    }

    /* JADX INFO: renamed from: F */
    public void mo55873F() {
        uj5 uj5VarM95482v = m95482v();
        this.f279793W0 = 0L;
        for (int i = 0; i < this.f279789S0.size(); i++) {
            Animator animator = (Animator) this.f279789S0.get(i);
            o691 o691Var = (o691) uj5VarM95482v.get(animator);
            if (animator != null && o691Var != null) {
                Animator animator2 = o691Var.f162297f;
                long j = this.f279801c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.f279800b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f279802d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f279782L0.add(animator);
                this.f279793W0 = Math.max(this.f279793W0, c150.m31207A(animator));
            }
        }
        this.f279789S0.clear();
    }

    /* JADX INFO: renamed from: G */
    public z691 mo55874G(x691 x691Var) {
        z691 z691Var;
        ArrayList arrayList = this.f279788R0;
        if (arrayList != null) {
            if (!arrayList.remove(x691Var) && (z691Var = this.f279787Q0) != null) {
                z691Var.mo55874G(x691Var);
            }
            if (this.f279788R0.size() == 0) {
                this.f279788R0 = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: H */
    public void mo55875H(View view) {
        this.f279804f.remove(view);
    }

    /* JADX INFO: renamed from: I */
    public void mo55876I(View view) {
        if (this.f279785O0) {
            if (!this.f279786P0) {
                ArrayList arrayList = this.f279782L0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f279783M0);
                this.f279783M0 = f279778Z0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f279783M0 = animatorArr;
                m95484D(this, mjr0.f144320f, false);
            }
            this.f279785O0 = false;
        }
    }

    /* JADX INFO: renamed from: J */
    public void mo55877J() {
        m95485R();
        uj5 uj5VarM95482v = m95482v();
        for (Animator animator : this.f279789S0) {
            if (uj5VarM95482v.containsKey(animator)) {
                m95485R();
                if (animator != null) {
                    animator.addListener(new m691(this, uj5VarM95482v));
                    long j = this.f279801c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f279800b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f279802d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new n691(this));
                    animator.start();
                }
            }
        }
        this.f279789S0.clear();
        m95490r();
    }

    /* JADX INFO: renamed from: K */
    public void mo55878K(long j, long j2) {
        long j3 = this.f279793W0;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.f279786P0 = false;
            m95484D(this, mjr0.f144316b, z);
        }
        ArrayList arrayList = this.f279782L0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f279783M0);
        this.f279783M0 = f279778Z0;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            c150.m31213G(animator, Math.min(Math.max(0L, j), c150.m31207A(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.f279783M0 = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.f279786P0 = true;
        }
        m95484D(this, mjr0.f144317c, z);
    }

    /* JADX INFO: renamed from: L */
    public void mo55879L(long j) {
        this.f279801c = j;
    }

    /* JADX INFO: renamed from: M */
    public void mo55880M(s800 s800Var) {
        this.f279791U0 = s800Var;
    }

    /* JADX INFO: renamed from: N */
    public void mo55881N(TimeInterpolator timeInterpolator) {
        this.f279802d = timeInterpolator;
    }

    /* JADX INFO: renamed from: O */
    public void mo55882O(ajp0 ajp0Var) {
        if (ajp0Var == null) {
            this.f279792V0 = f279780b1;
        } else {
            this.f279792V0 = ajp0Var;
        }
    }

    /* JADX INFO: renamed from: P */
    public void mo55883P(zz11 zz11Var) {
        this.f279790T0 = zz11Var;
    }

    /* JADX INFO: renamed from: Q */
    public void mo55884Q(long j) {
        this.f279800b = j;
    }

    /* JADX INFO: renamed from: R */
    public final void m95485R() {
        if (this.f279784N0 == 0) {
            m95484D(this, mjr0.f144316b, false);
            this.f279786P0 = false;
        }
        this.f279784N0++;
    }

    /* JADX INFO: renamed from: S */
    public String mo55885S(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f279801c != -1) {
            sb.append("dur(");
            sb.append(this.f279801c);
            sb.append(") ");
        }
        if (this.f279800b != -1) {
            sb.append("dly(");
            sb.append(this.f279800b);
            sb.append(") ");
        }
        if (this.f279802d != null) {
            sb.append("interp(");
            sb.append(this.f279802d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f279803e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f279804f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public void m95486b(x691 x691Var) {
        if (this.f279788R0 == null) {
            this.f279788R0 = new ArrayList();
        }
        this.f279788R0.add(x691Var);
    }

    /* JADX INFO: renamed from: c */
    public z691 mo55893c(View view) {
        this.f279804f.add(view);
        return this;
    }

    public void cancel() {
        ArrayList arrayList = this.f279782L0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f279783M0);
        this.f279783M0 = f279778Z0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f279783M0 = animatorArr;
        m95484D(this, mjr0.f144318d, false);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo26147e(rb91 rb91Var);

    /* JADX INFO: renamed from: g */
    public final void m95487g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            rb91 rb91Var = new rb91(view);
            if (z) {
                mo26148i(rb91Var);
            } else {
                mo26147e(rb91Var);
            }
            rb91Var.f197535c.add(this);
            mo55894h(rb91Var);
            if (z) {
                m95481d(this.f279805g, view, rb91Var);
            } else {
                m95481d(this.f279806h, view, rb91Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m95487g(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo55894h(rb91 rb91Var) {
        HashMap map = rb91Var.f197533a;
        if (this.f279790T0 == null || map.isEmpty()) {
            return;
        }
        this.f279790T0.getClass();
        String[] strArr = zz11.f287818c;
        for (int i = 0; i < 2; i++) {
            if (!map.containsKey(strArr[i])) {
                this.f279790T0.m97253h(rb91Var);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo26148i(rb91 rb91Var);

    /* JADX INFO: renamed from: j */
    public final void m95488j(ViewGroup viewGroup, boolean z) {
        m95489k(z);
        ArrayList arrayList = this.f279803e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f279804f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m95487g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                rb91 rb91Var = new rb91(viewFindViewById);
                if (z) {
                    mo26148i(rb91Var);
                } else {
                    mo26147e(rb91Var);
                }
                rb91Var.f197535c.add(this);
                mo55894h(rb91Var);
                if (z) {
                    m95481d(this.f279805g, viewFindViewById, rb91Var);
                } else {
                    m95481d(this.f279806h, viewFindViewById, rb91Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            rb91 rb91Var2 = new rb91(view);
            if (z) {
                mo26148i(rb91Var2);
            } else {
                mo26147e(rb91Var2);
            }
            rb91Var2.f197535c.add(this);
            mo55894h(rb91Var2);
            if (z) {
                m95481d(this.f279805g, view, rb91Var2);
            } else {
                m95481d(this.f279806h, view, rb91Var2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m95489k(boolean z) {
        if (z) {
            ((uj5) this.f279805g.f12414b).clear();
            ((SparseArray) this.f279805g.f12415c).clear();
            ((w2b0) this.f279805g.f12416d).m87066b();
        } else {
            ((uj5) this.f279806h.f12414b).clear();
            ((SparseArray) this.f279806h.f12415c).clear();
            ((w2b0) this.f279806h.f12416d).m87066b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l */
    public z691 clone() {
        try {
            z691 z691Var = (z691) super.clone();
            z691Var.f279789S0 = new ArrayList();
            z691Var.f279805g = new a531(14);
            z691Var.f279806h = new a531(14);
            z691Var.f279794X = null;
            z691Var.f279796Y = null;
            z691Var.f279795X0 = null;
            z691Var.f279787Q0 = this;
            z691Var.f279788R0 = null;
            return z691Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public Animator mo30251m(ViewGroup viewGroup, rb91 rb91Var, rb91 rb91Var2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122 A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public void mo55896q(ViewGroup viewGroup, a531 a531Var, a531 a531Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo30251m;
        int i;
        boolean z;
        View view;
        rb91 rb91Var;
        zz11 zz11Var;
        Object obj;
        uj5 uj5VarM95482v = m95482v();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = m95492u().f279795X0 != null;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            rb91 rb91Var2 = (rb91) arrayList.get(i2);
            rb91 rb91Var3 = (rb91) arrayList2.get(i2);
            if (rb91Var2 != null && !rb91Var2.f197535c.contains(this)) {
                rb91Var2 = null;
            }
            if (rb91Var3 != null && !rb91Var3.f197535c.contains(this)) {
                rb91Var3 = null;
            }
            if (!(rb91Var2 == null && rb91Var3 == null) && ((rb91Var2 == null || rb91Var3 == null || mo30250A(rb91Var2, rb91Var3)) && (animatorMo30251m = mo30251m(viewGroup, rb91Var2, rb91Var3)) != null)) {
                String str = this.f279799a;
                if (rb91Var3 != null) {
                    view = rb91Var3.f197534b;
                    i = size;
                    String[] strArrMo30252w = mo30252w();
                    z = z2;
                    if (strArrMo30252w != null && strArrMo30252w.length > 0) {
                        rb91Var = new rb91(view);
                        i2 = i2;
                        rb91 rb91Var4 = (rb91) ((uj5) a531Var2.f12414b).get(view);
                        if (rb91Var4 != null) {
                            int i3 = 0;
                            while (i3 < strArrMo30252w.length) {
                                String str2 = strArrMo30252w[i3];
                                rb91Var.f197533a.put(str2, rb91Var4.f197533a.get(str2));
                                i3++;
                                strArrMo30252w = strArrMo30252w;
                            }
                        }
                        int i4 = uj5VarM95482v.f13976c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            o691 o691Var = (o691) uj5VarM95482v.get((Animator) uj5VarM95482v.m25312f(i5));
                            if (o691Var.f162294c != null && o691Var.f162292a == view && o691Var.f162293b.equals(str) && o691Var.f162294c.equals(rb91Var)) {
                                animatorMo30251m = null;
                                break;
                            }
                        }
                    }
                    if (animatorMo30251m == null) {
                        zz11Var = this.f279790T0;
                        if (zz11Var != null) {
                            long jM97256n = zz11Var.m97256n(viewGroup, this, rb91Var2, rb91Var3);
                            sparseIntArray.put(this.f279789S0.size(), (int) jM97256n);
                            jMin = Math.min(jM97256n, jMin);
                        }
                        WindowId windowId = viewGroup.getWindowId();
                        o691 o691Var2 = new o691();
                        o691Var2.f162292a = view;
                        o691Var2.f162293b = str;
                        o691Var2.f162294c = rb91Var;
                        o691Var2.f162295d = windowId;
                        o691Var2.f162296e = this;
                        o691Var2.f162297f = animatorMo30251m;
                        obj = animatorMo30251m;
                        if (z) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animatorMo30251m);
                            obj = animatorSet;
                        }
                        uj5VarM95482v.put(obj, o691Var2);
                        this.f279789S0.add(obj);
                    }
                } else {
                    i = size;
                    z = z2;
                    view = rb91Var2.f197534b;
                }
                rb91Var = null;
                if (animatorMo30251m == null) {
                    zz11Var = this.f279790T0;
                    if (zz11Var != null) {
                        long jM97256n2 = zz11Var.m97256n(viewGroup, this, rb91Var2, rb91Var3);
                        sparseIntArray.put(this.f279789S0.size(), (int) jM97256n2);
                        jMin = Math.min(jM97256n2, jMin);
                    }
                    WindowId windowId2 = viewGroup.getWindowId();
                    o691 o691Var3 = new o691();
                    o691Var3.f162292a = view;
                    o691Var3.f162293b = str;
                    o691Var3.f162294c = rb91Var;
                    o691Var3.f162295d = windowId2;
                    o691Var3.f162296e = this;
                    o691Var3.f162297f = animatorMo30251m;
                    obj = animatorMo30251m;
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(animatorMo30251m);
                        obj = animatorSet2;
                    }
                    uj5VarM95482v.put(obj, o691Var3);
                    this.f279789S0.add(obj);
                }
            } else {
                i = size;
                z = z2;
                i2 = i2;
            }
            i2++;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                o691 o691Var4 = (o691) uj5VarM95482v.get((Animator) this.f279789S0.get(sparseIntArray.keyAt(i6)));
                o691Var4.f162297f.setStartDelay(o691Var4.f162297f.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - jMin));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m95490r() {
        int i = this.f279784N0 - 1;
        this.f279784N0 = i;
        if (i == 0) {
            m95484D(this, mjr0.f144317c, false);
            for (int i2 = 0; i2 < ((w2b0) this.f279805g.f12416d).m87072i(); i2++) {
                View view = (View) ((w2b0) this.f279805g.f12416d).m87073j(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((w2b0) this.f279806h.f12416d).m87072i(); i3++) {
                View view2 = (View) ((w2b0) this.f279806h.f12416d).m87073j(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f279786P0 = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo55897s(ViewGroup viewGroup) {
        uj5 uj5VarM95482v = m95482v();
        int i = uj5VarM95482v.f13976c;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        uj5 uj5Var = new uj5(uj5VarM95482v);
        uj5VarM95482v.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            o691 o691Var = (o691) uj5Var.m25315i(i2);
            if (o691Var.f162292a != null && windowId.equals(o691Var.f162295d)) {
                ((Animator) uj5Var.m25312f(i2)).end();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final rb91 m95491t(View view, boolean z) {
        ka91 ka91Var = this.f279807i;
        if (ka91Var != null) {
            return ka91Var.m95491t(view, z);
        }
        ArrayList arrayList = z ? this.f279794X : this.f279796Y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            rb91 rb91Var = (rb91) arrayList.get(i);
            if (rb91Var == null) {
                return null;
            }
            if (rb91Var.f197534b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (rb91) (z ? this.f279796Y : this.f279794X).get(i);
        }
        return null;
    }

    public final String toString() {
        return mo55885S("");
    }

    /* JADX INFO: renamed from: u */
    public final z691 m95492u() {
        ka91 ka91Var = this.f279807i;
        return ka91Var != null ? ka91Var.m95492u() : this;
    }

    /* JADX INFO: renamed from: w */
    public String[] mo30252w() {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final rb91 m95493x(View view, boolean z) {
        ka91 ka91Var = this.f279807i;
        if (ka91Var != null) {
            return ka91Var.m95493x(view, z);
        }
        return (rb91) ((uj5) (z ? this.f279805g : this.f279806h).f12414b).get(view);
    }

    /* JADX INFO: renamed from: y */
    public boolean mo55898y() {
        return !this.f279782L0.isEmpty();
    }

    /* JADX INFO: renamed from: z */
    public boolean mo55854z() {
        return this instanceof wq21;
    }
}
