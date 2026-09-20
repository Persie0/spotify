package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class ij5 extends hk60<Object> {

    /* JADX INFO: renamed from: c */
    public static final hk60.InterfaceC1945e f102696c = new C1981a();

    /* JADX INFO: renamed from: a */
    private final Class<?> f102697a;

    /* JADX INFO: renamed from: b */
    private final hk60<Object> f102698b;

    /* JADX INFO: renamed from: p.ij5$a */
    public class C1981a implements hk60.InterfaceC1945e {
        @Override // p204p.hk60.InterfaceC1945e
        public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) {
            Type typeM62448a = mp91.m62448a(type);
            if (typeM62448a != null && set.isEmpty()) {
                return new ij5(mp91.m62454g(typeM62448a), p0i0Var.m68704d(typeM62448a)).nullSafe();
            }
            return null;
        }
    }

    public ij5(Class<?> cls, hk60<Object> hk60Var) {
        this.f102697a = cls;
        this.f102698b = hk60Var;
    }

    @Override // p204p.hk60
    public Object fromJson(xl60 xl60Var) {
        ArrayList arrayList = new ArrayList();
        xl60Var.mo51075a();
        while (xl60Var.mo51079i()) {
            arrayList.add(this.f102698b.fromJson(xl60Var));
        }
        xl60Var.mo51077e();
        Object objNewInstance = Array.newInstance(this.f102697a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // p204p.hk60
    public void toJson(rm60 rm60Var, Object obj) {
        rm60Var.mo56890a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f102698b.toJson(rm60Var, Array.get(obj, i));
        }
        rm60Var.mo56892g();
    }

    public String toString() {
        return this.f102698b + ".array()";
    }
}
