package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q0i0 extends spk {

    /* JADX INFO: renamed from: a */
    public final p0i0 f184013a;

    public q0i0(p0i0 p0i0Var) {
        this.f184013a = p0i0Var;
    }

    /* JADX INFO: renamed from: c */
    public static Set m71848c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(wl60.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // p204p.spk
    /* JADX INFO: renamed from: a */
    public final tpk mo28551a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ccx0 ccx0Var) {
        return new t0i0(this.f184013a.m68705e(type, m71848c(annotationArr)));
    }

    @Override // p204p.spk
    /* JADX INFO: renamed from: b */
    public final tpk mo28552b(Type type, Annotation[] annotationArr, ccx0 ccx0Var) {
        return new u0i0(this.f184013a.m68705e(type, m71848c(annotationArr)));
    }
}
