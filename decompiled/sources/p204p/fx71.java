package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fx71 extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final TextView f74288S0;

    /* JADX INFO: renamed from: T0 */
    public final ConstraintLayout f74289T0;

    public fx71(View view) {
        super(view);
        this.f74288S0 = (TextView) view.findViewById(R.id.title);
        this.f74289T0 = (ConstraintLayout) view.findViewById(R.id.root);
    }
}
