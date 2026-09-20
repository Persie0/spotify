package p196j$.desugar.sun.nio.p197fs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1413a {

    /* JADX INFO: renamed from: a */
    public Set f10461a;

    /* JADX INFO: renamed from: b */
    public Map f10462b;

    /* JADX INFO: renamed from: c */
    public boolean f10463c;

    /* JADX INFO: renamed from: a */
    public final void m23815a(String str, Object obj) {
        ((HashMap) this.f10462b).put(str, obj);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m23816b(String str) {
        return this.f10463c || ((HashSet) this.f10461a).contains(str);
    }
}
