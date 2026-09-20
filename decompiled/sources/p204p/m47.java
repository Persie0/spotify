package p204p;

import android.content.Context;
import android.media.AudioRecord;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.addonconsideration.p011v1.BulletedListItem;
import com.spotify.addonconsideration.p011v1.EmphasizedIconListItem;
import com.spotify.addonconsideration.p011v1.GetAddonConsiderationRequest;
import com.spotify.addonconsideration.p011v1.GetAddonConsiderationResponse;
import com.spotify.addonconsideration.p011v1.ShowcaseDescriptionList;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFilter;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;
import spotify.your_library.esperanto.proto.IsCuratedRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class m47 implements i47, Function4, rdc1, Function, uh9, InterfaceC2207oa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139855a;

    /* JADX INFO: renamed from: b */
    public Object f139856b;

    /* JADX INFO: renamed from: c */
    public Object f139857c;

    public /* synthetic */ m47() {
        this.f139855a = 8;
    }

    /* JADX INFO: renamed from: v */
    public static fv31 m60764v(fhb fhbVar) {
        return fv31.f73628b.m78181M(edb.m38566o("live-events-campaign-collapsed:", fhbVar.f69617a, "|", fhbVar.f69618b));
    }

    /* JADX INFO: renamed from: A */
    public void m60765A(long j, ab9 ab9Var) {
        pa9 pa9Var = (pa9) this.f139856b;
        if ((pa9Var == null || pa9Var.f175451q == null) && pa9Var != null) {
            et81 et81Var = new et81(ab9Var.f14044a);
            et81Var.m39932a(Long.valueOf(j));
            pa9Var.m69453s(et81Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m60766B(r4c1 r4c1Var) {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            yqg1.m94368f(r4c1Var, pa9Var);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m60767C(float f) {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            pa9Var.f175447m = f;
            d2p0 d2p0Var = pa9Var.f175440f;
            if (d2p0Var != null) {
                d2p0Var.m34748N0(f);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m60768D(fv51 fv51Var) {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            pa9Var.f175448n = fv51Var;
            d2p0 d2p0Var = pa9Var.f175440f;
            if (d2p0Var != null) {
                d2p0Var.m34750P0(fv51Var);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m60769E(boolean z) {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            pa9Var.m69454t(z);
        }
    }

    /* JADX INFO: renamed from: F */
    public Single m60770F(Context context, vq7 vq7Var, String str) {
        return Single.just(vq7Var).observeOn((Scheduler) this.f139857c).flatMap(new w0e1(this, str, context, vq7Var, 15)).onErrorReturn(new brl0(vq7Var, 29));
    }

    /* JADX INFO: renamed from: G */
    public void m60771G() {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            pa9Var.m69455u();
        }
        this.f139857c = null;
    }

    @Override // p204p.i47
    /* JADX INFO: renamed from: a */
    public int mo49656a() {
        return ((AudioRecord) this.f139856b).getSampleRate();
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        ihi ihiVar = (ihi) obj;
        if (!((vd4) this.f139856b).m85208a()) {
            return false;
        }
        ure ureVar = (ure) this.f139857c;
        String str = ihiVar.f102294a;
        ureVar.getClass();
        return str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f139855a) {
            case 12:
                Logger.m3967c((Throwable) obj, "Assisted Curation: Failed to expand item for Bridge Tracks", new Object[0]);
                yja yjaVar = (yja) this.f139856b;
                AbstractC1961i abstractC1961i = (AbstractC1961i) this.f139857c;
                ixz0 ixz0Var = yjaVar.f273334a;
                return new yja(ixz0.m51873j(ixz0Var, ixz0Var.f106805a.m95184l(abstractC1961i, lau.f131415a, false)), yjaVar.f273335b, yjaVar.f273336c);
            case 18:
                evb evbVar = (evb) obj;
                rvb rvbVar = (rvb) this.f139856b;
                return rvbVar.f203038f.m57502a(evbVar.f63198a).m23292c(new CompletableFromAction(new ue0(rvbVar, evbVar, (kvb) this.f139857c, 4)));
            case 20:
                dwj0 dwj0Var = (dwj0) this.f139856b;
                return ((rwx0) dwj0Var.f53717b).m76590a("notification-locale", "").map(a0y.f11187Q0).subscribeOn((Scheduler) this.f139857c).switchMap(new jsa(dwj0Var, 6)).doOnError(af8.f15070X).onErrorReturnItem(rcc.f197843a);
            case 27:
                Map map = (Map) obj;
                x5f x5fVar = (x5f) this.f139857c;
                v5f v5fVar = (v5f) this.f139856b;
                List<String> list = v5fVar.f237475b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (String str : list) {
                    String str2 = (String) map.get(str);
                    if (str2 != null) {
                        str = str2;
                    }
                    arrayList.add(str);
                }
                tre1 tre1Var = x5fVar.f258401b;
                String str3 = v5fVar.f237474a;
                boolean z = v5fVar.f237476c;
                mo50 mo50VarM98125r = IsCuratedRequest.m98125r();
                mo50VarM98125r.m62387m(arrayList);
                mo50VarM98125r.m62389r(str3);
                mo50VarM98125r.m62390s(z ? no50.IN_CONTEXT : no50.NONE);
                return tre1Var.m81349d((IsCuratedRequest) mo50VarM98125r.build()).map(new fw7(x5fVar, v5fVar, map));
            case 28:
                String str4 = (String) obj;
                chf chfVar = (chf) this.f139856b;
                LinkedHashMap linkedHashMap = chfVar.f38004g;
                String str5 = (String) this.f139857c;
                Object publishSubject = linkedHashMap.get(str5);
                if (publishSubject == null) {
                    publishSubject = new PublishSubject();
                    linkedHashMap.put(str5, publishSubject);
                }
                return ((PublishSubject) publishSubject).startWithItem(new zgf(0L, false)).switchMapSingle(new cxb(chfVar, str4, str5, 17)).subscribeOn(chfVar.f37998a);
            default:
                cxb cxbVar = (cxb) this.f139856b;
                return new MaybeFilter(n0e1.m63407O((luk) cxbVar.f42974d, new wbe(cxbVar, (String) this.f139857c, (fbk) null, 12)), uwk.f234667O0);
        }
    }

    @Override // p204p.i47
    /* JADX INFO: renamed from: b */
    public int mo49657b(ByteBuffer byteBuffer, int i) {
        return ((AudioRecord) this.f139856b).read(byteBuffer, i);
    }

    @Override // p204p.i47
    /* JADX INFO: renamed from: c */
    public void mo49658c(az1 az1Var) {
        l47 l47Var = new l47(az1Var);
        ((ConcurrentHashMap) this.f139857c).put(az1Var, l47Var);
        ((AudioRecord) this.f139856b).addOnRoutingChangedListener((AudioRecord.OnRoutingChangedListener) l47Var, (Handler) null);
    }

    @Override // p204p.i47
    /* JADX INFO: renamed from: d */
    public int mo49659d() {
        return ((AudioRecord) this.f139856b).getRecordingState();
    }

    @Override // p204p.uh9
    /* JADX INFO: renamed from: e */
    public boolean mo60772e(String str) {
        return ((uh9) this.f139856b).mo60772e(str);
    }

    @Override // p204p.i47
    /* JADX INFO: renamed from: f */
    public void mo49660f(az1 az1Var) {
        ((AudioRecord) this.f139856b).removeOnRoutingChangedListener((AudioRecord.OnRoutingChangedListener) ((ConcurrentHashMap) this.f139857c).remove(az1Var));
    }

    @Override // p204p.uh9
    /* JADX INFO: renamed from: g */
    public u790 mo60773g(phd0 phd0Var) {
        Uri uri;
        byte[] bArr;
        c06 c06Var = (c06) this.f139857c;
        if (c06Var != null && (((uri = (Uri) c06Var.f32695c) != null && uri.equals(phd0Var.f177620n)) || ((bArr = (byte[]) c06Var.f32694b) != null && Arrays.equals(bArr, phd0Var.f177617k)))) {
            u790 u790Var = (u790) ((c06) this.f139857c).f32696d;
            u790Var.getClass();
            return u790Var;
        }
        u790 u790VarMo60773g = ((uh9) this.f139856b).mo60773g(phd0Var);
        if (u790VarMo60773g == null) {
            return null;
        }
        this.f139857c = new c06(phd0Var, u790VarMo60773g);
        return u790VarMo60773g;
    }

    @Override // p204p.i47
    public int getAudioSessionId() {
        return ((AudioRecord) this.f139856b).getAudioSessionId();
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (RecyclerView) this.f139856b;
    }

    @Override // p204p.i47
    public int getState() {
        return ((AudioRecord) this.f139856b).getState();
    }

    @Override // p204p.uh9
    /* JADX INFO: renamed from: h */
    public u790 mo60774h(Uri uri) {
        Uri uri2;
        c06 c06Var = (c06) this.f139857c;
        if (c06Var == null || (uri2 = (Uri) c06Var.f32695c) == null || !uri2.equals(uri)) {
            u790 u790VarMo60774h = ((uh9) this.f139856b).mo60774h(uri);
            this.f139857c = new c06(uri, u790VarMo60774h);
            return u790VarMo60774h;
        }
        u790 u790Var = (u790) ((c06) this.f139857c).f32696d;
        u790Var.getClass();
        return u790Var;
    }

    @Override // p204p.i47
    /* JADX INFO: renamed from: i */
    public void mo49661i() {
        ((AudioRecord) this.f139856b).startRecording();
    }

    @Override // p204p.uh9
    /* JADX INFO: renamed from: j */
    public u790 mo60775j(byte[] bArr) {
        byte[] bArr2;
        c06 c06Var = (c06) this.f139857c;
        if (c06Var == null || (bArr2 = (byte[]) c06Var.f32694b) == null || !Arrays.equals(bArr2, bArr)) {
            u790 u790VarMo60775j = ((uh9) this.f139856b).mo60775j(bArr);
            this.f139857c = new c06(bArr, u790VarMo60775j);
            return u790VarMo60775j;
        }
        u790 u790Var = (u790) ((c06) this.f139857c).f32696d;
        u790Var.getClass();
        return u790Var;
    }

    /* JADX INFO: renamed from: k */
    public nnc m60776k() {
        return xtm0.m92074U(new yxb((fiz) this.f139856b, 8), new mmd(null, (vsk) this.f139857c, 0));
    }

    /* JADX INFO: renamed from: l */
    public void m60777l() {
        c06 c06Var = (c06) this.f139856b;
        if (c06Var != null) {
            ((AtomicBoolean) c06Var.f32695c).set(true);
            ((ScheduledFuture) c06Var.f32694b).cancel(true);
        }
        this.f139856b = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v14, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.spotify.addonconsideration.v1.GetAddonConsiderationRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [p.ov1] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [p.ov1] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.spotify.addonconsideration.v1.GetAddonConsiderationRequest] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: m */
    public Object m60778m(String str, String str2, String str3, boolean z, ibk ibkVar) {
        mj8 mj8Var;
        ?? r9;
        ?? r5;
        ?? r3;
        ?? r2;
        ?? r10;
        ?? r4;
        ?? r6;
        ?? r7;
        String str4;
        ?? r8;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        GetAddonConsiderationResponse getAddonConsiderationResponse;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r20;
        ?? r21;
        ?? arrayList;
        ?? r22;
        String str5;
        String str6;
        ?? r23;
        String str7;
        String str8;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        ?? r24 = z;
        ?? r25 = (ov1) this.f139856b;
        ?? r26 = (ov1) this.f139857c;
        if (ibkVar instanceof mj8) {
            mj8Var = (mj8) ibkVar;
            int i = mj8Var.f144181h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mj8Var.f144181h = i - Integer.MIN_VALUE;
            } else {
                mj8Var = new mj8(this, ibkVar);
            }
        } else {
            mj8Var = new mj8(this, ibkVar);
        }
        Object objM68109a = mj8Var.f144179f;
        ?? r27 = mj8Var.f144181h;
        yuk yukVar = yuk.f276404a;
        try {
            if (r27 == 0) {
                bga.m29073P(objM68109a);
                g610 g610VarM2321q = GetAddonConsiderationRequest.m2321q();
                g610VarM2321q.m43634m(str9);
                g610VarM2321q.m43635q(str10);
                g610VarM2321q.m43636r(str11);
                GetAddonConsiderationRequest getAddonConsiderationRequest = (GetAddonConsiderationRequest) g610VarM2321q.build();
                if (r24 != 0) {
                    wj50.m88279p(getAddonConsiderationRequest);
                    mj8Var.f144174a = str9;
                    mj8Var.f144175b = str10;
                    mj8Var.f144176c = str11;
                    mj8Var.f144177d = getAddonConsiderationRequest;
                    mj8Var.f144178e = r24;
                    mj8Var.f144181h = 1;
                    objM68109a = r26.m68109a(getAddonConsiderationRequest, mj8Var);
                    if (objM68109a == yukVar) {
                        str5 = str9;
                        str6 = str10;
                        r22 = r24;
                    }
                    str5 = str9;
                    str6 = str10;
                    r22 = r24;
                    getAddonConsiderationResponse = (GetAddonConsiderationResponse) objM68109a;
                    r19 = str5;
                    r20 = str6;
                    r18 = r22;
                } else {
                    wj50.m88279p(getAddonConsiderationRequest);
                    mj8Var.f144174a = str9;
                    mj8Var.f144175b = str10;
                    mj8Var.f144176c = str11;
                    mj8Var.f144177d = getAddonConsiderationRequest;
                    mj8Var.f144178e = r24;
                    mj8Var.f144181h = 2;
                    objM68109a = r25.m68109a(getAddonConsiderationRequest, mj8Var);
                    if (objM68109a == yukVar) {
                        str7 = str9;
                        str8 = str10;
                        r23 = r24;
                    }
                    str7 = str9;
                    str8 = str10;
                    r23 = r24;
                    getAddonConsiderationResponse = (GetAddonConsiderationResponse) objM68109a;
                    r19 = str7;
                    r20 = str8;
                    r18 = r23;
                }
                return yukVar;
            }
            try {
                if (r27 == 1) {
                    boolean z2 = mj8Var.f144178e;
                    GetAddonConsiderationRequest getAddonConsiderationRequest2 = mj8Var.f144177d;
                    str11 = mj8Var.f144176c;
                    String str12 = mj8Var.f144175b;
                    String str13 = mj8Var.f144174a;
                    bga.m29073P(objM68109a);
                    r22 = z2;
                    str5 = str13;
                    str6 = str12;
                    str5 = str9;
                    str6 = str10;
                    r22 = r24;
                    getAddonConsiderationResponse = (GetAddonConsiderationResponse) objM68109a;
                    r19 = str5;
                    r20 = str6;
                    r18 = r22;
                } else if (r27 == 2) {
                    boolean z3 = mj8Var.f144178e;
                    GetAddonConsiderationRequest getAddonConsiderationRequest3 = mj8Var.f144177d;
                    str11 = mj8Var.f144176c;
                    String str14 = mj8Var.f144175b;
                    String str15 = mj8Var.f144174a;
                    bga.m29073P(objM68109a);
                    r23 = z3;
                    str7 = str15;
                    str8 = str14;
                    str7 = str9;
                    str8 = str10;
                    r23 = r24;
                    getAddonConsiderationResponse = (GetAddonConsiderationResponse) objM68109a;
                    r19 = str7;
                    r20 = str8;
                    r18 = r23;
                } else {
                    if (r27 == 3) {
                        boolean z4 = mj8Var.f144178e;
                        GetAddonConsiderationRequest getAddonConsiderationRequest4 = mj8Var.f144177d;
                        str11 = mj8Var.f144176c;
                        String str16 = mj8Var.f144175b;
                        String str17 = mj8Var.f144174a;
                        bga.m29073P(objM68109a);
                        r4 = z4;
                        r7 = getAddonConsiderationRequest4;
                        r6 = str16;
                        r10 = str17;
                        if (r4 != 0) {
                            wj50.m88279p(r7);
                            mj8Var.f144174a = r10;
                            mj8Var.f144175b = r6;
                            mj8Var.f144176c = str11;
                            mj8Var.f144177d = null;
                            mj8Var.f144178e = r4;
                            mj8Var.f144181h = 4;
                            objM68109a = r26.m68109a(r7, mj8Var);
                            if (objM68109a != yukVar) {
                                str4 = str11;
                                r12 = r6;
                                r13 = r10;
                                r14 = r4;
                                getAddonConsiderationResponse = (GetAddonConsiderationResponse) objM68109a;
                                r17 = r14;
                                r16 = r12;
                                r15 = r13;
                                ?? r28 = r15;
                                r18 = r17;
                                r19 = r28;
                                ?? r29 = r16;
                                str11 = str4;
                                r20 = r29;
                            }
                        } else {
                            wj50.m88279p(r7);
                            mj8Var.f144174a = r10;
                            mj8Var.f144175b = r6;
                            mj8Var.f144176c = str11;
                            mj8Var.f144177d = null;
                            mj8Var.f144178e = r4;
                            mj8Var.f144181h = 5;
                            objM68109a = r25.m68109a(r7, mj8Var);
                            if (objM68109a != yukVar) {
                                str4 = str11;
                                r8 = r6;
                                r11 = r10;
                                r21 = r4;
                                getAddonConsiderationResponse = (GetAddonConsiderationResponse) objM68109a;
                                r17 = r21;
                                r16 = r8;
                                r15 = r11;
                                ?? r210 = r15;
                                r18 = r17;
                                r19 = r210;
                                ?? r211 = r16;
                                str11 = str4;
                                r20 = r211;
                            }
                        }
                        return yukVar;
                    }
                    if (r27 == 4) {
                        boolean z5 = mj8Var.f144178e;
                        str4 = mj8Var.f144176c;
                        String str18 = mj8Var.f144175b;
                        String str19 = mj8Var.f144174a;
                        bga.m29073P(objM68109a);
                        r14 = z5;
                        r12 = str18;
                        r13 = str19;
                        getAddonConsiderationResponse = (GetAddonConsiderationResponse) objM68109a;
                        r17 = r14;
                        r16 = r12;
                        r15 = r13;
                        ?? r212 = r15;
                        r18 = r17;
                        r19 = r212;
                        ?? r213 = r16;
                        str11 = str4;
                        r20 = r213;
                    } else {
                        if (r27 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z6 = mj8Var.f144178e;
                        str4 = mj8Var.f144176c;
                        String str20 = mj8Var.f144175b;
                        String str21 = mj8Var.f144174a;
                        bga.m29073P(objM68109a);
                        r21 = z6;
                        r8 = str20;
                        r11 = str21;
                        getAddonConsiderationResponse = (GetAddonConsiderationResponse) objM68109a;
                        r17 = r21;
                        r16 = r8;
                        r15 = r11;
                        ?? r214 = r15;
                        r18 = r17;
                        r19 = r214;
                        ?? r215 = r16;
                        str11 = str4;
                        r20 = r215;
                    }
                }
            } catch (HttpException e) {
                e = e;
                r5 = str9;
                r2 = r27;
                r9 = str10;
                r3 = r24;
                if (e.f288164a != 503) {
                    throw e;
                }
                mj8Var.f144174a = r2;
                mj8Var.f144175b = r3;
                mj8Var.f144176c = str11;
                mj8Var.f144177d = r9;
                mj8Var.f144178e = r5;
                mj8Var.f144181h = 3;
                if (njg1.m64619l(200L, mj8Var) != yukVar) {
                    ?? r216 = r9;
                    r10 = r2;
                    r4 = r5;
                    r6 = r3;
                    r7 = r216;
                }
                return yukVar;
            }
        } catch (HttpException e2) {
            e = e2;
            r2 = str9;
            r3 = str10;
            r5 = r24;
            r9 = r27;
        }
        ?? r30 = r19;
        ?? r31 = r20;
        String str22 = str11;
        ?? r32 = r18;
        int iM2322n = getAddonConsiderationResponse.m2322n();
        int i2 = iM2322n == 0 ? -1 : lj8.f134005b[edb.m38547C(iM2322n)];
        if (i2 != 1) {
            if (i2 == 2) {
                return new yd1();
            }
            throw new NoWhenBranchMatchedException();
        }
        String title = getAddonConsiderationResponse.m2323o().m2338q().getTitle();
        String strM2334u = getAddonConsiderationResponse.m2323o().m2338q().m2334u();
        String str23 = strM2334u == null ? "#FFFFFF" : strM2334u;
        String strM2332s = getAddonConsiderationResponse.m2323o().m2338q().m2332s();
        String strM2333t = getAddonConsiderationResponse.m2323o().m2338q().m2333t();
        String str24 = strM2333t == null ? "#FFFFFF" : strM2333t;
        String description = getAddonConsiderationResponse.m2323o().m2338q().getDescription();
        String strM2328n = getAddonConsiderationResponse.m2323o().m2338q().m2328n();
        String strM2331r = getAddonConsiderationResponse.m2323o().m2338q().m2331r();
        String str25 = strM2331r == null ? "" : strM2331r;
        String strM2330q = getAddonConsiderationResponse.m2323o().m2338q().m2330q();
        jg20 jg20Var = new jg20(title, str23, strM2332s, str24, description, strM2328n, new l10(getAddonConsiderationResponse.m2323o().m2338q().m2329o().m2313p(), getAddonConsiderationResponse.m2323o().m2338q().m2329o().getUri(), getAddonConsiderationResponse.m2323o().m2338q().m2329o().m2312n()), str25, strM2330q == null ? "" : strM2330q);
        ae50<ShowcaseDescriptionList> ae50VarM2336o = getAddonConsiderationResponse.m2323o().m2336o();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM2336o, 10));
        for (ShowcaseDescriptionList showcaseDescriptionList : ae50VarM2336o) {
            String description2 = showcaseDescriptionList.getDescription();
            int iM2326p = showcaseDescriptionList.m2326p();
            int i3 = iM2326p == 0 ? -1 : lj8.f134004a[edb.m38547C(iM2326p)];
            if (i3 == 1) {
                List itemsList = showcaseDescriptionList.m2324n().getItemsList();
                arrayList = new ArrayList(i6f.m49804T(itemsList, 10));
                Iterator it = itemsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ow80(27, null, null, ((BulletedListItem) it.next()).m2310n(), null));
                }
            } else if (i3 == 2) {
                List<EmphasizedIconListItem> itemsList2 = showcaseDescriptionList.m2325o().getItemsList();
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(itemsList2, 10));
                for (EmphasizedIconListItem emphasizedIconListItem : itemsList2) {
                    arrayList3.add(new ow80(16, emphasizedIconListItem.m2315n(), emphasizedIconListItem.m2316o(), emphasizedIconListItem.getTitle(), emphasizedIconListItem.m2317p()));
                }
                arrayList = arrayList3;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = lau.f131415a;
            }
            int iM2326p2 = showcaseDescriptionList.m2326p();
            arrayList2.add(new vo80(description2, (iM2326p2 == 0 ? -1 : lj8.f134004a[edb.m38547C(iM2326p2)]) == 2 ? 2 : 1, arrayList));
        }
        return new yd1(jg20Var, arrayList2, getAddonConsiderationResponse.m2323o().m2337p(), r30, r31, str22, r32);
    }

    /* JADX INFO: renamed from: n */
    public String m60779n() {
        Map map;
        l1p0 l1p0Var = (l1p0) this.f139857c;
        if (l1p0Var == null || (map = l1p0Var.f128768d) == null) {
            return null;
        }
        return (String) map.get("playback_id");
    }

    /* JADX INFO: renamed from: o */
    public boolean m60780o() {
        return ((pa9) this.f139856b) != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public Object m60781p(ibk ibkVar) {
        om8 om8Var;
        if (ibkVar instanceof om8) {
            om8Var = (om8) ibkVar;
            int i = om8Var.f166991c;
            if ((i & Integer.MIN_VALUE) != 0) {
                om8Var.f166991c = i - Integer.MIN_VALUE;
            } else {
                om8Var = new om8(this, ibkVar);
            }
        } else {
            om8Var = new om8(this, ibkVar);
        }
        Object objM42402a = om8Var.f166989a;
        int i2 = om8Var.f166991c;
        if (i2 == 0) {
            bga.m29073P(objM42402a);
            fq9 fq9Var = (fq9) this.f139856b;
            om8Var.f166991c = 1;
            objM42402a = fq9Var.m42402a(om8Var);
            yuk yukVar = yuk.f276404a;
            if (objM42402a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM42402a);
        }
        return new mm8((eq9) objM42402a);
    }

    /* JADX INFO: renamed from: q */
    public void m60782q() {
        kv91 kv91Var = (kv91) this.f139856b;
        r2h0 r2h0Var = (r2h0) this.f139857c;
        r2h0Var.getClass();
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), r2h0Var.f195145c, r2h0Var.f195144b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: r */
    public usj0 m60783r(PlayerState playerState) {
        nt7 nt7Var = (nt7) this.f139857c;
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49278b();
        if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_IS_BANNED))) {
            return new usj0(new btj0(R.drawable.encore_icon_preview, R.string.player_content_description_unban), ((xb5) nt7Var.f157999c).m90305a(AppLifecycleServicePendingIntent.UNBAN_FROM_COLLECTION, nt7Var.m65604f(contextTrack.uri(), playerState.contextUri(), null)), false);
        }
        return new usj0(new btj0(R.drawable.encore_icon_x, R.string.player_content_description_ban), ((xb5) nt7Var.f157999c).m90305a(AppLifecycleServicePendingIntent.BAN_FROM_COLLECTION, nt7Var.m65604f(contextTrack.uri(), playerState.contextUri(), contextTrack.provider())), false);
    }

    @Override // p204p.i47
    public void release() {
        ((AudioRecord) this.f139856b).release();
    }

    /* JADX INFO: renamed from: s */
    public void m60784s() {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            pa9Var.m69441f();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m60785t(l1p0 l1p0Var, noo0 noo0Var) {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            pa9Var.m69443h(l1p0Var, noo0Var);
        }
        this.f139857c = l1p0Var;
    }

    /* JADX INFO: renamed from: u */
    public usj0 m60786u(PlayerState playerState, Boolean bool) {
        String strUri;
        nt7 nt7Var = (nt7) this.f139857c;
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49278b();
        wj50.m88279p(contextTrack);
        ii4 ii4Var = (ii4) this.f139856b;
        boolean zM50678a = ii4Var.m50678a();
        if (e72.m37990X(contextTrack)) {
            strUri = e72.m38002e0(contextTrack);
        } else if (zM50678a) {
            strUri = (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_SAVE_TRACK_URI);
            if (strUri == null) {
                strUri = contextTrack.uri();
            }
            wj50.m88279p(strUri);
        } else {
            strUri = contextTrack.uri();
        }
        boolean z = (!ii4Var.m50678a() || bool == null) ? Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_IN_COLLECTION)) : bool.booleanValue();
        if (z) {
            return new usj0(new btj0(R.drawable.icn_check_fill, R.string.playbacknotifications_player_content_description_unlike), ((xb5) nt7Var.f157999c).m90305a(AppLifecycleServicePendingIntent.REMOVE_FROM_COLLECTION, nt7Var.m65604f(strUri, playerState.contextUri(), null)), false);
        }
        return new usj0(new btj0(R.drawable.icn_plus, R.string.playbacknotifications_player_content_description_like), ((xb5) nt7Var.f157999c).m90305a(AppLifecycleServicePendingIntent.ADD_TO_COLLECTION, nt7Var.m65604f(strUri, playerState.contextUri(), null)), false);
    }

    /* JADX INFO: renamed from: w */
    public void m60787w(clq clqVar) {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            pa9Var.m69445j(clqVar);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m60788x() {
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var != null) {
            pa9Var.m69447l();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        pqm0 pqm0Var = (pqm0) obj;
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj4;
        xj11 xj11Var = (xj11) ((Map) obj3).get((String) this.f139856b);
        boolean z = false;
        if (xj11Var != null && ((hv31) pqm0Var.f180351b).mo48717l(jt7.f115745e, 0) < 3 && !bool2.booleanValue()) {
            jt7 jt7Var = (jt7) this.f139857c;
            boolean zBooleanValue = bool.booleanValue();
            jt7Var.getClass();
            if (!xj11Var.f262016x && (!xj11Var.f262015w || zBooleanValue)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: z */
    public void m60789z(long j, boolean z) {
        d2p0 d2p0Var;
        pa9 pa9Var = (pa9) this.f139856b;
        if (pa9Var == null || (d2p0Var = pa9Var.f175440f) == null) {
            return;
        }
        d2p0Var.m34740H0(j, z);
    }

    public /* synthetic */ m47(int i, Object obj, Object obj2) {
        this.f139855a = i;
        this.f139856b = obj;
        this.f139857c = obj2;
    }

    public m47(hv31 hv31Var) {
        this.f139855a = 16;
        this.f139856b = hv31Var;
        this.f139857c = new ConcurrentHashMap();
    }

    public m47(AudioRecord audioRecord) {
        this.f139855a = 0;
        this.f139856b = audioRecord;
        this.f139857c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public m47(String str) {
        this.f139855a = 22;
        zv41 zv41VarM52819d = jag1.m52819d(str);
        this.f139856b = zv41VarM52819d;
        this.f139857c = zv41VarM52819d;
    }

    public m47(kv91 kv91Var, int i) {
        this.f139855a = i;
        switch (i) {
            case 21:
                this.f139856b = kv91Var;
                st91 st91Var = st91.f213865b;
                this.f139857c = new xxg0(16, (byte) 0);
                break;
            default:
                this.f139856b = kv91Var;
                this.f139857c = new jcg0(new l9g0(10), 0);
                break;
        }
    }

    public m47(fz3 fz3Var, Observable observable, Scheduler scheduler) {
        this.f139855a = 2;
        this.f139856b = observable;
        this.f139857c = scheduler;
    }

    public m47(String str, rcn rcnVar, ii4 ii4Var) {
        this.f139855a = 26;
        this.f139856b = ii4Var;
        xb5 xb5Var = (xb5) ((i23) ((ik40) rcnVar.f197898a.f281351c).f103006b).f97723n;
        jg31.m53271i(xb5Var);
        this.f139857c = new nt7(23, str, xb5Var);
    }

    public m47(afe afeVar, kv91 kv91Var) {
        this.f139855a = 24;
        this.f139856b = kv91Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f139857c = new r2h0(xgg1.m90706T3().f36166c, afeVar.f15135a, 15);
    }

    public m47(uh9 uh9Var) {
        this.f139855a = 14;
        this.f139856b = uh9Var;
    }

    public m47(idb idbVar) {
        this.f139855a = 15;
        this.f139857c = idbVar;
        this.f139856b = null;
    }
}
