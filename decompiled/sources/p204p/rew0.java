package p204p;

import android.os.Build;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class rew0 {

    /* JADX INFO: renamed from: a */
    public final vaz f198442a;

    /* JADX INFO: renamed from: b */
    public final aaq0 f198443b;

    /* JADX INFO: renamed from: c */
    public final wg61 f198444c;

    /* JADX INFO: renamed from: d */
    public final lsi0 f198445d = msi0.m62770a();

    public rew0(vaz vazVar, kg5 kg5Var, aaq0 aaq0Var, wko wkoVar) {
        this.f198442a = vazVar;
        this.f198443b = aaq0Var;
        this.f198444c = new wg61(new f8w0(wkoVar, 8));
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m75416a() {
        wxz0 wxz0Var = m75417b().f45951b;
        if (wxz0Var != null) {
            return wxz0Var.f256161a;
        }
        wj50.m88260d0("sessionConfigs");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final d701 m75417b() {
        return (d701) this.f198444c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:42:0x00a8, B:46:0x00b6, B:35:0x0088, B:39:0x0096), top: B:54:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, p.jsi0] */
    /* JADX INFO: renamed from: c */
    public final Object m75418c(fbk fbkVar) throws Throwable {
        qew0 qew0Var;
        ?? r2;
        jsi0 jsi0Var;
        rew0 rew0Var;
        String str;
        Map mapM56695h0;
        aaq0 aaq0Var;
        nxs0 nxs0Var;
        f6n0 f6n0Var;
        ?? r3;
        if (fbkVar instanceof qew0) {
            qew0Var = (qew0) fbkVar;
            int i = qew0Var.f188054e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qew0Var.f188054e = i - Integer.MIN_VALUE;
            } else {
                qew0Var = new qew0(this, (ibk) fbkVar);
            }
        } else {
            qew0Var = new qew0(this, (ibk) fbkVar);
        }
        Object objM81104f = qew0Var.f188052c;
        ?? r5 = qew0Var.f188054e;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (r5 == 0) {
                bga.m29073P(objM81104f);
                lsi0 lsi0Var = this.f198445d;
                if (!lsi0Var.m59836f() && !m75417b().m35161b()) {
                    return w2a1Var;
                }
                qew0Var.f188050a = this;
                qew0Var.f188051b = lsi0Var;
                qew0Var.f188054e = 1;
                if (lsi0Var.mo54248a(qew0Var) != yukVar) {
                    jsi0Var = lsi0Var;
                    rew0Var = this;
                }
                return yukVar;
            }
            if (r5 == 1) {
                jsi0 jsi0Var2 = qew0Var.f188051b;
                rew0Var = (rew0) qew0Var.f188050a;
                bga.m29073P(objM81104f);
                jsi0Var = jsi0Var2;
            } else {
                if (r5 == 2) {
                    jsi0 jsi0Var3 = qew0Var.f188051b;
                    rew0Var = (rew0) qew0Var.f188050a;
                    bga.m29073P(objM81104f);
                    r5 = jsi0Var3;
                    r5 = jsi0Var;
                    str = ((q050) objM81104f).f183912a;
                    if (str.equals("")) {
                        r5.mo54249c(null);
                        return w2a1Var;
                    }
                    pqm0 pqm0VarM69840u = pft0.m69840u("X-Crashlytics-Installation-ID", str);
                    String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    rew0Var.getClass();
                    mapM56695h0 = kkc0.m56695h0(pqm0VarM69840u, pft0.m69840u("X-Crashlytics-Device-Model", Pattern.compile("/").matcher(str2).replaceAll("")), pft0.m69840u("X-Crashlytics-OS-Build-Version", Pattern.compile("/").matcher(Build.VERSION.INCREMENTAL).replaceAll("")), pft0.m69840u("X-Crashlytics-OS-Display-Version", Pattern.compile("/").matcher(Build.VERSION.RELEASE).replaceAll("")), pft0.m69840u("X-Crashlytics-API-Client-Version", "2.0.1"));
                    aaq0Var = rew0Var.f198443b;
                    nxs0Var = new nxs0(rew0Var, fbkVar2, 12);
                    f6n0Var = new f6n0(20);
                    qew0Var.f188050a = r5;
                    qew0Var.f188051b = null;
                    qew0Var.f188054e = 3;
                    if (aaq0Var.m25267c(mapM56695h0, nxs0Var, f6n0Var, qew0Var) != yukVar) {
                        r3 = r5;
                    }
                    return yukVar;
                    r2.mo54249c(null);
                    throw th;
                }
                if (r5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r2 = (jsi0) qew0Var.f188050a;
                try {
                    bga.m29073P(objM81104f);
                    r3 = r2;
                } catch (Throwable th) {
                    th = th;
                }
            }
            r3.mo54249c(null);
            return w2a1Var;
            if (!rew0Var.m75417b().m35161b()) {
                jsi0Var.mo54249c(null);
                return w2a1Var;
            }
            tm4 tm4Var = q050.f183911c;
            vaz vazVar = rew0Var.f198442a;
            qew0Var.f188050a = rew0Var;
            qew0Var.f188051b = jsi0Var;
            qew0Var.f188054e = 2;
            objM81104f = tm4Var.m81104f(vazVar, qew0Var);
            if (objM81104f != yukVar) {
                r5 = jsi0Var;
                str = ((q050) objM81104f).f183912a;
                if (str.equals("")) {
                    r5.mo54249c(null);
                    return w2a1Var;
                }
                pqm0 pqm0VarM69840u2 = pft0.m69840u("X-Crashlytics-Installation-ID", str);
                String str3 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                rew0Var.getClass();
                mapM56695h0 = kkc0.m56695h0(pqm0VarM69840u2, pft0.m69840u("X-Crashlytics-Device-Model", Pattern.compile("/").matcher(str3).replaceAll("")), pft0.m69840u("X-Crashlytics-OS-Build-Version", Pattern.compile("/").matcher(Build.VERSION.INCREMENTAL).replaceAll("")), pft0.m69840u("X-Crashlytics-OS-Display-Version", Pattern.compile("/").matcher(Build.VERSION.RELEASE).replaceAll("")), pft0.m69840u("X-Crashlytics-API-Client-Version", "2.0.1"));
                aaq0Var = rew0Var.f198443b;
                nxs0Var = new nxs0(rew0Var, fbkVar2, 12);
                f6n0Var = new f6n0(20);
                qew0Var.f188050a = r5;
                qew0Var.f188051b = null;
                qew0Var.f188054e = 3;
                if (aaq0Var.m25267c(mapM56695h0, nxs0Var, f6n0Var, qew0Var) != yukVar) {
                    r3 = r5;
                    r3.mo54249c(null);
                    return w2a1Var;
                }
                r2.mo54249c(null);
                throw th;
            }
            r5 = jsi0Var;
            return yukVar;
        } catch (Throwable th2) {
            th = th2;
            r2 = r5;
        }
    }
}
