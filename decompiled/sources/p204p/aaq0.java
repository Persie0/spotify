package p204p;

import android.net.Uri;
import android.os.Build;
import com.spotify.clientrestrictions.p046v1.RestrictedIntegrationsResponse;
import com.spotify.music.R;
import com.spotify.notifications.models.registration.PushRegisterTokenBody;
import com.spotify.notifications.models.registration.PushUnregisterTokenBody;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.p126ai.creation.p127v2.GetSessionByMessageIdRequest;
import com.spotify.premiumdestination.destination.mobius.domain.MappingException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: classes6.dex */
public final class aaq0 implements Function, CompletableOnSubscribe {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13907a;

    /* JADX INFO: renamed from: b */
    public final Object f13908b;

    /* JADX INFO: renamed from: c */
    public final Object f13909c;

    public /* synthetic */ aaq0(int i, Object obj, Object obj2) {
        this.f13907a = i;
        this.f13908b = obj;
        this.f13909c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public static final URL m25265a(aaq0 aaq0Var) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(pka1.f178421b).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        kg5 kg5Var = (kg5) aaq0Var.f13908b;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(kg5Var.f122299a).appendPath("settings");
        vu3 vu3Var = kg5Var.f122300b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", vu3Var.f244855c).appendQueryParameter("display_version", vu3Var.f244854b).build().toString());
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        switch (this.f13907a) {
            case 2:
                clq0 clq0Var = (clq0) this.f13908b;
                tsq0 tsq0Var = (tsq0) this.f13909c;
                if (!tsq0Var.f223413h) {
                    boolean z = tsq0Var.f223412g;
                    if (z) {
                        i = R.string.added_to_your_library_error_snackbar_text;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.presave_error_snackbar_text;
                    }
                    q831 q831Var = (q831) clq0Var.f39342d;
                    na6.m63963k(true, "Invalid resource ID provided: %s", Integer.valueOf(i));
                    na6.m63963k(true, "Invalid resource ID provided: %s", null);
                    q831Var.m72305j(new g631(null, "", Integer.valueOf(i), null, null, null, null, null, false));
                }
                return w2a1.f247311a;
            case 5:
                SingleSubject singleSubject = new SingleSubject();
                b1q b1qVar = (b1q) this.f13908b;
                zmn0 zmn0Var = (zmn0) this.f13909c;
                kv91 kv91Var = b1qVar.f22389a;
                xug0 xug0Var = b1qVar.f22391c;
                xug0Var.getClass();
                yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("profile_picture_step", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("change_photo_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("change_photo_dialog", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                String str = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                zmn0Var.m96471F(new kor0(b1qVar, singleSubject, 0), new kor0(b1qVar, singleSubject, 1), null, false);
                return singleSubject;
            case 6:
                Uri uri = Uri.parse(((srr0) obj).f213373f);
                jyx0 jyx0Var = (jyx0) this.f13908b;
                wj50.m88279p(uri);
                return jyx0Var.m54823b(uri).observeOn((Scheduler) this.f13909c).map(wsq0.f254708c).map(wvq0.f255570c);
            case 7:
                uxr0 uxr0Var = (uxr0) obj;
                return vjf1.m85770t((luk) this.f13908b, new mep0((je31) this.f13909c, uxr0Var, null, 21)).toObservable().onErrorReturn(new hvj0(uxr0Var, 28));
            case 9:
                return p0s0.m68728c((p0s0) ((xyr0) this.f13908b), null, (String) this.f13909c, null, null, null, null, 0, 4091);
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    return CompletableEmpty.f7437a;
                }
                mav0 mav0Var = (mav0) this.f13908b;
                return g0b1.m43282x(mav0Var.f141696j, new kav0(mav0Var, (String) this.f13909c, null, 0));
            case 20:
                qu80 qu80Var = (qu80) obj;
                ybv ybvVar = qu80Var.f192599e;
                String strM84311c = ybvVar.f271259d.m84311c(1);
                List list = qu80Var.f192598d;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((nw80) it.next()).f159049c);
                }
                boolean zM98156o = ((YourLibraryContainsResponseEntity) g6f.m43741q0(((YourLibraryContainsResponse) this.f13908b).m98153o())).m98156o();
                String str2 = ybvVar.f271249A;
                if (str2 != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        okj0 okj0Var = (okj0) this.f13909c;
                        i101 i101Var = (i101) okj0Var.f166381b;
                        ct2 ct2Var = (ct2) okj0Var.f166382c;
                        String str3 = ybvVar.f271257b;
                        lt2 lt2Var = (lt2) ct2Var;
                        Single singleM59857d = lt2Var.m59857d(arrayList);
                        tt2 tt2Var = lt2Var.f136674a;
                        GetSessionByMessageIdRequest.Builder builderNewBuilder = GetSessionByMessageIdRequest.newBuilder();
                        builderNewBuilder.setMessageId(str2);
                        return i101Var.m49393a(tt2Var.m81487g((GetSessionByMessageIdRequest) builderNewBuilder.build()).flatMap(new az1(lt2Var, 11)), Boolean.valueOf(zM98156o), str3, strM84311c, singleM59857d);
                    }
                }
                return Observable.just(jhs0.f112557a);
            case 21:
                w9r0 w9r0Var = (w9r0) this.f13908b;
                Flowable flowable = (Flowable) w9r0Var.f249254d;
                Completable completableFlatMapCompletable = new FlowableSingleSingle(fr0.m42465i(flowable, flowable)).flatMapCompletable(new w8q0(19, w9r0Var, (d850) this.f13909c));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable.m23299p(Functions.f7232h);
            default:
                pqm0 pqm0Var = (pqm0) obj;
                xj11 xj11Var = (xj11) this.f13908b;
                ktx ktxVar = ((fqx) pqm0Var.f180350a).f72301b;
                wj50.m88279p(ktxVar);
                return new ogr(xj11Var, (ok11) ktxVar, (tu00) ((fqx) pqm0Var.f180351b).f72301b, (d0w) this.f13909c);
        }
    }

    /* JADX INFO: renamed from: b */
    public n09 m25266b(u1h1 u1h1Var) {
        if (u1h1Var instanceof iwv0) {
            m500 m500VarMo44092a0 = ((o2o) ((l2o) this.f13908b).f129057a.f171807c).f161100a.mo44092a0();
            jg31.m53271i(m500VarMo44092a0);
            return new kwv0(m500VarMo44092a0, (iwv0) u1h1Var);
        }
        if (!(u1h1Var instanceof jwv0)) {
            throw new NoWhenBranchMatchedException();
        }
        o2o o2oVar = (o2o) ((m2o) this.f13909c).f139434a.f171807c;
        m500 m500VarMo44092a1 = o2oVar.f161100a.mo44092a0();
        jg31.m53271i(m500VarMo44092a1);
        e940 e940VarMo44094b = o2oVar.f161100a.mo44094b();
        jg31.m53271i(e940VarMo44094b);
        return new lwv0(m500VarMo44092a1, e940VarMo44094b, (jwv0) u1h1Var);
    }

    /* JADX INFO: renamed from: c */
    public Object m25267c(Map map, nxs0 nxs0Var, f6n0 f6n0Var, qew0 qew0Var) throws Throwable {
        Object objM89557A = x0h1.m89557A((juk) this.f13909c, new nxs0(13, this, map, nxs0Var, f6n0Var, null), qew0Var);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: d */
    public fpq0 m25268d(nt30 nt30Var) {
        wq30 wq30VarMain;
        try {
            fk30 fk30VarHeader = nt30Var.header();
            wj50.m88279p(fk30VarHeader);
            qk30 qk30VarText = fk30VarHeader.text();
            String strUri = null;
            String strTitle = qk30VarText != null ? qk30VarText.title() : null;
            qk30 qk30VarText2 = fk30VarHeader.text();
            String strSubtitle = qk30VarText2 != null ? qk30VarText2.subtitle() : null;
            qk30 qk30VarText3 = fk30VarHeader.text();
            String strDescription = qk30VarText3 != null ? qk30VarText3.description() : null;
            dk30 dk30VarImages = fk30VarHeader.images();
            if (dk30VarImages != null && (wq30VarMain = dk30VarImages.main()) != null) {
                strUri = wq30VarMain.uri();
            }
            return new fpq0(new noq0(strTitle, strSubtitle, strDescription, strUri, gg5.m44655s(fk30VarHeader)), m25269e(nt30Var));
        } catch (Exception e) {
            throw new MappingException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:83:0x01fe  */
    /* JADX INFO: renamed from: e */
    public ArrayList m25269e(nt30 nt30Var) {
        Object q2m0Var;
        wq30 wq30VarMain;
        oh5 oh5Var = (oh5) this.f13908b;
        List<fk30> listBody = nt30Var.body();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listBody, 10));
        for (fk30 fk30Var : listBody) {
            switch (fk30Var.componentId().mo29575id()) {
                case "premiumPage:benefitList":
                    String strTitle = fk30Var.text().title();
                    wj30[] wj30VarArrBundleArray = fk30Var.custom().bundleArray("items");
                    List<wj30> listM29620k1 = wj30VarArrBundleArray != null ? bk5.m29620k1(wj30VarArrBundleArray) : null;
                    if (listM29620k1 == null) {
                        listM29620k1 = lau.f131415a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (wj30 wj30Var : listM29620k1) {
                        arrayList2.add(new d79(wj30Var.string(ContextTrack.Metadata.KEY_TITLE), wj30Var.string("icon")));
                    }
                    q2m0Var = new ljq0(strTitle, arrayList2, gg5.m44655s(fk30Var));
                    break;
                case "premiumPage:accordion":
                    tpn0 tpn0Var = (tpn0) this.f13909c;
                    String strString = fk30Var.custom().string("collapsed_text", "");
                    String strString2 = fk30Var.custom().string("expanded_text", "");
                    jsa0 jsa0VarM44655s = gg5.m44655s(fk30Var);
                    List listChildren = fk30Var.children();
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(listChildren, 10));
                    Iterator it = listChildren.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((oh5) tpn0Var.f222569b).m66938p((fk30) it.next()));
                    }
                    q2m0Var = new s920(strString, strString2, jsa0VarM44655s, arrayList3);
                    break;
                case "premiumPage:featureCard":
                    qk30 qk30VarText = fk30Var.text();
                    String strTitle2 = qk30VarText != null ? qk30VarText.title() : null;
                    qk30 qk30VarText2 = fk30Var.text();
                    String strSubtitle = qk30VarText2 != null ? qk30VarText2.subtitle() : null;
                    dk30 dk30VarImages = fk30Var.images();
                    String strUri = (dk30VarImages == null || (wq30VarMain = dk30VarImages.main()) == null) ? null : wq30VarMain.uri();
                    dk30 dk30VarImages2 = fk30Var.images();
                    String strIcon = dk30VarImages2 != null ? dk30VarImages2.icon() : null;
                    wj30 wj30VarCustom = fk30Var.custom();
                    String strString3 = wj30VarCustom != null ? wj30VarCustom.string("color_set") : null;
                    wj30 wj30VarCustom2 = fk30Var.custom();
                    String strString4 = wj30VarCustom2 != null ? wj30VarCustom2.string("details_title") : null;
                    wj30 wj30VarCustom3 = fk30Var.custom();
                    q2m0Var = new slq0(strTitle2, strSubtitle, strString4, wj30VarCustom3 != null ? wj30VarCustom3.string("details_text") : null, strIcon, strString3, strUri, gg5.m44655s(fk30Var));
                    break;
                case "premiumPage:wtsOfferCardV2":
                    q2m0Var = oh5Var.m66938p(fk30Var);
                    break;
                case "premiumPage:wtsOfferCardV3":
                    q2m0Var = oh5Var.m66938p(fk30Var);
                    break;
                case "premiumPage:offerCta":
                    q2m0Var = new hg20(fk30Var.text().title(), m95.m61181p(fk30Var), wj50.m88271j(fk30Var.custom().string("mode"), "full_width") ? 1 : 2, gg5.m44655s(fk30Var));
                    break;
                case "premiumPage:sectionHeader":
                    q2m0Var = new cqq0(fk30Var.text().title(), fk30Var.text().subtitle(), gg5.m44655s(fk30Var));
                    break;
                case "premiumPage:offerLegalText":
                    String strTitle3 = fk30Var.text().title();
                    String strString5 = fk30Var.custom().string("textColor", "#FFFFFF");
                    wj30 wj30VarBundle = fk30Var.custom().bundle("margin");
                    q2m0Var = new jmq0(strTitle3, strString5, wj50.m88271j(fk30Var.custom().string("alignment", ""), "natural") ? 2 : 1, wj30VarBundle != null ? new mkc0(wj30VarBundle.intValue("leading", 0), wj30VarBundle.intValue("top", 0), wj30VarBundle.intValue("trailing", 0), wj30VarBundle.intValue("bottom", 0)) : null, gg5.m44655s(fk30Var));
                    break;
                default:
                    q2m0Var = new q2m0(1);
                    break;
            }
            arrayList.add(q2m0Var);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public Completable m25270f(String str) {
        bgt0 bgt0Var = (bgt0) this.f13909c;
        fke fkeVar = (fke) this.f13908b;
        return bgt0Var.m29148b(new PushRegisterTokenBody("Android", str, "prod", ((edi0) fkeVar).f58523a, Build.VERSION.RELEASE, ((edi0) fkeVar).m38599e()));
    }

    /* JADX INFO: renamed from: g */
    public Completable m25271g(String str) {
        return ((bgt0) this.f13909c).m29147a(Collections.singletonList(new PushUnregisterTokenBody("Android", str)));
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        try {
            RestrictedIntegrationsResponse restrictedIntegrationsResponse = (RestrictedIntegrationsResponse) this.f13908b;
            lqr lqrVar = (lqr) ((er70) ((k7q0) this.f13909c).f120178b).get();
            lqrVar.getClass();
            restrictedIntegrationsResponse.writeTo(new FileOutputStream(lqrVar.f136118a));
            completableEmitter.onComplete();
        } catch (IOException e) {
            completableEmitter.onError(e);
        }
    }

    public aaq0(ui5 ui5Var, tc5 tc5Var, uc5 uc5Var, l45 l45Var, sp5 sp5Var, oh5 oh5Var, tpn0 tpn0Var, bc5 bc5Var) {
        this.f13907a = 1;
        this.f13908b = oh5Var;
        this.f13909c = tpn0Var;
    }

    public aaq0(ago agoVar) {
        this.f13907a = 10;
        this.f13908b = agoVar;
        this.f13909c = pag1.m69487w(new rko(wyx.f256380X, 1, hds0.f90198Z, new pko(hds0.f90194X), hds0.f90182L0), hds0.f90196Y);
    }

    public aaq0(js4 js4Var, gnu0 gnu0Var) {
        this.f13907a = 15;
        this.f13908b = js4Var;
        ojo ojoVar = ago.f15436t;
        this.f13909c = g9g1.m44033i(gnu0Var);
    }

    public aaq0(ziu ziuVar, z9j0 z9j0Var) {
        this.f13907a = 14;
        this.f13909c = ziuVar;
        this.f13908b = z9j0Var;
    }
}
