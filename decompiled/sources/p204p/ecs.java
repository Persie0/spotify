package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ecs {

    /* JADX INFO: renamed from: a */
    public final float f58379a;

    /* JADX INFO: renamed from: b */
    public final float f58380b;

    public ecs(float f, float f2) {
        this.f58379a = f;
        this.f58380b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecs)) {
            return false;
        }
        ecs ecsVar = (ecs) obj;
        return Float.compare(this.f58379a, ecsVar.f58379a) == 0 && Float.compare(this.f58380b, ecsVar.f58380b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58380b) + (Float.hashCode(this.f58379a) * 31);
    }
}
