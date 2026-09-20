package p204p;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zy8 extends AppCompatImageView {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ qr60[] f287510f = {new spi0(zy8.class, "isIconActive", "isIconActive()Z", 0), new spi0(zy8.class, "shouldUseSmallGlyph", "getShouldUseSmallGlyph()Z", 0)};

    /* JADX INFO: renamed from: d */
    public final oc0 f287511d;

    /* JADX INFO: renamed from: e */
    public final pc0 f287512e;

    public zy8(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f287511d = new oc0(this);
        this.f287512e = new pc0(this);
        setImageResource(i2);
        int dimension = (int) getResources().getDimension(R.dimen.encore_graphic_size_decorative_smaller_2);
        setMinimumWidth(dimension);
        setMinimumHeight(dimension);
        if (getImageTintList() == null) {
            setImageTintList(lzj.m60387w(getContext(), R.color.encore_icon_color_stateful));
        }
        setIconActive(x4w0.m89923N(getContext(), attributeSet, i).f124212a);
    }

    private final boolean getShouldUseSmallGlyph() {
        qr60 qr60Var = f287510f[1];
        return ((Boolean) this.f287512e.f61172a).booleanValue();
    }

    private final void setShouldUseSmallGlyph(boolean z) {
        this.f287512e.m39516c(f287510f[1], this, Boolean.valueOf(z));
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        ArrayList arrayList = new ArrayList();
        qr60 qr60Var = f287510f[0];
        if (((Boolean) this.f287511d.f61172a).booleanValue()) {
            arrayList.add(Integer.valueOf(R.attr.state_icon_active));
        }
        if (getShouldUseSmallGlyph()) {
            arrayList.add(Integer.valueOf(R.attr.state_small_glyph));
        }
        return !arrayList.isEmpty() ? View.mergeDrawableStates(super.onCreateDrawableState(arrayList.size() + i), g6f.m43726i1(arrayList)) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xy8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xy8 xy8Var = (xy8) parcelable;
        super.onRestoreInstanceState(xy8Var.m66261c());
        setIconActive(xy8Var.m92417g());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return parcelableOnSaveInstanceState;
        }
        xy8 xy8Var = new xy8(parcelableOnSaveInstanceState);
        qr60 qr60Var = f287510f[0];
        xy8Var.m92418h(((Boolean) this.f287511d.f61172a).booleanValue());
        return xy8Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ImageView.ScaleType scaleType = getScaleType();
        int i5 = scaleType == null ? -1 : yy8.f277440a[scaleType.ordinal()];
        pqm0 pqm0Var = (i5 == 1 || i5 == 2) ? new pqm0(Integer.valueOf(i), Integer.valueOf(i2)) : new pqm0(Integer.valueOf((i - getPaddingStart()) - getPaddingEnd()), Integer.valueOf((i2 - getPaddingBottom()) - getPaddingTop()));
        setShouldUseSmallGlyph(qzb0.m74318r(Math.min(((Number) pqm0Var.f180350a).intValue(), ((Number) pqm0Var.f180351b).intValue()), getResources()));
    }

    public final void setIconActive(boolean z) {
        this.f287511d.m39516c(f287510f[0], this, Boolean.valueOf(z));
    }
}
