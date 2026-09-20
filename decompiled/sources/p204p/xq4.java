package p204p;

import android.R;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class xq4 {

    /* JADX INFO: renamed from: a */
    public final yq4 f264863a;

    /* JADX INFO: renamed from: b */
    public final vq4 f264864b;

    /* JADX INFO: renamed from: c */
    public final vq4 f264865c;

    /* JADX INFO: renamed from: d */
    public final View f264866d;

    public xq4(yq4 yq4Var, vq4 vq4Var, vq4 vq4Var2, View view) {
        this.f264863a = yq4Var;
        this.f264864b = vq4Var;
        this.f264865c = vq4Var2;
        this.f264866d = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final boolean m91815a(Menu menu) {
        int i;
        int i2;
        o471 o471Var = (o471) this.f264864b.invoke();
        if (wj50.m88271j(o471Var, null)) {
            return false;
        }
        menu.clear();
        ?? r0 = o471Var.f161573a;
        int size = r0.size();
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            n471 n471Var = (n471) r0.get(i5);
            if (n471Var instanceof x471) {
                i = i3 + 1;
                Object obj = n471Var.f150228a;
                if (wj50.m88271j(obj, ebg1.f57928a)) {
                    i2 = R.id.cut;
                } else if (wj50.m88271j(obj, ebg1.f57929b)) {
                    i2 = R.id.copy;
                } else if (wj50.m88271j(obj, ebg1.f57930c)) {
                    i2 = R.id.paste;
                } else if (wj50.m88271j(obj, ebg1.f57931d)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = wj50.m88271j(obj, ebg1.f57932e) ? R.id.autofill : i3;
                }
                x471 x471Var = (x471) n471Var;
                MenuItem menuItemAdd = menu.add(i4, i2, i3, x471Var.f258003b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new wq4(0, x471Var, this));
            } else {
                if (n471Var instanceof d571) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i3 + 1;
                        d571 d571Var = (d571) n471Var;
                        r35.m74594b(menu, i3, this.f264866d.getContext(), d571Var.f45361b, d571Var.f45362c);
                    }
                } else if (n471Var instanceof b571) {
                    i4++;
                }
            }
            i3 = i;
        }
        return true;
    }
}
