package p204p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class de8 extends te8 {

    /* JADX INFO: renamed from: a */
    public final String f48002a;

    /* JADX INFO: renamed from: b */
    public final UUID f48003b;

    /* JADX INFO: renamed from: c */
    public final byte[] f48004c;

    public de8(String str, UUID uuid, byte[] bArr) {
        this.f48002a = str;
        this.f48003b = uuid;
        this.f48004c = bArr;
    }

    @Override // p204p.te8
    /* JADX INFO: renamed from: a */
    public final String mo32497a() {
        return this.f48002a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!de8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        de8 de8Var = (de8) obj;
        return wj50.m88271j(this.f48002a, de8Var.f48002a) && wj50.m88271j(this.f48003b, de8Var.f48003b) && Arrays.equals(this.f48004c, de8Var.f48004c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48004c) + ((this.f48003b.hashCode() + (this.f48002a.hashCode() * 31)) * 31);
    }
}
