package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i900 {

    /* JADX INFO: renamed from: a */
    public final List f99882a;

    /* JADX INFO: renamed from: b */
    public long f99883b = 0;

    /* JADX INFO: renamed from: c */
    public long f99884c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f99885d = false;

    public i900(List list) {
        this.f99882a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i900 i900Var = (i900) obj;
        return this.f99883b == i900Var.f99883b && this.f99884c == i900Var.f99884c && this.f99885d == i900Var.f99885d && wj50.m88271j(this.f99882a, i900Var.f99882a);
    }

    public int hashCode() {
        return this.f99882a.hashCode() + s571.m77245d(dq60.m36605e(Long.hashCode(this.f99883b) * 31, this.f99884c, 31), 31, this.f99885d);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f99883b + ", frameDurationUiNanos=" + this.f99884c + ", isJank=" + this.f99885d + ", states=" + this.f99882a + ')';
    }
}
