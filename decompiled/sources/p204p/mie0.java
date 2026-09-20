package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes3.dex */
public class mie0 extends AbstractC1895gf implements Menu {

    /* JADX INFO: renamed from: c */
    public final zge0 f144011c;

    public mie0(Context context, zge0 zge0Var) {
        super(context);
        if (zge0Var == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f144011c = zge0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m44553i(this.f144011c.m96061a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f144011c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m44553i(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f144011c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        ab21 ab21Var = (ab21) this.f79243b;
        if (ab21Var != null) {
            ab21Var.clear();
        }
        this.f144011c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f144011c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m44553i(this.f144011c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m44553i(this.f144011c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f144011c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f144011c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f144011c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f144011c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((ab21) this.f79243b) != null) {
            int i2 = 0;
            while (true) {
                ab21 ab21Var = (ab21) this.f79243b;
                if (i2 >= ab21Var.f13976c) {
                    break;
                }
                if (((s561) ab21Var.m25312f(i2)).getGroupId() == i) {
                    ((ab21) this.f79243b).m25313g(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f144011c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((ab21) this.f79243b) != null) {
            int i2 = 0;
            while (true) {
                ab21 ab21Var = (ab21) this.f79243b;
                if (i2 >= ab21Var.f13976c) {
                    break;
                }
                if (((s561) ab21Var.m25312f(i2)).getItemId() == i) {
                    ((ab21) this.f79243b).m25313g(i2);
                    break;
                }
                i2++;
            }
        }
        this.f144011c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f144011c.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f144011c.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f144011c.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f144011c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f144011c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f144011c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m44553i(this.f144011c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f144011c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m44553i(this.f144011c.m96061a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f144011c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m44553i(this.f144011c.add(i, i2, i3, i4));
    }
}
