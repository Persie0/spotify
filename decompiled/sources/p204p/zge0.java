package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class zge0 implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f282599y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f282600a;

    /* JADX INFO: renamed from: b */
    public final Resources f282601b;

    /* JADX INFO: renamed from: c */
    public boolean f282602c;

    /* JADX INFO: renamed from: d */
    public final boolean f282603d;

    /* JADX INFO: renamed from: e */
    public xge0 f282604e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f282605f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f282606g;

    /* JADX INFO: renamed from: h */
    public boolean f282607h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f282608i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f282609j;

    /* JADX INFO: renamed from: k */
    public boolean f282610k;

    /* JADX INFO: renamed from: m */
    public CharSequence f282612m;

    /* JADX INFO: renamed from: n */
    public Drawable f282613n;

    /* JADX INFO: renamed from: o */
    public View f282614o;

    /* JADX INFO: renamed from: v */
    public lhe0 f282621v;

    /* JADX INFO: renamed from: x */
    public boolean f282623x;

    /* JADX INFO: renamed from: l */
    public int f282611l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f282615p = false;

    /* JADX INFO: renamed from: q */
    public boolean f282616q = false;

    /* JADX INFO: renamed from: r */
    public boolean f282617r = false;

    /* JADX INFO: renamed from: s */
    public boolean f282618s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f282619t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f282620u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f282622w = false;

    public zge0(Context context) {
        boolean zM72612f;
        boolean z = false;
        this.f282600a = context;
        Resources resources = context.getResources();
        this.f282601b = resources;
        this.f282605f = new ArrayList();
        this.f282606g = new ArrayList();
        this.f282607h = true;
        this.f282608i = new ArrayList();
        this.f282609j = new ArrayList();
        this.f282610k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = rec1.f198345a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM72612f = qec1.m72612f(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM72612f = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM72612f) {
                z = true;
            }
        }
        this.f282603d = z;
    }

    /* JADX INFO: renamed from: A */
    public final void m96060A() {
        if (this.f282615p) {
            return;
        }
        this.f282615p = true;
        this.f282616q = false;
        this.f282617r = false;
    }

    /* JADX INFO: renamed from: a */
    public final lhe0 m96061a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f282599y[i5] << 16) | (65535 & i3);
        lhe0 lhe0Var = new lhe0(this, i, i2, i3, i6, charSequence, this.f282611l);
        ArrayList arrayList = this.f282605f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((lhe0) arrayList.get(size)).f133531d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, lhe0Var);
                m96069q(true);
                return lhe0Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, lhe0Var);
        m96069q(true);
        return lhe0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m96061a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f282600a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            lhe0 lhe0VarM96061a = m96061a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            lhe0VarM96061a.setIcon(resolveInfo.loadIcon(packageManager));
            lhe0VarM96061a.f133534g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = lhe0VarM96061a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m96062b(hie0 hie0Var) {
        m96063c(hie0Var, this.f282600a);
    }

    /* JADX INFO: renamed from: c */
    public final void m96063c(hie0 hie0Var, Context context) {
        this.f282620u.add(new WeakReference(hie0Var));
        hie0Var.mo28113c(context, this);
        this.f282610k = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        lhe0 lhe0Var = this.f282621v;
        if (lhe0Var != null) {
            mo45457e(lhe0Var);
        }
        this.f282605f.clear();
        m96069q(true);
    }

    public final void clearHeader() {
        this.f282613n = null;
        this.f282612m = null;
        this.f282614o = null;
        m96069q(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m96064d(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m96064d(boolean z) {
        if (this.f282618s) {
            return;
        }
        this.f282618s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f282620u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            hie0 hie0Var = (hie0) weakReference.get();
            if (hie0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                hie0Var.mo28112b(this, z);
            }
        }
        this.f282618s = false;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo45457e(lhe0 lhe0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f282620u;
        boolean zMo28117g = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f282621v == lhe0Var) {
            m96060A();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                hie0 hie0Var = (hie0) weakReference.get();
                if (hie0Var != null) {
                    zMo28117g = hie0Var.mo28117g(lhe0Var);
                    if (zMo28117g) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m96077z();
            if (zMo28117g) {
                this.f282621v = null;
            }
        }
        return zMo28117g;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo45458f(zge0 zge0Var, lhe0 lhe0Var) {
        xge0 xge0Var = this.f282604e;
        return xge0Var != null && xge0Var.mo41783m(zge0Var, lhe0Var);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f282605f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lhe0 lhe0Var = (lhe0) arrayList.get(i2);
            if (lhe0Var.f133528a == i) {
                return lhe0Var;
            }
            if (lhe0Var.hasSubMenu() && (menuItemFindItem = lhe0Var.f133542o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo45459g(lhe0 lhe0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f282620u;
        boolean zMo28116f = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m96060A();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            hie0 hie0Var = (hie0) weakReference.get();
            if (hie0Var != null) {
                zMo28116f = hie0Var.mo28116f(lhe0Var);
                if (zMo28116f) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m96077z();
        if (zMo28116f) {
            this.f282621v = lhe0Var;
        }
        return zMo28116f;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f282605f.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final lhe0 m96065h(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f282619t;
        arrayList.clear();
        m96066i(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (lhe0) arrayList.get(0);
        }
        boolean zMo45463o = mo45463o();
        for (int i2 = 0; i2 < size; i2++) {
            lhe0 lhe0Var = (lhe0) arrayList.get(i2);
            char c = zMo45463o ? lhe0Var.f133537j : lhe0Var.f133535h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo45463o && c == '\b' && i == 67))) {
                return lhe0Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f282623x) {
            return true;
        }
        ArrayList arrayList = this.f282605f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lhe0) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m96066i(List list, int i, KeyEvent keyEvent) {
        boolean zMo45463o = mo45463o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f282605f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                lhe0 lhe0Var = (lhe0) arrayList.get(i2);
                if (lhe0Var.hasSubMenu()) {
                    lhe0Var.f133542o.m96066i(list, i, keyEvent);
                }
                char c = zMo45463o ? lhe0Var.f133537j : lhe0Var.f133535h;
                if ((modifiers & 69647) == ((zMo45463o ? lhe0Var.f133538k : lhe0Var.f133536i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo45463o && c == '\b' && i == 67)) && lhe0Var.isEnabled()) {
                        list.add(lhe0Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m96065h(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public final void m96067j() {
        ArrayList arrayListM96068m = m96068m();
        if (this.f282610k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f282620u;
            boolean zMo28118h = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                hie0 hie0Var = (hie0) weakReference.get();
                if (hie0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo28118h |= hie0Var.mo28118h();
                }
            }
            ArrayList arrayList = this.f282608i;
            ArrayList arrayList2 = this.f282609j;
            if (zMo28118h) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM96068m.size();
                for (int i = 0; i < size; i++) {
                    lhe0 lhe0Var = (lhe0) arrayListM96068m.get(i);
                    if ((lhe0Var.f133551x & 32) == 32) {
                        arrayList.add(lhe0Var);
                    } else {
                        arrayList2.add(lhe0Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m96068m());
            }
            this.f282610k = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public String mo45460k() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList m96068m() {
        boolean z = this.f282607h;
        ArrayList arrayList = this.f282606g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f282605f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            lhe0 lhe0Var = (lhe0) arrayList2.get(i);
            if (lhe0Var.isVisible()) {
                arrayList.add(lhe0Var);
            }
        }
        this.f282607h = false;
        this.f282610k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo45462n() {
        return this.f282622w;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo45463o() {
        return this.f282602c;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo45464p() {
        return this.f282603d;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m96071s(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        lhe0 lhe0VarM96065h = m96065h(i, keyEvent);
        boolean zM96071s = lhe0VarM96065h != null ? m96071s(lhe0VarM96065h, null, i2) : false;
        if ((i2 & 2) != 0) {
            m96064d(true);
        }
        return zM96071s;
    }

    /* JADX INFO: renamed from: q */
    public final void m96069q(boolean z) {
        if (this.f282615p) {
            this.f282616q = true;
            if (z) {
                this.f282617r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f282607h = true;
            this.f282610k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f282620u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m96060A();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            hie0 hie0Var = (hie0) weakReference.get();
            if (hie0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                hie0Var.mo28115e();
            }
        }
        m96077z();
    }

    /* JADX INFO: renamed from: r */
    public final void m96070r(lhe0 lhe0Var) {
        m96071s(lhe0Var, null, 4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f282605f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((lhe0) arrayList.get(i3)).f133529b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((lhe0) arrayList.get(i3)).f133529b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m96069q(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f282605f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((lhe0) arrayList.get(i2)).f133528a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m96069q(true);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m96071s(MenuItem menuItem, hie0 hie0Var, int i) {
        lhe0 lhe0Var = (lhe0) menuItem;
        boolean zMo28119i = false;
        if (lhe0Var == null || !lhe0Var.isEnabled()) {
            return false;
        }
        boolean zM58972f = lhe0Var.m58972f();
        q50 q50Var = lhe0Var.f133525A;
        boolean z = q50Var != null && q50Var.mo64474a();
        if (lhe0Var.m58971e()) {
            boolean zExpandActionView = lhe0Var.expandActionView() | zM58972f;
            if (zExpandActionView) {
                m96064d(true);
            }
            return zExpandActionView;
        }
        if (!lhe0Var.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                m96064d(true);
            }
            return zM58972f;
        }
        if ((i & 4) == 0) {
            m96064d(false);
        }
        if (!lhe0Var.hasSubMenu()) {
            gr51 gr51Var = new gr51(this.f282600a, this, lhe0Var);
            lhe0Var.f133542o = gr51Var;
            gr51Var.setHeaderTitle(lhe0Var.f133532e);
        }
        gr51 gr51Var2 = lhe0Var.f133542o;
        if (z) {
            q50Var.mo64478e(gr51Var2);
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f282620u;
        if (!copyOnWriteArrayList.isEmpty()) {
            zMo28119i = hie0Var != null ? hie0Var.mo28119i(gr51Var2) : false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                hie0 hie0Var2 = (hie0) weakReference.get();
                if (hie0Var2 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else if (!zMo28119i) {
                    zMo28119i = hie0Var2.mo28119i(gr51Var2);
                }
            }
        }
        boolean z2 = zM58972f | zMo28119i;
        if (!z2) {
            m96064d(true);
        }
        return z2;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f282605f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lhe0 lhe0Var = (lhe0) arrayList.get(i2);
            if (lhe0Var.f133529b == i) {
                lhe0Var.f133551x = (lhe0Var.f133551x & (-5)) | (z2 ? 4 : 0);
                lhe0Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f282622w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f282605f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lhe0 lhe0Var = (lhe0) arrayList.get(i2);
            if (lhe0Var.f133529b == i) {
                lhe0Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f282605f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            lhe0 lhe0Var = (lhe0) arrayList.get(i2);
            if (lhe0Var.f133529b == i) {
                int i3 = lhe0Var.f133551x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                lhe0Var.f133551x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m96069q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f282602c = z;
        m96069q(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f282605f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m96072t(hie0 hie0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f282620u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            hie0 hie0Var2 = (hie0) weakReference.get();
            if (hie0Var2 == null || hie0Var2 == hie0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m96073u(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo45460k());
        int size = this.f282605f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((gr51) item.getSubMenu()).m96073u(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: v */
    public final void m96074v(Bundle bundle) {
        int size = this.f282605f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((gr51) item.getSubMenu()).m96074v(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo45460k(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo45465w(xge0 xge0Var) {
        this.f282604e = xge0Var;
    }

    /* JADX INFO: renamed from: x */
    public final void m96075x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f282614o = view;
            this.f282612m = null;
            this.f282613n = null;
        } else {
            if (i > 0) {
                this.f282612m = this.f282601b.getText(i);
            } else if (charSequence != null) {
                this.f282612m = charSequence;
            }
            if (i2 > 0) {
                this.f282613n = this.f282600a.getDrawable(i2);
            } else if (drawable != null) {
                this.f282613n = drawable;
            }
            this.f282614o = null;
        }
        m96069q(false);
    }

    /* JADX INFO: renamed from: y */
    public final void m96076y(boolean z) {
        this.f282623x = z;
    }

    /* JADX INFO: renamed from: z */
    public final void m96077z() {
        this.f282615p = false;
        if (this.f282616q) {
            this.f282616q = false;
            m96069q(this.f282617r);
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m96061a(0, 0, 0, this.f282601b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f282601b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m96061a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        lhe0 lhe0VarM96061a = m96061a(i, i2, i3, charSequence);
        gr51 gr51Var = new gr51(this.f282600a, this, lhe0VarM96061a);
        lhe0VarM96061a.f133542o = gr51Var;
        gr51Var.setHeaderTitle(lhe0VarM96061a.f133532e);
        return gr51Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m96061a(i, i2, i3, this.f282601b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f282601b.getString(i4));
    }

    /* JADX INFO: renamed from: l */
    public zge0 mo45461l() {
        return this;
    }
}
