package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.artist.creatorcommon.view.ArtistBiographyImageView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w6c extends lkv0 {

    /* JADX INFO: renamed from: S0 */
    public final e940 f248323S0;

    /* JADX INFO: renamed from: T0 */
    public final ArtistBiographyImageView f248324T0;

    /* JADX WARN: Illegal instructions before constructor call */
    public w6c(ViewGroup viewGroup, Context context, e940 e940Var) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.artist_carousel_image, viewGroup, false);
        super(viewInflate);
        this.f248323S0 = e940Var;
        this.f248324T0 = (ArtistBiographyImageView) viewInflate.findViewById(R.id.artist_bioimage);
    }

    @Override // p204p.lkv0
    /* JADX INFO: renamed from: D */
    public final void mo27077D(int i, Object obj) {
        this.f248324T0.m3276a((i340) obj, this.f248323S0);
    }
}
