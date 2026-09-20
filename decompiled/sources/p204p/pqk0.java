package p204p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.spotify.aiplaylist.promptcreation.presentation.PromptCreationHeaderView;
import com.spotify.checkout.premiumcheckout.model.p043v1.proto.GetCheckoutPageRequest;
import com.spotify.music.R;
import com.spotify.notifications.models.preferences.Item$Group;
import com.spotify.notifications.models.preferences.Item$Preference;
import com.spotify.on_demand_set.proto.ResponseStatus;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableErrorSupplier;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class pqk0 implements Function, u150, w1j0, InterfaceC2207oa, dn6, ant {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180345a;

    /* JADX INFO: renamed from: b */
    public final Object f180346b;

    public /* synthetic */ pqk0(Object obj, int i) {
        this.f180345a = i;
        this.f180346b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70653a(pqk0 pqk0Var, int i) {
        qln0 qln0Var = (qln0) pqk0Var.f180346b;
        if (pln0.f178762a[0] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            sr4 sr4VarM76275a = ((rr4) qln0Var.f189889a).m76275a("eip_connection");
            sr4VarM76275a.f213231f = "media-browser-service";
            qln0Var.f189890b = sr4VarM76275a;
            sr4VarM76275a.m79019k("eip_connection", "media-browser-service", true);
            sr4 sr4Var = qln0Var.f189890b;
            if (sr4Var != null) {
                sr4Var.m79019k("connecting_to_eip", "media-browser-service", true);
                return;
            }
            return;
        }
        if (iM38547C == 1) {
            qln0Var.m73248a(2);
            return;
        }
        if (iM38547C == 2) {
            qln0Var.m73248a(3);
        } else if (iM38547C == 3) {
            qln0Var.m73248a(4);
        } else {
            if (iM38547C != 4) {
                throw new NoWhenBranchMatchedException();
            }
            qln0Var.m73248a(5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static TextPaint m70654e(Context context) {
        TextPaint textPaint = new TextPaint();
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(context.getColor(R.color.playable_cache_cover_text));
        Typeface typefaceM60325C = lzj.m60325C(context, R.font.spotify_mix_ui_title_bold, 1);
        if (typefaceM60325C == null) {
            typefaceM60325C = Typeface.create(u1x0.m82233b(context, R.font.spotify_mix_ui_title_bold), 0);
        }
        textPaint.setTypeface(typefaceM60325C);
        textPaint.setFlags(textPaint.getFlags() | 1);
        return textPaint;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((te4) this.f180346b).m80526a();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List listSingletonList;
        String str;
        int i = this.f180345a;
        int i2 = 0;
        Object obj2 = this.f180346b;
        switch (i) {
            case 0:
                ((mqk0) obj2).getClass();
                return yqk0.f275259a;
            case 1:
                v3a0 v3a0Var = (v3a0) obj;
                jyk0 jyk0Var = (jyk0) obj2;
                if (!jyk0Var.f117428a) {
                    return Single.just(v3a0Var);
                }
                if (!(v3a0Var instanceof p3a0)) {
                    return v3a0Var instanceof t3a0 ? jyk0Var.f117429b.map(new cz90(jyk0Var, v3a0Var)) : Single.just(v3a0Var);
                }
                p3a0 p3a0Var = (p3a0) v3a0Var;
                return Single.just(new s3a0(p3a0Var.f173596a, p3a0Var.f173597b));
            case 2:
                ResponseStatus responseStatus = (ResponseStatus) obj;
                return responseStatus.getStatusCode() == 200 ? CompletableEmpty.f7437a : new CompletableErrorSupplier(new w8l0((x8l0) obj2, responseStatus, i2));
            case 3:
                lv31 lv31VarEdit = ((ris0) ((ynb0) obj2).f274429b).f199612a.edit();
                lv31VarEdit.m60048a(ris0.f199610b, true);
                lv31VarEdit.m60055h();
                return Observable.just(fgs0.f69396a);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 16:
            case 17:
            case 21:
            default:
                x4s0 x4s0Var = (x4s0) obj2;
                return x4s0Var.f258193a.mo59839a(x4s0Var.f258194b).mo74958b(((u4s0) obj).f226794a).distinctUntilChanged().map(alq0.f16938d);
            case 11:
                return new pqm0((PlayerState) obj2, Boolean.valueOf(((y5f) g6f.m43739p0(((Map) obj).values())).f269417a));
            case 12:
                ((i7p0) obj2).getClass();
                return v5q0.f237570e;
            case 13:
                lcf lcfVar = (lcf) obj;
                return lcfVar instanceof icf ? ((xap0) obj2).f259738c.mo48412a(new x7p0("read-along-default-player-seek", false)) : Single.just(lcfVar);
            case 14:
                return ((gdp0) obj2).f78909d;
            case 15:
                return ((Boolean) obj).booleanValue() ? new nx20((ehv) ((lqk0) obj2).f136080d.getValue()) : yby.f271310f;
            case 18:
                f2k0 f2k0Var = (f2k0) obj2;
                List<wq50> list = ((Item$Group) obj).items;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (wq50 wq50Var : list) {
                    if (wq50Var instanceof Item$Group) {
                        str = ((Item$Group) wq50Var).key;
                    } else {
                        if (!(wq50Var instanceof Item$Preference)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((Item$Preference) wq50Var).key;
                    }
                    arrayList.add(new pqm0(str, wq50Var));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    String str2 = (String) ((pqm0) obj3).f180350a;
                    if (!wj50.m88271j(str2, "notify-messages") || f2k0Var.f65204b.f274426a.m58075h()) {
                        if (!wj50.m88271j(str2, "notify-comments") || f2k0Var.f65203a.m74794i()) {
                            arrayList2.add(obj3);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    String str3 = (String) ((pqm0) obj4).f180350a;
                    nzv nzvVar = srl0.f213342Q0;
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(nzvVar, 10));
                    Iterator it = nzvVar.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((srl0) it.next()).f213355a);
                    }
                    if (!arrayList4.contains(str3)) {
                        nzv nzvVar2 = rrl0.f202082c;
                        ArrayList arrayList5 = new ArrayList(i6f.m49804T(nzvVar2, 10));
                        Iterator it2 = nzvVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((rrl0) it2.next()).f202083a);
                        }
                        if (arrayList5.contains(str3)) {
                        }
                    }
                    arrayList3.add(obj4);
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    wq50 wq50Var2 = (wq50) ((pqm0) it3.next()).f180351b;
                    if (wq50Var2 instanceof Item$Preference) {
                        listSingletonList = Collections.singletonList(new cgc((Item$Preference) wq50Var2));
                    } else {
                        if (!(wq50Var2 instanceof Item$Group)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listSingletonList = Collections.singletonList(new bgc((Item$Group) wq50Var2));
                    }
                    j6f.m52564V(listSingletonList, arrayList6);
                }
                return arrayList6;
            case 19:
                yjq0 yjq0Var = (yjq0) obj2;
                zjq0 zjq0Var = yjq0Var.f273429b;
                e710 e710VarM5932r = GetCheckoutPageRequest.m5932r();
                e710VarM5932r.m37963m(yjq0Var.f273428a.f189292a);
                l101 l101Var = (l101) yjq0Var.f273430c;
                e710VarM5932r.m37966s(l101Var.m57845b());
                e710VarM5932r.m37965r(l101Var.m57846c());
                e710VarM5932r.m37964q((String) obj);
                return zjq0Var.m96241a((GetCheckoutPageRequest) e710VarM5932r.build()).compose(new kq11(2)).map(new bcm0(yjq0Var, 15)).onErrorReturn(laz.f131464b1);
            case 20:
                return ((ydi) obj2).m93440v((fpq0) obj);
            case 22:
                SingleSubject singleSubject = new SingleSubject();
                ((zmn0) obj2).m96470E(new mor0(singleSubject, 0), new mor0(singleSubject, 1));
                return singleSubject;
            case 23:
                return Observable.create(new tfm0(21, (jrr0) obj2, (iur0) obj));
            case 24:
                fyr0 fyr0Var = (fyr0) obj;
                p0s0 p0s0Var = fyr0Var.f74831e;
                Set set = dd41.f47702f;
                String strM35721s = r46.m74726U(p0s0Var.f172733b).m35721s();
                return strM35721s == null ? Observable.empty() : Observable.create(new vyr0((vxx) obj2, p0s0Var, strM35721s, fyr0Var, 0));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m70655b(bav0 bav0Var) {
        ((jf40) this.f180346b).m28985c(bav0Var);
    }

    /* JADX INFO: renamed from: c */
    public phn0 m70656c() {
        return new phn0(this);
    }

    @Override // p204p.u150
    /* JADX INFO: renamed from: d */
    public s150 mo31674d() {
        return (s150) this.f180346b;
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        cj8 cj8Var = (cj8) this.f180346b;
        ucj0 ucj0Var = (ucj0) cj8Var.f38518b;
        if (!((Boolean) ((rwx0) ((qwx0) cj8Var.f38520d)).f203428a.map(mzx.f148824b1).blockingFirst()).booleanValue()) {
            return p1j0.f173119a;
        }
        Set set = dd41.f47702f;
        String strM68854k = p1v.m68854k(intent);
        if (strM68854k == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!((Pattern) ucj0Var.f229073b).matcher(strM68854k).matches()) {
            throw new IllegalArgumentException("Invalid uri passed: ".concat(strM68854k));
        }
        String strM88486j1 = wl51.m88486j1(strM68854k, ":episode");
        vjf1.m85770t(dau.f47107a, new y4q0((wt80) cj8Var.f38519c, strM68854k, null)).subscribe();
        if (!((Pattern) ucj0Var.f229073b).matcher(strM68854k).matches()) {
            throw new IllegalArgumentException("Invalid uri passed: ".concat(strM68854k));
        }
        return new s1j0(pp91.m70529j(new pqm0("uri", strM88486j1), new pqm0("episodeUri", "spotify:episode:".concat(wl51.m88481e1(strM68854k, "episode:", strM68854k))), new pqm0("enable_downloads_filter", Boolean.valueOf(wj50.m88271j(intent.getStringExtra("filter"), "downloaded"))), new pqm0("username", e301Var.f55571a)), bm11.class);
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        pqm0 pqm0Var = (pqm0) obj;
        ojs0 ojs0Var = (ojs0) this.f180346b;
        boolean zBooleanValue = ((Boolean) pqm0Var.f180350a).booleanValue();
        ln20 ln20Var = (ln20) pqm0Var.f180351b;
        PromptCreationHeaderView promptCreationHeaderView = (PromptCreationHeaderView) ojs0Var.f166123d.f226726e;
        if (ln20Var == null) {
            promptCreationHeaderView.setVisibility(8);
            return;
        }
        promptCreationHeaderView.setVisibility(0);
        promptCreationHeaderView.m3086x(zBooleanValue, ln20Var, ojs0Var.f166122c.f220234b.m28265i());
        ojs0Var.f166121b.f113670d = new guq0(15, ln20Var, ojs0Var);
        int i = 0;
        promptCreationHeaderView.setOnCloseClickListener(new ljs0(ojs0Var, i));
        promptCreationHeaderView.setOnBackClickListener(new mjs0(ojs0Var, ln20Var, i));
        promptCreationHeaderView.setMoreOptionsButtonClickListener(new mjs0(ojs0Var, ln20Var, 1));
        promptCreationHeaderView.setLegalDisclaimerClickListener(new ljs0(ojs0Var, 1));
    }

    public pqk0() {
        this.f180345a = 28;
        this.f180346b = pf40.m69788m();
    }

    public pqk0(boolean z, boolean z2, w72 w72Var) {
        this.f180345a = 9;
        ro80 ro80VarM44508o = geg1.m44508o();
        if (z || z2) {
            ro80VarM44508o.add(w72Var);
        }
        this.f180346b = geg1.m44506m(ro80VarM44508o);
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        o12 o12Var = (o12) this.f180346b;
        return ((cgm) o12Var.f160572c).m32730a(true).firstOrError().map(new at7(intent, o12Var)).onErrorReturn(new y31(intent, 2));
    }
}
