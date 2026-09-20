package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class otn0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f170041d = new dx00(11);

    /* JADX INFO: renamed from: a */
    public final Map f170042a;

    /* JADX INFO: renamed from: b */
    public final String f170043b;

    /* JADX INFO: renamed from: c */
    public final String f170044c;

    public otn0(String str, String str2, Map map) {
        this.f170042a = map;
        this.f170043b = str;
        this.f170044c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public final String m68066b() {
        return this.f170044c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otn0)) {
            return false;
        }
        otn0 otn0Var = (otn0) obj;
        return wj50.m88271j(this.f170042a, otn0Var.f170042a) && wj50.m88271j(this.f170043b, otn0Var.f170043b) && wj50.m88271j(this.f170044c, otn0Var.f170044c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f170041d;
    }

    public final int hashCode() {
        int iHashCode = this.f170042a.hashCode() * 31;
        String str = this.f170043b;
        return this.f170044c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ otn0() {
        this(null, s571.m77251j("spotify:internal:personal-podcast:onboarding", "", ""), nau.f152117a);
    }
}
