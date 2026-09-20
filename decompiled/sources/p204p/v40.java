package p204p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class v40 implements s561 {

    /* JADX INFO: renamed from: a */
    public CharSequence f236997a;

    /* JADX INFO: renamed from: b */
    public CharSequence f236998b;

    /* JADX INFO: renamed from: c */
    public Intent f236999c;

    /* JADX INFO: renamed from: d */
    public char f237000d;

    /* JADX INFO: renamed from: e */
    public int f237001e;

    /* JADX INFO: renamed from: f */
    public char f237002f;

    /* JADX INFO: renamed from: g */
    public int f237003g;

    /* JADX INFO: renamed from: h */
    public Drawable f237004h;

    /* JADX INFO: renamed from: i */
    public Context f237005i;

    /* JADX INFO: renamed from: j */
    public CharSequence f237006j;

    /* JADX INFO: renamed from: k */
    public CharSequence f237007k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f237008l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f237009m;

    /* JADX INFO: renamed from: n */
    public boolean f237010n;

    /* JADX INFO: renamed from: o */
    public boolean f237011o;

    /* JADX INFO: renamed from: p */
    public int f237012p;

    @Override // p204p.s561
    /* JADX INFO: renamed from: a */
    public final s561 mo58968a(q50 q50Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.s561
    /* JADX INFO: renamed from: b */
    public final q50 mo58969b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m84630c() {
        Drawable drawable = this.f237004h;
        if (drawable != null) {
            if (this.f237010n || this.f237011o) {
                this.f237004h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f237004h = drawableMutate;
                if (this.f237010n) {
                    drawableMutate.setTintList(this.f237008l);
                }
                if (this.f237011o) {
                    this.f237004h.setTintMode(this.f237009m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f237003g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f237002f;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f237006j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f237004h;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f237008l;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f237009m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f236999c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f237001e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f237000d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f236997a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f236998b;
        return charSequence != null ? charSequence : this.f236997a;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f237007k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f237012p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f237012p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f237012p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f237012p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f237002f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f237012p = (z ? 1 : 0) | (this.f237012p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f237012p = (z ? 2 : 0) | (this.f237012p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f237006j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f237012p = (z ? 16 : 0) | (this.f237012p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f237004h = drawable;
        m84630c();
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f237008l = colorStateList;
        this.f237010n = true;
        m84630c();
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f237009m = mode;
        this.f237011o = true;
        m84630c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f236999c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f237000d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f237000d = c;
        this.f237002f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f236997a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f236998b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f237007k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f237012p = (this.f237012p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f237002f = Character.toLowerCase(c);
        this.f237003g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final s561 setContentDescription(CharSequence charSequence) {
        this.f237006j = charSequence;
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f237000d = c;
        this.f237001e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f236997a = this.f237005i.getResources().getString(i);
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final s561 setTooltipText(CharSequence charSequence) {
        this.f237007k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f237004h = this.f237005i.getDrawable(i);
        m84630c();
        return this;
    }

    @Override // p204p.s561, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f237000d = c;
        this.f237001e = KeyEvent.normalizeMetaState(i);
        this.f237002f = Character.toLowerCase(c2);
        this.f237003g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
