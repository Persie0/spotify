package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class usb1 extends vsb1 {

    /* JADX INFO: renamed from: a */
    public final String f233581a;

    /* JADX INFO: renamed from: b */
    public final long f233582b;

    /* JADX INFO: renamed from: c */
    public final long f233583c;

    public usb1(long j, String str, long j2) {
        this.f233581a = str;
        this.f233582b = j;
        this.f233583c = j2;
    }

    @Override // p204p.vsb1
    /* JADX INFO: renamed from: a */
    public final long mo81408a() {
        return this.f233583c;
    }

    @Override // p204p.vsb1
    /* JADX INFO: renamed from: b */
    public final long mo81409b() {
        return this.f233582b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usb1)) {
            return false;
        }
        usb1 usb1Var = (usb1) obj;
        return wj50.m88271j(this.f233581a, usb1Var.f233581a) && this.f233582b == usb1Var.f233582b && this.f233583c == usb1Var.f233583c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f233583c) + dq60.m36605e(this.f233581a.hashCode() * 31, this.f233582b, 31);
    }

    public /* synthetic */ usb1(String str) {
        this(0L, str, 0L);
    }
}
