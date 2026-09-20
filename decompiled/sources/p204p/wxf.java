package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wxf implements ovf {

    /* JADX INFO: renamed from: a */
    public final wg61 f256022a;

    /* JADX INFO: renamed from: b */
    public Object f256023b;

    /* JADX INFO: renamed from: c */
    public final jjf f256024c = jjf.f113006O0;

    public wxf(qwf qwfVar) {
        this.f256022a = new wg61(new che(qwfVar, 18));
    }

    /* JADX INFO: renamed from: a */
    public th00 mo89232a() {
        return this.f256024c;
    }

    /* JADX INFO: renamed from: b */
    public abstract gh00 mo89233b();

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        ((ovf) this.f256022a.getValue()).mo2821c(new nze(11, this, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        this.f256023b = obj;
        ((ovf) this.f256022a.getValue()).mo2820d(mo89233b().invoke(obj));
    }

    @Override // p204p.clc1
    public final View getView() {
        return ((ovf) this.f256022a.getValue()).getView();
    }
}
