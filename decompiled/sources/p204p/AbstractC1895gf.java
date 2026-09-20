package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.camera2.CameraDevice;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.List;

/* JADX INFO: renamed from: p.gf */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1895gf {

    /* JADX INFO: renamed from: a */
    public Object f79242a;

    /* JADX INFO: renamed from: b */
    public Object f79243b;

    public /* synthetic */ AbstractC1895gf(Object obj, Object obj2) {
        this.f79242a = obj;
        this.f79243b = obj2;
    }

    /* JADX INFO: renamed from: o */
    public static void m44546o(AbstractC1895gf abstractC1895gf, j6j j6jVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0;
        }
        if ((i & 4) != 0) {
            f2 = 0;
        }
        abstractC1895gf.m44558n(j6jVar, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public void m44547c() {
        o4a o4aVar = (o4a) this.f79242a;
        if (o4aVar != null) {
            try {
                ((l65) this.f79243b).f130200X.unregisterReceiver(o4aVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f79242a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract IntentFilter mo44548d();

    /* JADX INFO: renamed from: e */
    public abstract int[] mo44549e(int i);

    /* JADX INFO: renamed from: f */
    public qte m44550f() {
        return (qte) this.f79243b;
    }

    /* JADX INFO: renamed from: g */
    public Bundle m44551g() {
        return (Bundle) this.f79243b;
    }

    public Intent getIntent() {
        return (Intent) this.f79243b;
    }

    /* JADX INFO: renamed from: h */
    public abstract List mo44552h();

    /* JADX INFO: renamed from: i */
    public MenuItem m44553i(MenuItem menuItem) {
        if (!(menuItem instanceof s561)) {
            return menuItem;
        }
        s561 s561Var = (s561) menuItem;
        if (((ab21) this.f79243b) == null) {
            this.f79243b = new ab21(0);
        }
        MenuItem menuItem2 = (MenuItem) ((ab21) this.f79243b).get(s561Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        qhe0 qhe0Var = new qhe0((Context) this.f79242a, s561Var);
        ((ab21) this.f79243b).put(s561Var, qhe0Var);
        return qhe0Var;
    }

    /* JADX INFO: renamed from: j */
    public String m44554j() {
        return (String) this.f79242a;
    }

    /* JADX INFO: renamed from: k */
    public int[] m44555k(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f79243b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: l */
    public String m44556l() {
        String str = (String) this.f79242a;
        if (str != null) {
            return str;
        }
        wj50.m88260d0("text");
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public String m44557m() {
        return (String) this.f79242a;
    }

    /* JADX INFO: renamed from: n */
    public void m44558n(j6j j6jVar, float f, float f2) {
        int i = j6jVar.f109327b;
        String str = "top";
        if (i != 0 && i == 1) {
            str = "bottom";
        }
        ova ovaVar = new ova(new char[0]);
        ovaVar.m71126m(wva.m89079m(j6jVar.f109326a.toString()));
        ovaVar.m71126m(wva.m89079m(str));
        ovaVar.m71126m(new sva(f));
        ovaVar.m71126m(new sva(f2));
        ((uva) this.f79243b).m71122H((String) this.f79242a, ovaVar);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo44559p();

    /* JADX INFO: renamed from: q */
    public abstract int[] mo44560q(int i);

    /* JADX INFO: renamed from: r */
    public void m44561r() {
        m44547c();
        IntentFilter intentFilterMo44548d = mo44548d();
        if (intentFilterMo44548d.countActions() == 0) {
            return;
        }
        if (((o4a) this.f79242a) == null) {
            this.f79242a = new o4a(this, 2);
        }
        ((l65) this.f79243b).f130200X.registerReceiver((o4a) this.f79242a, intentFilterMo44548d);
    }

    /* JADX INFO: renamed from: s */
    public abstract String mo40107s();

    public AbstractC1895gf(Context context) {
        this.f79242a = context;
    }

    public AbstractC1895gf(CameraDevice cameraDevice, afb afbVar) {
        cameraDevice.getClass();
        this.f79242a = cameraDevice;
        this.f79243b = afbVar;
    }

    public AbstractC1895gf() {
        this.f79243b = new int[2];
    }

    public AbstractC1895gf(int i, uva uvaVar) {
        this.f79243b = uvaVar;
        String str = "top";
        if (i != 0 && i == 1) {
            str = "bottom";
        }
        this.f79242a = str;
    }

    public AbstractC1895gf(l65 l65Var) {
        this.f79243b = l65Var;
    }
}
