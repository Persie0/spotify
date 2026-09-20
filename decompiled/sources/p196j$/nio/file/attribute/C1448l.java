package p196j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.l */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1448l implements FileAttribute {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1447k f10530a;

    public C1448l(InterfaceC1447k interfaceC1447k) {
        this.f10530a = interfaceC1447k;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC1419g.m23827j((Set) this.f10530a.value()));
    }
}
