package p196j$.nio.file.attribute;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.x */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1460x implements InterfaceC1451o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserDefinedFileAttributeView f10540a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.f10540a;
        if (obj instanceof C1460x) {
            obj = ((C1460x) obj).f10540a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10540a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1451o
    public final /* synthetic */ String name() {
        return this.f10540a.name();
    }
}
