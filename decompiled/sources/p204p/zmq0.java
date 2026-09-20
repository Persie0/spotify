package p204p;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class zmq0 extends ymq0 {

    /* JADX INFO: renamed from: S0 */
    public final ImageView f284329S0;

    /* JADX INFO: renamed from: T0 */
    public final ConstraintLayout f284330T0;

    /* JADX INFO: renamed from: U0 */
    public final TextView f284331U0;

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ g79 f284332V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmq0(g79 g79Var, ViewGroup viewGroup) {
        super(viewGroup);
        this.f284332V0 = g79Var;
        this.f284329S0 = (ImageView) viewGroup.findViewById(R.id.icon);
        this.f284330T0 = (ConstraintLayout) viewGroup.findViewById(R.id.benefit_container);
        this.f284331U0 = (TextView) viewGroup.findViewById(R.id.plan_benefit_text);
    }
}
