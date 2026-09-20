package p204p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class md8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f142343a;

    /* JADX INFO: renamed from: b */
    public final UUID f142344b;

    /* JADX INFO: renamed from: c */
    public final byte[] f142345c;

    public md8(String str, UUID uuid, byte[] bArr) {
        this.f142343a = str;
        this.f142344b = uuid;
        this.f142345c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!md8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        md8 md8Var = (md8) obj;
        return wj50.m88271j(this.f142343a, md8Var.f142343a) && wj50.m88271j(this.f142344b, md8Var.f142344b) && Arrays.equals(this.f142345c, md8Var.f142345c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f142345c) + ((this.f142344b.hashCode() + (this.f142343a.hashCode() * 31)) * 31);
    }
}
