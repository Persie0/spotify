package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class nc30 implements pc30 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f152411a;

    public /* synthetic */ nc30(ByteBuffer byteBuffer) {
        this.f152411a = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nc30) {
            return wj50.m88271j(this.f152411a, ((nc30) obj).f152411a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f152411a.hashCode();
    }

    public final String toString() {
        return "Data(buffer=" + this.f152411a + ")";
    }
}
