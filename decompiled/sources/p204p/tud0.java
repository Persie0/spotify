package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tud0 implements wud0 {

    /* JADX INFO: renamed from: a */
    public final float f223833a;

    public tud0(float f) {
        this.f223833a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tud0) && Float.compare(this.f223833a, ((tud0) obj).f223833a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f223833a);
    }
}
