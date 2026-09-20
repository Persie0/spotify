package p204p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class pbb extends ccb {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f175761e;

    /* JADX WARN: Illegal instructions before constructor call */
    public pbb(Constructor constructor, int i) {
        this.f175761e = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                Class declaringClass2 = constructor.getDeclaringClass();
                Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
                super(constructor, declaringClass, (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3, constructor.getGenericParameterTypes());
                break;
            default:
                Class declaringClass4 = constructor.getDeclaringClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                super(constructor, declaringClass4, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : bk5.m29640y0(0, genericParameterTypes.length - 1, genericParameterTypes)));
                break;
        }
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: j */
    public final Object mo25448j(Object[] objArr) {
        switch (this.f175761e) {
            case 0:
                mo32239a(objArr);
                Constructor constructor = (Constructor) this.f36366a;
                mbq mbqVar = new mbq(2);
                mbqVar.m61422c(objArr);
                mbqVar.m61421b(null);
                ArrayList arrayList = mbqVar.f141956a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                mo32239a(objArr);
                return ((Constructor) this.f36366a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
