package p196j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: j$.nio.file.attribute.b0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1437b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserPrincipalLookupService f10521a;

    public C1437b0(UserPrincipalLookupService userPrincipalLookupService) {
        this.f10521a = userPrincipalLookupService;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.f10521a;
        if (obj instanceof C1437b0) {
            obj = ((C1437b0) obj).f10521a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10521a.hashCode();
    }
}
