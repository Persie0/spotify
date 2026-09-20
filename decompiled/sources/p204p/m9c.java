package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.spotify.music.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m9c extends whe0 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: L0 */
    public View f141247L0;

    /* JADX INFO: renamed from: M0 */
    public View f141248M0;

    /* JADX INFO: renamed from: N0 */
    public int f141249N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f141250O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f141251P0;

    /* JADX INFO: renamed from: Q0 */
    public int f141252Q0;

    /* JADX INFO: renamed from: R0 */
    public int f141253R0;

    /* JADX INFO: renamed from: T0 */
    public boolean f141255T0;

    /* JADX INFO: renamed from: U0 */
    public gie0 f141256U0;

    /* JADX INFO: renamed from: V0 */
    public ViewTreeObserver f141257V0;

    /* JADX INFO: renamed from: W0 */
    public PopupWindow.OnDismissListener f141258W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f141260X0;

    /* JADX INFO: renamed from: b */
    public final Context f141263b;

    /* JADX INFO: renamed from: c */
    public final int f141264c;

    /* JADX INFO: renamed from: d */
    public final int f141265d;

    /* JADX INFO: renamed from: e */
    public final boolean f141266e;

    /* JADX INFO: renamed from: f */
    public final Handler f141267f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f141268g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f141269h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final zx1 f141270i = new zx1(this, 3);

    /* JADX INFO: renamed from: t */
    public final ay1 f141271t = new ay1(this, 2);

    /* JADX INFO: renamed from: X */
    public final vk9 f141259X = new vk9(this, 8);

    /* JADX INFO: renamed from: Y */
    public int f141261Y = 0;

    /* JADX INFO: renamed from: Z */
    public int f141262Z = 0;

    /* JADX INFO: renamed from: S0 */
    public boolean f141254S0 = false;

    public m9c(Context context, View view, int i, boolean z) {
        this.f141263b = context;
        this.f141247L0 = view;
        this.f141265d = i;
        this.f141266e = z;
        WeakHashMap weakHashMap = mec1.f142677a;
        this.f141249N0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f141264c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f141267f = new Handler();
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: a */
    public final boolean mo42574a() {
        ArrayList arrayList = this.f141269h;
        return arrayList.size() > 0 && ((l9c) arrayList.get(0)).f131055a.f118567W0.isShowing();
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: b */
    public final void mo28112b(zge0 zge0Var, boolean z) {
        ArrayList arrayList = this.f141269h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (zge0Var == ((l9c) arrayList.get(i)).f131056b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((l9c) arrayList.get(i2)).f131056b.m96064d(false);
        }
        l9c l9cVar = (l9c) arrayList.remove(i);
        zge0 zge0Var2 = l9cVar.f131056b;
        die0 die0Var = l9cVar.f131055a;
        v65 v65Var = die0Var.f118567W0;
        zge0Var2.m96072t(this);
        if (this.f141260X0) {
            zhe0.m96127b(v65Var, null);
            v65Var.setAnimationStyle(0);
        }
        die0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f141249N0 = ((l9c) arrayList.get(size2 - 1)).f131057c;
        } else {
            View view = this.f141247L0;
            WeakHashMap weakHashMap = mec1.f142677a;
            this.f141249N0 = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((l9c) arrayList.get(0)).f131056b.m96064d(false);
                return;
            }
            return;
        }
        dismiss();
        gie0 gie0Var = this.f141256U0;
        if (gie0Var != null) {
            gie0Var.mo29244b(zge0Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.f141257V0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f141257V0.removeGlobalOnLayoutListener(this.f141270i);
            }
            this.f141257V0 = null;
        }
        this.f141248M0.removeOnAttachStateChangeListener(this.f141271t);
        this.f141258W0.onDismiss();
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: d */
    public final void mo28114d(gie0 gie0Var) {
        this.f141256U0 = gie0Var;
    }

    @Override // p204p.ft11
    public final void dismiss() {
        ArrayList arrayList = this.f141269h;
        int size = arrayList.size();
        if (size > 0) {
            l9c[] l9cVarArr = (l9c[]) arrayList.toArray(new l9c[size]);
            for (int i = size - 1; i >= 0; i--) {
                l9c l9cVar = l9cVarArr[i];
                if (l9cVar.f131055a.f118567W0.isShowing()) {
                    l9cVar.f131055a.dismiss();
                }
            }
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: e */
    public final void mo28115e() {
        Iterator it = this.f141269h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((l9c) it.next()).f131055a.f118573c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((wge0) adapter).notifyDataSetChanged();
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: h */
    public final boolean mo28118h() {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: i */
    public final boolean mo28119i(gr51 gr51Var) {
        for (l9c l9cVar : this.f141269h) {
            if (gr51Var == l9cVar.f131056b) {
                l9cVar.f131055a.f118573c.requestFocus();
                return true;
            }
        }
        if (!gr51Var.hasVisibleItems()) {
            return false;
        }
        mo61202j(gr51Var);
        gie0 gie0Var = this.f141256U0;
        if (gie0Var != null) {
            gie0Var.mo29245f(gr51Var);
        }
        return true;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: j */
    public final void mo61202j(zge0 zge0Var) {
        zge0Var.m96063c(this, this.f141263b);
        if (mo42574a()) {
            m61210u(zge0Var);
        } else {
            this.f141268g.add(zge0Var);
        }
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: l */
    public final void mo61203l(View view) {
        if (this.f141247L0 != view) {
            this.f141247L0 = view;
            int i = this.f141261Y;
            WeakHashMap weakHashMap = mec1.f142677a;
            this.f141262Z = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: m */
    public final void mo42575m() {
        if (mo42574a()) {
            return;
        }
        ArrayList arrayList = this.f141268g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m61210u((zge0) it.next());
        }
        arrayList.clear();
        View view = this.f141247L0;
        this.f141248M0 = view;
        if (view != null) {
            boolean z = this.f141257V0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f141257V0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f141270i);
            }
            this.f141248M0.addOnAttachStateChangeListener(this.f141271t);
        }
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: n */
    public final rhs mo42576n() {
        ArrayList arrayList = this.f141269h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((l9c) edb.m38559h(1, arrayList)).f131055a.f118573c;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: o */
    public final void mo61204o(boolean z) {
        this.f141254S0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        l9c l9cVar;
        ArrayList arrayList = this.f141269h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                l9cVar = null;
                break;
            }
            l9cVar = (l9c) arrayList.get(i);
            if (!l9cVar.f131055a.f118567W0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (l9cVar != null) {
            l9cVar.f131056b.m96064d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: p */
    public final void mo61205p(int i) {
        if (this.f141261Y != i) {
            this.f141261Y = i;
            View view = this.f141247L0;
            WeakHashMap weakHashMap = mec1.f142677a;
            this.f141262Z = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: q */
    public final void mo61206q(int i) {
        this.f141250O0 = true;
        this.f141252Q0 = i;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: r */
    public final void mo61207r(PopupWindow.OnDismissListener onDismissListener) {
        this.f141258W0 = onDismissListener;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: s */
    public final void mo61208s(boolean z) {
        this.f141255T0 = z;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: t */
    public final void mo61209t(int i) {
        this.f141251P0 = true;
        this.f141253R0 = i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:111:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b4 A[PHI: r5
      0x01b4: PHI (r5v17 int) = (r5v9 int), (r5v18 int) binds: [B:88:0x01b6, B:86:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    /* JADX INFO: renamed from: u */
    public final void m61210u(zge0 zge0Var) {
        boolean z;
        int i;
        l9c l9cVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i2;
        v65 v65Var;
        rhs rhsVar;
        int[] iArr;
        Rect rect3;
        int i3;
        boolean z2;
        int[] iArr2;
        int[] iArr3;
        int i4;
        int i5;
        int width;
        Method method;
        MenuItem item;
        wge0 wge0Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f141263b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        wge0 wge0Var2 = new wge0(zge0Var, layoutInflaterFrom, this.f141266e, R.layout.abc_cascading_menu_item_layout);
        if (!mo42574a() && this.f141254S0) {
            wge0Var2.f251048c = true;
        } else if (mo42574a()) {
            int size = zge0Var.f282605f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = zge0Var.getItem(i6);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i6++;
            }
            wge0Var2.f251048c = z;
        }
        int iM88127k = whe0.m88127k(wge0Var2, context, this.f141264c);
        die0 die0Var = new die0(context, null, this.f141265d, 0);
        die0Var.f49334Z0 = this.f141259X;
        die0Var.f118558N0 = this;
        die0Var.f118567W0.setOnDismissListener(this);
        die0Var.f118557M0 = this.f141247L0;
        die0Var.f118569Y = this.f141262Z;
        die0Var.f118566V0 = true;
        die0Var.f118567W0.setFocusable(true);
        die0Var.f118567W0.setInputMethodMode(2);
        die0Var.mo40959k(wge0Var2);
        die0Var.m55159r(iM88127k);
        die0Var.f118569Y = this.f141262Z;
        ArrayList arrayList = this.f141269h;
        if (arrayList.size() > 0) {
            l9cVar = (l9c) edb.m38559h(1, arrayList);
            zge0 zge0Var2 = l9cVar.f131056b;
            int size2 = zge0Var2.f282605f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    item = null;
                    break;
                }
                item = zge0Var2.getItem(i7);
                if (item.hasSubMenu() && zge0Var == item.getSubMenu()) {
                    break;
                } else {
                    i7++;
                }
            }
            if (item == null) {
                i = 1;
                childAt = null;
            } else {
                rhs rhsVar2 = l9cVar.f131055a.f118573c;
                ListAdapter adapter = rhsVar2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    wge0Var = (wge0) headerViewListAdapter.getWrappedAdapter();
                } else {
                    wge0Var = (wge0) adapter;
                    headersCount = 0;
                }
                int count = wge0Var.getCount();
                i = 1;
                int i8 = 0;
                while (true) {
                    if (i8 >= count) {
                        i8 = -1;
                        break;
                    } else if (item == wge0Var.getItem(i8)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 != -1 && (firstVisiblePosition = (i8 + headersCount) - rhsVar2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < rhsVar2.getChildCount()) {
                    childAt = rhsVar2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i2 = Build.VERSION.SDK_INT;
                v65Var = die0Var.f118567W0;
                if (i2 <= 28) {
                    method = die0.f49333a1;
                    if (method != null) {
                        try {
                            method.invoke(v65Var, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    aie0.m26097a(v65Var, false);
                }
                zhe0.m96126a(die0Var.f118567W0, null);
                rhsVar = ((l9c) arrayList.get(arrayList.size() - 1)).f131055a.f118573c;
                iArr = new int[2];
                rhsVar.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f141248M0.getWindowVisibleDisplayFrame(rect3);
                if (this.f141249N0 == i) {
                    if (rhsVar.getWidth() + iArr[0] + iM88127k > rect3.right) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                } else if (iArr[0] - iM88127k < 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i3 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f141249N0 = i3;
                if (Build.VERSION.SDK_INT >= 26) {
                    die0Var.f118557M0 = childAt;
                    i5 = 0;
                    i4 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f141247L0.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f141262Z & 7) == 5) {
                        iArr2[0] = this.f141247L0.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i4 = iArr3[0] - iArr2[0];
                    i5 = iArr3[1] - iArr2[1];
                }
                if ((this.f141262Z & 5) == 5) {
                    if (z2) {
                        width = i4 + iM88127k;
                    } else {
                        iM88127k = childAt.getWidth();
                        width = i4 - iM88127k;
                    }
                } else if (z2) {
                    width = i4 + childAt.getWidth();
                } else {
                    width = i4 - iM88127k;
                }
                die0Var.f118576f = width;
                die0Var.f118568X = true;
                die0Var.f118580t = true;
                die0Var.m55156g(i5);
            } else {
                if (this.f141250O0) {
                    die0Var.f118576f = this.f141252Q0;
                }
                if (this.f141251P0) {
                    die0Var.m55156g(this.f141253R0);
                }
                rect = this.f251340a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                die0Var.f118565U0 = rect2;
            }
            arrayList.add(new l9c(die0Var, zge0Var, this.f141249N0));
            die0Var.mo42575m();
            rhs rhsVar3 = die0Var.f118573c;
            rhsVar3.setOnKeyListener(this);
            if (l9cVar == null || !this.f141255T0 || zge0Var.f282612m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) rhsVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(zge0Var.f282612m);
            rhsVar3.addHeaderView(frameLayout, null, false);
            die0Var.mo42575m();
            return;
        }
        i = 1;
        l9cVar = null;
        childAt = null;
        if (childAt != null) {
            i2 = Build.VERSION.SDK_INT;
            v65Var = die0Var.f118567W0;
            if (i2 <= 28) {
                method = die0.f49333a1;
                if (method != null) {
                    method.invoke(v65Var, Boolean.FALSE);
                }
            } else {
                aie0.m26097a(v65Var, false);
            }
            zhe0.m96126a(die0Var.f118567W0, null);
            rhsVar = ((l9c) arrayList.get(arrayList.size() - 1)).f131055a.f118573c;
            iArr = new int[2];
            rhsVar.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f141248M0.getWindowVisibleDisplayFrame(rect3);
            if (this.f141249N0 == i) {
                if (rhsVar.getWidth() + iArr[0] + iM88127k > rect3.right) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else if (iArr[0] - iM88127k < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f141249N0 = i3;
            if (Build.VERSION.SDK_INT >= 26) {
                die0Var.f118557M0 = childAt;
                i5 = 0;
                i4 = 0;
            } else {
                iArr2 = new int[2];
                this.f141247L0.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f141262Z & 7) == 5) {
                    iArr2[0] = this.f141247L0.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i4 = iArr3[0] - iArr2[0];
                i5 = iArr3[1] - iArr2[1];
            }
            if ((this.f141262Z & 5) == 5) {
                if (z2) {
                    width = i4 + iM88127k;
                } else {
                    iM88127k = childAt.getWidth();
                    width = i4 - iM88127k;
                }
            } else if (z2) {
                width = i4 + childAt.getWidth();
            } else {
                width = i4 - iM88127k;
            }
            die0Var.f118576f = width;
            die0Var.f118568X = true;
            die0Var.f118580t = true;
            die0Var.m55156g(i5);
        } else {
            if (this.f141250O0) {
                die0Var.f118576f = this.f141252Q0;
            }
            if (this.f141251P0) {
                die0Var.m55156g(this.f141253R0);
            }
            rect = this.f251340a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            die0Var.f118565U0 = rect2;
        }
        arrayList.add(new l9c(die0Var, zge0Var, this.f141249N0));
        die0Var.mo42575m();
        rhs rhsVar4 = die0Var.f118573c;
        rhsVar4.setOnKeyListener(this);
        if (l9cVar == null) {
        }
    }
}
