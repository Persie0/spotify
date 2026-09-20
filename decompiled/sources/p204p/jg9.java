package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.artist.creatorcommon.view.ArtistBiographyImageView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class jg9 extends lkv0 {

    /* JADX INFO: renamed from: S0 */
    public final e940 f112110S0;

    /* JADX INFO: renamed from: T0 */
    public final ArtistBiographyImageView f112111T0;

    /* JADX WARN: Illegal instructions before constructor call */
    public jg9(ViewGroup viewGroup, Context context, e940 e940Var) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.artist_gallery_image, viewGroup, false);
        super(viewInflate);
        this.f112110S0 = e940Var;
        this.f112111T0 = (ArtistBiographyImageView) viewInflate.findViewById(R.id.artist_bio_image);
    }

    @Override // p204p.lkv0
    /* JADX INFO: renamed from: D */
    public final void mo27077D(int i, Object obj) {
        this.f112111T0.m3276a((i340) obj, this.f112110S0);
    }
}
