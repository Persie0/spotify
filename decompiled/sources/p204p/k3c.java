package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.legacyglue.viewgroup.PasteLinearLayout;
import com.spotify.music.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class k3c extends PasteLinearLayout {

    /* JADX INFO: renamed from: e */
    public final ImageView f118834e;

    /* JADX INFO: renamed from: f */
    public final TextView f118835f;

    /* JADX INFO: renamed from: g */
    public final TextView f118836g;

    /* JADX INFO: renamed from: h */
    public b0c f118837h;

    /* JADX INFO: renamed from: i */
    public boolean f118838i;

    /* JADX INFO: renamed from: t */
    public float f118839t;

    public k3c(Context context) {
        super(context, null, 0);
        this.f118838i = false;
        this.f118839t = 1.0f;
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.glue_card, this);
        ImageView imageView = (ImageView) findViewById(android.R.id.icon);
        this.f118834e = imageView;
        TextView textView = (TextView) findViewById(R.id.title);
        this.f118835f = textView;
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.f118836g = textView2;
        setGravity(1);
        TextView[] textViewArr = {textView, textView2};
        eng1.m39510t(textViewArr);
        eng1.m39509s(textViewArr);
        eng1.m39508r(this);
        setClickable(true);
        q3r0 q3r0VarM26333p = alf1.m26333p(this);
        Collections.addAll(q3r0VarM26333p.f184933d, imageView);
        Collections.addAll(q3r0VarM26333p.f184932c, textView, textView2);
        q3r0VarM26333p.m72126a();
        if (isInEditMode()) {
            return;
        }
        textView2.setVisibility(8);
    }

    /* JADX INFO: renamed from: c */
    public static int m55234c(TextView textView, int i) {
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        return (((fontMetricsInt.bottom - fontMetricsInt.top) + fontMetricsInt.leading) * i) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    public final void m55235b(int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        float f = i;
        int iRound = Math.round(this.f118839t * f);
        int iRound2 = Math.round(((this.f118839t * 0.5f) + 0.5f) * f);
        this.f118835f.measure(View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824), iMakeMeasureSpec);
        this.f118836g.measure(View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824), iMakeMeasureSpec);
        this.f118834e.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
    }

    /* JADX INFO: renamed from: d */
    public final void m55236d() {
        TextView textView;
        TextView textView2;
        if (this.f118838i || (textView = this.f118835f) == null || (textView2 = this.f118836g) == null) {
            return;
        }
        super.setContentDescription(klh.m56834f(String.valueOf(textView.getText()), "\n", String.valueOf(textView2.getText())));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0c b0cVar = this.f118837h;
        if (b0cVar != null) {
            int i = b0cVar.f21831j;
            int i2 = b0cVar.f21832k;
            canvas.save();
            boolean zM83801y = uqg1.m83801y(this);
            ImageView imageView = this.f118834e;
            if (zM83801y) {
                canvas.translate(Math.round(((1.0f - this.f118839t) * getMeasuredWidth()) / 2.0f) + i2, (imageView.getMeasuredHeight() - i) - i2);
            } else {
                canvas.translate(((canvas.getWidth() - i) - i2) - Math.round(((1.0f - this.f118839t) * getMeasuredWidth()) / 2.0f), (imageView.getMeasuredHeight() - i) - i2);
            }
            b0cVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        boolean z = false;
        for (int i : getDrawableState()) {
            z |= i == -16842910;
        }
        if (z) {
            setAlpha(0.4f);
        }
    }

    public float getCardImageWidthRatio() {
        return this.f118839t;
    }

    public ImageView getImageView() {
        return this.f118834e;
    }

    public TextView getSubtitleView() {
        return this.f118836g;
    }

    public TextView getTitleView() {
        return this.f118835f;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth() / 2;
        ImageView imageView = this.f118834e;
        int measuredWidth2 = measuredWidth - (imageView.getMeasuredWidth() / 2);
        int measuredWidth3 = imageView.getMeasuredWidth() + measuredWidth2;
        int measuredWidth4 = getMeasuredWidth() / 2;
        TextView textView = this.f118835f;
        int measuredWidth5 = measuredWidth4 - (textView.getMeasuredWidth() / 2);
        int measuredWidth6 = textView.getMeasuredWidth() + measuredWidth5;
        int measuredHeight = imageView.getMeasuredHeight();
        imageView.layout(measuredWidth2, 0, measuredWidth3, measuredHeight);
        if (textView.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i5 = measuredHeight + marginLayoutParams.topMargin;
            textView.layout(measuredWidth5, i5, measuredWidth6, textView.getMeasuredHeight() + i5);
            measuredHeight = textView.getMeasuredHeight() + i5 + marginLayoutParams.bottomMargin;
        }
        TextView textView2 = this.f118836g;
        if (textView2.getVisibility() != 8) {
            int i6 = measuredHeight + ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).topMargin;
            textView2.layout(measuredWidth5, i6, measuredWidth6, textView2.getMeasuredHeight() + i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int measuredHeight2 = 0;
        int maxLines = 1;
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            c95.m31843i(size2 < size);
            m55235b(size2);
            setMeasuredDimension(size2, size);
            return;
        }
        Object[] objArr = View.MeasureSpec.getMode(i) == 0;
        Object[] objArr2 = View.MeasureSpec.getMode(i2) == 0;
        if (objArr == objArr2) {
            super.onMeasure(i, i2);
            return;
        }
        ImageView imageView = this.f118834e;
        TextView textView = this.f118835f;
        TextView textView2 = this.f118836g;
        if (objArr2 == true) {
            m55235b(size2);
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int maxLines2 = textView2.getMaxLines();
            if (textView.getVisibility() == 8 && maxLines2 == 2) {
                maxLines2 = 1;
            } else {
                maxLines = textView.getMaxLines();
            }
            int iRound = Math.round(((size - m55234c(textView, maxLines)) - m55234c(textView2, maxLines2)) / this.f118839t);
            float f = iRound;
            int iRound2 = Math.round(this.f118839t * f);
            int iRound3 = Math.round(((this.f118839t * 0.5f) + 0.5f) * f);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iRound3, 1073741824);
            textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec);
            textView2.measure(iMakeMeasureSpec3, iMakeMeasureSpec);
            imageView.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
            size2 = iRound;
        }
        int measuredHeight3 = imageView.getMeasuredHeight();
        if (textView.getVisibility() != 8) {
            if (textView.getVisibility() == 8) {
                measuredHeight = 0;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                measuredHeight = textView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            measuredHeight3 += measuredHeight;
        }
        if (textView2.getVisibility() != 8) {
            if (textView2.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                measuredHeight2 = textView2.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            }
            measuredHeight3 += measuredHeight2;
        }
        setMeasuredDimension(size2, measuredHeight3);
    }

    public void setAccessoryDrawable(b0c b0cVar) {
        this.f118837h = b0cVar;
        postInvalidate();
    }

    public void setAppearance(k0c k0cVar) {
        int iOrdinal = k0cVar.ordinal();
        TextView textView = this.f118836g;
        TextView textView2 = this.f118835f;
        switch (iOrdinal) {
            case 0:
                textView2.setVisibility(4);
                textView.setVisibility(4);
                break;
            case 1:
                textView2.setVisibility(0);
                textView.setVisibility(4);
                break;
            case 2:
                bug1.m30514D(getContext(), textView, R.attr.pasteTextAppearanceBodySmall);
                textView2.setVisibility(0);
                textView.setTextColor(getContext().getColor(R.color.opacity_white_70));
                textView.setVisibility(0);
                break;
            case 3:
                bug1.m30514D(getContext(), textView, R.attr.pasteTextAppearanceMetadata);
                textView2.setVisibility(0);
                textView.setTextColor(getContext().getColor(R.color.opacity_white_70));
                textView.setVisibility(0);
                break;
            case 4:
                bug1.m30514D(getContext(), textView2, R.attr.pasteTextAppearanceBodyMedium);
                textView2.setVisibility(0);
                textView2.setTextColor(getContext().getColor(R.color.opacity_white_70));
                textView.setVisibility(8);
                this.f118839t = 0.66f;
                setTextLayout(wzb.f256551b);
                textView2.setTag(R.id.baselines_original_top_margin, Integer.valueOf(wqg1.m88767v(24.0f, getResources())));
                textView2.setTag(R.id.baselines_original_bottom_margin, Integer.valueOf(wqg1.m88767v(8.0f, getResources())));
                break;
            case 5:
                textView2.setVisibility(8);
                textView.setVisibility(8);
                this.f118839t = 0.66f;
                break;
            case 6:
                bug1.m30514D(getContext(), textView2, R.attr.pasteTextAppearanceBodySmall);
                textView2.setVisibility(0);
                textView2.setTextColor(getContext().getColor(R.color.opacity_white_70));
                textView.setVisibility(8);
                setTextLayout(wzb.f256551b);
                textView2.setTag(R.id.baselines_original_top_margin, Integer.valueOf(wqg1.m88767v(24.0f, getResources())));
                textView2.setTag(R.id.baselines_original_bottom_margin, Integer.valueOf(wqg1.m88767v(8.0f, getResources())));
                break;
            case 7:
                textView2.setVisibility(8);
                textView.setTag(R.id.baselines_original_top_margin, Integer.valueOf(wqg1.m88767v(20.0f, getResources())));
                bug1.m30514D(getContext(), textView, R.attr.pasteTextAppearanceBodySmall);
                textView.setTextColor(getContext().getColor(R.color.opacity_white_70));
                textView.setMaxLines(2);
                textView.setVisibility(0);
                break;
            default:
                throw new IllegalArgumentException("Unsupported CardAppearance: ".concat(String.valueOf(k0cVar)));
        }
        eng1.m39508r(this);
    }

    public void setCardImageWidthRatio(float f) {
        c95.m31843i(((double) f) >= 0.5d && f <= 1.0f);
        this.f118839t = f;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.f118838i = charSequence != null;
        m55236d();
    }

    public void setImageResource(int i) {
        this.f118834e.setImageResource(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f118836g.setText(charSequence);
        m55236d();
    }

    public void setTextLayout(wzb wzbVar) {
        int iOrdinal = wzbVar.ordinal();
        TextView textView = this.f118836g;
        TextView textView2 = this.f118835f;
        if (iOrdinal == 0) {
            textView2.setMaxLines(1);
            textView.setMaxLines(1);
        } else if (iOrdinal == 1) {
            textView2.setMaxLines(3);
            textView.setMaxLines(1);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            textView2.setMaxLines(1);
            textView.setMaxLines(2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f118835f.setText(charSequence);
        m55236d();
    }
}
