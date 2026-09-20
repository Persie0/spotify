package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sa8 {

    /* JADX INFO: renamed from: a */
    public int f207154a;

    /* JADX INFO: renamed from: b */
    public int f207155b;

    /* JADX INFO: renamed from: c */
    public int f207156c;

    public sa8() {
        this.f207154a = 0;
        this.f207155b = 0;
        this.f207156c = 0;
    }

    public /* synthetic */ sa8(int i, int i2, int i3, boolean z) {
        this.f207154a = i;
        this.f207155b = i2;
        this.f207156c = i3;
    }

    public sa8(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 50 : i;
        i2 = (i3 & 2) != 0 ? 25 : i2;
        int i4 = (i3 & 4) != 0 ? 0 : 10;
        this.f207154a = i;
        this.f207155b = i2;
        this.f207156c = i4;
    }
}
