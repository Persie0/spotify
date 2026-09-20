package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.DateIntervalFormat;
import android.icu.util.DateInterval;
import android.icu.util.TimeZone;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import android.util.Log;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.C1636o;
import p196j$.time.LocalDateTime;
import p196j$.time.ZoneOffset;
import p196j$.time.format.DateTimeFormatter;
import p196j$.time.format.DateTimeParseException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wqg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f254043a;

    /* JADX INFO: renamed from: b */
    public static sd40 f254044b;

    /* JADX INFO: renamed from: A */
    public static w4f1 m88753A(Context context) {
        return new w4f1(context, null, w4f1.f247812m, jy61.f117309b, sj10.f209710c);
    }

    /* JADX INFO: renamed from: C */
    public static final String m88754C(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString == null) {
            return "Stack trace N/A";
        }
        if (stackTraceString.length() > 2000) {
            stackTraceString = stackTraceString.substring(0, 1999);
        }
        return stackTraceString.replace('\t', ' ').replace('\n', ' ');
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:27:0x007a, B:29:0x0082, B:30:0x008d, B:37:0x009d, B:24:0x0069, B:39:0x00a0, B:41:0x00a5, B:42:0x00a6, B:23:0x0063, B:31:0x008e, B:33:0x0094), top: B:58:0x0020, outer: #1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #3 {, blocks: (B:31:0x008e, B:33:0x0094), top: B:62:0x008e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:27:0x007a, B:29:0x0082, B:30:0x008d, B:37:0x009d, B:24:0x0069, B:39:0x00a0, B:41:0x00a5, B:42:0x00a6, B:23:0x0063, B:31:0x008e, B:33:0x0094), top: B:58:0x0020, outer: #1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x0094, B:36:0x009c], limit reached: 62 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:27:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: E */
    public static final java.lang.Object m88755E(p204p.ibk r9) {
        /*
            boolean r0 = r9 instanceof p204p.ug10
            if (r0 == 0) goto L13
            r0 = r9
            p.ug10 r0 = (p204p.ug10) r0
            int r1 = r0.f229950f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229950f = r1
            goto L18
        L13:
            p.ug10 r0 = new p.ug10
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f229949e
            p.yuk r1 = p204p.yuk.f276404a
            int r2 = r0.f229950f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            p.upa r2 = r0.f229948d
            p.nzu0 r5 = r0.f229947c
            p.na31 r6 = r0.f229946b
            java.util.concurrent.atomic.AtomicBoolean r7 = r0.f229945a
            p204p.bga.m29073P(r9)     // Catch: java.lang.Throwable -> L30
            goto L7a
        L30:
            r9 = move-exception
            goto Lb3
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            p204p.bga.m29073P(r9)
            r9 = 6
            p.bqa r5 = p204p.xtm0.m92080a(r4, r3, r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r3)
            p.vy00 r2 = new p.vy00
            r6 = 5
            r2.<init>(r6, r9, r5)
            java.lang.Object r6 = p204p.ua31.f228351c
            monitor-enter(r6)
            java.lang.Object r7 = p204p.ua31.f228357i     // Catch: java.lang.Throwable -> Lbd
            java.util.ArrayList r7 = p204p.g6f.m43701O0(r2, r7)     // Catch: java.lang.Throwable -> Lbd
            p204p.ua31.f228357i = r7     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r6)
            p204p.ua31.m82665a()
            p.na31 r6 = new p.na31
            r7 = 0
            r6.<init>(r2, r7)
            p.upa r2 = new p.upa     // Catch: java.lang.Throwable -> L30
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L30
            r7 = r9
        L69:
            r0.f229945a = r7     // Catch: java.lang.Throwable -> L30
            r0.f229946b = r6     // Catch: java.lang.Throwable -> L30
            r0.f229947c = r5     // Catch: java.lang.Throwable -> L30
            r0.f229948d = r2     // Catch: java.lang.Throwable -> L30
            r0.f229950f = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r2.m83652a(r0)     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L30
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto La7
            java.lang.Object r9 = r2.m83653c()     // Catch: java.lang.Throwable -> L30
            p.w2a1 r9 = (p204p.w2a1) r9     // Catch: java.lang.Throwable -> L30
            r7.set(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = p204p.ua31.f228351c     // Catch: java.lang.Throwable -> L30
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L30
            p.sg10 r8 = p204p.ua31.f228358j     // Catch: java.lang.Throwable -> La4
            p.dqi0 r8 = r8.f104790h     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto L9c
            boolean r8 = r8.m36649h()     // Catch: java.lang.Throwable -> La4
            if (r8 != r4) goto L9c
            r8 = r4
            goto L9d
        L9c:
            r8 = r3
        L9d:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L69
            p204p.ua31.m82665a()     // Catch: java.lang.Throwable -> L30
            goto L69
        La4:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.Throwable -> L30
        La7:
            r9 = 0
            r5.mo30230e(r9)     // Catch: java.lang.Throwable -> Lb1
            r6.m63947a()
            p.w2a1 r9 = p204p.w2a1.f247311a
            return r9
        Lb1:
            r9 = move-exception
            goto Lb9
        Lb3:
            throw r9     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r0 = move-exception
            p204p.k0y0.m55038v(r5, r9)     // Catch: java.lang.Throwable -> Lb1
            throw r0     // Catch: java.lang.Throwable -> Lb1
        Lb9:
            r6.m63947a()
            throw r9
        Lbd:
            r9 = move-exception
            monitor-exit(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.wqg1.m88755E(p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m88756F(qe10 qe10Var) {
        return qe10Var.mo47027b(p3u0.f173743b);
    }

    /* JADX INFO: renamed from: H */
    public static final void m88757H(Activity activity, Intent intent) {
        StrictMode.VmPolicy vmPolicyBuild;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        x60 x60Var = new x60(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 0);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            vmPolicyBuild = yk51.f273606a.m93961a(new StrictMode.VmPolicy.Builder(vmPolicy)).build();
        } else {
            vmPolicyBuild = new StrictMode.VmPolicy.Builder().build();
        }
        StrictMode.setVmPolicy(vmPolicyBuild);
        x60Var.invoke();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    /* JADX INFO: renamed from: c */
    public static final void m88758c(vs60 vs60Var, gh00 gh00Var, xre xreVar, y3m y3mVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(671299517);
        int i2 = i | (xq00Var.m91770i(vs60Var) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91766g(xreVar) ? 256 : 128) | (xq00Var.m91770i(y3mVar) ? 2048 : 1024) | 24576;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            us60 us60Var = vs60Var.f244358a;
            int i3 = us60Var.f233540f;
            String str = us60Var.f233538d;
            String str2 = us60Var.f233537c;
            boolean zM91762e = xq00Var.m91762e(edb.m38547C(i3));
            Object objM91750T = xq00Var.m91750T();
            if (zM91762e || objM91750T == obj) {
                objM91750T = i3 == 3 ? lv21.f137205b : opo.m67566p(new o1z0(i3));
                xq00Var.m91793t0(objM91750T);
            }
            AbstractC2524w8 abstractC2524w8 = (AbstractC2524w8) objM91750T;
            r1z0 r1z0Var = new r1z0(us60Var.f233536b, opo.m67574x(lau.f131415a), v64.DEFAULT, (246 & 8) != 0 ? 3 : vs60Var.f244359b, (246 & 16) != 0 ? 1 : 2, false, false, false);
            boolean zM91766g = xq00Var.m91766g(str2) | xq00Var.m91766g(abstractC2524w8);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == obj) {
                objM91750T2 = new q1z0(str2 == null ? "" : str2, abstractC2524w8);
                xq00Var.m91793t0(objM91750T2);
            }
            Object obj2 = (q1z0) objM91750T2;
            n1z0 n1z0Var = new n1z0(1, (46 & 8) != 0 ? 1 : 0, 6, us60Var.f233539e, (46 & 32) != 0 ? "" : null, false);
            boolean zM91766g2 = xq00Var.m91766g(str2) | xq00Var.m91766g(abstractC2524w8);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g2 || objM91750T3 == obj) {
                objM91750T3 = Boolean.valueOf(((str2 == null || str2.length() == 0) && abstractC2524w8.isEmpty()) ? false : true);
                xq00Var.m91793t0(objM91750T3);
            }
            boolean zBooleanValue = ((Boolean) objM91750T3).booleanValue();
            boolean zM91766g3 = xq00Var.m91766g(str);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91766g3 || objM91750T4 == obj) {
                if (str == null || wl51.m88460J0(str)) {
                    str = null;
                }
                xq00Var.m91793t0(str);
                objM91750T4 = str;
            }
            String str3 = (String) objM91750T4;
            boolean zM91768h = xq00Var.m91768h(zBooleanValue) | xq00Var.m91766g(str3) | xq00Var.m91766g(obj2);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91768h || objM91750T5 == obj) {
                Object fyfVar = (zBooleanValue || str3 != null) ? new fyf(new ks1(17, obj2, str3, zBooleanValue), true, -43056075) : null;
                xq00Var.m91793t0(fyfVar);
                objM91750T5 = fyfVar;
            }
            vh00 vh00Var = (vh00) objM91750T5;
            boolean z = tgv.m80781b(us60Var.f233535a) && vs60Var.f244360c && !bga.m29067J(i3, vs60Var.f244361d, vs60Var.f244362e);
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T6 = xq00Var.m91750T();
            if (z2 || objM91750T6 == obj) {
                objM91750T6 = new jj60(2, gh00Var);
                xq00Var.m91793t0(objM91750T6);
            }
            zn91.m96553h(3072, 4, rkk.m75772x(611585988, new C1636o(vs60Var, gh00Var, xreVar, vh00Var, n1z0Var, y3mVar, us60Var, r1z0Var), xq00Var), (eh00) objM91750T6, xq00Var, null, z);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new w5k(vs60Var, gh00Var, xreVar, y3mVar, fxh0Var2, i, 29);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m88759g(kft0 kft0Var, String str, kv91 kv91Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, xq00 xq00Var, int i) {
        kft0 kft0Var2 = kft0Var;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-1328585685);
        int i2 = i | (xq00Var.m91770i(kft0Var2) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16) | (xq00Var.m91770i(kv91Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var2) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var3) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zM91766g = xq00Var.m91766g(kft0Var2);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == obj) {
                objM91750T = new qxg0(str);
                xq00Var.m91793t0(objM91750T);
            }
            qxg0 qxg0Var = (qxg0) objM91750T;
            boolean zM91770i = xq00Var.m91770i(kv91Var) | xq00Var.m91770i(qxg0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new qff0(kv91Var, qxg0Var, null, 17);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49237i(w2a1.f247311a, (th00) objM91750T2, xq00Var);
            boolean zM91770i2 = xq00Var.m91770i(kv91Var) | xq00Var.m91770i(qxg0Var) | ((i2 & 458752) == 131072);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T3 == obj) {
                objM91750T3 = new f1k0(kv91Var, qxg0Var, eh00Var3, 0);
                xq00Var.m91793t0(objM91750T3);
            }
            fyf fyfVarM75772x = rkk.m75772x(874306675, new h1k0(kv91Var, qxg0Var, eh00Var, kft0Var2, 0), xq00Var);
            kft0Var2 = kft0Var;
            hdi.m47224a((eh00) objM91750T3, fyfVarM75772x, null, rkk.m75772x(905943797, new h1k0(kv91Var, qxg0Var, eh00Var2, kft0Var2, 1), xq00Var), rkk.m75772x(937580919, new i1k0(kft0Var2, 0), xq00Var), rkk.m75772x(-1194084168, new i1k0(kft0Var2, 1), xq00Var), null, 0L, 0L, 0L, 0L, 0.0f, null, xq00Var, 1772592, 16276);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ts40(kft0Var2, str, kv91Var, eh00Var, eh00Var2, eh00Var3, i, 16);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m88760h(int i, gh00 gh00Var, xq00 xq00Var, int i2) {
        int i3;
        xq00Var.m91775k0(1953004069);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91762e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.parental_age_denied_title, xq00Var);
            ev51 ev51Var = new ev51(k0e1.m54971F(R.plurals.parental_age_denied_subtitle, i, new Object[]{Integer.valueOf(i)}, xq00Var));
            String strM54977L2 = k0e1.m54977L(R.string.denial_error_close_button, xq00Var);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new rxl0(8, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            glg1.m45152c(strM54977L, strM54977L2, ev51Var, false, (eh00) objM91750T, xq00Var, 0, 8);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new igf(i, i2, 1, gh00Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m88761j(ec61 ec61Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        Uri uri = ec61Var.f58242d;
        xq00Var.m91775k0(1204436278);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ec61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(cxh0.f43038a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            ra9 ra9Var = (ra9) xq00Var.m91774k(sea0.f208255a);
            pa9 pa9VarM75103a = ra9.m75103a(ra9Var, "share-video-swatch", new l1p0(uri.toString(), 14, null), null, (l89) xq00Var.m91774k(sea0.f208256b), null, false, null, null, ContentMediaFormat.EXTRA_EPISODE);
            pa9VarM75103a.m69451q(true);
            pa9VarM75103a.m69450p(2);
            sgg1.m78061e(ec61Var.f58240b, ec61Var.f58241c, eh00Var, rkk.m75772x(-599860679, new sf91(26, pa9VarM75103a, ec61Var), xq00Var), xq00Var, ((i2 << 6) & 7168) | (i2 & 896) | 24576);
            boolean zM91770i = xq00Var.m91770i(ra9Var) | xq00Var.m91770i(pa9VarM75103a);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new n4b0(ra9Var, pa9VarM75103a, 1);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49233e(uri, (gh00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rdb1(ec61Var, eh00Var, i);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Intent m88762k(Intent intent, dc91 dc91Var, int i) {
        Intent intent2 = new Intent(dc91Var.f47464a, (Class<?>) InvisibleActionTrampolineActivity.class);
        intent2.setData(m88765q(dc91Var, i, 2, ""));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    /* JADX INFO: renamed from: l */
    public static final String m88763l(u1i u1iVar) {
        coo cooVar;
        coo cooVar2;
        if (u1iVar == null || (cooVar = u1iVar.f225826b) == null || (cooVar2 = u1iVar.f225827c) == null) {
            return "";
        }
        try {
            Locale localeForLanguageTag = Locale.forLanguageTag(ihf1.m50635s());
            String str = cooVar.f40312a;
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
            LocalDateTime localDateTime = LocalDateTime.parse(str, dateTimeFormatter);
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            long epochMilli = localDateTime.atOffset(zoneOffset).plusMinutes(cooVar.f40313b).toInstant().toEpochMilli();
            long epochMilli2 = LocalDateTime.parse(cooVar2.f40312a, dateTimeFormatter).atOffset(zoneOffset).plusMinutes(cooVar2.f40313b).toInstant().toEpochMilli();
            DateIntervalFormat dateIntervalFormat = DateIntervalFormat.getInstance("yMMM", localeForLanguageTag);
            dateIntervalFormat.setTimeZone(TimeZone.GMT_ZONE);
            String str2 = dateIntervalFormat.format(new DateInterval(epochMilli, epochMilli2));
            wj50.m88279p(str2);
            return str2;
        } catch (DateTimeParseException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static final uo41 m88764m(nfe nfeVar, nfe nfeVar2) {
        nfeVar.mo30970r().size();
        nfeVar2.mo30970r().size();
        List listMo30970r = nfeVar.mo30970r();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listMo30970r, 10));
        Iterator it = listMo30970r.iterator();
        while (it.hasNext()) {
            arrayList.add(((bo91) it.next()).mo27378k());
        }
        List listMo30970r2 = nfeVar2.mo30970r();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(listMo30970r2, 10));
        Iterator it2 = listMo30970r2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new io91(((bo91) it2.next()).mo27380q()));
        }
        return new uo41(kkc0.m56705r0(g6f.m43746s1(arrayList, arrayList2)), 1);
    }

    /* JADX INFO: renamed from: q */
    public static final Uri m88765q(dc91 dc91Var, int i, int i2, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i2 == 1) {
            str2 = "ACTIVITY";
        } else if (i2 == 2) {
            str2 = "BROADCAST";
        } else if (i2 == 3) {
            str2 = "SERVICE";
        } else if (i2 == 4) {
            str2 = "FOREGROUND_SERVICE";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str2 = "CALLBACK";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(dc91Var.f47465b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", bcs.m28783c(dc91Var.f47473j));
        builder.appendQueryParameter("extraData", str);
        if (dc91Var.f47469f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(dc91Var.f47474k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: u */
    public static int m88766u(float f, Resources resources) {
        return (int) (f * resources.getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: v */
    public static int m88767v(float f, Resources resources) {
        int iRound = Math.round(resources.getDisplayMetrics().density * f);
        if (iRound != 0) {
            return iRound;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    /* JADX INFO: renamed from: w */
    public static final String m88768w(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th != null ? th.getCause() : null; cause != null; cause = cause.getCause()) {
            arrayList.add(cause.getClass().getSimpleName());
        }
        return !arrayList.isEmpty() ? fk60.f70476d.m41881b(new mj5(ql51.f189738a, 0), arrayList) : "";
    }
}
