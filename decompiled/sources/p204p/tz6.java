package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tz6 {

    /* JADX INFO: renamed from: a */
    public final float f225163a;

    /* JADX INFO: renamed from: b */
    public final float f225164b;

    public tz6(float f, float f2) {
        this.f225163a = f;
        this.f225164b = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float m82052a() {
        return this.f225164b;
    }

    /* JADX INFO: renamed from: b */
    public final float m82053b() {
        return this.f225163a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz6)) {
            return false;
        }
        tz6 tz6Var = (tz6) obj;
        return Float.compare(this.f225163a, tz6Var.f225163a) == 0 && Float.compare(this.f225164b, tz6Var.f225164b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f225164b) + (Float.hashCode(this.f225163a) * 31);
    }
}
