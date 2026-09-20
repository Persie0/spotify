package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class jg90 {
    public static final ig90 Companion = new ig90();

    /* JADX INFO: renamed from: a */
    public final String f112112a;

    /* JADX INFO: renamed from: b */
    public final String f112113b;

    /* JADX INFO: renamed from: c */
    public final String f112114c;

    public jg90() {
        this.f112112a = "";
        this.f112113b = "";
        this.f112114c = "";
    }

    public /* synthetic */ jg90(String str, String str2, int i, String str3) {
        if ((i & 1) == 0) {
            this.f112112a = "";
        } else {
            this.f112112a = str;
        }
        if ((i & 2) == 0) {
            this.f112113b = "";
        } else {
            this.f112113b = str2;
        }
        if ((i & 4) == 0) {
            this.f112114c = "";
        } else {
            this.f112114c = str3;
        }
    }
}
