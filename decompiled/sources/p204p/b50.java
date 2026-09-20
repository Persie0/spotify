package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b50 implements hie0 {

    /* JADX INFO: renamed from: L0 */
    public int f23438L0;

    /* JADX INFO: renamed from: M0 */
    public int f23439M0;

    /* JADX INFO: renamed from: N0 */
    public int f23440N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f23441O0;

    /* JADX INFO: renamed from: Q0 */
    public y40 f23443Q0;

    /* JADX INFO: renamed from: R0 */
    public y40 f23444R0;

    /* JADX INFO: renamed from: S0 */
    public lk00 f23445S0;

    /* JADX INFO: renamed from: T0 */
    public z40 f23446T0;

    /* JADX INFO: renamed from: X */
    public boolean f23448X;

    /* JADX INFO: renamed from: Y */
    public boolean f23449Y;

    /* JADX INFO: renamed from: Z */
    public boolean f23450Z;

    /* JADX INFO: renamed from: a */
    public final Context f23451a;

    /* JADX INFO: renamed from: b */
    public Context f23452b;

    /* JADX INFO: renamed from: c */
    public zge0 f23453c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f23454d;

    /* JADX INFO: renamed from: e */
    public gie0 f23455e;

    /* JADX INFO: renamed from: h */
    public lie0 f23458h;

    /* JADX INFO: renamed from: i */
    public a50 f23459i;

    /* JADX INFO: renamed from: t */
    public Drawable f23460t;

    /* JADX INFO: renamed from: f */
    public final int f23456f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g */
    public final int f23457g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: P0 */
    public final SparseBooleanArray f23442P0 = new SparseBooleanArray();

    /* JADX INFO: renamed from: U0 */
    public final ckx0 f23447U0 = new ckx0(this, 4);

    public b50(Context context) {
        this.f23451a = context;
        this.f23454d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m28111a(lhe0 lhe0Var, View view, ViewGroup viewGroup) {
        View actionView = lhe0Var.getActionView();
        if (actionView == null || lhe0Var.m58971e()) {
            kie0 kie0Var = view instanceof kie0 ? (kie0) view : (kie0) this.f23454d.inflate(this.f23457g, viewGroup, false);
            kie0Var.mo70f(lhe0Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) kie0Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f23458h);
            if (this.f23446T0 == null) {
                this.f23446T0 = new z40(this);
            }
            actionMenuItemView.setPopupCallback(this.f23446T0);
            actionView = (View) kie0Var;
        }
        actionView.setVisibility(lhe0Var.f133527C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof d50)) {
            actionView.setLayoutParams(ActionMenuView.m104l(layoutParams));
        }
        return actionView;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: b */
    public final void mo28112b(zge0 zge0Var, boolean z) {
        m28120j();
        y40 y40Var = this.f23444R0;
        if (y40Var != null && y40Var.m93651b()) {
            ((whe0) y40Var.f272851i).dismiss();
        }
        gie0 gie0Var = this.f23455e;
        if (gie0Var != null) {
            gie0Var.mo29244b(zge0Var, z);
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: c */
    public final void mo28113c(Context context, zge0 zge0Var) {
        this.f23452b = context;
        LayoutInflater.from(context);
        this.f23453c = zge0Var;
        Resources resources = context.getResources();
        if (!this.f23450Z) {
            this.f23449Y = true;
        }
        int i = 2;
        this.f23438L0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f23440N0 = i;
        int measuredWidth = this.f23438L0;
        if (this.f23449Y) {
            if (this.f23459i == null) {
                a50 a50Var = new a50(this, this.f23451a);
                this.f23459i = a50Var;
                if (this.f23448X) {
                    a50Var.setImageDrawable(this.f23460t);
                    this.f23460t = null;
                    this.f23448X = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f23459i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f23459i.getMeasuredWidth();
        } else {
            this.f23459i = null;
        }
        this.f23439M0 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: d */
    public final void mo28114d(gie0 gie0Var) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.hie0
    /* JADX INFO: renamed from: e */
    public final void mo28115e() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f23458h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            zge0 zge0Var = this.f23453c;
            if (zge0Var != null) {
                zge0Var.m96067j();
                ArrayList arrayListM96068m = this.f23453c.m96068m();
                int size = arrayListM96068m.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    lhe0 lhe0Var = (lhe0) arrayListM96068m.get(i2);
                    if ((lhe0Var.f133551x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        lhe0 itemData = childAt instanceof kie0 ? ((kie0) childAt).getItemData() : null;
                        View viewM28111a = m28111a(lhe0Var, childAt, viewGroup);
                        if (lhe0Var != itemData) {
                            viewM28111a.setPressed(false);
                            viewM28111a.jumpDrawablesToCurrentState();
                        }
                        if (viewM28111a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM28111a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM28111a);
                            }
                            ((ViewGroup) this.f23458h).addView(viewM28111a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f23459i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f23458h).requestLayout();
        zge0 zge0Var2 = this.f23453c;
        if (zge0Var2 != null) {
            zge0Var2.m96067j();
            ArrayList arrayList2 = zge0Var2.f282608i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                q50 q50Var = ((lhe0) arrayList2.get(i3)).f133525A;
            }
        }
        zge0 zge0Var3 = this.f23453c;
        if (zge0Var3 != null) {
            zge0Var3.m96067j();
            arrayList = zge0Var3.f282609j;
        }
        if (this.f23449Y && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((lhe0) arrayList.get(0)).f133527C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f23459i == null) {
                this.f23459i = new a50(this, this.f23451a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f23459i.getParent();
            if (viewGroup3 != this.f23458h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f23459i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f23458h;
                a50 a50Var = this.f23459i;
                actionMenuView.getClass();
                d50 d50VarM103k = ActionMenuView.m103k();
                d50VarM103k.f45283a = true;
                actionMenuView.addView(a50Var, d50VarM103k);
            }
        } else {
            a50 a50Var2 = this.f23459i;
            if (a50Var2 != null) {
                Object parent = a50Var2.getParent();
                Object obj = this.f23458h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f23459i);
                }
            }
        }
        ((ActionMenuView) this.f23458h).setOverflowReserved(this.f23449Y);
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: f */
    public final boolean mo28116f(lhe0 lhe0Var) {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: g */
    public final boolean mo28117g(lhe0 lhe0Var) {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: h */
    public final boolean mo28118h() {
        int size;
        ArrayList arrayListM96068m;
        int i;
        boolean z;
        b50 b50Var = this;
        zge0 zge0Var = b50Var.f23453c;
        if (zge0Var != null) {
            arrayListM96068m = zge0Var.m96068m();
            size = arrayListM96068m.size();
        } else {
            size = 0;
            arrayListM96068m = null;
        }
        int i2 = b50Var.f23440N0;
        int i3 = b50Var.f23439M0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) b50Var.f23458h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            lhe0 lhe0Var = (lhe0) arrayListM96068m.get(i4);
            int i7 = lhe0Var.f133552y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (b50Var.f23441O0 && lhe0Var.f133527C) {
                i2 = 0;
            }
            i4++;
        }
        if (b50Var.f23449Y && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = b50Var.f23442P0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            lhe0 lhe0Var2 = (lhe0) arrayListM96068m.get(i9);
            int i11 = lhe0Var2.f133552y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = lhe0Var2.f133529b;
            if (z3) {
                View viewM28111a = b50Var.m28111a(lhe0Var2, null, viewGroup);
                viewM28111a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM28111a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                lhe0Var2.m58973g(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewM28111a2 = b50Var.m28111a(lhe0Var2, null, viewGroup);
                        viewM28111a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM28111a2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            lhe0 lhe0Var3 = (lhe0) arrayListM96068m.get(i13);
                            if (lhe0Var3.f133529b == i12) {
                                if ((lhe0Var3.f133551x & 32) == 32) {
                                    i8++;
                                }
                                lhe0Var3.m58973g(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    lhe0Var2.m58973g(z5);
                } else {
                    lhe0Var2.m58973g(false);
                }
                i9++;
                i = 2;
                b50Var = this;
                z = true;
            }
            i9++;
            i = 2;
            b50Var = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.hie0
    /* JADX INFO: renamed from: i */
    public final boolean mo28119i(gr51 gr51Var) {
        boolean z;
        if (gr51Var.hasVisibleItems()) {
            gr51 gr51Var2 = gr51Var;
            while (true) {
                zge0 zge0Var = gr51Var2.f83646z;
                if (zge0Var == this.f23453c) {
                    break;
                }
                gr51Var2 = (gr51) zge0Var;
            }
            lhe0 lhe0Var = gr51Var2.f83645A;
            ViewGroup viewGroup = (ViewGroup) this.f23458h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof kie0) && ((kie0) childAt).getItemData() == lhe0Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                gr51Var.f83645A.getClass();
                int size = gr51Var.f282605f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = gr51Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                y40 y40Var = new y40(this, this.f23452b, gr51Var, view);
                this.f23444R0 = y40Var;
                y40Var.f272844b = z;
                whe0 whe0Var = (whe0) y40Var.f272851i;
                if (whe0Var != null) {
                    whe0Var.mo61204o(z);
                }
                y40 y40Var2 = this.f23444R0;
                if (!y40Var2.m93651b()) {
                    if (((View) y40Var2.f272849g) == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    y40Var2.m93655g(0, 0, false, false);
                }
                gie0 gie0Var = this.f23455e;
                if (gie0Var != null) {
                    gie0Var.mo29245f(gr51Var);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m28120j() {
        Object obj;
        lk00 lk00Var = this.f23445S0;
        if (lk00Var != null && (obj = this.f23458h) != null) {
            ((View) obj).removeCallbacks(lk00Var);
            this.f23445S0 = null;
            return true;
        }
        y40 y40Var = this.f23443Q0;
        if (y40Var == null) {
            return false;
        }
        if (y40Var.m93651b()) {
            ((whe0) y40Var.f272851i).dismiss();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m28121k() {
        y40 y40Var = this.f23443Q0;
        return y40Var != null && y40Var.m93651b();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m28122l() {
        zge0 zge0Var;
        if (!this.f23449Y || m28121k() || (zge0Var = this.f23453c) == null || this.f23458h == null || this.f23445S0 != null) {
            return false;
        }
        zge0Var.m96067j();
        if (zge0Var.f282609j.isEmpty()) {
            return false;
        }
        lk00 lk00Var = new lk00(this, new y40(this, this.f23452b, this.f23453c, this.f23459i), false, 1);
        this.f23445S0 = lk00Var;
        ((View) this.f23458h).post(lk00Var);
        return true;
    }
}
