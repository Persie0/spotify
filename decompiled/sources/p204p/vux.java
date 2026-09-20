package p204p;

import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.download.esperanto.proto.EsDownload$FileStreamerId;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.kidsgraduation.p088v1.PostponeGraduationRequest;
import com.spotify.messages.ListeningPartyJoinDevice;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.profile.profilelist.datasource.PartialProfileListDataException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes7.dex */
public final class vux implements Function, fi00, wc40, pc81, InterfaceC2207oa, Producer, w1j0, SingleOnSubscribe, ant {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245089a;

    /* JADX INFO: renamed from: b */
    public final Object f245090b;

    public /* synthetic */ vux(Object obj, int i) {
        this.f245089a = i;
        this.f245090b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public Object m86451a(o2x0 o2x0Var, fbk fbkVar) {
        ac40 ac40Var;
        String strM78534b;
        String strM78534b2;
        List listSingletonList;
        String str;
        String str2;
        boolean z;
        if (fbkVar instanceof ac40) {
            ac40Var = (ac40) fbkVar;
            int i = ac40Var.f14252i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac40Var.f14252i = i - Integer.MIN_VALUE;
            } else {
                ac40Var = new ac40(this, (ibk) fbkVar);
            }
        } else {
            ac40Var = new ac40(this, (ibk) fbkVar);
        }
        Object obj = ac40Var.f14250g;
        int i2 = ac40Var.f14252i;
        if (i2 == 0) {
            bga.m29073P(obj);
            n2x0 n2x0Var = o2x0Var.f161171a;
            sn20 sn20Var = n2x0Var.f149862f;
            String strM78534b3 = n2x0Var.f149862f.m78534b("X-Background-Top-Color");
            strM78534b = sn20Var.m78534b("X-Background-Bottom-Color");
            strM78534b2 = sn20Var.m78534b("X-Sticker-Title");
            String strM78534b4 = sn20Var.m78534b("X-Sticker-Subtitle");
            boolean z2 = Boolean.parseBoolean(sn20Var.m78534b("X-Is-Preselected"));
            String strM78534b5 = sn20Var.m78534b("X-Background-Image-Url");
            Uri uri = strM78534b5 != null ? Uri.parse(strM78534b5) : null;
            listSingletonList = uri != null ? Collections.singletonList(uri) : lau.f131415a;
            tfm0 tfm0Var = (tfm0) this.f245090b;
            Object obj2 = o2x0Var.f161172b;
            wj50.m88279p(obj2);
            InputStream inputStreamM69091a = ((p3x0) obj2).m69091a();
            ac40Var.f14244a = strM78534b3;
            ac40Var.f14245b = strM78534b;
            ac40Var.f14246c = strM78534b2;
            ac40Var.f14247d = strM78534b4;
            ac40Var.f14248e = listSingletonList;
            ac40Var.f14249f = z2;
            ac40Var.f14252i = 1;
            Comparable comparableM80699n = tfm0Var.m80699n(inputStreamM69091a, ac40Var);
            yuk yukVar = yuk.f276404a;
            if (comparableM80699n == yukVar) {
                return yukVar;
            }
            str = strM78534b3;
            str2 = strM78534b4;
            z = z2;
            obj = comparableM80699n;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = ac40Var.f14249f;
            listSingletonList = ac40Var.f14248e;
            String str3 = ac40Var.f14247d;
            strM78534b2 = ac40Var.f14246c;
            strM78534b = ac40Var.f14245b;
            str = ac40Var.f14244a;
            bga.m29073P(obj);
            z = z3;
            str2 = str3;
        }
        List list = listSingletonList;
        String str4 = strM78534b2;
        Uri uri2 = (Uri) obj;
        if (uri2 != null) {
            return new m811(uri2, str != null ? new Integer(Color.parseColor(str)) : null, strM78534b != null ? new Integer(Color.parseColor(strM78534b)) : null, str4, str2, z, list);
        }
        return null;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((kvb1) this.f245090b).f126822a.m64552a();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single singleMo24638b;
        Completable completableM58206e;
        Observable observableOnErrorReturn;
        switch (this.f245089a) {
            case 0:
                return ((vsk) this.f245090b).m86361d(((e301) obj).f55571a).firstOrError();
            case 1:
                roa roaVar = (roa) obj;
                azx azxVar = (azx) this.f245090b;
                UbiSpecificationId ubiSpecificationIdM76038h = roaVar.m76038h();
                Integer num = null;
                if (ubiSpecificationIdM76038h != UbiSpecificationId.UNKNOWN) {
                    azxVar.f21704g.m32806c(new n0y(ubiSpecificationIdM76038h, roaVar.m76035e(), num, 12));
                }
                cxx cxxVarM27706g = azxVar.m27706g(roaVar);
                if (cxxVarM27706g == null) {
                    Logger.m3966b("could not find a loader for browser params, " + roaVar, new Object[0]);
                    singleMo24638b = Single.just(new fxx(lau.f131415a, null, null, null));
                } else {
                    cxxVarM27706g.toString();
                    if (roaVar.f201205h) {
                        singleMo24638b = cxxVarM27706g.mo24638b(roaVar).map(new nfp(roaVar, 24)).doOnSuccess(new vyx(azxVar, roaVar, 2)).doOnError(new vyx(azxVar, roaVar, 3));
                        wj50.m88279p(singleMo24638b);
                    } else {
                        singleMo24638b = cxxVarM27706g.mo24638b(roaVar);
                    }
                }
                return singleMo24638b.map(new ibp(roaVar, 28));
            case 2:
            case 9:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            default:
                tm90 tm90Var = (tm90) this.f245090b;
                um90 um90VarM83424a = um90.m83424a(tm90Var.f221636i, 0L, ((Boolean) obj).booleanValue(), 1);
                tm90Var.f221636i = um90VarM83424a;
                return um90VarM83424a;
            case 3:
                jve1 jve1Var = (jve1) obj;
                a5j0 a5j0Var = (a5j0) ((xeu) this.f245090b).f260774b;
                h4k0 h4k0Var = jve1Var.f116343d;
                return ((vxe1) a5j0Var.f12529b).m86656f(ihf1.m50632p(), h4k0Var.f87550c, Integer.valueOf(h4k0Var.f87548a)).map(new k0a0(a5j0Var, 17)).map(new drw(jve1Var, 6)).onErrorReturn(new csy(jve1Var, 0));
            case 4:
                int iM9500o = ((EsDownload$FileStreamerId) obj).m9500o();
                Integer numValueOf = Integer.valueOf(iM9500o);
                ((vwy) this.f245090b).f245574j = Integer.valueOf(iM9500o);
                return numValueOf;
            case 5:
                ((sdo) this.f245090b).getClass();
                ae50 ae50VarM98196n = ((YourLibraryResponse) obj).m98196n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM98196n, 10));
                Iterator<E> it = ae50VarM98196n.iterator();
                while (it.hasNext()) {
                    arrayList.add(((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) it.next()).mo78647e().getUri());
                }
                return new zu11(arrayList);
            case 6:
                return (pg0) this.f245090b;
            case 7:
                Throwable th = (Throwable) obj;
                return Observable.error(th instanceof PartialProfileListDataException ? (PartialProfileListDataException) th : new PartialProfileListDataException((qxr0) this.f245090b, th));
            case 8:
                vc20 vc20Var = (vc20) obj;
                C2445u9 c2445u9 = (C2445u9) this.f245090b;
                return vc20Var != vc20.f239646g ? Observable.fromCallable(new ic9(vc20Var, 5)) : ((s5p) ((voi) c2445u9.f228049b)).m77301k().map(new zy5(c2445u9, 12));
            case 10:
                k570 k570Var = (k570) this.f245090b;
                int iOrdinal = ((rit) obj).f199613a.ordinal();
                if (iOrdinal == 0) {
                    mbq0 mbq0VarM12225o = PostponeGraduationRequest.m12225o();
                    mbq0VarM12225o.m61425m();
                    PostponeGraduationRequest postponeGraduationRequest = (PostponeGraduationRequest) mbq0VarM12225o.build();
                    l570 l570Var = k570Var.f119427a;
                    wj50.m88279p(postponeGraduationRequest);
                    completableM58206e = l570Var.m58206e(postponeGraduationRequest);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    completableM58206e = g0b1.m43282x(xsr.f265652b, new ks10(k570Var, null, 0));
                }
                return completableM58206e.m23293d(Observable.just(lww.f137648e)).onErrorReturn(a0y.f11206e);
            case 11:
                hm50 hm50Var = (hm50) obj;
                ndy ndyVar = (ndy) this.f245090b;
                ndyVar.getClass();
                nlm0 nlm0Var = hm50Var.f92833a;
                String str = (String) ndyVar.f152865b;
                vm9 vm9Var = hm50Var.f92835c;
                return new u120(nlm0Var, str, vm9Var != null ? vm9Var.f242735d : null, vm9Var != null ? vm9Var.f242734c : null, vm9Var != null ? vm9Var.f242733b : null, hm50Var.f92834b, hm50Var.f92836d, hm50Var.f92837e, hm50Var.f92838f, hm50Var.f92839g, hm50Var.f92840h, hm50Var.f92841i, ((d44) ndyVar.f152866c).m34906a(), false);
            case 12:
                y5f y5fVar = (y5f) ((Map) obj).get(((rv20) this.f245090b).f202977a);
                boolean z = false;
                if (y5fVar != null && y5fVar.f269419c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                q331 q331Var = ((j331) ((tey) this.f245090b).f219809c).f108283e;
                return Single.just(Boolean.valueOf(q331Var.f184786b.mo35842b(q331Var.f184785a, (String) obj).mo48714i(q331.f184784c))).map(zzx.f288147f);
            case 20:
                fxo0 fxo0Var = (fxo0) obj;
                mc1 mc1Var = (mc1) this.f245090b;
                long j = fxo0Var.f74407b;
                gf41 gf41Var = fxo0Var.f74406a;
                if (wj50.m88271j(gf41Var.toString(), "spotify:room:58z5rSz7BvXdayPbEUf8Xv")) {
                    observableOnErrorReturn = cqq.f40970a.mo33632a(gf41Var, j).compose(new xkq(j, new ykq(0, Long.MAX_VALUE))).map(y3z.f269034h);
                } else {
                    qre0 qre0Var = (qre0) mc1Var.f142010c;
                    wh90 wh90VarM13927o = ListeningPartyJoinDevice.m13927o();
                    wh90VarM13927o.m88123m(gf41Var.toString());
                    qre0Var.m73616a(wh90VarM13927o.build());
                    observableOnErrorReturn = ((w6n0) mc1Var.f142009b).mo33632a(gf41Var, j).map(r4z.f195904h).onErrorReturn(j5z.f109165g);
                }
                return observableOnErrorReturn.takeUntil(((PublishSubject) mc1Var.f142011d).filter(new csy(fxo0Var, 12)));
            case 24:
                b450 b450Var = (b450) obj;
                sp80 sp80Var = (sp80) this.f245090b;
                int i = sp80Var.f212768a;
                wj50.m88279p(b450Var);
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(b450Var, 10));
                Iterator it2 = b450Var.iterator();
                while (((a450) it2).f12141c) {
                    arrayList2.add((sec1) sp80Var.f212769b.get(((t350) it2).nextInt()));
                }
                return new rp80(i, arrayList2);
        }
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Set set = dd41.f47702f;
        String strM35712j = r46.m74726U(intent.getDataString()).m35712j();
        if (strM35712j == null) {
            strM35712j = "";
        }
        return la2.m58529e((la2) this.f245090b, intent, new x270(strM35712j));
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(((v560) this.f245090b).f237316a);
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: h */
    public void mo26031h(int i, Bitmap bitmap) {
        za7 za7Var = (za7) this.f245090b;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException("Check failed.");
        }
        ((ImageView) ((mcu) za7Var.f280994c).f142252e).setImageBitmap(bitmap);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        singleEmitter.onSuccess(new xe90(((Boolean) Single.create(new ha80((ze90) this.f245090b, 3)).blockingGet()).booleanValue()));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        wn90 wn90Var = (wn90) obj;
        nn90 nn90Var = (nn90) this.f245090b;
        TextView textView = nn90Var.f156380i;
        ln90 ln90Var = wn90Var.f253123c;
        Resources resources = nn90Var.f156373b;
        textView.setText(ln90Var.f135122b.f110693c);
        nn90Var.f156381t.setText((CharSequence) wn90Var.f253124d.invoke(resources));
    }

    @Override // p204p.pc81
    /* JADX INFO: renamed from: u */
    public lkv0 mo45105u(ViewGroup viewGroup, Object obj, t9p0 t9p0Var, gxj0 gxj0Var) {
        d730 d730Var = (d730) this.f245090b;
        lhm lhmVar = d730Var.f45981a;
        boolean z = obj instanceof i730;
        i730 i730Var = z ? (i730) obj : null;
        Context context = viewGroup.getContext();
        i730 i730Var2 = z ? (i730) obj : null;
        ic4 ic4Var = d730Var.f45983c;
        vbj vbjVar = d730Var.f45982b;
        return lhmVar.m59000a(viewGroup, i730Var, new h730(e0b1.m37491c(context) ? v8k.NOW_PLAYING_VIEW_HORIZONTAL_PORTRAIT : v8k.NOW_PLAYING_VIEW_HORIZONTAL_LANDSCAPE, vbjVar.m85161g(), e0b1.m37491c(context) && vbjVar.m85160f(), true, e0b1.m37491c(context), true, e0b1.m37491c(context), e0b1.m37491c(context), i730Var2 != null ? i730Var2.f99417b : true, i730Var2 != null ? i730Var2.f99418c : false, ic4Var.m50232g(), ic4Var.m50228c()), gxj0Var);
    }

    public vux(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f245089a = 16;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f245090b = new ev40(uri, clipDescription, uri2);
        } else {
            this.f245090b = new x610(uri, clipDescription, uri2, 16);
        }
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: j */
    public void mo26033j(Drawable drawable) {
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: o */
    public void mo26038o(Drawable drawable) {
    }
}
