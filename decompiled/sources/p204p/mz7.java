package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mz7 extends c4l {

    /* JADX INFO: renamed from: a */
    public final long f148631a;

    /* JADX INFO: renamed from: b */
    public final String f148632b;

    /* JADX INFO: renamed from: c */
    public final w3l f148633c;

    /* JADX INFO: renamed from: d */
    public final x3l f148634d;

    /* JADX INFO: renamed from: e */
    public final y3l f148635e;

    /* JADX INFO: renamed from: f */
    public final b4l f148636f;

    public mz7(long j, String str, w3l w3lVar, x3l x3lVar, y3l y3lVar, b4l b4lVar) {
        this.f148631a = j;
        this.f148632b = str;
        this.f148633c = w3lVar;
        this.f148634d = x3lVar;
        this.f148635e = y3lVar;
        this.f148636f = b4lVar;
    }

    public final boolean equals(Object obj) {
        y3l y3lVar;
        b4l b4lVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c4l) {
            mz7 mz7Var = (mz7) ((c4l) obj);
            b4l b4lVar2 = mz7Var.f148636f;
            y3l y3lVar2 = mz7Var.f148635e;
            if (this.f148631a == mz7Var.f148631a && this.f148632b.equals(mz7Var.f148632b) && this.f148633c.equals(mz7Var.f148633c) && this.f148634d.equals(mz7Var.f148634d) && ((y3lVar = this.f148635e) != null ? y3lVar.equals(y3lVar2) : y3lVar2 == null) && ((b4lVar = this.f148636f) != null ? b4lVar.equals(b4lVar2) : b4lVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f148631a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f148632b.hashCode()) * 1000003) ^ this.f148633c.hashCode()) * 1000003) ^ this.f148634d.hashCode()) * 1000003;
        y3l y3lVar = this.f148635e;
        int iHashCode2 = (iHashCode ^ (y3lVar == null ? 0 : y3lVar.hashCode())) * 1000003;
        b4l b4lVar = this.f148636f;
        return iHashCode2 ^ (b4lVar != null ? b4lVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f148631a + ", type=" + this.f148632b + ", app=" + this.f148633c + ", device=" + this.f148634d + ", log=" + this.f148635e + ", rollouts=" + this.f148636f + "}";
    }
}
