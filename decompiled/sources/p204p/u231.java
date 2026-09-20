package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class u231 extends urk {

    /* JADX INFO: renamed from: W1 */
    public final pvw0 f225973W1;

    /* JADX INFO: renamed from: X1 */
    public nju f225974X1;

    /* JADX INFO: renamed from: Y1 */
    public z9j0 f225975Y1;

    /* JADX INFO: renamed from: Z1 */
    public o7o f225976Z1;

    /* JADX INFO: renamed from: a2 */
    public w231 f225977a2;

    /* JADX INFO: renamed from: b2 */
    public dme f225978b2;

    /* JADX INFO: renamed from: c2 */
    public final wg61 f225979c2 = new wg61(new cy11(this, 18));

    public u231(pvw0 pvw0Var) {
        this.f225973W1 = pvw0Var;
    }

    /* JADX INFO: renamed from: y1 */
    public static final void m82242y1(u231 u231Var, q231 q231Var) {
        d850 d850VarM84496c;
        wg61 wg61Var = u231Var.f225979c2;
        int iOrdinal = q231Var.ordinal();
        if (iOrdinal == 0) {
            d850VarM84496c = ((v231) wg61Var.getValue()).m84496c();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            d850VarM84496c = ((v231) wg61Var.getValue()).m84497d();
        }
        w231 w231Var = u231Var.f225977a2;
        if (w231Var != null) {
            ((g511) w231Var.m87059a()).invoke(q231Var, d850VarM84496c);
        }
        u231Var.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f225973W1.mo24367f(this);
        this.f225978b2 = context instanceof dme ? (dme) context : null;
        super.mo875E0(context);
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        if (bundle != null) {
            dismiss();
        }
        super.mo876F0(bundle);
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: J0 */
    public final void mo29537J0() {
        dme dmeVar = this.f225978b2;
        if (dmeVar != null) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            dmeVar.mo3256n(xgg1.m90892u5(), xoc1.f263851B4.m86091c());
        }
        this.f225978b2 = null;
        super.mo29537J0();
    }

    @Override // p204p.my8, p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        super.mo881R0(view, bundle);
        dme dmeVar = this.f225978b2;
        if (dmeVar != null) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            dmeVar.mo3255V(xgg1.m90892u5(), xoc1.f263851B4.m86091c());
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.play_mode_picker_content);
        nju njuVar = this.f225974X1;
        if (njuVar == null) {
            wj50.m88260d0("playModePickerFactory");
            throw null;
        }
        ovf ovfVarMo26174a = njuVar.mo26174a(null);
        String strM49722u0 = m49722u0(R.string.play_mode_item_shuffle_title);
        vc41 vc41Var = vc41.AD;
        ovfVarMo26174a.mo2820d(new yno0(strM49722u0, new xno0()));
        ovfVarMo26174a.mo2821c(new t231(this, 0));
        ovfVarMo26174a.getView().setId(R.id.play_mode_picker_shuffle_row);
        linearLayout.addView(ovfVarMo26174a.getView());
        nju njuVar2 = this.f225974X1;
        if (njuVar2 == null) {
            wj50.m88260d0("playModePickerFactory");
            throw null;
        }
        ovf ovfVarMo26174a2 = njuVar2.mo26174a(null);
        ovfVarMo26174a2.mo2820d(new yno0(m49722u0(R.string.play_mode_item_smart_shuffle_title), m49722u0(R.string.play_mode_item_smart_shuffle_description), new wno0(), true));
        ovfVarMo26174a2.mo2821c(new t231(this, 1));
        ovfVarMo26174a2.getView().setId(R.id.play_mode_picker_smart_shuffle_row);
        linearLayout.addView(ovfVarMo26174a2.getView());
        ((v231) this.f225979c2.getValue()).m84495b();
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: t1 */
    public final void mo38127t1(srk srkVar) {
        srkVar.setOnShowListener(new nt1(this, srkVar, 1));
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: u1 */
    public final void mo41980u1() {
        ((v231) this.f225979c2.getValue()).m84494a();
        w231 w231Var = this.f225977a2;
        if (w231Var != null) {
            ((mg01) w231Var.m87060b()).invoke();
        }
    }

    @Override // p204p.urk
    /* JADX INFO: renamed from: x1 */
    public final View mo34386x1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.play_mode_picker_dialog, viewGroup, false);
    }
}
