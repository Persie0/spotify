package p204p;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class jmx0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113959a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f113960b;

    public /* synthetic */ jmx0(Object obj, int i) {
        this.f113959a = i;
        this.f113960b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f113959a) {
            case 0:
                int width = view.getWidth() - (view.getPaddingRight() + view.getPaddingLeft());
                int height = view.getHeight() - (view.getPaddingBottom() + view.getPaddingTop());
                eh00 eh00Var = (eh00) this.f113960b;
                float fFloatValue = ((Number) eh00Var.invoke()).floatValue();
                if (width != height || width > fFloatValue * 2) {
                    outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom(), ((Number) eh00Var.invoke()).floatValue());
                } else {
                    outline.setOval(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
                }
                outline.setAlpha(0.0f);
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((ConstraintLayout) this.f113960b).getContext().getResources().getDimension(R.dimen.encore_corner_radius_smaller));
                break;
        }
    }
}
