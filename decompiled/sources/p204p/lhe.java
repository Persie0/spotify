package p204p;

import android.view.View;
import android.widget.Button;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class lhe extends dtx0 {

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ int f133523S0;

    /* JADX INFO: renamed from: T0 */
    public final Button f133524T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhe(View view, Button button, int i) {
        super(view);
        this.f133523S0 = i;
        this.f133524T0 = button;
    }

    @Override // p204p.dtx0
    /* JADX INFO: renamed from: D */
    public final void mo25392D(arx0 arx0Var, List list, C2580xm c2580xm) {
        switch (this.f133523S0) {
            case 0:
                this.f133524T0.setOnClickListener(new y10(c2580xm, 16));
                break;
            default:
                this.f133524T0.setOnClickListener(new rsw0(3, c2580xm, (pqx0) arx0Var));
                break;
        }
    }
}
