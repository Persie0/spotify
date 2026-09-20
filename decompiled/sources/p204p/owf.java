package p204p;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class owf implements j4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f170707b;

    public /* synthetic */ owf(Object obj, int i) {
        this.f170706a = i;
        this.f170707b = obj;
    }

    @Override // p204p.j4t0
    public final Object get() {
        switch (this.f170706a) {
            case 0:
                String str = (String) this.f170707b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new InvalidRegistrarException(s571.m77251j("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new InvalidRegistrarException(s571.m77251j("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new InvalidRegistrarException(edb.m38564m("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new InvalidRegistrarException(edb.m38564m("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.f170707b;
            default:
                return new p240((faz) this.f170707b);
        }
    }
}
