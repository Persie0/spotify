package p204p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class sk6 implements Connectable, InterfaceC1934he {

    /* JADX INFO: renamed from: L0 */
    public final ovf f210023L0;

    /* JADX INFO: renamed from: M0 */
    public qe70 f210024M0;

    /* JADX INFO: renamed from: N0 */
    public final yum0 f210025N0;

    /* JADX INFO: renamed from: O0 */
    public final yum0 f210026O0;

    /* JADX INFO: renamed from: P0 */
    public qe70 f210027P0;

    /* JADX INFO: renamed from: Q0 */
    public Parcelable f210028Q0;

    /* JADX INFO: renamed from: R0 */
    public final int f210029R0;

    /* JADX INFO: renamed from: X */
    public lk6 f210030X;

    /* JADX INFO: renamed from: Y */
    public final ComposeView f210031Y;

    /* JADX INFO: renamed from: Z */
    public final ovf f210032Z;

    /* JADX INFO: renamed from: a */
    public final Context f210033a;

    /* JADX INFO: renamed from: b */
    public final c4z0 f210034b;

    /* JADX INFO: renamed from: c */
    public final etq f210035c;

    /* JADX INFO: renamed from: d */
    public final vg70 f210036d;

    /* JADX INFO: renamed from: e */
    public final String f210037e;

    /* JADX INFO: renamed from: f */
    public final glm f210038f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f210039g;

    /* JADX INFO: renamed from: h */
    public final View f210040h;

    /* JADX INFO: renamed from: i */
    public final RecyclerView f210041i;

    /* JADX INFO: renamed from: t */
    public final ComposeView f210042t;

    public sk6(Context context, c4z0 c4z0Var, etq etqVar, vg70 vg70Var, String str, fcu fcuVar, fcu fcuVar2, flm flmVar, glm glmVar, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mk6 mk6Var = mk6.f144503b;
        this.f210033a = context;
        this.f210034b = c4z0Var;
        this.f210035c = etqVar;
        this.f210036d = vg70Var;
        this.f210037e = str;
        this.f210038f = glmVar;
        this.f210024M0 = gh6.f79833c;
        this.f210025N0 = sam.m77645B(new l0z(lau.f131415a, null));
        this.f210026O0 = sam.m77645B(alm0.f16901a);
        rd6 rd6Var = new rd6(context, bk5.m29624m1(new Integer[]{4, 6}));
        this.f210027P0 = qx4.f193481R0;
        this.f210028Q0 = bundle != null ? bundle.getParcelable("RECYCLER_VIEW_SAVED_STATE") : null;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.page_assisted_curation_search, viewGroup, false);
        this.f210039g = viewGroup2;
        ComposeView composeView = (ComposeView) viewGroup2.findViewById(R.id.toolbar_compose_view);
        ComposeView composeView2 = (ComposeView) viewGroup2.findViewById(R.id.filter_compose_list);
        this.f210042t = composeView2;
        composeView.setVisibility(0);
        composeView.setContent(new fyf(new pk6(this, 2), true, 121379291));
        ComposeView composeView3 = (ComposeView) viewGroup2.findViewById(R.id.search_input_compose);
        this.f210031Y = composeView3;
        composeView3.setVisibility(0);
        pk6 pk6Var = new pk6(this, 3);
        ilm ilmVar = (ilm) flmVar.f70818a.f102010c;
        Context contextM88186a = ((wi6) ilmVar.f103406R0).m88186a();
        jg31.m53271i(contextM88186a);
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        composeView2.setContent(new fyf(new qk6(this, new C1947hm(contextM88186a, new l9g0(xgg1.m90662N1("ASSISTED_CURATION_SEARCH", "assisted-curation/search", 179, "assisted-curation").path(), ilmVar.m51035e().f243453a, 7), pk6Var), 2), true, -913539593));
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view);
        this.f210041i = recyclerView;
        recyclerView.setTag("assisted-curation-search");
        layoutInflater.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(vg70Var);
        this.f210029R0 = recyclerView.getPaddingBottom();
        composeView3.addOnLayoutChangeListener(new kk6(this, 0));
        recyclerView.m1011i(rd6Var);
        this.f210040h = viewGroup2.findViewById(R.id.live_region_text_view);
        ovf ovfVarMo26174a = fcuVar.mo26174a(null);
        this.f210032Z = ovfVarMo26174a;
        ConstraintLayout constraintLayout = (ConstraintLayout) ((za7) ovfVarMo26174a).f280995d;
        viewGroup2.addView(constraintLayout);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            constraintLayout.setOnApplyWindowInsetsListener(mk6Var);
        }
        ovf ovfVarMo26174a2 = fcuVar2.mo26174a(null);
        this.f210023L0 = ovfVarMo26174a2;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ((za7) ovfVarMo26174a2).f280995d;
        viewGroup2.addView(constraintLayout2);
        if (i >= 30) {
            constraintLayout2.setOnApplyWindowInsetsListener(mk6Var);
        }
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        this.f210027P0 = new C2290qe(consumer, 1);
        nk6 nk6Var = new nk6(consumer, 1);
        ilm ilmVar = (ilm) this.f210038f.f81108a.f102010c;
        ilmVar.getClass();
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f210031Y.setContent(new fyf(new rk6(this, new ymn0(new l9g0(xgg1.m90662N1("ASSISTED_CURATION_SEARCH", "assisted-curation/search", 179, "assisted-curation").path(), ilmVar.m51035e().f243453a, 7), nk6Var), 1), true, -1371153660));
        pf5 pf5Var = new pf5(14, this, consumer);
        vg70 vg70Var = this.f210036d;
        vg70Var.f241177g = pf5Var;
        this.f210024M0 = new nk6(consumer, 0);
        ok6 ok6Var = new ok6(consumer, 0);
        RecyclerView recyclerView = this.f210041i;
        recyclerView.m1018m(ok6Var);
        recyclerView.m1018m(new js80(2, this.f210034b, vg70Var));
        return new C2185np(this, 8);
    }

    @Override // p204p.InterfaceC1934he
    /* JADX INFO: renamed from: a */
    public final void mo47260a(String str) {
        mec1.m61568t(this.f210040h, str);
    }
}
