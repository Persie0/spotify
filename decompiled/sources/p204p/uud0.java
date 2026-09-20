package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uud0 implements wud0 {

    /* JADX INFO: renamed from: a */
    public final float f234162a;

    public uud0(float f) {
        this.f234162a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uud0) && Float.compare(this.f234162a, ((uud0) obj).f234162a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f234162a);
    }
}
