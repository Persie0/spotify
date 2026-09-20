package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k45 extends sz30 {

    /* JADX INFO: renamed from: b */
    public final String f119097b;

    /* JADX INFO: renamed from: c */
    public final String f119098c;

    /* JADX INFO: renamed from: d */
    public final int f119099d;

    /* JADX INFO: renamed from: e */
    public final byte[] f119100e;

    public k45(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f119097b = str;
        this.f119098c = str2;
        this.f119099d = i;
        this.f119100e = bArr;
    }

    @Override // p204p.s5f0
    /* JADX INFO: renamed from: b */
    public final void mo35404b(nhd0 nhd0Var) {
        nhd0Var.m64470a(this.f119100e, this.f119099d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k45.class == obj.getClass()) {
            k45 k45Var = (k45) obj;
            if (this.f119099d == k45Var.f119099d && Objects.equals(this.f119097b, k45Var.f119097b) && Objects.equals(this.f119098c, k45Var.f119098c) && Arrays.equals(this.f119100e, k45Var.f119100e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f119099d) * 31;
        String str = this.f119097b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f119098c;
        return Arrays.hashCode(this.f119100e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p204p.sz30
    public final String toString() {
        return this.f215378a + ": mimeType=" + this.f119097b + ", description=" + this.f119098c;
    }
}
