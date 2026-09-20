package p204p;

import androidx.fragment.app.Fragment$InstantiationException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class s600 extends a600 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c700 f205972b;

    public s600(c700 c700Var) {
        this.f205972b = c700Var;
    }

    @Override // p204p.a600
    /* JADX INFO: renamed from: a */
    public final i500 mo24828a(ClassLoader classLoader, String str) {
        try {
            return (i500) a600.m24827c(this.f205972b.f34689x.f34324L0.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(e, s571.m77251j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(e2, s571.m77251j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(e3, s571.m77251j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"));
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(e4, s571.m77251j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"));
        }
    }
}
