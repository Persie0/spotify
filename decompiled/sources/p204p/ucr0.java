package p204p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ucr0 extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final ovf f229098S0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ucr0(ovf ovfVar) {
        View view = ovfVar.getView();
        Resources resources = view.getResources();
        int iM88767v = wqg1.m88767v(resources.getDimension(R.dimen.playlist_all_songs_item_padding), resources);
        view.setPadding(iM88767v, 0, iM88767v, iM88767v);
        super(view);
        this.f229098S0 = ovfVar;
    }
}
