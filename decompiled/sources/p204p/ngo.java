package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ngo {

    /* JADX INFO: renamed from: a */
    public long f153744a;

    /* JADX INFO: renamed from: b */
    public float f153745b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngo)) {
            return false;
        }
        ngo ngoVar = (ngo) obj;
        return this.f153744a == ngoVar.f153744a && Float.compare(this.f153745b, ngoVar.f153745b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f153745b) + (Long.hashCode(this.f153744a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f153744a);
        sb.append(", dataPoint=");
        return ms2.m62684i(sb, this.f153745b, ')');
    }
}
