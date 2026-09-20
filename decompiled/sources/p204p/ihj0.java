package p204p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ihj0 implements ant, Function, SingleOnSubscribe, Function6, t6l0 {

    /* JADX INFO: renamed from: c */
    public static final h110 f102304c = new h110(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102305a;

    /* JADX INFO: renamed from: b */
    public final Object f102306b;

    public /* synthetic */ ihj0(Object obj, int i) {
        this.f102305a = i;
        this.f102306b = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m50643a(int i) {
        int i2;
        String str;
        lc3 lc3Var = (lc3) this.f102306b;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            i2 = 1;
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 2;
        }
        zz11 zz11Var = new zz11(i2, 3);
        int iM38547C2 = edb.m38547C(i2);
        if (iM38547C2 == 0) {
            str = by10.f32043b;
        } else {
            if (iM38547C2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = by10.f32044c;
        }
        lc3Var.f131805a.m30862a(str).mo52182p(zz11Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ad8 ad8Var;
        int i = this.f102305a;
        int i2 = 10;
        Object[] objArr = 0;
        Object obj2 = this.f102306b;
        switch (i) {
            case 3:
                return !((Boolean) obj).booleanValue() ? Observable.empty() : ((if61) ((C2471uu) obj2).f234042a.get()).f101691a;
            case 4:
                Throwable th = (Throwable) obj;
                qlv0 qlv0Var = (qlv0) obj2;
                long j = qlv0Var.f189932a + 1;
                qlv0Var.f189932a = j;
                if (j >= 5) {
                    return Flowable.m23326x(th);
                }
                Logger.m3973i("AuthClient Authentication - attempt " + j + "/5 error: " + th, new Object[0]);
                long j2 = qlv0Var.f189932a;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i3 = Flowable.f7192a;
                return Flowable.m23317a0(j2 * j2, timeUnit, Schedulers.f10369b);
            case 5:
                ky0 ky0Var = ((dz0) obj2).f54469c;
                hy0 hy0Var = ((h5y0) obj).f87926a;
                rk7 rk7Var = hy0Var.f96422a;
                String str = hy0Var.f96423b;
                String str2 = hy0Var.f96424c;
                iy0 iy0Var = (iy0) ky0Var;
                iy0Var.getClass();
                iy0Var.m51875b(iy0.f106810b, rk7Var != null ? rk7Var.name() : null);
                iy0Var.m51875b(iy0.f106811c, str);
                iy0Var.m51875b(iy0.f106812d, str2);
                return p9f0.f175236a;
            case 6:
                aet aetVar = (aet) obj;
                mc1 mc1Var = (mc1) obj2;
                int i4 = 8;
                return vjf1.m85770t(xsr.f265652b, new C2482v4(mc1Var, aetVar, objArr == true ? 1 : 0, 21)).toObservable().map(new xqb(i4, aetVar, mc1Var)).onErrorReturn(new etq(i4, aetVar, mc1Var));
            case 8:
                Observable observable = (Observable) ((twz0) obj2).f224526c;
                t02 t02Var = t02.f215724h;
                return observable.map(new wjr0(29)).first(new so0("")).map(new qgj0((Boolean) obj, i2));
            case 9:
                qa2 qa2Var = (qa2) obj;
                va2 va2Var = (va2) obj2;
                return va2Var.f239091e.m92857a(t2b1.BIRTHDATE, String.format(Locale.US, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(qa2Var.f186714a), Integer.valueOf(qa2Var.f186715b + 1), Integer.valueOf(qa2Var.f186716c)}, 3))).onErrorReturn(z9h1.f280803d).map(new qgj0(va2Var, qa2Var));
            case 10:
                cq50 cq50Var = (cq50) ((br50) obj);
                return ((t6f0) ((vbu0) obj2).f239584b).m80159a(cq50Var.f40741f).map(new qgj0(cq50Var, 12));
            case 15:
                return Single.create(new vbu0((c54) obj2, 17));
            case 16:
                return Single.create(new vbu0((b94) obj2, 18));
            case 18:
                return Single.create(new vbu0((ol4) obj2, 20));
            case 21:
                y5f y5fVar = (y5f) ((Map) obj).get(((ws5) obj2).f254507a);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269417a : false);
            case 27:
                mq7 mq7Var = (mq7) obj;
                AuthorizationActivity authorizationActivity = (AuthorizationActivity) obj2;
                yq7 yq7Var = authorizationActivity.f2963j1;
                if (yq7Var == null) {
                    wj50.m88260d0("authorizationRequestProducer");
                    throw null;
                }
                ObservableEmitter observableEmitter = yq7Var.f275158a;
                if (observableEmitter != null) {
                    observableEmitter.onNext(mq7Var);
                }
                i0d i0dVar = authorizationActivity.f2968o1;
                if (i0dVar == null) {
                    wj50.m88260d0("clientAuthLogger");
                    throw null;
                }
                String callingPackage = authorizationActivity.getCallingPackage();
                if (callingPackage == null) {
                    callingPackage = "unknown_package_name";
                }
                return i0dVar.m49366k(callingPackage, mq7Var.f146199a);
            default:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ed8) it.next()).f58477c));
                }
                zc8 zc8Var = ((jd8) obj2).f111284b;
                ed8 ed8Var = (ed8) g6f.m43689C0(list);
                hg8 hg8Var = ed8Var != null ? ed8Var.f58476b : hg8.UNKNOWN;
                zc8Var.getClass();
                pg8 pg8VarM29423J = bjg1.m29423J(arrayList, hg8Var);
                double d = pg8VarM29423J.f177244a;
                int iOrdinal = pg8VarM29423J.f177245b.ordinal();
                if (iOrdinal == 0) {
                    ad8Var = ad8.f14561b;
                } else if (iOrdinal == 1) {
                    ad8Var = ad8.f14562c;
                } else if (iOrdinal == 2) {
                    ad8Var = ad8.f14563d;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ad8Var = ad8.f14560a;
                }
                return new pqm0(new cd8(((ed8) g6f.m43687A0(list)).f58475a, new bd8(d, ad8Var, ((Number) g6f.m43687A0(arrayList)).intValue()), ((ed8) g6f.m43687A0(list)).f58476b, ((ed8) g6f.m43687A0(list)).f58479e), g6f.m43687A0(arrayList));
        }
    }

    /* JADX INFO: renamed from: b */
    public cab0 m50644b(Context context, String str, InputStream inputStream, String str2, String str3) {
        cab0 cab0VarM95574g;
        xvy xvyVar;
        qgj0 qgj0Var = (qgj0) this.f102306b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            sra0.m79107a();
            xvy xvyVar2 = xvy.ZIP;
            cab0VarM95574g = str3 != null ? z8b0.m95574g(context, new ZipInputStream(new FileInputStream(qgj0Var.m72753q(str, inputStream, xvyVar2))), str) : z8b0.m95574g(context, new ZipInputStream(inputStream), null);
            xvyVar = xvyVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            sra0.m79107a();
            xvyVar = xvy.GZIP;
            cab0VarM95574g = str3 != null ? z8b0.m95570c(new GZIPInputStream(new FileInputStream(qgj0Var.m72753q(str, inputStream, xvyVar))), str) : z8b0.m95570c(new GZIPInputStream(inputStream), null);
        } else {
            sra0.m79107a();
            xvyVar = xvy.JSON;
            cab0VarM95574g = str3 != null ? z8b0.m95570c(new FileInputStream(qgj0Var.m72753q(str, inputStream, xvyVar).getAbsolutePath()), str) : z8b0.m95570c(inputStream, null);
        }
        if (str3 != null && cab0VarM95574g.f35791a != null) {
            File file = new File(qgj0Var.m72752o(), qgj0.m72744h(str, xvyVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            sra0.m79107a();
            if (!zRenameTo) {
                sra0.m79109c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return cab0VarM95574g;
    }

    @Override // io.reactivex.rxjava3.functions.Function6
    /* JADX INFO: renamed from: c */
    public Object mo23411c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
        ch4 ch4Var = (ch4) this.f102306b;
        return new a8d0(((Boolean) obj).booleanValue(), (Map) obj2, ch4Var.f37906m.m50689l(), ch4Var.f37906m.m50678a(), ((Boolean) obj3).booleanValue(), (rhj) obj4, zBooleanValue2, zBooleanValue);
    }

    /* JADX INFO: renamed from: d */
    public lv3 m50645d() {
        return ((mv3) this.f102306b).m62891c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m50646e(vhe0 vhe0Var, ago agoVar, ibk ibkVar) {
        mj1 mj1Var;
        vhe0 vhe0Var2;
        if (ibkVar instanceof mj1) {
            mj1Var = (mj1) ibkVar;
            int i = mj1Var.f144145d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mj1Var.f144145d = i - Integer.MIN_VALUE;
            } else {
                mj1Var = new mj1(this, ibkVar);
            }
        } else {
            mj1Var = new mj1(this, ibkVar);
        }
        Object objM56684z = mj1Var.f144143b;
        int i2 = mj1Var.f144145d;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            nd0 nd0Var = new nd0(this, agoVar, vhe0Var, fbkVar, 2);
            mj1Var.f144142a = vhe0Var;
            mj1Var.f144145d = 1;
            objM56684z = kk40.m56684z(nd0Var, mj1Var);
            yuk yukVar = yuk.f276404a;
            if (objM56684z == yukVar) {
                return yukVar;
            }
            vhe0Var2 = vhe0Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vhe0Var2 = mj1Var.f144142a;
            bga.m29073P(objM56684z);
        }
        pqm0 pqm0Var = (pqm0) objM56684z;
        uu41 uu41Var = (uu41) pqm0Var.f180350a;
        boolean zBooleanValue = ((Boolean) pqm0Var.f180351b).booleanValue();
        if (uu41Var != null) {
            return m50648g(vhe0Var2, uu41Var.f234106a, zBooleanValue);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public pj1 m50647f(vhe0 vhe0Var, ago agoVar) {
        return new pj1(new hd1(fag1.m41173v(agoVar, pag1.m69486v(new rko(t6x0.f217619L0, 1, fg1.f69153X0, new pko(fg1.f69157Z0), fg1.f69155Y0), new rko(new jqx(qpv0.f191387a.mo54112b(skx0.class)), 2, fg1.f69150V0, new pko(fg1.f69158a1), fg1.f69151W0), ec1.f58196g), vhe0Var.f241502a), 2), this, vhe0Var, 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    /* JADX INFO: renamed from: g */
    public f5k m50648g(vhe0 vhe0Var, boolean z, boolean z2) {
        boolean z3;
        hz80 hz80Var = vhe0Var.f241505d;
        String str = vhe0Var.f241502a;
        int i = 1;
        if (hz80Var == null) {
            z3 = z;
        } else {
            z3 = false;
            if (hz80Var.f96832h) {
                if (z2 && !z) {
                    z3 = true;
                }
            } else if (z2) {
                z3 = true;
            } else {
                Set set = dd41.f47702f;
                if (r46.m74726U(str).f47709c == gn80.ALBUM) {
                    z3 = true;
                }
            }
        }
        if (!z3) {
            return null;
        }
        return new f5k("aligned_curation_add_to", z ? kou.f124911c : auu.f20028c, (c5k) null, Integer.valueOf(z ? R.string.playlist_options_menu_remove_from_library : R.string.playlist_options_menu_add_to_library), (String) null, false, (p221) null, new e5k(new v4k(1), z ? 2 : 1, new d5k(dk1.f49794S0, new cj1(z, str, i)), new u20((nl1) this.f102306b, str, z, 2)), 244);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        bji bjiVar2;
        switch (this.f102305a) {
            case 14:
                hv3 hv3Var = (hv3) this.f102306b;
                fnk0 fnk0Var = hv3Var.f95575d;
                if (fnk0Var == null || !fnk0Var.m42228h("android-audiobook-playerlistener.should_refresh_capping_state_on_player_error")) {
                    bjiVar = fnk0Var;
                    bjiVar = hv3Var.f95576e;
                }
                if (bjiVar != null) {
                }
                break;
            default:
                gi5 gi5Var = (gi5) this.f102306b;
                fnk0 fnk0Var2 = gi5Var.f80068r;
                if (fnk0Var2 == null || !fnk0Var2.m42228h("apps-music-libs-eventsender.rate_limiting_rule_2_events_per_time_unit")) {
                    bjiVar2 = fnk0Var2;
                    bjiVar2 = gi5Var.f80069s;
                }
                if (bjiVar2 != null) {
                }
                break;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        f5j0 f5j0Var = (f5j0) obj;
        C2223op c2223op = (C2223op) this.f102306b;
        C2465uo c2465uo = C2465uo.f232293b;
        InterfaceC2264pp interfaceC2264pp = (InterfaceC2264pp) c2223op.f167724e;
        if (f5j0Var instanceof d5j0) {
            Intent intent = ((d5j0) f5j0Var).f45457a;
            AccountSelectionActivity accountSelectionActivity = (AccountSelectionActivity) interfaceC2264pp;
            accountSelectionActivity.finish();
            accountSelectionActivity.startActivity(intent);
            Consumer consumer = (Consumer) c2223op.f167725f;
            if (consumer != null) {
                consumer.accept(c2465uo);
                return;
            } else {
                wj50.m88260d0("consumer");
                throw null;
            }
        }
        if (!f5j0Var.equals(b5j0.f23599a)) {
            if (!f5j0Var.equals(c5j0.f34195a)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        ((AccountSelectionActivity) interfaceC2264pp).finish();
        Consumer consumer2 = (Consumer) c2223op.f167725f;
        if (consumer2 != null) {
            consumer2.accept(c2465uo);
        } else {
            wj50.m88260d0("consumer");
            throw null;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        boolean z;
        hwd1 dwd1Var;
        boolean z2;
        swd1 swd1VarMo30680b = swd1Var;
        int iM79540d = swd1VarMo30680b.m79540d();
        l65 l65Var = (l65) this.f102306b;
        Context context = l65Var.f130200X;
        int iM79540d2 = swd1VarMo30680b.m79540d();
        ActionBarContextView actionBarContextView = l65Var.f130196T0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l65Var.f130196T0.getLayoutParams();
            boolean z3 = true;
            if (l65Var.f130196T0.isShown()) {
                if (l65Var.f130183A1 == null) {
                    l65Var.f130183A1 = new Rect();
                    l65Var.f130184B1 = new Rect();
                }
                Rect rect = l65Var.f130183A1;
                Rect rect2 = l65Var.f130184B1;
                rect.set(swd1VarMo30680b.m79538b(), swd1VarMo30680b.m79540d(), swd1VarMo30680b.m79539c(), swd1VarMo30680b.m79537a());
                ViewGroup viewGroup = l65Var.f130203Y0;
                Method method = cpc1.f40541a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = l65Var.f130203Y0;
                WeakHashMap weakHashMap = mec1.f142677a;
                swd1 swd1VarM35774a = dec1.m35774a(viewGroup2);
                int iM79538b = swd1VarM35774a == null ? 0 : swd1VarM35774a.m79538b();
                int iM79539c = swd1VarM35774a == null ? 0 : swd1VarM35774a.m79539c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || l65Var.f130206a1 != null) {
                    View view2 = l65Var.f130206a1;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM79538b || marginLayoutParams2.rightMargin != iM79539c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM79538b;
                            marginLayoutParams2.rightMargin = iM79539c;
                            l65Var.f130206a1.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    l65Var.f130206a1 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM79538b;
                    layoutParams.rightMargin = iM79539c;
                    l65Var.f130203Y0.addView(l65Var.f130206a1, -1, layoutParams);
                }
                View view4 = l65Var.f130206a1;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = l65Var.f130206a1;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? lzj.m60386v(context, R.color.abc_decor_view_status_guard_light) : lzj.m60386v(context, R.color.abc_decor_view_status_guard));
                }
                if (!l65Var.f130211f1 && z3) {
                    iM79540d2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                l65Var.f130196T0.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = l65Var.f130206a1;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iM79540d != iM79540d2) {
            int iM79538b2 = swd1VarMo30680b.m79538b();
            int iM79539c2 = swd1VarMo30680b.m79539c();
            int iM79537a = swd1VarMo30680b.m79537a();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                dwd1Var = new gwd1(swd1VarMo30680b);
            } else if (i6 >= 31) {
                dwd1Var = new fwd1(swd1VarMo30680b);
            } else if (i6 >= 30) {
                dwd1Var = new ewd1(swd1VarMo30680b);
            } else {
                dwd1Var = i6 >= 29 ? new dwd1(swd1VarMo30680b) : new bwd1(swd1VarMo30680b);
            }
            dwd1Var.mo30682g(dx40.m37189b(iM79538b2, iM79540d2, iM79539c2, iM79537a));
            swd1VarMo30680b = dwd1Var.mo30680b();
        }
        return mec1.m61557i(view, swd1VarMo30680b);
    }

    public ihj0(RetrofitMaker retrofitMaker) {
        this.f102305a = 11;
        this.f102306b = (o83) retrofitMaker.createWebgateService(o83.class, "android-partner-account-linking-alexa");
    }

    public ihj0(qgj0 qgj0Var, tm4 tm4Var) {
        this.f102305a = 0;
        this.f102306b = qgj0Var;
    }

    public ihj0(int i) {
        eoe0 eoe0Var;
        this.f102305a = i;
        switch (i) {
            case 26:
                this.f102306b = p8y.m69343a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                break;
            case 29:
                this.f102306b = new CopyOnWriteArrayList();
                break;
            default:
                b3t0 b3t0Var = b3t0.f23129c;
                try {
                    eoe0Var = (eoe0) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    eoe0Var = f102304c;
                }
                eoe0[] eoe0VarArr = {h110.f86402b, eoe0Var};
                wbc0 wbc0Var = new wbc0();
                wbc0Var.f249732a = eoe0VarArr;
                Charset charset = ce50.f37010a;
                this.f102306b = wbc0Var;
                break;
        }
    }
}
