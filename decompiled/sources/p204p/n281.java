package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class n281 implements mro {

    /* JADX INFO: renamed from: a */
    public final Toolbar f149687a;

    /* JADX INFO: renamed from: b */
    public int f149688b;

    /* JADX INFO: renamed from: c */
    public final View f149689c;

    /* JADX INFO: renamed from: d */
    public Drawable f149690d;

    /* JADX INFO: renamed from: e */
    public Drawable f149691e;

    /* JADX INFO: renamed from: f */
    public Drawable f149692f;

    /* JADX INFO: renamed from: g */
    public final boolean f149693g;

    /* JADX INFO: renamed from: h */
    public CharSequence f149694h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f149695i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f149696j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f149697k;

    /* JADX INFO: renamed from: l */
    public boolean f149698l;

    /* JADX INFO: renamed from: m */
    public b50 f149699m;

    /* JADX INFO: renamed from: n */
    public final int f149700n;

    /* JADX INFO: renamed from: o */
    public final Drawable f149701o;

    public n281(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f149700n = 0;
        this.f149687a = toolbar;
        this.f149694h = toolbar.getTitle();
        this.f149695i = toolbar.getSubtitle();
        this.f149693g = this.f149694h != null;
        this.f149692f = toolbar.getNavigationIcon();
        cx21 cx21VarM34178J = cx21.m34178J(toolbar.getContext(), null, h3u0.f87321a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) cx21VarM34178J.f42890c;
        int i = 15;
        this.f149701o = cx21VarM34178J.m34202l(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f149693g = true;
                this.f149694h = text;
                if ((this.f149688b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f149693g) {
                        mec1.m61566r(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f149695i = text2;
                if ((this.f149688b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableM34202l = cx21VarM34178J.m34202l(20);
            if (drawableM34202l != null) {
                this.f149691e = drawableM34202l;
                m63546c();
            }
            Drawable drawableM34202l2 = cx21VarM34178J.m34202l(17);
            if (drawableM34202l2 != null) {
                this.f149690d = drawableM34202l2;
                m63546c();
            }
            if (this.f149692f == null && (drawable = this.f149701o) != null) {
                this.f149692f = drawable;
                if ((this.f149688b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            m63544a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f149689c;
                if (view != null && (this.f149688b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f149689c = viewInflate;
                if (viewInflate != null && (this.f149688b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                m63544a(this.f149688b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                if (toolbar.f316U0 == null) {
                    toolbar.f316U0 = new ttx0();
                }
                toolbar.f316U0.m81543g(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f308M0 = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f324b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f309N0 = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f326c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f149701o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f149688b = i;
        }
        cx21VarM34178J.m34189K();
        if (R.string.abc_action_bar_up_description != this.f149700n) {
            this.f149700n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.f149700n;
                this.f149696j = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                m63545b();
            }
        }
        this.f149696j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new rsw0(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m63544a(int i) {
        View view;
        int i2 = this.f149688b ^ i;
        this.f149688b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.f149687a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m63545b();
                }
                if ((this.f149688b & 4) != 0) {
                    Drawable drawable = this.f149692f;
                    if (drawable == null) {
                        drawable = this.f149701o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m63546c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f149694h);
                    toolbar.setSubtitle(this.f149695i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f149689c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m63545b() {
        if ((this.f149688b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f149696j);
            Toolbar toolbar = this.f149687a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f149700n);
            } else {
                toolbar.setNavigationContentDescription(this.f149696j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m63546c() {
        Drawable drawable;
        int i = this.f149688b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f149691e) == null) {
            drawable = this.f149690d;
        }
        this.f149687a.setLogo(drawable);
    }
}
