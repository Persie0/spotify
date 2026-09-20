package p204p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.widget.ProgressBar;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Any;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artistandaddedbyname.ArtistAndAddedByNameView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.shuffle.ShuffleButtonView;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.prerelease.uiusecases.mutebutton.MuteButtonView;
import com.spotify.yourupdates.badgingstate.models.BadgingState;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ibp implements ant, Function, BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100613a;

    /* JADX INFO: renamed from: b */
    public Object f100614b;

    public /* synthetic */ ibp() {
        this.f100613a = 21;
    }

    /* JADX INFO: renamed from: a */
    public void m50189a(byte b) {
        ((Parcel) this.f100614b).writeByte(b);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return y1w.m92672a((y1w) ((rlv0) this.f100614b).f200373a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), null, 4);
    }

    /* JADX INFO: renamed from: b */
    public void m50190b(float f) {
        ((Parcel) this.f100614b).writeFloat(f);
    }

    /* JADX INFO: renamed from: c */
    public void m50191c(long j) {
        long jM307b = TextUnit.m307b(j);
        byte b = 0;
        if (!tf71.m80605a(jM307b, 0L)) {
            if (tf71.m80605a(jM307b, 4294967296L)) {
                b = 1;
            } else if (tf71.m80605a(jM307b, 8589934592L)) {
                b = 2;
            }
        }
        m50189a(b);
        if (tf71.m80605a(TextUnit.m307b(j), 0L)) {
            return;
        }
        m50190b(TextUnit.m308c(j));
    }

    /* JADX INFO: renamed from: d */
    public gh00 m50192d() {
        return (gh00) this.f100614b;
    }

    /* JADX INFO: renamed from: e */
    public Single m50193e(String str) {
        whp whpVar = (whp) this.f100614b;
        qzn qznVar = (qzn) whpVar.f251420c;
        drq drqVar = (drq) qznVar.f194229b;
        return q0f1.m71814A(drqVar.f52376a, new r7q(drqVar, 11)).map(o5h1.f161980S0).onErrorReturn(z9h1.f280787Q0).subscribeOn((Scheduler) qznVar.f194230c).flatMap(new nfp(whpVar, 10)).map(new u7q(3, this, str));
    }

    /* JADX INFO: renamed from: f */
    public void m50194f(Uri uri, boolean z) {
        k5k0 k5k0Var = ((gmh0) ((q07) this.f100614b)).f81407f;
        if (k5k0Var != null) {
            k5k0Var.m55450D0(new ugo0(uri, z));
        } else {
            wj50.m88260d0("playCommandHandler");
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m50195h() {
        k5k0 k5k0Var = ((gmh0) ((q07) this.f100614b)).f81407f;
        if (k5k0Var != null) {
            k5k0Var.m55450D0(xgo0.f261345a);
        } else {
            wj50.m88260d0("playCommandHandler");
            throw null;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        String strM43753y0;
        String string;
        switch (this.f100613a) {
            case 0:
                dlo0 dlo0Var = (dlo0) obj;
                qbp qbpVar = (qbp) this.f100614b;
                qbpVar.f187137g.setValue(dlo0Var);
                ((ComposeView) qbpVar.f187133c.f205035b).setVisibility(dlo0Var != dlo0.f50292c ? 0 : 8);
                return;
            case 2:
                ((ArtworkView) ((z9p) ((xzo) this.f100614b).f267728c).f280844c).mo2820d(new z66(new h66((String) obj), true));
                return;
            case 5:
                kcq0 kcq0Var = (kcq0) obj;
                qxo qxoVar = (qxo) this.f100614b;
                wj50.m88279p(kcq0Var);
                rk0 rk0Var = (rk0) qxoVar.f193717c;
                ((ArtworkView) rk0Var.f199940h).mo2820d(new l66(new h66(kcq0Var.f121535a, new a66(nap.m64021n((ConstraintLayout) rk0Var.f199934b, R.dimen.spacer_8))), true));
                ArtworkView artworkView = (ArtworkView) rk0Var.f199940h;
                artworkView.mo2821c(new jhp(qxoVar, 19));
                ((ArtworkShadow) rk0Var.f199938f).m9582c(artworkView, true);
                return;
            case 6:
                eyq0 eyq0Var = (eyq0) obj;
                g0q g0qVar = (g0q) this.f100614b;
                wj50.m88279p(eyq0Var);
                clq0 clq0Var = g0qVar.f75420e;
                MuteButtonView muteButtonView = g0qVar.f75422g;
                if (eyq0Var instanceof cyq0) {
                    String str = ((cyq0) eyq0Var).f43341a;
                    muteButtonView.setVisibility(8);
                    VideoSurfaceView videoSurfaceView = (VideoSurfaceView) clq0Var.f39345g;
                    ArtworkView artworkView2 = (ArtworkView) clq0Var.f39342d;
                    videoSurfaceView.setVisibility(8);
                    artworkView2.setVisibility(0);
                    artworkView2.mo2821c(new jhp(g0qVar, 20));
                    artworkView2.mo2820d(new l66(new h66(str, z56.f279483d), true));
                    return;
                }
                if (!(eyq0Var instanceof dyq0)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList = ((dyq0) eyq0Var).f54433a;
                if (arrayList.isEmpty()) {
                    return;
                }
                ArtworkView artworkView3 = (ArtworkView) clq0Var.f39342d;
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) clq0Var.f39345g;
                artworkView3.setVisibility(8);
                muteButtonView.setVisibility(0);
                fn20.m42208l(g0qVar.f75419d, g0qVar.f75424i);
                ((ProgressBar) clq0Var.f39346h).setVisibility(0);
                h4c1 h4c1Var = g0qVar.f75417b;
                String strM93802o = ((gyq0) arrayList.get(0)).f85689a;
                f0q f0qVar = g0qVar.f75415Z;
                Map map = null;
                if (f0qVar == null) {
                    wj50.m88260d0("playbackEventObserver");
                    throw null;
                }
                fyq0 fyq0Var = g0qVar.f75413X;
                if (fyq0Var == null) {
                    wj50.m88260d0("headerModel");
                    throw null;
                }
                boolean z = fyq0Var.f74822h.f72489a;
                hc80 hc80Var = h4c1Var.f87510c;
                if (strM93802o.length() == 0) {
                    pa9 pa9Var = h4c1Var.f87511d;
                    if (pa9Var != null) {
                        h4c1Var.f87508a.mo72486b(pa9Var);
                        pa9Var.m69444i();
                    }
                    h4c1Var.f87511d = null;
                    hc80Var.getLifecycle().mo31988d(h4c1Var);
                } else {
                    pa9 pa9Var2 = h4c1Var.f87511d;
                    if (pa9Var2 != null) {
                        pa9Var2.m69449o(z);
                        pa9Var2.m69447l();
                    } else {
                        if (!Uri.parse(strM93802o).isAbsolute()) {
                            strM93802o = yif1.m93802o(strM93802o);
                        }
                        l1p0 l1p0Var = new l1p0(strM93802o, 12, map);
                        videoSurfaceView2.setScaleType(mac1.ASPECT_FILL);
                        videoSurfaceView2.setVideoSurfaceCallback(new po11(h4c1Var, 26));
                        pa9 pa9VarM46634a = h4c1Var.m46634a(videoSurfaceView2, f0qVar, l1p0Var);
                        pa9VarM46634a.m69449o(z);
                        pa9VarM46634a.m69451q(true);
                        pa9VarM46634a.m69442g(l1p0Var);
                        h4c1Var.f87511d = pa9VarM46634a;
                        h4c1Var.f87513f = l1p0Var;
                        h4c1Var.f87512e = f0qVar;
                        h4c1Var.f87514g = videoSurfaceView2;
                        h4c1Var.f87515h = Boolean.valueOf(z);
                        hc80Var.getLifecycle().mo31986a(h4c1Var);
                    }
                }
                Context context = g0qVar.f75416a;
                fyq0 fyq0Var2 = g0qVar.f75413X;
                if (fyq0Var2 == null) {
                    wj50.m88260d0("headerModel");
                    throw null;
                }
                String str2 = fyq0Var2.f74816b;
                ArrayList arrayList2 = fyq0Var2.f74817c.f123627a;
                if (arrayList2 == null || (strM43753y0 = g6f.m43753y0(arrayList2, null, null, null, upp.f232754V0, 31)) == null) {
                    strM43753y0 = "";
                }
                videoSurfaceView2.setContentDescription(context.getString(R.string.prerelease_video_header_content_description, str2, strM43753y0));
                mec1.m61564p(videoSurfaceView2, new C2569xe(g0qVar, 5));
                return;
            case 10:
                nf81 nf81Var = (nf81) obj;
                adq adqVar = (adq) this.f100614b;
                wj50.m88279p(nf81Var);
                String str3 = adqVar.f14665t;
                jeo0 jeo0Var = nf81Var.f153291g;
                boolean z2 = ((ggo0) jeo0Var.f111636b).f79709a;
                e60 e60Var = adqVar.f14659d;
                ((ShuffleButtonView) e60Var.f56512i).setVisibility(0);
                ShuffleButtonView shuffleButtonView = (ShuffleButtonView) e60Var.f56512i;
                shuffleButtonView.setImageDrawable(z2 ? shuffleButtonView.f3749d : shuffleButtonView.f3750e);
                if (z2) {
                    string = str3 != null ? shuffleButtonView.getContext().getString(R.string.shuffle_button_disabled_content_description_with_context, str3) : shuffleButtonView.getContext().getString(R.string.shuffle_button_disabled_content_description);
                } else {
                    string = str3 != null ? shuffleButtonView.getContext().getString(R.string.shuffle_button_enabled_content_description_with_context, str3) : shuffleButtonView.getContext().getString(R.string.shuffle_button_enabled_content_description);
                }
                shuffleButtonView.setContentDescription(string);
                adqVar.f14660e.mo2820d(jeo0.m53106c(jeo0.m53106c(jeo0Var, new ggo0(false, false), null, 5), null, str3, 3));
                return;
            case 11:
                ArtistAndAddedByNameView artistAndAddedByNameView = (ArtistAndAddedByNameView) ((tdq) this.f100614b).f219454c.f225656t;
                artistAndAddedByNameView.setText(vkf1.m85873s(artistAndAddedByNameView.getResources(), Collections.singletonList((String) obj)));
                return;
            default:
                z3x z3xVar = (z3x) obj;
                s8p s8pVar = (s8p) this.f100614b;
                AddToButtonView addToButtonView = (AddToButtonView) ((sdo) s8pVar.f206698f).f208051e;
                if (!(((x3x) s8pVar.f206696d) instanceof w3x)) {
                    addToButtonView.setVisibility(8);
                    return;
                }
                boolean z3 = false;
                addToButtonView.setVisibility(0);
                if (((z3x) s8pVar.f206699g) != null) {
                    z3 = !(z3xVar != null);
                }
                addToButtonView.mo2820d(new pi1(qi1.f188892a, z3, null, null, null, 28));
                return;
        }
    }

    public /* synthetic */ ibp(Object obj, int i) {
        this.f100613a = i;
        this.f100614b = obj;
    }

    public ibp(Observable observable) {
        this.f100613a = 29;
        this.f100614b = observable.distinctUntilChanged().map(m1y.f139152b);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        m340 m340Var;
        z240 z240VarM60640a;
        Mdata$LocalBatchedExtensionResponse.ExtensionHeader extensionHeaderM97631p;
        Mdata$LocalBatchedExtensionResponse.ExtensionHeader extensionHeaderM97631p2;
        byte[] bArrM45891s;
        gva gvaVarM1913r;
        ae50 ae50VarM97632n;
        switch (this.f100613a) {
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    Observable observableJust = Observable.just(BadgingState.HIDE_BADGE);
                    wj50.m88279p(observableJust);
                    return observableJust;
                }
                return ((gve1) ((xjp) this.f100614b).f262184c).f84740b.hide();
            case 8:
                wb31 wb31Var = (wb31) this.f100614b;
                erc1 erc1Var = (erc1) ((gqx) obj).mo45449a(erc1.class, wb31Var.f249684a).f72301b;
                return new xb31((erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11860a)) == null) ? null : z240VarM60640a.f278475a.f198763a, wb31Var.f249686c);
            case 12:
                return new gg3(((Boolean) obj).booleanValue() ? (String) ((C2445u9) this.f100614b).f228049b : null);
            case 18:
                return ((c0y) ((wos) this.f100614b).f253564a.f235651a.f246568h).m31198g((xul0) obj, true).ignoreElement();
            case 19:
                r0c1 r0c1Var = (r0c1) this.f100614b;
                wj50.m88279p(obj);
                return (CompletableSource) r0c1Var.invoke(obj);
            case 20:
                return new bvy(new l2u(((n0u) this.f100614b).f149169a, null));
            case 22:
                ContextTrack contextTrack = (ContextTrack) obj;
                tsb tsbVar = (tsb) this.f100614b;
                if (hc1.m47085n(contextTrack, false)) {
                    return Flowable.m23313I(Boolean.TRUE);
                }
                return k0e1.m54986e(tsbVar.mo24819a(contextTrack), dau.f47107a);
            case 23:
                yk91 yk91Var = (yk91) obj;
                ntv ntvVar = (ntv) this.f100614b;
                String str = (String) yk91Var.f273650a;
                boolean zBooleanValue = ((Boolean) yk91Var.f273651b).booleanValue();
                if (!((Boolean) yk91Var.f273652c).booleanValue() && (zBooleanValue || ((wi4) ntvVar.f158160i).m88185a())) {
                    Flowable flowable = vjf1.m85770t((luk) ntvVar.f158159h, new lzr(ntvVar, str, (fbk) null, 24)).toFlowable();
                    wj50.m88279p(flowable);
                    return flowable;
                }
                return Flowable.m23313I(itv.f105761a);
            case 25:
                rqw rqwVar = (rqw) this.f100614b;
                Mdata$LocalBatchedExtensionResponse.Extension extension = (Mdata$LocalBatchedExtensionResponse.Extension) g6f.m43745s0(((Mdata$LocalBatchedExtensionResponse) obj).getExtensionList());
                Mdata$LocalBatchedExtensionResponse.EntityExtension entityExtension = (extension == null || (ae50VarM97632n = extension.m97632n()) == null) ? null : (Mdata$LocalBatchedExtensionResponse.EntityExtension) g6f.m43745s0(ae50VarM97632n);
                if (entityExtension != null && (extensionHeaderM97631p2 = entityExtension.m97631p()) != null && extensionHeaderM97631p2.getStatusCode() == 200) {
                    int number = ntx.LIVESTREAM_ENTITY.getNumber();
                    Any anyM97630o = entityExtension.m97630o();
                    if (anyM97630o == null || (gvaVarM1913r = anyM97630o.m1913r()) == null || (bArrM45891s = gvaVarM1913r.m45891s()) == null) {
                        bArrM45891s = new byte[0];
                    }
                    ss90 ss90Var = (ss90) rqwVar.f201900b.m91727a(Collections.singletonList(new ptx(bArrM45891s, number))).mo30169a(ss90.class);
                    return ss90Var == null ? new ss90(null, new os90(200, null)) : ss90Var;
                }
                return new ss90(null, new os90((entityExtension == null || (extensionHeaderM97631p = entityExtension.m97631p()) == null) ? null : Integer.valueOf(extensionHeaderM97631p.getStatusCode()), null));
            default:
                return new pqm0((fxx) obj, Boolean.valueOf(((roa) this.f100614b).f201205h));
        }
    }

    public ibp(ine1 ine1Var, jzj jzjVar) {
        this.f100613a = 14;
        tnk0 tnk0Var = tnk0.f221995a;
        this.f100614b = new cdn(ine1Var, jzjVar);
        tnk0Var.mo75864e("device.cpu_time", ucf0.f229029a, new k9r(this, 0));
        tnk0Var.mo75864e("device.battery_level", tcf0.f219080a, new k9r(this, 1));
    }
}
