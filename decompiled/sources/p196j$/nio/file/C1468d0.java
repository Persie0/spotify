package p196j$.nio.file;

import java.nio.file.Path;
import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: j$.nio.file.d0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1468d0 implements PathMatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1470e0 f10548a;

    public /* synthetic */ C1468d0(InterfaceC1470e0 interfaceC1470e0) {
        this.f10548a = interfaceC1470e0;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1470e0 interfaceC1470e0 = this.f10548a;
        if (obj instanceof C1468d0) {
            obj = ((C1468d0) obj).f10548a;
        }
        return interfaceC1470e0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10548a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(Path path) {
        return this.f10548a.mo23844n(C1500w.m23931r(path));
    }
}
