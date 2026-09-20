package p196j$.nio.file;

import java.security.PrivilegedAction;
import p196j$.adapter.AbstractC1412b;
import p196j$.nio.file.spi.AbstractC1496c;

/* JADX INFO: renamed from: j$.nio.file.i */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1477i implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        AbstractC1496c abstractC1496c = AbstractC1412b.f10460a;
        String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (String str : property.split(",")) {
                try {
                    abstractC1496c = (AbstractC1496c) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(AbstractC1496c.class).newInstance(abstractC1496c);
                    if (!abstractC1496c.mo23870l().equals("file")) {
                        throw new Error("Default provider must use scheme 'file'");
                    }
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
        }
        return abstractC1496c;
    }
}
