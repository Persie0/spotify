package p204p;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.music.R;
import com.spotify.music.SpotifyMainActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class hkp extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f92465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f92466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f92467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hkp(int i, Object obj, Object obj2) {
        super(0);
        this.f92465a = i;
        this.f92466b = obj;
        this.f92467c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // p204p.eh00
    public final Object invoke() {
        z650 z650Var;
        eo50 eo50Var;
        nxq0 nxq0Var;
        int i = this.f92465a;
        int i2 = 2;
        int i3 = 1;
        String str = 0;
        str = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f92466b;
        Object obj2 = this.f92467c;
        switch (i) {
            case 0:
                jkp jkpVar = (jkp) obj;
                ow30 ow30Var = (ow30) obj2;
                d850 d850VarM79430a = jkpVar.f113356e.m79430a(new vvj0(ow30Var.f170625e, 4));
                if (d850VarM79430a != null && (z650Var = d850VarM79430a.f46380a) != null) {
                    str = z650Var.f279709a;
                }
                new glk(29, jkpVar, new hx30(ow30Var, str)).invoke();
                return w2a1Var;
            case 1:
                jkp jkpVar2 = (jkp) obj;
                jkpVar2.m53642a((sw30) obj2, false);
                jkpVar2.f113348L0.mo23393b(jkpVar2.f113360i.m94205a(xmr0.JAM).subscribe(new sw3(3, new akp(jkpVar2, i2))));
                return w2a1Var;
            case 2:
                jkp jkpVar3 = (jkp) obj;
                jkpVar3.f113352a.finish();
                x0h1.m89578u(jkpVar3.f113349X, null, 0, new r2m(jkpVar3, (vw30) obj2, str, 28), 3);
                return w2a1Var;
            case 3:
                jkp jkpVar4 = (jkp) obj;
                jkpVar4.f113356e.m79430a(new zvj0(((ex30) obj2).f63663d, 4));
                jkpVar4.f113352a.finish();
                return w2a1Var;
            case 4:
                pkp pkpVar = (pkp) obj;
                int iM38547C = edb.m38547C(((zv30) ((fx30) obj2)).f286599c);
                if (iM38547C == 0) {
                    eo50Var = pkpVar.f178508i;
                } else {
                    if (iM38547C != 1 && iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eo50Var = pkpVar.f178507h;
                }
                eo50Var.mo39543e();
                return w2a1Var;
            case 5:
                aop aopVar = (aop) obj;
                u12 u12Var = aopVar.f17732a;
                int iM42202f = fn20.m42202f((ConstraintLayout) aopVar.f17734c.f183794b);
                cm20 cm20Var = aopVar.f17740i;
                tnp tnpVar = new tnp(aopVar, i3);
                ((TextView) u12Var.f225646Y).setVisibility(8);
                FindInContextView findInContextView = (FindInContextView) u12Var.f225655i;
                findInContextView.setVisibility(0);
                e8x e8xVar = new e8x(0, findInContextView, FindInContextView.class, "showKeyboard", "showKeyboard()V", 0, 0, 16);
                zl20 zl20Var = zl20.f283897c;
                cm20Var.getClass();
                zl20 zl20Var2 = zl20.f283897c;
                ArrayList arrayList = cm20Var.f39577c;
                arrayList.add(new yl20(e8xVar, zl20Var2));
                arrayList.add(new yl20(new e90(u12Var, cm20Var, tnpVar, iM42202f, 7), zl20Var2));
                if (!findInContextView.m9620x()) {
                    ((BehaviorRetainingAppBarLayout) u12Var.f225648b).m1529e(false, true, true);
                }
                ((gh00) obj2).invoke(new vg80(true));
                return w2a1Var;
            case 6:
                ((zpp) obj).f285193a.mo75117e((ibp) obj2);
                return w2a1Var;
            case 7:
                gh00 gh00Var = (gh00) obj2;
                if (((u3i0) obj).f226392a) {
                    gh00Var.invoke(q3i0.f184888a);
                } else {
                    gh00Var.invoke(m3i0.f139669a);
                }
                return w2a1Var;
            case 8:
                FrameLayout frameLayout = (FrameLayout) ((vxx) ((u7n) obj2).f227729d).f245850c;
                View viewInflate = ((LayoutInflater) obj).inflate(R.layout.auto_download_settings_item, (ViewGroup) frameLayout, false);
                frameLayout.addView(viewInflate);
                int i4 = R.id.download_follow_information;
                if (((TextView) vie1.m85629k(viewInflate, R.id.download_follow_information)) != null) {
                    i4 = R.id.download_heading;
                    if (((TextView) vie1.m85629k(viewInflate, R.id.download_heading)) != null) {
                        i4 = R.id.download_information_icon;
                        if (((SpotifyIconView) vie1.m85629k(viewInflate, R.id.download_information_icon)) != null) {
                            i4 = R.id.download_settings_link;
                            TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.download_settings_link);
                            if (textView != null) {
                                i4 = R.id.download_subtitle;
                                if (((TextView) vie1.m85629k(viewInflate, R.id.download_subtitle)) != null) {
                                    i4 = R.id.download_switch;
                                    ComposeView composeView = (ComposeView) vie1.m85629k(viewInflate, R.id.download_switch);
                                    if (composeView != null) {
                                        i4 = R.id.download_title;
                                        if (((TextView) vie1.m85629k(viewInflate, R.id.download_title)) != null) {
                                            st7 st7Var = new st7((ConstraintLayout) viewInflate, textView, composeView);
                                            SpannableString spannableString = new SpannableString(textView.getText());
                                            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                                            textView.setText(spannableString);
                                            return st7Var;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
            case 9:
                ((kqi0) obj2).setValue(Boolean.TRUE);
                dxl dxlVar = (dxl) ((u7n) obj).f227731f;
                if (dxlVar != null) {
                    dxlVar.invoke(y3q0.f268976a);
                    return w2a1Var;
                }
                wj50.m88260d0("eventHandler");
                throw null;
            case 10:
                dxl dxlVar2 = (dxl) ((u7n) obj).f227731f;
                if (dxlVar2 != null) {
                    dxlVar2.invoke(new a4q0((String) obj2));
                    return w2a1Var;
                }
                wj50.m88260d0("eventHandler");
                throw null;
            case 11:
                sdo sdoVar = (sdo) obj2;
                ac2 ac2Var = (ac2) sdoVar.f208049c;
                int iM967R = RecyclerView.m967R((View) obj);
                if (iM967R != -1 && (nxq0Var = (nxq0) sdoVar.f208052f) != null) {
                    if (nxq0Var == null) {
                        wj50.m88260d0("model");
                        throw null;
                    }
                    if (iM967R < nxq0Var.f159581a.size()) {
                        nxq0 nxq0Var2 = (nxq0) sdoVar.f208052f;
                        if (nxq0Var2 == null) {
                            wj50.m88260d0("model");
                            throw null;
                        }
                        oxq0 oxq0Var = (oxq0) nxq0Var2.f159581a.get(iM967R);
                        String str2 = oxq0Var.f171493d.f233581a;
                        return (ou91) ac2Var.mo24510D0(str2 != null ? str2 : "", Integer.valueOf(iM967R), oxq0Var.f171490a);
                    }
                }
                return (ou91) ac2Var.mo24510D0("", 0, "");
            case 12:
                p2q p2qVar = (p2q) obj;
                ((SpotifyMainActivity) p2qVar.f173400c).m15687w0().m39395a();
                epp eppVar = (epp) obj2;
                Iterator it = eppVar.f61686d.iterator();
                while (it.hasNext()) {
                    ((zqa0) it.next()).mo61431a(eppVar.f61690h);
                }
                r55 r55Var = eppVar.f61684b;
                if (!((SpotifyMainActivity) ((p700) r55Var)).mo15683g0().m31611T() && !eppVar.f61688f) {
                    xy3 xy3Var = (xy3) eppVar.f61689g;
                    xy3Var.m92396a("logged_in_session");
                    Iterator it2 = eppVar.f61687e.iterator();
                    while (it2.hasNext()) {
                        ((c380) it2.next()).m31366a();
                    }
                    xy3Var.m92400e("navigation_intent_received");
                    eppVar.f61685c.f121684a.m84730c();
                    xy3Var.m92396a("navigation_intent_received");
                    r55Var.setVisible(true);
                    eppVar.f61688f = true;
                }
                p2qVar.f173383M0.mo53786f("LoggedInUi", "cst");
                return w2a1Var;
            case 13:
                ((w2q) obj).f247404a.m26886e((nps) obj2);
                return w2a1Var;
            case 14:
                ((n6q) obj).f150937b.remove((qe70) obj2);
                return w2a1Var;
            case 15:
                ((n6q) obj).f150938c.remove((gh00) obj2);
                return w2a1Var;
            case 16:
                ((gh00) obj).invoke(new yr31(((zr31) obj2).f285532b));
                return w2a1Var;
            case 17:
                if (((ood0) ((iin) obj).f102609e) != null) {
                    ood0.m67482u((ViewGroup) obj2);
                }
                return w2a1Var;
            case 18:
                nup nupVar = (nup) ((fju) obj).mo26174a(null);
                ((lq81) ((p36) obj2).f173561b).mo33809w().addView((ConstraintLayout) nupVar.f158690b.f165108c);
                return nupVar;
            case 19:
                nup nupVar2 = (nup) ((fju) obj).mo26174a(null);
                ((FrameLayout) ((w0n) ((z9p) obj2).f280844c).f246763R0).addView((ConstraintLayout) nupVar2.f158690b.f165108c);
                return nupVar2;
            case 20:
                nup nupVar3 = (nup) ((fju) obj).mo26174a(null);
                ((FrameLayout) ((w0n) ((y1q) obj2).f268360d).f246763R0).addView((ConstraintLayout) nupVar3.f158690b.f165108c);
                return nupVar3;
            case 21:
                ((r55) obj).f31643a.mo31988d((ne2) obj2);
                return w2a1Var;
            case 22:
                Context applicationContext = ((Activity) obj).getApplicationContext();
                y6q0 y6q0Var = (y6q0) obj2;
                xth0 xth0Var = xth0.f265873a;
                String strM43505r = g3h1.m43505r(xth0Var);
                jsa jsaVar = y74.f269955b;
                File file = new File(applicationContext.getDir("remote-config", 0), strM43505r);
                if (!file.exists()) {
                    file.mkdirs();
                }
                jsa jsaVar2 = y74.f269955b;
                y74 y74VarM90120u = x74.m90120u(applicationContext, Integer.toHexString(y6q0Var.hashCode()) + ".pb", g3h1.m43505r(xth0Var));
                x74.m90120u(applicationContext, "remote-config-debug.pb", "");
                LinkedHashMap linkedHashMap = llr0.f134690b;
                axf1.m27401p(applicationContext);
                yau0 yau0VarM92984c = y74VarM90120u.m92984c();
                yau0 yau0Var = yau0.f271015d;
                yau0 yau0Var2 = yau0.f271015d;
                Map map = yau0VarM92984c.f271017b;
                Map map2 = yau0Var2.f271017b;
                if (!map2.isEmpty() || !map2.isEmpty()) {
                    yau0VarM92984c = t46.m80040d(kw10.m57498a(yau0VarM92984c.f271016a, g6f.m43728j1(kkc0.m56700m0(kkc0.m56700m0(map, map2), map2).values()), null, 27));
                }
                return new hjq(yau0VarM92984c.f271017b);
            case 23:
                kv91 kv91Var = ((enq) obj).f61196a;
                yt91 yt91VarM96903c = ((geg0) obj2).f79118a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("delete_confirmation_dialog", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 24:
                ((umn) obj).m83474l((pck) obj2, true);
                return w2a1Var;
            case 25:
                ((umn) ((g2q) obj).f75987b).m83474l((pck) obj2, false);
                return w2a1Var;
            case 26:
                ((umn) ((p7o) obj).f174733c).m83475m((pck) obj2, true);
                return w2a1Var;
            case 27:
                ((gh00) obj).invoke(Integer.valueOf(((mqq) obj2).f146340f));
                return w2a1Var;
            case 28:
                Set set = (Set) ((oar) obj).f163451i.get(((w9r) obj2).f249247a);
                return set == null ? gbu.f78413a : set;
            default:
                v0a v0aVar = (v0a) obj2;
                yar yarVar = (yar) obj;
                if (wj50.m88271j(yarVar.f270972d, Boolean.TRUE)) {
                    return v0aVar;
                }
                yarVar.f270973e.add(v0aVar);
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkp(Activity activity, pc5 pc5Var, y6q0 y6q0Var) {
        super(0);
        this.f92465a = 22;
        this.f92466b = activity;
        this.f92467c = y6q0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkp(RecyclerView recyclerView, View view, sdo sdoVar) {
        super(0);
        this.f92465a = 11;
        this.f92466b = view;
        this.f92467c = sdoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hkp(n6q n6qVar, gh00 gh00Var) {
        super(0);
        this.f92465a = 14;
        this.f92466b = n6qVar;
        this.f92467c = (qe70) gh00Var;
    }
}
