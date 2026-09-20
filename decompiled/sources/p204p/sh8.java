package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class sh8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final String f209140a;

    /* JADX INFO: renamed from: b */
    public final oc8 f209141b;

    /* JADX INFO: renamed from: c */
    public final byte[] f209142c;

    public sh8(String str, oc8 oc8Var, byte[] bArr) {
        this.f209140a = str;
        this.f209141b = oc8Var;
        this.f209142c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sh8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        sh8 sh8Var = (sh8) obj;
        return wj50.m88271j(this.f209140a, sh8Var.f209140a) && wj50.m88271j(this.f209141b, sh8Var.f209141b) && Arrays.equals(this.f209142c, sh8Var.f209142c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f209142c) + ((this.f209141b.hashCode() + (this.f209140a.hashCode() * 31)) * 31);
    }
}
