package p204p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zmd0 {

    /* JADX INFO: renamed from: c */
    public static mg10 f284250c;

    /* JADX INFO: renamed from: a */
    public final Context f284251a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f284252b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public zmd0(Context context) {
        this.f284251a = context;
    }

    /* JADX INFO: renamed from: b */
    public static void m96426b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static mg10 m96427c() {
        mg10 mg10Var = f284250c;
        if (mg10Var != null) {
            return mg10Var;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    /* JADX INFO: renamed from: d */
    public static zmd0 m96428d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        m96426b();
        if (f284250c == null) {
            f284250c = new mg10(context.getApplicationContext());
        }
        ArrayList arrayList = f284250c.f143266h;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                zmd0 zmd0Var = new zmd0(context);
                arrayList.add(new WeakReference(zmd0Var));
                return zmd0Var;
            }
            zmd0 zmd0Var2 = (zmd0) ((WeakReference) arrayList.get(size)).get();
            if (zmd0Var2 == null) {
                arrayList.remove(size);
            } else if (zmd0Var2.f284251a == context) {
                return zmd0Var2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m96429f(ood0 ood0Var) {
        x610 x610Var;
        m96426b();
        mg10 mg10VarM96427c = m96427c();
        if (ood0Var != null) {
            mg10VarM96427c.getClass();
            x610Var = new x610(mg10VarM96427c, ood0Var);
        } else {
            x610Var = null;
        }
        x610 x610Var2 = mg10VarM96427c.f143257C;
        if (x610Var2 != null) {
            x610Var2.m90060i();
        }
        mg10VarM96427c.f143257C = x610Var;
        if (x610Var != null) {
            mg10VarM96427c.m61675n();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m96430g(bnx0 bnx0Var) {
        m96426b();
        old0 old0Var = m96427c().f143276r;
        if (old0Var == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        AbstractC1665af.m25765O(old0Var.f166832i, bnx0Var != null ? bnx0Var.m30069a() : null);
    }

    /* JADX INFO: renamed from: h */
    public static void m96431h(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        m96426b();
        mg10 mg10VarM96427c = m96427c();
        wmd0 wmd0VarM61664c = mg10VarM96427c.m61664c();
        if (mg10VarM96427c.m61669h() != wmd0VarM61664c) {
            mg10VarM96427c.m61672k(wmd0VarM61664c, i, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m96432a(omd0 omd0Var, qmd0 qmd0Var, int i) {
        rmd0 rmd0Var;
        omd0 omd0Var2;
        if (qmd0Var == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m96426b();
        ArrayList arrayList = this.f284252b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((rmd0) arrayList.get(i2)).f200503b == qmd0Var) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            rmd0Var = new rmd0(this, qmd0Var);
            arrayList.add(rmd0Var);
        } else {
            rmd0Var = (rmd0) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != rmd0Var.f200505d) {
            rmd0Var.f200505d = i;
            z = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        rmd0Var.f200506e = jElapsedRealtime;
        omd0 omd0Var3 = rmd0Var.f200504c;
        omd0Var3.m67344a();
        omd0Var.m67344a();
        if (omd0Var3.f167019b.containsAll(omd0Var.f167019b)) {
            z2 = z;
        } else {
            omd0 omd0Var4 = rmd0Var.f200504c;
            if (omd0Var4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            omd0Var4.m67344a();
            ArrayList<String> arrayList2 = !omd0Var4.f167019b.isEmpty() ? new ArrayList<>(omd0Var4.f167019b) : null;
            ArrayList<String> arrayListM67345b = omd0Var.m67345b();
            if (!arrayListM67345b.isEmpty()) {
                for (String str : arrayListM67345b) {
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                omd0Var2 = omd0.f167017c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                omd0Var2 = new omd0(bundle, arrayList2);
            }
            rmd0Var.f200504c = omd0Var2;
        }
        if (z2) {
            m96427c().m61674m();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m96433e(qmd0 qmd0Var) {
        if (qmd0Var == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m96426b();
        ArrayList arrayList = this.f284252b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((rmd0) arrayList.get(i)).f200503b == qmd0Var) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            m96427c().m61674m();
        }
    }
}
