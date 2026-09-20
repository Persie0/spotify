package p204p;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class fi01 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final Rect f69736a = new Rect();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ShapeableImageView f69737b;

    public fi01(ShapeableImageView shapeableImageView) {
        this.f69737b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f69737b;
        if (shapeableImageView.f2125M0 == null) {
            return;
        }
        if (shapeableImageView.f2124L0 == null) {
            shapeableImageView.f2124L0 = new n3d0(shapeableImageView.f2125M0);
        }
        RectF rectF = shapeableImageView.f2136e;
        Rect rect = this.f69736a;
        rectF.round(rect);
        shapeableImageView.f2124L0.setBounds(rect);
        shapeableImageView.f2124L0.getOutline(outline);
    }
}
