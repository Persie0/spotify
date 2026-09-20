package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import com.spotify.profileconfig.proto.p131v1.AvatarsRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoAfterNext;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s18 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f204619a;

    /* JADX INFO: renamed from: b */
    public Object f204620b;

    /* JADX INFO: renamed from: c */
    public int f204621c;

    /* JADX INFO: renamed from: d */
    public Object f204622d;

    /* JADX INFO: renamed from: e */
    public Object f204623e;

    /* JADX INFO: renamed from: f */
    public Object f204624f;

    /* JADX INFO: renamed from: g */
    public Object f204625g;

    /* JADX INFO: renamed from: h */
    public Object f204626h;

    public s18(jb70 jb70Var, fbf0 fbf0Var, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        this.f204619a = 2;
        this.f204622d = jb70Var;
        this.f204623e = fbf0Var;
        this.f204624f = strArr;
        this.f204625g = strArr2;
        this.f204626h = strArr3;
        this.f204620b = str;
        this.f204621c = i;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Handler m76918a(s18 s18Var) {
        return (Handler) s18Var.f204624f;
    }

    /* JADX INFO: renamed from: b */
    public static final int m76919b(s18 s18Var, int i) {
        return Integer.valueOf(String.format(n9f.f151789a, "%06X", Arrays.copyOf(new Object[]{Integer.valueOf(((Context) s18Var.f204623e).getColor(i) & 16777215)}, 1)), 16).intValue();
    }

    /* JADX INFO: renamed from: c */
    public t18 m76920c() {
        String strM77250i = this.f204621c == 0 ? " registrationStatus" : "";
        if (((Long) this.f204625g) == null) {
            strM77250i = strM77250i.concat(" expiresInSecs");
        }
        if (((Long) this.f204626h) == null) {
            strM77250i = s571.m77250i(strM77250i, " tokenCreationEpochInSecs");
        }
        if (!strM77250i.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM77250i));
        }
        return new t18(this.f204621c, ((Long) this.f204625g).longValue(), ((Long) this.f204626h).longValue(), (String) this.f204620b, (String) this.f204622d, (String) this.f204623e, (String) this.f204624f);
    }

    /* JADX INFO: renamed from: d */
    public void m76921d() {
        int iM51849c = ((iww0) this.f204623e).m51849c((Context) this.f204620b);
        if (this.f204621c != iM51849c) {
            this.f204621c = iM51849c;
            ((i7s) ((ori) this.f204622d).f168570b).m49877b(this, iM51849c);
        }
    }

    /* JADX INFO: renamed from: e */
    public s4a0 m76922e() {
        String str = (String) this.f204620b;
        int i = this.f204621c;
        Single map = ((i == -1 && wl51.m88460J0((String) this.f204622d)) ? ((vsk) this.f204625g).m86360c(str).map(uty.f234030g).map(q2z.f184756i).firstOrError().onErrorReturn(r2z.f195288i) : Single.just(Integer.valueOf(i))).map(new drw(this, 23));
        rqr0 rqr0Var = (rqr0) this.f204624f;
        ma8 ma8VarM19846o = AvatarsRequest.m19846o();
        ma8VarM19846o.m61268m(str);
        return new s4a0(Single.zip(map, rqr0Var.m76261a((AvatarsRequest) ma8VarM19846o.build()).map(jsy.f115628i).map(new u6x(this, 27)), mly.f144974i).toObservable().map(hsy.f94855i).startWithItem(o3a0.f161331a).onErrorReturn(isy.f105359i), z3a0.f278852t, is80.f105171X0);
    }

    /* JADX INFO: renamed from: f */
    public iww0 m76923f() {
        return (iww0) this.f204623e;
    }

    /* JADX INFO: renamed from: g */
    public void m76924g(String str) {
        this.f204622d = str;
    }

    /* JADX INFO: renamed from: h */
    public void m76925h(long j) {
        this.f204625g = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: i */
    public void m76926i(String str) {
        this.f204620b = str;
    }

    /* JADX INFO: renamed from: j */
    public void m76927j(String str) {
        this.f204624f = str;
    }

    /* JADX INFO: renamed from: k */
    public void m76928k(String str) {
        this.f204623e = str;
    }

    /* JADX INFO: renamed from: l */
    public void m76929l(int i) {
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f204621c = i;
    }

    /* JADX INFO: renamed from: m */
    public void m76930m(long j) {
        this.f204626h = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: n */
    public int m76931n() {
        iww0 iww0Var = (iww0) this.f204623e;
        Context context = (Context) this.f204620b;
        this.f204621c = iww0Var.m51849c(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = iww0Var.f106524a;
        if ((i & 1) != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            kww0 kww0Var = new kww0(this);
            this.f204626h = kww0Var;
            connectivityManager.registerDefaultNetworkCallback(kww0Var);
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        o4a o4aVar = new o4a(this, 17);
        this.f204625g = o4aVar;
        context.registerReceiver(o4aVar, intentFilter, null, (Handler) this.f204624f);
        return this.f204621c;
    }

    /* JADX INFO: renamed from: o */
    public void m76932o(List list, w2z0 w2z0Var) {
        zv41 zv41Var = (zv41) this.f204622d;
        List list2 = ((upy0) zv41Var.getValue()).f232844b;
        int i = this.f204621c + 1;
        this.f204621c = i;
        czy0 czy0Var = (czy0) this.f204624f;
        czy0Var.f43662c = i;
        czy0Var.f43663d = 0L;
        czy0Var.f43666g = null;
        upy0 upy0Var = new upy0(i, list, w2z0Var, !wj50.m88271j(list, list2));
        zv41Var.getClass();
        zv41Var.m97091m(null, upy0Var);
    }

    public String toString() {
        switch (this.f204619a) {
            case 2:
                return ((jb70) this.f204622d) + " version=" + ((fbf0) this.f204623e);
            default:
                return super.toString();
        }
    }

    public s18(String str, int i, String str2, Context context, rqr0 rqr0Var, vsk vskVar) {
        this.f204619a = 1;
        this.f204620b = str;
        this.f204621c = i;
        this.f204622d = str2;
        this.f204623e = context;
        this.f204624f = rqr0Var;
        this.f204625g = vskVar;
        this.f204626h = new wg61(new ms40(this, 25));
    }

    public s18(kwt kwtVar, z2z0 z2z0Var, dzy0 dzy0Var, noa0 noa0Var) {
        this.f204619a = 4;
        this.f204620b = noa0Var;
        zv41 zv41VarM52819d = jag1.m52819d(new upy0(this.f204621c, lau.f131415a, null, false));
        this.f204622d = zv41VarM52819d;
        RecyclerView recyclerView = new RecyclerView(dzy0Var.getContext());
        this.f204623e = recyclerView;
        int i = 1;
        czy0 czy0Var = new czy0(recyclerView, new ptw0(i, z2z0Var, z2z0.class, "renderContentPresented", "renderContentPresented-Q-2MKTo(I)Z", 0, 0, 4));
        this.f204624f = czy0Var;
        FlowableDoAfterNext flowableDoAfterNext = new FlowableDoAfterNext(Flowable.m23311G(bmu0.m29895b(zv41VarM52819d)).m23358v(new vpy0(this, 0)), new vpy0(this, i));
        wpy0 wpy0Var = wpy0.f253865h;
        C2529wd c2529wd = new C2529wd(3, new ziq(flowableDoAfterNext.m23331J(new ti5(24)), kwtVar, noa0Var, 12));
        this.f204625g = c2529wd;
        this.f204626h = new hzy0(false, false);
        ok6 ok6Var = new ok6(this, 2);
        iq6 iq6Var = new iq6(this, 17);
        recyclerView.setId(R.id.search_content_recyclerview);
        recyclerView.m1018m(ok6Var);
        recyclerView.m1018m(iq6Var);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        p3h1.m69032r(recyclerView, new iwr0(recyclerView, i));
        dzy0Var.getContext();
        c2529wd.m87799p(recyclerView, new LinearLayoutManager(1), false);
        hjv0 hjv0Var = czy0Var.f43667h;
        C2262pn c2262pn = czy0Var.f43668i;
        if (hjv0Var != null) {
            hjv0Var.mo47722z(c2262pn);
        }
        hjv0 adapter = recyclerView.getAdapter();
        czy0Var.f43667h = adapter;
        if (adapter != null) {
            adapter.mo47719v(c2262pn);
        }
        dzy0Var.f54801c.add(czy0Var);
        new qv50(new ed61(recyclerView.getContext())).m73963i(recyclerView);
    }

    public s18(Context context, ori oriVar, iww0 iww0Var) {
        this.f204619a = 3;
        this.f204620b = context.getApplicationContext();
        this.f204622d = oriVar;
        this.f204623e = iww0Var;
        this.f204624f = h0b1.m46331s(null);
    }

    public s18() {
        this.f204619a = 0;
    }

    public s18(t18 t18Var) {
        this.f204619a = 0;
        this.f204620b = t18Var.f216171a;
        this.f204621c = t18Var.f216172b;
        this.f204622d = t18Var.f216173c;
        this.f204623e = t18Var.f216174d;
        this.f204625g = Long.valueOf(t18Var.f216175e);
        this.f204626h = Long.valueOf(t18Var.f216176f);
        this.f204624f = t18Var.f216177g;
    }
}
