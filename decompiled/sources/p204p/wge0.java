package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wge0 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final zge0 f251046a;

    /* JADX INFO: renamed from: b */
    public int f251047b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f251048c;

    /* JADX INFO: renamed from: d */
    public final boolean f251049d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f251050e;

    /* JADX INFO: renamed from: f */
    public final int f251051f;

    public wge0(zge0 zge0Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.f251049d = z;
        this.f251050e = layoutInflater;
        this.f251046a = zge0Var;
        this.f251051f = i;
        m88023a();
    }

    /* JADX INFO: renamed from: a */
    public final void m88023a() {
        zge0 zge0Var = this.f251046a;
        lhe0 lhe0Var = zge0Var.f282621v;
        if (lhe0Var != null) {
            zge0Var.m96067j();
            ArrayList arrayList = zge0Var.f282609j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((lhe0) arrayList.get(i)) == lhe0Var) {
                    this.f251047b = i;
                    return;
                }
            }
        }
        this.f251047b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lhe0 getItem(int i) {
        ArrayList arrayListM96068m;
        boolean z = this.f251049d;
        zge0 zge0Var = this.f251046a;
        if (z) {
            zge0Var.m96067j();
            arrayListM96068m = zge0Var.f282609j;
        } else {
            arrayListM96068m = zge0Var.m96068m();
        }
        int i2 = this.f251047b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (lhe0) arrayListM96068m.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM96068m;
        boolean z = this.f251049d;
        zge0 zge0Var = this.f251046a;
        if (z) {
            zge0Var.m96067j();
            arrayListM96068m = zge0Var.f282609j;
        } else {
            arrayListM96068m = zge0Var.m96068m();
        }
        return this.f251047b < 0 ? arrayListM96068m.size() : arrayListM96068m.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f251050e.inflate(this.f251051f, viewGroup, false);
        }
        int i2 = getItem(i).f133529b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f133529b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f251046a.mo45462n() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        kie0 kie0Var = (kie0) view;
        if (this.f251048c) {
            listMenuItemView.setForceShowIcon(true);
        }
        kie0Var.mo70f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m88023a();
        super.notifyDataSetChanged();
    }
}
