package p204p;

import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class b68 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23876a;

    /* JADX INFO: renamed from: b */
    public static final b68 f23867b = new b68(0);

    /* JADX INFO: renamed from: c */
    public static final b68 f23868c = new b68(1);

    /* JADX INFO: renamed from: d */
    public static final b68 f23869d = new b68(2);

    /* JADX INFO: renamed from: e */
    public static final b68 f23870e = new b68(3);

    /* JADX INFO: renamed from: f */
    public static final b68 f23871f = new b68(4);

    /* JADX INFO: renamed from: g */
    public static final b68 f23872g = new b68(5);

    /* JADX INFO: renamed from: h */
    public static final b68 f23873h = new b68(6);

    /* JADX INFO: renamed from: i */
    public static final b68 f23874i = new b68(7);

    /* JADX INFO: renamed from: t */
    public static final b68 f23875t = new b68(8);

    /* JADX INFO: renamed from: X */
    public static final b68 f23866X = new b68(9);

    public /* synthetic */ b68(int i) {
        this.f23876a = i;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f23876a;
        Class cls = Void.TYPE;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return new n6f(rfg1.m75432b(1308617531));
            case 1:
                vqa vqaVar = vqa.f243905a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                wj50.m88279p(serviceLoaderLoad);
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) g6f.m43743r0(serviceLoaderLoad);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            case 2:
                return new n6f(n6f.f150862b);
            case 3:
                e1p e1pVar = new e1p(new bna0("DefaultBuiltIns"));
                e1pVar.m50150c(false);
                return e1pVar;
            case 4:
                qr60[] qr60VarArr = lwq.f137619t;
                return cls;
            case 5:
                Set set = iyq.f107042b;
                return lau.f131415a;
            case 6:
                jfw jfwVar = jfw.f111979a;
                return (e1p) e1p.f55232f.getValue();
            case 7:
                qr60[] qr60VarArr2 = jd60.f111268g;
                return Collections.singletonMap(xc60.f260104a, new ul51("Deprecated in Java"));
            case 8:
                x6f0 x6f0Var = x6f0.f258665a;
                List listM43728j1 = g6f.m43728j1(ServiceLoader.load(y6f0.class, y6f0.class.getClassLoader()));
                if (listM43728j1.isEmpty()) {
                    throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                }
                return listM43728j1;
            case 9:
                sr60 sr60Var = om41.f166968a;
                return cls;
            case 10:
                throw null;
            case 11:
                return Boolean.FALSE;
            case 12:
            default:
                return w2a1Var;
        }
    }

    public b68(j450 j450Var) {
        this.f23876a = 10;
    }
}
