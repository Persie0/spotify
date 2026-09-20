package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconVideo;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.music.R;
import com.spotify.musicvideos.musicvideowidget.proto.p114v1.TrackRequest;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class oge0 implements Function, rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165106a;

    /* JADX INFO: renamed from: b */
    public final Object f165107b;

    /* JADX INFO: renamed from: c */
    public Object f165108c;

    /* JADX INFO: renamed from: d */
    public Object f165109d;

    public /* synthetic */ oge0(Object obj, Object obj2, Object obj3, int i) {
        this.f165106a = i;
        this.f165107b = obj;
        this.f165108c = obj2;
        this.f165109d = obj3;
    }

    /* JADX INFO: renamed from: a */
    public static final void m66878a(oge0 oge0Var) {
        for (Map.Entry entry : ((LinkedHashMap) oge0Var.f165108c).entrySet()) {
            String str = (String) entry.getKey();
            if (((Boolean) ((eh00) entry.getValue()).invoke()).booleanValue()) {
                ((CompositeDisposable) oge0Var.f165109d).mo23393b(((rmx) oge0Var.f165107b).m75982a(str).m23299p(Functions.f7232h).subscribe());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ CompositeDisposable m66879b(oge0 oge0Var) {
        return (CompositeDisposable) oge0Var.f165109d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m66880c(oge0 oge0Var, List list, ibk ibkVar) {
        b4l0 b4l0Var;
        if (ibkVar instanceof b4l0) {
            b4l0Var = (b4l0) ibkVar;
            int i = b4l0Var.f23386c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b4l0Var.f23386c = i - Integer.MIN_VALUE;
            } else {
                b4l0Var = new b4l0(oge0Var, ibkVar);
            }
        } else {
            b4l0Var = new b4l0(oge0Var, ibkVar);
        }
        Object objM86756u = b4l0Var.f23384a;
        int i2 = b4l0Var.f23386c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86756u);
                yab yabVarM54985d = k0e1.m54985d(((jpx) ((epx) oge0Var.f165108c)).m53978b(new C1668ai("download-offline-removal-gate", false, (gh00) new C2602y6(27, list))));
                nx70 nx70Var = new nx70(2, 27, fbkVar);
                b4l0Var.f23386c = 1;
                objM86756u = vyf1.m86756u(yabVarM54985d, nx70Var, b4l0Var);
                yuk yukVar = yuk.f276404a;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86756u);
            }
            return (gqx) objM86756u;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static okj0 m66881j(oge0 oge0Var, FlowableDistinctUntilChanged flowableDistinctUntilChanged) {
        return new okj0(flowableDistinctUntilChanged, Flowable.m23313I(Boolean.FALSE), (FlowableMap) oge0Var.f165107b, (Scheduler) oge0Var.f165108c, (ti4) oge0Var.f165109d);
    }

    /* JADX INFO: renamed from: m */
    public static oge0 m66882m(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.musicvideo_row_label_layout, (ViewGroup) null, false);
        int i = R.id.icon_video;
        if (((IconVideo) vie1.m85629k(viewInflate, R.id.icon_video)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewInflate, R.id.video_label);
            if (encoreTextView != null) {
                return new oge0(constraintLayout, constraintLayout, encoreTextView, 8);
            }
            i = R.id.video_label;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Map linkedHashMap;
        String strUid;
        switch (this.f165106a) {
            case 1:
                ft40 ft40Var = (ft40) obj;
                ovf ovfVar = (ovf) this.f165107b;
                if (ft40Var instanceof et40) {
                    ((ViewGroup) ovfVar.getView()).removeAllViews();
                    ((ViewGroup) ovfVar.getView()).addView(((bt40) ((et40) ft40Var).f62616a.m27115d()).f30510b, new ViewGroup.LayoutParams(-1, -2));
                } else if (ft40Var instanceof dt40) {
                    DismissReason dismissReason = ((dt40) ft40Var).f52725a;
                    koe0 koe0Var = (koe0) this.f165108c;
                    moe0 moe0Var = (moe0) this.f165109d;
                    mr40.m62618a(dismissReason, new ioe0(koe0Var, moe0Var), new joe0(koe0Var, moe0Var));
                }
                return w2a1.f247311a;
            case 2:
                hpx hpxVar = (hpx) obj;
                t6f0 t6f0Var = (t6f0) this.f165107b;
                Map map = hpxVar.f93852a;
                List<fpx> list = (List) map.get(d73.class);
                Map linkedHashMap2 = nau.f152117a;
                if (list != null) {
                    int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM31820L);
                    for (fpx fpxVar : list) {
                        String str = fpxVar.f72009a;
                        ktx ktxVar = fpxVar.f72010b;
                        if (ktxVar == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.albumv4.AlbumV4");
                        }
                        linkedHashMap.put(str, (d73) ktxVar);
                    }
                } else {
                    linkedHashMap = linkedHashMap2;
                }
                List<fpx> list2 = (List) map.get(ks81.class);
                if (list2 != null) {
                    int iM31820L2 = c95.m31820L(i6f.m49804T(list2, 10));
                    linkedHashMap2 = new LinkedHashMap(iM31820L2 >= 16 ? iM31820L2 : 16);
                    for (fpx fpxVar2 : list2) {
                        String str2 = fpxVar2.f72009a;
                        ktx ktxVar2 = fpxVar2.f72010b;
                        if (ktxVar2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.trackv4.TrackV4");
                        }
                        linkedHashMap2.put(str2, (ks81) ktxVar2);
                    }
                }
                Single singleSingleOrError = ((rwx0) t6f0Var.f217546b).m76591b("audio-preview-url-template").take(1L).singleOrError();
                xr9 xr9Var = t6f0Var.f217547c;
                ArrayList arrayListM43700N0 = g6f.m43700N0((ArrayList) this.f165109d, (ArrayList) this.f165108c);
                Collection collectionValues = linkedHashMap2.values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((ks81) it.next()).f125875g, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ds81) it2.next()).f52519a);
                }
                ArrayList arrayListM43700N1 = g6f.m43700N0(arrayList2, arrayListM43700N0);
                Collection collectionValues2 = linkedHashMap.values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = collectionValues2.iterator();
                while (it3.hasNext()) {
                    j6f.m52564V(((d73) it3.next()).f45974d, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((a73) it4.next()).f12931a);
                }
                return Single.zip(singleSingleOrError, xr9Var.m91918a(g6f.m43700N0(arrayList4, arrayListM43700N1)).firstOrError(), new mj70(hpxVar, 21));
            default:
                ContextTrack contextTrack = (ContextTrack) this.f165108c;
                if (!((yli0) obj).f274032a) {
                    MaybeEmpty maybeEmpty = MaybeEmpty.f8264a;
                    wj50.m88279p(maybeEmpty);
                    return maybeEmpty;
                }
                etz etzVar = (etz) this.f165107b;
                String strUri = contextTrack.uri();
                String str3 = "";
                if (strUri == null) {
                    strUri = "";
                }
                String strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_ARTIST_URI);
                if (strM38000d0 == null) {
                    strM38000d0 = "";
                }
                String str4 = (String) contextTrack.metadata().get("media.type");
                ContextTrack contextTrack2 = wj50.m88271j(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "video") ? contextTrack : null;
                if (contextTrack2 != null && (strUid = contextTrack2.uid()) != null) {
                    str3 = strUid;
                }
                boolean z = ((boi0) this.f165109d).f29186b;
                boolean zM37994a0 = e72.m37994a0(contextTrack);
                lmi0 lmi0Var = (lmi0) etzVar.f62823b;
                cn81 cn81VarM15961r = TrackRequest.m15961r();
                cn81VarM15961r.m33446r(strUri);
                cn81VarM15961r.m33444m(strM38000d0);
                cn81VarM15961r.m33447s(str3);
                cn81VarM15961r.m33445q(z);
                return lmi0Var.m59456a((TrackRequest) cn81VarM15961r.build()).flatMapMaybe(new fmd0(zM37994a0, strUri, etzVar, 4));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m66883d(sn20 sn20Var, euw0 euw0Var) {
        if (sn20Var.m78534b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (sn20Var.m78534b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        m66884e(new jai0(sn20Var, euw0Var));
    }

    /* JADX INFO: renamed from: e */
    public void m66884e(jai0 jai0Var) {
        ((ArrayList) this.f165109d).add(jai0Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.h2g0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: f */
    public Object m66885f(cws cwsVar, ibk ibkVar) {
        x1g0 x1g0Var;
        Object objM49274b;
        blw0 blw0Var;
        Object objM46492c;
        ?? r9;
        String str = (String) this.f165107b;
        if (ibkVar instanceof x1g0) {
            x1g0Var = (x1g0) ibkVar;
            int i = x1g0Var.f257192f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x1g0Var.f257192f = i - Integer.MIN_VALUE;
            } else {
                x1g0Var = new x1g0(this, ibkVar);
            }
        } else {
            x1g0Var = new x1g0(this, ibkVar);
        }
        x1g0 x1g0Var2 = x1g0Var;
        Object obj = x1g0Var2.f257190d;
        int i2 = x1g0Var2.f257192f;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                cwsVar = x1g0Var2.f257187a;
                bga.m29073P(obj);
                objM49274b = ((s6x0) obj).f206218a;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = x1g0Var2.f257189c;
                blw0Var = x1g0Var2.f257188b;
                bga.m29073P(obj);
                objM46492c = ((s6x0) obj).f206218a;
                r9 = list;
            }
            if (s6x0.m77348a(objM46492c) == null) {
                bd20 bd20Var = (bd20) objM46492c;
                return new nxs(bd20Var.f25980b, r9, bd20Var.f25979a, blw0Var);
            }
            return ixs.f106755a;
        }
        bga.m29073P(obj);
        List list2 = cwsVar.f42805b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof apq) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((apq) it.next()).f17996a, arrayList2);
        }
        hzf0 hzf0Var = (hzf0) this.f165109d;
        x1g0Var2.f257187a = cwsVar;
        x1g0Var2.f257192f = 1;
        objM49274b = hzf0Var.m49274b(str, arrayList2, x1g0Var2);
        if (objM49274b != yukVar) {
        }
        return yukVar;
        if (s6x0.m77348a(objM49274b) == null) {
            blw0Var = (blw0) objM49274b;
            ArrayList arrayListM37365J = dyu.m37365J(cwsVar.f42805b, cwsVar.f42804a);
            ?? r4 = cwsVar.f42806c ? blw0Var.f28298b : lau.f131415a;
            d2g0 d2g0Var = (d2g0) this.f165108c;
            ArrayList arrayList3 = blw0Var.f28297a;
            x1g0Var2.f257187a = null;
            x1g0Var2.f257188b = blw0Var;
            x1g0Var2.f257189c = (List) r4;
            x1g0Var2.f257192f = 2;
            objM46492c = ((h2g0) d2g0Var).m46492c(str, arrayList3, r4, arrayListM37365J, x1g0Var2);
            if (objM46492c != yukVar) {
                r9 = r4;
                if (s6x0.m77348a(objM46492c) == null) {
                    bd20 bd20Var2 = (bd20) objM46492c;
                    return new nxs(bd20Var2.f25980b, r9, bd20Var2.f25979a, blw0Var);
                }
            }
            return yukVar;
        }
        return ixs.f106755a;
    }

    /* JADX INFO: renamed from: g */
    public kai0 m66886g() {
        ArrayList arrayList = (ArrayList) this.f165109d;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new kai0((iva) this.f165107b, (ayd0) this.f165108c, c0f1.m31139j(arrayList));
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f165106a) {
            case 8:
                break;
        }
        return (ConstraintLayout) this.f165107b;
    }

    /* JADX INFO: renamed from: h */
    public f5k m66887h(cqj0 cqj0Var) {
        return new f5k("explicit_feedback_not_interested", (wwu) yvu.f276748c, (c5k) null, Integer.valueOf(R.string.home_feedback_context_menu_not_interested), (String) null, false, (p221) null, new e5k(new v4k(3), 2, new d5k(zpj0.f285159b, new aqj0(cqj0Var, 0)), new sxh0(16, cqj0Var, this)), 244);
    }

    /* JADX INFO: renamed from: i */
    public hbk0 m66888i(List list, t9p0 t9p0Var, gh00 gh00Var) {
        return new hbk0((Map) this.f165107b, list, t9p0Var, gh00Var, (mbk0) this.f165108c, (wb4) this.f165109d);
    }

    /* JADX INFO: renamed from: k */
    public Object m66889k(String str, w3s w3sVar) {
        return x0h1.m89557A((luk) this.f165109d, new rpk0(this, str, (fbk) null, 1), w3sVar);
    }

    /* JADX INFO: renamed from: l */
    public mft0 m66890l() {
        hv31 hv31Var = ((wlk0) this.f165108c).f252573a;
        if (((l3d0) this.f165107b).m57999d((Context) this.f165109d)) {
            return mft0.f143185e;
        }
        if (!hv31Var.mo48713h(wlk0.f252571b, false)) {
            int iMo48717l = hv31Var.mo48717l(wlk0.f252572c, 0);
            if (iMo48717l == 0) {
                return mft0.f143182b;
            }
            if (iMo48717l == 1) {
                return mft0.f143183c;
            }
            if (iMo48717l == 2) {
                return mft0.f143184d;
            }
        }
        return mft0.f143181a;
    }

    /* JADX INFO: renamed from: n */
    public void m66891n(c7x0 c7x0Var) {
        ((b8x0) this.f165108c).m28439b((String) this.f165109d, c7x0Var, new e3a1());
        ((vh50) this.f165107b).pop();
    }

    /* JADX INFO: renamed from: o */
    public void m66892o(String str, eh00 eh00Var) {
        ((LinkedHashMap) this.f165108c).put(str, eh00Var);
    }

    /* JADX INFO: renamed from: p */
    public void m66893p(ayd0 ayd0Var) {
        if (ayd0Var.f21212b.equals("multipart")) {
            this.f165108c = ayd0Var;
        } else {
            throw new IllegalArgumentException(("multipart != " + ayd0Var).toString());
        }
    }

    public String toString() {
        switch (this.f165106a) {
            case 9:
                String str = (String) this.f165109d;
                String str2 = (String) this.f165108c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f165107b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public oge0(kv91 kv91Var, hge0 hge0Var) {
        this.f165106a = 0;
        this.f165107b = kv91Var;
        this.f165108c = hge0Var;
        this.f165109d = new wg61(new uqd0(this, 12));
    }

    public oge0(rmx rmxVar, hc80 hc80Var) {
        this.f165106a = 27;
        this.f165107b = rmxVar;
        this.f165108c = new LinkedHashMap();
        this.f165109d = new CompositeDisposable();
        hc80Var.getLifecycle().mo31986a(new c9m0(this));
    }

    public oge0(Flowable flowable, qwx0 qwx0Var, List list) {
        this.f165106a = 16;
        this.f165107b = list;
        this.f165108c = flowable.m23360y(qby.f187189R0);
        this.f165109d = ((rwx0) qwx0Var).f203428a.distinctUntilChanged((BiPredicate) new fbk0(this, 1)).toFlowable(BackpressureStrategy.f7190d);
    }

    public oge0(wrf0 wrf0Var, kq80 kq80Var, z6g0 z6g0Var, luk lukVar) {
        this.f165106a = 3;
        this.f165107b = kq80Var;
        this.f165108c = z6g0Var;
        this.f165109d = lukVar;
    }

    public oge0(pgo pgoVar, pul pulVar) {
        this.f165106a = 18;
        this.f165107b = pgoVar;
        this.f165108c = pulVar;
        this.f165109d = pag1.m69487w(new rko(wyx.f256380X, 1, uok0.f232476d, new pko(uok0.f232472b), uok0.f232477e), uok0.f232474c);
    }

    public oge0(i2l0 i2l0Var, tm4 tm4Var, x74 x74Var, xr9 xr9Var, tpy0 tpy0Var) {
        this.f165106a = 19;
        this.f165107b = i2l0Var;
        this.f165108c = xr9Var;
        this.f165109d = tpy0Var;
    }

    public oge0(iyq iyqVar, fus0 fus0Var) {
        this.f165106a = 26;
        this.f165107b = iyqVar;
        this.f165108c = fus0Var;
        this.f165109d = new ConcurrentHashMap();
    }

    public oge0(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.f165106a = 17;
        this.f165107b = constraintLayout;
        this.f165108c = constraintLayout2;
        this.f165109d = textView;
    }

    public oge0(Intent intent) {
        this.f165106a = 9;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f165107b = data;
        this.f165108c = action;
        this.f165109d = type;
    }

    public oge0(Scheduler scheduler, dwp dwpVar, u7q u7qVar) {
        this.f165106a = 23;
        this.f165107b = dwpVar;
        this.f165108c = new lwr();
    }

    public oge0() {
        this.f165106a = 6;
        String string = UUID.randomUUID().toString();
        iva ivaVar = new iva(string.getBytes(vuc.f244913a));
        ivaVar.f106180c = string;
        this.f165107b = ivaVar;
        this.f165108c = kai0.f120908f;
        this.f165109d = new ArrayList();
    }
}
