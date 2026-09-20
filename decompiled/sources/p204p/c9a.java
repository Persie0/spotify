package p204p;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.car.app.C0023j;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.datasource.impl.proto.HierarchyMessageChangedNotification;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.artistandaddedbyname.ArtistAndAddedByNameView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDefer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class c9a implements Function, BiFunction, l5w0, t6l0, rdc1, d3z0, ant, rze1, BiPredicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35433a;

    /* JADX INFO: renamed from: b */
    public final Object f35434b;

    public /* synthetic */ c9a(Object obj, int i) {
        this.f35433a = i;
        this.f35434b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((CacheState) obj) == CacheState.LOADED && (((rza) this.f35434b).f204108g instanceof eu40 ? true : ((Boolean) obj2).booleanValue()));
    }

    @Override // p204p.l5w0
    /* JADX INFO: renamed from: b */
    public av91 mo31905b(st91 st91Var, tu41 tu41Var, String str) {
        if (!(tu41Var instanceof it41)) {
            return null;
        }
        String str2 = ((it41) tu41Var).f105421a.f237979a;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-audiobook-chapter-row";
        yt91VarM50626j.f276052f = "3.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276050d = str2;
        return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM50626j.m94607a(), st91Var, System.currentTimeMillis());
    }

    @Override // p204p.d3z0
    /* JADX INFO: renamed from: c */
    public void mo31906c(String str) {
        Consumer consumer = ((bxk) this.f35434b).f31886t;
        if (consumer != null) {
            consumer.accept(new swk(str));
        }
    }

    @Override // p204p.rze1
    /* JADX INFO: renamed from: d */
    public float mo31907d() {
        return 1.0f;
    }

    @Override // p204p.l5w0
    /* JADX INFO: renamed from: e */
    public av91 mo31908e(st91 st91Var, tu41 tu41Var, String str) {
        if (!(tu41Var instanceof it41)) {
            return null;
        }
        it41 it41Var = (it41) tu41Var;
        String str2 = it41Var.f105421a.f237979a;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-audiobook-chapter-row";
        yt91VarM50626j.f276052f = "3.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276050d = str2;
        zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
        xr00 xr00Var = (xr00) ((ku00) this.f35434b).m57369d(str2).f158717a.getValue();
        if (it41Var.f105426f == pro0.f180653a) {
            dv91 dv91Var = new dv91("hit", 1);
            String string = str2.toString();
            return new av91("", "", dv91Var, new bv91(ContextTrack.TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", string != null ? string : "")), zt91VarM94607a, st91Var, System.currentTimeMillis());
        }
        if ((xr00Var instanceof rr00) || (xr00Var instanceof wr00) || (xr00Var instanceof qr00)) {
            dv91 dv91Var2 = new dv91("hit", 1);
            String string2 = str2.toString();
            if (string2 == null) {
                string2 = "";
            }
            return new av91("", "", dv91Var2, new bv91("show_paywall", 1, Collections.singletonMap("paywalled_item", string2)), zt91VarM94607a, st91Var, System.currentTimeMillis());
        }
        if (xr00Var instanceof vr00) {
            return null;
        }
        dv91 dv91Var3 = new dv91("hit", 1);
        String string3 = str2.toString();
        if (string3 == null) {
            string3 = "";
        }
        return new av91("", "", dv91Var3, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string3)), zt91VarM94607a, st91Var, System.currentTimeMillis());
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (ConstraintLayout) this.f35434b;
    }

    @Override // p204p.d3z0
    /* JADX INFO: renamed from: h */
    public boolean mo31910h() {
        ((SearchView) ((bxk) this.f35434b).f31877a.f230293e).clearFocus();
        return true;
    }

    @Override // p204p.rze1
    /* JADX INFO: renamed from: j */
    public float mo31911j() {
        Float f = (Float) ((peb) this.f35434b).m69715a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public Object m31913l(wet wetVar, ibk ibkVar) {
        a6l a6lVar;
        Object c6x0Var;
        d850 d850Var;
        String str;
        if (ibkVar instanceof a6l) {
            a6lVar = (a6l) ibkVar;
            int i = a6lVar.f12819e;
            if ((i & Integer.MIN_VALUE) != 0) {
                a6lVar.f12819e = i - Integer.MIN_VALUE;
            } else {
                a6lVar = new a6l(this, ibkVar);
            }
        } else {
            a6lVar = new a6l(this, ibkVar);
        }
        Object obj = a6lVar.f12817c;
        int i2 = a6lVar.f12819e;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                String str2 = wetVar.f250619a;
                d850Var = wetVar.f250620b;
                sgv sgvVar = (sgv) this.f35434b;
                a6lVar.f12815a = str2;
                a6lVar.f12816b = d850Var;
                a6lVar.f12819e = 1;
                Object objMo56616b = sgvVar.mo56616b(str2, a6lVar);
                yuk yukVar = yuk.f276404a;
                if (objMo56616b == yukVar) {
                    return yukVar;
                }
                str = str2;
                obj = objMo56616b;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d850Var = a6lVar.f12816b;
                str = a6lVar.f12815a;
                bga.m29073P(obj);
            }
            c6x0Var = new luw(str, (String) obj, d850Var);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to create entity", new Object[0]);
        }
        return c6x0Var instanceof c6x0 ? muw.f147444a : c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public Object m31914m(String str, ibk ibkVar) {
        quj qujVar;
        if (ibkVar instanceof quj) {
            qujVar = (quj) ibkVar;
            int i = qujVar.f192722c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qujVar.f192722c = i - Integer.MIN_VALUE;
            } else {
                qujVar = new quj(this, ibkVar);
            }
        } else {
            qujVar = new quj(this, ibkVar);
        }
        Object objM79398j = qujVar.f192720a;
        int i2 = qujVar.f192722c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79398j);
                suj sujVar = (suj) this.f35434b;
                qujVar.f192722c = 1;
                objM79398j = sujVar.m79398j(str, qujVar);
                yuk yukVar = yuk.f276404a;
                if (objM79398j == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM79398j);
            }
            return (qf40) objM79398j;
        } catch (Exception unused) {
            return lv21.f137205b;
        }
    }

    /* JADX INFO: renamed from: n */
    public v811 m31915n() {
        t2n t2nVar = (t2n) this.f35434b;
        Context context = (Context) t2nVar.f216596e;
        return new v811(context, new flw0(new und1((n811) ((RetrofitMaker) t2nVar.f216595d).createWebgateService(n811.class, "android-share-shareables-impl"), 0), new ia7(10), new vux((tfm0) t2nVar.f216594c, 14), 21), new c06((prb) ((crb) t2nVar.f216593b).f41253a.get(), (nrb) t2nVar.f216597f, context, 29));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f35433a) {
            case 19:
                String str = (String) obj;
                cgl cglVar = (cgl) this.f35434b;
                ((TextView) cglVar.f37718T0.f225646Y).setText(str);
                ((TextView) cglVar.f37719U0.findViewById(R.id.cwp_header_title)).setText(str);
                break;
            case 27:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                twz0 twz0Var = ((w9p) this.f35434b).f249220d;
                int i = zBooleanValue ? 0 : 8;
                ((ConstraintLayout) ((id8) twz0Var.f224527d).f100968b).setVisibility(i);
                ((FrameLayout) twz0Var.f224528e).setVisibility(i);
                break;
            case 28:
                p1m p1mVar = (p1m) obj;
                qyy0 qyy0Var = ((map) this.f35434b).f141632b;
                if (p1mVar != null) {
                    ((ConstraintLayout) qyy0Var.f194066i).setVisibility(0);
                    ((TextView) qyy0Var.f194067t).setText(p1mVar.f173132a);
                    ((TextView) qyy0Var.f194065h).setText(String.valueOf(p1mVar.f173133b));
                } else {
                    ((ConstraintLayout) qyy0Var.f194066i).setVisibility(8);
                }
                break;
            default:
                ((ArtistAndAddedByNameView) ((qbp) this.f35434b).f187133c.f205038e).setText((String) obj);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        gqi gqiVar = (gqi) obj2;
        return wj50.m88271j((gqi) obj, gqiVar) && wj50.m88271j(gqiVar, ((a6p) this.f35434b).f12838h);
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(655);
        ((FrameLayout) ((c2e) this.f35434b).f33366d.f44572b).setPadding(dx40VarMo51806g.f53848a, dx40VarMo51806g.f53849b, dx40VarMo51806g.f53850c, dx40VarMo51806g.f53851d);
        return swd1.f214649b;
    }

    public c9a(C0023j c0023j) {
        this.f35433a = 15;
        this.f35434b = (s6j) c0023j.m214d(s6j.class);
    }

    public c9a(ComposeView composeView, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.f35433a = 13;
        this.f35434b = constraintLayout;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objInvoke;
        Single singleOnErrorReturnItem;
        int i = this.f35433a;
        Object obj2 = this.f35434b;
        switch (i) {
            case 1:
                p2x0 p2x0Var = (p2x0) obj;
                qse1 qse1Var = new qse1((lka) obj2, 22);
                if (p2x0Var instanceof k2x0) {
                    objInvoke = qse1Var.invoke(((k2x0) p2x0Var).f118699a);
                } else if (p2x0Var instanceof m2x0) {
                    objInvoke = u4m.f226774a;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return (v4m) objInvoke;
            case 4:
                ((bob) ((i26) obj2).f97754d).getClass();
                return new ijk(((HierarchyMessageChangedNotification) obj).getHierarchyId());
            case 5:
                pqm0 pqm0Var = (pqm0) obj;
                boolean zBooleanValue = ((Boolean) pqm0Var.f180350a).booleanValue();
                String str = (String) pqm0Var.f180351b;
                if (!zBooleanValue) {
                    return Flowable.m23313I("");
                }
                ve0 ve0Var = new ve0(1, (rvb) obj2, str);
                int i2 = Flowable.f7192a;
                return new FlowableDefer(ve0Var);
            case 6:
                return ((r3c) obj2).f195475d.m90126o((br50) obj);
            case 10:
                o0f o0fVar = (o0f) obj;
                zmn0 zmn0Var = ((a1f) obj2).f11403h;
                String str2 = o0fVar.f160375a.f64885b.f108599a;
                boolean z = zmn0Var.f284322b;
                ann0 ann0Var = zmn0.f284320d;
                if (!z) {
                    singleOnErrorReturnItem = Single.just(ann0Var);
                } else {
                    singleOnErrorReturnItem = ((ron0) zmn0Var.f284323c).m76074b("CollectionArtistPage", Collections.singletonList(str2), false).map(new jbh1(str2, 8)).onErrorReturnItem(ann0Var);
                }
                return singleOnErrorReturnItem.map(new ln9(o0fVar, 11));
            case 11:
                return j4f.m52339d((j4f) obj2, (CollectionPlatformEsperantoItemsResponse) obj);
            case 12:
                ArrayList arrayList = (ArrayList) obj;
                gtf gtfVar = (gtf) obj2;
                if (!arrayList.isEmpty()) {
                    int i3 = 7;
                    return ((jpx) gtfVar.f84162b).m53978b(new C1668ai("companion-content-loader", false, (gh00) new l24(i3, arrayList))).filter(msz0.f146884P0).map(new jw4(arrayList)).doOnNext(new g8f(gtfVar, i3));
                }
                return Observable.just(lau.f131415a);
            case 14:
                cxb cxbVar = (cxb) obj2;
                return new ysi((hv31) obj, (xre) cxbVar.f42974d, (b24) cxbVar.f42973c);
            case 23:
                return new CompletableFromAction(new ok0(19, (Integer) obj, (xho) obj2));
            default:
                vzn vznVar = ((pto) obj2).f181208a;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context = (Context) vznVar.f246489d;
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                intent.addFlags(268435456);
                context.startActivity(intent);
                return qto.f192421b;
        }
    }

    public c9a() {
        Object objMo39828c;
        this.f35433a = 3;
        lpi0 lpi0VarM59671t = lpi0.m59671t();
        this.f35434b = lpi0VarM59671t;
        Object objMo39828c2 = null;
        try {
            objMo39828c = lpi0VarM59671t.mo39828c(nu61.f158520u0);
        } catch (IllegalArgumentException unused) {
            objMo39828c = null;
        }
        Class cls = (Class) objMo39828c;
        if (cls != null && !cls.equals(ygb.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        lpi0 lpi0Var = (lpi0) this.f35434b;
        lpi0Var.m59673v(nu61.f158520u0, ygb.class);
        try {
            objMo39828c2 = lpi0Var.mo39828c(nu61.f158519t0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo39828c2 == null) {
            lpi0Var.m59673v(nu61.f158519t0, ygb.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // p204p.rze1
    /* JADX INFO: renamed from: g */
    public void mo31909g() {
    }

    @Override // p204p.rze1
    /* JADX INFO: renamed from: a */
    public void mo31904a(TotalCaptureResult totalCaptureResult) {
    }

    @Override // p204p.rze1
    /* JADX INFO: renamed from: k */
    public void mo31912k(gl8 gl8Var) {
    }
}
