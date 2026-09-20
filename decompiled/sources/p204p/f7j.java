package p204p;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f7j implements d7j, e9w0 {

    /* JADX INFO: renamed from: a */
    public final o6j f66691a;

    /* JADX INFO: renamed from: b */
    public Handler f66692b;

    /* JADX INFO: renamed from: c */
    public final mb31 f66693c = new mb31(new e7j(this, 0));

    /* JADX INFO: renamed from: d */
    public boolean f66694d = true;

    /* JADX INFO: renamed from: e */
    public final e7j f66695e = new e7j(this, 1);

    /* JADX INFO: renamed from: f */
    public final ArrayList f66696f = new ArrayList();

    public f7j(o6j o6jVar) {
        this.f66691a = o6jVar;
    }

    @Override // p204p.d7j
    /* JADX INFO: renamed from: a */
    public final boolean mo35203a(List list) {
        if (this.f66694d) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.f66696f;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            Object objMo30025g = ((h6d0) list.get(i)).mo30025g();
            if (!wj50.m88271j(objMo30025g instanceof m6j ? (m6j) objMo30025g : null, arrayList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: b */
    public final void mo32122b() {
        mb31 mb31Var = this.f66693c;
        mb31Var.f141787h = lb5.m58614m(mb31Var.f141783d);
    }

    @Override // p204p.d7j
    /* JADX INFO: renamed from: c */
    public final void mo35204c(xu41 xu41Var, List list) {
        this.f66696f.clear();
        this.f66693c.m61344d(w2a1.f247311a, this.f66695e, new z9b(list, this, xu41Var, 23));
        this.f66694d = false;
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: g */
    public final void mo32127g() {
        mb31 mb31Var = this.f66693c;
        na31 na31Var = mb31Var.f141787h;
        if (na31Var != null) {
            na31Var.m63947a();
        }
        mb31Var.m61341a();
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: d */
    public final void mo32124d() {
    }
}
