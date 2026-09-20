package p204p;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class smd1 {

    /* JADX INFO: renamed from: a */
    public static final zmd1 f210637a;

    static {
        zmd1 dzxVar;
        try {
            InvocationHandler invocationHandlerM49491g = i2h1.m49491g();
            dzxVar = new bnd1((WebViewProviderFactoryBoundaryInterface) (invocationHandlerM49491g == null ? null : WebViewProviderFactoryBoundaryInterface.class.cast(Proxy.newProxyInstance(gga.class.getClassLoader(), new Class[]{WebViewProviderFactoryBoundaryInterface.class}, invocationHandlerM49491g))));
        } catch (ClassNotFoundException unused) {
            dzxVar = new dzx(5);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f210637a = dzxVar;
    }
}
