package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class e79 extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final SpotifyIconView f56867S0;

    /* JADX INFO: renamed from: T0 */
    public final TextView f56868T0;

    /* JADX INFO: renamed from: U0 */
    public final ConstraintLayout f56869U0;

    /* JADX INFO: renamed from: V0 */
    public final TextView f56870V0;

    public e79(View view) {
        super(view);
        this.f56867S0 = (SpotifyIconView) view.findViewById(R.id.spotify_icon);
        this.f56868T0 = (TextView) view.findViewById(R.id.benefit_description);
        this.f56869U0 = (ConstraintLayout) view.findViewById(R.id.row_root);
        this.f56870V0 = (TextView) view.findViewById(R.id.benefit_subtext);
    }
}
