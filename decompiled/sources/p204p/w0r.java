package p204p;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class w0r {

    /* JADX INFO: renamed from: a */
    public final int f246794a;

    /* JADX INFO: renamed from: b */
    public int f246795b;

    /* JADX INFO: renamed from: c */
    public final Object f246796c;

    /* JADX INFO: renamed from: d */
    public final Object f246797d;

    /* JADX INFO: renamed from: e */
    public Object f246798e;

    /* JADX INFO: renamed from: f */
    public Object f246799f;

    public w0r(ia70 ia70Var, int i, List list) {
        this.f246796c = ia70Var;
        this.f246794a = i;
        this.f246797d = list;
    }

    /* JADX INFO: renamed from: a */
    public long m86958a(int i, int i2) {
        int i3;
        ia70 ia70Var = (ia70) this.f246796c;
        int[] iArr = (int[]) ia70Var.f100166b;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) ia70Var.f100167c;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            ot40.m67767a("width must be >= 0");
        }
        return e8j.m38117h(i3, i3, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX INFO: renamed from: b */
    public ss70 m86959b(int i) {
        lfq lfqVarM88878b = ((ws70) this.f246798e).m88878b(i);
        int i2 = lfqVarM88878b.f132996a;
        List list = lfqVarM88878b.f132997b;
        int size = list.size();
        int i3 = (size == 0 || i2 + size == this.f246794a) ? 0 : this.f246795b;
        rs70[] rs70VarArr = new rs70[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (int) ((tz10) list.get(i5)).f225083a;
            rs70 rs70VarM65505F1 = ((ns70) this.f246797d).m65505F1(i2 + i5, i4, i6, i3, m86958a(i4, i6));
            i4 += i6;
            rs70VarArr[i5] = rs70VarM65505F1;
        }
        return new ss70(i, rs70VarArr, (ia70) this.f246799f, lfqVarM88878b.f132997b, i3);
    }

    /* JADX INFO: renamed from: c */
    public void m86960c(LottieAnimationView lottieAnimationView) {
        ia70 ia70Var = (ia70) this.f246796c;
        y9b0 y9b0Var = (y9b0) ((List) ia70Var.f100167c).get(this.f246795b);
        u8b0 u8b0Var = (u8b0) ia70Var.f100166b;
        if (!(y9b0Var instanceof y9b0)) {
            throw new NoWhenBranchMatchedException();
        }
        lottieAnimationView.f1477h.m75037r(wdg1.m87840n(kaz.f120997Z, u8b0Var), wdg1.m87840n(laz.f131460Z, u8b0Var));
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.f1477h.f196990b.addListener(new g9p(3, lottieAnimationView, this));
        lottieAnimationView.m1186h();
    }

    public w0r(ia70 ia70Var, int i, int i2, ns70 ns70Var, ws70 ws70Var) {
        this.f246799f = ia70Var;
        this.f246796c = ia70Var;
        this.f246794a = i;
        this.f246795b = i2;
        this.f246797d = ns70Var;
        this.f246798e = ws70Var;
    }

    public w0r(RecyclerView recyclerView, i8u0 i8u0Var, oar0 oar0Var, d2o d2oVar, f2o f2oVar) {
        this.f246796c = i8u0Var;
        this.f246797d = new xoi0();
        this.f246794a = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16);
        this.f246795b = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16);
        pev0 pev0Var = new pev0(this, 0);
        voc1 voc1Var = xoc1.f263843A4;
        jg31.m53272j(voc1Var);
        x28 x28Var = (x28) f2oVar.f65238a.f171807c;
        Flowable flowable = (Flowable) ((mev0) x28Var.f257384c).f142868s.get();
        jg31.m53271i(flowable);
        eju ejuVar = (eju) ((mev0) x28Var.f257384c).f142846E.get();
        jg31.m53271i(ejuVar);
        nju njuVar = new nju(ejuVar.f60295c, 15);
        mi80 mi80Var = (mi80) ((mev0) x28Var.f257384c).f142872w.get();
        jg31.m53271i(mi80Var);
        this.f246798e = new b7v0(voc1Var, flowable, njuVar, mi80Var, pev0Var);
        this.f246799f = d2oVar.m34728a(oar0Var, new glt0(this, 24));
        C2529wd c2529wd = new C2529wd(3, new pev0(this, 4));
        recyclerView.getContext();
        c2529wd.m87799p(recyclerView, new LinearLayoutManager(1), false);
    }

    public w0r(ago agoVar, xv41 xv41Var, int i, int i2, rwt0 rwt0Var, s1r s1rVar) {
        this.f246796c = agoVar;
        this.f246797d = xv41Var;
        this.f246794a = i;
        this.f246795b = i2;
        this.f246798e = rwt0Var;
        this.f246799f = s1rVar;
    }
}
