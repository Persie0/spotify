package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class o1a {

    /* JADX INFO: renamed from: a */
    public final String f160678a;

    /* JADX INFO: renamed from: b */
    public final oc8 f160679b;

    /* JADX INFO: renamed from: c */
    public final byte[] f160680c;

    public o1a(String str, oc8 oc8Var, byte[] bArr) {
        this.f160678a = str;
        this.f160679b = oc8Var;
        this.f160680c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o1a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        o1a o1aVar = (o1a) obj;
        return wj50.m88271j(this.f160678a, o1aVar.f160678a) && wj50.m88271j(this.f160679b, o1aVar.f160679b) && Arrays.equals(this.f160680c, o1aVar.f160680c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f160680c) + ((this.f160679b.hashCode() + (this.f160678a.hashCode() * 31)) * 31);
    }
}
