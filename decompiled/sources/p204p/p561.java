package p204p;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class p561 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: d */
    public static final Class[] f174085d = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174086a = 0;

    /* JADX INFO: renamed from: b */
    public Object f174087b;

    /* JADX INFO: renamed from: c */
    public Object f174088c;

    public /* synthetic */ p561() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f174086a) {
            case 0:
                Object obj = this.f174087b;
                Method method = (Method) this.f174088c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.f174087b).onMenuItemClick(((qhe0) this.f174088c).m44553i(menuItem));
        }
    }

    public p561(qhe0 qhe0Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f174088c = qhe0Var;
        this.f174087b = onMenuItemClickListener;
    }
}
