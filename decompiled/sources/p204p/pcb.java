package p204p;

import android.app.PendingIntent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.IconCompat;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class pcb implements i6i0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176001a;

    /* JADX INFO: renamed from: b */
    public boolean f176002b;

    /* JADX INFO: renamed from: c */
    public boolean f176003c;

    /* JADX INFO: renamed from: d */
    public Object f176004d;

    /* JADX INFO: renamed from: e */
    public Object f176005e;

    /* JADX INFO: renamed from: f */
    public Object f176006f;

    /* JADX INFO: renamed from: g */
    public Object f176007g;

    /* JADX INFO: renamed from: h */
    public Object f176008h;

    public /* synthetic */ pcb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2, int i) {
        this.f176001a = i;
        this.f176004d = obj;
        this.f176005e = obj2;
        this.f176006f = obj3;
        this.f176007g = obj4;
        this.f176008h = obj5;
        this.f176002b = z;
        this.f176003c = z2;
    }

    @Override // p204p.i6i0
    /* JADX INFO: renamed from: a */
    public void mo34490a(eh00 eh00Var, xq00 xq00Var, int i) {
        kqi0 kqi0Var = (kqi0) this.f176008h;
        kqi0 kqi0Var2 = (kqi0) this.f176007g;
        kqi0 kqi0Var3 = (kqi0) this.f176004d;
        ftc0 ftc0Var = (ftc0) this.f176006f;
        wf4 wf4Var = ftc0Var.f73175c;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(1710115768);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91766g(this) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zM91770i = ((i2 & 14) == 4) | xq00Var.m91770i(kqi0Var3);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == obj) {
                objM91750T = new C2369sa(eh00Var, kqi0Var3, 24);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49245q((eh00) objM91750T, xq00Var);
            qf40 qf40Var = (qf40) ((kqi0) this.f176005e).getValue();
            boolean z = !wf4Var.m87949g();
            boolean z2 = wf4Var.m87935F() && ftc0Var.f73182t.mo76359a(6);
            boolean z3 = this.f176002b;
            boolean z4 = this.f176003c;
            boolean zM91770i2 = xq00Var.m91770i(kqi0Var2);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == obj) {
                objM91750T2 = new in70(kqi0Var2, 15);
                xq00Var.m91793t0(objM91750T2);
            }
            eh00 eh00Var2 = (eh00) objM91750T2;
            boolean zM91770i3 = xq00Var.m91770i(kqi0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T3 == obj) {
                objM91750T3 = new esc0(kqi0Var, 3);
                xq00Var.m91793t0(objM91750T3);
            }
            akg1.m26216a(qf40Var, true, z, z2, z3, z4, eh00Var2, (gh00) objM91750T3, xq00Var, 48, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hgb0(this, eh00Var, i, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:139:0x025f  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0289, code lost:
    
        if (r0 == r12) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [p.fq01] */
    /* JADX WARN: Type inference failed for: r10v8, types: [p.fq01] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11, types: [p.fq01] */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r7v1, types: [p.ri5] */
    /* JADX WARN: Type inference failed for: r7v2, types: [p.fq01] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m69548b(zz01 zz01Var, ibk ibkVar) throws Throwable {
        nln0 nln0Var;
        sr01 sr01Var;
        rlv0 rlv0Var;
        zz01 zz01Var2;
        ?? r10;
        sr01 sr01Var2;
        ?? r16;
        Object objM75541m;
        String str;
        String str2;
        String str3;
        ho01 ho01Var;
        ?? r4;
        Throwable thM77348a;
        Throwable thM77348a2;
        ?? r17;
        yea0 yea0Var;
        ocl0 ocl0Var;
        String str4;
        utu0 utu0Var;
        String str5;
        tj01 tj01Var;
        lnd lndVar;
        Object c6x0Var;
        ?? r7 = (ri5) this.f176006f;
        if (ibkVar instanceof nln0) {
            nln0Var = (nln0) ibkVar;
            int i = nln0Var.f155114X;
            if ((i & Integer.MIN_VALUE) != 0) {
                nln0Var.f155114X = i - Integer.MIN_VALUE;
            } else {
                nln0Var = new nln0(this, ibkVar);
            }
        } else {
            nln0Var = new nln0(this, ibkVar);
        }
        nln0 nln0Var2 = nln0Var;
        Object objM56684z = nln0Var2.f155123i;
        int i2 = nln0Var2.f155114X;
        Object obj = yuk.f276404a;
        try {
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            String str6 = nln0Var2.f155122h;
                            String str7 = nln0Var2.f155121g;
                            str2 = nln0Var2.f155120f;
                            ho01Var = nln0Var2.f155119e;
                            rlv0Var = nln0Var2.f155118d;
                            r10 = nln0Var2.f155117c;
                            sr01Var2 = nln0Var2.f155116b;
                            zz01Var2 = nln0Var2.f155115a;
                            try {
                                bga.m29073P(objM56684z);
                                str3 = str6;
                                str = str7;
                                r10 = r10;
                            } catch (Throwable th) {
                                th = th;
                                objM75541m = new c6x0(th);
                                r4 = r10;
                                sr01Var = sr01Var2;
                            }
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bga.m29073P(objM56684z);
                        }
                        return (az01) objM56684z;
                    }
                    bga.m29073P(objM56684z);
                    sr01Var = zz01Var.f287760d.f192533a;
                    fq01 fq01Var = zz01Var.f287759c;
                    rlv0Var = new rlv0();
                    try {
                        dd41 dd41Var = zz01Var.f287758b;
                        String strM35698E = dd41Var.m35698E();
                        try {
                            if (strM35698E == null) {
                                throw new IllegalStateException("Failed to create uri with query parameters from " + dd41Var);
                            }
                            ho01 ho01Var2 = zz01Var.f287764h;
                            try {
                                if (ho01Var2 == null) {
                                    try {
                                        fq01 fq01Var2 = fq01Var;
                                        objM75541m = ri5.m75541m(sr01Var.f213201a.f201918a.f136946a, hr01.f94294g, new Throwable("Feature failed to provide on platform share data"), fq01Var2, null, zz01Var.f287761e);
                                        zz01Var2 = zz01Var;
                                        r17 = fq01Var2;
                                        r4 = r17;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r16 = fq01Var;
                                        zz01Var2 = zz01Var;
                                        sr01Var2 = sr01Var;
                                        r10 = r16;
                                        objM75541m = new c6x0(th);
                                        r4 = r10;
                                        sr01Var = sr01Var2;
                                    }
                                    thM77348a = s6x0.m77348a(objM75541m);
                                    if (thM77348a == null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
                                        throw thM77348a;
                                    }
                                    thM77348a2 = s6x0.m77348a(objM75541m);
                                    if (thM77348a2 == null) {
                                        return objM75541m;
                                    }
                                    String str8 = sr01Var.f213201a.f201918a.f136946a;
                                    ho01 ho01Var3 = (ho01) rlv0Var.f200373a;
                                    z650 z650Var = zz01Var2.f287761e;
                                    nln0Var2.f155115a = null;
                                    nln0Var2.f155116b = null;
                                    nln0Var2.f155117c = null;
                                    nln0Var2.f155118d = null;
                                    nln0Var2.f155119e = null;
                                    nln0Var2.f155120f = null;
                                    nln0Var2.f155121g = null;
                                    nln0Var2.f155122h = null;
                                    nln0Var2.f155114X = 2;
                                    objM56684z = r7.m75549p(thM77348a2, str8, r4, ho01Var3, z650Var);
                                } else {
                                    try {
                                        rlv0Var.f200373a = ho01Var2;
                                        try {
                                            et01 et01Var = (et01) this.f176004d;
                                            String strMo26482c = ho01Var2.mo26482c();
                                            String strMo26481b = ho01Var2.mo26481b();
                                            k1b1 k1b1VarMo26484e = ho01Var2.mo26484e();
                                            pqm0 pqm0VarM39923a = et01Var.m39923a(strMo26482c, strMo26481b, k1b1VarMo26484e != null ? k1b1VarMo26484e.m55090c() : null, ho01Var2.mo26483d());
                                            String str9 = (String) pqm0VarM39923a.f180350a;
                                            String str10 = (String) pqm0VarM39923a.f180351b;
                                            mm0 mm0Var = new mm0(this, zz01Var, ho01Var2, fq01Var, sr01Var, null);
                                            nln0Var2.f155115a = zz01Var;
                                            nln0Var2.f155116b = sr01Var;
                                            nln0Var2.f155117c = fq01Var;
                                            nln0Var2.f155118d = rlv0Var;
                                            nln0Var2.f155119e = ho01Var2;
                                            nln0Var2.f155120f = strM35698E;
                                            nln0Var2.f155121g = str9;
                                            nln0Var2.f155122h = str10;
                                            nln0Var2.f155114X = 1;
                                            objM56684z = kk40.m56684z(mm0Var, nln0Var2);
                                            if (objM56684z != obj) {
                                                r10 = fq01Var;
                                                str = str9;
                                                str2 = strM35698E;
                                                str3 = str10;
                                                rlv0Var = rlv0Var;
                                                zz01Var2 = zz01Var;
                                                sr01Var2 = sr01Var;
                                                ho01Var = ho01Var2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            fq01Var = fq01Var;
                                            zz01Var2 = zz01Var;
                                            r10 = fq01Var;
                                            sr01Var2 = sr01Var;
                                            rlv0Var = rlv0Var;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fq01Var = fq01Var;
                                        zz01Var2 = zz01Var;
                                        r10 = fq01Var;
                                        sr01Var2 = sr01Var;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            return obj;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                    zz01Var2 = zz01Var;
                    r10 = fq01Var;
                    sr01Var2 = sr01Var;
                    objM75541m = new c6x0(th);
                    r4 = r10;
                    sr01Var = sr01Var2;
                    thM77348a = s6x0.m77348a(objM75541m);
                    if (thM77348a == null) {
                    }
                    thM77348a2 = s6x0.m77348a(objM75541m);
                    if (thM77348a2 == null) {
                        return objM75541m;
                    }
                    String str11 = sr01Var.f213201a.f201918a.f136946a;
                    ho01 ho01Var4 = (ho01) rlv0Var.f200373a;
                    z650 z650Var2 = zz01Var2.f287761e;
                    nln0Var2.f155115a = null;
                    nln0Var2.f155116b = null;
                    nln0Var2.f155117c = null;
                    nln0Var2.f155118d = null;
                    nln0Var2.f155119e = null;
                    nln0Var2.f155120f = null;
                    nln0Var2.f155121g = null;
                    nln0Var2.f155122h = null;
                    nln0Var2.f155114X = 2;
                    objM56684z = r7.m75549p(thM77348a2, str11, r4, ho01Var4, z650Var2);
                    if (ho01Var instanceof ud51) {
                        tj01Var = tj01.IMAGE_STORY;
                    } else if (ho01Var instanceof td51) {
                        tj01Var = tj01.GRADIENT_STORY;
                    } else if (ho01Var instanceof vd51) {
                        tj01Var = tj01.VIDEO_STORY;
                    } else if (ho01Var instanceof lc40) {
                        tj01Var = tj01.IMAGE;
                    } else if (ho01Var instanceof bve0) {
                        String str12 = ((bve0) ho01Var).f31344b;
                        if (str12 != null && !wl51.m88460J0(str12)) {
                            tj01Var = tj01.MESSAGE;
                        }
                    } else if (!(ho01Var instanceof an80)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str13 = tj01Var.f220793a;
                    String strM91911g = sr01Var2.f213201a.f201919b.m91911g();
                    xr01 xr01Var = zz01Var2.f287767k;
                    String strM91911g2 = xr01Var != null ? xr01Var.m91911g() : null;
                    ou31 ou31Var = zz01Var2.f287762f;
                    utu0.m83932z(utu0Var, str, str5, str13, str4, null, "", "", strM91911g, strM91911g2, ou31Var.f170162b, ou31Var.f170161a, ou31Var.f170163c, zz01Var2.f287761e.f279709a, 16);
                    ?? r18 = r10;
                    sr01Var = sr01Var2;
                    objM75541m = new az01(r18, new mx01(str4), ho01Var, str4, null, new ccl0(str2, zz01Var2.f287761e, pp91.m70529j(new pqm0("OnPlatformShareData", ocl0Var))), zz01Var2.f287761e);
                    r17 = r18;
                    r4 = r17;
                } catch (Throwable th8) {
                    th = th8;
                    r16 = str;
                    r10 = r16;
                    objM75541m = new c6x0(th);
                    r4 = r10;
                    sr01Var = sr01Var2;
                }
                utu0Var = (utu0) this.f176005e;
                str5 = r10.f72033a;
                tj01Var = tj01.LINK;
            } catch (Throwable th9) {
                th = th9;
                r16 = r10;
            }
            pqm0 pqm0Var = (pqm0) objM56684z;
            String str14 = (String) pqm0Var.f180350a;
            String str15 = (String) pqm0Var.f180351b;
            if (!this.f176002b || (lndVar = zz01Var2.f287763g) == null) {
                yea0Var = null;
            } else {
                try {
                    c6x0Var = svg1.m79482r(lndVar);
                } catch (Throwable th10) {
                    c6x0Var = new c6x0(th10);
                }
                if (c6x0Var instanceof c6x0) {
                    c6x0Var = null;
                }
                yea0Var = (yea0) c6x0Var;
            }
            str4 = str3;
            ocl0Var = new ocl0(str, str4, str14, str15, zz01Var2.f287765i, yea0Var, this.f176003c ? svg1.m79483s(zz01Var2.f287766j, sr01Var2.f213201a.f201919b, ho01Var.mo26482c()) : null);
        } catch (Throwable th11) {
            th = th11;
            objM75541m = new c6x0(th);
            r4 = r10;
            sr01Var = sr01Var2;
        }
        thM77348a = s6x0.m77348a(objM75541m);
        if (thM77348a == null) {
        }
        thM77348a2 = s6x0.m77348a(objM75541m);
        if (thM77348a2 == null) {
            return objM75541m;
        }
        String str16 = sr01Var.f213201a.f201918a.f136946a;
        ho01 ho01Var5 = (ho01) rlv0Var.f200373a;
        z650 z650Var3 = zz01Var2.f287761e;
        nln0Var2.f155115a = null;
        nln0Var2.f155116b = null;
        nln0Var2.f155117c = null;
        nln0Var2.f155118d = null;
        nln0Var2.f155119e = null;
        nln0Var2.f155120f = null;
        nln0Var2.f155121g = null;
        nln0Var2.f155122h = null;
        nln0Var2.f155114X = 2;
        objM56684z = r7.m75549p(thM77348a2, str16, r4, ho01Var5, z650Var3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v8 p.nuh0, still in use, count: 2, list:
          (r4v8 p.nuh0) from 0x00f6: MOVE (r34v0 p.nuh0) = (r4v8 p.nuh0) (LINE:247)
          (r4v8 p.nuh0) from 0x00e0: MOVE (r34v2 p.nuh0) = (r4v8 p.nuh0) (LINE:225)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: c */
    public void m69549c(p204p.f9w r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.pcb.m69549c(p.f9w):void");
    }

    /* JADX INFO: renamed from: d */
    public ctj0 m69550d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.f176008h;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                throw ikc0.m50937i(it);
            }
        }
        return new ctj0((IconCompat) this.f176004d, (CharSequence) this.f176005e, (PendingIntent) this.f176006f, (Bundle) this.f176007g, arrayList2.isEmpty() ? null : (tdw0[]) arrayList2.toArray(new tdw0[arrayList2.size()]), arrayList.isEmpty() ? null : (tdw0[]) arrayList.toArray(new tdw0[arrayList.size()]), this.f176002b, this.f176003c);
    }

    /* JADX INFO: renamed from: e */
    public sr01 m69551e() {
        wi01 wi01Var = (wi01) this.f176004d;
        if (wi01Var == null) {
            throw new IllegalStateException("shareAssetContent must be set");
        }
        lu01 lu01VarM59923c = (lu01) this.f176008h;
        if (lu01VarM59923c == null) {
            lu01VarM59923c = new lu01(wi01Var.f251474d, null, null, null, null, null, null, 126);
        }
        Long l = (Long) this.f176007g;
        if (l != null) {
            lu01VarM59923c = lu01.m59923c(lu01VarM59923c, null, opo.m67547D(kkc0.m56701n0(lu01VarM59923c.f136948c, new pqm0("t", String.valueOf(l.longValue() / ((long) 1000))))), null, ContentType.USER_GENERATED_LIVE);
        }
        return new sr01(new rr01(lu01VarM59923c, vsg1.m86352l(gn80.SHARE_FORMAT_LYRICS, new String[0])), new nk01(new um01(qpv0.f191387a.mo54112b(hlb0.class)), new jlb0(wi01Var), xj01.f261984a, this.f176002b || this.f176003c), new q111((a400) this.f176005e, null, false, (String) this.f176006f, 2));
    }

    /* JADX INFO: renamed from: f */
    public boolean m69552f(char c, char c2) {
        if (this.f176002b) {
            return c == c2;
        }
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* JADX INFO: renamed from: g */
    public pcb m69553g() {
        return new pcb(this);
    }

    /* JADX INFO: renamed from: h */
    public View m69554h() {
        ovf ovfVarMo26174a = ((yiu) this.f176004d).mo26174a(this.f176002b ? g7w.f77361b : g7w.f77360a);
        this.f176008h = ovfVarMo26174a;
        return (ConstraintLayout) ((xzo) ovfVarMo26174a).f267728c;
    }

    /* JADX INFO: renamed from: i */
    public vno m69555i() {
        return (vno) edb.m38559h(1, (ArrayList) this.f176008h);
    }

    /* JADX INFO: renamed from: j */
    public void m69556j(boolean z) {
        ArrayList arrayList = (ArrayList) this.f176008h;
        if (z) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: k */
    public Locale m69557k() {
        return (Locale) this.f176004d;
    }

    /* JADX INFO: renamed from: l */
    public Long m69558l(dz61 dz61Var) {
        return (Long) m69555i().f243184e.get(dz61Var);
    }

    /* JADX INFO: renamed from: m */
    public zpo m69559m() {
        return (zpo) this.f176005e;
    }

    /* JADX INFO: renamed from: n */
    public boolean m69560n() {
        return this.f176002b;
    }

    /* JADX INFO: renamed from: o */
    public boolean m69561o() {
        return this.f176003c;
    }

    /* JADX INFO: renamed from: p */
    public void m69562p(boolean z) {
        this.f176002b = z;
    }

    /* JADX INFO: renamed from: q */
    public void m69563q(gze1 gze1Var) {
        jlg1.m53716z(gze1Var, "zone");
        m69555i().f243183d = gze1Var;
    }

    /* JADX INFO: renamed from: r */
    public int m69564r(dz61 dz61Var, long j, int i, int i2) {
        jlg1.m53716z(dz61Var, "field");
        Long l = (Long) m69555i().f243184e.put(dz61Var, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    /* JADX INFO: renamed from: s */
    public void m69565s() {
        m69555i().f243185f = true;
    }

    /* JADX INFO: renamed from: t */
    public void m69566t(boolean z) {
        this.f176003c = z;
    }

    public String toString() {
        switch (this.f176001a) {
            case 1:
                return m69555i().toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m69567u() {
        ArrayList arrayList = (ArrayList) this.f176008h;
        vno vnoVarM69555i = m69555i();
        vno vnoVar = new vno(vnoVarM69555i.f243188i);
        vnoVar.f243183d = vnoVarM69555i.f243183d;
        vnoVar.f243184e.putAll(vnoVarM69555i.f243184e);
        vnoVar.f243185f = vnoVarM69555i.f243185f;
        arrayList.add(vnoVar);
    }

    /* JADX INFO: renamed from: v */
    public boolean m69568v(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.f176002b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public vno m69569w() {
        return m69555i();
    }

    public pcb(kqi0 kqi0Var, kqi0 kqi0Var2, ftc0 ftc0Var, boolean z, boolean z2, kqi0 kqi0Var3, kqi0 kqi0Var4) {
        this.f176001a = 7;
        this.f176004d = kqi0Var;
        this.f176005e = kqi0Var2;
        this.f176006f = ftc0Var;
        this.f176002b = z;
        this.f176003c = z2;
        this.f176007g = kqi0Var3;
        this.f176008h = kqi0Var4;
    }

    public pcb(boolean z, boolean z2) {
        this.f176001a = 6;
        this.f176002b = z;
        this.f176003c = z2;
        this.f176005e = z300.f278736b;
    }

    public pcb(yiu yiuVar, dgp dgpVar, boolean z, ixr ixrVar, h9w h9wVar, boolean z2) {
        this.f176001a = 2;
        this.f176004d = yiuVar;
        this.f176005e = dgpVar;
        this.f176002b = z;
        this.f176006f = ixrVar;
        this.f176007g = h9wVar;
        this.f176003c = z2;
    }

    public pcb(epx epxVar, wt80 wt80Var, zxx0 zxx0Var, boolean z, w221 w221Var, r1b r1bVar, boolean z2) {
        this.f176001a = 5;
        this.f176004d = epxVar;
        this.f176005e = wt80Var;
        this.f176006f = zxx0Var;
        this.f176002b = z;
        this.f176007g = w221Var;
        this.f176008h = r1bVar;
        this.f176003c = z2;
    }

    public pcb(wcb wcbVar, htz0 htz0Var) {
        this.f176001a = 0;
        this.f176002b = false;
        this.f176003c = false;
        this.f176006f = new Object();
        this.f176007g = new gl8();
        this.f176004d = wcbVar;
        this.f176005e = htz0Var;
    }

    public pcb(bno bnoVar) {
        this.f176001a = 1;
        this.f176002b = true;
        this.f176003c = true;
        ArrayList arrayList = new ArrayList();
        this.f176008h = arrayList;
        this.f176004d = bnoVar.f28904b;
        this.f176005e = bnoVar.f28905c;
        this.f176006f = bnoVar.f28907e;
        this.f176007g = bnoVar.f28908f;
        arrayList.add(new vno(this));
    }

    public pcb(pcb pcbVar) {
        this.f176001a = 1;
        this.f176002b = true;
        this.f176003c = true;
        ArrayList arrayList = new ArrayList();
        this.f176008h = arrayList;
        this.f176004d = (Locale) pcbVar.f176004d;
        this.f176005e = (zpo) pcbVar.f176005e;
        this.f176006f = (ice) pcbVar.f176006f;
        this.f176007g = (gze1) pcbVar.f176007g;
        this.f176002b = pcbVar.f176002b;
        this.f176003c = pcbVar.f176003c;
        arrayList.add(new vno(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pcb(int i, PendingIntent pendingIntent, String str) {
        this(i != 0 ? IconCompat.m393g(null, "", i) : null, str, pendingIntent, new Bundle());
        this.f176001a = 8;
    }

    public pcb(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f176001a = 8;
        this.f176002b = true;
        this.f176003c = true;
        this.f176004d = iconCompat;
        this.f176005e = ktj0.m57322d(charSequence);
        this.f176006f = pendingIntent;
        this.f176007g = bundle;
        this.f176008h = null;
        this.f176002b = true;
        this.f176003c = true;
    }
}
