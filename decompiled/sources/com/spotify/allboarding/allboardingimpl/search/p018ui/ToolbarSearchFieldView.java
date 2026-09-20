package com.spotify.allboarding.allboardingimpl.search.p018ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.spotify.allboarding.allboardingimpl.search.p018ui.ToolbarSearchFieldView;
import com.spotify.music.R;
import java.util.Collections;
import p204p.alf1;
import p204p.f151;
import p204p.g281;
import p204p.h281;
import p204p.i281;
import p204p.j1u0;
import p204p.k281;
import p204p.l281;
import p204p.mec1;
import p204p.oyp0;
import p204p.q3r0;
import p204p.tc41;
import p204p.vc41;
import p204p.vie1;
import p204p.wqg1;
import p204p.xoy0;

/* JADX INFO: loaded from: classes3.dex */
public class ToolbarSearchFieldView extends FrameLayout {

    /* JADX INFO: renamed from: P0 */
    public static final g281 f2860P0 = new g281();

    /* JADX INFO: renamed from: Q0 */
    public static final h281 f2861Q0 = new h281();

    /* JADX INFO: renamed from: L0 */
    public k281 f2862L0;

    /* JADX INFO: renamed from: M0 */
    public final oyp0 f2863M0;

    /* JADX INFO: renamed from: N0 */
    public final int f2864N0;

    /* JADX INFO: renamed from: O0 */
    public final int f2865O0;

    /* JADX INFO: renamed from: a */
    public int f2866a;

    /* JADX INFO: renamed from: b */
    public final int f2867b;

    /* JADX INFO: renamed from: c */
    public final View f2868c;

    /* JADX INFO: renamed from: d */
    public final BackKeyEditText f2869d;

    /* JADX INFO: renamed from: e */
    public final ImageButton f2870e;

    /* JADX INFO: renamed from: f */
    public final ImageButton f2871f;

    /* JADX INFO: renamed from: g */
    public final Button f2872g;

    /* JADX INFO: renamed from: h */
    public final View f2873h;

    /* JADX INFO: renamed from: i */
    public final i281 f2874i;

    /* JADX INFO: renamed from: t */
    public l281 f2875t;

    public ToolbarSearchFieldView(Context context) {
        this(context, null, 0);
    }

    public View getCancelButton() {
        return this.f2871f;
    }

    public i281 getCurrentDrawableState() {
        return this.f2874i;
    }

    public int getInsetX() {
        return this.f2864N0;
    }

    public int getInsetY() {
        return this.f2865O0;
    }

    public BackKeyEditText getQueryEditText() {
        return this.f2869d;
    }

    public View getRightButton() {
        return this.f2870e;
    }

    public View getSearchField() {
        return this.f2873h;
    }

    public Button getSearchPlaceHolder() {
        return this.f2872g;
    }

    public void setRightButtonVisible(boolean z) {
        this.f2870e.setVisibility(z ? 0 : 4);
    }

    public void setToolbarSearchFieldCallbacks(k281 k281Var) {
        this.f2862L0 = (k281) vie1.m85630l(k281Var, f2861Q0);
    }

    public void setToolbarSearchFieldRightButtonListener(l281 l281Var) {
        this.f2875t = (l281) vie1.m85630l(l281Var, f2860P0);
    }

    public ToolbarSearchFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarSearchFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2874i = i281.f97766b;
        this.f2875t = f2860P0;
        this.f2862L0 = f2861Q0;
        final int i2 = 1;
        LayoutInflater.from(context).inflate(R.layout.search_toolbar, (ViewGroup) this, true);
        setDescendantFocusability(262144);
        View viewM61562n = mec1.m61562n(this, R.id.search_field_root);
        this.f2868c = viewM61562n;
        BackKeyEditText backKeyEditText = (BackKeyEditText) mec1.m61562n(this, R.id.query);
        this.f2869d = backKeyEditText;
        ImageButton imageButton = (ImageButton) mec1.m61562n(this, R.id.search_right_button);
        this.f2870e = imageButton;
        Button button = (Button) mec1.m61562n(this, R.id.search_placeholder);
        this.f2872g = button;
        this.f2873h = mec1.m61562n(this, R.id.search_field);
        new tc41(context, vc41.CAMERA, context.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size)).m80417b(context.getColor(R.color.white));
        tc41 tc41Var = new tc41(context, vc41.X, context.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
        tc41Var.m80417b(context.getColor(R.color.white));
        ImageButton imageButton2 = (ImageButton) mec1.m61562n(this, R.id.cancel_button);
        this.f2871f = imageButton2;
        q3r0 q3r0VarM26332o = alf1.m26332o(imageButton2);
        final int i3 = 0;
        Collections.addAll(q3r0VarM26332o.f184933d, imageButton2);
        q3r0VarM26332o.m72126a();
        tc41 tc41Var2 = new tc41(context, vc41.ARROW_LEFT, context.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
        tc41Var2.m80417b(context.getColor(R.color.white));
        imageButton2.setImageDrawable(tc41Var2);
        int iM88767v = wqg1.m88767v(8.0f, context.getResources());
        int iM88767v2 = wqg1.m88767v(4.0f, context.getResources());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j1u0.f107867a, 0, 0);
        this.f2864N0 = iM88767v;
        this.f2865O0 = iM88767v;
        try {
            int color = typedArrayObtainStyledAttributes.getColor(1, context.getColor(R.color.gray_30));
            this.f2865O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM88767v);
            this.f2864N0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, iM88767v);
            xoy0 xoy0Var = new xoy0(this.f2864N0, this.f2865O0, typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, iM88767v2), color);
            typedArrayObtainStyledAttributes.recycle();
            viewM61562n.setBackground(xoy0Var);
            q3r0 q3r0VarM26332o2 = alf1.m26332o(button);
            Collections.addAll(q3r0VarM26332o2.f184932c, button);
            q3r0VarM26332o2.m72126a();
            tc41 tc41Var3 = new tc41(context, vc41.SEARCH, context.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
            tc41Var3.m80417b(context.getColor(R.color.white));
            this.f2867b = ((FrameLayout.LayoutParams) imageButton.getLayoutParams()).rightMargin;
            this.f2874i = i281.f97765a;
            imageButton.setImageDrawable(tc41Var);
            imageButton.setVisibility(8);
            button.setCompoundDrawablesRelativeWithIntrinsicBounds(tc41Var3, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f2863M0 = new oyp0(this, xoy0Var, button, getSearchField());
            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: p.f281

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ToolbarSearchFieldView f65132b;

                {
                    this.f65132b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            ToolbarSearchFieldView toolbarSearchFieldView = this.f65132b;
                            if (toolbarSearchFieldView.f2874i == i281.f97765a) {
                                toolbarSearchFieldView.f2875t.mo37175a();
                            }
                            break;
                        case 1:
                            this.f65132b.f2862L0.mo34168b();
                            break;
                        default:
                            this.f65132b.f2862L0.mo34167a();
                            break;
                    }
                }
            });
            imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: p.f281

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ToolbarSearchFieldView f65132b;

                {
                    this.f65132b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            ToolbarSearchFieldView toolbarSearchFieldView = this.f65132b;
                            if (toolbarSearchFieldView.f2874i == i281.f97765a) {
                                toolbarSearchFieldView.f2875t.mo37175a();
                            }
                            break;
                        case 1:
                            this.f65132b.f2862L0.mo34168b();
                            break;
                        default:
                            this.f65132b.f2862L0.mo34167a();
                            break;
                    }
                }
            });
            backKeyEditText.setBackKeyListener(new f151(this, 15));
            final int i4 = 2;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: p.f281

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ToolbarSearchFieldView f65132b;

                {
                    this.f65132b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            ToolbarSearchFieldView toolbarSearchFieldView = this.f65132b;
                            if (toolbarSearchFieldView.f2874i == i281.f97765a) {
                                toolbarSearchFieldView.f2875t.mo37175a();
                            }
                            break;
                        case 1:
                            this.f65132b.f2862L0.mo34168b();
                            break;
                        default:
                            this.f65132b.f2862L0.mo34167a();
                            break;
                    }
                }
            };
            viewM61562n.setOnClickListener(onClickListener);
            button.setOnClickListener(onClickListener);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
