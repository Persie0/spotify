package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gl80 extends j09 {

    /* JADX INFO: renamed from: g */
    public int f81019g;

    /* JADX INFO: renamed from: h */
    public int f81020h;

    /* JADX INFO: renamed from: i */
    public boolean f81021i;

    @Override // p204p.j09
    /* JADX INFO: renamed from: a */
    public final void mo44471a() {
        if (this.f81019g == 0) {
            if (this.f107386b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f107387c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
