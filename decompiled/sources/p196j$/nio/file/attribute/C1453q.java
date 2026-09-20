package p196j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* JADX INFO: renamed from: j$.nio.file.attribute.q */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1453q implements FileOwnerAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1454r f10534a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1454r interfaceC1454r = this.f10534a;
        if (obj instanceof C1453q) {
            obj = ((C1453q) obj).f10534a;
        }
        return interfaceC1454r.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return C1462z.m23915a(this.f10534a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f10534a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f10534a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.f10534a.mo23911b(C1461y.m23914a(userPrincipal));
    }
}
