package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w0x implements o2x {

    /* JADX INFO: renamed from: a */
    public final String f246881a;

    /* JADX INFO: renamed from: b */
    public final boolean f246882b;

    public w0x(String str, boolean z) {
        this.f246881a = str;
        this.f246882b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0x)) {
            return false;
        }
        w0x w0xVar = (w0x) obj;
        return wj50.m88271j(this.f246881a, w0xVar.f246881a) && this.f246882b == w0xVar.f246882b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246882b) + (this.f246881a.hashCode() * 31);
    }
}
