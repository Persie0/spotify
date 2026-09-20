package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class um91 extends riw0 {

    /* JADX INFO: renamed from: c */
    public final String f231782c;

    /* JADX INFO: renamed from: d */
    public final exa0 f231783d;

    public um91(String str, exa0 exa0Var) {
        this.f231782c = str;
        this.f231783d = exa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um91)) {
            return false;
        }
        um91 um91Var = (um91) obj;
        return wj50.m88271j(this.f231782c, um91Var.f231782c) && this.f231783d.equals(um91Var.f231783d);
    }

    public final int hashCode() {
        return this.f231783d.hashCode() + (this.f231782c.hashCode() * 31);
    }
}
