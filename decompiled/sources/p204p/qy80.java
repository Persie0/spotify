package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qy80 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f193850a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ry80 f193851b;

    public qy80(ry80 ry80Var) {
        this.f193851b = ry80Var;
        m74162a();
    }

    /* JADX INFO: renamed from: a */
    public final void m74162a() {
        zge0 zge0Var = this.f193851b.f203853c;
        lhe0 lhe0Var = zge0Var.f282621v;
        if (lhe0Var != null) {
            zge0Var.m96067j();
            ArrayList arrayList = zge0Var.f282609j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((lhe0) arrayList.get(i)) == lhe0Var) {
                    this.f193850a = i;
                    return;
                }
            }
        }
        this.f193850a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lhe0 getItem(int i) {
        ry80 ry80Var = this.f193851b;
        zge0 zge0Var = ry80Var.f203853c;
        zge0Var.m96067j();
        ArrayList arrayList = zge0Var.f282609j;
        ry80Var.getClass();
        int i2 = this.f193850a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (lhe0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ry80 ry80Var = this.f193851b;
        zge0 zge0Var = ry80Var.f203853c;
        zge0Var.m96067j();
        int size = zge0Var.f282609j.size();
        ry80Var.getClass();
        return this.f193850a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f193851b.f203852b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((kie0) view).mo70f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m74162a();
        super.notifyDataSetChanged();
    }
}
