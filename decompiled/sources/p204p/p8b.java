package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class p8b extends Drawable {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f174919d = 0;

    /* JADX INFO: renamed from: a */
    public final View f174920a;

    /* JADX INFO: renamed from: b */
    public final TextView f174921b;

    /* JADX INFO: renamed from: c */
    public final TextView f174922c;

    public p8b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.calendar_view, (ViewGroup) null);
        this.f174920a = viewInflate;
        this.f174921b = (TextView) viewInflate.findViewById(R.id.month);
        this.f174922c = (TextView) viewInflate.findViewById(R.id.day);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f174920a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f174920a.isOpaque() ? -1 : 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f174920a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824);
        View view = this.f174920a;
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        view.layout(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        View view = this.f174920a;
        if (view instanceof ImageView) {
            ((ImageView) view).setColorFilter(colorFilter);
        }
    }
}
