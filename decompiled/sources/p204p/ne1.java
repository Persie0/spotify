package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class ne1 {
    public static final me1 Companion = new me1();

    /* JADX INFO: renamed from: a */
    public final String f152891a;

    /* JADX INFO: renamed from: b */
    public final String f152892b;

    /* JADX INFO: renamed from: c */
    public final String f152893c;

    /* JADX INFO: renamed from: d */
    public final String f152894d;

    public ne1() {
        this.f152891a = "";
        this.f152892b = "";
        this.f152893c = "";
        this.f152894d = "";
    }

    public /* synthetic */ ne1(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f152891a = "";
        } else {
            this.f152891a = str;
        }
        if ((i & 2) == 0) {
            this.f152892b = "";
        } else {
            this.f152892b = str2;
        }
        if ((i & 4) == 0) {
            this.f152893c = "";
        } else {
            this.f152893c = str3;
        }
        if ((i & 8) == 0) {
            this.f152894d = "";
        } else {
            this.f152894d = str4;
        }
    }
}
