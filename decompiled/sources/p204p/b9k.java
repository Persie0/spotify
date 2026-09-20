package p204p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.spotify.rcs.resolver.grpc.p141v0.ResolveRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public final class b9k implements z8k, yaw0 {

    /* JADX INFO: renamed from: a */
    public Object f24955a;

    /* JADX INFO: renamed from: b */
    public Object f24956b;

    /* JADX INFO: renamed from: c */
    public final Object f24957c;

    /* JADX INFO: renamed from: d */
    public final Object f24958d;

    /* JADX INFO: renamed from: e */
    public final Object f24959e;

    /* JADX INFO: renamed from: f */
    public Object f24960f;

    /* JADX INFO: renamed from: g */
    public Object f24961g;

    /* JADX INFO: renamed from: h */
    public Object f24962h;

    public b9k(tyb0 tyb0Var, Context context, GoogleMapOptions googleMapOptions) {
        this.f24957c = new c4d1(this, 6);
        this.f24962h = new ArrayList();
        this.f24958d = tyb0Var;
        this.f24959e = context;
        this.f24961g = googleMapOptions;
    }

    /* JADX INFO: renamed from: e */
    public static final hgm m28481e(b9k b9kVar, String str, eh00 eh00Var) {
        t150 t150Var = (t150) b9kVar.f24955a;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) b9kVar.f24959e;
        pp91 pp91Var = (pp91) b9kVar.f24961g;
        if ((pp91Var instanceof gu41) || (pp91Var instanceof fu41)) {
            String str2 = (String) b9kVar.f24962h;
            if (str2 != null) {
                throw new IllegalStateException(dq60.m36615o("[Quasar][", str2, "] Service ", str, " created after shutdown invoked").toString());
            }
            wj50.m88260d0("scopeName");
            throw null;
        }
        nlv0 nlv0Var = new nlv0();
        m28484k(reentrantReadWriteLock, new a9k(nlv0Var, b9kVar, str, 0));
        if (nlv0Var.f155174a) {
            String str3 = (String) b9kVar.f24962h;
            if (str3 != null) {
                throw new IllegalStateException(dq60.m36615o("[Quasar][", str3, "] Service ", str, " already started").toString());
            }
            wj50.m88260d0("scopeName");
            throw null;
        }
        long jMo36757c = t150Var.mo36757c();
        wa81 wa81Var = (wa81) b9kVar.f24957c;
        String str4 = (String) b9kVar.f24962h;
        if (str4 == null) {
            wj50.m88260d0("scopeName");
            throw null;
        }
        String strM56834f = klh.m56834f(str4, "_", str);
        try {
            wa81Var.mo53785e(2, strM56834f, "qss");
            Object objInvoke = eh00Var.invoke();
            wa81Var.mo53786f(strM56834f, "qss");
            hgm hgmVar = (hgm) objInvoke;
            long jMo36757c2 = t150Var.mo36757c() - jMo36757c;
            pp91 pp91Var2 = (pp91) b9kVar.f24961g;
            if (pp91Var2 instanceof ys41) {
                ((ys41) pp91Var2).f275685f.add(new u6d0(1, jMo36757c, jMo36757c2, str));
            }
            a9k a9kVar = new a9k(b9kVar, str, hgmVar);
            try {
                reentrantReadWriteLock.writeLock().lock();
                a9kVar.invoke();
                reentrantReadWriteLock.writeLock().unlock();
                m28484k(reentrantReadWriteLock, new r7i(b9kVar, str));
                return hgmVar;
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            wa81Var.mo53786f(strM56834f, "qss");
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static izh m28482f(b9k b9kVar, ovf ovfVar) {
        Flowable flowable = (Flowable) b9kVar.f24955a;
        n011 n011Var = (n011) b9kVar.f24956b;
        hzj hzjVar = (hzj) b9kVar.f24957c;
        e6a0 e6a0Var = (e6a0) b9kVar.f24959e;
        luk lukVar = (luk) b9kVar.f24961g;
        hc80 hc80Var = (hc80) b9kVar.f24962h;
        fmu0 fmu0Var = (fmu0) b9kVar.f24958d;
        d0k[] d0kVarArr = bmu0.f28619a;
        return new izh(flowable, n011Var, hzjVar, ovfVar, e6a0Var, lukVar, hc80Var, fmu0Var, xtm0.m92074U(mvl0.m62953p(new uxc0(new onc(flowable), 22)), new zf01((fbk) null, b9kVar, 1)));
    }

    /* JADX INFO: renamed from: j */
    public static void m28483j(tyb0 tyb0Var) {
        uj10 uj10Var = uj10.f230858e;
        Context context = tyb0Var.getContext();
        int iM85679c = uj10Var.m85679c(context, vj10.f241853a);
        String strM46649c = h4f1.m46649c(context, iM85679c);
        String strM46651e = h4f1.m46651e(context, iM85679c);
        LinearLayout linearLayout = new LinearLayout(tyb0Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        tyb0Var.addView(linearLayout);
        TextView textView = new TextView(tyb0Var.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strM46649c);
        linearLayout.addView(textView);
        Intent intentM85678a = uj10Var.m85678a(iM85679c, context, null);
        if (intentM85678a != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strM46651e);
            linearLayout.addView(button);
            button.setOnClickListener(new qvb(2, context, intentM85678a));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m28484k(ReentrantReadWriteLock reentrantReadWriteLock, eh00 eh00Var) {
        try {
            reentrantReadWriteLock.readLock().lock();
            eh00Var.invoke();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // p204p.yaw0
    /* JADX INFO: renamed from: a */
    public Single mo28485a() {
        C2529wd c2529wd = (C2529wd) this.f24958d;
        c2529wd.getClass();
        return Single.fromCallable(new i751(c2529wd, 0)).subscribeOn(Schedulers.f10370c);
    }

    @Override // p204p.yaw0
    /* JADX INFO: renamed from: b */
    public Single mo28486b(int i) {
        ResolveRequest resolveRequestM72871a = qii.m72871a(i, (y6q0) this.f24959e);
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H("RCS");
        utu0Var.m83941I("Request: " + resolveRequestM72871a, new Object[0]);
        Single singleDoOnError = ((y0x0) this.f24956b).m92606b(resolveRequestM72871a).doOnSubscribe(new s651(this, 18)).doOnSuccess((b331) this.f24962h).compose(new p4l0(3)).doOnSuccess(new oh7(this, i, 1)).doOnError(u9w0.f228294Z).doOnError(new qh7(this, i, 2));
        yty ytyVar = (yty) this.f24955a;
        ytyVar.getClass();
        return singleDoOnError.flatMap(new wfx(ytyVar, 4)).onErrorReturnItem(msy.f146877a).subscribeOn(Schedulers.f10370c);
    }

    @Override // p204p.yaw0
    /* JADX INFO: renamed from: c */
    public void mo28487c(Context context) {
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H("RCS");
        utu0Var.m83942J("Calling unscheduleRecurringSyncUsingWorkManager on UnauthFetcher does nothing.", new Object[0]);
    }

    @Override // p204p.yaw0
    /* JADX INFO: renamed from: d */
    public Completable mo28488d() {
        CompletableEmpty completableEmpty = CompletableEmpty.f7437a;
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H("RCS");
        utu0Var.m83942J("Calling onReconnect on UnauthFetcher does nothing.", new Object[0]);
        return completableEmpty;
    }

    /* JADX INFO: renamed from: g */
    public t050 m28489g(String str, eh00 eh00Var) {
        return new t050(new z9b(this, str, eh00Var, 24));
    }

    /* JADX INFO: renamed from: h */
    public v050 m28490h(String str, eh00 eh00Var) {
        return new v050(new z9b(this, str, eh00Var));
    }

    /* JADX INFO: renamed from: i */
    public void m28491i() {
        w3f1 w3f1Var = new w3f1(this);
        if (((g7d1) this.f24955a) != null) {
            w3f1Var.m87109a();
            return;
        }
        if (((LinkedList) this.f24956b) == null) {
            this.f24956b = new LinkedList();
        }
        ((LinkedList) this.f24956b).add(w3f1Var);
        c4d1 c4d1Var = (c4d1) this.f24957c;
        this.f24960f = c4d1Var;
        ArrayList arrayList = (ArrayList) this.f24962h;
        Context context = (Context) this.f24959e;
        if (c4d1Var == null || ((g7d1) this.f24955a) != null) {
            return;
        }
        try {
            jkc0.m53608t(context);
            ykg1 ykg1VarM54443k2 = y85.m93054K(context).m54443k2(new imk0(context), (GoogleMapOptions) this.f24961g);
            if (ykg1VarM54443k2 == null) {
                return;
            }
            ((c4d1) this.f24960f).m31439f(new g7d1((tyb0) this.f24958d, ykg1VarM54443k2));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((g7d1) this.f24955a).m43808g((b9b1) it.next());
            }
            arrayList.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    public b9k(C2529wd c2529wd, b9a b9aVar, w8b w8bVar, w601 w601Var) {
        pc5 pc5Var = w601Var.f248225b;
        y0x0 y0x0VarM30851a = bxq0.m30851a(jhl0.m53425s(w8bVar));
        si5 si5Var = new si5(3);
        y6q0 y6q0Var = w601Var.f248226c;
        this.f24955a = uty.m83962a(c2529wd);
        this.f24956b = y0x0VarM30851a;
        this.f24957c = si5Var;
        this.f24958d = c2529wd;
        this.f24959e = y6q0Var;
        this.f24960f = new AtomicLong(0L);
        this.f24961g = new nii(c2529wd, new n250(b9aVar, pc5Var, y6q0Var, 1));
        this.f24962h = new b331(this, 2);
    }

    public b9k(cnh0 cnh0Var, bxb bxbVar, e940 e940Var, InterfaceC2609yd interfaceC2609yd, idd1 idd1Var, aum aumVar, ComposeView composeView) {
        this.f24955a = cnh0Var;
        this.f24956b = bxbVar;
        this.f24957c = e940Var;
        this.f24958d = interfaceC2609yd;
        this.f24959e = idd1Var;
        this.f24960f = aumVar;
        this.f24961g = jag1.m52819d(null);
        this.f24962h = jag1.m52819d(Boolean.FALSE);
        composeView.setContent(rkk.m75763o(new ej20(this, 2), true, 1090796706));
    }

    public b9k(sk30 sk30Var) {
        this.f24958d = new uq30();
        this.f24959e = jg31.m53280s(new skp(this, 15));
        this.f24962h = new tq30(this);
        sk30Var.getClass();
        rb5 rb5Var = new rb5(sk30Var);
        this.f24957c = rb5Var;
        ui30 ui30Var = new ui30(this, rb5Var);
        this.f24956b = ui30Var;
        this.f24955a = new x4b(sk30Var, rb5Var, ui30Var);
    }

    public b9k(t150 t150Var, Map map, boolean z) {
        Object obj = z ? wv4.f255393a : jmj0.f113900a;
        this.f24955a = t150Var;
        this.f24956b = map;
        this.f24957c = obj;
        this.f24958d = new LinkedHashMap();
        this.f24959e = new ReentrantReadWriteLock();
        this.f24960f = lau.f131415a;
        this.f24961g = wt41.f254823e;
    }

    public b9k(Flowable flowable, n011 n011Var, hzj hzjVar, fmu0 fmu0Var, e6a0 e6a0Var, cr01 cr01Var, luk lukVar, hc80 hc80Var) {
        this.f24955a = flowable;
        this.f24956b = n011Var;
        this.f24957c = hzjVar;
        this.f24958d = fmu0Var;
        this.f24959e = e6a0Var;
        this.f24960f = cr01Var;
        this.f24961g = lukVar;
        this.f24962h = hc80Var;
    }
}
