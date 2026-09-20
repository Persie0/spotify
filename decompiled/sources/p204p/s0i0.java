package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class s0i0 extends spk {

    /* JADX INFO: renamed from: a */
    public final q0i0 f204420a;

    public s0i0(p0i0 p0i0Var) {
        this.f204420a = new q0i0(p0i0Var);
    }

    @Override // p204p.spk
    /* JADX INFO: renamed from: a */
    public final tpk mo28551a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ccx0 ccx0Var) {
        if (vwf1.m86579m(type)) {
            return this.f204420a.mo28551a(type, annotationArr, annotationArr2, ccx0Var);
        }
        return null;
    }

    @Override // p204p.spk
    /* JADX INFO: renamed from: b */
    public final tpk mo28552b(Type type, Annotation[] annotationArr, ccx0 ccx0Var) {
        if (vwf1.m86579m(type)) {
            return this.f204420a.mo28552b(type, annotationArr, ccx0Var);
        }
        return null;
    }
}
