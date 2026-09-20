package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.Comment;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class cnf implements Connectable, hgc1 {

    /* JADX INFO: renamed from: M0 */
    public static final List f39994M0 = h6f.m46715L(gn80.PODCAST_EPISODE, gn80.SHOW_EPISODE);

    /* JADX INFO: renamed from: L0 */
    public final ConstraintLayout f39995L0;

    /* JADX INFO: renamed from: X */
    public final ief f39996X;

    /* JADX INFO: renamed from: Y */
    public final o72 f39997Y;

    /* JADX INFO: renamed from: Z */
    public long f39998Z;

    /* JADX INFO: renamed from: a */
    public final vmf f39999a;

    /* JADX INFO: renamed from: b */
    public final dnf f40000b;

    /* JADX INFO: renamed from: c */
    public final q831 f40001c;

    /* JADX INFO: renamed from: d */
    public final uu71 f40002d;

    /* JADX INFO: renamed from: e */
    public final String f40003e;

    /* JADX INFO: renamed from: f */
    public final boolean f40004f;

    /* JADX INFO: renamed from: g */
    public final dmf f40005g;

    /* JADX INFO: renamed from: h */
    public final o72 f40006h;

    /* JADX INFO: renamed from: i */
    public final bxb f40007i;

    /* JADX INFO: renamed from: t */
    public final d03 f40008t;

    public cnf(xre xreVar, vmf vmfVar, dnf dnfVar, q831 q831Var, uu71 uu71Var, String str, boolean z, dmf dmfVar, o72 o72Var, bxb bxbVar, d03 d03Var, ief iefVar, o72 o72Var2, jmf jmfVar) {
        cxb cxbVar = (cxb) d03Var.f43716O0;
        ConstraintLayout constraintLayout = (ConstraintLayout) cxbVar.f42972b;
        this.f39999a = vmfVar;
        this.f40000b = dnfVar;
        this.f40001c = q831Var;
        this.f40002d = uu71Var;
        this.f40003e = str;
        this.f40004f = z;
        this.f40005g = dmfVar;
        this.f40006h = o72Var;
        this.f40007i = bxbVar;
        this.f40008t = d03Var;
        this.f39996X = iefVar;
        this.f39997Y = o72Var2;
        String str2 = jmfVar.f113846f;
        kmf kmfVar = jmfVar.f113848h;
        kmf kmfVar2 = kmfVar == null ? new kmf(str2, jmfVar.f113845e, jmfVar.f113849i) : kmfVar;
        String str3 = (String) jmfVar.f113843c.f38003f.get(str2);
        dmfVar.m49699V0().runOnUiThread(new lk00(12, dmfVar, new wmf(Mobius.m15580b(Mobius.m15582d(gmf.f81392a, RxConnectables.m15653a(jmfVar.f113842b.m62135a(this, jmfVar.f113847g, str2))).mo15596h(jmfVar.f113844d.m56778R(str2)).mo15592d(new hmf(jmfVar)).mo15590b(new imf(jmfVar)), kmf.m56898a(kmfVar2, null, null, null, null, null, null, null, str3 == null ? "" : str3, false, null, null, null, false, null, null, null, null, false, 524031), fmf.f71036a, MainThreadWorkRunner.m15627a()), this)));
        ((ComposeView) d03Var.f43713L0).setContent(r7g.f196568b);
        ((ComposeView) cxbVar.f42973c).setContent(r7g.f196570d);
        ((def) d03Var.f43729e).f48074a.setVisibility(8);
        constraintLayout.setVisibility(8);
        ((TextView) d03Var.f43714M0).setText(dnfVar.f50797b);
        constraintLayout.setOnTouchListener(new eef(4));
        ((kv91) bxbVar.f31814c).mo57449i(((ufg0) bxbVar.f31815d).mo24514e(), null);
        cmp cmpVar = (cmp) ((RecyclerView) d03Var.f43717P0).getItemAnimator();
        if (cmpVar != null) {
            cmpVar.f207636g = false;
        }
        this.f39995L0 = (ConstraintLayout) d03Var.f43726b;
    }

    /* JADX INFO: renamed from: a */
    public static final ArrayList m33451a(cnf cnfVar, bh71 bh71Var) {
        List list = bh71Var.f27105a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Comment) it.next()).m22147u());
        }
        return arrayList;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        C1747cn c1747cn = new C1747cn(27, this.f39997Y, consumer);
        Connection connectionMo3269P = this.f40006h.mo3269P(new hz0(c1747cn, 5));
        PublishSubject publishSubject = new PublishSubject();
        Disposable disposableSubscribe = publishSubject.distinctUntilChanged().subscribe(new bnf(connectionMo3269P, 0));
        Connection connectionMo3269P2 = this.f39996X.mo3269P(consumer);
        d03 d03Var = this.f40008t;
        ((EncoreButton) d03Var.f43728d).setOnClickListener(new zmf(this, consumer, 0));
        ((EncoreButton) d03Var.f43720S0).setOnClickListener(new zmf(this, consumer, 1));
        ((EncoreButton) d03Var.f43727c).setOnClickListener(new zmf(this, consumer, 2));
        return new anf(this, (hef) connectionMo3269P2, publishSubject, disposableSubscribe, connectionMo3269P, c1747cn);
    }

    public final View getRoot() {
        return this.f39995L0;
    }

    @Override // p204p.hgc1
    /* JADX INFO: renamed from: j */
    public final void mo33452j(cgc1 cgc1Var) {
        d03 d03Var = this.f40008t;
        def defVar = (def) d03Var.f43729e;
        if (cgc1Var.equals(wec1.f250510a)) {
            this.f40005g.mo83051h1();
            return;
        }
        if (cgc1Var instanceof yec1) {
            yec1 yec1Var = (yec1) cgc1Var;
            defVar.f48077d.setText(yec1Var.f271970a);
            defVar.f48077d.setSelection(yec1Var.f271971b);
            return;
        }
        if (cgc1Var.equals(wfc1.f250798a)) {
            if (defVar.f48074a.getVisibility() == 0) {
                this.f39996X.m50378d();
                return;
            } else {
                this.f39998Z = System.currentTimeMillis();
                return;
            }
        }
        if (cgc1Var instanceof xfc1) {
            this.f40001c.m72306l(new g631(null, ((xfc1) cgc1Var).f260927a, null, null, null, null, null, null, false), (CoordinatorLayout) d03Var.f43721T0);
        } else {
            if (!cgc1Var.equals(bgc1.f26917a)) {
                throw new NoWhenBranchMatchedException();
            }
            sgf sgfVar = ((tif) this.f40006h.f162450b).f220672a;
            iq6 iq6Var = sgfVar.f208848M0;
            RecyclerView recyclerView = sgfVar.f208850O0;
            if (recyclerView != null) {
                recyclerView.m1026q0(sgfVar.f208847L0);
                recyclerView.m1026q0(iq6Var);
                recyclerView.m1018m(iq6Var);
            }
        }
    }
}
