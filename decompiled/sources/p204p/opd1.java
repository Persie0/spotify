package p204p;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public final class opd1 {

    /* JADX INFO: renamed from: c */
    public CharSequence f167877c;

    /* JADX INFO: renamed from: a */
    public long f167875a = 0;

    /* JADX INFO: renamed from: b */
    public long f167876b = 0;

    /* JADX INFO: renamed from: d */
    public int f167878d = 2;

    /* JADX INFO: renamed from: e */
    public float f167879e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f167880f = 1;

    /* JADX INFO: renamed from: g */
    public int f167881g = 0;

    /* JADX INFO: renamed from: h */
    public float f167882h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f167883i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f167884j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f167885k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX INFO: renamed from: a */
    public final a0m m67526a() {
        Layout.Alignment alignment;
        float f = this.f167882h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f167878d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f167883i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f167878d;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        a0m a0mVar = new a0m();
        int i4 = this.f167878d;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            ei6.m39077n(i4, "Unknown textAlignment: ");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        a0mVar.f11105c = alignment;
        float f3 = this.f167879e;
        int i5 = this.f167880f;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        a0mVar.f11107e = f2;
        a0mVar.f11108f = i5;
        a0mVar.f11109g = this.f167881g;
        a0mVar.f11110h = f;
        a0mVar.f11111i = i2;
        float f4 = this.f167884j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            throw new IllegalStateException(String.valueOf(i2));
        }
        a0mVar.f11114l = Math.min(f4, f);
        a0mVar.f11118p = this.f167885k;
        CharSequence charSequence = this.f167877c;
        if (charSequence != null) {
            a0mVar.m24370c(charSequence);
        }
        return a0mVar;
    }
}
