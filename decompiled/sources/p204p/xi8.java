package p204p;

import android.os.Bundle;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xi8 implements y600 {

    /* JADX INFO: renamed from: a */
    public final a600 f261793a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f261794b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f261795c;

    /* JADX INFO: renamed from: d */
    public int f261796d;

    /* JADX INFO: renamed from: e */
    public int f261797e;

    /* JADX INFO: renamed from: f */
    public int f261798f;

    /* JADX INFO: renamed from: g */
    public int f261799g;

    /* JADX INFO: renamed from: h */
    public int f261800h;

    /* JADX INFO: renamed from: i */
    public boolean f261801i;

    /* JADX INFO: renamed from: j */
    public boolean f261802j;

    /* JADX INFO: renamed from: k */
    public String f261803k;

    /* JADX INFO: renamed from: l */
    public int f261804l;

    /* JADX INFO: renamed from: m */
    public CharSequence f261805m;

    /* JADX INFO: renamed from: n */
    public int f261806n;

    /* JADX INFO: renamed from: o */
    public CharSequence f261807o;

    /* JADX INFO: renamed from: p */
    public ArrayList f261808p;

    /* JADX INFO: renamed from: q */
    public ArrayList f261809q;

    /* JADX INFO: renamed from: r */
    public boolean f261810r;

    /* JADX INFO: renamed from: s */
    public ArrayList f261811s;

    /* JADX INFO: renamed from: t */
    public final c700 f261812t;

    /* JADX INFO: renamed from: u */
    public boolean f261813u;

    /* JADX INFO: renamed from: v */
    public int f261814v;

    /* JADX INFO: renamed from: w */
    public boolean f261815w;

    /* JADX WARN: Illegal instructions before constructor call */
    public xi8(c700 c700Var) {
        a600 a600VarM31608M = c700Var.m31608M();
        c600 c600Var = c700Var.f34689x;
        this(a600VarM31608M, c600Var != null ? c600Var.f34324L0.getClassLoader() : null);
        this.f261814v = -1;
        this.f261815w = false;
        this.f261812t = c700Var;
    }

    @Override // p204p.y600
    /* JADX INFO: renamed from: a */
    public final boolean mo24881a(ArrayList arrayList, ArrayList arrayList2) {
        if (c700.m31595O(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f261801i) {
            return true;
        }
        this.f261812t.f34669d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m91091b(j800 j800Var) {
        this.f261795c.add(j800Var);
        j800Var.f109753d = this.f261796d;
        j800Var.f109754e = this.f261797e;
        j800Var.f109755f = this.f261798f;
        j800Var.f109756g = this.f261799g;
    }

    /* JADX INFO: renamed from: c */
    public final void m91092c(String str) {
        if (!this.f261802j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f261801i = true;
        this.f261803k = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m91093d(int i) {
        if (this.f261801i) {
            if (c700.m31595O(2)) {
                toString();
            }
            ArrayList arrayList = this.f261795c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                j800 j800Var = (j800) arrayList.get(i2);
                i500 i500Var = j800Var.f109751b;
                if (i500Var != null) {
                    i500Var.f98679R0 += i;
                    if (c700.m31595O(2)) {
                        Objects.toString(j800Var.f109751b);
                        int i3 = j800Var.f109751b.f98679R0;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m91094e() {
        ArrayList arrayList = this.f261795c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            j800 j800Var = (j800) arrayList.get(size);
            if (j800Var.f109752c) {
                if (j800Var.f109750a == 8) {
                    j800Var.f109752c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = j800Var.f109751b.f98686X0;
                    j800Var.f109750a = 2;
                    j800Var.f109752c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        j800 j800Var2 = (j800) arrayList.get(i2);
                        if (j800Var2.f109752c && j800Var2.f109751b.f98686X0 == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m91095f() {
        m91096g(false, true);
    }

    /* JADX INFO: renamed from: g */
    public final int m91096g(boolean z, boolean z2) {
        if (this.f261813u) {
            throw new IllegalStateException("commit already called");
        }
        if (c700.m31595O(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new qqa0());
            m91101l("  ", printWriter, true);
            printWriter.close();
        }
        this.f261813u = true;
        boolean z3 = this.f261801i;
        c700 c700Var = this.f261812t;
        if (z3) {
            this.f261814v = c700Var.f34676k.getAndIncrement();
        } else {
            this.f261814v = -1;
        }
        if (z2) {
            c700Var.m31656x(this, z);
        }
        return this.f261814v;
    }

    /* JADX INFO: renamed from: h */
    public final void m91097h() {
        if (this.f261801i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f261802j = false;
        this.f261812t.m31599A(this, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m91098i() {
        if (this.f261801i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f261802j = false;
        this.f261812t.m31599A(this, true);
    }

    /* JADX INFO: renamed from: j */
    public final i500 m91099j(Bundle bundle, Class cls) {
        a600 a600Var = this.f261793a;
        if (a600Var == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f261794b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        i500 i500VarMo24828a = a600Var.mo24828a(classLoader, cls.getName());
        if (bundle != null) {
            i500VarMo24828a.m49706b1(bundle);
        }
        return i500VarMo24828a;
    }

    /* JADX INFO: renamed from: k */
    public final void m91100k(int i, i500 i500Var, String str, int i2) {
        String str2 = i500Var.f98714o1;
        if (str2 != null) {
            i800.m49891c(str2, i500Var);
        }
        Class<?> cls = i500Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = i500Var.f98688Y0;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(i500Var);
                sb.append(": was ");
                throw new IllegalStateException(dq60.m36618r(sb, i500Var.f98688Y0, " now ", str));
            }
            i500Var.f98688Y0 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + i500Var + " with tag " + str + " to container view with no id");
            }
            int i3 = i500Var.f98684W0;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + i500Var + ": was " + i500Var.f98684W0 + " now " + i);
            }
            i500Var.f98684W0 = i;
            i500Var.f98686X0 = i;
        }
        m91091b(new j800(i2, i500Var));
        i500Var.f98680S0 = this.f261812t;
    }

    /* JADX INFO: renamed from: l */
    public final void m91101l(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f261803k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f261814v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f261813u);
            if (this.f261800h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f261800h));
            }
            if (this.f261796d != 0 || this.f261797e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f261796d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f261797e));
            }
            if (this.f261798f != 0 || this.f261799g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f261798f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f261799g));
            }
            if (this.f261804l != 0 || this.f261805m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f261804l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f261805m);
            }
            if (this.f261806n != 0 || this.f261807o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f261806n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f261807o);
            }
        }
        ArrayList arrayList = this.f261795c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j800 j800Var = (j800) arrayList.get(i);
            switch (j800Var.f109750a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + j800Var.f109750a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(j800Var.f109751b);
            if (z) {
                if (j800Var.f109753d != 0 || j800Var.f109754e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(j800Var.f109753d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(j800Var.f109754e));
                }
                if (j800Var.f109755f != 0 || j800Var.f109756g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(j800Var.f109755f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(j800Var.f109756g));
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m91102m(i500 i500Var) {
        c700 c700Var = i500Var.f98680S0;
        if (c700Var == null || c700Var == this.f261812t) {
            m91091b(new j800(3, i500Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + i500Var.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: renamed from: n */
    public final void m91103n(int i, i500 i500Var, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m91100k(i, i500Var, str, 2);
    }

    /* JADX INFO: renamed from: o */
    public final void m91104o(int i, int i2, int i3, int i4) {
        this.f261796d = i;
        this.f261797e = i2;
        this.f261798f = i3;
        this.f261799g = i4;
    }

    /* JADX INFO: renamed from: p */
    public final void m91105p(i500 i500Var) {
        c700 c700Var = i500Var.f98680S0;
        if (c700Var == null || c700Var == this.f261812t) {
            m91091b(new j800(8, i500Var));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + i500Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f261814v >= 0) {
            sb.append(" #");
            sb.append(this.f261814v);
        }
        if (this.f261803k != null) {
            sb.append(" ");
            sb.append(this.f261803k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xi8(xi8 xi8Var) {
        a600 a600VarM31608M = xi8Var.f261812t.m31608M();
        c600 c600Var = xi8Var.f261812t.f34689x;
        this(a600VarM31608M, c600Var != null ? c600Var.f34324L0.getClassLoader() : null);
        for (j800 j800Var : xi8Var.f261795c) {
            ArrayList arrayList = this.f261795c;
            j800 j800Var2 = new j800();
            j800Var2.f109750a = j800Var.f109750a;
            j800Var2.f109751b = j800Var.f109751b;
            j800Var2.f109752c = j800Var.f109752c;
            j800Var2.f109753d = j800Var.f109753d;
            j800Var2.f109754e = j800Var.f109754e;
            j800Var2.f109755f = j800Var.f109755f;
            j800Var2.f109756g = j800Var.f109756g;
            j800Var2.f109757h = j800Var.f109757h;
            j800Var2.f109758i = j800Var.f109758i;
            arrayList.add(j800Var2);
        }
        this.f261796d = xi8Var.f261796d;
        this.f261797e = xi8Var.f261797e;
        this.f261798f = xi8Var.f261798f;
        this.f261799g = xi8Var.f261799g;
        this.f261800h = xi8Var.f261800h;
        this.f261801i = xi8Var.f261801i;
        this.f261802j = xi8Var.f261802j;
        this.f261803k = xi8Var.f261803k;
        this.f261806n = xi8Var.f261806n;
        this.f261807o = xi8Var.f261807o;
        this.f261804l = xi8Var.f261804l;
        this.f261805m = xi8Var.f261805m;
        if (xi8Var.f261808p != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f261808p = arrayList2;
            arrayList2.addAll(xi8Var.f261808p);
        }
        if (xi8Var.f261809q != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f261809q = arrayList3;
            arrayList3.addAll(xi8Var.f261809q);
        }
        this.f261810r = xi8Var.f261810r;
        this.f261814v = -1;
        this.f261815w = false;
        this.f261812t = xi8Var.f261812t;
        this.f261813u = xi8Var.f261813u;
        this.f261814v = xi8Var.f261814v;
        this.f261815w = xi8Var.f261815w;
    }

    public xi8(a600 a600Var, ClassLoader classLoader) {
        this.f261795c = new ArrayList();
        this.f261802j = true;
        this.f261810r = false;
        this.f261793a = a600Var;
        this.f261794b = classLoader;
    }
}
