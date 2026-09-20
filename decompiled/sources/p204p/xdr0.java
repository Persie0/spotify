package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xdr0 extends i4f {

    /* JADX INFO: renamed from: b */
    public final wdr0 f260527b;

    public xdr0(rr60 rr60Var) {
        super(rr60Var);
        this.f260527b = new wdr0(rr60Var.getDescriptor());
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: a */
    public final Object mo61921a() {
        return (vdr0) mo24522g(mo24523j());
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: b */
    public final int mo61922b(Object obj) {
        return ((vdr0) obj).mo33761d();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: c */
    public final Iterator mo60861c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p204p.AbstractC2327r6, p204p.rr60
    public final Object deserialize(fro froVar) {
        return m74832e(froVar, null);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return this.f260527b;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: h */
    public final Object mo61923h(Object obj) {
        return ((vdr0) obj).mo33759a();
    }

    @Override // p204p.i4f
    /* JADX INFO: renamed from: i */
    public final void mo49673i(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo24523j();

    /* JADX INFO: renamed from: k */
    public abstract void mo24524k(hrh hrhVar, Object obj, int i);

    @Override // p204p.i4f, p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        int iMo24520d = mo24520d(obj);
        wdr0 wdr0Var = this.f260527b;
        hrh hrhVarMo35822g0 = deuVar.mo35822g0(wdr0Var, iMo24520d);
        mo24524k(hrhVarMo35822g0, obj, iMo24520d);
        hrhVarMo35822g0.mo44937a(wdr0Var);
    }
}
