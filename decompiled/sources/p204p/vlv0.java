package p204p;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class vlv0 extends i4f {

    /* JADX INFO: renamed from: b */
    public final up60 f242609b;

    /* JADX INFO: renamed from: c */
    public final ej5 f242610c;

    public vlv0(up60 up60Var, rr60 rr60Var) {
        super(rr60Var);
        this.f242609b = up60Var;
        this.f242610c = new ej5(rr60Var.getDescriptor());
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: a */
    public final Object mo61921a() {
        return new ArrayList();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: b */
    public final int mo61922b(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: c */
    public final Iterator mo60861c(Object obj) {
        return new C2042k7((Object[]) obj, 1);
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        return new ArrayList(Arrays.asList((Object[]) obj));
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return this.f242610c;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: h */
    public final Object mo61923h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) ((ife) this.f242609b).mo28587A(), arrayList.size()));
    }

    @Override // p204p.i4f
    /* JADX INFO: renamed from: i */
    public final void mo49673i(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
