package p196j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1434a implements InterfaceC1454r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AclFileAttributeView f10519a;

    @Override // p196j$.nio.file.attribute.InterfaceC1454r
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo23911b(InterfaceC1435a0 interfaceC1435a0) throws IOException {
        this.f10519a.setOwner(C1462z.m23915a(interfaceC1435a0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.f10519a;
        if (obj instanceof C1434a) {
            obj = ((C1434a) obj).f10519a;
        }
        return aclFileAttributeView.equals(obj);
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1454r
    public final /* synthetic */ InterfaceC1435a0 getOwner() {
        return C1461y.m23914a(this.f10519a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f10519a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1451o
    public final /* synthetic */ String name() {
        return this.f10519a.name();
    }
}
