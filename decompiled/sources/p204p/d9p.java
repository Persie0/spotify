package p204p;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass$AtvPairingResponse;
import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass$AtvStartPairingRequest;
import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass$AtvSubmitPinRequest;
import com.spotify.encoreconsumermobile.elements.selection.SelectionView;
import com.spotify.music.R;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: classes9.dex */
public final class d9p implements Function, ant, FlowableOnSubscribe, InterfaceC2207oa, nsf0, r7l0, df5, wh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46869a;

    /* JADX INFO: renamed from: b */
    public final Object f46870b;

    public /* synthetic */ d9p(Object obj, int i) {
        this.f46869a = i;
        this.f46870b = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m35380a(Runnable runnable) {
        ((Handler) this.f46870b).removeCallbacks(runnable);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((re4) this.f46870b).m75378a();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f46869a) {
            case 0:
                f9p f9pVar = (f9p) this.f46870b;
                return ((hwk) f9pVar.f67319t.getValue()).mo48939a(((dwk) obj).mo30691a()).doOnNext(new g8f(f9pVar, 26)).doOnComplete(new s12(f9pVar, 16));
            case 15:
                mlr mlrVar = (mlr) this.f46870b;
                x0h1.m89578u(mlrVar.f144911d, null, 0, new fop(mlrVar, (qes0) obj, (fbk) null, 26), 3);
                return Observable.empty();
            case 18:
                vs31 vs31Var = (vs31) obj;
                YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder = vs31Var.f244335a;
                cse1 cse1Var = vs31Var.f244336b;
                tbs tbsVar = (tbs) this.f46870b;
                return tbsVar.f218942d.map(new xvo(yourLibraryConfig$YourLibrarySortOrder, 25)).switchMap(new bzo(tbsVar, 25)).takeUntil(v4g1.f237161X0).map(new g2q(11, tbsVar, cse1Var));
            case 19:
                return ((c0y) ((wos) this.f46870b).f253564a.f235651a.f246568h).m31199h((LoggingParams) obj).ignoreElement();
            case 22:
                String str = (String) obj;
                hy21 hy21Var = ((mdu) this.f46870b).f142499b;
                wj50.m88279p(str);
                return hy21Var.m49110d(str);
            default:
                hrw hrwVar = (hrw) this.f46870b;
                return hrwVar.m48413b(new xcw(6, ((d8p0) obj).f46493a, hrwVar)).flatMap(new arw(hrwVar, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.df5
    /* JADX INFO: renamed from: b */
    public Object mo35381b(ef5 ef5Var, ibk ibkVar) {
        bqw bqwVar;
        if (ibkVar instanceof bqw) {
            bqwVar = (bqw) ibkVar;
            int i = bqwVar.f29898c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bqwVar.f29898c = i - Integer.MIN_VALUE;
            } else {
                bqwVar = new bqw(this, ibkVar);
            }
        } else {
            bqwVar = new bqw(this, ibkVar);
        }
        Object objM79086r0 = bqwVar.f29896a;
        int i2 = bqwVar.f29898c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79086r0);
                sr6 sr6Var = (sr6) this.f46870b;
                vr6 vr6VarM3365q = AtvRemoteServiceOuterClass$AtvStartPairingRequest.m3365q();
                vr6VarM3365q.m86276q(ef5Var.f58950e);
                vr6VarM3365q.m86277r(ef5Var.f58949d);
                vr6VarM3365q.m86275m(ef5Var.f58946a);
                AtvRemoteServiceOuterClass$AtvStartPairingRequest atvRemoteServiceOuterClass$AtvStartPairingRequest = (AtvRemoteServiceOuterClass$AtvStartPairingRequest) vr6VarM3365q.build();
                bqwVar.f29898c = 1;
                objM79086r0 = sr6Var.m79086r0(atvRemoteServiceOuterClass$AtvStartPairingRequest, bqwVar);
                yuk yukVar = yuk.f276404a;
                if (objM79086r0 == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM79086r0);
            }
            AtvRemoteServiceOuterClass$AtvPairingResponse atvRemoteServiceOuterClass$AtvPairingResponse = (AtvRemoteServiceOuterClass$AtvPairingResponse) objM79086r0;
            if (atvRemoteServiceOuterClass$AtvPairingResponse.m3361p()) {
                return yf5.f272128a;
            }
            rf5 rf5VarM71754o = pzg1.m71754o(atvRemoteServiceOuterClass$AtvPairingResponse.m3359n());
            String strM3360o = atvRemoteServiceOuterClass$AtvPairingResponse.m3360o();
            if (wl51.m88460J0(strM3360o)) {
                strM3360o = null;
            }
            return new xf5(rf5VarM71754o, strM3360o, 4);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new xf5(rf5.f198524t, e2.getMessage(), e2);
        }
    }

    @Override // p204p.nsf0
    /* JADX INFO: renamed from: c */
    public void mo35382c(String str, String str2, d850 d850Var) {
        ((gh00) ((kqi0) this.f46870b).getValue()).invoke(new oxs(str, str2, d850Var));
    }

    /* JADX INFO: renamed from: d */
    public Parcelable m35383d() {
        Bundle bundle = ((m5w) this.f46870b).f140295b;
        if (bundle != null) {
            return bundle.getParcelable("extra_playback_state");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.df5
    /* JADX INFO: renamed from: e */
    public Object mo35384e(int i, fbk fbkVar) {
        cqw cqwVar;
        if (fbkVar instanceof cqw) {
            cqwVar = (cqw) fbkVar;
            int i2 = cqwVar.f41016c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cqwVar.f41016c = i2 - Integer.MIN_VALUE;
            } else {
                cqwVar = new cqw(this, (ibk) fbkVar);
            }
        } else {
            cqwVar = new cqw(this, (ibk) fbkVar);
        }
        Object objM79102z0 = cqwVar.f41014a;
        int i3 = cqwVar.f41016c;
        try {
            if (i3 == 0) {
                bga.m29073P(objM79102z0);
                sr6 sr6Var = (sr6) this.f46870b;
                wr6 wr6VarM3367o = AtvRemoteServiceOuterClass$AtvSubmitPinRequest.m3367o();
                wr6VarM3367o.m88804m(i);
                AtvRemoteServiceOuterClass$AtvSubmitPinRequest atvRemoteServiceOuterClass$AtvSubmitPinRequest = (AtvRemoteServiceOuterClass$AtvSubmitPinRequest) wr6VarM3367o.build();
                cqwVar.f41016c = 1;
                objM79102z0 = sr6Var.m79102z0(atvRemoteServiceOuterClass$AtvSubmitPinRequest, cqwVar);
                yuk yukVar = yuk.f276404a;
                if (objM79102z0 == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM79102z0);
            }
            AtvRemoteServiceOuterClass$AtvPairingResponse atvRemoteServiceOuterClass$AtvPairingResponse = (AtvRemoteServiceOuterClass$AtvPairingResponse) objM79102z0;
            if (atvRemoteServiceOuterClass$AtvPairingResponse.m3361p()) {
                return yf5.f272128a;
            }
            rf5 rf5VarM71754o = pzg1.m71754o(atvRemoteServiceOuterClass$AtvPairingResponse.m3359n());
            String strM3360o = atvRemoteServiceOuterClass$AtvPairingResponse.m3360o();
            if (wl51.m88460J0(strM3360o)) {
                strM3360o = null;
            }
            return new xf5(rf5VarM71754o, strM3360o, 4);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new xf5(rf5.f198524t, e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Enum m35385f(ibk ibkVar) {
        l2v l2vVar;
        if (ibkVar instanceof l2v) {
            l2vVar = (l2v) ibkVar;
            int i = l2vVar.f129084c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l2vVar.f129084c = i - Integer.MIN_VALUE;
            } else {
                l2vVar = new l2v(this, ibkVar);
            }
        } else {
            l2vVar = new l2v(this, ibkVar);
        }
        Object objM62841f = l2vVar.f129082a;
        int i2 = l2vVar.f129084c;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            wt80 wt80Var = (wt80) this.f46870b;
            st80 st80Var = new st80(null, null, null, false, null, c5u0.f34291a, null, 0, null, 479);
            l2vVar.f129084c = 1;
            objM62841f = ((mu80) wt80Var).m62841f("spotify:playlist:37i9dQZF1EYkqdzj48dyYq", st80Var, l2vVar);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62841f);
        }
        p2x0 p2x0Var = (p2x0) objM62841f;
        if (p2x0Var instanceof m2x0) {
            return k2v.f118690a;
        }
        if (p2x0Var instanceof k2x0) {
            return ((k2x0) p2x0Var).f118699a instanceof g2x0 ? k2v.f118691b : k2v.f118692c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public boolean m35386g() {
        return ((sq21) this.f46870b).m78932a();
    }

    /* JADX INFO: renamed from: h */
    public void m35387h(Runnable runnable, long j) {
        ((Handler) this.f46870b).postDelayed(runnable, j);
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        Exception excM65555t;
        mzx0 mzx0Var = (mzx0) this.f46870b;
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

    @Override // io.reactivex.rxjava3.core.FlowableOnSubscribe
    public void subscribe(FlowableEmitter flowableEmitter) {
        hc80 hc80Var = (hc80) this.f46870b;
        zrb zrbVar = new zrb(flowableEmitter, 2);
        if (!flowableEmitter.isCancelled()) {
            hc80Var.getLifecycle().mo31986a(zrbVar);
        }
        flowableEmitter.setCancellable(new gr5(4, hc80Var, zrbVar));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f46869a) {
            case 1:
                Long l = (Long) obj;
                iin iinVar = (iin) this.f46870b;
                TextView textView = (TextView) ((hol0) iinVar.f102607c).f93565e;
                wj50.m88279p(l);
                textView.setText(iin.m50736d(iinVar, R.plurals.minutes_label, l.longValue()));
                break;
            case 2:
                ((FrameLayout) ((qbp) this.f46870b).f187133c.f205043t).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                break;
            case 6:
                gcq0 gcq0Var = (gcq0) obj;
                qxo qxoVar = (qxo) this.f46870b;
                wj50.m88279p(gcq0Var);
                ((f9p) qxoVar.f193718d).m41074a(new bwk(gcq0Var.f78641a, gcq0Var.f78642b));
                break;
            case 7:
                myq0 myq0Var = (myq0) obj;
                zoh zohVar = ((g0q) this.f46870b).f75418c;
                wj50.m88279p(myq0Var);
                zohVar.mo2820d(myq0Var);
                break;
            case 11:
                adq adqVar = (adq) this.f46870b;
                kfj.m56294u(adqVar.f14658c, (String) obj, new r7q(adqVar, 6));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                tdq tdqVar = (tdq) this.f46870b;
                if (!zBooleanValue && tdqVar.f219457f) {
                    tdqVar.f219457f = false;
                    SelectionView selectionView = (SelectionView) tdqVar.f219454c.f225655i;
                    erg1.m39804w(selectionView, lkr.f134435a, tdqVar.f219458g, tdqVar.f219450Y, 1.0f, 0.0f, new rxn0(selectionView, pib1.f177889Q0, 1));
                    break;
                }
                break;
        }
    }

    public d9p(voi voiVar) {
        this.f46869a = 14;
        this.f46870b = k0e1.m54985d(((s5p) voiVar).m77297d().map(uwk.f234675W0));
    }

    public d9p(ymp ympVar) {
        this.f46869a = 4;
        this.f46870b = mvl0.m62953p(ympVar.f274320b);
    }

    public d9p() {
        this.f46869a = 8;
        this.f46870b = grl0.m45545r(Looper.getMainLooper());
    }
}
