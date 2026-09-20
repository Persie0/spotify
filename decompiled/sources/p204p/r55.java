package p204p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public abstract class r55 extends m500 implements v55 {

    /* JADX INFO: renamed from: X0 */
    public l65 f195966X0;

    public r55() {
        this.f42740d.m59915g().m41110c("androidx:appcompat", new p55(this, 0));
        this.f42738b.m43220a(new q55(this));
    }

    @Override // p204p.cwf, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m74802m0();
        l65 l65Var = (l65) m74800k0();
        l65Var.m58305v();
        ((ViewGroup) l65Var.f130203Y0.findViewById(R.id.content)).addView(view, layoutParams);
        l65Var.f130204Z.m46705a(l65Var.f130202Y.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:104:0x0192  */
    /* JADX WARN: Code duplicated, block: B:107:0x019d  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:74:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x015e  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i;
        Configuration configuration;
        Configuration configuration2;
        g9k g9kVar;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        l65 l65Var = (l65) m74800k0();
        l65Var.f130218m1 = true;
        int i36 = l65Var.f130222q1;
        if (i36 == -100) {
            i36 = c65.f34382b;
        }
        int iM58291A = l65Var.m58291A(context, i36);
        if (c65.m31525b(context) && c65.m31525b(context)) {
            if (!jqa.m54083a()) {
                synchronized (c65.f34389i) {
                    try {
                        jfa0 jfa0Var = c65.f34383c;
                        if (jfa0Var == null) {
                            if (c65.f34384d == null) {
                                c65.f34384d = jfa0.m53162a(vhf1.m85541P(context));
                            }
                            if (!c65.f34384d.f111869a.f122114a.isEmpty()) {
                                c65.f34383c = c65.f34384d;
                            }
                        } else if (!jfa0Var.equals(c65.f34384d)) {
                            jfa0 jfa0Var2 = c65.f34383c;
                            c65.f34384d = jfa0Var2;
                            vhf1.m85540O(context, jfa0Var2.f111869a.f122114a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!c65.f34386f) {
                c65.f34381a.execute(new z55(context, 0));
            }
        }
        jfa0 jfa0VarM58289n = l65.m58289n(context);
        Configuration configuration3 = null;
        if (l65.f130182I1 && (context instanceof ContextThemeWrapper)) {
            try {
                vgf1.m85436g((ContextThemeWrapper) context, l65.m58290s(context, iM58291A, jfa0VarM58289n, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof g9k) {
                    ((g9k) context).m44060a(l65.m58290s(context, iM58291A, jfa0VarM58289n, null, false));
                } else if (l65.f130181H1) {
                    i = Build.VERSION.SDK_INT;
                    Configuration configuration4 = new Configuration();
                    configuration4.uiMode = -1;
                    configuration4.fontScale = 0.0f;
                    configuration = e65.m37893a(context, configuration4).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i2 = configuration.mcc;
                            i3 = configuration2.mcc;
                            if (i2 != i3) {
                                configuration3.mcc = i3;
                            }
                            i4 = configuration.mnc;
                            i5 = configuration2.mnc;
                            if (i4 != i5) {
                                configuration3.mnc = i5;
                            }
                            f65.m40820a(configuration, configuration2, configuration3);
                            i6 = configuration.touchscreen;
                            i7 = configuration2.touchscreen;
                            if (i6 != i7) {
                                configuration3.touchscreen = i7;
                            }
                            i8 = configuration.keyboard;
                            i9 = configuration2.keyboard;
                            if (i8 != i9) {
                                configuration3.keyboard = i9;
                            }
                            i10 = configuration.keyboardHidden;
                            i11 = configuration2.keyboardHidden;
                            if (i10 != i11) {
                                configuration3.keyboardHidden = i11;
                            }
                            i12 = configuration.navigation;
                            i13 = configuration2.navigation;
                            if (i12 != i13) {
                                configuration3.navigation = i13;
                            }
                            i14 = configuration.navigationHidden;
                            i15 = configuration2.navigationHidden;
                            if (i14 != i15) {
                                configuration3.navigationHidden = i15;
                            }
                            i16 = configuration.orientation;
                            i17 = configuration2.orientation;
                            if (i16 != i17) {
                                configuration3.orientation = i17;
                            }
                            i18 = configuration.screenLayout & 15;
                            i19 = configuration2.screenLayout & 15;
                            if (i18 != i19) {
                                configuration3.screenLayout |= i19;
                            }
                            i20 = configuration.screenLayout & 192;
                            i21 = configuration2.screenLayout & 192;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 48;
                            i23 = configuration2.screenLayout & 48;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 768;
                            i25 = configuration2.screenLayout & 768;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            if (i >= 26) {
                                c150.m31239u(configuration, configuration2, configuration3);
                            }
                            i26 = configuration.uiMode & 15;
                            i27 = configuration2.uiMode & 15;
                            if (i26 != i27) {
                                configuration3.uiMode |= i27;
                            }
                            i28 = configuration.uiMode & 48;
                            i29 = configuration2.uiMode & 48;
                            if (i28 != i29) {
                                configuration3.uiMode |= i29;
                            }
                            i30 = configuration.screenWidthDp;
                            i31 = configuration2.screenWidthDp;
                            if (i30 != i31) {
                                configuration3.screenWidthDp = i31;
                            }
                            i32 = configuration.screenHeightDp;
                            i33 = configuration2.screenHeightDp;
                            if (i32 != i33) {
                                configuration3.screenHeightDp = i33;
                            }
                            i34 = configuration.smallestScreenWidthDp;
                            i35 = configuration2.smallestScreenWidthDp;
                            if (i34 != i35) {
                                configuration3.smallestScreenWidthDp = i35;
                            }
                            e65.m37894b(configuration, configuration2, configuration3);
                        }
                    }
                    Configuration configurationM58290s = l65.m58290s(context, iM58291A, jfa0VarM58289n, configuration3, true);
                    g9kVar = new g9k(context, com.spotify.music.R.style.Theme_AppCompat_Empty);
                    g9kVar.m44060a(configurationM58290s);
                    if (context.getTheme() != null) {
                        pzb0.m71724v(g9kVar.getTheme());
                    }
                    context = g9kVar;
                }
            }
        } else if (context instanceof g9k) {
            try {
                ((g9k) context).m44060a(l65.m58290s(context, iM58291A, jfa0VarM58289n, null, false));
            } catch (IllegalStateException unused2) {
                if (l65.f130181H1) {
                    i = Build.VERSION.SDK_INT;
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = e65.m37893a(context, configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i2 = configuration.mcc;
                            i3 = configuration2.mcc;
                            if (i2 != i3) {
                                configuration3.mcc = i3;
                            }
                            i4 = configuration.mnc;
                            i5 = configuration2.mnc;
                            if (i4 != i5) {
                                configuration3.mnc = i5;
                            }
                            f65.m40820a(configuration, configuration2, configuration3);
                            i6 = configuration.touchscreen;
                            i7 = configuration2.touchscreen;
                            if (i6 != i7) {
                                configuration3.touchscreen = i7;
                            }
                            i8 = configuration.keyboard;
                            i9 = configuration2.keyboard;
                            if (i8 != i9) {
                                configuration3.keyboard = i9;
                            }
                            i10 = configuration.keyboardHidden;
                            i11 = configuration2.keyboardHidden;
                            if (i10 != i11) {
                                configuration3.keyboardHidden = i11;
                            }
                            i12 = configuration.navigation;
                            i13 = configuration2.navigation;
                            if (i12 != i13) {
                                configuration3.navigation = i13;
                            }
                            i14 = configuration.navigationHidden;
                            i15 = configuration2.navigationHidden;
                            if (i14 != i15) {
                                configuration3.navigationHidden = i15;
                            }
                            i16 = configuration.orientation;
                            i17 = configuration2.orientation;
                            if (i16 != i17) {
                                configuration3.orientation = i17;
                            }
                            i18 = configuration.screenLayout & 15;
                            i19 = configuration2.screenLayout & 15;
                            if (i18 != i19) {
                                configuration3.screenLayout |= i19;
                            }
                            i20 = configuration.screenLayout & 192;
                            i21 = configuration2.screenLayout & 192;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 48;
                            i23 = configuration2.screenLayout & 48;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 768;
                            i25 = configuration2.screenLayout & 768;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            if (i >= 26) {
                                c150.m31239u(configuration, configuration2, configuration3);
                            }
                            i26 = configuration.uiMode & 15;
                            i27 = configuration2.uiMode & 15;
                            if (i26 != i27) {
                                configuration3.uiMode |= i27;
                            }
                            i28 = configuration.uiMode & 48;
                            i29 = configuration2.uiMode & 48;
                            if (i28 != i29) {
                                configuration3.uiMode |= i29;
                            }
                            i30 = configuration.screenWidthDp;
                            i31 = configuration2.screenWidthDp;
                            if (i30 != i31) {
                                configuration3.screenWidthDp = i31;
                            }
                            i32 = configuration.screenHeightDp;
                            i33 = configuration2.screenHeightDp;
                            if (i32 != i33) {
                                configuration3.screenHeightDp = i33;
                            }
                            i34 = configuration.smallestScreenWidthDp;
                            i35 = configuration2.smallestScreenWidthDp;
                            if (i34 != i35) {
                                configuration3.smallestScreenWidthDp = i35;
                            }
                            e65.m37894b(configuration, configuration2, configuration3);
                        }
                    }
                    Configuration configurationM58290s2 = l65.m58290s(context, iM58291A, jfa0VarM58289n, configuration3, true);
                    g9kVar = new g9k(context, com.spotify.music.R.style.Theme_AppCompat_Empty);
                    g9kVar.m44060a(configurationM58290s2);
                    try {
                        if (context.getTheme() != null) {
                            pzb0.m71724v(g9kVar.getTheme());
                        }
                    } catch (NullPointerException unused3) {
                    }
                    context = g9kVar;
                }
            }
        } else if (l65.f130181H1) {
            i = Build.VERSION.SDK_INT;
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = e65.m37893a(context, configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i2 = configuration.mcc;
                    i3 = configuration2.mcc;
                    if (i2 != i3) {
                        configuration3.mcc = i3;
                    }
                    i4 = configuration.mnc;
                    i5 = configuration2.mnc;
                    if (i4 != i5) {
                        configuration3.mnc = i5;
                    }
                    f65.m40820a(configuration, configuration2, configuration3);
                    i6 = configuration.touchscreen;
                    i7 = configuration2.touchscreen;
                    if (i6 != i7) {
                        configuration3.touchscreen = i7;
                    }
                    i8 = configuration.keyboard;
                    i9 = configuration2.keyboard;
                    if (i8 != i9) {
                        configuration3.keyboard = i9;
                    }
                    i10 = configuration.keyboardHidden;
                    i11 = configuration2.keyboardHidden;
                    if (i10 != i11) {
                        configuration3.keyboardHidden = i11;
                    }
                    i12 = configuration.navigation;
                    i13 = configuration2.navigation;
                    if (i12 != i13) {
                        configuration3.navigation = i13;
                    }
                    i14 = configuration.navigationHidden;
                    i15 = configuration2.navigationHidden;
                    if (i14 != i15) {
                        configuration3.navigationHidden = i15;
                    }
                    i16 = configuration.orientation;
                    i17 = configuration2.orientation;
                    if (i16 != i17) {
                        configuration3.orientation = i17;
                    }
                    i18 = configuration.screenLayout & 15;
                    i19 = configuration2.screenLayout & 15;
                    if (i18 != i19) {
                        configuration3.screenLayout |= i19;
                    }
                    i20 = configuration.screenLayout & 192;
                    i21 = configuration2.screenLayout & 192;
                    if (i20 != i21) {
                        configuration3.screenLayout |= i21;
                    }
                    i22 = configuration.screenLayout & 48;
                    i23 = configuration2.screenLayout & 48;
                    if (i22 != i23) {
                        configuration3.screenLayout |= i23;
                    }
                    i24 = configuration.screenLayout & 768;
                    i25 = configuration2.screenLayout & 768;
                    if (i24 != i25) {
                        configuration3.screenLayout |= i25;
                    }
                    if (i >= 26) {
                        c150.m31239u(configuration, configuration2, configuration3);
                    }
                    i26 = configuration.uiMode & 15;
                    i27 = configuration2.uiMode & 15;
                    if (i26 != i27) {
                        configuration3.uiMode |= i27;
                    }
                    i28 = configuration.uiMode & 48;
                    i29 = configuration2.uiMode & 48;
                    if (i28 != i29) {
                        configuration3.uiMode |= i29;
                    }
                    i30 = configuration.screenWidthDp;
                    i31 = configuration2.screenWidthDp;
                    if (i30 != i31) {
                        configuration3.screenWidthDp = i31;
                    }
                    i32 = configuration.screenHeightDp;
                    i33 = configuration2.screenHeightDp;
                    if (i32 != i33) {
                        configuration3.screenHeightDp = i33;
                    }
                    i34 = configuration.smallestScreenWidthDp;
                    i35 = configuration2.smallestScreenWidthDp;
                    if (i34 != i35) {
                        configuration3.smallestScreenWidthDp = i35;
                    }
                    e65.m37894b(configuration, configuration2, configuration3);
                }
            }
            Configuration configurationM58290s3 = l65.m58290s(context, iM58291A, jfa0VarM58289n, configuration3, true);
            g9kVar = new g9k(context, com.spotify.music.R.style.Theme_AppCompat_Empty);
            g9kVar.m44060a(configurationM58290s3);
            if (context.getTheme() != null) {
                pzb0.m71724v(g9kVar.getTheme());
            }
            context = g9kVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        wj50 wj50VarM74801l0 = m74801l0();
        if (getWindow().hasFeature(0)) {
            if (wj50VarM74801l0 == null || !wj50VarM74801l0.mo65983s()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p204p.bwf, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        wj50 wj50VarM74801l0 = m74801l0();
        if (keyCode == 82 && wj50VarM74801l0 != null && wj50VarM74801l0.mo65980N(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        l65 l65Var = (l65) m74800k0();
        l65Var.m58305v();
        return l65Var.f130202Y.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        l65 l65Var = (l65) m74800k0();
        if (l65Var.f130190N0 == null) {
            l65Var.m58308y();
            wj50 wj50Var = l65Var.f130189M0;
            l65Var.f130190N0 = new r561(wj50Var != null ? wj50Var.mo48806E() : l65Var.f130200X);
        }
        return l65Var.f130190N0;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = a5b1.f12484a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m74800k0().mo31527a();
    }

    /* JADX INFO: renamed from: k0 */
    public final c65 m74800k0() {
        if (this.f195966X0 == null) {
            fc5 fc5Var = c65.f34381a;
            this.f195966X0 = new l65(this, null, this, this);
        }
        return this.f195966X0;
    }

    /* JADX INFO: renamed from: l0 */
    public final wj50 m74801l0() {
        l65 l65Var = (l65) m74800k0();
        l65Var.m58308y();
        return l65Var.f130189M0;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m74802m0() {
        eug1.m40073o(getWindow().getDecorView(), this);
        lug1.m59989F(getWindow().getDecorView(), this);
        y85.m93047D(getWindow().getDecorView(), this);
        gug1.m45757C(getWindow().getDecorView(), this);
    }

    /* JADX INFO: renamed from: n0 */
    public boolean mo13038n0() {
        Intent intentM85483x = vgg1.m85483x(this);
        if (intentM85483x == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentM85483x)) {
            navigateUpTo(intentM85483x);
            return true;
        }
        g741 g741VarM43795d = g741.m43795d(this);
        g741VarM43795d.m43797b(this);
        g741VarM43795d.m43798e();
        try {
            ze0.m95951q0(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m74803o0(Toolbar toolbar) {
        l65 l65Var = (l65) m74800k0();
        if (l65Var.f130225t instanceof Activity) {
            l65Var.m58308y();
            wj50 wj50Var = l65Var.f130189M0;
            if (wj50Var instanceof hvd1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            l65Var.f130190N0 = null;
            if (wj50Var != null) {
                wj50Var.mo65979L();
            }
            l65Var.f130189M0 = null;
            Object obj = l65Var.f130225t;
            o081 o081Var = new o081(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : l65Var.f130191O0, l65Var.f130204Z);
            l65Var.f130189M0 = o081Var;
            l65Var.f130204Z.f87996b = o081Var.f160272h;
            toolbar.setBackInvokedCallbackEnabled(true);
            l65Var.mo31527a();
        }
    }

    @Override // p204p.cwf, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l65 l65Var = (l65) m74800k0();
        if (l65Var.f130209d1 && l65Var.f130201X0) {
            l65Var.m58308y();
            wj50 wj50Var = l65Var.f130189M0;
            if (wj50Var != null) {
                wj50Var.mo48808K();
            }
        }
        p65 p65VarM69177a = p65.m69177a();
        Context context = l65Var.f130200X;
        synchronized (p65VarM69177a) {
            m1x0 m1x0Var = p65VarM69177a.f174297a;
            synchronized (m1x0Var) {
                w2b0 w2b0Var = (w2b0) m1x0Var.f139129b.get(context);
                if (w2b0Var != null) {
                    w2b0Var.m87066b();
                }
            }
        }
        l65Var.f130221p1 = new Configuration(l65Var.f130200X.getResources().getConfiguration());
        l65Var.m58298k(false, false);
    }

    @Override // p204p.m500, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m74800k0().mo31529d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // p204p.m500, p204p.cwf, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        wj50 wj50VarM74801l0 = m74801l0();
        if (menuItem.getItemId() != 16908332 || wj50VarM74801l0 == null || (wj50VarM74801l0.mo48805D() & 4) == 0) {
            return false;
        }
        return mo13038n0();
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((l65) m74800k0()).m58305v();
    }

    @Override // p204p.m500, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        l65 l65Var = (l65) m74800k0();
        l65Var.m58308y();
        wj50 wj50Var = l65Var.f130189M0;
        if (wj50Var != null) {
            wj50Var.mo48814W(true);
        }
    }

    @Override // p204p.m500, android.app.Activity
    public void onStart() {
        super.onStart();
        ((l65) m74800k0()).m58298k(true, false);
    }

    @Override // p204p.m500, android.app.Activity
    public void onStop() {
        super.onStop();
        l65 l65Var = (l65) m74800k0();
        l65Var.m58308y();
        wj50 wj50Var = l65Var.f130189M0;
        if (wj50Var != null) {
            wj50Var.mo48814W(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m74800k0().mo31534j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        wj50 wj50VarM74801l0 = m74801l0();
        if (getWindow().hasFeature(0)) {
            if (wj50VarM74801l0 == null || !wj50VarM74801l0.mo65981O()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p204p.cwf, android.app.Activity
    public final void setContentView(int i) {
        m74802m0();
        m74800k0().mo31531g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((l65) m74800k0()).f130223r1 = i;
    }

    @Override // p204p.cwf, android.app.Activity
    public void setContentView(View view) {
        m74802m0();
        m74800k0().mo31532h(view);
    }

    @Override // p204p.cwf, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m74802m0();
        m74800k0().mo31533i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
