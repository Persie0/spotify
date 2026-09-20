package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Size;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.spotify.eventcardinfoservice.p062v1.EventCardInfoResponse;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.integrity.integrityimpl.proto.VerifyRequest;
import com.spotify.integrity.integrityimpl.proto.VerifyResponse;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.Timestamp;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class a9i0 implements Function, gg50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13578a;

    /* JADX INFO: renamed from: b */
    public Object f13579b;

    /* JADX INFO: renamed from: c */
    public Object f13580c;

    public /* synthetic */ a9i0(int i, Object obj, Object obj2) {
        this.f13578a = i;
        this.f13579b = obj;
        this.f13580c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m25119a(a9i0 a9i0Var, int i, String str, ibk ibkVar) {
        v8n0 v8n0Var;
        long j;
        if (ibkVar instanceof v8n0) {
            v8n0Var = (v8n0) ibkVar;
            int i2 = v8n0Var.f238631d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v8n0Var.f238631d = i2 - Integer.MIN_VALUE;
            } else {
                v8n0Var = new v8n0(a9i0Var, ibkVar);
            }
        } else {
            v8n0Var = new v8n0(a9i0Var, ibkVar);
        }
        Object objM25134p = v8n0Var.f238629b;
        int i3 = v8n0Var.f238631d;
        if (i3 == 0) {
            bga.m29073P(objM25134p);
            long j2 = ((long) i) * 1000;
            v8n0Var.f238628a = j2;
            v8n0Var.f238631d = 1;
            objM25134p = a9i0Var.m25134p(j2, str, v8n0Var);
            Object obj = yuk.f276404a;
            if (objM25134p == obj) {
                return obj;
            }
            j = j2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = v8n0Var.f238628a;
            bga.m29073P(objM25134p);
        }
        Long l = (Long) objM25134p;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        ku71 ku71VarM22260r = Timestamp.m22260r();
        ku71VarM22260r.m57382m(j);
        ku71VarM22260r.m57383q(jLongValue);
        return ku71VarM22260r.build();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f13578a) {
            case 0:
                return Observable.fromIterable((ArrayList) ((t180) this.f13579b).f216179b).flatMap(new bq70(27, (b9i0) this.f13580c, (gqx) obj)).toList().map(t2z.f216645O0).toObservable();
            case 6:
                if (obj == null) {
                    return new nhs0(((oh5) this.f13579b).m66936m(), ((w2y0) this.f13580c).m87089e(R.string.manually_modified_playlist_warning, new Object[0]), System.currentTimeMillis());
                }
                throw new ClassCastException();
            case 19:
                pqm0 pqm0Var = (pqm0) obj;
                return cun0.m33934c((cun0) this.f13579b, (oyx) pqm0Var.f180350a, (ExternalAccessoryDescription) this.f13580c, ((Boolean) pqm0Var.f180351b).booleanValue(), false);
            case 22:
                nuo0 nuo0Var = (nuo0) this.f13579b;
                if (!((Boolean) obj).booleanValue()) {
                    return Observable.just(nuo0Var.f158688d);
                }
                a6b a6bVar = (a6b) nuo0Var.f158685a.get();
                y5b y5bVar = (y5b) this.f13580c;
                e6b e6bVar = (e6b) a6bVar;
                wt80 wt80Var = e6bVar.f56605a;
                ((ewk0) e6bVar.f56606b.get()).getClass();
                return k0e1.m54988g(new pv4(((mu80) wt80Var).m62846k(ewk0.m40145a(), e6b.m37933b(y5bVar)), 23), dau.f47107a).observeOn(nuo0Var.f158687c);
            case 23:
                return new CompletableFromAction(new n0p0((q0p0) this.f13579b, (String) this.f13580c, (String) obj, 0));
            case 25:
                PlayerQueue playerQueue = (PlayerQueue) obj;
                jrw jrwVar = (jrw) this.f13579b;
                List list = (List) this.f13580c;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(e72.m38008h0((ContextTrack) it.next()));
                }
                ArrayList arrayList2 = new ArrayList(playerQueue.nextTracks());
                j6f.m52567Y(arrayList2, new l24(20, arrayList));
                return jrwVar.m54196b(sap0.m77688a(playerQueue.toBuilder().nextTracks(pf40.m69791p(arrayList2)).build()));
            default:
                return Flowable.m23322h((Flowable) this.f13579b, (Flowable) this.f13580c, haz.f89321X0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25120b(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f13579b).add(dq60.m36618r(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // p204p.gg50
    /* JADX INFO: renamed from: c */
    public int mo25121c(char[] cArr, int i, int i2) {
        int i3;
        gqa gqaVar = (gqa) this.f13580c;
        Character ch = (Character) this.f13579b;
        if (ch != null) {
            cArr[i] = ch.charValue();
            this.f13579b = null;
            i3 = 1;
        } else {
            i3 = 0;
        }
        while (i3 < i2 && !gqaVar.mo45420R0()) {
            int iMo45423d1 = gqaVar.mo45423d1();
            if (iMo45423d1 <= 65535) {
                cArr[i + i3] = (char) iMo45423d1;
                i3++;
            } else {
                char c = (char) ((iMo45423d1 >>> 10) + 55232);
                char c2 = (char) ((iMo45423d1 & 1023) + 56320);
                cArr[i + i3] = c;
                int i4 = i3 + 1;
                if (i4 < i2) {
                    cArr[i4 + i] = c2;
                    i3 += 2;
                } else {
                    this.f13579b = Character.valueOf(c2);
                    i3 = i4;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public void m25122d(o2i0 o2i0Var, pfj0 pfj0Var) {
        cai0.m32058a((cqi0) this.f13579b, o2i0Var, pfj0Var);
        cai0.m32058a((cqi0) this.f13580c, pfj0Var.f177093b, o2i0Var);
    }

    /* JADX INFO: renamed from: e */
    public Size[] m25123e(Size[] sizeArr, int i) {
        List arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.f13579b) != null) {
            Size[] sizeArr2 = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList4.addAll(Arrays.asList(sizeArr2));
            }
        }
        b93 b93Var = (b93) this.f13580c;
        b93Var.getClass();
        if (((ExcludedSupportedSizesQuirk) rbr.f197650a.m76583e(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList = new ArrayList();
        } else {
            String str = b93Var.f24750b;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(4000, 3000));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList2 = new ArrayList();
                    if (str.equals("0") && (i == 34 || i == 35)) {
                        arrayList2.add(new Size(720, 720));
                        arrayList2.add(new Size(400, 400));
                    }
                } else if (ExcludedSupportedSizesQuirk.m180c()) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0")) {
                        if (i == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i == 34 || i == 35)) {
                        arrayList3.add(new Size(3264, 2448));
                        arrayList3.add(new Size(3264, 1836));
                        arrayList3.add(new Size(2448, 2448));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if (ExcludedSupportedSizesQuirk.m179b()) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0")) {
                        if (i == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i == 34 || i == 35)) {
                        arrayList3.add(new Size(2576, 1932));
                        arrayList3.add(new Size(2560, 1440));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList2 = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList2.add(new Size(9280, 6944));
                    }
                } else {
                    vie1.m85617F("ExcludedSupportedSizesQuirk");
                    arrayList = Collections.EMPTY_LIST;
                }
                arrayList = arrayList2;
            }
            arrayList = arrayList3;
        }
        if (!arrayList.isEmpty()) {
            arrayList4.removeAll(arrayList);
        }
        if (arrayList4.isEmpty()) {
            vie1.m85617F("OutputSizesCorrector");
        }
        return (Size[]) arrayList4.toArray(new Size[0]);
    }

    public boolean equals(Object obj) {
        switch (this.f13578a) {
            case 1:
                if (!(obj instanceof qqm0)) {
                    return false;
                }
                qqm0 qqm0Var = (qqm0) obj;
                Object obj2 = qqm0Var.f191620a;
                Object obj3 = this.f13579b;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    return false;
                }
                Object obj4 = qqm0Var.f191621b;
                Object obj5 = this.f13580c;
                return obj4 == obj5 || (obj4 != null && obj4.equals(obj5));
            default:
                return super.equals(obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m25124f() {
        ((cqi0) this.f13579b).m33617a();
        ((cqi0) this.f13580c).m33617a();
    }

    /* JADX INFO: renamed from: g */
    public boolean m25125g(o2i0 o2i0Var) {
        return ((cqi0) this.f13579b).m33618b(o2i0Var);
    }

    /* JADX INFO: renamed from: h */
    public Object m25126h(Object obj) {
        return ((twp0) this.f13579b).f224463b.mo30694b(this.f13580c, obj);
    }

    public int hashCode() {
        switch (this.f13578a) {
            case 1:
                Object obj = this.f13579b;
                int iHashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f13580c;
                return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    /* JADX INFO: renamed from: i */
    public ofo0 m25127i() {
        return new ofo0((kp7) this.f13579b, (er70) this.f13580c);
    }

    /* JADX INFO: renamed from: j */
    public void m25128j() {
        LinkedHashSet<View> linkedHashSet = (LinkedHashSet) this.f13580c;
        zx81 zx81Var = (zx81) this.f13579b;
        if (zx81Var != null) {
            for (View view : linkedHashSet) {
                if (view.getTag(R.id.view_tree_trampoline_scope) == zx81Var) {
                    view.setTag(R.id.view_tree_trampoline_scope, null);
                }
            }
        }
        linkedHashSet.clear();
    }

    /* JADX INFO: renamed from: k */
    public void m25129k() {
        m25128j();
        zx81 zx81Var = (zx81) this.f13579b;
        if (zx81Var == null) {
            return;
        }
        zx81Var.f287250i = true;
        while (true) {
            xx81 xx81Var = (xx81) zx81Var.f287248g.poll();
            if (xx81Var == null) {
                zx81Var.f287246e.mo26601e(null);
                return;
            }
            wx81 wx81Var = xx81Var.f266903b;
            wx81Var.f255968a = true;
            tf60 tf60Var = wx81Var.f255969b;
            if (tf60Var != null) {
                tf60Var.mo26601e(null);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public o9z m25130l() {
        List<ResolveInfo> listQueryIntentServices = ((PackageManager) this.f13579b).queryIntentServices(new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE), 64);
        if (!listQueryIntentServices.isEmpty()) {
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (((List) this.f13580c).contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    return new m9z(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                }
            }
        }
        return n9z.f151895a;
    }

    /* JADX INFO: renamed from: m */
    public yo01 m25131m(fq01 fq01Var) {
        yo01 yo01Var = (yo01) ((Map) ((wg61) this.f13580c).getValue()).get(fq01Var);
        if (yo01Var != null) {
            return yo01Var;
        }
        throw new NoSuchElementException("Destination with id " + fq01Var + " not found");
    }

    /* JADX INFO: renamed from: n */
    public nnc m25132n(boolean z) {
        Flowable flowable = (Flowable) this.f13579b;
        d0k[] d0kVarArr = bmu0.f28619a;
        onc oncVar = new onc(flowable);
        ia70 ia70Var = (ia70) this.f13580c;
        int i = 1;
        return xtm0.m92074U(mvl0.m62953p(new zux(oncVar, k0e1.m54985d(new ObservableFromPublisher(((Flowable) ia70Var.f100166b).m23331J(new pj70(ia70Var, 7)))), new u8k(3, i, null), i)), new o9k0(z, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public Object m25133o(ibk ibkVar) {
        vwm0 vwm0Var;
        if (ibkVar instanceof vwm0) {
            vwm0Var = (vwm0) ibkVar;
            int i = vwm0Var.f245509c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vwm0Var.f245509c = i - Integer.MIN_VALUE;
            } else {
                vwm0Var = new vwm0(this, ibkVar);
            }
        } else {
            vwm0Var = new vwm0(this, ibkVar);
        }
        Object objM86755t = vwm0Var.f245507a;
        int i2 = vwm0Var.f245509c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            yab yabVarM54985d = k0e1.m54985d(((vsk) this.f13579b).m86359b(((cxm0) this.f13580c).f43065a).toObservable());
            vwm0Var.f245509c = 1;
            objM86755t = vyf1.m86755t(yabVarM54985d, vwm0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return new fwh0((String) objM86755t);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: p */
    public Object m25134p(long j, String str, ibk ibkVar) {
        w8n0 w8n0Var;
        if (ibkVar instanceof w8n0) {
            w8n0Var = (w8n0) ibkVar;
            int i = w8n0Var.f248971c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w8n0Var.f248971c = i - Integer.MIN_VALUE;
            } else {
                w8n0Var = new w8n0(this, ibkVar);
            }
        } else {
            w8n0Var = new w8n0(this, ibkVar);
        }
        w8n0 w8n0Var2 = w8n0Var;
        Object objM76980u = w8n0Var2.f248969a;
        int i2 = w8n0Var2.f248971c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                long jM41665c = ((fhf) this.f13580c).m41665c();
                u37 u37Var = new u37(this, str, j, (fbk) null, 14);
                w8n0Var2.f248971c = 1;
                objM76980u = s1h1.m76980u(jM41665c, u37Var, w8n0Var2);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76980u);
            }
            hjc0 hjc0Var = (hjc0) objM76980u;
            if (hjc0Var instanceof fjc0) {
                return new Long(((fjc0) hjc0Var).f70159a);
            }
            if (!(hjc0Var instanceof gjc0) && hjc0Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m25135q(ehg1 ehg1Var) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f13580c;
        zx81 zx81Var = (zx81) this.f13579b;
        if (ehg1Var instanceof ybm0) {
            View view = ((ybm0) ehg1Var).f271217e;
            if (view == null || zx81Var == null) {
                return;
            }
            linkedHashSet.add(view);
            view.setTag(R.id.view_tree_trampoline_scope, zx81Var);
            return;
        }
        if (!(ehg1Var instanceof xbm0)) {
            if (ehg1Var instanceof zbm0) {
                m25128j();
            }
        } else {
            View view2 = ((xbm0) ehg1Var).f259948e;
            if (view2 == null || zx81Var == null) {
                return;
            }
            linkedHashSet.add(view2);
            view2.setTag(R.id.view_tree_trampoline_scope, zx81Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public pfj0 m25136r(o2i0 o2i0Var) {
        cqi0 cqi0Var = (cqi0) this.f13579b;
        pfj0 pfj0Var = (pfj0) cai0.m32059b(cqi0Var, o2i0Var);
        if (cqi0Var.m33625i()) {
            ((cqi0) this.f13580c).m33617a();
        }
        return pfj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public Object m25137s(String str, z650 z650Var, ibk ibkVar) {
        s0p0 s0p0Var;
        if (ibkVar instanceof s0p0) {
            s0p0Var = (s0p0) ibkVar;
            int i = s0p0Var.f204494d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s0p0Var.f204494d = i - Integer.MIN_VALUE;
            } else {
                s0p0Var = new s0p0(this, ibkVar);
            }
        } else {
            s0p0Var = new s0p0(this, ibkVar);
        }
        Object objM76980u = s0p0Var.f204492b;
        int i2 = s0p0Var.f204494d;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            d2n0 d2n0Var = new d2n0(this, str, (fbk) null, 24);
            s0p0Var.f204491a = z650Var;
            s0p0Var.f204494d = 1;
            objM76980u = s1h1.m76980u(10000L, d2n0Var, s0p0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z650Var = s0p0Var.f204491a;
            bga.m29073P(objM76980u);
        }
        if (objM76980u != null) {
            wek0.m87885d((wek0) this.f13579b, z650Var);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: t */
    public String m25138t(EventCardInfoResponse eventCardInfoResponse) {
        String string;
        Context context = (Context) this.f13579b;
        if (eventCardInfoResponse.m9743q() && eventCardInfoResponse.m9747u()) {
            string = context.getResources().getString(R.string.event_card_multiple_events_near_location_title, eventCardInfoResponse.m9744r());
        } else {
            string = eventCardInfoResponse.m9743q() ? context.getResources().getString(R.string.event_card_multiple_events_near_you_title) : context.getResources().getString(R.string.event_card_multiple_events_title);
        }
        wj50.m88279p(string);
        return string;
    }

    public String toString() {
        switch (this.f13578a) {
            case 1:
                StringBuilder sb = new StringBuilder("Pair{");
                sb.append(this.f13579b);
                sb.append(" ");
                return edb.m38568q(sb, this.f13580c, "}");
            case 8:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f13580c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f13579b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m25139u(q2i0 q2i0Var) {
        cqi0 cqi0Var = (cqi0) this.f13579b;
        Object objM33623g = ((cqi0) this.f13580c).m33623g(q2i0Var);
        if (objM33623g != null) {
            if (!(objM33623g instanceof jpi0)) {
                cai0.m32060c(cqi0Var, (o2i0) objM33623g, new rv70(q2i0Var, 12));
                return;
            }
            jpi0 jpi0Var = (jpi0) objM33623g;
            Object[] objArr = jpi0Var.f114675a;
            int i = jpi0Var.f114676b;
            for (int i2 = 0; i2 < i; i2++) {
                cai0.m32060c(cqi0Var, (o2i0) objArr[i2], new rv70(q2i0Var, 12));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public Object m25140v(String str, String str2, ibk ibkVar) {
        t3o0 t3o0Var;
        if (ibkVar instanceof t3o0) {
            t3o0Var = (t3o0) ibkVar;
            int i = t3o0Var.f216811c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3o0Var.f216811c = i - Integer.MIN_VALUE;
            } else {
                t3o0Var = new t3o0(this, ibkVar);
            }
        } else {
            t3o0Var = new t3o0(this, ibkVar);
        }
        Object objM82305a = t3o0Var.f216809a;
        int i2 = t3o0Var.f216811c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM82305a);
                u3o0 u3o0Var = (u3o0) this.f13579b;
                wdb1 wdb1VarM12025q = VerifyRequest.m12025q();
                wdb1VarM12025q.m87825r(str);
                wdb1VarM12025q.m87823m(str2);
                wdb1VarM12025q.m87824q((String) this.f13580c);
                VerifyRequest verifyRequest = (VerifyRequest) wdb1VarM12025q.build();
                t3o0Var.f216811c = 1;
                objM82305a = u3o0Var.m82305a(verifyRequest, t3o0Var);
                yuk yukVar = yuk.f276404a;
                if (objM82305a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM82305a);
            }
            return new ydb1(((VerifyResponse) objM82305a).m12027o());
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new xdb1(message);
        }
    }

    public /* synthetic */ a9i0(Object obj) {
        this.f13578a = 8;
        this.f13580c = obj;
        this.f13579b = new ArrayList();
    }

    public a9i0(d03 d03Var, l45 l45Var) {
        this.f13578a = 9;
        this.f13579b = d03Var;
        this.f13580c = new wg61(new wjk0(this, 25));
    }

    public a9i0(oh5 oh5Var, w2y0 w2y0Var, xre xreVar) {
        this.f13578a = 6;
        this.f13579b = oh5Var;
        this.f13580c = w2y0Var;
    }

    public a9i0(fju fjuVar, xre xreVar, y64 y64Var) {
        this.f13578a = 27;
        this.f13579b = fjuVar;
        this.f13580c = y64Var;
    }

    public a9i0(Context context) {
        this.f13578a = 14;
        this.f13579b = context.getPackageManager();
        this.f13580c = h6f.m46715L("com.spotify.music.canary", "com.spotify.music.debug", "com.spotify.music");
    }

    public a9i0(boolean z, int i) {
        zx81 zx81Var;
        this.f13578a = 16;
        luk lukVarMo40637Q = xsr.f265651a.mo40637Q(4);
        rb20 rb20Var = pvb0.f181680a.f197428f;
        if (z) {
            hvi0 hvi0Var = cks.f39079b;
            zx81Var = new zx81(lukVarMo40637Q, jwg1.m54449D(i, ils.MILLISECONDS), rb20Var);
        } else {
            zx81Var = null;
        }
        this.f13579b = zx81Var;
        this.f13580c = new LinkedHashSet();
    }

    public a9i0(gqa gqaVar) {
        this.f13578a = 10;
        this.f13580c = gqaVar;
    }

    public a9i0(String str) {
        this.f13578a = 13;
        this.f13579b = (ExtraSupportedOutputSizeQuirk) rbr.f197650a.m76583e(ExtraSupportedOutputSizeQuirk.class);
        this.f13580c = new b93(str, 5);
    }

    public a9i0(int i) {
        this.f13578a = i;
        switch (i) {
            case 3:
                this.f13579b = new cqi0();
                this.f13580c = new cqi0();
                break;
        }
    }
}
