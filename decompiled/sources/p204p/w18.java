package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w18 {

    /* JADX INFO: renamed from: a */
    public String f247008a;

    /* JADX INFO: renamed from: b */
    public String f247009b;

    /* JADX INFO: renamed from: c */
    public boolean f247010c;

    /* JADX INFO: renamed from: d */
    public boolean f247011d;

    /* JADX INFO: renamed from: e */
    public Long f247012e;

    /* JADX INFO: renamed from: f */
    public Long f247013f;

    /* JADX INFO: renamed from: g */
    public Long f247014g;

    /* JADX INFO: renamed from: h */
    public byte f247015h;

    /* JADX INFO: renamed from: a */
    public final x18 m86977a() {
        if (this.f247015h == 3 && this.f247008a != null && this.f247009b != null && this.f247012e != null && this.f247013f != null && this.f247014g != null) {
            return new x18(this.f247008a, this.f247009b, this.f247010c, this.f247011d, this.f247012e, this.f247013f, this.f247014g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f247008a == null) {
            sb.append(" previewId");
        }
        if (this.f247009b == null) {
            sb.append(" previewKey");
        }
        if ((this.f247015h & 1) == 0) {
            sb.append(" isLoading");
        }
        if ((this.f247015h & 2) == 0) {
            sb.append(" isError");
        }
        if (this.f247012e == null) {
            sb.append(" position");
        }
        if (this.f247013f == null) {
            sb.append(" duration");
        }
        if (this.f247014g == null) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
