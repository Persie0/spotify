package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.WeakHashMap;
import p204p.cx21;
import p204p.h3u0;
import p204p.kie0;
import p204p.lhe0;
import p204p.mec1;
import p204p.zge0;

/* JADX INFO: loaded from: classes3.dex */
public class ListMenuItemView extends LinearLayout implements kie0, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: L0 */
    public final int f78L0;

    /* JADX INFO: renamed from: M0 */
    public final Context f79M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f80N0;

    /* JADX INFO: renamed from: O0 */
    public final Drawable f81O0;

    /* JADX INFO: renamed from: P0 */
    public final boolean f82P0;

    /* JADX INFO: renamed from: Q0 */
    public LayoutInflater f83Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f84R0;

    /* JADX INFO: renamed from: a */
    public lhe0 f85a;

    /* JADX INFO: renamed from: b */
    public ImageView f86b;

    /* JADX INFO: renamed from: c */
    public RadioButton f87c;

    /* JADX INFO: renamed from: d */
    public TextView f88d;

    /* JADX INFO: renamed from: e */
    public CheckBox f89e;

    /* JADX INFO: renamed from: f */
    public TextView f90f;

    /* JADX INFO: renamed from: g */
    public ImageView f91g;

    /* JADX INFO: renamed from: h */
    public ImageView f92h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f93i;

    /* JADX INFO: renamed from: t */
    public final Drawable f94t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f83Q0 == null) {
            this.f83Q0 = LayoutInflater.from(getContext());
        }
        return this.f83Q0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f91g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f92h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f92h.getLayoutParams();
        rect.top = this.f92h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // p204p.kie0
    /* JADX INFO: renamed from: f */
    public final void mo70f(lhe0 lhe0Var) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f85a = lhe0Var;
        boolean zIsVisible = lhe0Var.isVisible();
        zge0 zge0Var = lhe0Var.f133541n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(lhe0Var.f133532e);
        setCheckable(lhe0Var.isCheckable());
        if (zge0Var.mo45464p()) {
            if ((zge0Var.mo45463o() ? lhe0Var.f133537j : lhe0Var.f133535h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        zge0Var.mo45463o();
        if (z) {
            lhe0 lhe0Var2 = this.f85a;
            zge0 zge0Var2 = lhe0Var2.f133541n;
            if (zge0Var2.mo45464p()) {
                if ((zge0Var2.mo45463o() ? lhe0Var2.f133537j : lhe0Var2.f133535h) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.f90f;
            lhe0 lhe0Var3 = this.f85a;
            zge0 zge0Var3 = lhe0Var3.f133541n;
            Context context = zge0Var3.f282600a;
            char c = zge0Var3.mo45463o() ? lhe0Var3.f133537j : lhe0Var3.f133535h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = zge0Var3.mo45463o() ? lhe0Var3.f133538k : lhe0Var3.f133536i;
                lhe0.m58967c(sb, resources.getString(R.string.abc_menu_meta_shortcut_label), i2, 65536);
                lhe0.m58967c(sb, resources.getString(R.string.abc_menu_ctrl_shortcut_label), i2, 4096);
                lhe0.m58967c(sb, resources.getString(R.string.abc_menu_alt_shortcut_label), i2, 2);
                lhe0.m58967c(sb, resources.getString(R.string.abc_menu_shift_shortcut_label), i2, 1);
                lhe0.m58967c(sb, resources.getString(R.string.abc_menu_sym_shortcut_label), i2, 4);
                lhe0.m58967c(sb, resources.getString(R.string.abc_menu_function_shortcut_label), i2, 8);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f90f.getVisibility() != i) {
            this.f90f.setVisibility(i);
        }
        setIcon(lhe0Var.getIcon());
        setEnabled(lhe0Var.isEnabled());
        setSubMenuArrowVisible(lhe0Var.hasSubMenu());
        setContentDescription(lhe0Var.f133544q);
    }

    @Override // p204p.kie0
    public lhe0 getItemData() {
        return this.f85a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(this.f94t);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f88d = textView;
        int i = this.f78L0;
        if (i != -1) {
            textView.setTextAppearance(this.f79M0, i);
        }
        this.f90f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f91g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f81O0);
        }
        this.f92h = (ImageView) findViewById(R.id.group_divider);
        this.f93i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f86b != null && this.f80N0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f86b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f87c == null && this.f89e == null) {
            return;
        }
        if ((this.f85a.f133551x & 4) != 0) {
            if (this.f87c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f87c = radioButton;
                LinearLayout linearLayout = this.f93i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f87c;
            view = this.f89e;
        } else {
            if (this.f89e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f89e = checkBox;
                LinearLayout linearLayout2 = this.f93i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f89e;
            view = this.f87c;
        }
        if (z) {
            compoundButton.setChecked(this.f85a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f89e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f87c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f85a.f133551x & 4) != 0) {
            if (this.f87c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f87c = radioButton;
                LinearLayout linearLayout = this.f93i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f87c;
        } else {
            if (this.f89e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f89e = checkBox;
                LinearLayout linearLayout2 = this.f93i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f89e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f84R0 = z;
        this.f80N0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f92h;
        if (imageView != null) {
            imageView.setVisibility((this.f82P0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        zge0 zge0Var = this.f85a.f133541n;
        boolean z = this.f84R0;
        if (z || this.f80N0) {
            ImageView imageView = this.f86b;
            if (imageView == null && drawable == null && !this.f80N0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f86b = imageView2;
                LinearLayout linearLayout = this.f93i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f80N0) {
                this.f86b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f86b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f86b.getVisibility() != 0) {
                this.f86b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f88d.getVisibility() != 8) {
                this.f88d.setVisibility(8);
            }
        } else {
            this.f88d.setText(charSequence);
            if (this.f88d.getVisibility() != 0) {
                this.f88d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        cx21 cx21VarM34178J = cx21.m34178J(getContext(), attributeSet, h3u0.f87338r, i);
        this.f94t = cx21VarM34178J.m34202l(5);
        TypedArray typedArray = (TypedArray) cx21VarM34178J.f42890c;
        this.f78L0 = typedArray.getResourceId(1, -1);
        this.f80N0 = typedArray.getBoolean(7, false);
        this.f79M0 = context;
        this.f81O0 = cx21VarM34178J.m34202l(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f82P0 = typedArrayObtainStyledAttributes.hasValue(0);
        cx21VarM34178J.m34189K();
        typedArrayObtainStyledAttributes.recycle();
    }
}
