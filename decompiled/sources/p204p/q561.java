package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class q561 {

    /* JADX INFO: renamed from: A */
    public CharSequence f185414A;

    /* JADX INFO: renamed from: B */
    public CharSequence f185415B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ r561 f185418E;

    /* JADX INFO: renamed from: a */
    public final Menu f185419a;

    /* JADX INFO: renamed from: h */
    public boolean f185426h;

    /* JADX INFO: renamed from: i */
    public int f185427i;

    /* JADX INFO: renamed from: j */
    public int f185428j;

    /* JADX INFO: renamed from: k */
    public CharSequence f185429k;

    /* JADX INFO: renamed from: l */
    public CharSequence f185430l;

    /* JADX INFO: renamed from: m */
    public int f185431m;

    /* JADX INFO: renamed from: n */
    public char f185432n;

    /* JADX INFO: renamed from: o */
    public int f185433o;

    /* JADX INFO: renamed from: p */
    public char f185434p;

    /* JADX INFO: renamed from: q */
    public int f185435q;

    /* JADX INFO: renamed from: r */
    public int f185436r;

    /* JADX INFO: renamed from: s */
    public boolean f185437s;

    /* JADX INFO: renamed from: t */
    public boolean f185438t;

    /* JADX INFO: renamed from: u */
    public boolean f185439u;

    /* JADX INFO: renamed from: v */
    public int f185440v;

    /* JADX INFO: renamed from: w */
    public int f185441w;

    /* JADX INFO: renamed from: x */
    public String f185442x;

    /* JADX INFO: renamed from: y */
    public String f185443y;

    /* JADX INFO: renamed from: z */
    public q50 f185444z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f185416C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f185417D = null;

    /* JADX INFO: renamed from: b */
    public int f185420b = 0;

    /* JADX INFO: renamed from: c */
    public int f185421c = 0;

    /* JADX INFO: renamed from: d */
    public int f185422d = 0;

    /* JADX INFO: renamed from: e */
    public int f185423e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f185424f = true;

    /* JADX INFO: renamed from: g */
    public boolean f185425g = true;

    public q561(r561 r561Var, Menu menu) {
        this.f185418E = r561Var;
        this.f185419a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m72189a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f185418E.f195977c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72190b(MenuItem menuItem) {
        r561 r561Var = this.f185418E;
        Context context = r561Var.f195977c;
        boolean z = false;
        menuItem.setChecked(this.f185437s).setVisible(this.f185438t).setEnabled(this.f185439u).setCheckable(this.f185436r >= 1).setTitleCondensed(this.f185430l).setIcon(this.f185431m);
        int i = this.f185440v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f185443y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (r561Var.f195978d == null) {
                r561Var.f195978d = r561.m74804a(context);
            }
            Object obj = r561Var.f195978d;
            String str = this.f185443y;
            p561 p561Var = new p561();
            p561Var.f174087b = obj;
            Class<?> cls = obj.getClass();
            try {
                p561Var.f174088c = cls.getMethod(str, p561.f174085d);
                menuItem.setOnMenuItemClickListener(p561Var);
            } catch (Exception e) {
                StringBuilder sbM38572u = edb.m38572u("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbM38572u.append(cls.getName());
                InflateException inflateException = new InflateException(sbM38572u.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f185436r >= 2) {
            if (menuItem instanceof lhe0) {
                lhe0 lhe0Var = (lhe0) menuItem;
                lhe0Var.f133551x = (lhe0Var.f133551x & (-5)) | 4;
            } else if (menuItem instanceof qhe0) {
                qhe0 qhe0Var = (qhe0) menuItem;
                s561 s561Var = qhe0Var.f188752c;
                try {
                    if (qhe0Var.f188753d == null) {
                        qhe0Var.f188753d = s561Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    qhe0Var.f188753d.invoke(s561Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.f185442x;
        if (str2 != null) {
            menuItem.setActionView((View) m72189a(str2, r561.f195973e, r561Var.f195975a));
            z = true;
        }
        int i2 = this.f185441w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        q50 q50Var = this.f185444z;
        if (q50Var != null && (menuItem instanceof s561)) {
            ((s561) menuItem).mo58968a(q50Var);
        }
        CharSequence charSequence = this.f185414A;
        boolean z2 = menuItem instanceof s561;
        if (z2) {
            ((s561) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0b1.m63353L(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f185415B;
        if (z2) {
            ((s561) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0b1.m63357P(menuItem, charSequence2);
        }
        char c = this.f185432n;
        int i3 = this.f185433o;
        if (z2) {
            ((s561) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0b1.m63351J(menuItem, c, i3);
        }
        char c2 = this.f185434p;
        int i4 = this.f185435q;
        if (z2) {
            ((s561) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0b1.m63356O(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f185417D;
        if (mode != null) {
            if (z2) {
                ((s561) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0b1.m63355N(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f185416C;
        if (colorStateList != null) {
            if (z2) {
                ((s561) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0b1.m63354M(menuItem, colorStateList);
            }
        }
    }
}
