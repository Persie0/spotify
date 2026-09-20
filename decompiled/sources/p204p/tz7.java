package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tz7 extends q3l {

    /* JADX INFO: renamed from: a */
    public final String f225166a;

    /* JADX INFO: renamed from: b */
    public final String f225167b;

    /* JADX INFO: renamed from: c */
    public final List f225168c;

    /* JADX INFO: renamed from: d */
    public final q3l f225169d;

    /* JADX INFO: renamed from: e */
    public final int f225170e;

    public tz7(String str, String str2, List list, q3l q3lVar, int i) {
        this.f225166a = str;
        this.f225167b = str2;
        this.f225168c = list;
        this.f225169d = q3lVar;
        this.f225170e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        q3l q3lVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q3l) {
            tz7 tz7Var = (tz7) ((q3l) obj);
            q3l q3lVar2 = tz7Var.f225169d;
            String str2 = tz7Var.f225167b;
            if (this.f225166a.equals(tz7Var.f225166a) && ((str = this.f225167b) != null ? str.equals(str2) : str2 == null) && this.f225168c.equals(tz7Var.f225168c) && ((q3lVar = this.f225169d) != null ? q3lVar.equals(q3lVar2) : q3lVar2 == null) && this.f225170e == tz7Var.f225170e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f225166a.hashCode() ^ 1000003) * 1000003;
        String str = this.f225167b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f225168c.hashCode()) * 1000003;
        q3l q3lVar = this.f225169d;
        return ((iHashCode2 ^ (q3lVar != null ? q3lVar.hashCode() : 0)) * 1000003) ^ this.f225170e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f225166a);
        sb.append(", reason=");
        sb.append(this.f225167b);
        sb.append(", frames=");
        sb.append(this.f225168c);
        sb.append(", causedBy=");
        sb.append(this.f225169d);
        sb.append(", overflowCount=");
        return klh.m56832d(this.f225170e, "}", sb);
    }
}
