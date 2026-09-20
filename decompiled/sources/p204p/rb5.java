package p204p;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.startup.StartupException;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.spotify.casita.p040v1.resolved.ResolvedHome;
import com.spotify.concertview.concertfeedview.p050v1.DateFilter;
import com.spotify.concertview.concertfeedview.p050v1.FeedFilter;
import com.spotify.concertview.concertfeedview.p050v1.GetFeedRequest;
import com.spotify.image.esperanto.proto.EsImage$ImageData;
import com.spotify.liveeventslocation.p099v1.userlocation.DeleteUserLocationRequest;
import com.spotify.liveeventsview.p100v2.liveeventsfeed.LocalDateRange;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class rb5 implements ck31, rlq, xra0, zmm0 {

    /* JADX INFO: renamed from: X */
    public static rb5 f197461X;

    /* JADX INFO: renamed from: Z */
    public static volatile rb5 f197463Z;

    /* JADX INFO: renamed from: e */
    public static volatile rb5 f197464e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197470a;

    /* JADX INFO: renamed from: b */
    public Object f197471b;

    /* JADX INFO: renamed from: c */
    public Object f197472c;

    /* JADX INFO: renamed from: d */
    public Object f197473d;

    /* JADX INFO: renamed from: f */
    public static final Object f197465f = new Object();

    /* JADX INFO: renamed from: g */
    public static final q2l f197466g = new q2l(0);

    /* JADX INFO: renamed from: h */
    public static final r2l f197467h = new r2l(0);

    /* JADX INFO: renamed from: i */
    public static final r4l f197468i = new r4l();

    /* JADX INFO: renamed from: t */
    public static final ui5 f197469t = new ui5(11);

    /* JADX INFO: renamed from: Y */
    public static final so3 f197462Y = new so3(22);

    public /* synthetic */ rb5(int i, Object obj, Object obj2) {
        this.f197470a = i;
        this.f197471b = obj;
        this.f197472c = obj2;
    }

    /* JADX INFO: renamed from: B */
    public static rb5 m75141B(Context context) {
        if (f197464e == null) {
            synchronized (f197465f) {
                try {
                    if (f197464e == null) {
                        f197464e = new rb5(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f197464e;
    }

    /* JADX INFO: renamed from: E */
    public static void m75142E(twy twyVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            twyVar.m81795R(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException unused) {
            haz.f89320X.m46952s();
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m75143s() {
        if (((Boolean) new ay0(27).invoke()).booleanValue()) {
            return;
        }
        haz hazVar = haz.f89320X;
        Thread.currentThread().getName();
        hazVar.m46947g();
    }

    /* JADX INFO: renamed from: t */
    public static final void m75144t() {
        if (((Boolean) new ay0(28).invoke()).booleanValue()) {
            return;
        }
        haz hazVar = haz.f89320X;
        Thread.currentThread().getName();
        hazVar.m46947g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public Object m75145A(String str, int i, int i2, vi5 vi5Var, ibk ibkVar) throws Throwable {
        olq olqVar;
        if (ibkVar instanceof olq) {
            olqVar = (olq) ibkVar;
            int i3 = olqVar.f166875c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                olqVar.f166875c = i3 - Integer.MIN_VALUE;
            } else {
                olqVar = new olq(this, ibkVar);
            }
        } else {
            olqVar = new olq(this, ibkVar);
        }
        Object objM89557A = olqVar.f166873a;
        int i4 = olqVar.f166875c;
        try {
            if (i4 == 0) {
                bga.m29073P(objM89557A);
                juk jukVar = ((c9k) this.f197473d).f35578a;
                plq plqVar = new plq(str, vi5Var, i, i2, this, null);
                olqVar.f166875c = 1;
                objM89557A = x0h1.m89557A(jukVar, plqVar, olqVar);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            return (EsImage$ImageData) objM89557A;
        } catch (CancellationException unused) {
            return null;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InterruptedException) {
                return null;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m75146C() {
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f197472c;
        ucj0 ucj0Var = (ucj0) this.f197473d;
        if (ucj0Var.m82777b("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        m540 m540VarM60828c = m540.m60828c(ucj0Var.m82782j("gcm.n.image"));
        if (m540VarM60828c != null) {
            m540VarM60828c.m60831f((ExecutorService) this.f197471b);
        }
        d97 d97VarM51258a = ipf.m51258a(firebaseMessagingService, ucj0Var);
        ktj0 ktj0Var = (ktj0) d97VarM51258a.f46706b;
        if (m540VarM60828c != null) {
            try {
                Bitmap bitmap = (Bitmap) bga.m29087i(m540VarM60828c.m60830e(), 5L, TimeUnit.SECONDS);
                ktj0Var.m57333l(bitmap);
                htj0 htj0Var = new htj0();
                htj0Var.m48584h(bitmap);
                htj0Var.m48583g();
                ktj0Var.m57338q(htj0Var);
            } catch (InterruptedException unused) {
                m540VarM60828c.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Objects.toString(e.getCause());
            } catch (TimeoutException unused2) {
                m540VarM60828c.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) firebaseMessagingService.getSystemService("notification")).notify((String) d97VarM51258a.f46707c, 0, ktj0Var.m57325c());
        return true;
    }

    /* JADX INFO: renamed from: D */
    public w2f0 m75147D() {
        w2f0 w2f0Var;
        if (((w2f0) this.f197473d) == null) {
            String strMo48710e = ((hv31) this.f197471b).mo48710e(x2f0.m89731a(), null);
            if (strMo48710e == null || (w2f0Var = (w2f0) ((fk60) this.f197472c).m41880a(strMo48710e, w2f0.Companion.serializer())) == null) {
                w2f0Var = new w2f0();
            }
            this.f197473d = w2f0Var;
        }
        w2f0 w2f0Var2 = (w2f0) this.f197473d;
        wj50.m88279p(w2f0Var2);
        return w2f0Var2;
    }

    /* JADX INFO: renamed from: F */
    public void m75148F(o2x0 o2x0Var, Throwable th) {
        String strM69093g;
        Object obj;
        String str = ((n7m) this.f197472c).f151186a;
        mcu0 mcu0Var = (mcu0) this.f197473d;
        qre0 qre0Var = (qre0) this.f197471b;
        if (o2x0Var != null && o2x0Var.f161171a.f149852O0 && (obj = o2x0Var.f161172b) != null) {
            k2h1.m55179l(qre0Var, ((ResolvedHome) obj).m5770r().m5778s(), bga.m29065H(o2x0Var), mcu0Var.m61499f(), str);
            return;
        }
        Integer numValueOf = o2x0Var != null ? Integer.valueOf(o2x0Var.f161171a.f149860d) : null;
        p3x0 p3x0Var = o2x0Var != null ? o2x0Var.f161173c : null;
        if (th != null) {
            strM69093g = th.toString();
        } else {
            strM69093g = p3x0Var != null ? p3x0Var.m69093g() : "";
        }
        k2h1.m55178k(qre0Var, str, numValueOf, strM69093g, mcu0Var.m61499f());
    }

    /* JADX INFO: renamed from: G */
    public void m75149G(Object[] objArr) {
        av51 av51Var = new av51();
        System.currentTimeMillis();
        av51Var.m27226c((zu51) this.f197472c);
        Thread.currentThread().getName();
        av51Var.m27225b(objArr);
        ((Queue) this.f197473d).add(av51Var);
    }

    /* JADX INFO: renamed from: H */
    public void m75150H(Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            m75149G(new Object[]{obj});
        } else {
            m75149G(new Object[]{obj, obj2});
        }
    }

    /* JADX INFO: renamed from: I */
    public void m75151I(jmr0 jmr0Var, boolean z) {
        boolean zEquals;
        SharedPreferences sharedPreferences = ((C2011jd) this.f197472c).f111211a;
        jmr0 jmr0Var2 = (jmr0) this.f197473d;
        this.f197473d = jmr0Var;
        if (z) {
            if (jmr0Var != null) {
                JSONObject jSONObjectM53791c = jmr0Var.m53791c();
                if (jSONObjectM53791c != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectM53791c.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (jmr0Var2 == null) {
            zEquals = jmr0Var == null;
        } else {
            zEquals = jmr0Var2.equals(jmr0Var);
        }
        if (zEquals) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", jmr0Var2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", jmr0Var);
        ((aba0) this.f197471b).m25344c(intent);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: a */
    public void mo27132a(Object obj) {
        m75149G(new Object[]{obj});
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p204p.rlq
    /* JADX INFO: renamed from: b */
    public Object mo62238b(String str, int i, int i2, ibk ibkVar) throws Throwable {
        qlq qlqVar;
        if (ibkVar instanceof qlq) {
            qlqVar = (qlq) ibkVar;
            int i3 = qlqVar.f189900c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qlqVar.f189900c = i3 - Integer.MIN_VALUE;
            } else {
                qlqVar = new qlq(this, ibkVar);
            }
        } else {
            qlqVar = new qlq(this, ibkVar);
        }
        qlq qlqVar2 = qlqVar;
        Object objM75145A = qlqVar2.f189898a;
        int i4 = qlqVar2.f189900c;
        if (i4 == 0) {
            bga.m29073P(objM75145A);
            String str2 = new String(Base64.decode(str, 0), vuc.f244913a);
            try {
                if (new URI(str2).getScheme() == null) {
                    str2 = "spotify:image:".concat(str2);
                }
            } catch (URISyntaxException unused) {
                str2 = "spotify:image:".concat(str2);
            }
            String str3 = str2;
            vi5 vi5Var = (vi5) this.f197472c;
            qlqVar2.f189900c = 1;
            objM75145A = m75145A(str3, i, i2, vi5Var, qlqVar2);
            Object obj = yuk.f276404a;
            if (objM75145A == obj) {
                return obj;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM75145A);
        }
        EsImage$ImageData esImage$ImageData = (EsImage$ImageData) objM75145A;
        Float fM74179I = esImage$ImageData != null ? qyg1.m74179I(esImage$ImageData.m12010q()) : null;
        if (esImage$ImageData == null || esImage$ImageData.m12009p() != 0) {
            return null;
        }
        int i5 = nlq.f155130a[esImage$ImageData.m12011r().ordinal()];
        fsk fskVar = fsk.f72885d;
        if (i5 != 1) {
            if (i5 == 2) {
                fskVar = fsk.f72882a;
            } else if (i5 == 3) {
                fskVar = fsk.f72883b;
            } else if (i5 == 4) {
                fskVar = fsk.f72884c;
            }
        }
        return new l540(esImage$ImageData.getData().mo34019p(), fskVar, fM74179I);
    }

    @Override // p204p.zmm0
    /* JADX INFO: renamed from: c */
    public Observable mo24811c() {
        ly11 ly11Var = (ly11) this.f197472c;
        return Observable.merge(ly11Var.mo2758g().f28895a, k0e1.m54988g(ly11Var.f137932a, dau.f47107a).switchMap(new k0a0(this, 5)).distinctUntilChanged());
    }

    @Override // p204p.ck31
    public void cancel() {
        switch (this.f197470a) {
            case 9:
                ((ck31) this.f197471b).cancel();
                break;
            case 10:
            default:
                ((fgx) ((qp4) this.f197473d).f191127e).cancel();
                break;
            case 11:
                kk40.m56680v((c9k) this.f197473d, null);
                break;
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: d */
    public void mo27133d(String str, Object obj, Object obj2) {
        m75150H(obj, obj2);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: e */
    public void mo27134e(String str) {
        m75149G(null);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: f */
    public void mo27135f(String str, Object... objArr) {
        if (f3h1.m40686k(objArr) != null) {
            m75149G(f3h1.m40695t(objArr));
        } else {
            m75149G(objArr);
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: g */
    public void mo27136g(Exception exc, String str) {
        m75149G(null);
    }

    @Override // p204p.xra0
    public String getName() {
        return (String) this.f197471b;
    }

    @Override // p204p.ck31
    public wt31 getSource() {
        switch (this.f197470a) {
            case 9:
                return (vuu0) this.f197472c;
            default:
                return (dgx) this.f197472c;
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: h */
    public boolean mo27137h() {
        return true;
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: i */
    public void mo27138i(String str, Integer num, Object obj) {
        m75150H(num, obj);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: j */
    public void mo27139j(String str, Throwable th) {
        m75149G(null);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: k */
    public void mo27140k(Object obj, Exception exc) {
        m75150H(obj, exc);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: l */
    public void mo27141l(Object obj, String str) {
        m75149G(new Object[]{obj});
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: m */
    public void mo27142m(Object obj, String str) {
        m75149G(new Object[]{obj});
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: n */
    public void mo27143n(Object... objArr) {
        if (f3h1.m40686k(objArr) != null) {
            m75149G(f3h1.m40695t(objArr));
        } else {
            m75149G(objArr);
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: o */
    public void mo27144o(String str) {
        m75149G(null);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: p */
    public void mo27145p(String str) {
        m75149G(null);
    }

    @Override // p204p.ck31
    /* JADX INFO: renamed from: q */
    public ai21 mo33068q() {
        switch (this.f197470a) {
            case 9:
                return (tuu0) this.f197473d;
            default:
                return (cgx) this.f197471b;
        }
    }

    /* JADX INFO: renamed from: r */
    public rb5 m75152r(InterfaceC2207oa interfaceC2207oa) {
        rb5 rb5Var = new rb5((eta0) this.f197471b, 18);
        rb5Var.f197472c = new rb5(interfaceC2207oa);
        return new rb5(rb5Var);
    }

    public String toString() {
        switch (this.f197470a) {
            case 7:
                return (String) this.f197471b;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public Object m75153u(int i, ibk ibkVar) {
        hl90 hl90Var;
        if (ibkVar instanceof hl90) {
            hl90Var = (hl90) ibkVar;
            int i2 = hl90Var.f92654c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hl90Var.f92654c = i2 - Integer.MIN_VALUE;
            } else {
                hl90Var = new hl90(this, ibkVar);
            }
        } else {
            hl90Var = new hl90(this, ibkVar);
        }
        Object objM36400c = hl90Var.f92652a;
        int i3 = hl90Var.f92654c;
        if (i3 == 0) {
            bga.m29073P(objM36400c);
            ppq ppqVarM13051o = DeleteUserLocationRequest.m13051o();
            ppqVarM13051o.m70596m(String.valueOf(i));
            DeleteUserLocationRequest deleteUserLocationRequest = (DeleteUserLocationRequest) ppqVarM13051o.build();
            dm90 dm90Var = (dm90) this.f197471b;
            wj50.m88279p(deleteUserLocationRequest);
            hl90Var.f92654c = 1;
            objM36400c = dm90Var.m36400c(deleteUserLocationRequest, hl90Var);
            yuk yukVar = yuk.f276404a;
            if (objM36400c == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM36400c);
        }
        o2x0 o2x0Var = (o2x0) objM36400c;
        if (o2x0Var.f161171a.f149852O0) {
            return w2a1.f247311a;
        }
        throw new HttpException(o2x0Var);
    }

    /* JADX INFO: renamed from: v */
    public ft30 m75154v(fk30 fk30Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f197472c;
        fk30Var.getClass();
        ft30 ft30Var = (ft30) identityHashMap.get(fk30Var);
        if (ft30Var != null) {
            return ft30Var;
        }
        ft30 ft30VarM42577c = ft30.m42577c(fk30Var, (sk30) this.f197471b);
        identityHashMap.put(fk30Var, ft30VarM42577c);
        ((IdentityHashMap) this.f197473d).put(ft30VarM42577c.m42579b(), fk30Var);
        return ft30VarM42577c;
    }

    /* JADX INFO: renamed from: w */
    public void m75155w(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f197472c;
        String string = ((Context) this.f197473d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (ar40.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m75156x((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public Object m75156x(Class cls, HashSet hashSet) {
        Object objMo595b;
        HashMap map = (HashMap) this.f197471b;
        if (k0e1.m54969D()) {
            try {
                fn1.m42176e(k0e1.m54980O(cls.getSimpleName()));
            } catch (Throwable th) {
                fn1.m42178g();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo595b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                ar40 ar40Var = (ar40) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo594a = ar40Var.mo594a();
                if (!listMo594a.isEmpty()) {
                    for (Class cls2 : listMo594a) {
                        if (!map.containsKey(cls2)) {
                            m75156x(cls2, hashSet);
                        }
                    }
                }
                objMo595b = ar40Var.mo595b((Context) this.f197473d);
                hashSet.remove(cls);
                map.put(cls, objMo595b);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        fn1.m42178g();
        return objMo595b;
    }

    /* JADX INFO: renamed from: y */
    public boolean m75157y(Object obj) {
        eta0 eta0Var = (eta0) this.f197471b;
        if (eta0Var instanceof cta0) {
            boolean zAccept = ((cta0) eta0Var).f41821a.accept(obj);
            rb5 rb5Var = (rb5) this.f197472c;
            if (rb5Var != null) {
                return zAccept && rb5Var.m75157y(obj);
            }
            rb5 rb5Var2 = (rb5) this.f197473d;
            if (rb5Var2 != null) {
                return zAccept || rb5Var2.m75157y(obj);
            }
            return zAccept;
        }
        if (!(eta0Var instanceof dta0)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean zM75157y = ((dta0) eta0Var).m36846a().m75157y(obj);
        rb5 rb5Var3 = (rb5) this.f197472c;
        if (rb5Var3 != null && !zM75157y) {
            return false;
        }
        rb5 rb5Var4 = (rb5) this.f197473d;
        if (rb5Var4 != null && zM75157y) {
            return true;
        }
        if (rb5Var3 != null) {
            return rb5Var3.m75157y(obj);
        }
        return rb5Var4 != null ? rb5Var4.m75157y(obj) : zM75157y;
    }

    /* JADX INFO: renamed from: z */
    public Object m75158z(Integer num, LocalDateRange localDateRange, ArrayList arrayList, x13 x13Var) {
        w810 w810VarM7254q = GetFeedRequest.m7254q();
        w810VarM7254q.m87434r();
        w810VarM7254q.m87432m(nje.EDITORIAL_SHELF_CTA_V1);
        if (((ugi) this.f197473d).f230173c) {
            w810VarM7254q.m87432m(nje.LEF_MIXED_CAROUSEL_CONTENT_V1);
        }
        if (localDateRange != null || num != null || !arrayList.isEmpty()) {
            oiy oiyVarM7241q = FeedFilter.m7241q();
            if (localDateRange != null) {
                ilo iloVarM7237p = DateFilter.m7237p();
                iloVarM7237p.m51037q(localDateRange.m13065q());
                iloVarM7237p.m51036m(localDateRange.m13064p());
                oiyVarM7241q.m67066r((DateFilter) iloVarM7237p.build());
            }
            if (num != null) {
                oiyVarM7241q.m67065q(String.valueOf(num.intValue()));
            }
            if (!arrayList.isEmpty()) {
                oiyVarM7241q.m67064m(arrayList);
            }
            w810VarM7254q.m87433q((FeedFilter) oiyVarM7241q.build());
        }
        return ((oai) this.f197472c).m66568a((GetFeedRequest) w810VarM7254q.build(), x13Var);
    }

    public /* synthetic */ rb5(Object obj, int i) {
        this.f197470a = i;
        this.f197471b = obj;
    }

    public /* synthetic */ rb5(Object obj, Object obj2, Object obj3, int i) {
        this.f197470a = i;
        this.f197471b = obj;
        this.f197472c = obj2;
        this.f197473d = obj3;
    }

    public rb5(xdd0 xdd0Var, ow6 ow6Var) {
        this.f197470a = 13;
        this.f197471b = xdd0Var;
        this.f197472c = ow6Var;
        this.f197473d = new njs(this);
    }

    public rb5(String str) {
        Matcher matcher;
        zm91 zm91Var;
        this.f197470a = 7;
        this.f197471b = str;
        zm91[] zm91VarArrValues = zm91.values();
        int iM31820L = c95.m31820L(zm91VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        int i = 0;
        for (zm91 zm91Var2 : zm91VarArrValues) {
            linkedHashMap.put(zm91Var2, Pattern.compile("(spotify:artist:([a-zA-Z0-9]+))" + zm91Var2.m96419a()));
        }
        this.f197473d = linkedHashMap;
        zm91[] zm91VarArrValues2 = zm91.values();
        int length = zm91VarArrValues2.length;
        Matcher matcher2 = null;
        while (true) {
            if (i >= length) {
                matcher = matcher2;
                zm91Var = null;
                break;
            }
            zm91Var = zm91VarArrValues2[i];
            Object obj = ((LinkedHashMap) this.f197473d).get(zm91Var);
            wj50.m88279p(obj);
            matcher = ((Pattern) obj).matcher((String) this.f197471b);
            if (matcher.find()) {
                break;
            }
            i++;
            matcher2 = matcher;
        }
        if (zm91Var == null) {
            throw new IllegalArgumentException("Specified artistUri doesn't match any type");
        }
        if (matcher == null) {
            wj50.m88260d0("matcher");
            throw null;
        }
        String strGroup = matcher.group(2);
        wj50.m88279p(strGroup);
        this.f197472c = strGroup;
    }

    public rb5(p4p p4pVar, oh4 oh4Var) {
        this.f197470a = 6;
        this.f197471b = p4pVar;
        this.f197472c = oh4Var;
        this.f197473d = new fj1(this, 16);
    }

    public rb5(ud80 ud80Var, z5f z5fVar, bii0 bii0Var) {
        this.f197470a = 10;
        this.f197471b = ud80Var;
        this.f197472c = z5fVar;
        this.f197473d = new wg61(new b8b(bii0Var, 7));
    }

    public rb5(ViewGroup viewGroup, View view, e940 e940Var, List list) {
        this.f197470a = 20;
        this.f197471b = view;
        p100 p100VarM68757b = p100.m68757b(LayoutInflater.from(viewGroup.getContext()));
        this.f197473d = p100VarM68757b;
        u100 u100Var = new u100(e940Var);
        RecyclerView recyclerView = p100VarM68757b.f172909c;
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(Integer.min(3, list.size())));
        recyclerView.m1011i(new w8c(view.getResources().getDimensionPixelSize(R.dimen.spacer_4), 13));
        recyclerView.setAdapter(u100Var);
        u100Var.m82137A(list);
        PopupWindow popupWindow = new PopupWindow(p100VarM68757b.m68758a(), -2, -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOnDismissListener(q100.f184148a);
        this.f197472c = popupWindow;
        p100VarM68757b.m68758a().setOnTouchListener(new azp(this, 3));
    }

    public rb5(int i) {
        this.f197470a = i;
        switch (i) {
            case 15:
                break;
            default:
                this.f197471b = new pku(new yzl(0.3f, 0.0f, 0.0f, 1.0f), new yzl(0.3f, 0.0f, 0.4f, 1.0f), new yzl(0.0f, 0.0f, 0.0f, 1.0f));
                this.f197472c = new pku(new yzl(1.0f, 0.0f, 0.7f, 1.0f), new yzl(0.6f, 0.0f, 0.7f, 1.0f), new yzl(1.0f, 0.0f, 1.0f, 1.0f));
                this.f197473d = new pku(new yzl(0.3f, 0.0f, 0.7f, 1.0f), new yzl(0.3f, 0.0f, 0.7f, 1.0f), new yzl(0.3f, 0.0f, 0.7f, 1.0f));
                break;
        }
    }

    public rb5(HashMap map, HashMap map2, HashMap map3, String str, String str2, String str3) {
        this.f197470a = 3;
        this.f197471b = map;
        this.f197472c = map2;
        this.f197473d = map3;
    }

    public rb5(sk30 sk30Var) {
        this.f197470a = 22;
        this.f197471b = sk30Var;
        this.f197472c = new IdentityHashMap();
        this.f197473d = new IdentityHashMap();
    }

    public rb5(qre0 qre0Var, n7m n7mVar, mcu0 mcu0Var, xre xreVar) {
        this.f197470a = 16;
        this.f197471b = qre0Var;
        this.f197472c = n7mVar;
        this.f197473d = mcu0Var;
    }

    public rb5(ExecutorService executorService, ExecutorService executorService2) {
        this.f197470a = 2;
        this.f197471b = new q4l(executorService);
        this.f197472c = new q4l(executorService);
        bga.m29102x(null);
        this.f197473d = new q4l(executorService2);
    }

    public rb5(w440 w440Var, vi5 vi5Var, luk lukVar) {
        this.f197470a = 11;
        this.f197471b = w440Var;
        this.f197472c = vi5Var;
        this.f197473d = dq60.m36621u(lukVar);
    }

    public rb5(vei0 vei0Var, ly11 ly11Var) {
        this.f197470a = 27;
        this.f197471b = vei0Var;
        this.f197472c = ly11Var;
        this.f197473d = new p69();
    }

    public rb5(ck31 ck31Var) {
        this.f197470a = 9;
        this.f197471b = ck31Var;
        this.f197472c = kif1.m56500i(ck31Var.getSource());
        this.f197473d = kif1.m56499h(ck31Var.mo33068q());
    }

    public rb5(twy twyVar) {
        this.f197470a = 1;
        this.f197472c = null;
        this.f197473d = null;
        this.f197471b = twyVar;
    }

    public rb5(FirebaseMessagingService firebaseMessagingService, ucj0 ucj0Var, ExecutorService executorService) {
        this.f197470a = 12;
        this.f197471b = executorService;
        this.f197472c = firebaseMessagingService;
        this.f197473d = ucj0Var;
    }

    public rb5(Context context) {
        this.f197470a = 0;
        this.f197473d = context.getApplicationContext();
        this.f197472c = new HashSet();
        this.f197471b = new HashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rb5(InterfaceC2207oa interfaceC2207oa) {
        this(new cta0(interfaceC2207oa), 18);
        this.f197470a = 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rb5(rb5 rb5Var) {
        this(new dta0(rb5Var), 18);
        this.f197470a = 18;
    }

    public rb5(qp4 qp4Var) {
        this.f197470a = 17;
        this.f197473d = qp4Var;
        fgx fgxVar = (fgx) qp4Var.f191127e;
        this.f197471b = new cgx(qp4Var, fgxVar.mo41636i().mo33068q(), -1L, true);
        this.f197472c = new dgx(qp4Var, fgxVar.mo41636i().getSource(), -1L, true);
    }
}
