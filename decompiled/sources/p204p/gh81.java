package p204p;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes8.dex */
public final class gh81 extends pj30 implements rj30 {

    /* JADX INFO: renamed from: a */
    public final jr40 f79853a;

    /* JADX INFO: renamed from: b */
    public final qjc0 f79854b;

    /* JADX INFO: renamed from: c */
    public final hc80 f79855c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f79856d;

    public gh81(jr40 jr40Var, qjc0 qjc0Var, hc80 hc80Var, Scheduler scheduler) {
        this.f79853a = jr40Var;
        this.f79854b = qjc0Var;
        this.f79855c = hc80Var;
        this.f79856d = scheduler;
    }

    @Override // p204p.rj30
    /* JADX INFO: renamed from: a */
    public final int mo26367a() {
        return R.id.inline_card;
    }

    @Override // p204p.pj30
    /* JADX INFO: renamed from: f */
    public final oj30 mo26369f(ViewGroup viewGroup, sk30 sk30Var) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setLayoutParams(new ojv0(-1, -2));
        constraintLayout.setPadding((int) viewGroup.getContext().getResources().getDimension(R.dimen.inline_card_margin), (int) viewGroup.getContext().getResources().getDimension(R.dimen.inline_card_margin), (int) viewGroup.getContext().getResources().getDimension(R.dimen.inline_card_margin), 0);
        return new fh81(constraintLayout, this.f79853a, this.f79854b, viewGroup.getContext(), this.f79855c, this.f79856d);
    }
}
