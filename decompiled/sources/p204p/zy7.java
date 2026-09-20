package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zy7 extends h3l {

    /* JADX INFO: renamed from: a */
    public final String f287507a;

    /* JADX INFO: renamed from: b */
    public final String f287508b;

    /* JADX INFO: renamed from: c */
    public final String f287509c;

    public zy7(String str, String str2, String str3) {
        this.f287507a = str;
        this.f287508b = str2;
        this.f287509c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h3l) {
            zy7 zy7Var = (zy7) ((h3l) obj);
            if (this.f287507a.equals(zy7Var.f287507a) && this.f287508b.equals(zy7Var.f287508b) && this.f287509c.equals(zy7Var.f287509c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f287507a.hashCode() ^ 1000003) * 1000003) ^ this.f287508b.hashCode()) * 1000003) ^ this.f287509c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f287507a);
        sb.append(", libraryName=");
        sb.append(this.f287508b);
        sb.append(", buildId=");
        return dq60.m36616p(this.f287509c, "}", sb);
    }
}
