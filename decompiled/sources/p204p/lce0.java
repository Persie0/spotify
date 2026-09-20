package p204p;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class lce0 extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final Context f131909S0;

    /* JADX INFO: renamed from: T0 */
    public final FaceView f131910T0;

    /* JADX INFO: renamed from: U0 */
    public final TextView f131911U0;

    /* JADX INFO: renamed from: V0 */
    public final TextView f131912V0;

    /* JADX INFO: renamed from: W0 */
    public final SpotifyIconView f131913W0;

    public lce0(View view) {
        super(view);
        this.f131909S0 = view.getContext();
        this.f131910T0 = (FaceView) view.findViewById(R.id.plan_details_card_plan_member_avatar);
        this.f131911U0 = (TextView) view.findViewById(R.id.plan_details_card_plan_member_name);
        this.f131912V0 = (TextView) view.findViewById(R.id.plan_details_card_plan_member_account_type);
        this.f131913W0 = (SpotifyIconView) view.findViewById(R.id.plan_details_card_plan_member_check);
    }
}
