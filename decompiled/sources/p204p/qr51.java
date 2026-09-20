package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class qr51 {
    public static final pr51 Companion = new pr51();

    /* JADX INFO: renamed from: a */
    public final String f191740a;

    /* JADX INFO: renamed from: b */
    public final String f191741b;

    /* JADX INFO: renamed from: c */
    public final String f191742c;

    /* JADX INFO: renamed from: d */
    public final String f191743d;

    public qr51() {
        this.f191740a = "";
        this.f191741b = "";
        this.f191742c = "";
        this.f191743d = "";
    }

    public /* synthetic */ qr51(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f191740a = "";
        } else {
            this.f191740a = str;
        }
        if ((i & 2) == 0) {
            this.f191741b = "";
        } else {
            this.f191741b = str2;
        }
        if ((i & 4) == 0) {
            this.f191742c = "";
        } else {
            this.f191742c = str3;
        }
        if ((i & 8) == 0) {
            this.f191743d = "";
        } else {
            this.f191743d = str4;
        }
    }
}
