package p204p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lhe0 implements s561 {

    /* JADX INFO: renamed from: A */
    public q50 f133525A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f133526B;

    /* JADX INFO: renamed from: a */
    public final int f133528a;

    /* JADX INFO: renamed from: b */
    public final int f133529b;

    /* JADX INFO: renamed from: c */
    public final int f133530c;

    /* JADX INFO: renamed from: d */
    public final int f133531d;

    /* JADX INFO: renamed from: e */
    public CharSequence f133532e;

    /* JADX INFO: renamed from: f */
    public CharSequence f133533f;

    /* JADX INFO: renamed from: g */
    public Intent f133534g;

    /* JADX INFO: renamed from: h */
    public char f133535h;

    /* JADX INFO: renamed from: j */
    public char f133537j;

    /* JADX INFO: renamed from: l */
    public Drawable f133539l;

    /* JADX INFO: renamed from: n */
    public final zge0 f133541n;

    /* JADX INFO: renamed from: o */
    public gr51 f133542o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f133543p;

    /* JADX INFO: renamed from: q */
    public CharSequence f133544q;

    /* JADX INFO: renamed from: r */
    public CharSequence f133545r;

    /* JADX INFO: renamed from: y */
    public int f133552y;

    /* JADX INFO: renamed from: z */
    public View f133553z;

    /* JADX INFO: renamed from: i */
    public int f133536i = 4096;

    /* JADX INFO: renamed from: k */
    public int f133538k = 4096;

    /* JADX INFO: renamed from: m */
    public int f133540m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f133546s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f133547t = null;

    /* JADX INFO: renamed from: u */
    public boolean f133548u = false;

    /* JADX INFO: renamed from: v */
    public boolean f133549v = false;

    /* JADX INFO: renamed from: w */
    public boolean f133550w = false;

    /* JADX INFO: renamed from: x */
    public int f133551x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f133527C = false;

    public lhe0(zge0 zge0Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f133541n = zge0Var;
        this.f133528a = i2;
        this.f133529b = i;
        this.f133530c = i3;
        this.f133531d = i4;
        this.f133532e = charSequence;
        this.f133552y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m58967c(StringBuilder sb, String str, int i, int i2) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p204p.s561
    /* JADX INFO: renamed from: a */
    public final s561 mo58968a(q50 q50Var) {
        this.f133553z = null;
        this.f133525A = q50Var;
        this.f133541n.m96069q(true);
        q50 q50Var2 = this.f133525A;
        if (q50Var2 != null) {
            q50Var2.mo64480g(new m680(this, 17));
        }
        return this;
    }

    @Override // p204p.s561
    /* JADX INFO: renamed from: b */
    public final q50 mo58969b() {
        return this.f133525A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f133552y & 8) == 0) {
            return false;
        }
        if (this.f133553z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f133526B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f133541n.mo45457e(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m58970d(Drawable drawable) {
        if (drawable != null && this.f133550w && (this.f133548u || this.f133549v)) {
            drawable = drawable.mutate();
            if (this.f133548u) {
                drawable.setTintList(this.f133546s);
            }
            if (this.f133549v) {
                drawable.setTintMode(this.f133547t);
            }
            this.f133550w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58971e() {
        q50 q50Var;
        if ((this.f133552y & 8) == 0) {
            return false;
        }
        if (this.f133553z == null && (q50Var = this.f133525A) != null) {
            this.f133553z = q50Var.mo64476c(this);
        }
        return this.f133553z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m58971e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f133526B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f133541n.mo45459g(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58972f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f133543p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            zge0 zge0Var = this.f133541n;
            if (!zge0Var.mo45458f(zge0Var, this)) {
                Intent intent = this.f133534g;
                if (intent != null) {
                    try {
                        zge0Var.f282600a.startActivity(intent);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                q50 q50Var = this.f133525A;
                if (q50Var == null || !q50Var.mo64477d()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m58973g(boolean z) {
        if (z) {
            this.f133551x |= 32;
        } else {
            this.f133551x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f133553z;
        if (view != null) {
            return view;
        }
        q50 q50Var = this.f133525A;
        if (q50Var == null) {
            return null;
        }
        View viewMo64476c = q50Var.mo64476c(this);
        this.f133553z = viewMo64476c;
        return viewMo64476c;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f133538k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f133537j;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f133544q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f133529b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f133539l;
        if (drawable != null) {
            return m58970d(drawable);
        }
        int i = this.f133540m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM50639w = ihf1.m50639w(this.f133541n.f282600a, i);
        this.f133540m = 0;
        this.f133539l = drawableM50639w;
        return m58970d(drawableM50639w);
    }

    @Override // p204p.s561, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f133546s;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f133547t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f133534g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f133528a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f133536i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f133535h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f133530c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f133542o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f133532e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f133533f;
        return charSequence != null ? charSequence : this.f133532e;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f133545r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f133542o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f133527C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f133551x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f133551x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f133551x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        q50 q50Var = this.f133525A;
        if (q50Var == null || !q50Var.mo64479f()) {
            return (this.f133551x & 8) == 0;
        }
        return (this.f133551x & 8) == 0 && this.f133525A.mo64475b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f133553z = view;
        this.f133525A = null;
        if (view != null && view.getId() == -1 && (i = this.f133528a) > 0) {
            view.setId(i);
        }
        zge0 zge0Var = this.f133541n;
        zge0Var.f282610k = true;
        zge0Var.m96069q(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f133537j == c) {
            return this;
        }
        this.f133537j = Character.toLowerCase(c);
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f133551x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f133551x = i2;
        if (i != i2) {
            this.f133541n.m96069q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f133551x;
        int i2 = i & 4;
        zge0 zge0Var = this.f133541n;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f133551x = i3;
            if (i != i3) {
                zge0Var.m96069q(false);
            }
            return this;
        }
        ArrayList arrayList = zge0Var.f282605f;
        int size = arrayList.size();
        zge0Var.m96060A();
        for (int i4 = 0; i4 < size; i4++) {
            lhe0 lhe0Var = (lhe0) arrayList.get(i4);
            if (lhe0Var.f133529b == this.f133529b && (lhe0Var.f133551x & 4) != 0 && lhe0Var.isCheckable()) {
                boolean z2 = lhe0Var == this;
                int i5 = lhe0Var.f133551x;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                lhe0Var.f133551x = i6;
                if (i5 != i6) {
                    lhe0Var.f133541n.m96069q(false);
                }
            }
        }
        zge0Var.m96077z();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f133551x |= 16;
        } else {
            this.f133551x &= -17;
        }
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f133540m = 0;
        this.f133539l = drawable;
        this.f133550w = true;
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f133546s = colorStateList;
        this.f133548u = true;
        this.f133550w = true;
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f133547t = mode;
        this.f133549v = true;
        this.f133550w = true;
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f133534g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f133535h == c) {
            return this;
        }
        this.f133535h = c;
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f133526B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f133543p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f133535h = c;
        this.f133537j = Character.toLowerCase(c2);
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f133552y = i;
        zge0 zge0Var = this.f133541n;
        zge0Var.f282610k = true;
        zge0Var.m96069q(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f133532e = charSequence;
        this.f133541n.m96069q(false);
        gr51 gr51Var = this.f133542o;
        if (gr51Var != null) {
            gr51Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f133533f = charSequence;
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f133551x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f133551x = i2;
        if (i != i2) {
            zge0 zge0Var = this.f133541n;
            zge0Var.f282607h = true;
            zge0Var.m96069q(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f133532e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final s561 setContentDescription(CharSequence charSequence) {
        this.f133544q = charSequence;
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final s561 setTooltipText(CharSequence charSequence) {
        this.f133545r = charSequence;
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f133537j == c && this.f133538k == i) {
            return this;
        }
        this.f133537j = Character.toLowerCase(c);
        this.f133538k = KeyEvent.normalizeMetaState(i);
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f133535h == c && this.f133536i == i) {
            return this;
        }
        this.f133535h = c;
        this.f133536i = KeyEvent.normalizeMetaState(i);
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f133535h = c;
        this.f133536i = KeyEvent.normalizeMetaState(i);
        this.f133537j = Character.toLowerCase(c2);
        this.f133538k = KeyEvent.normalizeMetaState(i2);
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f133539l = null;
        this.f133540m = i;
        this.f133550w = true;
        this.f133541n.m96069q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f133541n.f282600a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        zge0 zge0Var = this.f133541n;
        Context context = zge0Var.f282600a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f133553z = viewInflate;
        this.f133525A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f133528a) > 0) {
            viewInflate.setId(i2);
        }
        zge0Var.f282610k = true;
        zge0Var.m96069q(true);
        return this;
    }
}
