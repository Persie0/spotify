package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class sgf extends go80 implements Connectable {

    /* JADX INFO: renamed from: L0 */
    public final faj0 f208847L0;

    /* JADX INFO: renamed from: M0 */
    public final iq6 f208848M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f208849N0;

    /* JADX INFO: renamed from: O0 */
    public RecyclerView f208850O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f208851P0;

    /* JADX INFO: renamed from: Q0 */
    public String f208852Q0;

    /* JADX INFO: renamed from: X */
    public final vc4 f208853X;

    /* JADX INFO: renamed from: Y */
    public final gnw0 f208854Y;

    /* JADX INFO: renamed from: Z */
    public final PublishSubject f208855Z;

    /* JADX INFO: renamed from: e */
    public final bju f208856e;

    /* JADX INFO: renamed from: f */
    public final nju f208857f;

    /* JADX INFO: renamed from: g */
    public final C2098lp f208858g;

    /* JADX INFO: renamed from: h */
    public final a53 f208859h;

    /* JADX INFO: renamed from: i */
    public final a53 f208860i;

    /* JADX INFO: renamed from: t */
    public final ugz f208861t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgf(bju bjuVar, nju njuVar, C2098lp c2098lp, ugz ugzVar, vc4 vc4Var) {
        super(ia5.f100151e);
        a53 a53Var = a53.f12386Q0;
        a53 a53Var2 = a53.f12385P0;
        this.f208856e = bjuVar;
        this.f208857f = njuVar;
        this.f208858g = c2098lp;
        this.f208859h = a53Var;
        this.f208860i = a53Var2;
        this.f208861t = ugzVar;
        this.f208853X = vc4Var;
        m47721x(2);
        this.f208854Y = gnw0.f82786a;
        this.f208855Z = new PublishSubject();
        this.f208847L0 = new faj0(new rgf(this, 0), new rgf(this, 1));
        this.f208848M0 = new iq6(this, 3);
        this.f208852Q0 = "";
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return new C1747cn(this, this.f208855Z.subscribe(new C1784dn(consumer, 14)), 9);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        return ((uhf) m45324A(i)).m83162a().ordinal();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: m */
    public final void mo28858m(RecyclerView recyclerView) {
        this.f208850O0 = recyclerView;
        recyclerView.m1018m(this.f208847L0);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        bef befVar = (bef) dkv0Var;
        View view = befVar.f50039a;
        uhf uhfVar = (uhf) m45324A(i);
        wj50.m88279p(uhfVar);
        befVar.m28918D(uhfVar, i, this.f208849N0, this.f208852Q0, new e2a(this.f208855Z));
        boolean z = uhfVar instanceof jhf;
        ugz ugzVar = this.f208861t;
        if (z) {
            ugzVar.m83070L(view, (jhf) uhfVar);
        } else if (uhfVar instanceof mhf) {
            ugzVar.m83071M(view, (mhf) uhfVar);
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        khf[] khfVarArr = khf.f122637a;
        int iOrdinal = iig1.m50731r(i).ordinal();
        vc4 vc4Var = this.f208853X;
        bju bjuVar = this.f208856e;
        switch (iOrdinal) {
            case 0:
                return new kgf(bjuVar.mo26174a(null), vc4Var.m85179a(), 0);
            case 1:
                return new k8a0(c97.m31867C(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 2:
                return new kgf(bjuVar.mo26174a(null), vc4Var.m85179a(), 1);
            case 3:
                return new jnw0(this.f208857f.mo26174a(this.f208854Y), 0);
            case 4:
                return new ksz0(jsz0.m54252a(LayoutInflater.from(viewGroup.getContext()), viewGroup), 0);
            case 5:
                return new ksz0(jsz0.m54252a(LayoutInflater.from(viewGroup.getContext()), viewGroup), 1);
            case 6:
                return new k8a0(ezw0.m40404l(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 7:
                return new jnw0(ezw0.m40404l(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 8:
                return new k8a0(khy0.m56458j(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 9:
                return new jnw0(this.f208858g.mo26174a(null), 1);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: q */
    public final void mo28696q(RecyclerView recyclerView) {
        this.f208850O0 = null;
        recyclerView.m1026q0(this.f208847L0);
        recyclerView.m1026q0(this.f208848M0);
    }
}
