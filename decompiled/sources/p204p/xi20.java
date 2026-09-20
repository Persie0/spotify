package p204p;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public class xi20 extends wi20 implements nuj {

    /* JADX INFO: renamed from: c */
    public final ImageView f261751c;

    /* JADX INFO: renamed from: d */
    public final boolean f261752d;

    public xi20(View view) {
        super(view);
        this.f261751c = (ImageView) view.findViewById(R.id.cover_art_image);
        this.f261752d = view.getResources().getConfiguration().orientation != 2;
    }

    @Override // p204p.wi20, p204p.vi20
    /* JADX INFO: renamed from: k */
    public final int mo85578k() {
        return this.f251488a.getMeasuredWidth() / 2;
    }

    @Override // p204p.wi20, p204p.vi20
    /* JADX INFO: renamed from: o */
    public final int mo85579o() {
        ImageView imageView = this.f261751c;
        return (imageView.getHeight() / 2) + imageView.getTop();
    }

    @Override // p204p.wi20, p204p.vi20
    /* JADX INFO: renamed from: z */
    public final boolean mo85580z() {
        return this.f261752d;
    }
}
