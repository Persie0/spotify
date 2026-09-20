package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lry {

    /* JADX INFO: renamed from: a */
    public final boolean f136385a;

    /* JADX INFO: renamed from: b */
    public final boolean f136386b;

    /* JADX INFO: renamed from: c */
    public final boolean f136387c;

    /* JADX INFO: renamed from: d */
    public final boolean f136388d;

    public lry(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f136385a = z;
        this.f136386b = z2;
        this.f136387c = z3;
        this.f136388d = z4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m59820a(String str) {
        if (this.f136385a) {
            return true;
        }
        if (str.equals("canvas-video")) {
            return this.f136386b;
        }
        if (bm51.m29803n0(str, "watch-feed", false)) {
            return this.f136388d;
        }
        if (bm51.m29803n0(str, "audio-browse", false)) {
            return this.f136387c;
        }
        return false;
    }
}
