package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class yk90 {
    public static final xk90 Companion = new xk90();

    /* JADX INFO: renamed from: a */
    public final String f273648a;

    /* JADX INFO: renamed from: b */
    public final String f273649b;

    public yk90() {
        this.f273648a = "Live event";
        this.f273649b = "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk90)) {
            return false;
        }
        yk90 yk90Var = (yk90) obj;
        return wj50.m88271j(this.f273648a, yk90Var.f273648a) && wj50.m88271j(this.f273649b, yk90Var.f273649b);
    }

    public final int hashCode() {
        return this.f273649b.hashCode() + (this.f273648a.hashCode() * 31);
    }

    public /* synthetic */ yk90(int i, String str, String str2) {
        this.f273648a = (i & 1) == 0 ? "Live event" : str;
        if ((i & 2) == 0) {
            this.f273649b = "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8";
        } else {
            this.f273649b = str2;
        }
    }
}
