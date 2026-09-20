package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class h07 {

    /* JADX INFO: renamed from: a */
    public boolean f86163a;

    /* JADX INFO: renamed from: b */
    public boolean f86164b;

    /* JADX INFO: renamed from: c */
    public boolean f86165c;

    /* JADX INFO: renamed from: d */
    public int f86166d = 0;

    /* JADX INFO: renamed from: a */
    public final i07 m46258a() {
        if (this.f86163a || !(this.f86164b || this.f86165c)) {
            return new i07(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
