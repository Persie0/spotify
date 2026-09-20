package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ry80 implements hie0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f203851a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f203852b;

    /* JADX INFO: renamed from: c */
    public zge0 f203853c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f203854d;

    /* JADX INFO: renamed from: e */
    public gie0 f203855e;

    /* JADX INFO: renamed from: f */
    public qy80 f203856f;

    public ry80(Context context) {
        this.f203851a = context;
        this.f203852b = LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: a */
    public final qy80 m76695a() {
        if (this.f203856f == null) {
            this.f203856f = new qy80(this);
        }
        return this.f203856f;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: b */
    public final void mo28112b(zge0 zge0Var, boolean z) {
        gie0 gie0Var = this.f203855e;
        if (gie0Var != null) {
            gie0Var.mo29244b(zge0Var, z);
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: c */
    public final void mo28113c(Context context, zge0 zge0Var) {
        if (this.f203851a != null) {
            this.f203851a = context;
            if (this.f203852b == null) {
                this.f203852b = LayoutInflater.from(context);
            }
        }
        this.f203853c = zge0Var;
        qy80 qy80Var = this.f203856f;
        if (qy80Var != null) {
            qy80Var.notifyDataSetChanged();
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: d */
    public final void mo28114d(gie0 gie0Var) {
        this.f203855e = gie0Var;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: e */
    public final void mo28115e() {
        qy80 qy80Var = this.f203856f;
        if (qy80Var != null) {
            qy80Var.notifyDataSetChanged();
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: f */
    public final boolean mo28116f(lhe0 lhe0Var) {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: g */
    public final boolean mo28117g(lhe0 lhe0Var) {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: h */
    public final boolean mo28118h() {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: i */
    public final boolean mo28119i(gr51 gr51Var) {
        if (!gr51Var.hasVisibleItems()) {
            return false;
        }
        bhe0 bhe0Var = new bhe0();
        bhe0Var.f27165a = gr51Var;
        r73 r73Var = new r73(gr51Var.f282600a);
        ry80 ry80Var = new ry80(r73Var.getContext());
        bhe0Var.f27167c = ry80Var;
        ry80Var.f203855e = bhe0Var;
        gr51Var.m96062b(ry80Var);
        qy80 qy80VarM76695a = bhe0Var.f27167c.m76695a();
        n73 n73Var = r73Var.f196422a;
        n73Var.f151059p = qy80VarM76695a;
        n73Var.f151060q = bhe0Var;
        View view = gr51Var.f282614o;
        if (view != null) {
            n73Var.f151048e = view;
        } else {
            n73Var.f151046c = gr51Var.f282613n;
            r73Var.setTitle(gr51Var.f282612m);
        }
        n73Var.f151057n = bhe0Var;
        s73 s73VarCreate = r73Var.create();
        bhe0Var.f27166b = s73VarCreate;
        s73VarCreate.setOnDismissListener(bhe0Var);
        WindowManager.LayoutParams attributes = bhe0Var.f27166b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        bhe0Var.f27166b.show();
        gie0 gie0Var = this.f203855e;
        if (gie0Var == null) {
            return true;
        }
        gie0Var.mo29245f(gr51Var);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final lie0 m76696j(ViewGroup viewGroup) {
        if (this.f203854d == null) {
            this.f203854d = (ExpandedMenuView) this.f203852b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f203856f == null) {
                this.f203856f = new qy80(this);
            }
            this.f203854d.setAdapter((ListAdapter) this.f203856f);
            this.f203854d.setOnItemClickListener(this);
        }
        return this.f203854d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f203853c.m96071s(this.f203856f.getItem(i), this, 0);
    }
}
