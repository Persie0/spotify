package p204p;

import com.spotify.connect.esperanto.proto.CommonMessages$LoggingParams;
import com.spotify.connect.esperanto.proto.ConnectMessages$PullRequest;
import com.spotify.connect.esperanto.proto.ConnectMessages$TransferRequest;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class r7p implements ssi {

    /* JADX INFO: renamed from: a */
    public final pri f196625a;

    /* JADX INFO: renamed from: b */
    public final cdp f196626b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f196627c;

    /* JADX INFO: renamed from: d */
    public final luk f196628d;

    /* JADX INFO: renamed from: e */
    public final BehaviorSubject f196629e = BehaviorSubject.m23796g(C2244p5.f174033a);

    /* JADX INFO: renamed from: f */
    public final hb11 f196630f = j0g1.m52092t(0, 1, 0, 5);

    /* JADX INFO: renamed from: g */
    public final lwr f196631g = new lwr();

    /* JADX INFO: renamed from: h */
    public c9k f196632h;

    public r7p(pri priVar, d67 d67Var, cdp cdpVar, Scheduler scheduler, luk lukVar) {
        this.f196625a = priVar;
        this.f196626b = cdpVar;
        this.f196627c = scheduler;
        this.f196628d = lukVar;
        this.f196632h = dq60.m36621u(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m74951c(r7p r7pVar, gh00 gh00Var, ibk ibkVar) {
        m7p m7pVar;
        r7pVar.getClass();
        if (ibkVar instanceof m7p) {
            m7pVar = (m7p) ibkVar;
            int i = m7pVar.f140812c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7pVar.f140812c = i - Integer.MIN_VALUE;
            } else {
                m7pVar = new m7p(r7pVar, ibkVar);
            }
        } else {
            m7pVar = new m7p(r7pVar, ibkVar);
        }
        Object objM74955g = m7pVar.f140810a;
        int i2 = m7pVar.f140812c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM74955g);
                m7pVar.f140812c = 1;
                objM74955g = r7pVar.m74955g(gh00Var, m7pVar);
                Object obj = yuk.f276404a;
                if (objM74955g == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM74955g);
            }
            return (b591) objM74955g;
        } catch (Exception e) {
            qlg1.m73220y(m7pVar.getContext());
            return new z491(new v491(e));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m74952d(r7p r7pVar, String str, String str2, String str3, mb61 mb61Var) {
        pri priVar = r7pVar.f196625a;
        fbk fbkVar = null;
        if (wj50.m88271j(str, "local_device")) {
            tri triVar = (tri) priVar;
            triVar.getClass();
            jti jtiVarM7362o = ConnectMessages$PullRequest.m7362o();
            gpf gpfVarM7300p = CommonMessages$LoggingParams.m7300p();
            if (str2 != null) {
                gpfVarM7300p.m45367m(str2);
            }
            jtiVarM7362o.m54294m((CommonMessages$LoggingParams) gpfVarM7300p.build());
            return triVar.m81352c("Pull playback failure", mb61Var, new gs3(triVar, (ConnectMessages$PullRequest) jtiVarM7362o.build(), fbkVar, 15));
        }
        tri triVar2 = (tri) priVar;
        triVar2.getClass();
        oti otiVarM7439p = ConnectMessages$TransferRequest.m7439p();
        otiVarM7439p.m67799m(str);
        gpf gpfVarM7300p2 = CommonMessages$LoggingParams.m7300p();
        if (str2 != null) {
            gpfVarM7300p2.m45367m(str2);
        }
        if (str3 != null) {
            gpfVarM7300p2.m45368q(str3);
        }
        otiVarM7439p.m67800q((CommonMessages$LoggingParams) gpfVarM7300p2.build());
        return triVar2.m81352c("Transfer playback failure", mb61Var, new gs3(triVar2, (ConnectMessages$TransferRequest) otiVarM7439p.build(), fbkVar, 18));
    }

    /* JADX INFO: renamed from: j */
    public static void m74953j(r7p r7pVar, String str, int i) {
        r7pVar.f196630f.mo46962a(new iwi((i & 2) != 0 ? lwi.f137576a : lwi.f137577b));
        r7pVar.f196629e.onNext(C2244p5.f174033a);
        x0h1.m89578u(r7pVar.f196632h, null, 0, new r2m(r7pVar, str, null, 18), 3);
    }

    /* JADX INFO: renamed from: l */
    public static String m74954l(r7p r7pVar, String str, String str2, int i) {
        String strM74956i = r7pVar.m74956i(str, true, (i & 8) != 0 ? lwi.f137576a : lwi.f137577b);
        x0h1.m89578u(r7pVar.f196632h, null, 0, new fol(9, r7pVar, str, str2, strM74956i, null), 3);
        return strM74956i;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        kk40.m56680v(this.f196632h, null);
        this.f196631g.m60129c();
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (kk40.m56650L(this.f196632h)) {
            return;
        }
        this.f196632h = dq60.m36621u(this.f196628d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m74955g(gh00 gh00Var, ibk ibkVar) {
        n7p n7pVar;
        if (ibkVar instanceof n7p) {
            n7pVar = (n7p) ibkVar;
            int i = n7pVar.f151196c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7pVar.f151196c = i - Integer.MIN_VALUE;
            } else {
                n7pVar = new n7p(this, ibkVar);
            }
        } else {
            n7pVar = new n7p(this, ibkVar);
        }
        Object objInvoke = n7pVar.f151194a;
        int i2 = n7pVar.f151196c;
        try {
            if (i2 == 0) {
                bga.m29073P(objInvoke);
                n7pVar.f151196c = 1;
                objInvoke = gh00Var.invoke(n7pVar);
                Object obj = yuk.f276404a;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objInvoke);
            }
            return (b591) objInvoke;
        } catch (CancellationException e) {
            qlg1.m73220y(n7pVar.getContext());
            return new z491(new v491(e));
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m74956i(String str, boolean z, lwi lwiVar) {
        boolean zM88271j = wj50.m88271j(str, "local_device");
        BehaviorSubject behaviorSubject = this.f196629e;
        hb11 hb11Var = this.f196630f;
        if (zM88271j) {
            hb11Var.mo46962a(new iwi(lwiVar));
            behaviorSubject.onNext(C2244p5.f174033a);
            return null;
        }
        hb11Var.mo46962a(new jwi(str, lwiVar));
        if (z) {
            behaviorSubject.onNext(new hzq0(str));
        }
        String strM35060e = d67.m35060e();
        this.f196626b.m32459g(str, ajq.f16306L0);
        return strM35060e;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: k */
    public final Object m74957k(String str, String str2, boolean z, lwi lwiVar, ibk ibkVar) throws Throwable {
        p7p p7pVar;
        String str3;
        String str4;
        boolean z2;
        String str5;
        if (ibkVar instanceof p7p) {
            p7pVar = (p7p) ibkVar;
            int i = p7pVar.f174740g;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7pVar.f174740g = i - Integer.MIN_VALUE;
            } else {
                p7pVar = new p7p(this, ibkVar);
            }
        } else {
            p7pVar = new p7p(this, ibkVar);
        }
        p7p p7pVar2 = p7pVar;
        Object objM89557A = p7pVar2.f174738e;
        int i2 = p7pVar2.f174740g;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z3 = p7pVar2.f174737d;
                str4 = p7pVar2.f174735b;
                String str6 = p7pVar2.f174734a;
                bga.m29073P(objM89557A);
                z2 = z3;
                str3 = str6;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = p7pVar2.f174736c;
                bga.m29073P(objM89557A);
            }
            return new mwi((b591) objM89557A, str5);
        }
        bga.m29073P(objM89557A);
        oji ojiVar = new oji(this, str, z, lwiVar, (fbk) null);
        p7pVar2.f174734a = str;
        p7pVar2.f174735b = str2;
        p7pVar2.f174737d = z;
        p7pVar2.f174740g = 1;
        objM89557A = x0h1.m89557A(this.f196628d, ojiVar, p7pVar2);
        if (objM89557A != obj) {
            str3 = str;
            str4 = str2;
            z2 = z;
        }
        return obj;
        String str7 = (String) objM89557A;
        gh00 q7pVar = new q7p(this, str3, str4, str7, null, 0);
        p7pVar2.f174734a = null;
        p7pVar2.f174735b = null;
        p7pVar2.f174736c = str7;
        p7pVar2.f174737d = z2;
        p7pVar2.f174740g = 2;
        objM89557A = m74955g(q7pVar, p7pVar2);
        if (objM89557A != obj) {
            str5 = str7;
            return new mwi((b591) objM89557A, str5);
        }
        return obj;
    }
}
