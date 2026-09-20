package p204p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class jh8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final String f112355a;

    /* JADX INFO: renamed from: b */
    public final UUID f112356b;

    /* JADX INFO: renamed from: c */
    public final byte[] f112357c;

    public jh8(String str, UUID uuid, byte[] bArr) {
        this.f112355a = str;
        this.f112356b = uuid;
        this.f112357c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jh8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jh8 jh8Var = (jh8) obj;
        return wj50.m88271j(this.f112355a, jh8Var.f112355a) && wj50.m88271j(this.f112356b, jh8Var.f112356b) && Arrays.equals(this.f112357c, jh8Var.f112357c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f112357c) + ((this.f112356b.hashCode() + (this.f112355a.hashCode() * 31)) * 31);
    }
}
