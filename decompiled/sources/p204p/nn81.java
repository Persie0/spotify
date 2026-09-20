package p204p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes9.dex */
public final class nn81 {

    /* JADX INFO: renamed from: a */
    public int f156357a;

    /* JADX INFO: renamed from: b */
    public int f156358b;

    /* JADX INFO: renamed from: c */
    public int f156359c;

    /* JADX INFO: renamed from: d */
    public int f156360d;

    /* JADX INFO: renamed from: e */
    public int f156361e;

    /* JADX INFO: renamed from: a */
    public boolean m65193a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f156357a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f156360d;
            int i7 = this.f156358b;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & ContentType.LONG_FORM_ON_DEMAND) != 0) {
            int i8 = this.f156360d;
            int i9 = this.f156359c;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f156361e;
            int i11 = this.f156358b;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f156361e;
            int i13 = this.f156359c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
