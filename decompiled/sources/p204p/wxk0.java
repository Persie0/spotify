package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wxk0 extends ayk0 {

    /* JADX INFO: renamed from: a */
    public final int f256057a;

    /* JADX INFO: renamed from: b */
    public final String f256058b;

    /* JADX INFO: renamed from: c */
    public final byk0 f256059c;

    /* JADX INFO: renamed from: d */
    public final int f256060d;

    public wxk0(int i, String str, byk0 byk0Var, int i2) {
        this.f256057a = i;
        this.f256058b = str;
        this.f256059c = byk0Var;
        this.f256060d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxk0)) {
            return false;
        }
        wxk0 wxk0Var = (wxk0) obj;
        return this.f256057a == wxk0Var.f256057a && wj50.m88271j(this.f256058b, wxk0Var.f256058b) && this.f256059c == wxk0Var.f256059c && this.f256060d == wxk0Var.f256060d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f256060d) + ((this.f256059c.hashCode() + s571.m77243b(Integer.hashCode(this.f256057a) * 31, 31, this.f256058b)) * 31);
    }
}
