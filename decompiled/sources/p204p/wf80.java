package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wf80 extends th1 {

    /* JADX INFO: renamed from: h */
    public final String f250760h;

    /* JADX INFO: renamed from: i */
    public final String f250761i;

    /* JADX INFO: renamed from: j */
    public final int f250762j;

    public wf80(String str, String str2, int i) {
        this.f250760h = str;
        this.f250761i = str2;
        this.f250762j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf80)) {
            return false;
        }
        wf80 wf80Var = (wf80) obj;
        return wj50.m88271j(this.f250760h, wf80Var.f250760h) && wj50.m88271j(this.f250761i, wf80Var.f250761i) && this.f250762j == wf80Var.f250762j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f250762j) + s571.m77243b(this.f250760h.hashCode() * 31, 961, this.f250761i);
    }
}
