package p204p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class z461 extends xba implements toc1, bbm0, y461 {

    /* JADX INFO: renamed from: Q1 */
    public final f151 f279136Q1;

    /* JADX INFO: renamed from: R1 */
    public eju f279137R1;

    /* JADX INFO: renamed from: S1 */
    public yaq f279138S1;

    /* JADX INFO: renamed from: T1 */
    public final lwr f279139T1 = new lwr();

    /* JADX INFO: renamed from: U1 */
    public dme f279140U1;

    /* JADX INFO: renamed from: V1 */
    public okj0 f279141V1;

    /* JADX INFO: renamed from: W1 */
    public zaq f279142W1;

    /* JADX INFO: renamed from: X1 */
    public vg70 f279143X1;

    public z461(f151 f151Var) {
        this.f279136Q1 = f151Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f279136Q1.mo24367f(this);
        this.f279140U1 = context instanceof dme ? (dme) context : null;
        super.mo875E0(context);
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        okj0 okj0VarM67206O = okj0.m67206O(layoutInflater, viewGroup);
        this.f279141V1 = okj0VarM67206O;
        return (ConstraintLayout) okj0VarM67206O.f166384e;
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: J0 */
    public final void mo29537J0() {
        super.mo29537J0();
        this.f279140U1 = null;
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: P0 */
    public final void mo3104P0() {
        super.mo3104P0();
        zaq zaqVar = this.f279142W1;
        if (zaqVar == null) {
            wj50.m88260d0("headerComponent");
            throw null;
        }
        zaqVar.mo2820d(m95314r1().m28146c());
        vg70 vg70Var = this.f279143X1;
        if (vg70Var != null) {
            vg70Var.mo45325C(m95314r1().m28147g());
        } else {
            wj50.m88260d0("supplementaryAdapter");
            throw null;
        }
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: Q0 */
    public final void mo3105Q0() {
        super.mo3105Q0();
        this.f279139T1.m60129c();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        dme dmeVar = this.f279140U1;
        if (dmeVar != null) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            dmeVar.mo3255V(xgg1.m90786f0(), xoc1.f263929L2.m86091c());
        }
        eju ejuVar = this.f279137R1;
        if (ejuVar == null) {
            wj50.m88260d0("encoreEntryPoint");
            throw null;
        }
        zaq zaqVar = (zaq) qzb0.m74319s(ejuVar.f60299g).mo26174a(null);
        this.f279142W1 = zaqVar;
        okj0 okj0Var = this.f279141V1;
        if (okj0Var == null) {
            wj50.m88260d0("binding");
            throw null;
        }
        ((FrameLayout) okj0Var.f166382c).addView(zaqVar.getView());
        eju ejuVar2 = this.f279137R1;
        if (ejuVar2 == null) {
            wj50.m88260d0("encoreEntryPoint");
            throw null;
        }
        this.f279143X1 = new vg70(jkc0.m53610v(ejuVar2.f60299g), this);
        okj0 okj0Var2 = this.f279141V1;
        if (okj0Var2 == null) {
            wj50.m88260d0("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) okj0Var2.f166385f;
        ((ConstraintLayout) okj0Var2.f166384e).getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        vg70 vg70Var = this.f279143X1;
        if (vg70Var == null) {
            wj50.m88260d0("supplementaryAdapter");
            throw null;
        }
        recyclerView.setAdapter(vg70Var);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            grg1.m45496k(view2);
        }
    }

    @Override // p204p.toc1
    /* JADX INFO: renamed from: a */
    public final voc1 getF6520f1() {
        return xoc1.f263929L2;
    }

    @Override // p204p.bbm0
    /* JADX INFO: renamed from: c */
    public final zam0 mo3039c() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return xgg1.m90786f0();
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: k1 */
    public final int mo33450k1() {
        return R.style.SupplementaryContentBottomSheetTheme;
    }

    /* JADX INFO: renamed from: r1 */
    public final b561 m95314r1() {
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? m49701W0().getParcelable("supplementary_content_sheet_model", b561.class) : m49701W0().getParcelable("supplementary_content_sheet_model");
        if (parcelable != null) {
            return (b561) parcelable;
        }
        throw new IllegalStateException(s571.m77251j("Missing required argument 'supplementary_content_sheet_model'. Did you remember to create the fragment using ", z461.class.getSimpleName(), ".create(...)?").toString());
    }
}
