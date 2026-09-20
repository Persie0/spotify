package p204p;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xbb extends ccb {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f259876e = 0;

    /* JADX INFO: renamed from: f */
    public final boolean f259877f;

    public /* synthetic */ xbb(Method method, boolean z, int i) {
        this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
    }

    @Override // p204p.ccb
    /* JADX INFO: renamed from: a */
    public void mo32239a(Object[] objArr) {
        switch (this.f259876e) {
            case 0:
                super.mo32239a(objArr);
                if (this.f259877f && bk5.m29593P0(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.mo32239a(objArr);
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    public Object m90313c(Object[] objArr, Object obj) {
        return this.f259877f ? w2a1.f247311a : ((Method) this.f36366a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: j */
    public Object mo25448j(Object[] objArr) throws IllegalAccessException {
        mo32239a(objArr);
        ((Field) this.f36366a).set(this.f36368c != null ? bk5.m29583F0(objArr) : null, bk5.m29593P0(objArr));
        return w2a1.f247311a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xbb(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f259877f = wj50.m88271j(genericReturnType, Void.TYPE);
    }

    public xbb(Field field, boolean z, boolean z2) {
        super(field, Void.TYPE, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.f259877f = z;
    }
}
