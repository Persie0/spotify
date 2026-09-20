package p204p;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class f440 implements d8d0 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f65671a;

    public f440(Bitmap bitmap) {
        this.f65671a = bitmap;
    }

    @Override // p204p.d8d0
    /* JADX INFO: renamed from: j */
    public final View mo35265j(ConstraintLayout constraintLayout) {
        View viewInflate = LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.image_asset, (ViewGroup) constraintLayout, false);
        ((ImageView) viewInflate).setImageBitmap(this.f65671a);
        return viewInflate;
    }
}
