package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class whc0 extends AbstractC2327r6 {

    /* JADX INFO: renamed from: a */
    public final rr60 f251303a;

    /* JADX INFO: renamed from: b */
    public final rr60 f251304b;

    public whc0(rr60 rr60Var, rr60 rr60Var2) {
        this.f251303a = rr60Var;
        this.f251304b = rr60Var2;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        Map map = (Map) obj;
        Object objMo39210A = frhVar.mo39210A(getDescriptor(), i, this.f251303a, null);
        int iMo29816p = frhVar.mo29816p(getDescriptor());
        if (iMo29816p != i + 1) {
            throw new IllegalArgumentException(s571.m77247f(i, "Value must follow key in a map, index for key: ", iMo29816p, ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objMo39210A);
        rr60 rr60Var = this.f251304b;
        map.put(objMo39210A, (!zContainsKey || (rr60Var.getDescriptor().getKind() instanceof aer0)) ? frhVar.mo39210A(getDescriptor(), iMo29816p, rr60Var, null) : frhVar.mo39210A(getDescriptor(), iMo29816p, rr60Var, kkc0.m56692e0(objMo39210A, map)));
    }

    /* JADX INFO: renamed from: i */
    public final rr60 m88124i() {
        return this.f251303a;
    }

    /* JADX INFO: renamed from: j */
    public final rr60 m88125j() {
        return this.f251304b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        int iMo24520d = mo24520d(obj);
        ktz0 descriptor = getDescriptor();
        hrh hrhVarMo35822g0 = deuVar.mo35822g0(descriptor, iMo24520d);
        Iterator itMo60861c = mo60861c(obj);
        int i = 0;
        while (itMo60861c.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo60861c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            hrhVarMo35822g0.mo44941k(getDescriptor(), i, this.f251303a, key);
            i += 2;
            hrhVarMo35822g0.mo44941k(getDescriptor(), i2, this.f251304b, value);
        }
        hrhVarMo35822g0.mo44937a(descriptor);
    }
}
