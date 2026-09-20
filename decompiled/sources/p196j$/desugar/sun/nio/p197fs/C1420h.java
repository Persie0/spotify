package p196j$.desugar.sun.nio.p197fs;

import java.nio.file.DirectoryStream;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;
import p196j$.nio.file.InterfaceC1470e0;
import p196j$.nio.file.Path;
import p196j$.nio.file.attribute.InterfaceC1447k;
import p196j$.time.AbstractC1513c;
import p196j$.time.C1580i;
import p196j$.time.ZoneId;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.h */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1420h implements InterfaceC1470e0, DirectoryStream.Filter, InterfaceC1447k, InterfaceC1603l {

    /* JADX INFO: renamed from: a */
    public final Object f10482a;

    public /* synthetic */ C1420h(Object obj) {
        this.f10482a = obj;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public boolean accept(Object obj) {
        return ((DirectoryStream.Filter) this.f10482a).accept(AbstractC1419g.m23821d(obj));
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public Object mo23841b(C1580i c1580i) {
        return c1580i == AbstractC1608q.f10834a ? (ZoneId) this.f10482a : super.mo23841b(c1580i);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        return false;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public long mo23843i(InterfaceC1607p interfaceC1607p) {
        throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
    }

    @Override // p196j$.nio.file.InterfaceC1470e0
    /* JADX INFO: renamed from: n */
    public boolean mo23844n(Path path) {
        return ((Pattern) this.f10482a).matcher(path.toString()).matches();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1447k
    public String name() {
        return "posix:permissions";
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1447k
    public Object value() {
        return Collections.unmodifiableSet(AbstractC1419g.m23827j((Set) ((FileAttribute) this.f10482a).value()));
    }
}
