package p204p;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.widget.EdgeEffect;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.music.R;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pp91 {

    /* JADX INFO: renamed from: a */
    public static final int[] f179979a = {-2130970287, -2130970293};

    /* JADX INFO: renamed from: b */
    public static final int[] f179980b = {R.attr.state_icon_active};

    /* JADX INFO: renamed from: c */
    public static final int[] f179981c = {android.R.attr.stateListAnimator};

    /* JADX INFO: renamed from: d */
    public static sd40 f179982d;

    /* JADX INFO: renamed from: A */
    public static final void m70517A(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255));
    }

    /* JADX INFO: renamed from: B */
    public static void m70518B(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130970289}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m70519C(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX INFO: renamed from: a */
    public static final void m70520a(qf40 qf40Var, int i, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1581466688);
        int i3 = i2 | (xq00Var.m91766g(qf40Var) ? 4 : 2) | (xq00Var.m91762e(i) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            long jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
            cxh0 cxh0Var = cxh0.f43038a;
            grl0.m45531d(i, nec.m64246i(cxh0Var, jM56535a, kxf1.f127485a), leu.m58815a(xq00Var).f112823a.f229874a.m56535a(), null, rkk.m75772x(1782449922, new pvd(i, gh00Var, qf40Var), xq00Var), xq00Var, ((i3 >> 3) & 14) | 24576, 8);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qvd(qf40Var, i, gh00Var, fxh0Var2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ok4 m70521b(String str, if71 if71Var, long j, yqq yqqVar, hzz hzzVar, int i, int i2) {
        return z520.m95422b(str, if71Var, lau.f131415a, (i2 & 128) != 0 ? Integer.MAX_VALUE : i, 1, j, yqqVar, hzzVar);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062 A[LOOP:0: B:4:0x000b->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0065 A[EDGE_INSN: B:43:0x0065->B:36:0x0065 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0062], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final cpz0 m70522c(lp70 lp70Var, boolean z) {
        exh0 exh0Var = lp70Var.f135674c1.f263388f;
        jlq jlqVar = null;
        if ((exh0Var.f63773d & 8) != 0) {
            loop0: while (exh0Var != null) {
                if ((exh0Var.f63772c & 8) == 0) {
                    if ((exh0Var.f63773d & 8) != 0) {
                        break;
                        break;
                    }
                    exh0Var = exh0Var.f63775f;
                } else {
                    exh0 exh0VarM88331j = exh0Var;
                    qqi0 qqi0Var = null;
                    while (exh0VarM88331j != null) {
                        if (exh0VarM88331j instanceof apz0) {
                            jlqVar = exh0VarM88331j;
                            break loop0;
                        }
                        if ((exh0VarM88331j.f63772c & 8) != 0 && (exh0VarM88331j instanceof xlq)) {
                            int i = 0;
                            for (exh0 exh0Var2 = ((xlq) exh0VarM88331j).f263224N0; exh0Var2 != null; exh0Var2 = exh0Var2.f63775f) {
                                if ((exh0Var2.f63772c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        exh0VarM88331j = exh0Var2;
                                    } else {
                                        if (qqi0Var == null) {
                                            qqi0Var = new qqi0(0, new exh0[16]);
                                        }
                                        if (exh0VarM88331j != null) {
                                            qqi0Var.m73556b(exh0VarM88331j);
                                            exh0VarM88331j = null;
                                        }
                                        qqi0Var.m73556b(exh0Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        exh0VarM88331j = wjg1.m88331j(qqi0Var);
                    }
                    if ((exh0Var.f63773d & 8) != 0) {
                        break;
                    }
                    exh0Var = exh0Var.f63775f;
                }
            }
        }
        wj50.m88279p(jlqVar);
        exh0 exh0Var3 = ((exh0) ((apz0) jlqVar)).f63770a;
        voz0 voz0VarM59647x = lp70Var.m59647x();
        if (voz0VarM59647x == null) {
            voz0VarM59647x = new voz0();
        }
        return new cpz0(exh0Var3, z, lp70Var, voz0VarM59647x);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0141  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m70523d(String str, fxh0 fxh0Var, long j, long j2, if71 if71Var, th00 th00Var, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        int i4;
        int i5;
        th00 th00Var2;
        int i6;
        boolean z;
        long j3;
        long j4;
        if71 if71Var2;
        th00 th00Var3;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var3;
        fxh0 fxh0Var4;
        if71 if71Var3;
        th00 th00Var4;
        long j5;
        long j6;
        xq00Var.m91775k0(1608919246);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91766g(fxh0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= 128;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            i4 = 196608 | i3;
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    th00Var2 = th00Var;
                    if (xq00Var.m91770i(th00Var2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i4 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0 || xq00Var.m91735E()) {
                        if (i7 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var2;
                        }
                        long j7 = leu.m58815a(xq00Var).f112824b.f138757a;
                        long j8 = leu.m58815a(xq00Var).f112823a.f229877d;
                        if71 if71Var4 = leu.m58818d(xq00Var).f64972h;
                        if (i5 != 0) {
                            th00Var2 = null;
                        }
                        fxh0Var4 = fxh0Var3;
                        if71Var3 = if71Var4;
                        th00Var4 = th00Var2;
                        j5 = j8;
                        j6 = j7;
                    } else {
                        xq00Var.m91757b0();
                        j6 = j;
                        if71Var3 = if71Var;
                        fxh0Var4 = fxh0Var2;
                        th00Var4 = th00Var2;
                        j5 = j2;
                    }
                    xq00Var.m91790s();
                    th00 th00Var5 = th00Var4;
                    long j9 = j6;
                    w45.m87125a(rkk.m75772x(-1772295543, new all0(str, if71Var3, j9, 1), xq00Var), mi21.m61822f(1.0f, fxh0Var4), rkk.m75772x(2049436103, new tvb(28, th00Var5, false), xq00Var), rkk.m75772x(-151859522, new c1r0(), xq00Var), 0.0f, rfg1.m75445o(0, 13), y481.m92798f(j5, j5, 0L, j6, 0L, xq00Var, 52), xq00Var, 3462, 144);
                    j4 = j5;
                    j3 = j9;
                    fxh0Var2 = fxh0Var4;
                    if71Var2 = if71Var3;
                    th00Var3 = th00Var5;
                } else {
                    xq00Var.m91757b0();
                    j3 = j;
                    j4 = j2;
                    if71Var2 = if71Var;
                    th00Var3 = th00Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new uw71(str, fxh0Var2, j3, j4, if71Var2, th00Var3, i, i2);
                }
            }
            i4 = 1769472 | i3;
            th00Var2 = th00Var;
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    long j10 = leu.m58815a(xq00Var).f112824b.f138757a;
                    long j11 = leu.m58815a(xq00Var).f112823a.f229877d;
                    if71 if71Var5 = leu.m58818d(xq00Var).f64972h;
                    if (i5 != 0) {
                        th00Var2 = null;
                    }
                    fxh0Var4 = fxh0Var3;
                    if71Var3 = if71Var5;
                    th00Var4 = th00Var2;
                    j5 = j11;
                    j6 = j10;
                } else {
                    if (i7 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    long j12 = leu.m58815a(xq00Var).f112824b.f138757a;
                    long j13 = leu.m58815a(xq00Var).f112823a.f229877d;
                    if71 if71Var6 = leu.m58818d(xq00Var).f64972h;
                    if (i5 != 0) {
                        th00Var2 = null;
                    }
                    fxh0Var4 = fxh0Var3;
                    if71Var3 = if71Var6;
                    th00Var4 = th00Var2;
                    j5 = j13;
                    j6 = j12;
                }
                xq00Var.m91790s();
                th00 th00Var6 = th00Var4;
                long j14 = j6;
                w45.m87125a(rkk.m75772x(-1772295543, new all0(str, if71Var3, j14, 1), xq00Var), mi21.m61822f(1.0f, fxh0Var4), rkk.m75772x(2049436103, new tvb(28, th00Var6, false), xq00Var), rkk.m75772x(-151859522, new c1r0(), xq00Var), 0.0f, rfg1.m75445o(0, 13), y481.m92798f(j5, j5, 0L, j6, 0L, xq00Var, 52), xq00Var, 3462, 144);
                j4 = j5;
                j3 = j14;
                fxh0Var2 = fxh0Var4;
                if71Var2 = if71Var3;
                th00Var3 = th00Var6;
            } else {
                xq00Var.m91757b0();
                j3 = j;
                j4 = j2;
                if71Var2 = if71Var;
                th00Var3 = th00Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new uw71(str, fxh0Var2, j3, j4, if71Var2, th00Var3, i, i2);
            }
        }
        i3 |= 48;
        fxh0Var2 = fxh0Var;
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        i4 = 196608 | i3;
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                th00Var2 = th00Var;
                if (xq00Var.m91770i(th00Var2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    long j15 = leu.m58815a(xq00Var).f112824b.f138757a;
                    long j16 = leu.m58815a(xq00Var).f112823a.f229877d;
                    if71 if71Var7 = leu.m58818d(xq00Var).f64972h;
                    if (i5 != 0) {
                        th00Var2 = null;
                    }
                    fxh0Var4 = fxh0Var3;
                    if71Var3 = if71Var7;
                    th00Var4 = th00Var2;
                    j5 = j16;
                    j6 = j15;
                } else {
                    if (i7 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    long j17 = leu.m58815a(xq00Var).f112824b.f138757a;
                    long j18 = leu.m58815a(xq00Var).f112823a.f229877d;
                    if71 if71Var8 = leu.m58818d(xq00Var).f64972h;
                    if (i5 != 0) {
                        th00Var2 = null;
                    }
                    fxh0Var4 = fxh0Var3;
                    if71Var3 = if71Var8;
                    th00Var4 = th00Var2;
                    j5 = j18;
                    j6 = j17;
                }
                xq00Var.m91790s();
                th00 th00Var7 = th00Var4;
                long j19 = j6;
                w45.m87125a(rkk.m75772x(-1772295543, new all0(str, if71Var3, j19, 1), xq00Var), mi21.m61822f(1.0f, fxh0Var4), rkk.m75772x(2049436103, new tvb(28, th00Var7, false), xq00Var), rkk.m75772x(-151859522, new c1r0(), xq00Var), 0.0f, rfg1.m75445o(0, 13), y481.m92798f(j5, j5, 0L, j6, 0L, xq00Var, 52), xq00Var, 3462, 144);
                j4 = j5;
                j3 = j19;
                fxh0Var2 = fxh0Var4;
                if71Var2 = if71Var3;
                th00Var3 = th00Var7;
            } else {
                xq00Var.m91757b0();
                j3 = j;
                j4 = j2;
                if71Var2 = if71Var;
                th00Var3 = th00Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new uw71(str, fxh0Var2, j3, j4, if71Var2, th00Var3, i, i2);
            }
        }
        i4 = 1769472 | i3;
        th00Var2 = th00Var;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                long j110 = leu.m58815a(xq00Var).f112824b.f138757a;
                long j111 = leu.m58815a(xq00Var).f112823a.f229877d;
                if71 if71Var9 = leu.m58818d(xq00Var).f64972h;
                if (i5 != 0) {
                    th00Var2 = null;
                }
                fxh0Var4 = fxh0Var3;
                if71Var3 = if71Var9;
                th00Var4 = th00Var2;
                j5 = j111;
                j6 = j110;
            } else {
                if (i7 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                long j112 = leu.m58815a(xq00Var).f112824b.f138757a;
                long j113 = leu.m58815a(xq00Var).f112823a.f229877d;
                if71 if71Var10 = leu.m58818d(xq00Var).f64972h;
                if (i5 != 0) {
                    th00Var2 = null;
                }
                fxh0Var4 = fxh0Var3;
                if71Var3 = if71Var10;
                th00Var4 = th00Var2;
                j5 = j113;
                j6 = j112;
            }
            xq00Var.m91790s();
            th00 th00Var8 = th00Var4;
            long j114 = j6;
            w45.m87125a(rkk.m75772x(-1772295543, new all0(str, if71Var3, j114, 1), xq00Var), mi21.m61822f(1.0f, fxh0Var4), rkk.m75772x(2049436103, new tvb(28, th00Var8, false), xq00Var), rkk.m75772x(-151859522, new c1r0(), xq00Var), 0.0f, rfg1.m75445o(0, 13), y481.m92798f(j5, j5, 0L, j6, 0L, xq00Var, 52), xq00Var, 3462, 144);
            j4 = j5;
            j3 = j114;
            fxh0Var2 = fxh0Var4;
            if71Var2 = if71Var3;
            th00Var3 = th00Var8;
        } else {
            xq00Var.m91757b0();
            j3 = j;
            j4 = j2;
            if71Var2 = if71Var;
            th00Var3 = th00Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new uw71(str, fxh0Var2, j3, j4, if71Var2, th00Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final long m70524e(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m70525f(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (wj50.m88282u(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final String m70526g(Object[] objArr, int i, int i2, AbstractC2366s8 abstractC2366s8) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC2366s8) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static final String m70527h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        qsz0 qsz0VarM30487K = btz0.m30487K(type, op91.f167823h);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) btz0.m30490N(qsz0VarM30487K)).getName());
        Iterator it = qsz0VarM30487K.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                h6f.m46721R();
                throw null;
            }
        }
        sb.append(bm51.m29800k0(i, "[]"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static final Bundle m70528i() {
        return new Bundle(0);
    }

    /* JADX INFO: renamed from: j */
    public static final Bundle m70529j(pqm0... pqm0VarArr) {
        Bundle bundle = new Bundle(pqm0VarArr.length);
        for (pqm0 pqm0Var : pqm0VarArr) {
            String str = (String) pqm0Var.f180350a;
            Object obj = pqm0Var.f180351b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                wj50.m88279p(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                p1h1.m68808u(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                p1h1.m68809v(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public static final Type m70530k(sr60 sr60Var, boolean z) {
        kq60 kq60VarMo27067y = sr60Var.mo27067y();
        if (kq60VarMo27067y instanceof ur60) {
            ur60 ur60Var = (ur60) kq60VarMo27067y;
            GenericDeclaration genericDeclarationM83833b = ur60Var.m83833b();
            if (genericDeclarationM83833b == null) {
                throw new UnsupportedOperationException("javaType is not supported for this type: " + sr60Var);
            }
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : genericDeclarationM83833b.getTypeParameters()) {
                if (wj50.m88271j(typeVariable2.getName(), ur60Var.m83834c())) {
                    if (z2) {
                        throw new IllegalArgumentException("Array contains more than one matching element.");
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                return typeVariable;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        if (!(kq60VarMo27067y instanceof up60)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + sr60Var);
        }
        up60 up60Var = (up60) kq60VarMo27067y;
        Class clsM61886u = z ? mif1.m61886u(up60Var) : ((ife) up60Var).mo28587A();
        List listMo27065K = sr60Var.mo27065K();
        if (listMo27065K.isEmpty()) {
            return clsM61886u;
        }
        if (!clsM61886u.isArray()) {
            return m70531l(listMo27065K, clsM61886u);
        }
        if (clsM61886u.getComponentType().isPrimitive()) {
            return clsM61886u;
        }
        xr60 xr60Var = (xr60) g6f.m43708V0(listMo27065K);
        if (xr60Var == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + sr60Var);
        }
        int iM91914a = xr60Var.m91914a();
        sr60 sr60VarM91915b = xr60Var.m91915b();
        int i = iM91914a == 0 ? -1 : np91.f156902a[edb.m38547C(iM91914a)];
        if (i == -1 || i == 1) {
            return clsM61886u;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        wj50.m88279p(sr60VarM91915b);
        Type typeM70530k = m70530k(sr60VarM91915b, false);
        return typeM70530k instanceof Class ? clsM61886u : new l310(typeM70530k);
    }

    /* JADX INFO: renamed from: l */
    public static final stm0 m70531l(List list, Class cls) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m70537r((xr60) it.next()));
            }
            return new stm0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m70537r((xr60) it2.next()));
            }
            return new stm0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        stm0 stm0VarM70531l = m70531l(list.subList(length, list.size()), declaringClass);
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m70537r((xr60) it3.next()));
        }
        return new stm0(cls, stm0VarM70531l, arrayList3);
    }

    /* JADX INFO: renamed from: m */
    public static final pqz m70532m(pqz pqzVar) {
        pqz pqzVarM76202h = ((rpz) ((oz3) wjg1.m88320J(pqzVar)).getFocusOwner()).m76202h();
        if (pqzVarM76202h == null || !pqzVarM76202h.f63766L0) {
            return null;
        }
        return pqzVarM76202h;
    }

    /* JADX INFO: renamed from: n */
    public static final tiv0 m70533n(pqz pqzVar) {
        bnj0 bnj0Var;
        if (pqzVar.f63766L0 && (bnj0Var = pqzVar.f63777h) != null) {
            jo70 jo70VarM71280o = pwg1.m71280o(bnj0Var);
            if (!jo70VarM71280o.mo30016a()) {
                jo70VarM71280o = null;
            }
            if (jo70VarM71280o != null) {
                return pqzVar.m70694K1(jo70VarM71280o);
            }
        }
        return tiv0.f220750e;
    }

    /* JADX INFO: renamed from: o */
    public static r3t0 m70534o(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return r3t0.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return r3t0.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return r3t0.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return r3t0.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return r3t0.SPDY_3;
        }
        if (str.equals("quic")) {
            return r3t0.QUIC;
        }
        if (bm51.m29803n0(str, "h3", false)) {
            return r3t0.HTTP_3;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* JADX INFO: renamed from: p */
    public static final pqz m70535p(pqz pqzVar) {
        boolean z = pqzVar.f63770a.f63766L0;
        if (z) {
            if (!z) {
                mt40.m62791c("visitChildren called on an unattached node");
            }
            qqi0 qqi0Var = new qqi0(0, new exh0[16]);
            exh0 exh0Var = pqzVar.f63770a;
            exh0 exh0Var2 = exh0Var.f63775f;
            if (exh0Var2 == null) {
                wjg1.m88329h(qqi0Var, exh0Var);
            } else {
                qqi0Var.m73556b(exh0Var2);
            }
            while (true) {
                int i = qqi0Var.f191610c;
                if (i == 0) {
                    break;
                }
                exh0 exh0VarM88331j = (exh0) qqi0Var.m73565l(i - 1);
                if ((exh0VarM88331j.f63773d & 1024) == 0) {
                    wjg1.m88329h(qqi0Var, exh0VarM88331j);
                } else {
                    while (exh0VarM88331j != null) {
                        if ((exh0VarM88331j.f63772c & 1024) != 0) {
                            qqi0 qqi0Var2 = null;
                            while (exh0VarM88331j != null) {
                                if (exh0VarM88331j instanceof pqz) {
                                    pqz pqzVar2 = (pqz) exh0VarM88331j;
                                    if (pqzVar2.f63770a.f63766L0) {
                                        int iOrdinal = pqzVar2.m70695L1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return pqzVar2;
                                        }
                                        if (iOrdinal != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                } else if ((exh0VarM88331j.f63772c & 1024) != 0 && (exh0VarM88331j instanceof xlq)) {
                                    int i2 = 0;
                                    for (exh0 exh0Var3 = ((xlq) exh0VarM88331j).f263224N0; exh0Var3 != null; exh0Var3 = exh0Var3.f63775f) {
                                        if ((exh0Var3.f63772c & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                exh0VarM88331j = exh0Var3;
                                            } else {
                                                if (qqi0Var2 == null) {
                                                    qqi0Var2 = new qqi0(0, new exh0[16]);
                                                }
                                                if (exh0VarM88331j != null) {
                                                    qqi0Var2.m73556b(exh0VarM88331j);
                                                    exh0VarM88331j = null;
                                                }
                                                qqi0Var2.m73556b(exh0Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                exh0VarM88331j = wjg1.m88331j(qqi0Var2);
                            }
                            break;
                        }
                        exh0VarM88331j = exh0VarM88331j.f63775f;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static float m70536q(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return qqs.m73579b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: r */
    public static final Type m70537r(xr60 xr60Var) {
        int iM91917d = xr60Var.m91917d();
        if (iM91917d == 0) {
            return wud1.f255146c;
        }
        sr60 sr60VarM91916c = xr60Var.m91916c();
        wj50.m88279p(sr60VarM91916c);
        int iM38547C = edb.m38547C(iM91917d);
        if (iM38547C == 0) {
            return m70530k(sr60VarM91916c, true);
        }
        if (iM38547C == 1) {
            return new wud1(null, m70530k(sr60VarM91916c, true));
        }
        if (iM38547C == 2) {
            return new wud1(m70530k(sr60VarM91916c, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: s */
    public static Object m70538s(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return z35.m95262c(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static Serializable m70539t(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return z35.m95263d(intent, str, cls);
        }
        Serializable serializableExtra = intent.getSerializableExtra(str);
        if (cls.isInstance(serializableExtra)) {
            return serializableExtra;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static final void m70540u(Throwable th, juk jukVar) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.m23782b(th);
        } catch (Throwable th2) {
            y85.m93061f(th, th2);
            srz.m79154l(th, jukVar);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m70541v(pqz pqzVar) {
        lp70 lp70Var;
        bnj0 bnj0Var;
        lp70 lp70Var2;
        bnj0 bnj0Var2 = pqzVar.f63777h;
        return (bnj0Var2 == null || (lp70Var = bnj0Var2.f28850M0) == null || !lp70Var.m59607I() || (bnj0Var = pqzVar.f63777h) == null || (lp70Var2 = bnj0Var.f28850M0) == null || !lp70Var2.m59606H()) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public static void m70542w(String str, Bundle bundle) {
        try {
            faz.m41195c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = ucj0.m82775l(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            gp3 gp3Var = (gp3) faz.m41195c().m41198b(gp3.class);
            if (gp3Var != null) {
                ((ip3) gp3Var).m51227a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m70543x(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            gaz gazVarM44190b = gaz.m44190b();
            String[] strArr = b0e1.f21891a;
            gazVarM44190b.getClass();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(v3d1.m84551l(context), "androidx.work.workdb");
            String[] strArr2 = b0e1.f21891a;
            int iM31820L = c95.m31820L(strArr2.length);
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (String str : strArr2) {
                pqm0 pqm0VarM69840u = pft0.m69840u(new File(databasePath.getPath() + str), new File(file.getPath() + str));
                linkedHashMap.put(pqm0VarM69840u.f180350a, pqm0VarM69840u.f180351b);
            }
            for (Map.Entry entry : kkc0.m56701n0(linkedHashMap, pft0.m69840u(databasePath, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        gaz gazVarM44190b2 = gaz.m44190b();
                        String[] strArr3 = b0e1.f21891a;
                        file3.toString();
                        gazVarM44190b2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    gaz gazVarM44190b3 = gaz.m44190b();
                    String[] strArr4 = b0e1.f21891a;
                    gazVarM44190b3.getClass();
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static float m70544y(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return qqs.m73580c(edgeEffect, f, f2);
        }
        pqs.m70689a(edgeEffect, f, f2);
        return f;
    }

    /* JADX INFO: renamed from: z */
    public static final void m70545z(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }
}
