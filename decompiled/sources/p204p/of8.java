package p204p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class of8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f164665a;

    /* JADX INFO: renamed from: b */
    public final UUID f164666b;

    /* JADX INFO: renamed from: c */
    public final byte[] f164667c;

    public of8(String str, UUID uuid, byte[] bArr) {
        this.f164665a = str;
        this.f164666b = uuid;
        this.f164667c = bArr;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f164665a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!of8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        of8 of8Var = (of8) obj;
        if (wj50.m88271j(this.f164665a, of8Var.f164665a) && wj50.m88271j(this.f164666b, of8Var.f164666b)) {
            return Arrays.equals(this.f164667c, of8Var.f164667c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f164667c) + ((this.f164666b.hashCode() + (this.f164665a.hashCode() * 31)) * 31);
    }
}
