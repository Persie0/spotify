package p204p;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class n491 extends lkv0 {

    /* JADX INFO: renamed from: S0 */
    public final ViewGroup f150271S0;

    /* JADX INFO: renamed from: T0 */
    public final C2065kt f150272T0;

    /* JADX INFO: renamed from: U0 */
    public final rxt f150273U0;

    /* JADX INFO: renamed from: V0 */
    public final xci0 f150274V0;

    /* JADX INFO: renamed from: W0 */
    public final suj f150275W0;

    /* JADX INFO: renamed from: X0 */
    public final nsb f150276X0;

    /* JADX INFO: renamed from: Y0 */
    public final gxj0 f150277Y0;

    /* JADX INFO: renamed from: Z0 */
    public final hc80 f150278Z0;

    /* JADX INFO: renamed from: a1 */
    public final ic4 f150279a1;

    /* JADX INFO: renamed from: b1 */
    public final WeakReference f150280b1;

    /* JADX INFO: renamed from: c1 */
    public final FrameLayout f150281c1;

    /* JADX INFO: renamed from: d1 */
    public final hxt f150282d1;

    /* JADX INFO: renamed from: e1 */
    public final wg61 f150283e1;

    /* JADX INFO: renamed from: f1 */
    public final wg61 f150284f1;

    /* JADX INFO: renamed from: g1 */
    public final hxt f150285g1;

    public n491(ViewGroup viewGroup, C2065kt c2065kt, rxt rxtVar, xci0 xci0Var, suj sujVar, nsb nsbVar, gxj0 gxj0Var, hc80 hc80Var, ic4 ic4Var, qce0 qce0Var) {
        super(lkv0.m59289E(R.layout.transcript_npv_ui, viewGroup));
        this.f150271S0 = viewGroup;
        this.f150272T0 = c2065kt;
        this.f150273U0 = rxtVar;
        this.f150274V0 = xci0Var;
        this.f150275W0 = sujVar;
        this.f150276X0 = nsbVar;
        this.f150277Y0 = gxj0Var;
        this.f150278Z0 = hc80Var;
        this.f150279a1 = ic4Var;
        while (!wj50.m88271j(viewGroup.getTag(), Integer.valueOf(R.id.now_playing_container_tag))) {
            viewGroup = (ViewGroup) viewGroup.getParent();
        }
        this.f150280b1 = new WeakReference(viewGroup);
        this.f150281c1 = (FrameLayout) this.f50039a.findViewById(R.id.content_layer);
        up60 up60Var = hxt.f96286w;
        hxt hxtVarM50021n = null;
        hxt hxtVarM50020m = ia7.m50020m(this.f50039a.getContext(), (ViewGroup) this.f50039a, w9h1.m87517y(qce0Var, null, null, 3), new sds0(null), null, ContentType.LONG_FORM_ON_DEMAND);
        this.f150282d1 = hxtVarM50020m;
        this.f150283e1 = new wg61(new l491(this, 0));
        this.f150284f1 = new wg61(new l491(this, 1));
        int i = 24;
        if (this.f150279a1.m50230e()) {
            hxtVarM50021n = ia7.m50021n(this.f50039a.getContext(), (ViewGroup) this.f50039a, w9h1.m87517y(this.f150274V0, null, null, 3), null, 24);
            psg1.m70832H(this.f50039a.findViewById(R.id.multitap_seek_overlay), hxtVarM50021n.f96307t);
        } else {
            this.f50039a.findViewById(R.id.multitap_seek_overlay).setVisibility(8);
        }
        this.f150285g1 = hxtVarM50021n;
        psg1.m70832H(this.f50039a.findViewById(R.id.promotional_indicator_stub), hxtVarM50020m.f96307t);
        this.f150278Z0.getLifecycle().mo31986a(new dz2(this, i));
    }

    /* JADX INFO: renamed from: I */
    public static final void m63663I(n491 n491Var, int i) {
        View view;
        FrameLayout frameLayout = n491Var.f150281c1;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        frameLayout.setLayoutParams(marginLayoutParams);
        hxt hxtVar = n491Var.f150285g1;
        if (hxtVar == null || (view = hxtVar.f96307t) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams2);
    }

    @Override // p204p.lkv0
    /* JADX INFO: renamed from: D */
    public final void mo27077D(int i, Object obj) {
        Object c6x0Var;
        long jM60224n;
        ContextTrack contextTrack = (ContextTrack) obj;
        String strUri = contextTrack.uri();
        if (strUri == null) {
            strUri = "";
        }
        try {
            String strM37971E = e72.m37971E(contextTrack);
            wj50.m88279p(strM37971E);
            c6x0Var = Integer.valueOf(Color.parseColor(strM37971E));
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) == null) {
            jM60224n = rfg1.m75432b(((Number) c6x0Var).intValue());
        } else {
            int i2 = n6f.f150872l;
            jM60224n = ly5.m60224n();
        }
        ((hxt) this.f150283e1.getValue()).m49046g(new tl8(strUri, jM60224n));
        hxt hxtVar = (hxt) this.f150284f1.getValue();
        String strM38026w = e72.m38026w(contextTrack);
        hxtVar.m49046g(new wkj(strUri, strM38026w != null ? strM38026w : ""));
        this.f150282d1.m49046g(new sds0(contextTrack));
        hxt hxtVar2 = this.f150285g1;
        if (hxtVar2 != null) {
            hxtVar2.m49046g(new uci0(strUri, true));
        }
        this.f150275W0.m79400l(strUri, this.f150277Y0);
        ViewGroup viewGroup = (ViewGroup) this.f150280b1.get();
        if (viewGroup != null) {
            this.f150276X0.m65512a(viewGroup);
        }
        View view = this.f50039a;
        inl0.m51135a(view, new uod0(29, view, this));
    }

    @Override // p204p.lkv0
    /* JADX INFO: renamed from: H */
    public final void mo27080H() {
        this.f150276X0.m65513b();
    }
}
