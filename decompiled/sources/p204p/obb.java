package p204p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class obb extends ccb implements dga {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f163595e;

    /* JADX INFO: renamed from: f */
    public final Object f163596f;

    /* JADX WARN: Illegal instructions before constructor call */
    public obb(Constructor constructor, Object obj, int i) {
        this.f163595e = i;
        switch (i) {
            case 1:
                super(constructor, constructor.getDeclaringClass(), null, constructor.getGenericParameterTypes());
                this.f163596f = obj;
                break;
            default:
                Class declaringClass = constructor.getDeclaringClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : bk5.m29640y0(1, genericParameterTypes.length - 1, genericParameterTypes)));
                this.f163596f = obj;
                break;
        }
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: j */
    public final Object mo25448j(Object[] objArr) {
        switch (this.f163595e) {
            case 0:
                mo32239a(objArr);
                Constructor constructor = (Constructor) this.f36366a;
                mbq mbqVar = new mbq(3);
                mbqVar.m61421b(this.f163596f);
                mbqVar.m61422c(objArr);
                mbqVar.m61421b(null);
                ArrayList arrayList = mbqVar.f141956a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                mo32239a(objArr);
                Constructor constructor2 = (Constructor) this.f36366a;
                mbq mbqVar2 = new mbq(2);
                mbqVar2.m61421b(this.f163596f);
                mbqVar2.m61422c(objArr);
                ArrayList arrayList2 = mbqVar2.f141956a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
