package p204p;

import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.jam.internal.socialconnect.models.SessionOrigin;
import com.spotify.personalizedepisodes.contentservice.p124v1.GetVoicesResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.Voice;
import com.spotify.share.logging.impl.events.proto.Share;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public class utu0 implements tqm0, ObservableOnSubscribe, ggx, Function, wy50, zut0, xge0, v481, mfa1, Function3, gb01 {

    /* JADX INFO: renamed from: a */
    public final Object f233995a;

    public /* synthetic */ utu0(Object obj) {
        this.f233995a = obj;
    }

    /* JADX INFO: renamed from: z */
    public static void m83932z(utu0 utu0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) {
        fbk fbkVar = null;
        String str14 = (i & 16) != 0 ? null : str5;
        y0i0 y0i0Var = (y0i0) utu0Var.f233995a;
        oi01 oi01Var = new oi01(str, str2, str3, str4, str10, str11, str12, str6, str7, str8, str9, str14, str13, null);
        qp0 qp0Var = (qp0) y0i0Var.f267991d;
        boolean zBooleanValue = ((Boolean) x0h1.m89581x(dau.f47107a, new ds01(y0i0Var, fbkVar, 0))).booleanValue();
        mi01 mi01VarM21077C = Share.m21077C();
        mi01VarM21077C.m61801r(oi01Var.m66988c());
        mi01VarM21077C.m61800q(oi01Var.m66987b());
        mi01VarM21077C.m61808y(oi01Var.m66995j());
        mi01VarM21077C.m61799m(oi01Var.m66986a());
        mi01VarM21077C.m61803t(oi01Var.m66990e());
        mi01VarM21077C.m61809z(oi01Var.m66996k());
        mi01VarM21077C.m61802s(oi01Var.m66989d());
        mi01VarM21077C.m61806w(zBooleanValue);
        if (oi01Var.m66998m().length() > 0) {
            mi01VarM21077C.m61797C(oi01Var.m66998m());
        }
        if (oi01Var.m66997l().length() > 0) {
            mi01VarM21077C.m61796B(oi01Var.m66997l());
        }
        String strM66999n = oi01Var.m66999n();
        if (strM66999n != null && strM66999n.length() != 0) {
            mi01VarM21077C.m61798D(oi01Var.m66999n());
        }
        String strM66991f = oi01Var.m66991f();
        if (strM66991f != null && strM66991f.length() != 0) {
            mi01VarM21077C.m61804u(oi01Var.m66991f());
        }
        String strM66994i = oi01Var.m66994i();
        if (strM66994i != null && strM66994i.length() != 0) {
            mi01VarM21077C.m61795A(oi01Var.m66994i());
        }
        String strM66993h = oi01Var.m66993h();
        if (strM66993h != null && strM66993h.length() != 0) {
            mi01VarM21077C.m61807x(oi01Var.m66993h());
        }
        String strM66992g = oi01Var.m66992g();
        if (strM66992g != null && strM66992g.length() != 0) {
            mi01VarM21077C.m61805v(oi01Var.m66992g());
        }
        Share share = (Share) mi01VarM21077C.build();
        qre0 qre0Var = qp0Var.f191108a;
        wj50.m88279p(share);
        qre0Var.m73616a(share);
        share.toString();
    }

    /* JADX INFO: renamed from: A */
    public String m83933A() {
        return s571.m77250i(((edi0) ((fke) this.f233995a)).f58523a, ".share");
    }

    /* JADX INFO: renamed from: B */
    public long m83934B() {
        StatFs statFs = (StatFs) this.f233995a;
        if (statFs == null) {
            throw new IllegalStateException("Required value was null.");
        }
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        StatFs statFs2 = (StatFs) this.f233995a;
        if (statFs2 != null) {
            return statFs2.getBlockSizeLong() * availableBlocksLong;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public Object m83935C(ibk ibkVar) {
        nvc1 nvc1Var;
        if (ibkVar instanceof nvc1) {
            nvc1Var = (nvc1) ibkVar;
            int i = nvc1Var.f158864c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvc1Var.f158864c = i - Integer.MIN_VALUE;
            } else {
                nvc1Var = new nvc1(this, ibkVar);
            }
        } else {
            nvc1Var = new nvc1(this, ibkVar);
        }
        Object objM45924a = nvc1Var.f158862a;
        int i2 = nvc1Var.f158864c;
        if (i2 == 0) {
            bga.m29073P(objM45924a);
            gwc1 gwc1Var = (gwc1) this.f233995a;
            nvc1Var.f158864c = 1;
            objM45924a = gwc1Var.m45924a(nvc1Var);
            yuk yukVar = yuk.f276404a;
            if (objM45924a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM45924a);
        }
        o2x0 o2x0Var = (o2x0) objM45924a;
        if (!o2x0Var.f161171a.f149852O0) {
            throw new HttpException(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful get voices response");
        }
        ae50<Voice> ae50VarM17424n = ((GetVoicesResponse) obj).m17424n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM17424n, 10));
        for (Voice voice : ae50VarM17424n) {
            arrayList.add(new dsc1(voice.getId(), voice.getName(), voice.getDescription(), voice.m17549o()));
        }
        return new fwc1(arrayList);
    }

    /* JADX INFO: renamed from: D */
    public void m83936D(String str, String str2, d850 d850Var) {
        n011.m63274b((n011) this.f233995a, new lu01(str, null, null, null, null, null, null, 126), null, new j511(str2), d850Var, null, 18);
    }

    /* JADX INFO: renamed from: E */
    public void m83937E(String str, Object... objArr) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83937E(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public Object m83938F(long j, String str, ibk ibkVar) {
        hv71 hv71Var;
        String str2;
        long j2;
        if (ibkVar instanceof hv71) {
            hv71Var = (hv71) ibkVar;
            int i = hv71Var.f95610e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hv71Var.f95610e = i - Integer.MIN_VALUE;
            } else {
                hv71Var = new hv71(this, ibkVar);
            }
        } else {
            hv71Var = new hv71(this, ibkVar);
        }
        Object objM76980u = hv71Var.f95608c;
        int i2 = hv71Var.f95610e;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            u37 u37Var = new u37(this, str, j, (fbk) null, 18);
            hv71Var.f95606a = str;
            hv71Var.f95607b = j;
            hv71Var.f95610e = 1;
            objM76980u = s1h1.m76980u(5000L, u37Var, hv71Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
            str2 = str;
            j2 = j;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = hv71Var.f95607b;
            str2 = hv71Var.f95606a;
            bga.m29073P(objM76980u);
        }
        hjc0 hjc0Var = (hjc0) objM76980u;
        if (hjc0Var instanceof fjc0) {
            return new fv71(((fjc0) hjc0Var).m41798a());
        }
        if (hjc0Var instanceof gjc0) {
            na6.m63971s("Timestamp conversion failed for " + str2 + ", falling back to raw timestamp");
            return new ev71(1, j2);
        }
        if (hjc0Var != null) {
            throw new NoWhenBranchMatchedException();
        }
        na6.m63971s("Timestamp conversion timed out for " + str2 + ", falling back to raw timestamp");
        return new ev71(2, j2);
    }

    /* JADX INFO: renamed from: G */
    public h3z0 m83939G(yxy0 yxy0Var) {
        c5x0 c5x0VarM94862w = yxy0Var.m94862w();
        int iM94858m = yxy0Var.m94858m();
        vro0 vro0VarM94860u = yxy0Var.m94860u();
        l0z0 l0z0VarM94852A = yxy0Var.m94852A();
        String strM94853g = yxy0Var.m94853g();
        nuf nufVarM80928c = yxy0Var.m94861v().m80928c();
        return new h3z0(l0z0VarM94852A, iM94858m, strM94853g, nufVarM80928c != null ? k47.m55354o(nufVarM80928c) : null, c5x0VarM94862w, vro0VarM94860u, yxy0Var.m94856k(), yxy0Var.m94859q(), yxy0Var.m94857l(), yxy0Var.m94854h(), yxy0Var.m94855j());
    }

    /* JADX INFO: renamed from: H */
    public void m83940H(String str) {
        utu0[] utu0VarArr = gk71.f80748b;
        int length = utu0VarArr.length;
        int i = 0;
        while (i < length) {
            utu0 utu0Var = utu0VarArr[i];
            i++;
            ((ThreadLocal) utu0Var.f233995a).set(str);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m83941I(String str, Object... objArr) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83941I(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: J */
    public void m83942J(String str, Object... objArr) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83942J(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        q5c1 q5c1Var = (q5c1) obj2;
        String str = (String) obj3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!((aj4) this.f233995a).m26141a()) {
            q5c1Var = p5c1.f174147a;
        }
        return new otb1(zBooleanValue, q5c1Var, str);
    }

    /* JADX INFO: renamed from: K */
    public void m83943K(Throwable th, String str, Object... objArr) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83943K(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // p204p.wy50
    /* JADX INFO: renamed from: a */
    public String mo83944a() {
        String str = ((bd31) ((tc31) this.f233995a)).f26000k.m88229e().f178140g;
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Observable observableM47731b = ((hk31) obj).m47731b();
        exz0 exz0Var = (exz0) this.f233995a;
        return observableM47731b.filter(new djs0(exz0Var, 29)).observeOn(exz0Var.f63875b).doOnNext(new qmx(exz0Var, 28)).onErrorResumeNext(jxq0.f117189Y).subscribeOn(exz0Var.f63876c);
    }

    @Override // p204p.zut0
    /* JADX INFO: renamed from: b */
    public yut0 mo37793b() {
        return ((j251) this.f233995a).m52193d();
    }

    @Override // p204p.mfa1
    /* JADX INFO: renamed from: c */
    public FileChannel mo34935c() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f233995a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
    }

    @Override // p204p.gb01
    /* JADX INFO: renamed from: d */
    public st91 mo44196d() {
        return ((j8g0) this.f233995a).mo24361d();
    }

    @Override // p204p.ggx
    /* JADX INFO: renamed from: e */
    public avu0 mo44704e() throws Throwable {
        IOException iOException = null;
        while (!((pvu0) this.f233995a).f181845l.f286524P0) {
            try {
                gnx0 gnx0VarM71199b = ((pvu0) this.f233995a).m71199b();
                if (!gnx0VarM71199b.isReady()) {
                    fnx0 fnx0VarMo28598f = gnx0VarM71199b.mo28598f();
                    if (fnx0VarMo28598f.f71372b == null && fnx0VarMo28598f.f71373c == null) {
                        fnx0VarMo28598f = gnx0VarM71199b.mo28597c();
                    }
                    gnx0 gnx0Var = fnx0VarMo28598f.f71372b;
                    Throwable th = fnx0VarMo28598f.f71373c;
                    if (th != null) {
                        throw th;
                    }
                    if (gnx0Var != null) {
                        ((pvu0) this.f233995a).f181850q.addFirst(gnx0Var);
                    }
                }
                return gnx0VarM71199b.mo28596a();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    y85.m93061f(iOException, e);
                }
                if (!((pvu0) this.f233995a).m71198a(null)) {
                    throw iOException;
                }
            }
        }
        throw new IOException("Canceled");
    }

    @Override // p204p.wy50
    /* JADX INFO: renamed from: f */
    public MaybeIgnoreElementCompletable mo83945f() {
        Maybe maybeFirstElement = ((bd31) ((tc31) this.f233995a)).m28792c().filter(wej0.f250552M0).firstElement();
        maybeFirstElement.getClass();
        return new MaybeIgnoreElementCompletable(maybeFirstElement);
    }

    @Override // p204p.wy50
    /* JADX INFO: renamed from: g */
    public boolean mo83946g(String str) {
        pj31 pj31VarM88229e = ((bd31) ((tc31) this.f233995a)).f26000k.m88229e();
        return wj50.m88271j(pj31VarM88229e.f178141h, str) && wj50.m88271j(pj31VarM88229e.f178152s, new SessionOrigin("googlemeet"));
    }

    @Override // p204p.zut0
    public View getView() {
        return (j251) this.f233995a;
    }

    @Override // p204p.wy50
    /* JADX INFO: renamed from: h */
    public void mo83947h() {
        ((bd31) ((tc31) this.f233995a)).f26005p.onNext(new ei31(iz50.f107150f));
    }

    @Override // p204p.zut0
    /* JADX INFO: renamed from: i */
    public void mo37796i(int i) {
        ((j251) this.f233995a).m52195f(i);
    }

    @Override // p204p.ggx
    /* JADX INFO: renamed from: j */
    public pvu0 mo44705j() {
        return (pvu0) this.f233995a;
    }

    @Override // p204p.zut0
    /* JADX INFO: renamed from: k */
    public void mo37798k(yut0 yut0Var) {
        ((j251) this.f233995a).m52197h(yut0Var);
    }

    @Override // p204p.wy50
    /* JADX INFO: renamed from: l */
    public boolean mo83948l() {
        return ((bd31) ((tc31) this.f233995a)).f26000k.m88229e().f178135b;
    }

    @Override // p204p.xge0
    /* JADX INFO: renamed from: m */
    public boolean mo41783m(zge0 zge0Var, lhe0 lhe0Var) {
        return false;
    }

    @Override // p204p.tqm0
    /* JADX INFO: renamed from: n */
    public void mo50301n(vqm0 vqm0Var) {
        ((xzx0) this.f233995a).mo51615a(vqm0Var == null ? new wzx0() : new yzx0(vqm0Var));
    }

    @Override // p204p.gb01
    /* JADX INFO: renamed from: o */
    public av91 mo44197o() {
        return ((j8g0) this.f233995a).m52704h();
    }

    @Override // p204p.gb01
    /* JADX INFO: renamed from: p */
    public av91 mo44198p() {
        return ((j8g0) this.f233995a).m52705i();
    }

    @Override // p204p.wy50
    /* JADX INFO: renamed from: q */
    public void mo83949q(String str) {
        ((bd31) ((tc31) this.f233995a)).f26005p.onNext(new ai31(str, true, new vj60(wj60.GOOGLE_MEET), Collections.singleton(xw50.f266592d), 1));
    }

    @Override // p204p.xge0
    /* JADX INFO: renamed from: r */
    public void mo41784r(zge0 zge0Var) {
        Toolbar toolbar = (Toolbar) this.f233995a;
        if (!toolbar.f322a.m110n()) {
            toolbar.f337h1.m59048y(zge0Var);
        }
        kq11 kq11Var = toolbar.f346p1;
        if (kq11Var != null) {
            kq11Var.mo41784r(zge0Var);
        }
    }

    @Override // p204p.zut0
    public void release() {
        ((j251) this.f233995a).m52194e();
    }

    /* JADX INFO: renamed from: s */
    public void m83950s(iv41 iv41Var, wg61 wg61Var, h1k h1kVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-2090006261);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(iv41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(wg61Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(h1kVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(this) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            qqg1.m73532b(vm6.f242710a.mo30068a((e940) this.f233995a), rkk.m75772x(1231150155, new ics0((Object) iv41Var, (Object) this, (Object) wg61Var, (Object) h1kVar, gh00Var, 3), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r0r0(this, iv41Var, wg61Var, h1kVar, gh00Var, i, 7);
        }
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new zg0(((jph0) ((qgy0) this.f233995a)).m53953f(new ono0(observableEmitter, 22), new nzk0(observableEmitter, 27)), 7));
    }

    /* JADX INFO: renamed from: t */
    public void m83951t(SecurityException securityException, Object... objArr) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83951t(securityException, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m83952u(String str, Object... objArr) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83952u(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m83953v(String str, Object... objArr) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83953v(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m83954w(Throwable th) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83954w(th);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m83955x(Throwable th, String str, Object... objArr) {
        for (utu0 utu0Var : gk71.f80748b) {
            utu0Var.m83955x(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: y */
    public void m83956y(yo01 yo01Var, ho01 ho01Var, j611 j611Var, String str, String str2, String str3, String str4, String str5, String str6) {
        if (wj50.m88271j(yo01Var.mo30099a(), qp01.f191110d) || wl51.m88460J0(j611Var.m52507b()) || wl51.m88460J0(j611Var.m52508c())) {
            return;
        }
        m83932z(this, ho01Var.mo26482c(), yo01Var.mo30099a().getValue(), oqg1.m67638g(ho01Var).m80957a(), j611Var.m52507b(), null, j611Var.m52508c(), j611Var.m52506a(), str, str2, str3, str4, str5, str6, 4112);
    }

    public utu0(String str) throws IOException {
        try {
            this.f233995a = new StatFs(str);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    public utu0(he90 he90Var, lb5 lb5Var, k47 k47Var) {
        this.f233995a = he90Var;
    }

    public utu0(int i) {
        switch (i) {
            case 18:
                this.f233995a = new ThreadLocal();
                break;
            case 25:
                this.f233995a = new wy3();
                break;
            case 28:
                this.f233995a = qfc1.m72702l();
                break;
            default:
                this.f233995a = new LinkedHashSet();
                break;
        }
    }

    public utu0(ViewGroup viewGroup, RecyclerView recyclerView, e1e0 e1e0Var, lvt0 lvt0Var, mvt0 mvt0Var, nvt0 nvt0Var) {
        j251 j251Var = new j251(recyclerView.getContext());
        psg1.m70832H(viewGroup, j251Var);
        j251Var.addView(lvt0Var, -1, -2);
        j251Var.m52190a(recyclerView, lvt0Var, nvt0Var, mvt0Var, e1e0Var);
        this.f233995a = j251Var;
    }

    public utu0(e940 e940Var, on3 on3Var) {
        this.f233995a = e940Var;
    }

    public utu0(b0f1 b0f1Var) {
        this.f233995a = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), b0f1Var);
    }
}
