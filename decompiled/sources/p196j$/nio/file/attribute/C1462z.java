package p196j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: j$.nio.file.attribute.z */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1462z implements UserPrincipal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1435a0 f10542a;

    public /* synthetic */ C1462z(InterfaceC1435a0 interfaceC1435a0) {
        this.f10542a = interfaceC1435a0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserPrincipal m23915a(InterfaceC1435a0 interfaceC1435a0) {
        if (interfaceC1435a0 == null) {
            return null;
        }
        if (interfaceC1435a0 instanceof C1461y) {
            return ((C1461y) interfaceC1435a0).f10541a;
        }
        return interfaceC1435a0 instanceof C1456t ? ((C1456t) interfaceC1435a0).f10536a : new C1462z(interfaceC1435a0);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1435a0 interfaceC1435a0 = this.f10542a;
        if (obj instanceof C1462z) {
            obj = ((C1462z) obj).f10542a;
        }
        return interfaceC1435a0.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f10542a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f10542a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f10542a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f10542a.toString();
    }
}
