package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qmj0 {

    /* JADX INFO: renamed from: a */
    public qmj0 f190232a = null;

    /* JADX INFO: renamed from: b */
    public qmj0 f190233b = null;

    /* JADX INFO: renamed from: c */
    public qmj0 f190234c = null;

    /* JADX INFO: renamed from: d */
    public qmj0 f190235d = null;

    /* JADX INFO: renamed from: e */
    public qmj0 f190236e = null;

    /* JADX INFO: renamed from: f */
    public ArrayList f190237f = null;

    /* JADX INFO: renamed from: a */
    public final void m73294a(bv31 bv31Var) {
        if (this.f190237f == null) {
            this.f190237f = new ArrayList();
        }
        this.f190237f.add(bv31Var);
    }

    /* JADX INFO: renamed from: b */
    public void m73295b(qmj0 qmj0Var) {
        qmj0Var.m73298g();
        qmj0Var.mo45413d(this);
        qmj0 qmj0Var2 = this.f190234c;
        if (qmj0Var2 == null) {
            this.f190233b = qmj0Var;
            this.f190234c = qmj0Var;
        } else {
            qmj0Var2.f190236e = qmj0Var;
            qmj0Var.f190235d = qmj0Var2;
            this.f190234c = qmj0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public final List m73296c() {
        ArrayList arrayList = this.f190237f;
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: d */
    public void mo45413d(qmj0 qmj0Var) {
        this.f190232a = qmj0Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m73297e(List list) {
        if (list.isEmpty()) {
            this.f190237f = null;
        } else {
            this.f190237f = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: f */
    public String mo37520f() {
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final void m73298g() {
        qmj0 qmj0Var = this.f190235d;
        if (qmj0Var != null) {
            qmj0Var.f190236e = this.f190236e;
        } else {
            qmj0 qmj0Var2 = this.f190232a;
            if (qmj0Var2 != null) {
                qmj0Var2.f190233b = this.f190236e;
            }
        }
        qmj0 qmj0Var3 = this.f190236e;
        if (qmj0Var3 != null) {
            qmj0Var3.f190235d = qmj0Var;
        } else {
            qmj0 qmj0Var4 = this.f190232a;
            if (qmj0Var4 != null) {
                qmj0Var4.f190234c = qmj0Var;
            }
        }
        this.f190232a = null;
        this.f190236e = null;
        this.f190235d = null;
    }

    public final String toString() {
        return s571.m77252k(getClass().getSimpleName(), "{", mo37520f(), "}");
    }
}
