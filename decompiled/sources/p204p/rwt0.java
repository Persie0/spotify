package p204p;

import android.os.Handler;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.quizrecommendationservice.p139v1.GetRecommendedQuizzesRequest;
import com.spotify.quizrecommendationservice.p139v1.GetRecommendedQuizzesResponse;
import com.spotify.quizrecommendationservice.p139v1.RecommendedQuiz;
import com.spotify.transcript.list.TranscriptListView;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class rwt0 implements InterfaceC2207oa, ant, Function, suy0, SingleOnSubscribe, yxf, ObservableOnSubscribe {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203413a;

    /* JADX INFO: renamed from: b */
    public final Object f203414b;

    public /* synthetic */ rwt0(Object obj, int i) {
        this.f203413a = i;
        this.f203414b = obj;
    }

    /* JADX INFO: renamed from: k */
    public static String m76579k(rwt0 rwt0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) rwt0Var.f203414b).iterator();
        while (it.hasNext()) {
            arrayList.add(((nwt0) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m76580a(Class cls) {
        Iterator it = ((ArrayList) this.f203414b).iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((nwt0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((he4) this.f203414b).m47265a() && ((ihi) obj).f102295b;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f203413a) {
            case 3:
                return (ObservableSource) ((gem0) this.f203414b).invoke(obj);
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            default:
                y5f y5fVar = (y5f) ((Map) obj).get(((yk11) this.f203414b).f273542a);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269417a : false);
            case 5:
                kz5 kz5Var = (kz5) this.f203414b;
                etz etzVar = (etz) kz5Var.f128014d;
                qro0 qro0Var = ((ifv0) obj).f101831b;
                if (qro0Var instanceof kro0) {
                    return ((hrw) etzVar.f62827f).mo48412a(new u7p0(((PlayOrigin) etzVar.f62826e).featureIdentifier(), false)).ignoreElement().m23307y();
                }
                if (qro0Var instanceof iro0) {
                    return ((hrw) etzVar.f62827f).mo48412a(new x7p0(((PlayOrigin) etzVar.f62826e).featureIdentifier(), false)).ignoreElement().m23307y();
                }
                if (qro0Var.equals(cro0.f41336a)) {
                    return ((ReplaySubject) kz5Var.f128016f).switchMap(new tpn0(kz5Var, 28));
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                rth rthVar = new rth();
                rthVar.m76391l(null, (String) obj);
                return (hx00) ((RetrofitMaker) ((abs0) this.f203414b).f14178b).createCustomHostService(hx00.class, rthVar.m76382c());
            case 7:
                return ((gwv0) this.f203414b).f85112b.mo48412a(new f8p0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).ignoreElement();
            case 8:
                ibw0 ibw0Var = (ibw0) this.f203414b;
                return ibw0Var.f100682e.m92769d(ibw0Var.f100681d).map(new w8q0(22, ibw0Var, (Integer) obj));
            case 9:
                return new ahu0(((ogu0) this.f203414b).f165276a, (Throwable) obj);
            case 15:
                x6x0 x6x0Var = (x6x0) obj;
                if (x6x0Var instanceof k6x0) {
                    return (Single) ((cn8) this.f203414b).invoke(x6x0Var);
                }
                if (x6x0Var instanceof r6x0) {
                    return Single.just(x6x0Var);
                }
                if (x6x0Var instanceof y5x0) {
                    return Single.just(x6x0Var);
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                return wyy0.m89383a((wyy0) this.f203414b, (Throwable) obj);
            case 19:
                PlayerState playerState = (PlayerState) obj;
                s121[] s121VarArr = (s121[]) this.f203414b;
                int length = s121VarArr.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    boolean zContains = true;
                    if (i < length) {
                        s121 s121Var = s121VarArr[i];
                        if (s121Var instanceof n121) {
                            if (!playerState.signals().contains("jump") && xgz0.m90941d(playerState) == null) {
                                zContains = false;
                            }
                        } else if (s121Var instanceof o121) {
                            if (!playerState.signals().contains("prompt") && hdi.m47214F(playerState)) {
                                zContains = false;
                            }
                        } else {
                            if (!(s121Var instanceof m121)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zContains = playerState.signals().contains("interact");
                        }
                        if (zContains) {
                            i++;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76581b(hva hvaVar) {
        if (!hvaVar.mo48767i()) {
            if (!(hvaVar instanceof ukx0)) {
                String strValueOf = String.valueOf(hvaVar.getClass());
                throw new IllegalArgumentException(dq60.m36616p("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
            }
            ukx0 ukx0Var = (ukx0) hvaVar;
            m76581b(ukx0Var.f231382c);
            m76581b(ukx0Var.f231383d);
            return;
        }
        int size = hvaVar.size();
        int[] iArr = ukx0.f231380h;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f203414b;
        if (stack.isEmpty() || ((hva) stack.peek()).size() >= i) {
            stack.push(hvaVar);
            return;
        }
        int i2 = iArr[iBinarySearch];
        hva ukx0Var2 = (hva) stack.pop();
        while (!stack.isEmpty() && ((hva) stack.peek()).size() < i2) {
            ukx0Var2 = new ukx0((hva) stack.pop(), ukx0Var2);
        }
        ukx0 ukx0Var3 = new ukx0(ukx0Var2, hvaVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = ukx0.f231380h;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, ukx0Var3.f231381b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((hva) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                ukx0Var3 = new ukx0((hva) stack.pop(), ukx0Var3);
            }
        }
        stack.push(ukx0Var3);
    }

    @Override // p204p.suy0
    /* JADX INFO: renamed from: c */
    public boolean mo59593c() {
        SearchFragment searchFragment = (SearchFragment) this.f203414b;
        sr31 sr31VarM3107i1 = searchFragment.m3107i1();
        kv91 kv91Var = (kv91) sr31VarM3107i1.f213224b;
        yt91 yt91VarM96903c = ((i8g0) sr31VarM3107i1.f213225c).f99785b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("search_bar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("cancel_button", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        return rfg1.m75453w(searchFragment).m84266t();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v10, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: d */
    public Serializable m76582d(String str, ibk ibkVar) throws IOException {
        dcx0 dcx0Var;
        if (ibkVar instanceof dcx0) {
            dcx0Var = (dcx0) ibkVar;
            int i = dcx0Var.f47655c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dcx0Var.f47655c = i - Integer.MIN_VALUE;
            } else {
                dcx0Var = new dcx0(this, ibkVar);
            }
        } else {
            dcx0Var = new dcx0(this, ibkVar);
        }
        Object objM31184a = dcx0Var.f47653a;
        int i2 = dcx0Var.f47655c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM31184a);
                c0m c0mVar = (c0m) this.f203414b;
                dcx0Var.f47655c = 1;
                objM31184a = c0mVar.m31184a(str, dcx0Var);
                yuk yukVar = yuk.f276404a;
                if (objM31184a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM31184a);
            }
            p3x0 p3x0Var = (p3x0) objM31184a;
            try {
                long jMo28081e = p3x0Var.mo28081e();
                if (jMo28081e > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                    throw new IOException("Cue audio too large: " + jMo28081e + " bytes (max 2097152)");
                }
                gqa gqaVarMo28080C1 = p3x0Var.mo28080C1();
                if (gqaVarMo28080C1.request(2097153L)) {
                    throw new IOException("Cue audio exceeds 2097152 bytes");
                }
                ?? Mo45419P0 = gqaVarMo28080C1.mo45419P0();
                p3x0Var.close();
                return Mo45419P0;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(p3x0Var, th);
                    throw th2;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (HttpException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IOException("Audio download failed", e3);
        }
    }

    /* JADX INFO: renamed from: e */
    public nwt0 m76583e(Class cls) {
        for (nwt0 nwt0Var : (ArrayList) this.f203414b) {
            if (nwt0Var.getClass() == cls) {
                return nwt0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: g */
    public Serializable m76584g(String str, ibk ibkVar) {
        nav0 nav0Var;
        if (ibkVar instanceof nav0) {
            nav0Var = (nav0) ibkVar;
            int i = nav0Var.f152125c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nav0Var.f152125c = i - Integer.MIN_VALUE;
            } else {
                nav0Var = new nav0(this, ibkVar);
            }
        } else {
            nav0Var = new nav0(this, ibkVar);
        }
        Object objM50269a = nav0Var.f152123a;
        int i2 = nav0Var.f152125c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM50269a);
                ya10 ya10VarM20038o = GetRecommendedQuizzesRequest.m20038o();
                if (str != null) {
                    ya10VarM20038o.m93164m(str);
                }
                GetRecommendedQuizzesRequest getRecommendedQuizzesRequest = (GetRecommendedQuizzesRequest) ya10VarM20038o.build();
                icv0 icv0Var = (icv0) this.f203414b;
                wj50.m88279p(getRecommendedQuizzesRequest);
                nav0Var.f152125c = 1;
                objM50269a = icv0Var.m50269a(getRecommendedQuizzesRequest, nav0Var);
                yuk yukVar = yuk.f276404a;
                if (objM50269a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM50269a);
            }
            o2x0 o2x0Var = (o2x0) objM50269a;
            if (!o2x0Var.f161171a.f149852O0) {
                return new c6x0(new Exception("Failed to get recommended quizzes: HTTP " + o2x0Var.f161171a.f149860d));
            }
            Object obj = o2x0Var.f161172b;
            if (obj == null) {
                throw new IllegalArgumentException("Response body is null");
            }
            ae50<RecommendedQuiz> ae50VarM20039n = ((GetRecommendedQuizzesResponse) obj).m20039n();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM20039n, 10));
            for (RecommendedQuiz recommendedQuiz : ae50VarM20039n) {
                wj50.m88279p(recommendedQuiz);
                String strM20040n = recommendedQuiz.m20040n();
                String strM20041o = null;
                String strM20042p = recommendedQuiz.m20044r() ? recommendedQuiz.m20042p() : null;
                if (recommendedQuiz.m20043q()) {
                    strM20041o = recommendedQuiz.m20041o();
                }
                arrayList.add(new egv0(strM20040n, strM20042p, strM20041o));
            }
            return arrayList;
        } catch (Exception e) {
            return new c6x0(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public Object m76585h(fjt fjtVar, ibk ibkVar) {
        a4x0 a4x0Var;
        if (ibkVar instanceof a4x0) {
            a4x0Var = (a4x0) ibkVar;
            int i = a4x0Var.f12346d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a4x0Var.f12346d = i - Integer.MIN_VALUE;
            } else {
                a4x0Var = new a4x0(this, ibkVar);
            }
        } else {
            a4x0Var = new a4x0(this, ibkVar);
        }
        Object obj = a4x0Var.f12344b;
        int i2 = a4x0Var.f12346d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                ob90 ob90Var = (ob90) this.f203414b;
                String str = fjtVar.f70400a;
                boolean z = fjtVar.f70401b;
                a4x0Var.f12343a = fjtVar;
                a4x0Var.f12346d = 1;
                Object objM44311k = ((gc90) ob90Var).m44311k(str, a4x0Var, z);
                yuk yukVar = yuk.f276404a;
                if (objM44311k == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fjtVar = a4x0Var.f12343a;
                bga.m29073P(obj);
            }
            return new ds6(fjtVar.f70401b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new cs6(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m76586i(a5v a5vVar, niz nizVar, ibk ibkVar) {
        v4y0 v4y0Var;
        if (ibkVar instanceof v4y0) {
            v4y0Var = (v4y0) ibkVar;
            int i = v4y0Var.f237269d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v4y0Var.f237269d = i - Integer.MIN_VALUE;
            } else {
                v4y0Var = new v4y0(this, ibkVar);
            }
        } else {
            v4y0Var = new v4y0(this, ibkVar);
        }
        Object objM76588l = v4y0Var.f237267b;
        int i2 = v4y0Var.f237269d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM76588l);
            r0s r0sVar = a5vVar.f12599a;
            r0s r0sVar2 = a5vVar.f12600b;
            if (!wj50.m88271j(r0sVar, r0sVar2)) {
                v4y0Var.f237266a = nizVar;
                v4y0Var.f237269d = 1;
                objM76588l = m76588l(r0sVar2, v4y0Var);
                if (objM76588l != obj) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76588l);
            return w2a1Var;
        }
        nizVar = v4y0Var.f237266a;
        bga.m29073P(objM76588l);
        v4y0Var.f237266a = null;
        v4y0Var.f237269d = 2;
        return nizVar.emit(objM76588l, v4y0Var) == obj ? obj : w2a1Var;
    }

    /* JADX INFO: renamed from: j */
    public Observable m76587j() {
        return k0e1.m54988g(((mv31) ((hv31) this.f203414b)).m62896q(ic11.f100706a), dau.f47107a).filter(zhi0.f282925M0).map(zkq0.f283805L0).startWith(Observable.fromCallable(new ic9(this, 23))).distinctUntilChanged();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public Object m76588l(r0s r0sVar, ibk ibkVar) {
        w4y0 w4y0Var;
        if (ibkVar instanceof w4y0) {
            w4y0Var = (w4y0) ibkVar;
            int i = w4y0Var.f247922c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4y0Var.f247922c = i - Integer.MIN_VALUE;
            } else {
                w4y0Var = new w4y0(this, ibkVar);
            }
        } else {
            w4y0Var = new w4y0(this, ibkVar);
        }
        Object obj = w4y0Var.f247920a;
        int i2 = w4y0Var.f247922c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM81762b = ((twx0) this.f203414b).m81762b("dj-language", r0sVar.f194556c);
                w4y0Var.f247922c = 1;
                Object objM96565n = zn91.m96565n(completableM81762b, w4y0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return o5v.f162107a;
        } catch (IOException unused) {
            return n5v.f150625a;
        }
    }

    @Override // p204p.yxf
    /* JADX INFO: renamed from: m */
    public j15 mo36390m(xq00 xq00Var) {
        xq00Var.m91771i0(22721794);
        ga01 ga01Var = (ga01) this.f203414b;
        int i = ga01Var.f77942e;
        xq00Var.m91771i0(360812164);
        qf40 qf40Var = ga01Var.f77943f;
        ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
        Iterator<E> it = qf40Var.iterator();
        while (it.hasNext()) {
            arrayList.add(k0e1.m54977L(((fa01) it.next()).mo35391g(), xq00Var));
        }
        xq00Var.m91788r(false);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        j15 j15Var = new j15(k0e1.m54978M(i, Arrays.copyOf(strArr, strArr.length), xq00Var));
        xq00Var.m91788r(false);
        return j15Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        qal qalVar = (qal) this.f203414b;
        azu0 azu0Var = (azu0) qalVar.f186898d;
        ((kv91) azu0Var.f21690b).mo57449i(((bbg0) azu0Var.f21691c).mo24514e(), null);
        ((Handler) qalVar.f186899e).post(new cjs0(qalVar, 19));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f203413a) {
            case 2:
                pqm0 pqm0Var = (pqm0) obj;
                boolean zBooleanValue = ((Boolean) pqm0Var.f180350a).booleanValue();
                int iIntValue = ((Number) pqm0Var.f180351b).intValue();
                hxt hxtVar = ((mou0) this.f203414b).f145755t;
                if (hxtVar != null) {
                    hxtVar.m49046g(new u8n0(zBooleanValue, iIntValue));
                }
                break;
            case 10:
                ((EncoreButton) ((uqw0) this.f203414b).f233139a.f146366X).setEnabled(((Boolean) obj).booleanValue());
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                C1778dh c1778dh = (C1778dh) this.f203414b;
                ((TranscriptListView) c1778dh.f48929b).post(new e9w(c1778dh, iIntValue2, 3));
                break;
        }
    }

    public rwt0(s121[] s121VarArr, xgz0 xgz0Var) {
        this.f203413a = 19;
        this.f203414b = s121VarArr;
    }

    public rwt0(List list) {
        this.f203413a = 0;
        this.f203414b = new ArrayList(list);
    }

    public rwt0() {
        this.f203413a = 14;
        this.f203414b = new Stack();
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        h301 h301Var = (h301) this.f203414b;
        singleEmitter.setCancellable(new zg0(h301Var, 8));
        h301Var.f87107a = singleEmitter;
    }
}
