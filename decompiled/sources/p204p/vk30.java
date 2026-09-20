package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class vk30 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final skp f242126a;

    /* JADX INFO: renamed from: b */
    public String f242127b;

    /* JADX INFO: renamed from: c */
    public fk30 f242128c;

    /* JADX INFO: renamed from: d */
    public View f242129d;

    /* JADX INFO: renamed from: e */
    public boolean f242130e;

    public vk30(skp skpVar) {
        skpVar.getClass();
        this.f242126a = skpVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m85795a() {
        if (this.f242130e) {
            throw new AssertionError("Listener is already in use");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m85796b() {
        if (this.f242127b == null) {
            throw new AssertionError("Event name not set");
        }
        if (this.f242128c == null) {
            throw new AssertionError("Model not set");
        }
        if (this.f242129d == null) {
            throw new AssertionError("View not set");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m85797c(String str) {
        m85795a();
        this.f242127b = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m85798d() {
        m85795a();
        m85796b();
        this.f242130e = true;
        this.f242129d.setFocusable(true);
        this.f242129d.setClickable(true);
        this.f242129d.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: e */
    public final void m85799e() {
        m85795a();
        m85796b();
        this.f242130e = true;
        this.f242129d.setLongClickable(true);
        this.f242129d.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m85800f(View view) {
        m85795a();
        view.getClass();
        this.f242129d = view;
    }

    /* JADX INFO: renamed from: g */
    public final void m85801g(fk30 fk30Var) {
        m85795a();
        fk30Var.getClass();
        this.f242128c = fk30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f242126a.m78379b(zj30.m96225a(this.f242127b, this.f242128c));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f242126a.m78379b(zj30.m96225a(this.f242127b, this.f242128c));
        return true;
    }
}
