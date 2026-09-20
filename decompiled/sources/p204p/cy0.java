package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes.dex */
public final class cy0 {

    /* JADX INFO: renamed from: a */
    public int f43126a;

    /* JADX INFO: renamed from: b */
    public int f43127b;

    /* JADX INFO: renamed from: c */
    public Object f43128c;

    /* JADX INFO: renamed from: d */
    public int f43129d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cy0)) {
                return false;
            }
            cy0 cy0Var = (cy0) obj;
            int i = this.f43126a;
            if (i != cy0Var.f43126a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f43129d - this.f43127b) != 1 || this.f43129d != cy0Var.f43127b || this.f43127b != cy0Var.f43129d) {
                if (this.f43129d != cy0Var.f43129d || this.f43127b != cy0Var.f43127b) {
                    return false;
                }
                Object obj2 = this.f43128c;
                if (obj2 != null) {
                    if (!obj2.equals(cy0Var.f43128c)) {
                        return false;
                    }
                } else if (cy0Var.f43128c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f43126a * 31) + this.f43127b) * 31) + this.f43129d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f43126a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = ContextTrack.TRACK_THUMB_STATE_UP;
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f43127b);
        sb.append("c:");
        sb.append(this.f43129d);
        sb.append(",p:");
        return edb.m38568q(sb, this.f43128c, "]");
    }
}
