package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.Any;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class jwo implements Function, ant, dac1, e411, r7l0, BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f116663a;

    /* JADX INFO: renamed from: b */
    public Object f116664b;

    public /* synthetic */ jwo(Object obj, int i) {
        this.f116663a = i;
        this.f116664b = obj;
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: a */
    public void mo28347a() {
        ((yhq) this.f116664b).m93691e();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ae50<Mdata$LocalBatchedExtensionResponse.EntityExtension> ae50VarM97632n;
        byte[] bArrM45891s;
        icl0 icl0Var;
        gva gvaVarM1913r;
        switch (this.f116663a) {
            case 0:
                return ((tu40) obj).f223761a ? CompletableEmpty.f7437a : ske.m78369c((ske) ((x28) this.f116664b).f257380Y, "aligned-curation:npv-add-button-onboarding:v1", null, null, null, null, null, null, null, null, 510).ignoreElement();
            case 19:
                vs31 vs31Var = (vs31) obj;
                YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder = vs31Var.f244335a;
                cse1 cse1Var = vs31Var.f244336b;
                tbs tbsVar = (tbs) this.f116664b;
                return tbsVar.f218942d.map(new xvo(yourLibraryConfig$YourLibrarySortOrder, 25)).switchMap(new bzo(tbsVar, 25)).map(new p7o(29, tbsVar, cse1Var));
            case 20:
                return ((c0y) ((wos) this.f116664b).f253564a.f235651a.f246568h).m31194c((xul0) obj).ignoreElement();
            default:
                rqw rqwVar = (rqw) this.f116664b;
                Mdata$LocalBatchedExtensionResponse.Extension extension = (Mdata$LocalBatchedExtensionResponse.Extension) g6f.m43745s0(((Mdata$LocalBatchedExtensionResponse) obj).getExtensionList());
                if (extension == null || (ae50VarM97632n = extension.m97632n()) == null) {
                    return nau.f152117a;
                }
                int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM97632n, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Mdata$LocalBatchedExtensionResponse.EntityExtension entityExtension : ae50VarM97632n) {
                    String strM97629n = entityExtension.m97629n();
                    Mdata$LocalBatchedExtensionResponse.ExtensionHeader extensionHeaderM97631p = entityExtension.m97631p();
                    boolean z = false;
                    if (extensionHeaderM97631p != null && extensionHeaderM97631p.getStatusCode() == 200) {
                        int number = ntx.ON_PLATFORM_REPUTATION_TRAIT.getNumber();
                        Any anyM97630o = entityExtension.m97630o();
                        if (anyM97630o == null || (gvaVarM1913r = anyM97630o.m1913r()) == null || (bArrM45891s = gvaVarM1913r.m45891s()) == null) {
                            bArrM45891s = new byte[0];
                        }
                        jcl0 jcl0Var = (jcl0) rqwVar.f201900b.m91727a(Collections.singletonList(new ptx(bArrM45891s, number))).mo30169a(jcl0.class);
                        if (jcl0Var != null && (icl0Var = jcl0Var.f111147f) != null && icl0Var.f100840b) {
                            z = true;
                        }
                    }
                    linkedHashMap.put(strM97629n, Boolean.valueOf(z));
                }
                return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: b */
    public szz m54478b(Context context) {
        ProviderInfo providerInfo;
        pzz pzzVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        wj50.m88280q(packageManager, "Package manager required to locate emoji font provider");
        on3 on3Var = (on3) this.f116664b;
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        on3Var.getClass();
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            pzzVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo67395j = on3Var.mo67395j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo67395j) {
                    arrayList.add(signature.toByteArray());
                }
                pzzVar = new pzz(str, str2, "emojicompat-emoji-font", null, Collections.singletonList(arrayList), null);
            } catch (PackageManager.NameNotFoundException unused) {
                pzzVar = null;
            }
        }
        if (pzzVar == null) {
            return null;
        }
        return new szz(new rzz(context, pzzVar));
    }

    /* JADX INFO: renamed from: d */
    public void m54479d(byte b) {
        ((Parcel) this.f116664b).writeByte(b);
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: e */
    public void mo28351e() {
        yhq yhqVar = (yhq) this.f116664b;
        yhqVar.f272949t = false;
        View view = yhqVar.f272948i;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m54480f(float f) {
        ((Parcel) this.f116664b).writeFloat(f);
    }

    @Override // p204p.e411
    /* JADX INFO: renamed from: g */
    public Object mo37705g(eo01 eo01Var, fbk fbkVar) {
        ys60 ys60Var = (ys60) this.f116664b;
        lu01 lu01Var = eo01Var.f61264a;
        ys60Var.getClass();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: h */
    public void m54481h(long j) {
        long jM307b = TextUnit.m307b(j);
        byte b = 0;
        if (!tf71.m80605a(jM307b, 0L)) {
            if (tf71.m80605a(jM307b, 4294967296L)) {
                b = 1;
            } else if (tf71.m80605a(jM307b, 8589934592L)) {
                b = 2;
            }
        }
        m54479d(b);
        if (tf71.m80605a(TextUnit.m307b(j), 0L)) {
            return;
        }
        m54480f(TextUnit.m308c(j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m54482i(umx0 umx0Var, n4m n4mVar, ibk ibkVar) {
        e5q e5qVar;
        if (ibkVar instanceof e5q) {
            e5qVar = (e5q) ibkVar;
            int i = e5qVar.f56448d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e5qVar.f56448d = i - Integer.MIN_VALUE;
            } else {
                e5qVar = new e5q(this, ibkVar);
            }
        } else {
            e5qVar = new e5q(this, ibkVar);
        }
        Object objM91231A = e5qVar.f56446b;
        int i2 = e5qVar.f56448d;
        if (i2 == 0) {
            bga.m29073P(objM91231A);
            xjp xjpVar = (xjp) this.f116664b;
            String str = (String) g6f.m43741q0(umx0Var.f231966a);
            boolean z = umx0Var.f231970e;
            e5qVar.f56445a = umx0Var;
            e5qVar.f56448d = 1;
            objM91231A = xjpVar.m91231A(str, n4mVar, z, e5qVar);
            yuk yukVar = yuk.f276404a;
            if (objM91231A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            umx0Var = e5qVar.f56445a;
            bga.m29073P(objM91231A);
        }
        y4q y4qVar = (y4q) objM91231A;
        if (y4qVar instanceof w4q) {
            return new mnx0(pjf1.m70150g(umx0Var.f231968c, ((w4q) y4qVar).f247867a));
        }
        if (y4qVar instanceof x4q) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        Exception excM65555t;
        mzx0 mzx0Var = (mzx0) this.f116664b;
        boolean zMo1518j = task.mo1518j();
        w2a1 w2a1Var = w2a1.f247311a;
        if (zMo1518j) {
            mzx0Var.resumeWith(w2a1Var);
            return;
        }
        Exception excMo1514f = task.mo1514f();
        if (excMo1514f == null || (excM65555t = nsg1.m65555t(excMo1514f)) == null) {
            mzx0Var.resumeWith(w2a1Var);
        } else {
            mzx0Var.resumeWith(new c6x0(excM65555t));
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f116663a) {
            case 2:
                ji41 ji41Var = (ji41) obj;
                if (ji41Var.f112641a) {
                    j5p j5pVar = (j5p) this.f116664b;
                    String str = ji41Var.f112642b;
                    d03 d03Var = j5pVar.f109054e;
                    g5p g5pVar = new g5p(j5pVar, 1);
                    ArtworkView artworkView = (ArtworkView) d03Var.f43728d;
                    if (str == null || str.length() == 0) {
                        artworkView.setVisibility(8);
                        ((TextView) d03Var.f43720S0).setVisibility(0);
                    } else {
                        artworkView.setVisibility(0);
                    }
                    artworkView.mo2821c(g5pVar);
                    artworkView.mo2820d(new m66(new h66(str), true));
                    return;
                }
                return;
            case 3:
                Long l = (Long) obj;
                iin iinVar = (iin) this.f116664b;
                TextView textView = (TextView) ((hol0) iinVar.f102607c).f93566f;
                wj50.m88279p(l);
                textView.setText(iin.m50736d(iinVar, R.plurals.seconds_label, l.longValue()));
                return;
            case 4:
                ((ContentRestrictionBadgeView) ((qbp) this.f116664b).f187133c.f205037d).mo2820d((qsj) obj);
                return;
            case 5:
            case 7:
            case 10:
            case 11:
            default:
                ((TextView) ((tdq) this.f116664b).f219454c.f225645X).setText((String) obj);
                return;
            case 6:
                ((TextView) ((z9p) ((xzo) this.f116664b).f267728c).f280847f).setText((String) obj);
                return;
            case 8:
                kcq0 kcq0Var = (kcq0) obj;
                qxo qxoVar = (qxo) this.f116664b;
                wj50.m88279p(kcq0Var);
                ((ArtworkView) ((rk0) qxoVar.f193717c).f199936d).mo2820d(new m66(new h66(kcq0Var.f121535a), false));
                return;
            case 9:
                Integer num = (Integer) obj;
                g0q g0qVar = (g0q) this.f116664b;
                Context context = g0qVar.f75416a;
                wj50.m88279p(num);
                int iIntValue = num.intValue();
                clq0 clq0Var = g0qVar.f75420e;
                fyq0 fyq0Var = g0qVar.f75413X;
                if (fyq0Var == null) {
                    wj50.m88260d0("headerModel");
                    throw null;
                }
                if (fyq0Var.f74825k) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) clq0Var.f39344f;
                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                    h6j h6jVar = layoutParams instanceof h6j ? (h6j) layoutParams : null;
                    if (h6jVar != null) {
                        h6jVar.setMarginStart(iIntValue);
                        h6jVar.setMarginEnd(iIntValue);
                        h6jVar.f88109G = context.getString(R.string.prerelease_header_video_ratio_with_full_width);
                        constraintLayout.setLayoutParams(h6jVar);
                        constraintLayout.requestLayout();
                    }
                    for (TextView textView2 : h6f.m46715L((TextView) clq0Var.f39341c, (TextView) clq0Var.f39343e)) {
                        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                        h6j h6jVar2 = layoutParams2 instanceof h6j ? (h6j) layoutParams2 : null;
                        if (h6jVar2 != null) {
                            float f = 16;
                            h6jVar2.setMarginStart(((int) (context.getResources().getDisplayMetrics().density * f)) + iIntValue);
                            h6jVar2.setMarginEnd(((int) (f * context.getResources().getDisplayMetrics().density)) + iIntValue);
                            textView2.setLayoutParams(h6jVar2);
                        }
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) g0qVar.f75421f.f257247b;
                    constraintLayout2.setPadding(iIntValue, constraintLayout2.getPaddingTop(), iIntValue, constraintLayout2.getPaddingBottom());
                    return;
                }
                return;
            case 12:
                String str2 = (String) obj;
                adq adqVar = (adq) this.f116664b;
                ((TextView) adqVar.f14657b.f225646Y).setText(str2);
                rxj.m76659a(adqVar.f14658c.f111921t, str2);
                ContextMenuButton contextMenuButton = (ContextMenuButton) adqVar.f14659d.f56509f;
                contextMenuButton.setEnabled(true);
                contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(R.string.show_context_menu_content_description_track, str2));
                return;
        }
    }

    public jwo(Context context, zxd1 zxd1Var, w54 w54Var, bwt0 bwt0Var, bcm0 bcm0Var, qst0 qst0Var, pzs0 pzs0Var, okj0 okj0Var, w8q0 w8q0Var) {
        this.f116663a = 7;
        this.f116664b = new sef0(bwt0.m30705i(bwt0Var, new cf91(context, zxd1Var)), new iv0((iv0) bcm0Var.f25916b, new dmw0(context, zxd1Var, 0)), new iv0((lq0) qst0Var.f192185b, new dmw0(context, zxd1Var, 1)), w9h1.m87517y(new bmh((vyr0) pzs0Var.f183794b, (mab0) pzs0Var.f183795c, (w6j0) pzs0Var.f183796d, (zxd1) pzs0Var.f183797e), null, null, 3), w9h1.m87517y(new ljp((zxd1) okj0Var.f166380a, (nh61) okj0Var.f166381b, (s3g0) okj0Var.f166382c, (gcu0) okj0Var.f166383d, (q831) okj0Var.f166384e, (luk) okj0Var.f166385f), null, null, 3), mlg1.m62219l(w54Var.m87218b(), w8q0Var));
    }

    public jwo(int i) {
        Object on3Var;
        this.f116663a = i;
        switch (i) {
            case 23:
                break;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    on3Var = new xep(8);
                } else {
                    on3Var = new on3(8);
                }
                this.f116664b = on3Var;
                break;
        }
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: c */
    public void mo28349c() {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        n5w n5wVar = (n5w) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        e64 e64Var = (e64) ((g2q) this.f116664b).f75987b;
        ro80 ro80VarM44508o = geg1.m44508o();
        if (n5wVar.f150629b) {
            wm61 wm61Var = wm61.f252745a;
            ro80VarM44508o.add(new sec1(wm61Var, wm61Var));
        }
        if (e64Var.m37873d() && n5wVar.f150632e) {
            rm61 rm61Var = rm61.f200464a;
            ro80VarM44508o.add(new sec1(rm61Var, rm61Var));
        }
        kn61 kn61Var = kn61.f124317a;
        ro80VarM44508o.add(new sec1(kn61Var, kn61Var));
        sm61 sm61Var = sm61.f210575a;
        ro80VarM44508o.add(new sec1(sm61Var, sm61Var));
        if (zBooleanValue) {
            tm61 tm61Var = tm61.f221612a;
            ro80VarM44508o.add(new sec1(tm61Var, tm61Var));
        }
        if (n5wVar.f150628a) {
            gn61 gn61Var = gn61.f81596a;
            ro80VarM44508o.add(new sec1(gn61Var, gn61Var));
        }
        if (n5wVar.f150630c) {
            um61 um61Var = um61.f231767a;
            ro80VarM44508o.add(new sec1(um61Var, um61Var));
        }
        if (e64Var.m37871b()) {
            pl61 pl61Var = pl61.f178653a;
            ro80VarM44508o.add(new sec1(pl61Var, pl61Var));
        }
        if (n5wVar.f150631d) {
            ln61 ln61Var = ln61.f135106a;
            ro80VarM44508o.add(new sec1(ln61Var, ln61Var));
        }
        jn61 jn61Var = jn61.f114034a;
        ro80VarM44508o.add(new sec1(jn61Var, jn61Var));
        xm61 xm61Var = xm61.f263300a;
        ro80VarM44508o.add(new sec1(xm61Var, xm61Var));
        in61 in61Var = in61.f103879a;
        ro80VarM44508o.add(new sec1(in61Var, in61Var));
        return geg1.m44506m(ro80VarM44508o);
    }
}
