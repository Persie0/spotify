package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i4f extends AbstractC2327r6 {

    /* JADX INFO: renamed from: a */
    public final rr60 f98519a;

    public i4f(rr60 rr60Var) {
        this.f98519a = rr60Var;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public void mo24521f(frh frhVar, int i, Object obj) {
        mo49673i(i, obj, frhVar.mo39210A(getDescriptor(), i, this.f98519a, null));
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo49673i(int i, Object obj, Object obj2);

    @Override // p204p.rr60
    public void serialize(deu deuVar, Object obj) {
        int iMo24520d = mo24520d(obj);
        ktz0 descriptor = getDescriptor();
        hrh hrhVarMo35822g0 = deuVar.mo35822g0(descriptor, iMo24520d);
        Iterator itMo60861c = mo60861c(obj);
        for (int i = 0; i < iMo24520d; i++) {
            hrhVarMo35822g0.mo44941k(getDescriptor(), i, this.f98519a, itMo60861c.next());
        }
        hrhVarMo35822g0.mo44937a(descriptor);
    }
}
