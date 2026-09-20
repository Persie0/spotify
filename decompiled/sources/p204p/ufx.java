package p204p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ufx implements hr91 {

    /* JADX INFO: renamed from: L0 */
    public final String f229889L0;

    /* JADX INFO: renamed from: M0 */
    public final n7m f229890M0;

    /* JADX INFO: renamed from: N0 */
    public final boolean f229891N0;

    /* JADX INFO: renamed from: O0 */
    public final lqi0 f229892O0;

    /* JADX INFO: renamed from: P0 */
    public final ts21 f229893P0;

    /* JADX INFO: renamed from: Q0 */
    public final xp4 f229894Q0;

    /* JADX INFO: renamed from: R0 */
    public final RecyclerView f229895R0;

    /* JADX INFO: renamed from: S0 */
    public final SwipeRefreshLayout f229896S0;

    /* JADX INFO: renamed from: T0 */
    public swd1 f229897T0;

    /* JADX INFO: renamed from: U0 */
    public final v290 f229898U0;

    /* JADX INFO: renamed from: V0 */
    public Bundle f229899V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f229900W0;

    /* JADX INFO: renamed from: X */
    public final vd61 f229901X;

    /* JADX INFO: renamed from: X0 */
    public ebg0 f229902X0;

    /* JADX INFO: renamed from: Y */
    public final kv91 f229903Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f229904Y0;

    /* JADX INFO: renamed from: Z */
    public final jrv0 f229905Z;

    /* JADX INFO: renamed from: Z0 */
    public String f229906Z0;

    /* JADX INFO: renamed from: a */
    public final View f229907a;

    /* JADX INFO: renamed from: a1 */
    public final mjv0 f229908a1;

    /* JADX INFO: renamed from: b */
    public final Activity f229909b;

    /* JADX INFO: renamed from: b1 */
    public final eph f229910b1;

    /* JADX INFO: renamed from: c */
    public final jex f229911c;

    /* JADX INFO: renamed from: d */
    public final hc80 f229912d;

    /* JADX INFO: renamed from: e */
    public final j430 f229913e;

    /* JADX INFO: renamed from: f */
    public final q040 f229914f;

    /* JADX INFO: renamed from: g */
    public final q530 f229915g;

    /* JADX INFO: renamed from: h */
    public final pyu f229916h;

    /* JADX INFO: renamed from: i */
    public final boolean f229917i;

    /* JADX INFO: renamed from: t */
    public final rmm0 f229918t;

    public ufx(View view, Activity activity, jex jexVar, hc80 hc80Var, j430 j430Var, q040 q040Var, q530 q530Var, pyu pyuVar, boolean z, rmm0 rmm0Var, vd61 vd61Var, kv91 kv91Var, jrv0 jrv0Var, String str, n7m n7mVar, boolean z2, lqi0 lqi0Var, ts21 ts21Var, Bundle bundle, jkv0 jkv0Var, kfx kfxVar, xp4 xp4Var) {
        this.f229907a = view;
        this.f229909b = activity;
        this.f229911c = jexVar;
        this.f229912d = hc80Var;
        this.f229913e = j430Var;
        this.f229914f = q040Var;
        this.f229915g = q530Var;
        this.f229916h = pyuVar;
        this.f229917i = z;
        this.f229918t = rmm0Var;
        this.f229901X = vd61Var;
        this.f229903Y = kv91Var;
        this.f229905Z = jrv0Var;
        this.f229889L0 = str;
        this.f229890M0 = n7mVar;
        this.f229891N0 = z2;
        this.f229892O0 = lqi0Var;
        this.f229893P0 = ts21Var;
        this.f229894Q0 = xp4Var;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f229895R0 = recyclerView;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.evo_swipe_refresh_layout);
        this.f229896S0 = swipeRefreshLayout;
        hc80 hc80VarM40067h = eug1.m40067h(recyclerView);
        v290 v290VarM44533d = jexVar.f111706t.m44533d(hc80VarM40067h == null ? hc80Var : hc80VarM40067h);
        this.f229898U0 = v290VarM44533d;
        this.f229899V0 = bundle;
        dj11 dj11Var = new dj11(new rfx(this));
        this.f229904Y0 = true;
        this.f229908a1 = recyclerView.getItemAnimator();
        this.f229910b1 = new eph(this, 23);
        recyclerView.setHasFixedSize(true);
        recyclerView.m1011i(new fyr(view.getResources(), z, kfxVar));
        recyclerView.m1011i(jkv0Var);
        p3h1.m69032r(recyclerView, new y23(this, 3));
        izg1.m52015p(recyclerView, new ias(this, 10), new pfx(this, 0));
        hc80 hc80VarM40067h2 = eug1.m40067h(recyclerView);
        hc80 hc80Var2 = hc80VarM40067h2 == null ? hc80Var : hc80VarM40067h2;
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.m964y1(1);
        v290VarM44533d.mo33413a(recyclerView, hc80Var2, linearLayoutManager, z);
        if (xp4Var.m91624j()) {
            recyclerView.m1018m(dj11Var);
        }
        swipeRefreshLayout.setEnabled(xp4Var.m91632n());
        if (xp4Var.m91632n()) {
            swipeRefreshLayout.setColorSchemeResources(R.color.spotify_green_157);
            swipeRefreshLayout.setProgressBackgroundColorSchemeResource(R.color.gray_10);
            swipeRefreshLayout.setOnRefreshListener(new qfx(this));
        }
    }

    @Override // p204p.hr91
    public final Object getView() {
        return this.f229907a;
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f229895R0.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("view_state", sparseArray);
        bundle.putInt("viewDataHoldersSize", ((sp80) this.f229911c.f111706t.m44531b().f158717a.getValue()).f212769b.size());
        return bundle;
    }

    @Override // p204p.hr91
    public final void start() {
        hc80 hc80Var = this.f229912d;
        fbk fbkVar = null;
        x0h1.m89578u(n5h1.m63737m(hc80Var), null, 0, new C2069kx(this, fbkVar, 25), 3);
        x0h1.m89578u(n5h1.m63737m(hc80Var), null, 0, new t8s(this, fbkVar, 24), 3);
        this.f229916h.m71676m(this.f229895R0, this.f229917i);
        jex jexVar = this.f229911c;
        sam.m77676o(z8g1.m95591k(jexVar.f111706t.m44531b(), 3)).m33099f(hc80Var, new u0p(this, 2));
        xoi0 xoi0Var = jexVar.f111687N0;
        sam.m77676o(sam.m77684w(xoi0Var, new a8x(this))).m33099f(hc80Var, new iz0(this, 13));
        xoi0Var.m33099f(hc80Var, new tfx(this));
    }

    @Override // p204p.hr91
    public final void stop() {
        this.f229916h.m71680w();
    }
}
