package p204p;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class anq0 extends ymq0 {

    /* JADX INFO: renamed from: S0 */
    public final TextView f17482S0;

    /* JADX INFO: renamed from: T0 */
    public final TextView f17483T0;

    /* JADX INFO: renamed from: U0 */
    public final ConstraintLayout f17484U0;

    public anq0(ViewGroup viewGroup) {
        super(viewGroup);
        this.f17482S0 = (TextView) viewGroup.findViewById(R.id.plan_benefit_text);
        this.f17483T0 = (TextView) viewGroup.findViewById(R.id.bullet_point);
        this.f17484U0 = (ConstraintLayout) viewGroup.findViewById(R.id.benefit_container);
    }
}
