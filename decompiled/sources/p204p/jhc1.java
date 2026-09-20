package p204p;

import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import com.spotify.connect.esperanto.proto.CommonMessages$LoggingParams;
import com.spotify.connect.esperanto.proto.VolumeMessages$VolumeDownRequest;
import com.spotify.connect.esperanto.proto.VolumeMessages$VolumeUpRequest;
import com.spotify.thestage.vtec.logic.VtecWebToAndroidMessage$ShareRequested;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class jhc1 implements FlowableOnSubscribe, Function, InterfaceC2207oa, s4h1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112390a;

    /* JADX INFO: renamed from: b */
    public Object f112391b;

    public /* synthetic */ jhc1(int i) {
        this.f112390a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m53376a(jhc1 jhc1Var, pfo pfoVar, String str) {
        String path = pfoVar.getUri().getPath();
        if (path == null) {
            path = "";
        }
        return bm51.m29803n0(path, str, false);
    }

    /* JADX INFO: renamed from: b */
    public static final xve m53377b(jhc1 jhc1Var, pfo pfoVar) {
        String str;
        boolean zBooleanValue;
        z4n z4nVarM95351G0 = z4n.m95351G0((pfo) pfoVar.freeze());
        fgo fgoVar = (fgo) z4nVarM95351G0.f279303c;
        Object obj = fgoVar.f69376a.get("com.spotify.wear.coaching.toggle.uri");
        xve xveVar = null;
        if (obj == null) {
            str = null;
        } else {
            try {
                str = (String) obj;
            } catch (ClassCastException unused) {
                str = null;
            }
        }
        if (str != null && str.length() != 0) {
            Uri uri = (Uri) z4nVarM95351G0.f279302b;
            Object obj2 = fgoVar.f69376a.get("com.spotify.wear.coaching.toggle.enabled");
            if (obj2 == null) {
                zBooleanValue = true;
            } else {
                try {
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                } catch (ClassCastException unused2) {
                    zBooleanValue = true;
                }
            }
            xveVar = new xve(uri, str, zBooleanValue);
        }
        return xveVar;
    }

    /* JADX INFO: renamed from: c */
    public static final o3e1 m53378c(jhc1 jhc1Var, pfo pfoVar) {
        String str;
        boolean zBooleanValue;
        z4n z4nVarM95351G0 = z4n.m95351G0((pfo) pfoVar.freeze());
        fgo fgoVar = (fgo) z4nVarM95351G0.f279303c;
        Object obj = fgoVar.f69376a.get("com.spotify.wear.workout.toggle.uri");
        o3e1 o3e1Var = null;
        if (obj == null) {
            str = null;
        } else {
            try {
                str = (String) obj;
            } catch (ClassCastException unused) {
                str = null;
            }
        }
        if (str != null && str.length() != 0) {
            Uri uri = (Uri) z4nVarM95351G0.f279302b;
            Object obj2 = fgoVar.f69376a.get("com.spotify.wear.workout.toggle.enabled");
            if (obj2 == null) {
                zBooleanValue = true;
            } else {
                try {
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                } catch (ClassCastException unused2) {
                    zBooleanValue = true;
                }
            }
            o3e1Var = new o3e1(uri, str, zBooleanValue);
        }
        return o3e1Var;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((e8d1) this.f112391b).m38092a();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        CompletableObserveOn completableObserveOnM23298o;
        switch (this.f112390a) {
            case 1:
                nwc1 nwc1Var = (nwc1) obj;
                bka1 bka1Var = (bka1) this.f112391b;
                Scheduler scheduler = (Scheduler) bka1Var.f27888c;
                C2048kd c2048kd = (C2048kd) bka1Var.f27887b;
                String str = nwc1Var.f159095a;
                dy1 dy1Var = nwc1Var.f159096b;
                int i = dy1Var.f54146a;
                String str2 = dy1Var.f54148c;
                int iM38547C = edb.m38547C(i);
                if (iM38547C == 0) {
                    dyc1 dyc1VarM7442p = VolumeMessages$VolumeDownRequest.m7442p();
                    gpf gpfVarM7300p = CommonMessages$LoggingParams.m7300p();
                    if (str2 != null) {
                        gpfVarM7300p.m45367m(str2);
                    }
                    dyc1VarM7442p.m37338q((CommonMessages$LoggingParams) gpfVarM7300p.build());
                    if (str != null) {
                        dyc1VarM7442p.m37337m(str);
                    }
                    completableObserveOnM23298o = c2048kd.callSingle("spotify.connect.esperanto.proto.ConnectVolumeService", "VolumeDown", (VolumeMessages$VolumeDownRequest) dyc1VarM7442p.build()).map(wqb0.f253968S0).doOnSuccess(cz31.f43450Y0).doOnError(cz31.f43452Z0).ignoreElement().m23298o(scheduler);
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hyc1 hyc1VarM7454p = VolumeMessages$VolumeUpRequest.m7454p();
                    gpf gpfVarM7300p2 = CommonMessages$LoggingParams.m7300p();
                    if (str2 != null) {
                        gpfVarM7300p2.m45367m(str2);
                    }
                    hyc1VarM7454p.m49175q((CommonMessages$LoggingParams) gpfVarM7300p2.build());
                    if (str != null) {
                        hyc1VarM7454p.m49174m(str);
                    }
                    completableObserveOnM23298o = c2048kd.callSingle("spotify.connect.esperanto.proto.ConnectVolumeService", "VolumeUp", (VolumeMessages$VolumeUpRequest) hyc1VarM7454p.build()).map(s0o0.f204443Q0).doOnSuccess(cz31.f43457c1).doOnError(fxc1.f74335b).ignoreElement().m23298o(scheduler);
                }
                return completableObserveOnM23298o.m23307y().onErrorResumeNext(pnq0.f179495X0);
            case 2:
                s4d1 s4d1Var = (s4d1) obj;
                e5d1 e5d1Var = (e5d1) this.f112391b;
                VtecWebToAndroidMessage$ShareRequested vtecWebToAndroidMessage$ShareRequested = s4d1Var.f205576a;
                return Single.zip(e5d1.m37809a(e5d1Var, vtecWebToAndroidMessage$ShareRequested.f6827e), e5d1.m37809a(e5d1Var, vtecWebToAndroidMessage$ShareRequested.f6831i), oyq0.f171855X0).map(new jgc1(s4d1Var, 2)).toObservable();
            case 3:
            case 5:
            case 6:
            default:
                return ((vse1) this.f112391b).f244417a.m81347b((YourLibraryRequest) obj);
            case 4:
                nrd1 nrd1Var = (nrd1) obj;
                prd1 prd1Var = (prd1) this.f112391b;
                Single singleJust = prd1Var.f180572k.mo49279c() ? Single.just(nrd1.CONNECTED_TO_BLUETOOTH_DEVICE) : Single.just(nrd1.ALL_CHECKS_CLEAR);
                wj50.m88279p(singleJust);
                return prd1.m70709a(prd1Var, nrd1Var, singleJust);
            case 7:
                qle1 qle1Var = (qle1) obj;
                return qle1Var.f189857a ? ((Single) ((jt7) ((vle1) this.f112391b).f242470h).f115751c.getValue()).flatMapCompletable(u0o0.f225551X).m23308z(qle1Var) : Single.just(qle1Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public y9f1 m53379d() {
        ehv0 ehv0Var = (ehv0) this.f112391b;
        if (ehv0Var != null) {
            return new y9f1(ehv0Var);
        }
        throw new IllegalStateException("Missing required properties: status");
    }

    /* JADX INFO: renamed from: e */
    public Object m53380e(String str, String str2, Set set, ibk ibkVar) throws Exception {
        k7q0 k7q0VarM55698j = k7q0.m55698j(str);
        ((fgo) k7q0VarM55698j.f120179c).f69376a.put(str2, (String[]) set.toArray(new String[0]));
        k7q0VarM55698j.m55700B();
        cgt0 cgt0VarM55704i = k7q0VarM55698j.m55704i();
        r3f1 r3f1Var = ((asf1) this.f112391b).f220803i;
        fof1 fof1Var = new fof1(r3f1Var, cgt0VarM55704i);
        r3f1Var.f195505a.m80961d(0, fof1Var);
        Object objM88273k = wj50.m88273k(stf1.m79256p(fof1Var, tjr0.f220997X0), ibkVar);
        return objM88273k == yuk.f276404a ? objM88273k : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:31:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0090 -> B:33:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public java.lang.Enum m53381f(p204p.zas0 r14, p204p.ibk r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p204p.ptd1
            if (r0 == 0) goto L13
            r0 = r15
            p.ptd1 r0 = (p204p.ptd1) r0
            int r1 = r0.f181136h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181136h = r1
            goto L18
        L13:
            p.ptd1 r0 = new p.ptd1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f181134f
            int r1 = r0.f181136h
            p.qzn0 r2 = p204p.qzn0.f194233b
            r3 = 0
            r4 = 2
            r5 = 1
            p.yuk r6 = p204p.yuk.f276404a
            if (r1 == 0) goto L4d
            if (r1 == r5) goto L3b
            if (r1 != r4) goto L33
            int r14 = r0.f181131c
            int r1 = r0.f181130b
            p.zas0 r7 = r0.f181129a
            p204p.bga.m29073P(r15)
            goto L8e
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            int r14 = r0.f181133e
            int r1 = r0.f181132d
            int r7 = r0.f181131c
            int r8 = r0.f181130b
            p.zas0 r9 = r0.f181129a
            p204p.bga.m29073P(r15)
            r12 = r15
            r15 = r14
            r14 = r7
            r7 = r12
            goto L6f
        L4d:
            p204p.bga.m29073P(r15)
            r15 = 4
            r1 = r3
        L52:
            if (r1 >= r15) goto L96
            java.lang.Object r7 = r13.f112391b
            p.le5 r7 = (p204p.le5) r7
            r0.f181129a = r14
            r0.f181130b = r15
            r0.f181131c = r1
            r0.f181132d = r1
            r0.f181133e = r3
            r0.f181136h = r5
            java.lang.Enum r7 = r7.m58775b(r14, r0)
            if (r7 != r6) goto L6b
            goto L8b
        L6b:
            r9 = r14
            r8 = r15
            r14 = r1
            r15 = r3
        L6f:
            p.qzn0 r7 = (p204p.qzn0) r7
            if (r7 == r2) goto L74
            return r7
        L74:
            r7 = 3
            if (r1 >= r7) goto L90
            r0.f181129a = r9
            r0.f181130b = r8
            r0.f181131c = r14
            r0.f181132d = r1
            r0.f181133e = r15
            r0.f181136h = r4
            r10 = 200(0xc8, double:9.9E-322)
            java.lang.Object r15 = p204p.njg1.m64619l(r10, r0)
            if (r15 != r6) goto L8c
        L8b:
            return r6
        L8c:
            r1 = r8
            r7 = r9
        L8e:
            r15 = r1
            goto L92
        L90:
            r15 = r8
            r7 = r9
        L92:
            int r1 = r14 + 1
            r14 = r7
            goto L52
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.jhc1.m53381f(p.zas0, p.ibk):java.lang.Enum");
    }

    /* JADX INFO: renamed from: g */
    public void m53382g(ehv0 ehv0Var) {
        this.f112391b = ehv0Var;
    }

    /* JADX INFO: renamed from: h */
    public long m53383h() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xsg1 xsg1Var = (xsg1) this.f112391b;
        return timeUnit.convert(xsg1Var.f265588a ? (System.nanoTime() - xsg1Var.f265590c) + xsg1Var.f265589b : xsg1Var.f265589b, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: i */
    public void m53384i() {
        xsg1 xsg1Var = (xsg1) this.f112391b;
        xsg1Var.getClass();
        long jNanoTime = System.nanoTime();
        bnf1.m29983s(xsg1Var.f265588a, "This stopwatch is already stopped.");
        xsg1Var.f265588a = false;
        xsg1Var.f265589b = (jNanoTime - xsg1Var.f265590c) + xsg1Var.f265589b;
    }

    @Override // io.reactivex.rxjava3.core.FlowableOnSubscribe
    public void subscribe(FlowableEmitter flowableEmitter) {
        a2b1 a2b1Var = new a2b1(flowableEmitter, 1);
        View view = (View) this.f112391b;
        flowableEmitter.onNext(Boolean.valueOf(view.hasWindowFocus()));
        view.getViewTreeObserver().addOnWindowFocusChangeListener(a2b1Var);
        flowableEmitter.setCancellable(new ihc1(view, a2b1Var));
    }

    @Override // p204p.s4h1
    public Object zza(Object obj) {
        t6h1 t6h1Var = (t6h1) obj;
        float f = t6h1Var.f217561f;
        return new y071(t6h1Var, (Matrix) this.f112391b);
    }

    public /* synthetic */ jhc1(Object obj, int i) {
        this.f112390a = i;
        this.f112391b = obj;
    }

    public jhc1() {
        this.f112390a = 12;
        System.currentTimeMillis();
        xsg1 xsg1Var = new xsg1();
        bnf1.m29983s(!xsg1Var.f265588a, "This stopwatch is already running.");
        xsg1Var.f265588a = true;
        xsg1Var.f265590c = System.nanoTime();
        this.f112391b = xsg1Var;
    }
}
