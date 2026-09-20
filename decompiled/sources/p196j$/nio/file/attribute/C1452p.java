package p196j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.p */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1452p implements InterfaceC1454r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileOwnerAttributeView f10533a;

    @Override // p196j$.nio.file.attribute.InterfaceC1454r
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo23911b(InterfaceC1435a0 interfaceC1435a0) throws IOException {
        this.f10533a.setOwner(C1462z.m23915a(interfaceC1435a0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.f10533a;
        if (obj instanceof C1452p) {
            obj = ((C1452p) obj).f10533a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1454r
    public final /* synthetic */ InterfaceC1435a0 getOwner() {
        return C1461y.m23914a(this.f10533a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f10533a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1451o
    public final /* synthetic */ String name() {
        return this.f10533a.name();
    }
}
