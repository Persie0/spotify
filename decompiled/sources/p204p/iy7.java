package p204p;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iy7 {

    /* JADX INFO: renamed from: a */
    public final String f106884a;

    /* JADX INFO: renamed from: b */
    public final Class f106885b;

    /* JADX INFO: renamed from: c */
    public final vxz0 f106886c;

    /* JADX INFO: renamed from: d */
    public final jla1 f106887d;

    /* JADX INFO: renamed from: e */
    public final Size f106888e;

    /* JADX INFO: renamed from: f */
    public final j28 f106889f;

    /* JADX INFO: renamed from: g */
    public final List f106890g;

    public iy7(String str, Class cls, vxz0 vxz0Var, jla1 jla1Var, Size size, j28 j28Var, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f106884a = str;
        this.f106885b = cls;
        if (vxz0Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f106886c = vxz0Var;
        if (jla1Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f106887d = jla1Var;
        this.f106888e = size;
        this.f106889f = j28Var;
        this.f106890g = arrayList;
    }

    public final boolean equals(Object obj) {
        Size size;
        j28 j28Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iy7) {
            iy7 iy7Var = (iy7) obj;
            List list2 = iy7Var.f106890g;
            j28 j28Var2 = iy7Var.f106889f;
            Size size2 = iy7Var.f106888e;
            if (this.f106884a.equals(iy7Var.f106884a) && this.f106885b.equals(iy7Var.f106885b) && this.f106886c.equals(iy7Var.f106886c) && this.f106887d.equals(iy7Var.f106887d) && ((size = this.f106888e) != null ? size.equals(size2) : size2 == null) && ((j28Var = this.f106889f) != null ? j28Var.equals(j28Var2) : j28Var2 == null) && ((list = this.f106890g) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f106884a.hashCode() ^ 1000003) * 1000003) ^ this.f106885b.hashCode()) * 1000003) ^ this.f106886c.hashCode()) * 1000003) ^ this.f106887d.hashCode()) * 1000003;
        Size size = this.f106888e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        j28 j28Var = this.f106889f;
        int iHashCode3 = (iHashCode2 ^ (j28Var == null ? 0 : j28Var.hashCode())) * 1000003;
        List list = this.f106890g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f106884a + ", useCaseType=" + this.f106885b + ", sessionConfig=" + this.f106886c + ", useCaseConfig=" + this.f106887d + ", surfaceResolution=" + this.f106888e + ", streamSpec=" + this.f106889f + ", captureTypes=" + this.f106890g + "}";
    }
}
