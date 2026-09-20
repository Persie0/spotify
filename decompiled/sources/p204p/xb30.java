package p204p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class xb30 extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final View f259830S0;

    /* JADX INFO: renamed from: T0 */
    public final rls0 f259831T0;

    public xb30(View view, rls0 rls0Var) {
        super(view);
        this.f259830S0 = view;
        this.f259831T0 = rls0Var;
        ((RecyclerView) view.findViewById(R.id.hostRows)).setAdapter(rls0Var);
    }
}
