package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class anc0 {

    /* JADX INFO: renamed from: a */
    public final String f17363a;

    /* JADX INFO: renamed from: b */
    public final float f17364b;

    /* JADX INFO: renamed from: c */
    public final float f17365c;

    public anc0(String str, float f, float f2) {
        this.f17363a = str;
        this.f17365c = f2;
        this.f17364b = f;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26487a(String str) {
        String str2 = this.f17363a;
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        return str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str);
    }
}
