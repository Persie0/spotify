package p204p;

import android.app.Dialog;
import android.os.Bundle;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class yal extends ugr {

    /* JADX INFO: renamed from: Q1 */
    public final vhs0 f270943Q1;

    public yal(vhs0 vhs0Var) {
        this.f270943Q1 = vhs0Var;
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: l1 */
    public final Dialog mo25833l1(Bundle bundle) {
        r73 r73Var = new r73(m49702X0());
        n73 n73Var = r73Var.f196422a;
        n73Var.f151047d = n73Var.f151044a.getText(R.string.error_generic_title);
        n73Var.f151049f = n73Var.f151044a.getText(R.string.create_playlist_failure);
        return r73Var.setNegativeButton(R.string.cancel, new xal(this, 0)).setPositiveButton(R.string.try_again, new xal(this, 1)).create();
    }
}
