package p204p;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import com.comscore.streaming.ContentType;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l65 extends c65 implements xge0, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: F1 */
    public static final ab21 f130179F1 = new ab21(0);

    /* JADX INFO: renamed from: G1 */
    public static final int[] f130180G1 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: H1 */
    public static final boolean f130181H1 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: I1 */
    public static final boolean f130182I1 = true;

    /* JADX INFO: renamed from: A1 */
    public Rect f130183A1;

    /* JADX INFO: renamed from: B1 */
    public Rect f130184B1;

    /* JADX INFO: renamed from: C1 */
    public g85 f130185C1;

    /* JADX INFO: renamed from: D1 */
    public OnBackInvokedDispatcher f130186D1;

    /* JADX INFO: renamed from: E1 */
    public OnBackInvokedCallback f130187E1;

    /* JADX INFO: renamed from: L0 */
    public final Object f130188L0;

    /* JADX INFO: renamed from: M0 */
    public wj50 f130189M0;

    /* JADX INFO: renamed from: N0 */
    public r561 f130190N0;

    /* JADX INFO: renamed from: O0 */
    public CharSequence f130191O0;

    /* JADX INFO: renamed from: P0 */
    public lro f130192P0;

    /* JADX INFO: renamed from: Q0 */
    public brl0 f130193Q0;

    /* JADX INFO: renamed from: R0 */
    public hd41 f130194R0;

    /* JADX INFO: renamed from: S0 */
    public g50 f130195S0;

    /* JADX INFO: renamed from: T0 */
    public ActionBarContextView f130196T0;

    /* JADX INFO: renamed from: U0 */
    public PopupWindow f130197U0;

    /* JADX INFO: renamed from: V0 */
    public n10 f130198V0;

    /* JADX INFO: renamed from: X */
    public final Context f130200X;

    /* JADX INFO: renamed from: X0 */
    public boolean f130201X0;

    /* JADX INFO: renamed from: Y */
    public Window f130202Y;

    /* JADX INFO: renamed from: Y0 */
    public ViewGroup f130203Y0;

    /* JADX INFO: renamed from: Z */
    public h65 f130204Z;

    /* JADX INFO: renamed from: Z0 */
    public TextView f130205Z0;

    /* JADX INFO: renamed from: a1 */
    public View f130206a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f130207b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f130208c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f130209d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f130210e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f130211f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f130212g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f130213h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f130214i1;

    /* JADX INFO: renamed from: j1 */
    public k65[] f130215j1;

    /* JADX INFO: renamed from: k1 */
    public k65 f130216k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f130217l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f130218m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f130219n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f130220o1;

    /* JADX INFO: renamed from: p1 */
    public Configuration f130221p1;

    /* JADX INFO: renamed from: q1 */
    public final int f130222q1;

    /* JADX INFO: renamed from: r1 */
    public int f130223r1;

    /* JADX INFO: renamed from: s1 */
    public int f130224s1;

    /* JADX INFO: renamed from: t */
    public final Object f130225t;

    /* JADX INFO: renamed from: t1 */
    public boolean f130226t1;

    /* JADX INFO: renamed from: u1 */
    public i65 f130227u1;

    /* JADX INFO: renamed from: v1 */
    public i65 f130228v1;

    /* JADX INFO: renamed from: w1 */
    public boolean f130229w1;

    /* JADX INFO: renamed from: x1 */
    public int f130230x1;

    /* JADX INFO: renamed from: z1 */
    public boolean f130232z1;

    /* JADX INFO: renamed from: W0 */
    public zkc1 f130199W0 = null;

    /* JADX INFO: renamed from: y1 */
    public final zu3 f130231y1 = new zu3(this, 1);

    public l65(Context context, Window window, v55 v55Var, Object obj) {
        r55 r55Var = null;
        this.f130222q1 = -100;
        this.f130200X = context;
        this.f130188L0 = v55Var;
        this.f130225t = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof r55)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    r55Var = (r55) context;
                    break;
                }
            }
            if (r55Var != null) {
                this.f130222q1 = ((l65) r55Var.m74800k0()).f130222q1;
            }
        }
        if (this.f130222q1 == -100) {
            String name = this.f130225t.getClass().getName();
            ab21 ab21Var = f130179F1;
            Integer num = (Integer) ab21Var.get(name);
            if (num != null) {
                this.f130222q1 = num.intValue();
                ab21Var.remove(this.f130225t.getClass().getName());
            }
        }
        if (window != null) {
            m58299l(window);
        }
        p65.m69179d();
    }

    /* JADX INFO: renamed from: n */
    public static jfa0 m58289n(Context context) {
        jfa0 jfa0Var;
        if (Build.VERSION.SDK_INT >= 33 || (jfa0Var = c65.f34383c) == null) {
            return null;
        }
        jfa0 jfa0VarM40821b = f65.m40821b(context.getApplicationContext().getResources().getConfiguration());
        jfa0 jfa0VarM93895m = yjf1.m93895m(jfa0Var, jfa0VarM40821b);
        return jfa0VarM93895m.f111869a.f122114a.isEmpty() ? jfa0VarM40821b : jfa0VarM93895m;
    }

    /* JADX INFO: renamed from: s */
    public static Configuration m58290s(Context context, int i, jfa0 jfa0Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (jfa0Var != null) {
            f65.m40823d(configuration2, jfa0Var);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final int m58291A(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f130228v1 == null) {
                            this.f130228v1 = new i65(this, context);
                        }
                        return this.f130228v1.m49796t();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.f130227u1 == null) {
                        this.f130227u1 = new i65(this, yb81.m93239h(context));
                    }
                    return this.f130227u1.m49796t();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m58292B() {
        boolean z = this.f130217l1;
        this.f130217l1 = false;
        k65 k65VarM58307x = m58307x(0);
        if (!k65VarM58307x.f119674m) {
            g50 g50Var = this.f130195S0;
            if (g50Var != null) {
                g50Var.mo43565b();
                return true;
            }
            m58308y();
            wj50 wj50Var = this.f130189M0;
            if (wj50Var == null || !wj50Var.mo48821t()) {
                return false;
            }
        } else if (!z) {
            m58302q(k65VarM58307x, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: C */
    public final void m58293C(k65 k65Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = k65Var.f119674m;
        int i2 = k65Var.f119662a;
        if (z || this.f130220o1) {
            return;
        }
        Context context = this.f130200X;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f130202Y.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, k65Var.f119669h)) {
            m58302q(k65Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m58295E(k65Var, keyEvent)) {
            j65 j65Var = k65Var.f119666e;
            if (j65Var != null && !k65Var.f119675n) {
                View view = k65Var.f119668g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                k65Var.f119673l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = k65Var.f119664c;
                layoutParams2.windowAnimations = k65Var.f119665d;
                windowManager.addView(k65Var.f119666e, layoutParams2);
                k65Var.f119674m = true;
                if (i2 == 0) {
                    m58297G();
                }
            }
            if (j65Var == null) {
                m58308y();
                wj50 wj50Var = this.f130189M0;
                Context contextMo48806E = wj50Var != null ? wj50Var.mo48806E() : null;
                if (contextMo48806E != null) {
                    context = contextMo48806E;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.spotify.music.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(com.spotify.music.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(com.spotify.music.R.style.Theme_AppCompat_CompactMenu, true);
                }
                g9k g9kVar = new g9k(context, 0);
                g9kVar.getTheme().setTo(themeNewTheme);
                k65Var.f119671j = g9kVar;
                TypedArray typedArrayObtainStyledAttributes = g9kVar.obtainStyledAttributes(h3u0.f87330j);
                k65Var.f119663b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                k65Var.f119665d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                k65Var.f119666e = new j65(this, k65Var.f119671j);
                k65Var.f119664c = 81;
            } else if (k65Var.f119675n && j65Var.getChildCount() > 0) {
                k65Var.f119666e.removeAllViews();
            }
            View view2 = k65Var.f119668g;
            if (view2 == null) {
                if (k65Var.f119669h != null) {
                    if (this.f130194R0 == null) {
                        this.f130194R0 = new hd41(this, 17);
                    }
                    hd41 hd41Var = this.f130194R0;
                    if (k65Var.f119670i == null) {
                        ry80 ry80Var = new ry80(k65Var.f119671j);
                        k65Var.f119670i = ry80Var;
                        ry80Var.mo28114d(hd41Var);
                        k65Var.f119669h.m96062b(k65Var.f119670i);
                    }
                    View view3 = (View) k65Var.f119670i.m76696j(k65Var.f119666e);
                    k65Var.f119667f = view3;
                    if (view3 != null) {
                    }
                }
                k65Var.f119675n = true;
                return;
            }
            k65Var.f119667f = view2;
            if (k65Var.f119667f != null && (k65Var.f119668g != null || k65Var.f119670i.m76695a().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = k65Var.f119667f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                k65Var.f119666e.setBackgroundResource(k65Var.f119663b);
                ViewParent parent = k65Var.f119667f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(k65Var.f119667f);
                }
                k65Var.f119666e.addView(k65Var.f119667f, layoutParams3);
                if (!k65Var.f119667f.hasFocus()) {
                    k65Var.f119667f.requestFocus();
                }
            }
            k65Var.f119675n = true;
            return;
            i = -2;
            k65Var.f119673l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = k65Var.f119664c;
            layoutParams4.windowAnimations = k65Var.f119665d;
            windowManager.addView(k65Var.f119666e, layoutParams4);
            k65Var.f119674m = true;
            if (i2 == 0) {
                m58297G();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m58294D(k65 k65Var, int i, KeyEvent keyEvent) {
        zge0 zge0Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((k65Var.f119672k || m58295E(k65Var, keyEvent)) && (zge0Var = k65Var.f119669h) != null) {
            return zge0Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX INFO: renamed from: E */
    public final boolean m58295E(k65 k65Var, KeyEvent keyEvent) {
        zge0 zge0Var;
        lro lroVar;
        lro lroVar2;
        Resources.Theme themeNewTheme;
        lro lroVar3;
        lro lroVar4;
        if (!this.f130220o1) {
            boolean z = k65Var.f119672k;
            int i = k65Var.f119662a;
            if (z) {
                return true;
            }
            k65 k65Var2 = this.f130216k1;
            if (k65Var2 != null && k65Var2 != k65Var) {
                m58302q(k65Var2, false);
            }
            Window.Callback callback = this.f130202Y.getCallback();
            if (callback != null) {
                k65Var.f119668g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (lroVar4 = this.f130192P0) != null) {
                ((ActionBarOverlayLayout) lroVar4).m101r();
            }
            if (k65Var.f119668g == null && (!z2 || !(this.f130189M0 instanceof o081))) {
                zge0 zge0Var2 = k65Var.f119669h;
                if (zge0Var2 == null || k65Var.f119676o) {
                    if (zge0Var2 == null) {
                        Context context = this.f130200X;
                        if ((i == 0 || i == 108) && this.f130192P0 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.spotify.music.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.spotify.music.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.spotify.music.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                g9k g9kVar = new g9k(context, 0);
                                g9kVar.getTheme().setTo(themeNewTheme);
                                context = g9kVar;
                            }
                        }
                        zge0 zge0Var3 = new zge0(context);
                        zge0Var3.mo45465w(this);
                        zge0 zge0Var4 = k65Var.f119669h;
                        if (zge0Var3 != zge0Var4) {
                            if (zge0Var4 != null) {
                                zge0Var4.m96072t(k65Var.f119670i);
                            }
                            k65Var.f119669h = zge0Var3;
                            ry80 ry80Var = k65Var.f119670i;
                            if (ry80Var != null) {
                                zge0Var3.m96062b(ry80Var);
                            }
                        }
                        if (k65Var.f119669h != null) {
                            if (z2 && (lroVar2 = this.f130192P0) != null) {
                                if (this.f130193Q0 == null) {
                                    this.f130193Q0 = new brl0(this, 20);
                                }
                                ((ActionBarOverlayLayout) lroVar2).m100q(k65Var.f119669h, this.f130193Q0);
                            }
                            k65Var.f119669h.m96060A();
                            if (callback.onCreatePanelMenu(i, k65Var.f119669h)) {
                                k65Var.f119676o = false;
                            } else {
                                zge0Var = k65Var.f119669h;
                                if (zge0Var != null) {
                                    if (zge0Var != null) {
                                        zge0Var.m96072t(k65Var.f119670i);
                                    }
                                    k65Var.f119669h = null;
                                }
                                if (z2 && (lroVar = this.f130192P0) != null) {
                                    ((ActionBarOverlayLayout) lroVar).m100q(null, this.f130193Q0);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f130193Q0 == null) {
                                this.f130193Q0 = new brl0(this, 20);
                            }
                            ((ActionBarOverlayLayout) lroVar2).m100q(k65Var.f119669h, this.f130193Q0);
                        }
                        k65Var.f119669h.m96060A();
                        if (callback.onCreatePanelMenu(i, k65Var.f119669h)) {
                            zge0Var = k65Var.f119669h;
                            if (zge0Var != null) {
                                if (zge0Var != null) {
                                    zge0Var.m96072t(k65Var.f119670i);
                                }
                                k65Var.f119669h = null;
                            }
                            if (z2) {
                                ((ActionBarOverlayLayout) lroVar).m100q(null, this.f130193Q0);
                            }
                        } else {
                            k65Var.f119676o = false;
                        }
                    }
                }
                k65Var.f119669h.m96060A();
                Bundle bundle = k65Var.f119677p;
                if (bundle != null) {
                    k65Var.f119669h.m96073u(bundle);
                    k65Var.f119677p = null;
                }
                if (!callback.onPreparePanel(0, k65Var.f119668g, k65Var.f119669h)) {
                    if (z2 && (lroVar3 = this.f130192P0) != null) {
                        ((ActionBarOverlayLayout) lroVar3).m100q(null, this.f130193Q0);
                    }
                    k65Var.f119669h.m96077z();
                    return false;
                }
                k65Var.f119669h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                k65Var.f119669h.m96077z();
            }
            k65Var.f119672k = true;
            k65Var.f119673l = false;
            this.f130216k1 = k65Var;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m58296F() {
        if (this.f130201X0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m58297G() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f130186D1 != null && (m58307x(0).f119674m || this.f130195S0 != null)) {
                z = true;
            }
            if (z && this.f130187E1 == null) {
                this.f130187E1 = g65.m43675b(this.f130186D1, this);
            } else {
                if (z || (onBackInvokedCallback = this.f130187E1) == null) {
                    return;
                }
                g65.m43676c(this.f130186D1, onBackInvokedCallback);
            }
        }
    }

    @Override // p204p.c65
    /* JADX INFO: renamed from: a */
    public final void mo31527a() {
        if (this.f130189M0 != null) {
            m58308y();
            if (this.f130189M0.mo65978H()) {
                return;
            }
            m58309z(0);
        }
    }

    @Override // p204p.c65
    /* JADX INFO: renamed from: c */
    public final void mo31528c() {
        String strM85484y;
        this.f130218m1 = true;
        m58298k(false, true);
        m58306w();
        Object obj = this.f130225t;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM85484y = vgg1.m85484y(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM85484y = null;
            }
            if (strM85484y != null) {
                wj50 wj50Var = this.f130189M0;
                if (wj50Var == null) {
                    this.f130232z1 = true;
                } else {
                    wj50Var.mo48810S(true);
                }
            }
            synchronized (c65.f34388h) {
                c65.m31526e(this);
                c65.f34387g.add(new WeakReference(this));
            }
        }
        this.f130221p1 = new Configuration(this.f130200X.getResources().getConfiguration());
        this.f130219n1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p204p.c65
    /* JADX INFO: renamed from: d */
    public final void mo31529d() {
        if (this.f130225t instanceof Activity) {
            synchronized (c65.f34388h) {
                c65.m31526e(this);
            }
        }
        if (this.f130229w1) {
            this.f130202Y.getDecorView().removeCallbacks(this.f130231y1);
        }
        this.f130220o1 = true;
        if (this.f130222q1 != -100) {
            Object obj = this.f130225t;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f130179F1.put(this.f130225t.getClass().getName(), Integer.valueOf(this.f130222q1));
            } else {
                f130179F1.remove(this.f130225t.getClass().getName());
            }
        } else {
            f130179F1.remove(this.f130225t.getClass().getName());
        }
        wj50 wj50Var = this.f130189M0;
        if (wj50Var != null) {
            wj50Var.mo65979L();
        }
        i65 i65Var = this.f130227u1;
        if (i65Var != null) {
            i65Var.m44547c();
        }
        i65 i65Var2 = this.f130228v1;
        if (i65Var2 != null) {
            i65Var2.m44547c();
        }
    }

    @Override // p204p.c65
    /* JADX INFO: renamed from: f */
    public final boolean mo31530f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f130213h1 && i == 108) {
            return false;
        }
        if (this.f130209d1 && i == 1) {
            this.f130209d1 = false;
        }
        if (i == 1) {
            m58296F();
            this.f130213h1 = true;
            return true;
        }
        if (i == 2) {
            m58296F();
            this.f130207b1 = true;
            return true;
        }
        if (i == 5) {
            m58296F();
            this.f130208c1 = true;
            return true;
        }
        if (i == 10) {
            m58296F();
            this.f130211f1 = true;
            return true;
        }
        if (i == 108) {
            m58296F();
            this.f130209d1 = true;
            return true;
        }
        if (i != 109) {
            return this.f130202Y.requestFeature(i);
        }
        m58296F();
        this.f130210e1 = true;
        return true;
    }

    @Override // p204p.c65
    /* JADX INFO: renamed from: g */
    public final void mo31531g(int i) {
        m58305v();
        ViewGroup viewGroup = (ViewGroup) this.f130203Y0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f130200X).inflate(i, viewGroup);
        this.f130204Z.m46705a(this.f130202Y.getCallback());
    }

    @Override // p204p.c65
    /* JADX INFO: renamed from: h */
    public final void mo31532h(View view) {
        m58305v();
        ViewGroup viewGroup = (ViewGroup) this.f130203Y0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f130204Z.m46705a(this.f130202Y.getCallback());
    }

    @Override // p204p.c65
    /* JADX INFO: renamed from: i */
    public final void mo31533i(View view, ViewGroup.LayoutParams layoutParams) {
        m58305v();
        ViewGroup viewGroup = (ViewGroup) this.f130203Y0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f130204Z.m46705a(this.f130202Y.getCallback());
    }

    @Override // p204p.c65
    /* JADX INFO: renamed from: j */
    public final void mo31534j(CharSequence charSequence) {
        this.f130191O0 = charSequence;
        lro lroVar = this.f130192P0;
        if (lroVar != null) {
            lroVar.setWindowTitle(charSequence);
            return;
        }
        wj50 wj50Var = this.f130189M0;
        if (wj50Var != null) {
            wj50Var.mo48815Z(charSequence);
            return;
        }
        TextView textView = this.f130205Z0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final boolean m58298k(boolean z, boolean z2) {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        if (this.f130220o1) {
            return false;
        }
        int i2 = this.f130222q1;
        if (i2 == -100) {
            i2 = c65.f34382b;
        }
        Context context = this.f130200X;
        int iM58291A = m58291A(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        jfa0 jfa0VarM58289n = i3 < 33 ? m58289n(context) : null;
        if (!z2 && jfa0VarM58289n != null) {
            jfa0VarM58289n = f65.m40821b(context.getResources().getConfiguration());
        }
        Configuration configurationM58290s = m58290s(context, iM58291A, jfa0VarM58289n, null, false);
        boolean z4 = this.f130226t1;
        boolean z5 = true;
        Object obj3 = this.f130225t;
        if (z4 || !(obj3 instanceof Activity)) {
            this.f130226t1 = true;
            i = this.f130224s1;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f130224s1 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f130224s1 = 0;
                }
                this.f130226t1 = true;
                i = this.f130224s1;
            }
        }
        Configuration configuration = this.f130221p1;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM58290s.uiMode & 48;
        jfa0 jfa0VarM40821b = f65.m40821b(configuration);
        jfa0 jfa0VarM40821b2 = jfa0VarM58289n == null ? null : f65.m40821b(configurationM58290s);
        int i6 = i4 != i5 ? 512 : 0;
        if (jfa0VarM40821b2 != null && !jfa0VarM40821b.equals(jfa0VarM40821b2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.f130218m1 && ((f130181H1 || this.f130219n1) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                ze0.m95953s0(activity);
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (jfa0VarM40821b2 != null) {
                f65.m40823d(configuration2, jfa0VarM40821b2);
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 26 && i7 < 28) {
                if (!y85.f270211t) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        y85.f270210i = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused2) {
                    }
                    y85.f270211t = true;
                }
                Field field = y85.f270210i;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    if (obj != null) {
                        if (!y85.f270205d) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                y85.f270204c = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException unused4) {
                            }
                            y85.f270205d = true;
                        }
                        Field field2 = y85.f270204c;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException unused5) {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!y85.f270207f) {
                                try {
                                    y85.f270206e = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException unused6) {
                                }
                                y85.f270207f = true;
                            }
                            Class cls = y85.f270206e;
                            if (cls != null) {
                                if (!y85.f270209h) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        y85.f270208g = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException unused7) {
                                    }
                                    y85.f270209h = true;
                                }
                                Field field3 = y85.f270208g;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException unused8) {
                                    }
                                    if (longSparseArray != null) {
                                        v1x0.m84486a(longSparseArray);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i8 = this.f130223r1;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.f130223r1, true);
            }
            if (z6 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof hc80) {
                    if (((hc80) activity2).getLifecycle().mo31987b().m41223a(fb80.f67752c)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f130219n1 && !this.f130220o1) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && jfa0VarM40821b2 != null) {
            f65.m40822c(f65.m40821b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            if (this.f130227u1 == null) {
                this.f130227u1 = new i65(this, yb81.m93239h(context));
            }
            this.f130227u1.m44561r();
        } else {
            i65 i65Var = this.f130227u1;
            if (i65Var != null) {
                i65Var.m44547c();
            }
        }
        if (i2 == 3) {
            if (this.f130228v1 == null) {
                this.f130228v1 = new i65(this, context);
            }
            this.f130228v1.m44561r();
        } else {
            i65 i65Var2 = this.f130228v1;
            if (i65Var2 != null) {
                i65Var2.m44547c();
            }
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX INFO: renamed from: l */
    public final void m58299l(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f130202Y != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h65) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h65 h65Var = new h65(this, callback);
        this.f130204Z = h65Var;
        window.setCallback(h65Var);
        cx21 cx21VarM34177I = cx21.m34177I(this.f130200X, null, f130180G1);
        Drawable drawableM34203n = cx21VarM34177I.m34203n(0);
        if (drawableM34203n != null) {
            window.setBackgroundDrawable(drawableM34203n);
        }
        cx21VarM34177I.m34189K();
        this.f130202Y = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f130186D1) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f130187E1) != null) {
            g65.m43676c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f130187E1 = null;
        }
        Object obj = this.f130225t;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f130186D1 = g65.m43674a(activity);
            } else {
                this.f130186D1 = null;
            }
        } else {
            this.f130186D1 = null;
        }
        m58297G();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p204p.xge0
    /* JADX INFO: renamed from: m */
    public final boolean mo41783m(zge0 zge0Var, lhe0 lhe0Var) {
        k65 k65Var;
        Window.Callback callback = this.f130202Y.getCallback();
        if (callback != null && !this.f130220o1) {
            zge0 zge0VarMo45461l = zge0Var.mo45461l();
            k65[] k65VarArr = this.f130215j1;
            int length = k65VarArr != null ? k65VarArr.length : 0;
            for (int i = 0; i < length; i++) {
                k65Var = k65VarArr[i];
                if (k65Var != null && k65Var.f119669h == zge0VarMo45461l) {
                    if (k65Var != null) {
                        return callback.onMenuItemSelected(k65Var.f119662a, lhe0Var);
                    }
                }
            }
            k65Var = null;
            if (k65Var != null) {
                return callback.onMenuItemSelected(k65Var.f119662a, lhe0Var);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m58300o(int i, k65 k65Var, zge0 zge0Var) {
        if (zge0Var == null) {
            if (k65Var == null && i >= 0) {
                k65[] k65VarArr = this.f130215j1;
                if (i < k65VarArr.length) {
                    k65Var = k65VarArr[i];
                }
            }
            if (k65Var != null) {
                zge0Var = k65Var.f119669h;
            }
        }
        if ((k65Var == null || k65Var.f119674m) && !this.f130220o1) {
            h65 h65Var = this.f130204Z;
            Window.Callback callback = this.f130202Y.getCallback();
            h65Var.getClass();
            try {
                h65Var.f87999e = true;
                callback.onPanelClosed(i, zge0Var);
            } finally {
                h65Var.f87999e = false;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f130185C1 == null) {
            int[] iArr = h3u0.f87330j;
            Context context2 = this.f130200X;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f130185C1 = new g85();
            } else {
                try {
                    this.f130185C1 = (g85) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f130185C1 = new g85();
                }
            }
        }
        g85 g85Var = this.f130185C1;
        int i = a5b1.f12484a;
        return g85Var.createView(view, str, context, attributeSet, false, false, true, false);
    }

    /* JADX INFO: renamed from: p */
    public final void m58301p(zge0 zge0Var) {
        if (this.f130214i1) {
            return;
        }
        this.f130214i1 = true;
        ((ActionBarOverlayLayout) this.f130192P0).m86c();
        Window.Callback callback = this.f130202Y.getCallback();
        if (callback != null && !this.f130220o1) {
            callback.onPanelClosed(108, zge0Var);
        }
        this.f130214i1 = false;
    }

    /* JADX INFO: renamed from: q */
    public final void m58302q(k65 k65Var, boolean z) {
        j65 j65Var;
        lro lroVar;
        if (z && k65Var.f119662a == 0 && (lroVar = this.f130192P0) != null && ((ActionBarOverlayLayout) lroVar).m98o()) {
            m58301p(k65Var.f119669h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f130200X.getSystemService("window");
        if (windowManager != null && k65Var.f119674m && (j65Var = k65Var.f119666e) != null) {
            windowManager.removeView(j65Var);
            if (z) {
                m58300o(k65Var.f119662a, k65Var, null);
            }
        }
        k65Var.f119672k = false;
        k65Var.f119673l = false;
        k65Var.f119674m = false;
        k65Var.f119667f = null;
        k65Var.f119675n = true;
        if (this.f130216k1 == k65Var) {
            this.f130216k1 = null;
        }
        if (k65Var.f119662a == 0) {
            m58297G();
        }
    }

    @Override // p204p.xge0
    /* JADX INFO: renamed from: r */
    public final void mo41784r(zge0 zge0Var) {
        lro lroVar = this.f130192P0;
        if (lroVar == null || !((ActionBarOverlayLayout) lroVar).m85b() || (ViewConfiguration.get(this.f130200X).hasPermanentMenuKey() && !((ActionBarOverlayLayout) this.f130192P0).m97n())) {
            k65 k65VarM58307x = m58307x(0);
            k65VarM58307x.f119675n = true;
            m58302q(k65VarM58307x, false);
            m58293C(k65VarM58307x, null);
            return;
        }
        Window.Callback callback = this.f130202Y.getCallback();
        if (((ActionBarOverlayLayout) this.f130192P0).m98o()) {
            ((ActionBarOverlayLayout) this.f130192P0).m91h();
            if (this.f130220o1) {
                return;
            }
            callback.onPanelClosed(108, m58307x(0).f119669h);
            return;
        }
        if (callback == null || this.f130220o1) {
            return;
        }
        if (this.f130229w1 && (1 & this.f130230x1) != 0) {
            View decorView = this.f130202Y.getDecorView();
            zu3 zu3Var = this.f130231y1;
            decorView.removeCallbacks(zu3Var);
            zu3Var.run();
        }
        k65 k65VarM58307x2 = m58307x(0);
        zge0 zge0Var2 = k65VarM58307x2.f119669h;
        if (zge0Var2 == null || k65VarM58307x2.f119676o || !callback.onPreparePanel(0, k65VarM58307x2.f119668g, zge0Var2)) {
            return;
        }
        callback.onMenuOpened(108, k65VarM58307x2.f119669h);
        ((ActionBarOverlayLayout) this.f130192P0).m102s();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe A[RETURN] */
    /* JADX INFO: renamed from: t */
    public final boolean m58303t(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        k65 k65VarM58307x;
        lro lroVar;
        boolean z;
        boolean zM91h;
        boolean zM58295E;
        AudioManager audioManager;
        k65 k65VarM58307x2;
        Object obj = this.f130225t;
        if ((!(obj instanceof fu60) && !(obj instanceof n65)) || (decorView = this.f130202Y.getDecorView()) == null || !arg1.m26941i(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                h65 h65Var = this.f130204Z;
                Window.Callback callback = this.f130202Y.getCallback();
                h65Var.getClass();
                try {
                    h65Var.f87998d = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    h65Var.f87998d = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f130217l1 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    k65VarM58307x2 = m58307x(0);
                                    if (!k65VarM58307x2.f119674m) {
                                        m58295E(k65VarM58307x2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f130195S0 == null) {
                                    k65VarM58307x = m58307x(0);
                                    lroVar = this.f130192P0;
                                    Context context = this.f130200X;
                                    if (lroVar != null || !((ActionBarOverlayLayout) lroVar).m85b() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = k65VarM58307x.f119674m;
                                        if (!z || k65VarM58307x.f119673l) {
                                            m58302q(k65VarM58307x, true);
                                            zM91h = z;
                                        } else if (k65VarM58307x.f119672k) {
                                            if (k65VarM58307x.f119676o) {
                                                k65VarM58307x.f119672k = false;
                                                zM58295E = m58295E(k65VarM58307x, keyEvent);
                                            } else {
                                                zM58295E = true;
                                            }
                                            if (zM58295E) {
                                                m58293C(k65VarM58307x, keyEvent);
                                                zM91h = true;
                                            } else {
                                                zM91h = false;
                                            }
                                        } else {
                                            zM91h = false;
                                        }
                                    } else if (((ActionBarOverlayLayout) this.f130192P0).m98o()) {
                                        zM91h = ((ActionBarOverlayLayout) this.f130192P0).m91h();
                                    } else if (this.f130220o1 || !m58295E(k65VarM58307x, keyEvent)) {
                                        zM91h = false;
                                    } else {
                                        zM91h = ((ActionBarOverlayLayout) this.f130192P0).m102s();
                                    }
                                    if (zM91h && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (m58292B()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    h65Var.f87998d = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f130217l1 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            k65VarM58307x2 = m58307x(0);
                            if (!k65VarM58307x2.f119674m) {
                                m58295E(k65VarM58307x2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f130195S0 == null) {
                            k65VarM58307x = m58307x(0);
                            lroVar = this.f130192P0;
                            Context context2 = this.f130200X;
                            if (lroVar != null) {
                                z = k65VarM58307x.f119674m;
                                if (z) {
                                    m58302q(k65VarM58307x, true);
                                    zM91h = z;
                                } else {
                                    m58302q(k65VarM58307x, true);
                                    zM91h = z;
                                }
                            } else {
                                z = k65VarM58307x.f119674m;
                                if (z) {
                                    m58302q(k65VarM58307x, true);
                                    zM91h = z;
                                } else {
                                    m58302q(k65VarM58307x, true);
                                    zM91h = z;
                                }
                            }
                            if (zM91h) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (m58292B()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final void m58304u(int i) {
        k65 k65VarM58307x = m58307x(i);
        if (k65VarM58307x.f119669h != null) {
            Bundle bundle = new Bundle();
            k65VarM58307x.f119669h.m96074v(bundle);
            if (bundle.size() > 0) {
                k65VarM58307x.f119677p = bundle;
            }
            k65VarM58307x.f119669h.m96060A();
            k65VarM58307x.f119669h.clear();
        }
        k65VarM58307x.f119676o = true;
        k65VarM58307x.f119675n = true;
        if ((i == 108 || i == 0) && this.f130192P0 != null) {
            k65 k65VarM58307x2 = m58307x(0);
            k65VarM58307x2.f119672k = false;
            m58295E(k65VarM58307x2, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m58305v() {
        ViewGroup viewGroup;
        if (this.f130201X0) {
            return;
        }
        Context context = this.f130200X;
        int[] iArr = h3u0.f87330j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo31530f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo31530f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo31530f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo31530f(10);
        }
        this.f130212g1 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m58306w();
        this.f130202Y.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f130213h1) {
            viewGroup = this.f130211f1 ? (ViewGroup) layoutInflaterFrom.inflate(com.spotify.music.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.spotify.music.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f130212g1) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.spotify.music.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f130210e1 = false;
            this.f130209d1 = false;
        } else if (this.f130209d1) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.spotify.music.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new g9k(context, typedValue.resourceId) : context).inflate(com.spotify.music.R.layout.abc_screen_toolbar, (ViewGroup) null);
            lro lroVar = (lro) viewGroup.findViewById(com.spotify.music.R.id.decor_content_parent);
            this.f130192P0 = lroVar;
            lroVar.setWindowCallback(this.f130202Y.getCallback());
            if (this.f130210e1) {
                ((ActionBarOverlayLayout) this.f130192P0).m96m(109);
            }
            if (this.f130207b1) {
                ((ActionBarOverlayLayout) this.f130192P0).m96m(2);
            }
            if (this.f130208c1) {
                ((ActionBarOverlayLayout) this.f130192P0).m96m(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f130209d1);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f130210e1);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f130212g1);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f130211f1);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(edb.m38570s(sb, this.f130213h1, " }"));
        }
        ihj0 ihj0Var = new ihj0(this, 19);
        WeakHashMap weakHashMap = mec1.f142677a;
        cec1.m32550n(viewGroup, ihj0Var);
        if (this.f130192P0 == null) {
            this.f130205Z0 = (TextView) viewGroup.findViewById(com.spotify.music.R.id.title);
        }
        Method method = cpc1.f40541a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.spotify.music.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f130202Y.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f130202Y.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new vbu0(this, 21));
        this.f130203Y0 = viewGroup;
        Object obj = this.f130225t;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f130191O0;
        if (!TextUtils.isEmpty(title)) {
            lro lroVar2 = this.f130192P0;
            if (lroVar2 != null) {
                lroVar2.setWindowTitle(title);
            } else {
                wj50 wj50Var = this.f130189M0;
                if (wj50Var != null) {
                    wj50Var.mo48815Z(title);
                } else {
                    TextView textView = this.f130205Z0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f130203Y0.findViewById(R.id.content);
        View decorView = this.f130202Y.getDecorView();
        contentFrameLayout2.f198g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = mec1.f142677a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND)) {
            typedArrayObtainStyledAttributes2.getValue(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(ContentType.USER_GENERATED_LIVE)) {
            typedArrayObtainStyledAttributes2.getValue(ContentType.USER_GENERATED_LIVE, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND)) {
            typedArrayObtainStyledAttributes2.getValue(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f130201X0 = true;
        k65 k65VarM58307x = m58307x(0);
        if (this.f130220o1 || k65VarM58307x.f119669h != null) {
            return;
        }
        m58309z(108);
    }

    /* JADX INFO: renamed from: w */
    public final void m58306w() {
        if (this.f130202Y == null) {
            Object obj = this.f130225t;
            if (obj instanceof Activity) {
                m58299l(((Activity) obj).getWindow());
            }
        }
        if (this.f130202Y == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: x */
    public final k65 m58307x(int i) {
        k65[] k65VarArr = this.f130215j1;
        if (k65VarArr == null || k65VarArr.length <= i) {
            k65[] k65VarArr2 = new k65[i + 1];
            if (k65VarArr != null) {
                System.arraycopy(k65VarArr, 0, k65VarArr2, 0, k65VarArr.length);
            }
            this.f130215j1 = k65VarArr2;
            k65VarArr = k65VarArr2;
        }
        k65 k65Var = k65VarArr[i];
        if (k65Var != null) {
            return k65Var;
        }
        k65 k65Var2 = new k65();
        k65Var2.f119662a = i;
        k65Var2.f119675n = false;
        k65VarArr[i] = k65Var2;
        return k65Var2;
    }

    /* JADX INFO: renamed from: y */
    public final void m58308y() {
        m58305v();
        if (this.f130209d1 && this.f130189M0 == null) {
            Object obj = this.f130225t;
            if (obj instanceof Activity) {
                this.f130189M0 = new hvd1((Activity) obj, this.f130210e1);
            } else if (obj instanceof Dialog) {
                this.f130189M0 = new hvd1((Dialog) obj);
            }
            wj50 wj50Var = this.f130189M0;
            if (wj50Var != null) {
                wj50Var.mo48810S(this.f130232z1);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m58309z(int i) {
        this.f130230x1 = (1 << i) | this.f130230x1;
        if (this.f130229w1) {
            return;
        }
        View decorView = this.f130202Y.getDecorView();
        WeakHashMap weakHashMap = mec1.f142677a;
        decorView.postOnAnimation(this.f130231y1);
        this.f130229w1 = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
