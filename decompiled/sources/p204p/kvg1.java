package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class kvg1 extends jue {

    /* JADX INFO: renamed from: a */
    public final byte[] f126865a;

    public kvg1(byte[] bArr) {
        this.f126865a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jue)) {
            return false;
        }
        jue jueVar = (jue) obj;
        return Arrays.equals(this.f126865a, jueVar instanceof kvg1 ? ((kvg1) jueVar).f126865a : ((kvg1) jueVar).f126865a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f126865a) ^ 1000003;
    }

    public final String toString() {
        return s571.m77251j("CoDoingState{state=", Arrays.toString(this.f126865a), "}");
    }
}
