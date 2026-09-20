package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.WeakHashMap;
import p204p.mec1;
import p204p.oyj;

/* JADX INFO: loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout implements oyj {

    /* JADX INFO: renamed from: a */
    public TextView f2162a;

    /* JADX INFO: renamed from: b */
    public Button f2163b;

    /* JADX INFO: renamed from: c */
    public int f2164c;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1625a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f2162a.getPaddingTop() == i2 && this.f2162a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f2162a;
        WeakHashMap weakHashMap = mec1.f142677a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f2163b;
    }

    public TextView getMessageView() {
        return this.f2162a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2162a = (TextView) findViewById(R.id.snackbar_text);
        this.f2163b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z = this.f2162a.getLayout().getLineCount() > 1;
        if (!z || this.f2164c <= 0 || this.f2163b.getMeasuredWidth() <= this.f2164c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m1625a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m1625a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f2164c = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
