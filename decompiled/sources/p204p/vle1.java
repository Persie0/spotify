package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;

/* JADX INFO: loaded from: classes.dex */
public final class vle1 implements gmj {

    /* JADX INFO: renamed from: a */
    public final hmj f242463a;

    /* JADX INFO: renamed from: b */
    public final fbw f242464b;

    /* JADX INFO: renamed from: c */
    public final hwo f242465c;

    /* JADX INFO: renamed from: d */
    public final yz80 f242466d;

    /* JADX INFO: renamed from: e */
    public final pne1 f242467e;

    /* JADX INFO: renamed from: f */
    public final z6m f242468f;

    /* JADX INFO: renamed from: g */
    public final epx f242469g;

    /* JADX INFO: renamed from: h */
    public final ht7 f242470h;

    /* JADX INFO: renamed from: i */
    public final c06 f242471i;

    /* JADX INFO: renamed from: j */
    public final luk f242472j;

    /* JADX INFO: renamed from: k */
    public final lwr f242473k;

    public vle1(hmj hmjVar, fbw fbwVar, hwo hwoVar, yz80 yz80Var, pne1 pne1Var, z6m z6mVar, epx epxVar, ht7 ht7Var, c06 c06Var, luk lukVar, lwr lwrVar) {
        this.f242463a = hmjVar;
        this.f242464b = fbwVar;
        this.f242465c = hwoVar;
        this.f242466d = yz80Var;
        this.f242467e = pne1Var;
        this.f242468f = z6mVar;
        this.f242469g = epxVar;
        this.f242470h = ht7Var;
        this.f242471i = c06Var;
        this.f242472j = lukVar;
        this.f242473k = lwrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: e */
    public static final Object m85947e(vle1 vle1Var, String str, ibk ibkVar) {
        ule1 ule1Var;
        pne1 pne1Var = vle1Var.f242467e;
        if (ibkVar instanceof ule1) {
            ule1Var = (ule1) ibkVar;
            int i = ule1Var.f231551d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ule1Var.f231551d = i - Integer.MIN_VALUE;
            } else {
                ule1Var = new ule1(vle1Var, ibkVar);
            }
        } else {
            ule1Var = new ule1(vle1Var, ibkVar);
        }
        Object objM85948f = ule1Var.f231549b;
        int i2 = ule1Var.f231551d;
        String strM55392z = "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt";
        if (i2 == 0) {
            bga.m29073P(objM85948f);
            if (!vle1Var.f242468f.m95510a(str)) {
                pne1Var.getClass();
                return new rle1("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
            }
            ule1Var.f231548a = str;
            ule1Var.f231551d = 1;
            objM85948f = vle1Var.m85948f(str, ule1Var);
            Object obj = yuk.f276404a;
            if (objM85948f == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = ule1Var.f231548a;
            bga.m29073P(objM85948f);
        }
        n4m n4mVar = (n4m) objM85948f;
        if (n4mVar == null) {
            pne1Var.getClass();
            return new rle1("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
        }
        String str2 = n4mVar.f150383a;
        if (str2.length() != 0) {
            str = str2;
        }
        sjf1 sjf1Var = n4mVar.f150384b;
        if (sjf1Var instanceof k4m) {
            strM55392z = ((k4m) sjf1Var).m55392z();
        } else {
            pne1Var.getClass();
        }
        return new rle1(strM55392z, str);
    }

    @Override // p204p.gmj
    /* JADX INFO: renamed from: a */
    public final void mo45267a(String str, String str2) {
        this.f242463a.mo45267a(str, str2);
    }

    @Override // p204p.gmj
    /* JADX INFO: renamed from: d */
    public final void mo45268d(String str, String str2) {
        Single singleJust;
        EnumSet enumSet = fbw.f67909e;
        Set set = dd41.f47702f;
        if (!enumSet.contains(r46.m74726U(str).f47709c)) {
            this.f242463a.mo45268d(str, str2);
            return;
        }
        jt7 jt7Var = (jt7) this.f242470h;
        jt7Var.getClass();
        if (jt7.f115748h.contains(r46.m74726U(str).f47709c) && r46.m74726U(str2).f47709c == gn80.SHOW_SHOW) {
            Single single = (Single) jt7Var.f115751c.getValue();
            Single single2 = (Single) jt7Var.f115752d.getValue();
            Single singleM89603c = jt7Var.f115750b.m89603c(geg1.m44518y(str2), jt7.f115747g);
            Observable map = jt7Var.f115749a.m62812a((EnabledShowsCountRequest) EnabledShowsCountRequest.m97410p().build()).map(k8f0.f120337X);
            Boolean bool = Boolean.FALSE;
            singleJust = Single.zip(single, single2, singleM89603c, map.first(bool), new m47(3, str2, jt7Var)).onErrorReturnItem(bool);
            wj50.m88279p(singleJust);
        } else {
            singleJust = Single.just(Boolean.FALSE);
            wj50.m88279p(singleJust);
        }
        fbw fbwVar = this.f242464b;
        Single map2 = z5f.m95456b(fbwVar.f67910a, str, new String[]{str}).map(new tgq(21, fbwVar, str));
        if (fbwVar.f67912c) {
            map2 = map2.flatMap(new u7q(22, fbwVar, str));
        }
        this.f242473k.m60127a(Single.zip(singleJust, map2.flatMap(new f7d1(this, str, str2, false, 5)), mkr0.f144648V0).flatMap(new jhc1(this, 7)).subscribe(new sle1(this, str, str2, 0), new sle1(this, str, str2, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m85948f(String str, ibk ibkVar) throws Throwable {
        tle1 tle1Var;
        Object c6x0Var;
        if (ibkVar instanceof tle1) {
            tle1Var = (tle1) ibkVar;
            int i = tle1Var.f221457d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tle1Var.f221457d = i - Integer.MIN_VALUE;
            } else {
                tle1Var = new tle1(this, ibkVar);
            }
        } else {
            tle1Var = new tle1(this, ibkVar);
        }
        Object objM96567o = tle1Var.f221455b;
        int i2 = tle1Var.f221457d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleFirstOrError = ((jpx) this.f242469g).m53978b(new C1668ai("content_marked_for_download", new hae1(str, 2))).filter(alr0.f16961Y0).firstOrError();
                tle1Var.f221454a = str;
                tle1Var.f221457d = 1;
                objM96567o = zn91.m96567o(singleFirstOrError, tle1Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = tle1Var.f221454a;
                bga.m29073P(objM96567o);
            }
            c6x0Var = (n4m) ((gqx) objM96567o).mo45449a(n4m.class, str).f72301b;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && (thM77348a instanceof CancellationException)) {
            throw thM77348a;
        }
        if (c6x0Var instanceof c6x0) {
            return null;
        }
        return c6x0Var;
    }
}
