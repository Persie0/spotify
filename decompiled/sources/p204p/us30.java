package p204p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.firebase.FirebaseCommonRegistrar;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCallable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class us30 implements ys30, ve60, rwf, BiFunction, Function, hcd0, k890, ocd0, qpd0, SingleOnSubscribe, zl6, v8j, msd0, tvy, mb40, ej11, hbb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f233518b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f233519c;

    public /* synthetic */ us30(int i, Object obj, Object obj2) {
        this.f233517a = i;
        this.f233518b = obj;
        this.f233519c = obj2;
    }

    @Override // p204p.ocd0
    /* JADX INFO: renamed from: a */
    public void mo56040a(jcd0 jcd0Var) {
        jcd0Var.m52962x((cap0) this.f233518b, (x9p0) this.f233519c);
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        switch (this.f233517a) {
            case 16:
                psd0 psd0Var = (psd0) this.f233518b;
                dr81 dr81VarMo33726b = (dr81) this.f233519c;
                pdp0 pdp0Var = (pdp0) obj;
                xf40 xf40Var = dr81VarMo33726b.f52239H;
                if (!xf40Var.isEmpty()) {
                    cr81 cr81VarMo33727c = dr81VarMo33726b.mo36707a().mo33727c();
                    o3a1 it = xf40Var.values().iterator();
                    while (it.hasNext()) {
                        zq81 zq81Var = (zq81) it.next();
                        kf81 kf81Var = (kf81) psd0Var.f180822o.f244505h.get(zq81Var.f285331a.f122100b);
                        if (kf81Var == null || zq81Var.f285331a.f122099a != kf81Var.f122099a) {
                            cr81VarMo33727c.mo33725a(zq81Var);
                        } else {
                            cr81VarMo33727c.mo33725a(new zq81(kf81Var, zq81Var.f285332b));
                        }
                    }
                    dr81VarMo33726b = cr81VarMo33727c.mo33726b();
                }
                pdp0Var.mo43828B0(dr81VarMo33726b);
                break;
            case 17:
            default:
                zk1 zk1Var = (zk1) this.f233518b;
                ((ctd0) obj).mo33836C(zk1Var.f283580c, (vsd0) zk1Var.f283581d, (lhd0) this.f233519c);
                break;
            case 18:
                psd0 psd0Var2 = (psd0) this.f233518b;
                tnd0 tnd0Var = (tnd0) this.f233519c;
                rpd0 rpd0Var = (rpd0) psd0Var2.f180819l.get();
                if (rpd0Var != null && !rpd0Var.m76132s()) {
                    rpd0Var.m76130p(tnd0Var, false);
                    break;
                }
                break;
            case 19:
                psd0 psd0Var3 = (psd0) this.f233518b;
                Surface surface = (Surface) this.f233519c;
                pdp0 pdp0Var2 = (pdp0) obj;
                ((rpd0) psd0Var3.f180819l.get()).getClass();
                if (surface != null) {
                    nsd0 nsd0Var = new nsd0(surface);
                    psd0Var3.f180830w = nsd0Var;
                    pdp0Var2.mo43837H(nsd0Var);
                } else {
                    pdp0Var2.mo43837H(null);
                    psd0Var3.f180830w = null;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f233517a) {
            case 3:
                return ((jx80) this.f233518b).m54628d((qu80) this.f233519c, (r431) obj, (Map) obj2);
            default:
                e6a0 e6a0Var = (e6a0) this.f233518b;
                Resources resources = (Resources) this.f233519c;
                PlayerState playerState = (PlayerState) obj;
                e6a0Var.getClass();
                if (!((e301) obj2).f55572b) {
                    return new qqm0(null, null);
                }
                return new qqm0(playerState, new x4j0(0, resources, (Map) e6a0Var.f56601e).m89899p(playerState));
        }
    }

    @Override // p204p.hbb
    public Object attachCompleter(gbb gbbVar) {
        switch (this.f233517a) {
            case 27:
                gfb gfbVar = (gfb) this.f233518b;
                ArrayList arrayList = (ArrayList) this.f233519c;
                tcb tcbVar = new tcb(gbbVar, gfbVar);
                arrayList.add(tcbVar);
                gfbVar.mo44596h(e95.m38202g(), tcbVar);
                return "waitForCaptureResult";
            default:
                phr0 phr0Var = (phr0) this.f233518b;
                ygb ygbVar = (ygb) this.f233519c;
                synchronized (phr0Var.f177711a) {
                    jjc jjcVarM89929T = x4w0.m89929T(hk00.m47729c(se40.f208191c), new g4n0(new p0r0(ygbVar, 9), 20), e95.m38202g());
                    cxq0 cxq0Var = new cxq0(2, gbbVar, ygbVar);
                    jjcVarM89929T.mo28322a(new lk00(0, jjcVarM89929T, cxq0Var), e95.m38202g());
                }
                return "ProcessCameraProvider-initializeCameraX";
        }
    }

    @Override // p204p.tvy
    /* JADX INFO: renamed from: b */
    public void mo81624b(File file) {
        rwh0 rwh0Var = (rwh0) this.f233518b;
        rwh0Var.f203352g = (iwh0) this.f233519c;
        rwh0Var.f203351f = file;
        Runnable runnable = rwh0Var.f203353h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p204p.ys30
    /* JADX INFO: renamed from: c */
    public fk30 mo25398c(fk30 fk30Var) {
        return ((ys30) this.f233519c).mo25398c(((ys30) this.f233518b).mo25398c(fk30Var));
    }

    @Override // p204p.zl6
    public u790 call() {
        return ((esa0) this.f233518b).m39902c((ggd0) this.f233519c);
    }

    @Override // p204p.hcd0
    /* JADX INFO: renamed from: d */
    public void mo25456d(jv30 jv30Var, int i) {
        switch (this.f233517a) {
            case 5:
                jcd0 jcd0Var = (jcd0) this.f233518b;
                jv30Var.mo45836n1(jcd0Var.f111081c, i, (Surface) this.f233519c);
                break;
            case 6:
            default:
                jcd0 jcd0Var2 = (jcd0) this.f233518b;
                h1p0 h1p0Var = (h1p0) this.f233519c;
                pcd0 pcd0Var = jcd0Var2.f111081c;
                Bundle bundle = new Bundle();
                bundle.putFloat(h1p0.f86672e, h1p0Var.f86674a);
                bundle.putFloat(h1p0.f86673f, h1p0Var.f86675b);
                jv30Var.mo45828h0(pcd0Var, i, bundle);
                break;
            case 7:
                jv30Var.mo45827b0(((jcd0) this.f233518b).f111081c, i, ((dr81) this.f233519c).mo36708c());
                break;
            case 8:
                jcd0 jcd0Var3 = (jcd0) this.f233518b;
                jv30Var.mo45824Z(jcd0Var3.f111081c, i, ((phd0) this.f233519c).m69980c(jcd0Var3.m52957o()));
                break;
        }
    }

    @Override // p204p.qpd0
    /* JADX INFO: renamed from: e */
    public void mo25926e(snd0 snd0Var, int i) {
        boolean zM74959c;
        dhd0 dhd0Var = (dhd0) this.f233518b;
        String str = (String) this.f233519c;
        synchronized (dhd0Var) {
            zM74959c = dhd0Var.f49063K.m74959c(snd0Var, str);
        }
        if (zM74959c) {
            snd0Var.mo51516m(i, str);
        }
    }

    @Override // p204p.ej11
    /* JADX INFO: renamed from: f */
    public boolean mo25401f() {
        qhq0 qhq0Var = (qhq0) this.f233518b;
        pa8 pa8Var = (pa8) this.f233519c;
        if (!qhq0Var.f188839q) {
            qhq0Var.m72845h();
            long jM69437a = pa8.m69437a(qhq0Var.f188837o, pa8Var.f175430a);
            pa8Var.f175430a = jM69437a;
            qhq0Var.f188839q = !qhq0Var.m72844g(qhq0Var.f188836n, jM69437a + pa8Var.f175431b);
        }
        return qhq0Var.f188839q;
    }

    @Override // p204p.msd0
    /* JADX INFO: renamed from: g */
    public Object mo25927g(final rpd0 rpd0Var, final tnd0 tnd0Var, int i) {
        switch (this.f233517a) {
            case 17:
                return rpd0Var.m76135w(tnd0Var, (mxz0) this.f233518b, (Bundle) this.f233519c);
            case 20:
                msd0 msd0Var = (msd0) this.f233518b;
                final yrd0 yrd0Var = (yrd0) this.f233519c;
                if (rpd0Var.m76132s()) {
                    return vgg1.m85445A(new r201(-100));
                }
                final int i2 = 0;
                return h0b1.m46324m0((u790) msd0Var.mo25927g(rpd0Var, tnd0Var, i), new hm6() { // from class: p.gsd0
                    @Override // p204p.hm6
                    public final u790 apply(Object obj) {
                        int i3 = i2;
                        int i4 = 19;
                        int i5 = 4;
                        Object obj2 = yrd0Var;
                        switch (i3) {
                            case 0:
                                rpd0 rpd0Var2 = rpd0Var;
                                Handler handler = rpd0Var2.f201552l;
                                kgd0 kgd0Var = new kgd0(rpd0Var2, tnd0Var, new kgd0(rpd0Var2, (yrd0) obj2, (und0) obj, 6), i5);
                                r201 r201Var = new r201(0);
                                String str = h0b1.f86200a;
                                t601 t601VarM80149y = t601.m80149y();
                                h0b1.m46304c0(handler, new kgd0(t601VarM80149y, kgd0Var, r201Var, i4));
                                return t601VarM80149y;
                            default:
                                List list = (List) obj;
                                rpd0 rpd0Var3 = rpd0Var;
                                Handler handler2 = rpd0Var3.f201552l;
                                tnd0 tnd0Var2 = tnd0Var;
                                kgd0 kgd0Var2 = new kgd0(rpd0Var3, tnd0Var2, new feb(rpd0Var3, (ksd0) obj2, tnd0Var2, list, 16), i5);
                                r201 r201Var2 = new r201(0);
                                String str2 = h0b1.f86200a;
                                t601 t601VarM80149y2 = t601.m80149y();
                                h0b1.m46304c0(handler2, new kgd0(t601VarM80149y2, kgd0Var2, r201Var2, i4));
                                return t601VarM80149y2;
                        }
                    }
                });
            default:
                msd0 msd0Var2 = (msd0) this.f233518b;
                final ksd0 ksd0Var = (ksd0) this.f233519c;
                if (rpd0Var.m76132s()) {
                    return vgg1.m85445A(new r201(-100));
                }
                final int i3 = 1;
                return h0b1.m46324m0((u790) msd0Var2.mo25927g(rpd0Var, tnd0Var, i), new hm6() { // from class: p.gsd0
                    @Override // p204p.hm6
                    public final u790 apply(Object obj) {
                        int i4 = i3;
                        int i5 = 19;
                        int i6 = 4;
                        Object obj2 = ksd0Var;
                        switch (i4) {
                            case 0:
                                rpd0 rpd0Var2 = rpd0Var;
                                Handler handler = rpd0Var2.f201552l;
                                kgd0 kgd0Var = new kgd0(rpd0Var2, tnd0Var, new kgd0(rpd0Var2, (yrd0) obj2, (und0) obj, 6), i6);
                                r201 r201Var = new r201(0);
                                String str = h0b1.f86200a;
                                t601 t601VarM80149y = t601.m80149y();
                                h0b1.m46304c0(handler, new kgd0(t601VarM80149y, kgd0Var, r201Var, i5));
                                return t601VarM80149y;
                            default:
                                List list = (List) obj;
                                rpd0 rpd0Var3 = rpd0Var;
                                Handler handler2 = rpd0Var3.f201552l;
                                tnd0 tnd0Var2 = tnd0Var;
                                kgd0 kgd0Var2 = new kgd0(rpd0Var3, tnd0Var2, new feb(rpd0Var3, (ksd0) obj2, tnd0Var2, list, 16), i6);
                                r201 r201Var2 = new r201(0);
                                String str2 = h0b1.f86200a;
                                t601 t601VarM80149y2 = t601.m80149y();
                                h0b1.m46304c0(handler2, new kgd0(t601VarM80149y2, kgd0Var2, r201Var2, i5));
                                return t601VarM80149y2;
                        }
                    }
                });
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        String strValueOf;
        String str = (String) this.f233518b;
        zfs zfsVar = (zfs) this.f233519c;
        Context context = (Context) sef0Var.mo54438a(Context.class);
        switch (zfsVar.f282396a) {
            case 14:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                }
                break;
            case 15:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                }
                break;
            case 16:
                int i = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    strValueOf = "tv";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    strValueOf = "watch";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    strValueOf = "auto";
                } else if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    strValueOf = "embedded";
                } else {
                    strValueOf = "";
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    strValueOf = "";
                } else {
                    strValueOf = FirebaseCommonRegistrar.m1881a(installerPackageName);
                }
                break;
        }
        return new h18(str, strValueOf);
    }

    @Override // p204p.mb40
    /* JADX INFO: renamed from: i */
    public void mo55851i(nb40 nb40Var) {
        zb70 zb70Var = (zb70) this.f233518b;
        mb40 mb40Var = (mb40) this.f233519c;
        zb70Var.getClass();
        mb40Var.mo55851i(zb70Var);
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        ((d7p0) obj).mo34739H(((Integer) this.f233519c).intValue(), (ufd0) this.f233518b);
    }

    @Override // p204p.ve60
    /* JADX INFO: renamed from: run */
    public void mo98370run() throws IOException {
        int i;
        ue60 ue60Var = (ue60) this.f233518b;
        ByteBuffer byteBuffer = (ByteBuffer) this.f233519c;
        ReadableByteChannel readableByteChannel = ue60Var.f229427n;
        if (readableByteChannel != null) {
            ue60Var.f229436w++;
            i = readableByteChannel.read(byteBuffer);
        } else {
            i = -1;
        }
        re60 re60Var = ue60Var.f229414a;
        if (i != -1) {
            yka1 yka1Var = ue60Var.f229428o;
            re60Var.getClass();
            re60Var.m75383b(new jt4(re60Var, yka1Var, byteBuffer, 11), "onReadCompleted");
            return;
        }
        ReadableByteChannel readableByteChannel2 = ue60Var.f229427n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (ue60Var.f229419f.compareAndSet(5, 7)) {
            ue60Var.m82894c(new me60(ue60Var, 2), "fireDisconnect");
            yka1 yka1Var2 = ue60Var.f229428o;
            re60Var.getClass();
            re60Var.m75384c(new qe60(re60Var, yka1Var2, 1), "onSucceeded");
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        dod0 dod0Var = (dod0) this.f233518b;
        String str = (String) this.f233519c;
        r9d0 r9d0Var = dod0Var.f51024a;
        yjx0 yjx0Var = (yjx0) r9d0Var.f197027g.remove(str);
        if (yjx0Var == null) {
            yjx0Var = new yjx0("default", (String) null, (String) null, false, false, (hg40) null, (Bundle) null, 254);
        }
        r9d0Var.m75046b(str, yjx0Var);
        r9d0Var.m75045a(new zvm0(str), new p8d0(singleEmitter, str));
    }

    public /* synthetic */ us30(ArrayList arrayList, i82 i82Var, gfb gfbVar) {
        this.f233517a = 27;
        this.f233518b = gfbVar;
        this.f233519c = arrayList;
    }

    public /* synthetic */ us30(boolean z, mxz0 mxz0Var, Bundle bundle) {
        this.f233517a = 17;
        this.f233518b = mxz0Var;
        this.f233519c = bundle;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Completable completableM23299p;
        int i = this.f233517a;
        Object obj2 = this.f233519c;
        Object obj3 = this.f233518b;
        switch (i) {
            case 4:
                vio vioVar = new vio(3, (nda0) obj3, (String) obj2);
                int i2 = Flowable.f7192a;
                return new FlowableFromCallable(vioVar);
            case 12:
                vnd0 vnd0Var = (vnd0) obj3;
                String str = (String) obj2;
                o9d0 o9d0Var = (o9d0) obj;
                if (o9d0Var.mo36678a().contains(vnd0Var)) {
                    return o9d0Var.mo37698f();
                }
                throw new RuntimeException("Callback handler for the package " + str + " does not support an expected action " + vnd0Var);
            case 14:
                return ((xnd0) obj).mo31406p((String) obj3, (Bundle) obj2);
            default:
                wft0 wft0Var = (wft0) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                aaq0 aaq0Var = wft0Var.f250894d;
                if (str3.equals(str2)) {
                    return CompletableEmpty.f7437a;
                }
                if (!str2.isEmpty()) {
                    Completable completableM25271g = aaq0Var.m25271g(str2);
                    completableM25271g.getClass();
                    completableM23299p = completableM25271g.m23299p(Functions.f7232h);
                } else {
                    completableM23299p = CompletableEmpty.f7437a;
                }
                return completableM23299p.m23292c(aaq0Var.m25270f(str3).m23295g(new vft0(wft0Var, str3, 1)).m23296h(new ntb(19)));
        }
    }
}
