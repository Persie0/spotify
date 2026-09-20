package p204p;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q73 {

    /* JADX INFO: renamed from: A */
    public final int f185989A;

    /* JADX INFO: renamed from: B */
    public final int f185990B;

    /* JADX INFO: renamed from: C */
    public final int f185991C;

    /* JADX INFO: renamed from: D */
    public final boolean f185992D;

    /* JADX INFO: renamed from: E */
    public final o73 f185993E;

    /* JADX INFO: renamed from: a */
    public final Context f185995a;

    /* JADX INFO: renamed from: b */
    public final s73 f185996b;

    /* JADX INFO: renamed from: c */
    public final Window f185997c;

    /* JADX INFO: renamed from: d */
    public CharSequence f185998d;

    /* JADX INFO: renamed from: e */
    public CharSequence f185999e;

    /* JADX INFO: renamed from: f */
    public AlertController$RecycleListView f186000f;

    /* JADX INFO: renamed from: g */
    public View f186001g;

    /* JADX INFO: renamed from: i */
    public Button f186003i;

    /* JADX INFO: renamed from: j */
    public CharSequence f186004j;

    /* JADX INFO: renamed from: k */
    public Message f186005k;

    /* JADX INFO: renamed from: l */
    public Button f186006l;

    /* JADX INFO: renamed from: m */
    public CharSequence f186007m;

    /* JADX INFO: renamed from: n */
    public Message f186008n;

    /* JADX INFO: renamed from: o */
    public Button f186009o;

    /* JADX INFO: renamed from: p */
    public CharSequence f186010p;

    /* JADX INFO: renamed from: q */
    public Message f186011q;

    /* JADX INFO: renamed from: r */
    public NestedScrollView f186012r;

    /* JADX INFO: renamed from: s */
    public Drawable f186013s;

    /* JADX INFO: renamed from: t */
    public ImageView f186014t;

    /* JADX INFO: renamed from: u */
    public TextView f186015u;

    /* JADX INFO: renamed from: v */
    public TextView f186016v;

    /* JADX INFO: renamed from: w */
    public View f186017w;

    /* JADX INFO: renamed from: x */
    public ListAdapter f186018x;

    /* JADX INFO: renamed from: z */
    public final int f186020z;

    /* JADX INFO: renamed from: h */
    public boolean f186002h = false;

    /* JADX INFO: renamed from: y */
    public int f186019y = -1;

    /* JADX INFO: renamed from: F */
    public final y10 f185994F = new y10(this, 2);

    public q73(Context context, s73 s73Var, Window window) {
        this.f185995a = context;
        this.f185996b = s73Var;
        this.f185997c = window;
        o73 o73Var = new o73();
        o73Var.f162454b = new WeakReference(s73Var);
        this.f185993E = o73Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h3u0.f87325e, R.attr.alertDialogStyle, 0);
        this.f186020z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f185989A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f185990B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f185991C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f185992D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        s73Var.m63757d().mo31530f(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72277a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m72277a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static ViewGroup m72278e(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: b */
    public final void m72279b() {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        this.f185996b.setContentView(this.f186020z);
        Window window = this.f185997c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = this.f186001g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !m72277a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f186002h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (this.f186000f != null) {
                ((LinearLayout.LayoutParams) ((cl80) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM72278e = m72278e(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM72278e2 = m72278e(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM72278e3 = m72278e(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        this.f186012r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f186012r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM72278e2.findViewById(android.R.id.message);
        this.f186016v = textView;
        if (textView != null) {
            CharSequence charSequence = this.f185999e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f186012r.removeView(this.f186016v);
                if (this.f186000f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f186012r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(this.f186012r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(this.f186000f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM72278e2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM72278e3.findViewById(android.R.id.button1);
        this.f186003i = button;
        y10 y10Var = this.f185994F;
        button.setOnClickListener(y10Var);
        if (TextUtils.isEmpty(this.f186004j)) {
            this.f186003i.setVisibility(8);
            i = 0;
        } else {
            this.f186003i.setText(this.f186004j);
            this.f186003i.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM72278e3.findViewById(android.R.id.button2);
        this.f186006l = button2;
        button2.setOnClickListener(y10Var);
        if (TextUtils.isEmpty(this.f186007m)) {
            this.f186006l.setVisibility(8);
        } else {
            this.f186006l.setText(this.f186007m);
            this.f186006l.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM72278e3.findViewById(android.R.id.button3);
        this.f186009o = button3;
        button3.setOnClickListener(y10Var);
        if (TextUtils.isEmpty(this.f186010p)) {
            this.f186009o.setVisibility(8);
        } else {
            this.f186009o.setText(this.f186010p);
            this.f186009o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        this.f185995a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = this.f186003i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = this.f186006l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = this.f186009o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM72278e3.setVisibility(8);
        }
        if (this.f186017w != null) {
            viewGroupM72278e.addView(this.f186017w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            this.f186014t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(this.f185998d) || !this.f185992D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                this.f186014t.setVisibility(8);
                viewGroupM72278e.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                this.f186015u = textView2;
                textView2.setText(this.f185998d);
                Drawable drawable = this.f186013s;
                if (drawable != null) {
                    this.f186014t.setImageDrawable(drawable);
                } else {
                    this.f186015u.setPadding(this.f186014t.getPaddingLeft(), this.f186014t.getPaddingTop(), this.f186014t.getPaddingRight(), this.f186014t.getPaddingBottom());
                    this.f186014t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM72278e == null || viewGroupM72278e.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM72278e3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM72278e2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = this.f186012r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (this.f185999e == null && this.f186000f == null) ? null : viewGroupM72278e.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM72278e2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = this.f186000f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f63a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f64b);
        }
        if (!z2) {
            View view2 = this.f186000f;
            if (view2 == null) {
                view2 = this.f186012r;
            }
            if (view2 != null) {
                int i3 = i2 | (z3 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = mec1.f142677a;
                dec1.m35775b(view2, i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM72278e2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM72278e2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = this.f186000f;
        if (alertController$RecycleListView2 == null || (listAdapter = this.f186018x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = this.f186019y;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m72280c(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f186012r;
        return nestedScrollView != null && nestedScrollView.m406o(keyEvent);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m72281d(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f186012r;
        return nestedScrollView != null && nestedScrollView.m406o(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public final void m72282f(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f185993E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f186010p = charSequence;
            this.f186011q = messageObtainMessage;
        } else if (i == -2) {
            this.f186007m = charSequence;
            this.f186008n = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f186004j = charSequence;
            this.f186005k = messageObtainMessage;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m72283g(CharSequence charSequence) {
        this.f185998d = charSequence;
        TextView textView = this.f186015u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
