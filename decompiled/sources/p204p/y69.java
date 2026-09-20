package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y69 {

    /* JADX INFO: renamed from: a */
    public final String f269704a;

    /* JADX INFO: renamed from: b */
    public final String f269705b;

    /* JADX INFO: renamed from: c */
    public final String f269706c;

    /* JADX INFO: renamed from: d */
    public final String f269707d;

    public y69(String str, String str2, String str3, String str4) {
        this.f269704a = str;
        this.f269705b = str2;
        this.f269706c = str3;
        this.f269707d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y69)) {
            return false;
        }
        y69 y69Var = (y69) obj;
        return this.f269704a.equals(y69Var.f269704a) && this.f269705b.equals(y69Var.f269705b) && this.f269706c.equals(y69Var.f269706c) && this.f269707d.equals(y69Var.f269707d);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(this.f269704a.hashCode() * 31, 31, this.f269705b), 31, this.f269706c), 31, this.f269707d);
    }
}
