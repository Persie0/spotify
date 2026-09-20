package com.spotify.artist.creatorcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import p204p.e940;
import p204p.i340;
import p204p.k6f;
import p204p.lxe;
import p204p.rb40;
import p204p.skp;
import p204p.wj50;
import p204p.zb40;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/artist/creatorcommon/view/ArtistBiographyImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "imageView", "src_main_java_com_spotify_artist_creatorcommon-creatorcommon"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ArtistBiographyImageView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ImageView imageView;

    public ArtistBiographyImageView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3276a(i340 i340Var, e940 e940Var) {
        String str = i340Var.f98012a;
        if (str.length() <= 0) {
            str = null;
        }
        lxe lxeVarMo24613j = e940Var.mo24613j(str);
        int i = R.drawable.placeholder_artist;
        lxeVarMo24613j.m60186l(R.drawable.placeholder_artist);
        rb40 rb40Var = lxeVarMo24613j.f137796b;
        skp skpVar = zb40.f281236a;
        rb40Var.f197453m = new k6f(i, 1);
        lxeVarMo24613j.m60185k(getImageView(), null);
    }

    public final ImageView getImageView() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        wj50.m88260d0("imageView");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setImageView((ImageView) LayoutInflater.from(getContext()).inflate(R.layout.biography_image_view, this).findViewById(R.id.image));
    }

    public final void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public ArtistBiographyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
