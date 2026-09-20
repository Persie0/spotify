package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class tq0 {
    public static final sq0 Companion = new sq0();

    /* JADX INFO: renamed from: a */
    public final Integer f222629a;

    /* JADX INFO: renamed from: b */
    public final Integer f222630b;

    /* JADX INFO: renamed from: c */
    public final Integer f222631c;

    /* JADX INFO: renamed from: d */
    public final Integer f222632d;

    /* JADX INFO: renamed from: e */
    public final String f222633e;

    /* JADX INFO: renamed from: f */
    public final String f222634f;

    public /* synthetic */ tq0(int i, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        if ((i & 1) == 0) {
            this.f222629a = null;
        } else {
            this.f222629a = num;
        }
        if ((i & 2) == 0) {
            this.f222630b = null;
        } else {
            this.f222630b = num2;
        }
        if ((i & 4) == 0) {
            this.f222631c = null;
        } else {
            this.f222631c = num3;
        }
        if ((i & 8) == 0) {
            this.f222632d = null;
        } else {
            this.f222632d = num4;
        }
        if ((i & 16) == 0) {
            this.f222633e = null;
        } else {
            this.f222633e = str;
        }
        if ((i & 32) == 0) {
            this.f222634f = null;
        } else {
            this.f222634f = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Integer m81290a() {
        return this.f222630b;
    }

    /* JADX INFO: renamed from: b */
    public final String m81291b() {
        return this.f222633e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq0)) {
            return false;
        }
        tq0 tq0Var = (tq0) obj;
        return wj50.m88271j(this.f222629a, tq0Var.f222629a) && wj50.m88271j(this.f222630b, tq0Var.f222630b) && wj50.m88271j(this.f222631c, tq0Var.f222631c) && wj50.m88271j(this.f222632d, tq0Var.f222632d) && wj50.m88271j(this.f222633e, tq0Var.f222633e) && wj50.m88271j(this.f222634f, tq0Var.f222634f);
    }

    public final int hashCode() {
        Integer num = this.f222629a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f222630b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f222631c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f222632d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.f222633e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f222634f;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }
}
