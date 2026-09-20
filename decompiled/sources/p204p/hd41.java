package p204p;

import android.content.Intent;
import android.net.Uri;
import android.view.Window;
import androidx.media3.session.legacy.MediaConstants;
import com.spotify.liveroom.listeningparty.proto.GetAllowedFeaturesRequest;
import com.spotify.liveroom.listeningparty.proto.GetAllowedFeaturesResponse;
import com.spotify.profile.editprofile.editprofile.biodatasource.BioDataSourceException;
import com.spotify.profile.editprofile.editprofile.biodatasource.BioRateLimitException;
import com.spotify.profile.editprofile.editprofile.biodatasource.BioViolationException;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$Bio;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$GetBioAudienceRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$GetBioAudienceResponse;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$SetBioAudienceRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$SetBioAudienceResponse;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$UpdateBioRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$UpdateBioResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class hd41 implements zu30, lk30, Function, dn6, InterfaceC2207oa, Function3, gie0, SingleOnSubscribe {

    /* JADX INFO: renamed from: c */
    public static final cx7 f89989c = new cx7(13);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89990a;

    /* JADX INFO: renamed from: b */
    public final Object f89991b;

    public /* synthetic */ hd41(Object obj, int i) {
        this.f89990a = i;
        this.f89991b = obj;
    }

    /* JADX INFO: renamed from: j */
    public static tn3 m47165j(iey ieyVar) {
        switch (ieyVar.ordinal()) {
            case 0:
            case 6:
                return null;
            case 1:
                return tn3.f221868a;
            case 2:
                return tn3.f221869b;
            case 3:
                return tn3.f221870c;
            case 4:
                return tn3.f221871d;
            case 5:
                return tn3.f221872e;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        fxx fxxVar = (fxx) obj2;
        fxx fxxVar2 = (fxx) obj3;
        ww3 ww3Var = (ww3) this.f89991b;
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add(gao.m44175b(ww3Var.f255683b, (Map) obj, fxxVar.f74479a, false, 28));
        if (!fxxVar.f74479a.isEmpty()) {
            List<axx> list = fxxVar2.f74479a;
            Map mapM56695h0 = kkc0.m56695h0(new pqm0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_PLAYABLE, 1), new pqm0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_BROWSABLE, 1), new pqm0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_SINGLE_ITEM, 1));
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (axx axxVar : list) {
                mec0 mec0Var = new mec0();
                mec0Var.putAll(axxVar.f21046z);
                mec0Var.putAll(mapM56695h0);
                arrayList.add(axx.m27436b(axxVar, null, null, null, 0, null, null, 0, null, null, mec0Var.m61540b(), null, -536870913, 3));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (((axx) obj4).f21031k) {
                    arrayList2.add(obj4);
                }
            }
            ro80VarM44508o.addAll(arrayList2);
        }
        return new fxx(geg1.m44506m(ro80VarM44508o), null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public Single m47166a(String str) {
        return ((fu0) this.f89991b).m42690a(str).map(wqb0.f253989g).onErrorReturn(k8f0.f120347d);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f89990a) {
            case 9:
                return ((ihi) obj).f102296c == u300.ALBUM && ((pd4) this.f89991b).m69639a();
            default:
                return ((hi4) this.f89991b).m47618a() && ((ihi) obj).f102296c == u300.ARTIST_MUSIC_VIDEOS;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f89990a) {
            case 4:
                nc11 nc11Var = (nc11) ((dz0) this.f89991b).f54468b;
                fv31 fv31Var = nc11.f152394b;
                hv31 hv31Var = nc11Var.f152396a;
                lv31 lv31VarEdit = hv31Var.edit();
                lv31VarEdit.m60053f(fv31Var);
                lv31VarEdit.m60054g();
                fv31 fv31Var2 = nc11.f152395c;
                lv31 lv31VarEdit2 = hv31Var.edit();
                lv31VarEdit2.m60053f(fv31Var2);
                lv31VarEdit2.m60054g();
                return k321.f118753a;
            case 6:
                return ((qn6) ((C2263po) this.f89991b).f179551c).m73313a(sjs0.f209928a).m23294e(Single.error((Throwable) obj));
            case 10:
                cc3 cc3Var = (cc3) obj;
                ic3 ic3Var = (ic3) this.f89991b;
                wj50.m88279p(cc3Var);
                Observable<Long> observableTimer = cc3Var.f36292d ? Observable.timer(3L, TimeUnit.SECONDS) : Observable.just(1L);
                wj50.m88279p(observableTimer);
                return observableTimer.flatMap(new pgq0(17, ic3Var, cc3Var));
            case 13:
                return Single.create(new yic1((w54) this.f89991b, 14));
            case 14:
                return Single.create(new yic1((d94) this.f89991b, 15));
            case 15:
                return ((Boolean) obj).booleanValue() ? ((s5p) ((ch4) this.f89991b).f37908o).m77297d().map(h2h1.f87004g) : Observable.just(Boolean.FALSE);
            case 16:
                return Single.create(new yic1((hp4) this.f89991b, 17));
            case 18:
                return Single.create(new yic1((zh5) this.f89991b, 19));
            case 21:
                qd6 qd6Var = (qd6) this.f89991b;
                return qd6Var.f187496d.f218147b.switchMap(new lh51(27, qd6Var, (od6) obj));
            case 24:
                return new CompletableFromAction(new sf7((hv31) obj, (tf7) this.f89991b, 1));
            case 25:
                hua0 hua0Var = (hua0) obj;
                return vjf1.m85770t(dau.f47107a, new jr4((an7) this.f89991b, hua0Var, null, 19)).flatMap(new brl0(hua0Var, 28)).doOnDispose(new s12(hua0Var, 5));
            default:
                tz8 tz8Var = (tz8) this.f89991b;
                k8d0 k8d0Var = tz8Var.f225180d;
                hji hjiVar = tz8Var.f225177a;
                return k8d0Var.mo27649f((fxx) obj, hjiVar.f92054a, hjiVar.f92055b.f273498g, null);
        }
    }

    @Override // p204p.gie0
    /* JADX INFO: renamed from: b */
    public void mo29244b(zge0 zge0Var, boolean z) {
        k65 k65Var;
        l65 l65Var = (l65) this.f89991b;
        zge0 zge0VarMo45461l = zge0Var.mo45461l();
        int i = 0;
        boolean z2 = zge0VarMo45461l != zge0Var;
        if (z2) {
            zge0Var = zge0VarMo45461l;
        }
        k65[] k65VarArr = l65Var.f130215j1;
        int length = k65VarArr != null ? k65VarArr.length : 0;
        while (true) {
            if (i < length) {
                k65Var = k65VarArr[i];
                if (k65Var != null && k65Var.f119669h == zge0Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                k65Var = null;
                break;
            }
        }
        if (k65Var != null) {
            if (!z2) {
                l65Var.m58302q(k65Var, z);
            } else {
                l65Var.m58300o(k65Var.f119662a, k65Var, zge0VarMo45461l);
                l65Var.m58302q(k65Var, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Serializable m47167c(String str, ibk ibkVar) {
        un3 un3Var;
        hd41 hd41Var;
        if (ibkVar instanceof un3) {
            un3Var = (un3) ibkVar;
            int i = un3Var.f232025d;
            if ((i & Integer.MIN_VALUE) != 0) {
                un3Var.f232025d = i - Integer.MIN_VALUE;
            } else {
                un3Var = new un3(this, ibkVar);
            }
        } else {
            un3Var = new un3(this, ibkVar);
        }
        Object objM86031a = un3Var.f232023b;
        int i2 = un3Var.f232025d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86031a);
                vn3 vn3Var = (vn3) this.f89991b;
                n610 n610VarM13069o = GetAllowedFeaturesRequest.m13069o();
                n610VarM13069o.m63754m(str);
                GetAllowedFeaturesRequest getAllowedFeaturesRequest = (GetAllowedFeaturesRequest) n610VarM13069o.build();
                un3Var.f232022a = this;
                un3Var.f232025d = 1;
                objM86031a = vn3Var.m86031a(getAllowedFeaturesRequest, un3Var);
                yuk yukVar = yuk.f276404a;
                if (objM86031a == yukVar) {
                    return yukVar;
                }
                hd41Var = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hd41Var = un3Var.f232022a;
                bga.m29073P(objM86031a);
            }
            wd50<iey> wd50VarM13070n = ((GetAllowedFeaturesResponse) objM86031a).m13070n();
            ArrayList arrayList = new ArrayList();
            for (iey ieyVar : wd50VarM13070n) {
                hd41Var.getClass();
                tn3 tn3VarM47165j = m47165j(ieyVar);
                if (tn3VarM47165j != null) {
                    arrayList.add(tn3VarM47165j);
                }
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m47168d(ibk ibkVar) throws BioDataSourceException {
        vf9 vf9Var;
        if (ibkVar instanceof vf9) {
            vf9Var = (vf9) ibkVar;
            int i = vf9Var.f240916c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vf9Var.f240916c = i - Integer.MIN_VALUE;
            } else {
                vf9Var = new vf9(this, ibkVar);
            }
        } else {
            vf9Var = new vf9(this, ibkVar);
        }
        Object objM93547b = vf9Var.f240914a;
        int i2 = vf9Var.f240916c;
        if (i2 == 0) {
            bga.m29073P(objM93547b);
            eza1 eza1VarM19779o = UserprofileviewV4$GetBioAudienceRequest.m19779o();
            eza1VarM19779o.m40340m();
            UserprofileviewV4$GetBioAudienceRequest userprofileviewV4$GetBioAudienceRequest = (UserprofileviewV4$GetBioAudienceRequest) eza1VarM19779o.build();
            yf9 yf9Var = (yf9) this.f89991b;
            wj50.m88279p(userprofileviewV4$GetBioAudienceRequest);
            vf9Var.f240916c = 1;
            objM93547b = yf9Var.m93547b(userprofileviewV4$GetBioAudienceRequest, vf9Var);
            yuk yukVar = yuk.f276404a;
            if (objM93547b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93547b);
        }
        o2x0 o2x0Var = (o2x0) objM93547b;
        UserprofileviewV4$GetBioAudienceResponse userprofileviewV4$GetBioAudienceResponse = (UserprofileviewV4$GetBioAudienceResponse) o2x0Var.f161172b;
        if (userprofileviewV4$GetBioAudienceResponse != null) {
            if (!o2x0Var.f161171a.f149852O0) {
                userprofileviewV4$GetBioAudienceResponse = null;
            }
            if (userprofileviewV4$GetBioAudienceResponse != null) {
                cg9 cg9VarM70847m = psg1.m70847m(userprofileviewV4$GetBioAudienceResponse.m19781o());
                if (cg9VarM70847m == null) {
                    cg9VarM70847m = cg9.f37597a;
                }
                wd50<cza1> wd50VarM19780n = userprofileviewV4$GetBioAudienceResponse.m19780n();
                ArrayList arrayList = new ArrayList();
                for (cza1 cza1Var : wd50VarM19780n) {
                    wj50.m88279p(cza1Var);
                    cg9 cg9VarM70847m2 = psg1.m70847m(cza1Var);
                    if (cg9VarM70847m2 != null) {
                        arrayList.add(cg9VarM70847m2);
                    }
                }
                return new uf9(cg9VarM70847m, arrayList);
            }
        }
        throw new BioDataSourceException("Failed to get bio audience");
    }

    @Override // p204p.zu30
    /* JADX INFO: renamed from: e */
    public xra0 mo47169e(String str) {
        return (gd41) this.f89991b;
    }

    @Override // p204p.gie0
    /* JADX INFO: renamed from: f */
    public boolean mo29245f(zge0 zge0Var) {
        Window.Callback callback;
        l65 l65Var = (l65) this.f89991b;
        if (zge0Var != zge0Var.mo45461l() || !l65Var.f130209d1 || (callback = l65Var.f130202Y.getCallback()) == null || l65Var.f130220o1) {
            return true;
        }
        callback.onMenuOpened(108, zge0Var);
        return true;
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        o12 o12Var = (o12) this.f89991b;
        return ((jyx0) o12Var.f160571b).m54823b(Uri.parse((String) o12Var.f160572c)).map(mc40.f142050d);
    }

    /* JADX INFO: renamed from: h */
    public ArrayList m47170h(boolean z, boolean z2, boolean z3) {
        boolean zM92907h;
        y64 y64Var = (y64) this.f89991b;
        ArrayList arrayList = new ArrayList();
        C2042k7 c2042k7 = new C2042k7(uuw0.f234280N0, 0);
        while (c2042k7.hasNext()) {
            Object next = c2042k7.next();
            switch (((uuw0) next).ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                case 10:
                case 14:
                    zM92907h = true;
                    break;
                case 6:
                case 7:
                    zM92907h = z;
                    break;
                case 9:
                case 16:
                    zM92907h = false;
                    break;
                case 11:
                    zM92907h = y64Var.m92907h();
                    break;
                case 12:
                    zM92907h = z3;
                    break;
                case 13:
                    zM92907h = z2;
                    break;
                case 15:
                    zM92907h = y64Var.m92909i();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (zM92907h) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Enum m47171i(cg9 cg9Var, ibk ibkVar) throws BioDataSourceException {
        wf9 wf9Var;
        cza1 cza1Var;
        cg9 cg9VarM70847m;
        if (ibkVar instanceof wf9) {
            wf9Var = (wf9) ibkVar;
            int i = wf9Var.f250767c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wf9Var.f250767c = i - Integer.MIN_VALUE;
            } else {
                wf9Var = new wf9(this, ibkVar);
            }
        } else {
            wf9Var = new wf9(this, ibkVar);
        }
        Object objM93548c = wf9Var.f250765a;
        int i2 = wf9Var.f250767c;
        if (i2 == 0) {
            bga.m29073P(objM93548c);
            fza1 fza1VarM19785o = UserprofileviewV4$SetBioAudienceRequest.m19785o();
            int iOrdinal = cg9Var.ordinal();
            if (iOrdinal == 0) {
                cza1Var = cza1.BIO_AUDIENCE_SELF_ONLY;
            } else if (iOrdinal == 1) {
                cza1Var = cza1.BIO_AUDIENCE_CONNECTIONS_ONLY;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cza1Var = cza1.BIO_AUDIENCE_PUBLIC;
            }
            fza1VarM19785o.m43185m(cza1Var);
            UserprofileviewV4$SetBioAudienceRequest userprofileviewV4$SetBioAudienceRequest = (UserprofileviewV4$SetBioAudienceRequest) fza1VarM19785o.build();
            yf9 yf9Var = (yf9) this.f89991b;
            wj50.m88279p(userprofileviewV4$SetBioAudienceRequest);
            wf9Var.f250767c = 1;
            objM93548c = yf9Var.m93548c(userprofileviewV4$SetBioAudienceRequest, wf9Var);
            yuk yukVar = yuk.f276404a;
            if (objM93548c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93548c);
        }
        o2x0 o2x0Var = (o2x0) objM93548c;
        UserprofileviewV4$SetBioAudienceResponse userprofileviewV4$SetBioAudienceResponse = (UserprofileviewV4$SetBioAudienceResponse) o2x0Var.f161172b;
        if (userprofileviewV4$SetBioAudienceResponse != null) {
            if (!o2x0Var.f161171a.f149852O0) {
                userprofileviewV4$SetBioAudienceResponse = null;
            }
            if (userprofileviewV4$SetBioAudienceResponse != null && (cg9VarM70847m = psg1.m70847m(userprofileviewV4$SetBioAudienceResponse.m19786n())) != null) {
                return cg9VarM70847m;
            }
        }
        throw new BioDataSourceException("Failed to set bio audience");
    }

    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public int mo25406k(fk30 fk30Var) {
        return ((Integer) ((n95) this.f89991b).m63911y(fk30Var.componentId().category()).mo49284i(f89989c).mo49280e(0)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[PHI: r4
      0x00a3: PHI (r4v1 int) = (r4v0 int), (r4v2 int), (r4v3 int) binds: [B:33:0x0091, B:35:0x0094, B:37:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public Object m47172l(String str, ibk ibkVar) throws BioDataSourceException, BioViolationException, BioRateLimitException {
        xf9 xf9Var;
        int i;
        if (ibkVar instanceof xf9) {
            xf9Var = (xf9) ibkVar;
            int i2 = xf9Var.f260872c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xf9Var.f260872c = i2 - Integer.MIN_VALUE;
            } else {
                xf9Var = new xf9(this, ibkVar);
            }
        } else {
            xf9Var = new xf9(this, ibkVar);
        }
        Object objM93549d = xf9Var.f260870a;
        int i3 = xf9Var.f260872c;
        if (i3 == 0) {
            bga.m29073P(objM93549d);
            gza1 gza1VarM19788o = UserprofileviewV4$UpdateBioRequest.m19788o();
            bza1 bza1VarM19775r = UserprofileviewV4$Bio.m19775r();
            bza1VarM19775r.m30998m(str);
            gza1VarM19788o.m46195m(bza1VarM19775r);
            UserprofileviewV4$UpdateBioRequest userprofileviewV4$UpdateBioRequest = (UserprofileviewV4$UpdateBioRequest) gza1VarM19788o.build();
            yf9 yf9Var = (yf9) this.f89991b;
            wj50.m88279p(userprofileviewV4$UpdateBioRequest);
            xf9Var.f260872c = 1;
            objM93549d = yf9Var.m93549d(userprofileviewV4$UpdateBioRequest, xf9Var);
            yuk yukVar = yuk.f276404a;
            if (objM93549d == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93549d);
        }
        o2x0 o2x0Var = (o2x0) objM93549d;
        UserprofileviewV4$UpdateBioResponse userprofileviewV4$UpdateBioResponse = (UserprofileviewV4$UpdateBioResponse) o2x0Var.f161172b;
        if (userprofileviewV4$UpdateBioResponse != null) {
            if (!o2x0Var.f161171a.f149852O0) {
                userprofileviewV4$UpdateBioResponse = null;
            }
            if (userprofileviewV4$UpdateBioResponse != null) {
                if (userprofileviewV4$UpdateBioResponse.m19792q()) {
                    throw new BioRateLimitException(userprofileviewV4$UpdateBioResponse.m19790o().m19783o());
                }
                Iterator it = userprofileviewV4$UpdateBioResponse.m19791p().iterator();
                do {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    dza1 dza1Var = (dza1) it.next();
                    wj50.m88279p(dza1Var);
                    int iOrdinal = dza1Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            int i4 = 2;
                            if (iOrdinal != 2) {
                                i4 = 3;
                                if (iOrdinal != 3) {
                                    i4 = 4;
                                    if (iOrdinal == 4) {
                                        i = i4;
                                    } else if (iOrdinal != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    i = i4;
                                }
                            } else {
                                i = i4;
                            }
                        } else {
                            i = 1;
                        }
                    }
                } while (i == 0);
                if (i != 0) {
                    throw new BioViolationException(i);
                }
                if (userprofileviewV4$UpdateBioResponse.m19789n().m19777q()) {
                    return userprofileviewV4$UpdateBioResponse.m19789n().m19776p();
                }
                throw new BioDataSourceException("Failed to update bio");
            }
        }
        throw new BioDataSourceException("Failed to update bio");
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        gi5 gi5Var = (gi5) this.f89991b;
        fnk0 fnk0Var = gi5Var.f80068r;
        if (fnk0Var == null || !fnk0Var.m42228h("apps-music-libs-eventsender.rate_limiting_rule_3_time_unit_seconds")) {
            bjiVar = fnk0Var;
            bjiVar = gi5Var.f80069s;
        }
        if (bjiVar != null) {
        }
    }

    public hd41(xjp xjpVar, e45 e45Var) {
        this.f89990a = 8;
        this.f89991b = xjpVar;
    }

    public hd41(int i) {
        this.f89990a = i;
        switch (i) {
            case 1:
                this.f89991b = new n95(xj30.class, (uh00) n95.f151716t);
                break;
            default:
                gd41 gd41Var = new gd41();
                gd41Var.f53469a = "spotify";
                this.f89991b = gd41Var;
                break;
        }
    }

    public hd41(q831 q831Var, m500 m500Var, v1k0 v1k0Var, luk lukVar) {
        this.f89990a = 23;
        this.f89991b = q831Var;
    }
}
