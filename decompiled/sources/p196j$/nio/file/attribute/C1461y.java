package p196j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: j$.nio.file.attribute.y */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1461y implements InterfaceC1435a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserPrincipal f10541a;

    public /* synthetic */ C1461y(UserPrincipal userPrincipal) {
        this.f10541a = userPrincipal;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC1435a0 m23914a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof C1462z) {
            return ((C1462z) userPrincipal).f10542a;
        }
        return userPrincipal instanceof GroupPrincipal ? new C1456t((GroupPrincipal) userPrincipal) : new C1461y(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.f10541a;
        if (obj instanceof C1461y) {
            obj = ((C1461y) obj).f10541a;
        }
        return userPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f10541a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f10541a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f10541a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f10541a.toString();
    }
}
