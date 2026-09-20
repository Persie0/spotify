package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ou9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f170194d = new ak0(16);

    /* JADX INFO: renamed from: a */
    public final mec0 f170195a;

    /* JADX INFO: renamed from: b */
    public final String f170196b;

    /* JADX INFO: renamed from: c */
    public final String f170197c;

    public ou9(mec0 mec0Var, String str, String str2) {
        this.f170195a = mec0Var;
        this.f170196b = str;
        this.f170197c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou9)) {
            return false;
        }
        ou9 ou9Var = (ou9) obj;
        return this.f170195a.equals(ou9Var.f170195a) && wj50.m88271j(this.f170196b, ou9Var.f170196b) && wj50.m88271j(this.f170197c, ou9Var.f170197c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f170194d;
    }

    public final int hashCode() {
        int iHashCode = this.f170195a.hashCode() * 31;
        String str = this.f170196b;
        return this.f170197c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
